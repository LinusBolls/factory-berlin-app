package g.b.a.b.e.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: g  reason: collision with root package name */
    private final int f9436g;

    /* renamed from: h  reason: collision with root package name */
    private final b f9437h;

    /* renamed from: i  reason: collision with root package name */
    private final t f9438i;

    k(int i2, b bVar, t tVar) {
        this.f9436g = i2;
        this.f9437h = bVar;
        this.f9438i = tVar;
    }

    public final b l() {
        return this.f9437h;
    }

    public final t n() {
        return this.f9438i;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 1, this.f9436g);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 2, this.f9437h, i2, false);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 3, this.f9438i, i2, false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }

    public k(int i2) {
        this(new b(8, (PendingIntent) null), (t) null);
    }

    private k(b bVar, t tVar) {
        this(1, bVar, (t) null);
    }
}
