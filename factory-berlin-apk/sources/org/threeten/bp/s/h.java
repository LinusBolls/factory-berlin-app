package org.threeten.bp.s;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.f;
import org.threeten.bp.o;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;

/* compiled from: Chronology */
public abstract class h implements Comparable<h> {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentHashMap<String, h> f11646g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentHashMap<String, h> f11647h = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
        }
    }

    protected h() {
    }

    public static h n(e eVar) {
        d.i(eVar, "temporal");
        h hVar = (h) eVar.h(j.a());
        return hVar != null ? hVar : m.f11663i;
    }

    private static void q() {
        if (f11646g.isEmpty()) {
            x(m.f11663i);
            x(v.f11691i);
            x(r.f11684i);
            x(o.f11668j);
            x(j.f11648i);
            f11646g.putIfAbsent("Hijrah", j.f11648i);
            f11647h.putIfAbsent("islamic", j.f11648i);
            Iterator<S> it = ServiceLoader.load(h.class, h.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                f11646g.putIfAbsent(hVar.p(), hVar);
                String o = hVar.o();
                if (o != null) {
                    f11647h.putIfAbsent(o, hVar);
                }
            }
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static h v(String str) {
        q();
        h hVar = f11646g.get(str);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = f11647h.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        throw new DateTimeException("Unknown chronology: " + str);
    }

    static h w(DataInput dataInput) {
        return v(dataInput.readUTF());
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    private static void x(h hVar) {
        f11646g.putIfAbsent(hVar.p(), hVar);
        String o = hVar.o();
        if (o != null) {
            f11647h.putIfAbsent(o, hVar);
        }
    }

    public f<?> A(org.threeten.bp.d dVar, o oVar) {
        return g.b0(this, dVar, oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        return org.threeten.bp.s.g.a0(j(t(r5)), r0, (org.threeten.bp.p) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.threeten.bp.s.f<?> B(org.threeten.bp.temporal.e r5) {
        /*
            r4 = this;
            org.threeten.bp.o r0 = org.threeten.bp.o.a(r5)     // Catch:{ DateTimeException -> 0x001b }
            org.threeten.bp.d r1 = org.threeten.bp.d.G(r5)     // Catch:{ DateTimeException -> 0x000d }
            org.threeten.bp.s.f r5 = r4.A(r1, r0)     // Catch:{ DateTimeException -> 0x000d }
            return r5
        L_0x000d:
            org.threeten.bp.s.c r1 = r4.t(r5)     // Catch:{ DateTimeException -> 0x001b }
            org.threeten.bp.s.d r1 = r4.j(r1)     // Catch:{ DateTimeException -> 0x001b }
            r2 = 0
            org.threeten.bp.s.f r5 = org.threeten.bp.s.g.a0(r1, r0, r2)     // Catch:{ DateTimeException -> 0x001b }
            return r5
        L_0x001b:
            r0 = move-exception
            org.threeten.bp.DateTimeException r1 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to obtain ChronoZonedDateTime from TemporalAccessor: "
            r2.append(r3)
            java.lang.Class r5 = r5.getClass()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.h.B(org.threeten.bp.temporal.e):org.threeten.bp.s.f");
    }

    /* renamed from: a */
    public int compareTo(h hVar) {
        return p().compareTo(hVar.p());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h) || compareTo((h) obj) != 0) {
            return false;
        }
        return true;
    }

    public abstract b f(int i2, int i3, int i4);

    public abstract b h(e eVar);

    public int hashCode() {
        return getClass().hashCode() ^ p().hashCode();
    }

    /* access modifiers changed from: package-private */
    public <D extends b> D i(org.threeten.bp.temporal.d dVar) {
        D d2 = (b) dVar;
        if (equals(d2.G())) {
            return d2;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + p() + ", actual: " + d2.G().p());
    }

    /* access modifiers changed from: package-private */
    public <D extends b> d<D> j(org.threeten.bp.temporal.d dVar) {
        d<D> dVar2 = (d) dVar;
        if (equals(dVar2.U().G())) {
            return dVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + p() + ", supplied: " + dVar2.U().G().p());
    }

    /* access modifiers changed from: package-private */
    public <D extends b> g<D> k(org.threeten.bp.temporal.d dVar) {
        g<D> gVar = (g) dVar;
        if (equals(gVar.R().G())) {
            return gVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + p() + ", supplied: " + gVar.R().G().p());
    }

    public abstract i l(int i2);

    public abstract String o();

    public abstract String p();

    public c<?> t(e eVar) {
        try {
            return h(eVar).D(f.G(eVar));
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + eVar.getClass(), e2);
        }
    }

    public String toString() {
        return p();
    }

    /* access modifiers changed from: package-private */
    public void y(Map<i, Long> map, a aVar, long j2) {
        Long l2 = map.get(aVar);
        if (l2 == null || l2.longValue() == j2) {
            map.put(aVar, Long.valueOf(j2));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + aVar + " " + l2 + " conflicts with " + aVar + " " + j2);
    }

    /* access modifiers changed from: package-private */
    public void z(DataOutput dataOutput) {
        dataOutput.writeUTF(p());
    }
}
