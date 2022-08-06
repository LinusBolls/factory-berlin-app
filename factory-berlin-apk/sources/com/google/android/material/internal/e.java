package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: ParcelableSparseArray */
public class e extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* compiled from: ParcelableSparseArray */
    static class a implements Parcelable.ClassLoaderCreator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new e(parcel, classLoader);
        }

        /* renamed from: c */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public e() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = keyAt(i3);
            parcelableArr[i3] = (Parcelable) valueAt(i3);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }

    public e(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i2 = 0; i2 < readInt; i2++) {
            put(iArr[i2], readParcelableArray[i2]);
        }
    }
}
