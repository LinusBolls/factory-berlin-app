package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.c;
import org.threeten.bp.e;
import org.threeten.bp.p;

/* compiled from: ZoneOffsetTransition */
public final class d implements Comparable<d>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final e f11762g;

    /* renamed from: h  reason: collision with root package name */
    private final p f11763h;

    /* renamed from: i  reason: collision with root package name */
    private final p f11764i;

    d(e eVar, p pVar, p pVar2) {
        this.f11762g = eVar;
        this.f11763h = pVar;
        this.f11764i = pVar2;
    }

    private int j() {
        return l().K() - n().K();
    }

    static d q(DataInput dataInput) {
        long b = a.b(dataInput);
        p d2 = a.d(dataInput);
        p d3 = a.d(dataInput);
        if (!d2.equals(d3)) {
            return new d(b, d2, d3);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        return k().compareTo(dVar.k());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f11762g.equals(dVar.f11762g) || !this.f11763h.equals(dVar.f11763h) || !this.f11764i.equals(dVar.f11764i)) {
            return false;
        }
        return true;
    }

    public e f() {
        return this.f11762g.A0((long) j());
    }

    public e h() {
        return this.f11762g;
    }

    public int hashCode() {
        return (this.f11762g.hashCode() ^ this.f11763h.hashCode()) ^ Integer.rotateLeft(this.f11764i.hashCode(), 16);
    }

    public c i() {
        return c.o((long) j());
    }

    public org.threeten.bp.d k() {
        return this.f11762g.T(this.f11763h);
    }

    public p l() {
        return this.f11764i;
    }

    public p n() {
        return this.f11763h;
    }

    /* access modifiers changed from: package-private */
    public List<p> o() {
        if (p()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new p[]{n(), l()});
    }

    public boolean p() {
        return l().K() > n().K();
    }

    public long t() {
        return this.f11762g.S(this.f11763h);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(p() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f11762g);
        sb.append(this.f11763h);
        sb.append(" to ");
        sb.append(this.f11764i);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void v(DataOutput dataOutput) {
        a.e(t(), dataOutput);
        a.g(this.f11763h, dataOutput);
        a.g(this.f11764i, dataOutput);
    }

    d(long j2, p pVar, p pVar2) {
        this.f11762g = e.r0(j2, 0, pVar);
        this.f11763h = pVar;
        this.f11764i = pVar2;
    }
}
