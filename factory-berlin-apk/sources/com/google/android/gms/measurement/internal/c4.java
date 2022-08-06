package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class c4 extends d6 {
    /* access modifiers changed from: private */
    public char c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f2757d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f2758e;

    /* renamed from: f  reason: collision with root package name */
    private final e4 f2759f = new e4(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final e4 f2760g = new e4(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final e4 f2761h = new e4(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    private final e4 f2762i = new e4(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    private final e4 f2763j = new e4(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    private final e4 f2764k = new e4(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    private final e4 f2765l = new e4(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    private final e4 f2766m = new e4(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    private final e4 f2767n = new e4(this, 2, false, false);

    c4(h5 h5Var) {
        super(h5Var);
    }

    private static String D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    private final String O() {
        String str;
        synchronized (this) {
            if (this.f2758e == null) {
                this.f2758e = this.a.M() != null ? this.a.M() : "FA";
            }
            str = this.f2758e;
        }
        return str;
    }

    protected static Object w(String str) {
        if (str == null) {
            return null;
        }
        return new d4(str);
    }

    private static String x(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String D = D(h5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && D(className).equals(D)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof d4) {
                return ((d4) obj).a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    static String y(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String x = x(z, obj);
        String x2 = x(z, obj2);
        String x3 = x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x)) {
            sb.append(str2);
            sb.append(x);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(str2);
            sb.append(x2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(str3);
            sb.append(x3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void A(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && B(i2)) {
            z(i2, y(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            r.k(str);
            a5 E = this.a.E();
            if (E == null) {
                z(6, "Scheduler not set. Not logging error/warn");
            } else if (!E.s()) {
                z(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                E.y(new b4(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i2) {
        return Log.isLoggable(O(), i2);
    }

    public final e4 E() {
        return this.f2759f;
    }

    public final e4 F() {
        return this.f2760g;
    }

    public final e4 G() {
        return this.f2761h;
    }

    public final e4 H() {
        return this.f2762i;
    }

    public final e4 I() {
        return this.f2763j;
    }

    public final e4 J() {
        return this.f2764k;
    }

    public final e4 K() {
        return this.f2765l;
    }

    public final e4 L() {
        return this.f2766m;
    }

    public final e4 M() {
        return this.f2767n;
    }

    public final String N() {
        Pair<String, Long> a = k().f3024d.a();
        if (a == null || a == p4.D) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void z(int i2, String str) {
        Log.println(i2, O(), str);
    }
}
