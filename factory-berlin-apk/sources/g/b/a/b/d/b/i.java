package g.b.a.b.d.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.b;

public final class i extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<i> CREATOR = new k();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public long f9421g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f9422h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public long f9423i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public long f9424j;

    @Deprecated
    public static final class a {
        private final i a;

        public a() {
            this.a = new i();
        }

        public a(i iVar) {
            i iVar2 = new i();
            this.a = iVar2;
            long unused = iVar2.f9421g = iVar.f9421g;
            int unused2 = this.a.f9422h = iVar.f9422h;
            long unused3 = this.a.f9423i = iVar.f9423i;
            long unused4 = this.a.f9424j = iVar.f9424j;
        }

        public final i a() {
            return this.a;
        }

        public final a b(long j2) {
            long unused = this.a.f9421g = j2;
            return this;
        }

        public final a c(int i2) {
            int unused = this.a.f9422h = i2;
            return this;
        }
    }

    private i() {
    }

    i(long j2, int i2, long j3, long j4) {
        this.f9421g = j2;
        this.f9422h = i2;
        this.f9423i = j3;
        this.f9424j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return p.a(Long.valueOf(this.f9421g), Long.valueOf(iVar.f9421g)) && p.a(Integer.valueOf(this.f9422h), Integer.valueOf(iVar.f9422h)) && p.a(Long.valueOf(this.f9423i), Long.valueOf(iVar.f9423i)) && p.a(Long.valueOf(this.f9424j), Long.valueOf(iVar.f9424j));
        }
    }

    public final int hashCode() {
        return p.b(Long.valueOf(this.f9421g), Integer.valueOf(this.f9422h), Long.valueOf(this.f9423i), Long.valueOf(this.f9424j));
    }

    public final long l() {
        return this.f9424j;
    }

    public final long n() {
        return this.f9421g;
    }

    public final int o() {
        return this.f9422h;
    }

    public final long q() {
        return this.f9423i;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel);
        b.m(parcel, 1, n());
        b.l(parcel, 2, o());
        b.m(parcel, 3, q());
        b.m(parcel, 4, l());
        b.b(parcel, a2);
    }
}
