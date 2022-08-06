package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentManagerState */
final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<r> f839g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<String> f840h;

    /* renamed from: i  reason: collision with root package name */
    b[] f841i;

    /* renamed from: j  reason: collision with root package name */
    int f842j;

    /* renamed from: k  reason: collision with root package name */
    String f843k = null;

    /* compiled from: FragmentManagerState */
    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* renamed from: b */
        public o[] newArray(int i2) {
            return new o[i2];
        }
    }

    public o() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f839g);
        parcel.writeStringList(this.f840h);
        parcel.writeTypedArray(this.f841i, i2);
        parcel.writeInt(this.f842j);
        parcel.writeString(this.f843k);
    }

    public o(Parcel parcel) {
        this.f839g = parcel.createTypedArrayList(r.CREATOR);
        this.f840h = parcel.createStringArrayList();
        this.f841i = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f842j = parcel.readInt();
        this.f843k = parcel.readString();
    }
}
