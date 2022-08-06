package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new h0();

    /* renamed from: g  reason: collision with root package name */
    private final int f2146g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2147h;

    /* renamed from: i  reason: collision with root package name */
    private int f2148i;

    /* renamed from: j  reason: collision with root package name */
    String f2149j;

    /* renamed from: k  reason: collision with root package name */
    IBinder f2150k;

    /* renamed from: l  reason: collision with root package name */
    Scope[] f2151l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f2152m;

    /* renamed from: n  reason: collision with root package name */
    Account f2153n;
    d[] o;
    d[] p;
    private boolean q;

    public h(int i2) {
        this.f2146g = 4;
        this.f2148i = f.a;
        this.f2147h = i2;
        this.q = true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2146g);
        b.l(parcel, 2, this.f2147h);
        b.l(parcel, 3, this.f2148i);
        b.q(parcel, 4, this.f2149j, false);
        b.k(parcel, 5, this.f2150k, false);
        b.s(parcel, 6, this.f2151l, i2, false);
        b.e(parcel, 7, this.f2152m, false);
        b.o(parcel, 8, this.f2153n, i2, false);
        b.s(parcel, 10, this.o, i2, false);
        b.s(parcel, 11, this.p, i2, false);
        b.c(parcel, 12, this.q);
        b.b(parcel, a);
    }

    h(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z) {
        this.f2146g = i2;
        this.f2147h = i3;
        this.f2148i = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f2149j = "com.google.android.gms";
        } else {
            this.f2149j = str;
        }
        if (i2 < 2) {
            this.f2153n = iBinder != null ? a.o(l.a.l(iBinder)) : null;
        } else {
            this.f2150k = iBinder;
            this.f2153n = account;
        }
        this.f2151l = scopeArr;
        this.f2152m = bundle;
        this.o = dVarArr;
        this.p = dVarArr2;
        this.q = z;
    }
}
