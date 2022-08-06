package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class m {
    private static String a;
    private static int b;

    public static String a() {
        if (a == null) {
            if (b == 0) {
                b = Process.myPid();
            }
            a = b(b);
        }
        return a;
    }

    private static String b(int i2) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i2 <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i2);
            sb.append("/cmdline");
            bufferedReader = c(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
                k.a(bufferedReader);
            } catch (IOException unused) {
                k.a(bufferedReader);
                return str;
            } catch (Throwable th2) {
                th = th2;
                k.a(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            k.a(bufferedReader);
            return str;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            k.a(bufferedReader);
            throw th;
        }
        return str;
    }

    private static BufferedReader c(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
