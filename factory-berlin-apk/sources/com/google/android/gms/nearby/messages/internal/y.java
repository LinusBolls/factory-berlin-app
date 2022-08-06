package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: g  reason: collision with root package name */
    private final int f3307g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f3308h;

    /* renamed from: i  reason: collision with root package name */
    private final k0 f3309i;

    /* renamed from: j  reason: collision with root package name */
    private final PendingIntent f3310j;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    private final int f3311k;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    private final String f3312l;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    private final String f3313m;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    private final boolean f3314n;
    @Deprecated
    private final ClientAppContext o;

    public y(int i2, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i3, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        h0 h0Var;
        this.f3307g = i2;
        k0 k0Var = null;
        if (iBinder == null) {
            h0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            h0Var = queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new j0(iBinder);
        }
        this.f3308h = h0Var;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            k0Var = queryLocalInterface2 instanceof k0 ? (k0) queryLocalInterface2 : new m0(iBinder2);
        }
        this.f3309i = k0Var;
        this.f3310j = pendingIntent;
        this.f3311k = i3;
        this.f3312l = str;
        this.f3313m = str2;
        this.f3314n = z;
        this.o = ClientAppContext.l(clientAppContext, str2, str, z);
    }

    public y(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, (String) null, (String) null, false, (ClientAppContext) null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f3307g);
        h0 h0Var = this.f3308h;
        b.k(parcel, 2, h0Var == null ? null : h0Var.asBinder(), false);
        b.k(parcel, 3, this.f3309i.asBinder(), false);
        b.o(parcel, 4, this.f3310j, i2, false);
        b.l(parcel, 5, this.f3311k);
        b.q(parcel, 6, this.f3312l, false);
        b.q(parcel, 7, this.f3313m, false);
        b.c(parcel, 8, this.f3314n);
        b.o(parcel, 9, this.o, i2, false);
        b.b(parcel, a);
    }
}
