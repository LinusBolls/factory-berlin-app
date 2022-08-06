package g.e.n.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;

/* compiled from: BookableParams.kt */
public final class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0699a();

    /* renamed from: g  reason: collision with root package name */
    private final Long f10008g;

    /* renamed from: h  reason: collision with root package name */
    private final Long f10009h;

    /* renamed from: i  reason: collision with root package name */
    private final Long f10010i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f10011j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10012k;

    /* renamed from: g.e.n.c.e.a$a  reason: collision with other inner class name */
    public static class C0699a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            Long valueOf3 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new a(valueOf, valueOf2, valueOf3, z2, z);
        }

        public final Object[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(Long l2, Long l3, Long l4, boolean z, boolean z2) {
        this.f10008g = l2;
        this.f10009h = l3;
        this.f10010i = l4;
        this.f10011j = z;
        this.f10012k = z2;
    }

    public final Long a() {
        return this.f10009h;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f10008g, aVar.f10008g) && k.a(this.f10009h, aVar.f10009h) && k.a(this.f10010i, aVar.f10010i) && this.f10011j == aVar.f10011j && this.f10012k == aVar.f10012k;
    }

    public int hashCode() {
        Long l2 = this.f10008g;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Long l3 = this.f10009h;
        int hashCode2 = (hashCode + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.f10010i;
        if (l4 != null) {
            i2 = l4.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f10011j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i4 = (i3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f10012k;
        if (!z3) {
            z2 = z3;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "BookableParams(durationMinimumInMillis=" + this.f10008g + ", durationMaximumInMillis=" + this.f10009h + ", maximumStartsAtOffsetInMillis=" + this.f10010i + ", bookingRequiresEndsAt=" + this.f10011j + ", bookingRequiresActuator=" + this.f10012k + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        Long l2 = this.f10008g;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l3 = this.f10009h;
        if (l3 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l4 = this.f10010i;
        if (l4 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f10011j ? 1 : 0);
        parcel.writeInt(this.f10012k ? 1 : 0);
    }
}
