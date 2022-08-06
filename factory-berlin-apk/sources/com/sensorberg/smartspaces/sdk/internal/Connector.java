package com.sensorberg.smartspaces.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;
import no.nordicsemi.android.support.v18.scanner.m;

@i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0010\u0012B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00028 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/internal/Connector;", "Landroid/os/Parcelable;", "", "getDistance$sdk_release", "()F", "distance", "", "getId", "()Ljava/lang/String;", "id", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "getScanResult$sdk_release", "()Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "scanResult", "<init>", "()V", "Companion", "BlueIdDevice", "SensorbergGateway1", "Lcom/sensorberg/smartspaces/sdk/internal/Connector$SensorbergGateway1;", "Lcom/sensorberg/smartspaces/sdk/internal/Connector$BlueIdDevice;", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Connector.kt */
public abstract class Connector implements Parcelable {

    /* compiled from: Connector.kt */
    public static final class a extends Connector {
        public static final Parcelable.Creator CREATOR = new C0381a();

        /* renamed from: g  reason: collision with root package name */
        private final String f6382g;

        /* renamed from: h  reason: collision with root package name */
        private final m f6383h;

        /* renamed from: i  reason: collision with root package name */
        private final float f6384i;

        /* renamed from: j  reason: collision with root package name */
        private final String f6385j;

        /* renamed from: k  reason: collision with root package name */
        private final String f6386k;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.Connector$a$a  reason: collision with other inner class name */
        public static class C0381a implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                k.e(parcel, "in");
                return new a(parcel.readString(), parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null, parcel.readFloat(), parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i2) {
                return new a[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, m mVar, float f2, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            k.e(str, "id");
            k.e(str2, "bluetoothName");
            k.e(str3, "secureObjectId");
            this.f6382g = str;
            this.f6383h = mVar;
            this.f6384i = f2;
            this.f6385j = str2;
            this.f6386k = str3;
        }

        public static /* synthetic */ a e(a aVar, String str, m mVar, float f2, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.b();
            }
            if ((i2 & 2) != 0) {
                mVar = aVar.c();
            }
            m mVar2 = mVar;
            if ((i2 & 4) != 0) {
                f2 = aVar.a();
            }
            float f3 = f2;
            if ((i2 & 8) != 0) {
                str2 = aVar.f6385j;
            }
            String str4 = str2;
            if ((i2 & 16) != 0) {
                str3 = aVar.f6386k;
            }
            return aVar.d(str, mVar2, f3, str4, str3);
        }

        public float a() {
            return this.f6384i;
        }

        public String b() {
            return this.f6382g;
        }

        public m c() {
            return this.f6383h;
        }

        public final a d(String str, m mVar, float f2, String str2, String str3) {
            k.e(str, "id");
            k.e(str2, "bluetoothName");
            k.e(str3, "secureObjectId");
            return new a(str, mVar, f2, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.a(b(), aVar.b()) && k.a(c(), aVar.c()) && Float.compare(a(), aVar.a()) == 0 && k.a(this.f6385j, aVar.f6385j) && k.a(this.f6386k, aVar.f6386k);
        }

        public final String f() {
            return this.f6385j;
        }

        public final String g() {
            return this.f6386k;
        }

        public int hashCode() {
            String b = b();
            int i2 = 0;
            int hashCode = (b != null ? b.hashCode() : 0) * 31;
            m c = c();
            int hashCode2 = (((hashCode + (c != null ? c.hashCode() : 0)) * 31) + Float.floatToIntBits(a())) * 31;
            String str = this.f6385j;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f6386k;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return a.class.getSimpleName() + ". bluetooth-name(" + this.f6385j + ')';
        }

        public void writeToParcel(Parcel parcel, int i2) {
            k.e(parcel, "parcel");
            parcel.writeString(this.f6382g);
            m mVar = this.f6383h;
            if (mVar != null) {
                parcel.writeInt(1);
                mVar.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeFloat(this.f6384i);
            parcel.writeString(this.f6385j);
            parcel.writeString(this.f6386k);
        }
    }

    /* compiled from: Connector.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Connector.kt */
    public static final class c extends Connector {
        public static final Parcelable.Creator CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        private final String f6387g;

        /* renamed from: h  reason: collision with root package name */
        private final m f6388h;

        /* renamed from: i  reason: collision with root package name */
        private final float f6389i;

        /* renamed from: j  reason: collision with root package name */
        private final String f6390j;

        /* renamed from: k  reason: collision with root package name */
        private final List<String> f6391k;

        public static class a implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                k.e(parcel, "in");
                return new c(parcel.readString(), parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null, parcel.readFloat(), parcel.readString(), parcel.createStringArrayList());
            }

            public final Object[] newArray(int i2) {
                return new c[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, m mVar, float f2, String str2, List<String> list) {
            super((DefaultConstructorMarker) null);
            k.e(str, "id");
            k.e(str2, "bluetoothBroadcast");
            k.e(list, "commChannels");
            this.f6387g = str;
            this.f6388h = mVar;
            this.f6389i = f2;
            this.f6390j = str2;
            this.f6391k = list;
        }

        public static /* synthetic */ c e(c cVar, String str, m mVar, float f2, String str2, List<String> list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = cVar.b();
            }
            if ((i2 & 2) != 0) {
                mVar = cVar.c();
            }
            m mVar2 = mVar;
            if ((i2 & 4) != 0) {
                f2 = cVar.a();
            }
            float f3 = f2;
            if ((i2 & 8) != 0) {
                str2 = cVar.f6390j;
            }
            String str3 = str2;
            if ((i2 & 16) != 0) {
                list = cVar.f6391k;
            }
            return cVar.d(str, mVar2, f3, str3, list);
        }

        public float a() {
            return this.f6389i;
        }

        public String b() {
            return this.f6387g;
        }

        public m c() {
            return this.f6388h;
        }

        public final c d(String str, m mVar, float f2, String str2, List<String> list) {
            k.e(str, "id");
            k.e(str2, "bluetoothBroadcast");
            k.e(list, "commChannels");
            return new c(str, mVar, f2, str2, list);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k.a(b(), cVar.b()) && k.a(c(), cVar.c()) && Float.compare(a(), cVar.a()) == 0 && k.a(this.f6390j, cVar.f6390j) && k.a(this.f6391k, cVar.f6391k);
        }

        public final String f() {
            return this.f6390j;
        }

        public final List<String> g() {
            return this.f6391k;
        }

        public int hashCode() {
            String b = b();
            int i2 = 0;
            int hashCode = (b != null ? b.hashCode() : 0) * 31;
            m c = c();
            int hashCode2 = (((hashCode + (c != null ? c.hashCode() : 0)) * 31) + Float.floatToIntBits(a())) * 31;
            String str = this.f6390j;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            List<String> list = this.f6391k;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return c.class.getSimpleName() + ". broadcast(" + this.f6390j + ')';
        }

        public void writeToParcel(Parcel parcel, int i2) {
            k.e(parcel, "parcel");
            parcel.writeString(this.f6387g);
            m mVar = this.f6388h;
            if (mVar != null) {
                parcel.writeInt(1);
                mVar.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeFloat(this.f6389i);
            parcel.writeString(this.f6390j);
            parcel.writeStringList(this.f6391k);
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    private Connector() {
    }

    public abstract float a();

    public abstract String b();

    public abstract m c();

    public /* synthetic */ Connector(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
