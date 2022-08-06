package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class r7 {
    public static String a(Context context, String str) {
        try {
            return new v(context).a(str);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        r.k(strArr);
        r.k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < min; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i2];
            }
        }
        return null;
    }
}
