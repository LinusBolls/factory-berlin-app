package g.b.a.b.e.b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import g.b.a.b.c.b.b;
import g.b.a.b.c.b.c;

public abstract class f extends b implements e {
    public f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public boolean S0(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 3) {
            S((com.google.android.gms.common.b) c.a(parcel, com.google.android.gms.common.b.CREATOR), (b) c.a(parcel, b.CREATOR));
        } else if (i2 == 4) {
            L0((Status) c.a(parcel, Status.CREATOR));
        } else if (i2 == 6) {
            x((Status) c.a(parcel, Status.CREATOR));
        } else if (i2 == 7) {
            y((Status) c.a(parcel, Status.CREATOR), (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i2 != 8) {
            return false;
        } else {
            G((k) c.a(parcel, k.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
