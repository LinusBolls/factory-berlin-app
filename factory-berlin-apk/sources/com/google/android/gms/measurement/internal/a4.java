package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.lb;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class a4 extends d6 {
    private static final AtomicReference<String[]> c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f2705d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<String[]> f2706e = new AtomicReference<>();

    a4(h5 h5Var) {
        super(h5Var);
    }

    private final boolean A() {
        return this.a.J() && this.a.i().B(3);
    }

    private static String w(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        r.k(strArr);
        r.k(strArr2);
        r.k(atomicReference);
        r.a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (fa.B0(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i2] == null) {
                        strArr3[i2] = strArr2[i2] + "(" + strArr[i2] + ")";
                    }
                    str2 = strArr3[i2];
                }
                return str2;
            }
        }
        return str;
    }

    private final String x(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = t(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String t(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!A()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(y(str2));
            sb.append("=");
            if (!lb.a() || !l().s(u.y0)) {
                sb.append(bundle.get(str2));
            } else {
                Object obj = bundle.get(str2);
                if (obj instanceof Bundle) {
                    str = x(new Object[]{obj});
                } else if (obj instanceof Object[]) {
                    str = x((Object[]) obj);
                } else if (obj instanceof ArrayList) {
                    str = x(((ArrayList) obj).toArray());
                } else {
                    str = String.valueOf(obj);
                }
                sb.append(str);
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String u(s sVar) {
        String str = null;
        if (sVar == null) {
            return null;
        }
        if (!A()) {
            return sVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(sVar.f3083i);
        sb.append(",name=");
        sb.append(v(sVar.f3081g));
        sb.append(",params=");
        n nVar = sVar.f3082h;
        if (nVar != null) {
            if (!A()) {
                str = nVar.toString();
            } else {
                str = t(nVar.o());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String v(String str) {
        if (str == null) {
            return null;
        }
        if (!A()) {
            return str;
        }
        return w(str, e6.c, e6.a, c);
    }

    /* access modifiers changed from: protected */
    public final String y(String str) {
        if (str == null) {
            return null;
        }
        if (!A()) {
            return str;
        }
        return w(str, i6.b, i6.a, f2705d);
    }

    /* access modifiers changed from: protected */
    public final String z(String str) {
        if (str == null) {
            return null;
        }
        if (!A()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return w(str, h6.b, h6.a, f2706e);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
