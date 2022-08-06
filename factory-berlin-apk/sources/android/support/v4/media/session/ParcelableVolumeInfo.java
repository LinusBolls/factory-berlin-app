package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public int f37g;

    /* renamed from: h  reason: collision with root package name */
    public int f38h;

    /* renamed from: i  reason: collision with root package name */
    public int f39i;

    /* renamed from: j  reason: collision with root package name */
    public int f40j;

    /* renamed from: k  reason: collision with root package name */
    public int f41k;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f37g = parcel.readInt();
        this.f39i = parcel.readInt();
        this.f40j = parcel.readInt();
        this.f41k = parcel.readInt();
        this.f38h = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f37g);
        parcel.writeInt(this.f39i);
        parcel.writeInt(this.f40j);
        parcel.writeInt(this.f41k);
        parcel.writeInt(this.f38h);
    }
}
