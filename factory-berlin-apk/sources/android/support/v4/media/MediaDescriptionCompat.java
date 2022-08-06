package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final String f11g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f12h;

    /* renamed from: i  reason: collision with root package name */
    private final CharSequence f13i;

    /* renamed from: j  reason: collision with root package name */
    private final CharSequence f14j;

    /* renamed from: k  reason: collision with root package name */
    private final Bitmap f15k;

    /* renamed from: l  reason: collision with root package name */
    private final Uri f16l;

    /* renamed from: m  reason: collision with root package name */
    private final Bundle f17m;

    /* renamed from: n  reason: collision with root package name */
    private final Uri f18n;
    private Object o;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(d.a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public static final class b {
        private String a;
        private CharSequence b;
        private CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f19d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f20e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f21f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f22g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f23h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.f19d, this.f20e, this.f21f, this.f22g, this.f23h);
        }

        public b b(CharSequence charSequence) {
            this.f19d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f22g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f20e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f21f = uri;
            return this;
        }

        public b f(String str) {
            this.a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f23h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f11g = str;
        this.f12h = charSequence;
        this.f13i = charSequence2;
        this.f14j = charSequence3;
        this.f15k = bitmap;
        this.f16l = uri;
        this.f17m = bundle;
        this.f18n = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.d.f(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.h(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.g(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.b(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.d.d(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.d.e(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.d.c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.c(r0)
            if (r4 == 0) goto L_0x006d
            r1.g(r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = android.support.v4.media.e.a(r8)
            r1.g(r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.o = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        if (this.o != null || Build.VERSION.SDK_INT < 21) {
            return this.o;
        }
        Object b2 = d.a.b();
        d.a.g(b2, this.f11g);
        d.a.i(b2, this.f12h);
        d.a.h(b2, this.f13i);
        d.a.c(b2, this.f14j);
        d.a.e(b2, this.f15k);
        d.a.f(b2, this.f16l);
        Bundle bundle = this.f17m;
        if (Build.VERSION.SDK_INT < 23 && this.f18n != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f18n);
        }
        d.a.d(b2, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            e.a.a(b2, this.f18n);
        }
        Object a2 = d.a.a(b2);
        this.o = a2;
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f12h + ", " + this.f13i + ", " + this.f14j;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f11g);
            TextUtils.writeToParcel(this.f12h, parcel, i2);
            TextUtils.writeToParcel(this.f13i, parcel, i2);
            TextUtils.writeToParcel(this.f14j, parcel, i2);
            parcel.writeParcelable(this.f15k, i2);
            parcel.writeParcelable(this.f16l, i2);
            parcel.writeBundle(this.f17m);
            parcel.writeParcelable(this.f18n, i2);
            return;
        }
        d.i(b(), parcel, i2);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f11g = parcel.readString();
        this.f12h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f15k = (Bitmap) parcel.readParcelable(classLoader);
        this.f16l = (Uri) parcel.readParcelable(classLoader);
        this.f17m = parcel.readBundle(classLoader);
        this.f18n = (Uri) parcel.readParcelable(classLoader);
    }
}
