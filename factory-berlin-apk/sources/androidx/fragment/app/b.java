package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.u;
import androidx.lifecycle.p;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: BackStackState */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    final int[] f796g;

    /* renamed from: h  reason: collision with root package name */
    final ArrayList<String> f797h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f798i;

    /* renamed from: j  reason: collision with root package name */
    final int[] f799j;

    /* renamed from: k  reason: collision with root package name */
    final int f800k;

    /* renamed from: l  reason: collision with root package name */
    final String f801l;

    /* renamed from: m  reason: collision with root package name */
    final int f802m;

    /* renamed from: n  reason: collision with root package name */
    final int f803n;
    final CharSequence o;
    final int p;
    final CharSequence q;
    final ArrayList<String> r;
    final ArrayList<String> s;
    final boolean t;

    /* compiled from: BackStackState */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.f796g = new int[(size * 5)];
        if (aVar.f863g) {
            this.f797h = new ArrayList<>(size);
            this.f798i = new int[size];
            this.f799j = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                u.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.f796g[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f797h;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.f779k : null);
                int[] iArr = this.f796g;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f871d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f872e;
                iArr[i7] = aVar2.f873f;
                this.f798i[i2] = aVar2.f874g.ordinal();
                this.f799j[i2] = aVar2.f875h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f800k = aVar.f862f;
            this.f801l = aVar.f865i;
            this.f802m = aVar.t;
            this.f803n = aVar.f866j;
            this.o = aVar.f867k;
            this.p = aVar.f868l;
            this.q = aVar.f869m;
            this.r = aVar.f870n;
            this.s = aVar.o;
            this.t = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(m mVar) {
        a aVar = new a(mVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f796g.length) {
            u.a aVar2 = new u.a();
            int i4 = i2 + 1;
            aVar2.a = this.f796g[i2];
            if (m.p0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f796g[i4]);
            }
            String str = this.f797h.get(i3);
            if (str != null) {
                aVar2.b = mVar.V(str);
            } else {
                aVar2.b = null;
            }
            aVar2.f874g = p.b.values()[this.f798i[i3]];
            aVar2.f875h = p.b.values()[this.f799j[i3]];
            int[] iArr = this.f796g;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f871d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f872e = i10;
            int i11 = iArr[i9];
            aVar2.f873f = i11;
            aVar.b = i6;
            aVar.c = i8;
            aVar.f860d = i10;
            aVar.f861e = i11;
            aVar.f(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f862f = this.f800k;
        aVar.f865i = this.f801l;
        aVar.t = this.f802m;
        aVar.f863g = true;
        aVar.f866j = this.f803n;
        aVar.f867k = this.o;
        aVar.f868l = this.p;
        aVar.f869m = this.q;
        aVar.f870n = this.r;
        aVar.o = this.s;
        aVar.p = this.t;
        aVar.x(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f796g);
        parcel.writeStringList(this.f797h);
        parcel.writeIntArray(this.f798i);
        parcel.writeIntArray(this.f799j);
        parcel.writeInt(this.f800k);
        parcel.writeString(this.f801l);
        parcel.writeInt(this.f802m);
        parcel.writeInt(this.f803n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeInt(this.p);
        TextUtils.writeToParcel(this.q, parcel, 0);
        parcel.writeStringList(this.r);
        parcel.writeStringList(this.s);
        parcel.writeInt(this.t ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f796g = parcel.createIntArray();
        this.f797h = parcel.createStringArrayList();
        this.f798i = parcel.createIntArray();
        this.f799j = parcel.createIntArray();
        this.f800k = parcel.readInt();
        this.f801l = parcel.readString();
        this.f802m = parcel.readInt();
        this.f803n = parcel.readInt();
        this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.p = parcel.readInt();
        this.q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.r = parcel.createStringArrayList();
        this.s = parcel.createStringArrayList();
        this.t = parcel.readInt() != 0;
    }
}
