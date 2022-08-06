package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g.b.a.b.c.c.b;
import g.b.a.b.c.c.c;

public interface l extends IInterface {

    public static abstract class a extends b implements l {

        /* renamed from: com.google.android.gms.common.internal.l$a$a  reason: collision with other inner class name */
        public static class C0064a extends g.b.a.b.c.c.a implements l {
            C0064a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account h() {
                Parcel l2 = l(2, i());
                Account account = (Account) c.b(l2, Account.CREATOR);
                l2.recycle();
                return account;
            }
        }

        public static l l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof l) {
                return (l) queryLocalInterface;
            }
            return new C0064a(iBinder);
        }
    }

    Account h();
}
