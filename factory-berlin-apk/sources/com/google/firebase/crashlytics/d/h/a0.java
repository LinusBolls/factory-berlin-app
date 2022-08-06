package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.b;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: MetaDataStore */
class a0 {
    private final File a;

    static {
        Charset.forName("UTF-8");
    }

    public a0(File file) {
        this.a = file;
    }

    private static i0 c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        i0 i0Var = new i0();
        i0Var.d(e(jSONObject, "userId"));
        return i0Var;
    }

    private static String e(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    public File a(String str) {
        File file = this.a;
        return new File(file, str + "keys" + ".meta");
    }

    public File b(String str) {
        File file = this.a;
        return new File(file, str + "user" + ".meta");
    }

    public i0 d(String str) {
        File b = b(str);
        if (!b.exists()) {
            return new i0();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b);
            try {
                i0 c = c(h.H(fileInputStream2));
                h.e(fileInputStream2, "Failed to close user metadata file.");
                return c;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    b.f().e("Error deserializing user metadata.", e);
                    h.e(fileInputStream, "Failed to close user metadata file.");
                    return new i0();
                } catch (Throwable th) {
                    th = th;
                    h.e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                h.e(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            b.f().e("Error deserializing user metadata.", e);
            h.e(fileInputStream, "Failed to close user metadata file.");
            return new i0();
        }
    }
}
