package n.a;

import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Timber */
public final class a {
    private static final c[] a = new c[0];
    private static final List<c> b = new ArrayList();
    static volatile c[] c = a;

    /* renamed from: d  reason: collision with root package name */
    private static final c f11180d = new C0787a();

    /* renamed from: n.a.a$a  reason: collision with other inner class name */
    /* compiled from: Timber */
    static class C0787a extends c {
        C0787a() {
        }

        public void a(String str, Object... objArr) {
            for (c a : a.c) {
                a.a(str, objArr);
            }
        }

        public void b(Throwable th, String str, Object... objArr) {
            for (c b : a.c) {
                b.b(th, str, objArr);
            }
        }

        public void c(String str, Object... objArr) {
            for (c c : a.c) {
                c.c(str, objArr);
            }
        }

        public void d(Throwable th) {
            for (c d2 : a.c) {
                d2.d(th);
            }
        }

        public void e(Throwable th, String str, Object... objArr) {
            for (c e2 : a.c) {
                e2.e(th, str, objArr);
            }
        }

        public void i(String str, Object... objArr) {
            for (c i2 : a.c) {
                i2.i(str, objArr);
            }
        }

        /* access modifiers changed from: protected */
        public void l(int i2, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }

        public void m(int i2, String str, Object... objArr) {
            for (c m2 : a.c) {
                m2.m(i2, str, objArr);
            }
        }

        public void o(String str, Object... objArr) {
            for (c o : a.c) {
                o.o(str, objArr);
            }
        }

        public void p(String str, Object... objArr) {
            for (c p : a.c) {
                p.p(str, objArr);
            }
        }

        public void q(Throwable th) {
            for (c q : a.c) {
                q.q(th);
            }
        }

        public void r(Throwable th, String str, Object... objArr) {
            for (c r : a.c) {
                r.r(th, str, objArr);
            }
        }
    }

    /* compiled from: Timber */
    public static class b extends c {
        private static final Pattern b = Pattern.compile("(\\$\\d+)+$");

        /* access modifiers changed from: package-private */
        public final String h() {
            String h2 = super.h();
            if (h2 != null) {
                return h2;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return s(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        /* access modifiers changed from: protected */
        public void l(int i2, String str, String str2, Throwable th) {
            int min;
            if (str2.length() >= 4000) {
                int i3 = 0;
                int length = str2.length();
                while (i3 < length) {
                    int indexOf = str2.indexOf(10, i3);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    while (true) {
                        min = Math.min(indexOf, i3 + 4000);
                        String substring = str2.substring(i3, min);
                        if (i2 == 7) {
                            Log.wtf(str, substring);
                        } else {
                            Log.println(i2, str, substring);
                        }
                        if (min >= indexOf) {
                            break;
                        }
                        i3 = min;
                    }
                    i3 = min + 1;
                }
            } else if (i2 == 7) {
                Log.wtf(str, str2);
            } else {
                Log.println(i2, str, str2);
            }
        }

        /* access modifiers changed from: protected */
        public String s(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String substring = className.substring(className.lastIndexOf(46) + 1);
            return (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
        }
    }

    /* compiled from: Timber */
    public static abstract class c {
        final ThreadLocal<String> a = new ThreadLocal<>();

        private String g(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void n(int i2, Throwable th, String str, Object... objArr) {
            String h2 = h();
            if (k(h2, i2)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = f(str, objArr);
                    }
                    if (th != null) {
                        str = str + "\n" + g(th);
                    }
                } else if (th != null) {
                    str = g(th);
                } else {
                    return;
                }
                l(i2, h2, str, th);
            }
        }

        public void a(String str, Object... objArr) {
            n(3, (Throwable) null, str, objArr);
        }

        public void b(Throwable th, String str, Object... objArr) {
            n(3, th, str, objArr);
        }

        public void c(String str, Object... objArr) {
            n(6, (Throwable) null, str, objArr);
        }

        public void d(Throwable th) {
            n(6, th, (String) null, new Object[0]);
        }

        public void e(Throwable th, String str, Object... objArr) {
            n(6, th, str, objArr);
        }

        /* access modifiers changed from: protected */
        public String f(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* access modifiers changed from: package-private */
        public String h() {
            String str = this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        public void i(String str, Object... objArr) {
            n(4, (Throwable) null, str, objArr);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public boolean j(int i2) {
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean k(String str, int i2) {
            return j(i2);
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i2, String str, String str2, Throwable th);

        public void m(int i2, String str, Object... objArr) {
            n(i2, (Throwable) null, str, objArr);
        }

        public void o(String str, Object... objArr) {
            n(2, (Throwable) null, str, objArr);
        }

        public void p(String str, Object... objArr) {
            n(5, (Throwable) null, str, objArr);
        }

        public void q(Throwable th) {
            n(5, th, (String) null, new Object[0]);
        }

        public void r(Throwable th, String str, Object... objArr) {
            n(5, th, str, objArr);
        }
    }

    public static void a(String str, Object... objArr) {
        f11180d.a(str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        f11180d.b(th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        f11180d.c(str, objArr);
    }

    public static void d(Throwable th) {
        f11180d.d(th);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        f11180d.e(th, str, objArr);
    }

    public static void f(String str, Object... objArr) {
        f11180d.i(str, objArr);
    }

    public static void g(int i2, String str, Object... objArr) {
        f11180d.m(i2, str, objArr);
    }

    public static void h(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("tree == null");
        } else if (cVar != f11180d) {
            synchronized (b) {
                b.add(cVar);
                c = (c[]) b.toArray(new c[b.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }

    public static int i() {
        int size;
        synchronized (b) {
            size = b.size();
        }
        return size;
    }

    public static void j(String str, Object... objArr) {
        f11180d.o(str, objArr);
    }

    public static void k(String str, Object... objArr) {
        f11180d.p(str, objArr);
    }

    public static void l(Throwable th) {
        f11180d.q(th);
    }

    public static void m(Throwable th, String str, Object... objArr) {
        f11180d.r(th, str, objArr);
    }
}
