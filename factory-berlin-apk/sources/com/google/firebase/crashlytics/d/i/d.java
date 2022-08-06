package com.google.firebase.crashlytics.d.i;

import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.i.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore */
class d implements a {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f4000d = Charset.forName("UTF-8");
    private final File a;
    private final int b;
    private c c;

    /* compiled from: QueueFileLogStore */
    class a implements c.d {
        final /* synthetic */ byte[] a;
        final /* synthetic */ int[] b;

        a(d dVar, byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        public void a(InputStream inputStream, int i2) {
            try {
                inputStream.read(this.a, this.b[0], i2);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i2;
            } finally {
                inputStream.close();
            }
        }
    }

    /* compiled from: QueueFileLogStore */
    private class b {
        public final byte[] a;
        public final int b;

        b(d dVar, byte[] bArr, int i2) {
            this.a = bArr;
            this.b = i2;
        }
    }

    d(File file, int i2) {
        this.a = file;
        this.b = i2;
    }

    private void f(long j2, String str) {
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i2 = this.b / 4;
                if (str.length() > i2) {
                    str = "..." + str.substring(str.length() - i2);
                }
                this.c.j(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f4000d));
                while (!this.c.y() && this.c.l0() > this.b) {
                    this.c.U();
                }
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e("There was a problem writing to the Crashlytics log.", e2);
            }
        }
    }

    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[cVar.l0()];
        try {
            this.c.o(new a(this, bArr, iArr));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().e("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new b(this, bArr, iArr[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                this.c = new c(this.a);
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
                f2.e("Could not open log file: " + this.a, e2);
            }
        }
    }

    public void a() {
        h.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    public String b() {
        byte[] c2 = c();
        if (c2 != null) {
            return new String(c2, f4000d);
        }
        return null;
    }

    public byte[] c() {
        b g2 = g();
        if (g2 == null) {
            return null;
        }
        int i2 = g2.b;
        byte[] bArr = new byte[i2];
        System.arraycopy(g2.a, 0, bArr, 0, i2);
        return bArr;
    }

    public void d() {
        a();
        this.a.delete();
    }

    public void e(long j2, String str) {
        h();
        f(j2, str);
    }
}
