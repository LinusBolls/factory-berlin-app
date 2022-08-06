package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentState */
final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    final String f852g;

    /* renamed from: h  reason: collision with root package name */
    final String f853h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f854i;

    /* renamed from: j  reason: collision with root package name */
    final int f855j;

    /* renamed from: k  reason: collision with root package name */
    final int f856k;

    /* renamed from: l  reason: collision with root package name */
    final String f857l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f858m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f859n;
    final boolean o;
    final Bundle p;
    final boolean q;
    final int r;
    Bundle s;

    /* compiled from: FragmentState */
    static class a implements Parcelable.Creator<r> {
        a() {
        }

        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        /* renamed from: b */
        public r[] newArray(int i2) {
            return new r[i2];
        }
    }

    r(Fragment fragment) {
        this.f852g = fragment.getClass().getName();
        this.f853h = fragment.f779k;
        this.f854i = fragment.s;
        this.f855j = fragment.B;
        this.f856k = fragment.C;
        this.f857l = fragment.D;
        this.f858m = fragment.G;
        this.f859n = fragment.r;
        this.o = fragment.F;
        this.p = fragment.f780l;
        this.q = fragment.E;
        this.r = fragment.V.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f852g);
        sb.append(" (");
        sb.append(this.f853h);
        sb.append(")}:");
        if (this.f854i) {
            sb.append(" fromLayout");
        }
        if (this.f856k != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f856k));
        }
        String str = this.f857l;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f857l);
        }
        if (this.f858m) {
            sb.append(" retainInstance");
        }
        if (this.f859n) {
            sb.append(" removing");
        }
        if (this.o) {
            sb.append(" detached");
        }
        if (this.q) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f852g);
        parcel.writeString(this.f853h);
        parcel.writeInt(this.f854i ? 1 : 0);
        parcel.writeInt(this.f855j);
        parcel.writeInt(this.f856k);
        parcel.writeString(this.f857l);
        parcel.writeInt(this.f858m ? 1 : 0);
        parcel.writeInt(this.f859n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeBundle(this.p);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeBundle(this.s);
        parcel.writeInt(this.r);
    }

    r(Parcel parcel) {
        this.f852g = parcel.readString();
        this.f853h = parcel.readString();
        boolean z = true;
        this.f854i = parcel.readInt() != 0;
        this.f855j = parcel.readInt();
        this.f856k = parcel.readInt();
        this.f857l = parcel.readString();
        this.f858m = parcel.readInt() != 0;
        this.f859n = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.p = parcel.readBundle();
        this.q = parcel.readInt() == 0 ? false : z;
        this.s = parcel.readBundle();
        this.r = parcel.readInt();
    }
}
