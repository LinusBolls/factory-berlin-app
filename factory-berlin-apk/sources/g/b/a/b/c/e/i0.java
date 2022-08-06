package g.b.a.b.c.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.x;
import com.google.android.gms.location.y;

public final class i0 extends a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: g  reason: collision with root package name */
    private int f9340g;

    /* renamed from: h  reason: collision with root package name */
    private g0 f9341h;

    /* renamed from: i  reason: collision with root package name */
    private x f9342i;

    /* renamed from: j  reason: collision with root package name */
    private f f9343j;

    i0(int i2, g0 g0Var, IBinder iBinder, IBinder iBinder2) {
        this.f9340g = i2;
        this.f9341h = g0Var;
        f fVar = null;
        this.f9342i = iBinder == null ? null : y.l(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new g(iBinder2);
        }
        this.f9343j = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f9340g);
        b.o(parcel, 2, this.f9341h, i2, false);
        x xVar = this.f9342i;
        IBinder iBinder = null;
        b.k(parcel, 3, xVar == null ? null : xVar.asBinder(), false);
        f fVar = this.f9343j;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        b.k(parcel, 4, iBinder, false);
        b.b(parcel, a);
    }
}
