package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class l2 extends h2<Boolean> {
    l2(q2 q2Var, String str, Boolean bool, boolean z) {
        super(q2Var, str, bool, true, (m2) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (o1.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (o1.f2454d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String n2 = super.n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(n2);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
