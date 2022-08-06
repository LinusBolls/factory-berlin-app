package f.a.a;

import java.io.Serializable;

/* compiled from: BoundingBox */
public class a implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private double f9004g;

    /* renamed from: h  reason: collision with root package name */
    private double f9005h;

    /* renamed from: i  reason: collision with root package name */
    private double f9006i;

    /* renamed from: j  reason: collision with root package name */
    private double f9007j;

    public a(c cVar, c cVar2) {
        this(cVar.a(), cVar2.a(), cVar.b(), cVar2.b());
    }

    private static int c(double d2) {
        long doubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public c a() {
        return new c(this.f9004g, this.f9007j);
    }

    public c b() {
        return new c(this.f9005h, this.f9006i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9004g == aVar.f9004g && this.f9006i == aVar.f9006i && this.f9005h == aVar.f9005h && this.f9007j == aVar.f9007j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((629 + c(this.f9004g)) * 37) + c(this.f9005h)) * 37) + c(this.f9006i)) * 37) + c(this.f9007j);
    }

    public String toString() {
        return b() + " -> " + a();
    }

    public a(double d2, double d3, double d4, double d5) {
        this.f9006i = Math.min(d4, d5);
        this.f9007j = Math.max(d4, d5);
        this.f9004g = Math.min(d2, d3);
        this.f9005h = Math.max(d2, d3);
    }
}
