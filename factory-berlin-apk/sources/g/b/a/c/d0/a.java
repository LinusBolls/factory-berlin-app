package g.b.a.c.d0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e.e.g;

/* compiled from: ExtendableSavedState */
public class a extends e.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0633a();

    /* renamed from: i  reason: collision with root package name */
    public final g<String, Bundle> f9513i;

    /* renamed from: g.b.a.c.d0.a$a  reason: collision with other inner class name */
    /* compiled from: ExtendableSavedState */
    static class C0633a implements Parcelable.ClassLoaderCreator<a> {
        C0633a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null, (C0633a) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, (C0633a) null);
        }

        /* renamed from: c */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0633a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f9513i + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        int size = this.f9513i.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.f9513i.i(i3);
            bundleArr[i3] = this.f9513i.m(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f9513i = new g<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f9513i = new g<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f9513i.put(strArr[i2], bundleArr[i2]);
        }
    }
}
