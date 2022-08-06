package e.h.j;

/* compiled from: Pair */
public class d<F, S> {
    public final F a;
    public final S b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.a, this.a) || !c.a(dVar.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f2 = this.a;
        int i2 = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
