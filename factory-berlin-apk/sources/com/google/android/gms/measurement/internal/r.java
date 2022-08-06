package com.google.android.gms.measurement.internal;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class r implements Parcelable.Creator<s> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.x(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r2
        L_0x000b:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0042
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.i(r1)
            r3 = 2
            if (r2 == r3) goto L_0x003d
            r3 = 3
            if (r2 == r3) goto L_0x0033
            r3 = 4
            if (r2 == r3) goto L_0x002e
            r3 = 5
            if (r2 == r3) goto L_0x0029
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r11, r1)
            goto L_0x000b
        L_0x0029:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.s(r11, r1)
            goto L_0x000b
        L_0x002e:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r11, r1)
            goto L_0x000b
        L_0x0033:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.n> r2 = com.google.android.gms.measurement.internal.n.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r11, r1, r2)
            r6 = r1
            com.google.android.gms.measurement.internal.n r6 = (com.google.android.gms.measurement.internal.n) r6
            goto L_0x000b
        L_0x003d:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r11, r1)
            goto L_0x000b
        L_0x0042:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.h(r11, r0)
            com.google.android.gms.measurement.internal.s r11 = new com.google.android.gms.measurement.internal.s
            r4 = r11
            r4.<init>(r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new s[i2];
    }
}
