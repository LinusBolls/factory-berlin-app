package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class g2 {
    private static c2 a(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        String valueOf = String.valueOf(readLine);
                        Log.e("HermeticFileOverrides", valueOf.length() != 0 ? "Invalid: ".concat(valueOf) : new String("Invalid: "));
                    } else {
                        String str = split[0];
                        String decode = Uri.decode(split[1]);
                        String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new HashMap());
                        }
                        ((Map) hashMap.get(str)).put(decode, decode2);
                    }
                } else {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf2);
                    Log.i("HermeticFileOverrides", sb.toString());
                    c2 c2Var = new c2(hashMap);
                    bufferedReader.close();
                    return c2Var;
                }
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th) {
            c5.b(th, th);
        }
        throw th;
    }

    public static c3<c2> b(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            z = true;
        }
        if (!z) {
            return c3.d();
        }
        if (q1.a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        c3<File> c = c(context);
        if (c.b()) {
            return c3.a(a(c.c()));
        }
        return c3.d();
    }

    private static c3<File> c(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? c3.a(file) : c3.d();
        } catch (RuntimeException e2) {
            Log.e("HermeticFileOverrides", "no data dir", e2);
            return c3.d();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
