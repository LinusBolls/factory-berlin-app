package g.b.a.b.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.location.b;
import java.util.Locale;

public final class a0 extends a implements b {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: g  reason: collision with root package name */
    private final String f9327g;

    /* renamed from: h  reason: collision with root package name */
    private final long f9328h;

    /* renamed from: i  reason: collision with root package name */
    private final short f9329i;

    /* renamed from: j  reason: collision with root package name */
    private final double f9330j;

    /* renamed from: k  reason: collision with root package name */
    private final double f9331k;

    /* renamed from: l  reason: collision with root package name */
    private final float f9332l;

    /* renamed from: m  reason: collision with root package name */
    private final int f9333m;

    /* renamed from: n  reason: collision with root package name */
    private final int f9334n;
    private final int o;

    public a0(String str, int i2, short s, double d2, double d3, float f2, long j2, int i3, int i4) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f2 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        } else if (d2 > 90.0d || d2 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d3 > 180.0d || d3 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d3);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i5 = i2 & 7;
            if (i5 != 0) {
                this.f9329i = s;
                this.f9327g = str;
                this.f9330j = d2;
                this.f9331k = d3;
                this.f9332l = f2;
                this.f9328h = j2;
                this.f9333m = i5;
                this.f9334n = i3;
                this.o = i4;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static a0 l(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        a0 createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f9332l == a0Var.f9332l && this.f9330j == a0Var.f9330j && this.f9331k == a0Var.f9331k && this.f9329i == a0Var.f9329i;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9330j);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9331k);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f9332l)) * 31) + this.f9329i) * 31) + this.f9333m;
    }

    public final String k() {
        return this.f9327g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f9329i != 1 ? null : "CIRCLE";
        objArr[1] = this.f9327g.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f9333m);
        objArr[3] = Double.valueOf(this.f9330j);
        objArr[4] = Double.valueOf(this.f9331k);
        objArr[5] = Float.valueOf(this.f9332l);
        objArr[6] = Integer.valueOf(this.f9334n / 1000);
        objArr[7] = Integer.valueOf(this.o);
        objArr[8] = Long.valueOf(this.f9328h);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.q(parcel, 1, k(), false);
        com.google.android.gms.common.internal.safeparcel.b.m(parcel, 2, this.f9328h);
        com.google.android.gms.common.internal.safeparcel.b.p(parcel, 3, this.f9329i);
        com.google.android.gms.common.internal.safeparcel.b.g(parcel, 4, this.f9330j);
        com.google.android.gms.common.internal.safeparcel.b.g(parcel, 5, this.f9331k);
        com.google.android.gms.common.internal.safeparcel.b.i(parcel, 6, this.f9332l);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 7, this.f9333m);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 8, this.f9334n);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 9, this.o);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }
}
