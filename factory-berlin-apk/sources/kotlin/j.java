package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: Tuples.kt */
public final class j<A, B> implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final A f10647g;

    /* renamed from: h  reason: collision with root package name */
    private final B f10648h;

    public j(A a, B b) {
        this.f10647g = a;
        this.f10648h = b;
    }

    public final A a() {
        return this.f10647g;
    }

    public final B b() {
        return this.f10648h;
    }

    public final A c() {
        return this.f10647g;
    }

    public final B d() {
        return this.f10648h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k.a(this.f10647g, jVar.f10647g) && k.a(this.f10648h, jVar.f10648h);
    }

    public int hashCode() {
        A a = this.f10647g;
        int i2 = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f10648h;
        if (b != null) {
            i2 = b.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + this.f10647g + ", " + this.f10648h + ')';
    }
}
