package g.b.a.b.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.safeparcel.a;

public final class b extends a implements g {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: g  reason: collision with root package name */
    private final int f9431g;

    /* renamed from: h  reason: collision with root package name */
    private int f9432h;

    /* renamed from: i  reason: collision with root package name */
    private Intent f9433i;

    b(int i2, int i3, Intent intent) {
        this.f9431g = i2;
        this.f9432h = i3;
        this.f9433i = intent;
    }

    public final Status a() {
        if (this.f9432h == 0) {
            return Status.f2025k;
        }
        return Status.f2028n;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 1, this.f9431g);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 2, this.f9432h);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 3, this.f9433i, i2, false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }

    public b() {
        this(0, (Intent) null);
    }

    private b(int i2, Intent intent) {
        this(2, 0, (Intent) null);
    }
}
