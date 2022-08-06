package androidx.work;

import android.util.Log;

/* compiled from: Logger */
public abstract class i {
    private static i a = null;
    private static final int b = 20;

    /* compiled from: Logger */
    public static class a extends i {
        private int c;

        public a(int i2) {
            super(i2);
            this.c = i2;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        public void g(String str, String str2, Throwable... thArr) {
            if (this.c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        public void h(String str, String str2, Throwable... thArr) {
            if (this.c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public i(int i2) {
    }

    public static synchronized i c() {
        i iVar;
        synchronized (i.class) {
            if (a == null) {
                a = new a(3);
            }
            iVar = a;
        }
        return iVar;
    }

    public static synchronized void e(i iVar) {
        synchronized (i.class) {
            a = iVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i2 = b;
        if (length >= i2) {
            sb.append(str.substring(0, i2));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
