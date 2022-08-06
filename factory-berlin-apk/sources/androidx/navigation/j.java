package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: NavBackStackEntryState */
final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final UUID f1073g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1074h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f1075i;

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f1076j;

    /* compiled from: NavBackStackEntryState */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i2) {
            return new j[i2];
        }
    }

    j(i iVar) {
        this.f1073g = iVar.f1070l;
        this.f1074h = iVar.e().m();
        this.f1075i = iVar.b();
        Bundle bundle = new Bundle();
        this.f1076j = bundle;
        iVar.k(bundle);
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        return this.f1075i;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f1074h;
    }

    /* access modifiers changed from: package-private */
    public Bundle c() {
        return this.f1076j;
    }

    /* access modifiers changed from: package-private */
    public UUID d() {
        return this.f1073g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1073g.toString());
        parcel.writeInt(this.f1074h);
        parcel.writeBundle(this.f1075i);
        parcel.writeBundle(this.f1076j);
    }

    j(Parcel parcel) {
        this.f1073g = UUID.fromString(parcel.readString());
        this.f1074h = parcel.readInt();
        this.f1075i = parcel.readBundle(j.class.getClassLoader());
        this.f1076j = parcel.readBundle(j.class.getClassLoader());
    }
}
