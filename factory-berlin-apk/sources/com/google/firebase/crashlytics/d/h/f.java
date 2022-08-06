package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.j.v;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: BytesBackedNativeSessionFile */
class f implements b0 {
    private final byte[] a;
    private final String b;
    private final String c;

    f(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] d() {
        /*
            r4 = this;
            boolean r0 = r4.e()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x002f }
            r0.<init>()     // Catch:{ IOException -> 0x002f }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x002a }
            r2.<init>(r0)     // Catch:{ all -> 0x002a }
            byte[] r3 = r4.a     // Catch:{ all -> 0x0025 }
            r2.write(r3)     // Catch:{ all -> 0x0025 }
            r2.finish()     // Catch:{ all -> 0x0025 }
            byte[] r3 = r0.toByteArray()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x002a }
            r0.close()     // Catch:{ IOException -> 0x002f }
            return r3
        L_0x0025:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r3     // Catch:{ all -> 0x002a }
        L_0x002a:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r2     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.h.f.d():byte[]");
    }

    private boolean e() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
    }

    public InputStream a() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }

    public String b() {
        return this.c;
    }

    public v.c.b c() {
        byte[] d2 = d();
        if (d2 == null) {
            return null;
        }
        v.c.b.a a2 = v.c.b.a();
        a2.b(d2);
        a2.c(this.b);
        return a2.a();
    }
}
