package de.baimos;

import de.baimos.blueid.sdk.api.log.BlueIDLog;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

abstract class bh implements dr {
    private static final boolean b = Boolean.getBoolean("de.baimos.blueid.sdk.debug.logInfo");
    private static bk c = null;
    String a = "BaseLogger";

    protected enum a {
        ERROR(4),
        WARN(3),
        INFO(2),
        DEBUG(1);
        

        /* renamed from: e  reason: collision with root package name */
        int f8213e;

        private a(int i2) {
            this.f8213e = i2;
        }
    }

    bh() {
    }

    static void a(bk bkVar) {
        c = bkVar;
    }

    private void b(a aVar, String str) {
        bk bkVar = c;
        if (bkVar != null) {
            bkVar.a(aVar, this.a, str);
        }
    }

    private String e(String str, Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        th.printStackTrace(new PrintStream(byteArrayOutputStream));
        return str + ", stacktrace:\n" + new String(byteArrayOutputStream.toByteArray());
    }

    public abstract void a(a aVar, String str);

    public abstract void a(a aVar, String str, Throwable th);

    public void a(String str) {
        if (a()) {
            b(a.ERROR, str);
            a(a.ERROR, str);
        }
    }

    public void a(String str, Throwable th) {
        if (a()) {
            b(a.ERROR, e(str, th));
            a(a.ERROR, str, th);
        }
    }

    public boolean a() {
        return BlueIDLog.isLevelAllowed(6);
    }

    public void b(String str) {
        if (b()) {
            b(a.WARN, str);
            a(a.WARN, str);
        }
    }

    public void b(String str, Throwable th) {
        if (b()) {
            b(a.WARN, e(str, th));
            a(a.WARN, str, th);
        }
    }

    public boolean b() {
        return BlueIDLog.isLevelAllowed(5);
    }

    public void c(String str) {
        if (c()) {
            b(a.INFO, str);
            a(a.INFO, str);
        }
    }

    public void c(String str, Throwable th) {
        if (c()) {
            b(a.INFO, e(str, th));
            a(a.INFO, str, th);
        }
    }

    public boolean c() {
        return BlueIDLog.isLevelAllowed(4);
    }

    public void d(String str) {
        if (b) {
            c(str);
        } else if (d()) {
            b(a.DEBUG, str);
            a(a.DEBUG, str);
        }
    }

    public void d(String str, Throwable th) {
        if (b) {
            c(str, th);
        } else if (d()) {
            b(a.DEBUG, e(str, th));
            a(a.DEBUG, str, th);
        }
    }

    public boolean d() {
        return BlueIDLog.isLevelAllowed(3);
    }
}
