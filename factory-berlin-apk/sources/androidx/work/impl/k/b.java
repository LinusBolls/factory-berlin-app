package androidx.work.impl.k;

/* compiled from: NetworkState */
public class b {
    private boolean a;
    private boolean b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1701d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f1701d = z4;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.f1701d;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.f1701d == bVar.f1701d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.a ? 1 : 0;
        if (this.b) {
            i2 += 16;
        }
        if (this.c) {
            i2 += 256;
        }
        return this.f1701d ? i2 + 4096 : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.f1701d)});
    }
}
