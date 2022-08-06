package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final int f6g;

    /* renamed from: h  reason: collision with root package name */
    private final MediaDescriptionCompat f7h;

    static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i2) {
            return new MediaBrowserCompat$MediaItem[i2];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f6g = parcel.readInt();
        this.f7h = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f6g + ", mDescription=" + this.f7h + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6g);
        this.f7h.writeToParcel(parcel, i2);
    }
}
