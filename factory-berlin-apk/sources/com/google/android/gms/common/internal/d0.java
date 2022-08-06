package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class d0 implements Parcelable.Creator<s> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                account = (Account) SafeParcelReader.c(parcel, p, Account.CREATOR);
            } else if (i4 == 3) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 != 4) {
                SafeParcelReader.w(parcel, p);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.c(parcel, p, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new s(i2, account, i3, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new s[i2];
    }
}
