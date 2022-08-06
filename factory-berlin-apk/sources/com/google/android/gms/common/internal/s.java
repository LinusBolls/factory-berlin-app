package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new d0();

    /* renamed from: g  reason: collision with root package name */
    private final int f2164g;

    /* renamed from: h  reason: collision with root package name */
    private final Account f2165h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2166i;

    /* renamed from: j  reason: collision with root package name */
    private final GoogleSignInAccount f2167j;

    s(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f2164g = i2;
        this.f2165h = account;
        this.f2166i = i3;
        this.f2167j = googleSignInAccount;
    }

    public Account l() {
        return this.f2165h;
    }

    public int n() {
        return this.f2166i;
    }

    public GoogleSignInAccount o() {
        return this.f2167j;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2164g);
        b.o(parcel, 2, l(), i2, false);
        b.l(parcel, 3, n());
        b.o(parcel, 4, o(), i2, false);
        b.b(parcel, a);
    }

    public s(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }
}
