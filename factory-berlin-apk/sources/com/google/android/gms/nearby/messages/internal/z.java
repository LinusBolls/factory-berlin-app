package com.google.android.gms.nearby.messages.internal;

import android.os.Parcelable;

public final class z implements Parcelable.Creator<y> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.x(r14)
            r1 = 0
            r2 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r12 = r10
            r4 = 0
            r8 = 0
            r11 = 0
        L_0x000f:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x005b
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.i(r1)
            switch(r2) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0051;
                case 3: goto L_0x004c;
                case 4: goto L_0x0042;
                case 5: goto L_0x003d;
                case 6: goto L_0x0038;
                case 7: goto L_0x0033;
                case 8: goto L_0x002e;
                case 9: goto L_0x0024;
                default: goto L_0x0020;
            }
        L_0x0020:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r14, r1)
            goto L_0x000f
        L_0x0024:
            android.os.Parcelable$Creator<com.google.android.gms.nearby.messages.internal.ClientAppContext> r2 = com.google.android.gms.nearby.messages.internal.ClientAppContext.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r14, r1, r2)
            r12 = r1
            com.google.android.gms.nearby.messages.internal.ClientAppContext r12 = (com.google.android.gms.nearby.messages.internal.ClientAppContext) r12
            goto L_0x000f
        L_0x002e:
            boolean r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.j(r14, r1)
            goto L_0x000f
        L_0x0033:
            java.lang.String r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r14, r1)
            goto L_0x000f
        L_0x0038:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r14, r1)
            goto L_0x000f
        L_0x003d:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r14, r1)
            goto L_0x000f
        L_0x0042:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r14, r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto L_0x000f
        L_0x004c:
            android.os.IBinder r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r14, r1)
            goto L_0x000f
        L_0x0051:
            android.os.IBinder r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r14, r1)
            goto L_0x000f
        L_0x0056:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r14, r1)
            goto L_0x000f
        L_0x005b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.h(r14, r0)
            com.google.android.gms.nearby.messages.internal.y r14 = new com.google.android.gms.nearby.messages.internal.y
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.z.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new y[i2];
    }
}
