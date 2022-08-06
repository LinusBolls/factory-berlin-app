package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.d;
import com.google.android.gms.nearby.messages.h;

public final class SubscribeRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new x();

    /* renamed from: g  reason: collision with root package name */
    private final int f3272g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f3273h;

    /* renamed from: i  reason: collision with root package name */
    private final h f3274i;

    /* renamed from: j  reason: collision with root package name */
    private final k0 f3275j;

    /* renamed from: k  reason: collision with root package name */
    private final d f3276k;

    /* renamed from: l  reason: collision with root package name */
    private final PendingIntent f3277l;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    private final int f3278m;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    private final String f3279n;
    @Deprecated
    private final String o;
    private final byte[] p;
    @Deprecated
    private final boolean q;
    private final b r;
    @Deprecated
    private final boolean s;
    @Deprecated
    private final ClientAppContext t;
    private final boolean u;
    private final int v;
    private final int w;

    /* JADX WARNING: type inference failed for: r1v14, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubscribeRequest(int r11, android.os.IBinder r12, com.google.android.gms.nearby.messages.h r13, android.os.IBinder r14, com.google.android.gms.nearby.messages.d r15, android.app.PendingIntent r16, int r17, java.lang.String r18, java.lang.String r19, byte[] r20, boolean r21, android.os.IBinder r22, boolean r23, com.google.android.gms.nearby.messages.internal.ClientAppContext r24, boolean r25, int r26, int r27) {
        /*
            r10 = this;
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r10.<init>()
            r7 = r11
            r0.f3272g = r7
            r7 = 0
            if (r1 != 0) goto L_0x0016
            r8 = r7
            goto L_0x0028
        L_0x0016:
            java.lang.String r8 = "com.google.android.gms.nearby.messages.internal.IMessageListener"
            android.os.IInterface r8 = r12.queryLocalInterface(r8)
            boolean r9 = r8 instanceof com.google.android.gms.nearby.messages.internal.h0
            if (r9 == 0) goto L_0x0023
            com.google.android.gms.nearby.messages.internal.h0 r8 = (com.google.android.gms.nearby.messages.internal.h0) r8
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.nearby.messages.internal.j0 r8 = new com.google.android.gms.nearby.messages.internal.j0
            r8.<init>(r12)
        L_0x0028:
            r0.f3273h = r8
            r1 = r13
            r0.f3274i = r1
            if (r2 != 0) goto L_0x0031
            r1 = r7
            goto L_0x0043
        L_0x0031:
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback"
            android.os.IInterface r1 = r14.queryLocalInterface(r1)
            boolean r8 = r1 instanceof com.google.android.gms.nearby.messages.internal.k0
            if (r8 == 0) goto L_0x003e
            com.google.android.gms.nearby.messages.internal.k0 r1 = (com.google.android.gms.nearby.messages.internal.k0) r1
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.nearby.messages.internal.m0 r1 = new com.google.android.gms.nearby.messages.internal.m0
            r1.<init>(r14)
        L_0x0043:
            r0.f3275j = r1
            r1 = r15
            r0.f3276k = r1
            r1 = r16
            r0.f3277l = r1
            r1 = r17
            r0.f3278m = r1
            r0.f3279n = r3
            r0.o = r4
            r1 = r20
            r0.p = r1
            r1 = r21
            r0.q = r1
            if (r5 != 0) goto L_0x005f
            goto L_0x0075
        L_0x005f:
            if (r5 != 0) goto L_0x0062
            goto L_0x0075
        L_0x0062:
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.ISubscribeCallback"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.nearby.messages.internal.b
            if (r2 == 0) goto L_0x0070
            r7 = r1
            com.google.android.gms.nearby.messages.internal.b r7 = (com.google.android.gms.nearby.messages.internal.b) r7
            goto L_0x0075
        L_0x0070:
            com.google.android.gms.nearby.messages.internal.d r7 = new com.google.android.gms.nearby.messages.internal.d
            r7.<init>(r5)
        L_0x0075:
            r0.r = r7
            r0.s = r6
            r1 = r24
            com.google.android.gms.nearby.messages.internal.ClientAppContext r1 = com.google.android.gms.nearby.messages.internal.ClientAppContext.l(r1, r4, r3, r6)
            r0.t = r1
            r1 = r25
            r0.u = r1
            r1 = r26
            r0.v = r1
            r1 = r27
            r0.w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.SubscribeRequest.<init>(int, android.os.IBinder, com.google.android.gms.nearby.messages.h, android.os.IBinder, com.google.android.gms.nearby.messages.d, android.app.PendingIntent, int, java.lang.String, java.lang.String, byte[], boolean, android.os.IBinder, boolean, com.google.android.gms.nearby.messages.internal.ClientAppContext, boolean, int, int):void");
    }

    public SubscribeRequest(IBinder iBinder, h hVar, IBinder iBinder2, d dVar, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i2, int i3) {
        this(3, iBinder, hVar, iBinder2, dVar, pendingIntent, 0, (String) null, (String) null, bArr, false, iBinder3, false, (ClientAppContext) null, z, i2, i3);
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f3273h);
        String valueOf2 = String.valueOf(this.f3274i);
        String valueOf3 = String.valueOf(this.f3275j);
        String valueOf4 = String.valueOf(this.f3276k);
        String valueOf5 = String.valueOf(this.f3277l);
        byte[] bArr = this.p;
        if (bArr == null) {
            str = null;
        } else {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(19);
            sb.append("<");
            sb.append(length);
            sb.append(" bytes>");
            str = sb.toString();
        }
        String valueOf6 = String.valueOf(this.r);
        boolean z = this.s;
        String valueOf7 = String.valueOf(this.t);
        boolean z2 = this.u;
        String str2 = this.f3279n;
        String str3 = this.o;
        boolean z3 = this.q;
        int i2 = this.w;
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 291 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(str).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("SubscribeRequest{messageListener=");
        sb2.append(valueOf);
        sb2.append(", strategy=");
        sb2.append(valueOf2);
        sb2.append(", callback=");
        sb2.append(valueOf3);
        sb2.append(", filter=");
        sb2.append(valueOf4);
        sb2.append(", pendingIntent=");
        sb2.append(valueOf5);
        sb2.append(", hint=");
        sb2.append(str);
        sb2.append(", subscribeCallback=");
        sb2.append(valueOf6);
        sb2.append(", useRealClientApiKey=");
        sb2.append(z);
        sb2.append(", clientAppContext=");
        sb2.append(valueOf7);
        sb2.append(", isDiscardPendingIntent=");
        sb2.append(z2);
        sb2.append(", zeroPartyPackageName=");
        sb2.append(str2);
        sb2.append(", realClientPackageName=");
        sb2.append(str3);
        sb2.append(", isIgnoreNearbyPermission=");
        sb2.append(z3);
        sb2.append(", callingContext=");
        sb2.append(i2);
        sb2.append("}");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f3272g);
        h0 h0Var = this.f3273h;
        IBinder iBinder = null;
        b.k(parcel, 2, h0Var == null ? null : h0Var.asBinder(), false);
        b.o(parcel, 3, this.f3274i, i2, false);
        k0 k0Var = this.f3275j;
        b.k(parcel, 4, k0Var == null ? null : k0Var.asBinder(), false);
        b.o(parcel, 5, this.f3276k, i2, false);
        b.o(parcel, 6, this.f3277l, i2, false);
        b.l(parcel, 7, this.f3278m);
        b.q(parcel, 8, this.f3279n, false);
        b.q(parcel, 9, this.o, false);
        b.f(parcel, 10, this.p, false);
        b.c(parcel, 11, this.q);
        b bVar = this.r;
        if (bVar != null) {
            iBinder = bVar.asBinder();
        }
        b.k(parcel, 12, iBinder, false);
        b.c(parcel, 13, this.s);
        b.o(parcel, 14, this.t, i2, false);
        b.c(parcel, 15, this.u);
        b.l(parcel, 16, this.v);
        b.l(parcel, 17, this.w);
        b.b(parcel, a);
    }
}
