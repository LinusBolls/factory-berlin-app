package com.sensorberg.smartspaces.sdk.internal.u;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;

/* compiled from: ConnectionDetails.kt */
public abstract class a implements Parcelable {

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.u.a$a  reason: collision with other inner class name */
    /* compiled from: ConnectionDetails.kt */
    public static final class C0396a extends a {
        public static final Parcelable.Creator CREATOR = new C0397a();

        /* renamed from: g  reason: collision with root package name */
        private final String f6628g;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.u.a$a$a  reason: collision with other inner class name */
        public static class C0397a implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                k.e(parcel, "in");
                return new C0396a(parcel.readString());
            }

            public final Object[] newArray(int i2) {
                return new C0396a[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0396a(String str) {
            super((DefaultConstructorMarker) null);
            k.e(str, "id");
            this.f6628g = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0396a) && k.a(this.f6628g, ((C0396a) obj).f6628g);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f6628g;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Gateway(id=" + this.f6628g + ")";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            k.e(parcel, "parcel");
            parcel.writeString(this.f6628g);
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
