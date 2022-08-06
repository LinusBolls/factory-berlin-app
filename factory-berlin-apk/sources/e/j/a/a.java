package e.j.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: AbsSavedState */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final a f8722h = new C0567a();

    /* renamed from: g  reason: collision with root package name */
    private final Parcelable f8723g;

    /* renamed from: e.j.a.a$a  reason: collision with other inner class name */
    /* compiled from: AbsSavedState */
    class C0567a extends a {
        C0567a() {
            super((C0567a) null);
        }
    }

    /* compiled from: AbsSavedState */
    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f8722h;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* synthetic */ a(C0567a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f8723g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f8723g, i2);
    }

    private a() {
        this.f8723g = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f8723g = parcelable == f8722h ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f8723g = readParcelable == null ? f8722h : readParcelable;
    }
}
