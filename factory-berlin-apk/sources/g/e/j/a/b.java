package g.e.j.a;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;

/* compiled from: Action.kt */
public final class b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final String f9813g;

    /* renamed from: h  reason: collision with root package name */
    private final String f9814h;

    /* renamed from: i  reason: collision with root package name */
    private final String f9815i;

    /* renamed from: j  reason: collision with root package name */
    private final String f9816j;

    /* renamed from: k  reason: collision with root package name */
    private final String f9817k;

    /* renamed from: l  reason: collision with root package name */
    private final String f9818l;

    /* renamed from: m  reason: collision with root package name */
    private String f9819m;

    /* renamed from: n  reason: collision with root package name */
    private String f9820n;

    public static class a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.f(parcel, "in");
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        k.f(str, "actionId");
        k.f(str2, "instanceId");
        this.f9813g = str;
        this.f9814h = str2;
        this.f9815i = str3;
        this.f9816j = str4;
        this.f9817k = str5;
        this.f9818l = str6;
        this.f9819m = str7;
        this.f9820n = str8;
    }

    public final String a() {
        return this.f9813g;
    }

    public final String b() {
        return this.f9819m;
    }

    public final String c() {
        return this.f9816j;
    }

    public final String d() {
        return this.f9814h;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f9818l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f9813g, bVar.f9813g) && k.a(this.f9814h, bVar.f9814h) && k.a(this.f9815i, bVar.f9815i) && k.a(this.f9816j, bVar.f9816j) && k.a(this.f9817k, bVar.f9817k) && k.a(this.f9818l, bVar.f9818l) && k.a(this.f9819m, bVar.f9819m) && k.a(this.f9820n, bVar.f9820n);
    }

    public final String f() {
        return this.f9815i;
    }

    public final String g() {
        return this.f9820n;
    }

    public final String h() {
        return this.f9817k;
    }

    public int hashCode() {
        String str = this.f9813g;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9814h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9815i;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9816j;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9817k;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f9818l;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f9819m;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f9820n;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        return "Action(actionId=" + this.f9813g + ", instanceId=" + this.f9814h + ", subject=" + this.f9815i + ", body=" + this.f9816j + ", url=" + this.f9817k + ", payload=" + this.f9818l + ", backendMeta=" + this.f9819m + ", triggerBackendMeta=" + this.f9820n + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.f(parcel, "parcel");
        parcel.writeString(this.f9813g);
        parcel.writeString(this.f9814h);
        parcel.writeString(this.f9815i);
        parcel.writeString(this.f9816j);
        parcel.writeString(this.f9817k);
        parcel.writeString(this.f9818l);
        parcel.writeString(this.f9819m);
        parcel.writeString(this.f9820n);
    }
}
