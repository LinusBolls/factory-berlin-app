package com.microsoft.appcenter.utils.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.microsoft.appcenter.utils.a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* compiled from: FileManager */
public class b {
    @SuppressLint({"StaticFieldLeak"})
    private static Context a;

    public static synchronized void a(Context context) {
        synchronized (b.class) {
            if (a == null) {
                a = context;
            }
        }
    }

    public static String b(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String property = System.getProperty("line.separator");
            StringBuilder sb = new StringBuilder();
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                while (true) {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 != null) {
                        sb.append(property);
                        sb.append(readLine2);
                    }
                }
                bufferedReader.close();
                return sb.toString();
            }
            bufferedReader.close();
            return sb.toString();
        } catch (IOException e2) {
            a.c("AppCenter", "Could not read file " + file.getAbsolutePath(), e2);
            return null;
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    public static void c(File file, String str) {
        if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) > 0) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter.write(str);
            } finally {
                bufferedWriter.close();
            }
        }
    }
}
