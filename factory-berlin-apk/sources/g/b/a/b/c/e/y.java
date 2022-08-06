package g.b.a.b.c.e;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.a0;
import com.google.android.gms.location.b0;
import com.google.android.gms.location.d0;
import com.google.android.gms.location.e0;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: g  reason: collision with root package name */
    private int f9355g;

    /* renamed from: h  reason: collision with root package name */
    private w f9356h;

    /* renamed from: i  reason: collision with root package name */
    private d0 f9357i;

    /* renamed from: j  reason: collision with root package name */
    private PendingIntent f9358j;

    /* renamed from: k  reason: collision with root package name */
    private a0 f9359k;

    /* renamed from: l  reason: collision with root package name */
    private f f9360l;

    y(int i2, w wVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f9355g = i2;
        this.f9356h = wVar;
        f fVar = null;
        this.f9357i = iBinder == null ? null : e0.l(iBinder);
        this.f9358j = pendingIntent;
        this.f9359k = iBinder2 == null ? null : b0.l(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new g(iBinder3);
        }
        this.f9360l = fVar;
    }

    public static y l(a0 a0Var, f fVar) {
        return new y(2, (w) null, (IBinder) null, (PendingIntent) null, a0Var.asBinder(), fVar != null ? fVar.asBinder() : null);
    }

    public static y n(d0 d0Var, f fVar) {
        return new y(2, (w) null, d0Var.asBinder(), (PendingIntent) null, (IBinder) null, fVar != null ? fVar.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f9355g);
        b.o(parcel, 2, this.f9356h, i2, false);
        d0 d0Var = this.f9357i;
        IBinder iBinder = null;
        b.k(parcel, 3, d0Var == null ? null : d0Var.asBinder(), false);
        b.o(parcel, 4, this.f9358j, i2, false);
        a0 a0Var = this.f9359k;
        b.k(parcel, 5, a0Var == null ? null : a0Var.asBinder(), false);
        f fVar = this.f9360l;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        b.k(parcel, 6, iBinder, false);
        b.b(parcel, a);
    }
}
