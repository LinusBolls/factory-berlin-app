package g.e.l;

import android.os.Parcel;
import android.os.Parcelable;
import e.h.j.h;
import java.util.Arrays;

/* compiled from: Permission */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0680a();

    /* renamed from: g  reason: collision with root package name */
    private final String f9901g;

    /* renamed from: h  reason: collision with root package name */
    private final d f9902h;

    /* renamed from: g.e.l.a$a  reason: collision with other inner class name */
    /* compiled from: Permission */
    static class C0680a implements Parcelable.Creator<a> {
        C0680a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    a(String str, d dVar) {
        h.c(str);
        this.f9901g = str;
        h.c(dVar);
        this.f9902h = dVar;
    }

    public String a() {
        return this.f9901g;
    }

    public d b() {
        return this.f9902h;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f9901g.equals(aVar.f9901g) || this.f9902h != aVar.f9902h) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9901g, this.f9902h});
    }

    public String toString() {
        return "Permission{name='" + this.f9901g + '\'' + ", result=" + this.f9902h + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f9901g);
        parcel.writeInt(this.f9902h.ordinal());
    }

    protected a(Parcel parcel) {
        String readString = parcel.readString();
        h.c(readString);
        this.f9901g = readString;
        this.f9902h = d.values()[parcel.readInt()];
    }
}
