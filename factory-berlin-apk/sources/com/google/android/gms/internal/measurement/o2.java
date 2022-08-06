package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class o2 extends h2<Double> {
    o2(q2 q2Var, String str, Double d2, boolean z) {
        super(q2Var, str, d2, true, (m2) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Double e(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String n2 = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(n2);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
