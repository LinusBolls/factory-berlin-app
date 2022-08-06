package g.b.a.b.c.e;

import android.os.Parcelable;

public final class z implements Parcelable.Creator<y> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.x(r11)
            r1 = 0
            r2 = 1
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r4 = 1
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0049
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.i(r1)
            switch(r2) {
                case 1: goto L_0x0044;
                case 2: goto L_0x003a;
                case 3: goto L_0x0035;
                case 4: goto L_0x002b;
                case 5: goto L_0x0026;
                case 6: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r11, r1)
            goto L_0x000c
        L_0x0021:
            android.os.IBinder r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r11, r1)
            goto L_0x000c
        L_0x0026:
            android.os.IBinder r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r11, r1)
            goto L_0x000c
        L_0x002b:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r11, r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto L_0x000c
        L_0x0035:
            android.os.IBinder r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r11, r1)
            goto L_0x000c
        L_0x003a:
            android.os.Parcelable$Creator<g.b.a.b.c.e.w> r2 = g.b.a.b.c.e.w.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r11, r1, r2)
            r5 = r1
            g.b.a.b.c.e.w r5 = (g.b.a.b.c.e.w) r5
            goto L_0x000c
        L_0x0044:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r11, r1)
            goto L_0x000c
        L_0x0049:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.h(r11, r0)
            g.b.a.b.c.e.y r11 = new g.b.a.b.c.e.y
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.b.c.e.z.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new y[i2];
    }
}
