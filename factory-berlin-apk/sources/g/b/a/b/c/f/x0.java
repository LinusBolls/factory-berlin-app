package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;

public final class x0 extends a {
    public static final Parcelable.Creator<x0> CREATOR = new y0();

    /* renamed from: g  reason: collision with root package name */
    private long f9414g;

    /* renamed from: h  reason: collision with root package name */
    private int f9415h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f9416i;

    /* renamed from: j  reason: collision with root package name */
    private ParcelFileDescriptor f9417j;

    /* renamed from: k  reason: collision with root package name */
    private String f9418k;

    /* renamed from: l  reason: collision with root package name */
    private long f9419l = -1;

    /* renamed from: m  reason: collision with root package name */
    private ParcelFileDescriptor f9420m;

    private x0() {
    }

    x0(long j2, int i2, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j3, ParcelFileDescriptor parcelFileDescriptor2) {
        this.f9414g = j2;
        this.f9415h = i2;
        this.f9416i = bArr;
        this.f9417j = parcelFileDescriptor;
        this.f9418k = str;
        this.f9419l = j3;
        this.f9420m = parcelFileDescriptor2;
    }

    public final String K() {
        return this.f9418k;
    }

    public final long L() {
        return this.f9419l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            return p.a(Long.valueOf(this.f9414g), Long.valueOf(x0Var.f9414g)) && p.a(Integer.valueOf(this.f9415h), Integer.valueOf(x0Var.f9415h)) && Arrays.equals(this.f9416i, x0Var.f9416i) && p.a(this.f9417j, x0Var.f9417j) && p.a(this.f9418k, x0Var.f9418k) && p.a(Long.valueOf(this.f9419l), Long.valueOf(x0Var.f9419l)) && p.a(this.f9420m, x0Var.f9420m);
        }
    }

    public final int hashCode() {
        return p.b(Long.valueOf(this.f9414g), Integer.valueOf(this.f9415h), Integer.valueOf(Arrays.hashCode(this.f9416i)), this.f9417j, this.f9418k, Long.valueOf(this.f9419l), this.f9420m);
    }

    public final byte[] l() {
        return this.f9416i;
    }

    public final long n() {
        return this.f9414g;
    }

    public final int o() {
        return this.f9415h;
    }

    public final ParcelFileDescriptor q() {
        return this.f9417j;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.m(parcel, 1, this.f9414g);
        b.l(parcel, 2, this.f9415h);
        b.f(parcel, 3, this.f9416i, false);
        b.o(parcel, 4, this.f9417j, i2, false);
        b.q(parcel, 5, this.f9418k, false);
        b.m(parcel, 6, this.f9419l);
        b.o(parcel, 7, this.f9420m, i2, false);
        b.b(parcel, a);
    }
}
