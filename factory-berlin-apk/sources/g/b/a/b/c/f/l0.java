package g.b.a.b.c.f;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class l0 extends a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* renamed from: g  reason: collision with root package name */
    private String f9393g;

    /* renamed from: h  reason: collision with root package name */
    private String f9394h;

    /* renamed from: i  reason: collision with root package name */
    private String f9395i;

    /* renamed from: j  reason: collision with root package name */
    private BluetoothDevice f9396j;

    private l0() {
    }

    l0(String str, String str2, String str3, BluetoothDevice bluetoothDevice) {
        this.f9393g = str;
        this.f9394h = str2;
        this.f9395i = str3;
        this.f9396j = bluetoothDevice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return p.a(this.f9393g, l0Var.f9393g) && p.a(this.f9394h, l0Var.f9394h) && p.a(this.f9395i, l0Var.f9395i) && p.a(this.f9396j, l0Var.f9396j);
        }
    }

    public final int hashCode() {
        return p.b(this.f9393g, this.f9394h, this.f9395i, this.f9396j);
    }

    public final String l() {
        return this.f9395i;
    }

    public final String n() {
        return this.f9394h;
    }

    public final String o() {
        return this.f9393g;
    }

    public final BluetoothDevice q() {
        return this.f9396j;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9393g, false);
        b.q(parcel, 2, this.f9394h, false);
        b.q(parcel, 3, this.f9395i, false);
        b.o(parcel, 4, this.f9396j, i2, false);
        b.b(parcel, a);
    }
}
