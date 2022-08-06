package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final int f27g;

    /* renamed from: h  reason: collision with root package name */
    private final float f28h;

    static class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    RatingCompat(int i2, float f2) {
        this.f27g = i2;
        this.f28h = f2;
    }

    public int describeContents() {
        return this.f27g;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f27g);
        sb.append(" rating=");
        float f2 = this.f28h;
        if (f2 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f2);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f27g);
        parcel.writeFloat(this.f28h);
    }
}
