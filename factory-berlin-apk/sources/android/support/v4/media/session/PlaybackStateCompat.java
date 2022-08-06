package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    final int f42g;

    /* renamed from: h  reason: collision with root package name */
    final long f43h;

    /* renamed from: i  reason: collision with root package name */
    final long f44i;

    /* renamed from: j  reason: collision with root package name */
    final float f45j;

    /* renamed from: k  reason: collision with root package name */
    final long f46k;

    /* renamed from: l  reason: collision with root package name */
    final int f47l;

    /* renamed from: m  reason: collision with root package name */
    final CharSequence f48m;

    /* renamed from: n  reason: collision with root package name */
    final long f49n;
    List<CustomAction> o;
    final long p;
    final Bundle q;
    private Object r;

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f42g = i2;
        this.f43h = j2;
        this.f44i = j3;
        this.f45j = f2;
        this.f46k = j4;
        this.f47l = i3;
        this.f48m = charSequence;
        this.f49n = j5;
        this.o = new ArrayList(list);
        this.p = j6;
        this.q = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d2 = g.d(obj);
        if (d2 != null) {
            ArrayList arrayList2 = new ArrayList(d2.size());
            for (Object a2 : d2) {
                arrayList2.add(CustomAction.a(a2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = h.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(g.i(obj), g.h(obj), g.c(obj), g.g(obj), g.a(obj), 0, g.e(obj), g.f(obj), arrayList, g.b(obj), bundle);
        playbackStateCompat.r = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f42g + ", position=" + this.f43h + ", buffered position=" + this.f44i + ", speed=" + this.f45j + ", updated=" + this.f49n + ", actions=" + this.f46k + ", error code=" + this.f47l + ", error message=" + this.f48m + ", custom actions=" + this.o + ", active item id=" + this.p + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f42g);
        parcel.writeLong(this.f43h);
        parcel.writeFloat(this.f45j);
        parcel.writeLong(this.f49n);
        parcel.writeLong(this.f44i);
        parcel.writeLong(this.f46k);
        TextUtils.writeToParcel(this.f48m, parcel, i2);
        parcel.writeTypedList(this.o);
        parcel.writeLong(this.p);
        parcel.writeBundle(this.q);
        parcel.writeInt(this.f47l);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        private final String f50g;

        /* renamed from: h  reason: collision with root package name */
        private final CharSequence f51h;

        /* renamed from: i  reason: collision with root package name */
        private final int f52i;

        /* renamed from: j  reason: collision with root package name */
        private final Bundle f53j;

        /* renamed from: k  reason: collision with root package name */
        private Object f54k;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f50g = str;
            this.f51h = charSequence;
            this.f52i = i2;
            this.f53j = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
            customAction.f54k = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f51h + ", mIcon=" + this.f52i + ", mExtras=" + this.f53j;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f50g);
            TextUtils.writeToParcel(this.f51h, parcel, i2);
            parcel.writeInt(this.f52i);
            parcel.writeBundle(this.f53j);
        }

        CustomAction(Parcel parcel) {
            this.f50g = parcel.readString();
            this.f51h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f52i = parcel.readInt();
            this.f53j = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f42g = parcel.readInt();
        this.f43h = parcel.readLong();
        this.f45j = parcel.readFloat();
        this.f49n = parcel.readLong();
        this.f44i = parcel.readLong();
        this.f46k = parcel.readLong();
        this.f48m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.o = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.p = parcel.readLong();
        this.q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f47l = parcel.readInt();
    }
}
