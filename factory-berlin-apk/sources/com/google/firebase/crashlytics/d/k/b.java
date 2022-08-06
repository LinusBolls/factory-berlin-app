package com.google.firebase.crashlytics.d.k;

import android.content.Context;
import com.google.firebase.crashlytics.d.h.h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* compiled from: NativeFileUtils */
public final class b {
    public static byte[] a(File file, Context context) {
        if (file == null || !file.exists()) {
            return new byte[0];
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new a(context, new e()).a(bufferedReader2);
                h.f(bufferedReader2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                h.f(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            h.f(bufferedReader);
            throw th;
        }
    }
}
