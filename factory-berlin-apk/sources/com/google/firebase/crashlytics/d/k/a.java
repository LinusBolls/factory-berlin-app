package com.google.firebase.crashlytics.d.k;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.crashlytics.d.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BinaryImagesConverter */
class a {
    private final Context a;
    private final C0108a b;

    /* renamed from: com.google.firebase.crashlytics.d.k.a$a  reason: collision with other inner class name */
    /* compiled from: BinaryImagesConverter */
    interface C0108a {
        String a(File file);
    }

    a(Context context, C0108a aVar) {
        this.a = context;
        this.b = aVar;
    }

    private File b(File file) {
        if (Build.VERSION.SDK_INT < 9 || !file.getAbsolutePath().startsWith("/data")) {
            return file;
        }
        try {
            return new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (PackageManager.NameNotFoundException e2) {
            b.f().e("Error getting ApplicationInfo", e2);
            return file;
        }
    }

    private static JSONObject c(String str, c cVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", cVar.a);
        jSONObject.put("size", cVar.b);
        jSONObject.put("name", cVar.f4075d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static byte[] d(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        } catch (JSONException e2) {
            b.f().j("Binary images string is null", e2);
            return new byte[0];
        }
    }

    private File e(String str) {
        File file = new File(str);
        return !file.exists() ? b(file) : file;
    }

    private static boolean f(c cVar) {
        return (cVar.c.indexOf(120) == -1 || cVar.f4075d.indexOf(47) == -1) ? false : true;
    }

    private JSONObject g(String str) {
        c a2 = d.a(str);
        if (a2 != null && f(a2)) {
            try {
                try {
                    return c(this.b.a(e(a2.f4075d)), a2);
                } catch (JSONException e2) {
                    b.f().c("Could not create a binary image json string", e2);
                    return null;
                }
            } catch (IOException e3) {
                b f2 = b.f();
                f2.c("Could not generate ID for file " + a2.f4075d, e3);
            }
        }
        return null;
    }

    private JSONArray h(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject g2 = g(readLine);
            if (g2 != null) {
                jSONArray.put(g2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] a(BufferedReader bufferedReader) {
        return d(h(bufferedReader));
    }
}
