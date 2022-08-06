package com.google.firebase.crashlytics.d.k;

import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.k.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: Sha1FileIdStrategy */
class e implements a.C0108a {
    e() {
    }

    private static String b(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String F = h.F(bufferedInputStream2);
                h.f(bufferedInputStream2);
                return F;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                h.f(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            h.f(bufferedInputStream);
            throw th;
        }
    }

    public String a(File file) {
        return b(file.getPath());
    }
}
