package g.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: g  reason: collision with root package name */
    private final int f9434g;

    /* renamed from: h  reason: collision with root package name */
    private final s f9435h;

    i(int i2, s sVar) {
        this.f9434g = i2;
        this.f9435h = sVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f9434g);
        b.o(parcel, 2, this.f9435h, i2, false);
        b.b(parcel, a);
    }

    public i(s sVar) {
        this(1, sVar);
    }
}
