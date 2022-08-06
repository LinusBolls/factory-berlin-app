package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class h extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<h> CREATOR = new o();
    public static final h o = new a().a();
    public static final h p;

    /* renamed from: g  reason: collision with root package name */
    private final int f3257g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    private final int f3258h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3259i;

    /* renamed from: j  reason: collision with root package name */
    private final int f3260j;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    private final boolean f3261k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3262l;

    /* renamed from: m  reason: collision with root package name */
    private final int f3263m;

    /* renamed from: n  reason: collision with root package name */
    private final int f3264n;

    public static class a {
        private int a = 3;
        private int b = 300;
        private int c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f3265d = -1;

        public h a() {
            if (this.f3265d != 2 || this.c != 1) {
                return new h(2, 0, this.b, this.c, false, this.f3265d, this.a, 0);
            }
            throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
        }

        public a b(int i2) {
            r.c(i2 == Integer.MAX_VALUE || (i2 > 0 && i2 <= 86400), "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i2), 86400);
            this.b = i2;
            return this;
        }

        public final a c(int i2) {
            this.f3265d = 2;
            return this;
        }
    }

    static {
        a aVar = new a();
        aVar.c(2);
        aVar.b(Integer.MAX_VALUE);
        p = aVar.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    h(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.f3257g = r2
            r1.f3258h = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto L_0x000e
        L_0x000b:
            r1.f3263m = r8
            goto L_0x0019
        L_0x000e:
            if (r3 == r0) goto L_0x0017
            r8 = 3
            if (r3 == r8) goto L_0x0014
            goto L_0x000b
        L_0x0014:
            r1.f3263m = r0
            goto L_0x0019
        L_0x0017:
            r1.f3263m = r2
        L_0x0019:
            r1.f3260j = r5
            r1.f3261k = r6
            if (r6 == 0) goto L_0x0027
            r1.f3262l = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f3259i = r2
            goto L_0x0038
        L_0x0027:
            r1.f3259i = r4
            r3 = -1
            if (r7 == r3) goto L_0x0036
            if (r7 == 0) goto L_0x0036
            if (r7 == r2) goto L_0x0036
            r2 = 6
            if (r7 == r2) goto L_0x0036
            r1.f3262l = r7
            goto L_0x0038
        L_0x0036:
            r1.f3262l = r3
        L_0x0038:
            r1.f3264n = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.h.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3257g == hVar.f3257g && this.f3263m == hVar.f3263m && this.f3259i == hVar.f3259i && this.f3260j == hVar.f3260j && this.f3262l == hVar.f3262l && this.f3264n == hVar.f3264n;
    }

    public int hashCode() {
        return (((((((((this.f3257g * 31) + this.f3263m) * 31) + this.f3259i) * 31) + this.f3260j) * 31) + this.f3262l) * 31) + this.f3264n;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        int i2 = this.f3259i;
        int i3 = this.f3260j;
        String str4 = "DEFAULT";
        if (i3 == 0) {
            str = str4;
        } else if (i3 != 1) {
            StringBuilder sb = new StringBuilder(19);
            sb.append("UNKNOWN:");
            sb.append(i3);
            str = sb.toString();
        } else {
            str = "EARSHOT";
        }
        int i4 = this.f3262l;
        if (i4 == -1) {
            str2 = str4;
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i4 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i4 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append("UNKNOWN:");
                sb2.append(i4);
                str2 = sb2.toString();
            } else {
                str2 = arrayList.toString();
            }
        }
        int i5 = this.f3263m;
        if (i5 == 3) {
            str3 = str4;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i5 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i5 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder(19);
                sb3.append("UNKNOWN:");
                sb3.append(i5);
                str3 = sb3.toString();
            } else {
                str3 = arrayList2.toString();
            }
        }
        int i6 = this.f3264n;
        if (i6 != 0) {
            if (i6 != 1) {
                StringBuilder sb4 = new StringBuilder(20);
                sb4.append("UNKNOWN: ");
                sb4.append(i6);
                str4 = sb4.toString();
            } else {
                str4 = "ALWAYS_ON";
            }
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 102 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb5.append("Strategy{ttlSeconds=");
        sb5.append(i2);
        sb5.append(", distanceType=");
        sb5.append(str);
        sb5.append(", discoveryMedium=");
        sb5.append(str2);
        sb5.append(", discoveryMode=");
        sb5.append(str3);
        sb5.append(", backgroundScanMode=");
        sb5.append(str4);
        sb5.append('}');
        return sb5.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel);
        b.l(parcel, 1, this.f3258h);
        b.l(parcel, 2, this.f3259i);
        b.l(parcel, 3, this.f3260j);
        b.c(parcel, 4, this.f3261k);
        b.l(parcel, 5, this.f3262l);
        b.l(parcel, 6, this.f3263m);
        b.l(parcel, 7, this.f3264n);
        b.l(parcel, 1000, this.f3257g);
        b.b(parcel, a2);
    }
}
