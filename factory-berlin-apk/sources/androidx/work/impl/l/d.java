package androidx.work.impl.l;

/* compiled from: SystemIdInfo */
public class d {
    public final String a;
    public final int b;

    public d(String str, int i2) {
        this.a = str;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b != dVar.b) {
            return false;
        }
        return this.a.equals(dVar.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
