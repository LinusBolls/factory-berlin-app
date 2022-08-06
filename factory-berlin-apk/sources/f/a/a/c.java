package f.a.a;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.io.Serializable;

/* compiled from: WGS84Point */
public class c implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final double f9015g;

    /* renamed from: h  reason: collision with root package name */
    private final double f9016h;

    public c(double d2, double d3) {
        this.f9016h = d2;
        this.f9015g = d3;
        if (Math.abs(d2) > 90.0d || Math.abs(d3) > 180.0d) {
            throw new IllegalArgumentException("The supplied coordinates " + this + " are out of range.");
        }
    }

    public double a() {
        return this.f9016h;
    }

    public double b() {
        return this.f9015g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9016h == cVar.f9016h && this.f9015g == cVar.f9015g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9016h);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9015g);
        return ((1302 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return String.format("(" + this.f9016h + AndroidSdkMetrics.SEPARATOR + this.f9015g + ")", new Object[0]);
    }
}
