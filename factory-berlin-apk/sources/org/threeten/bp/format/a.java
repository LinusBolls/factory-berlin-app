package org.threeten.bp.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.d;
import org.threeten.bp.f;
import org.threeten.bp.k;
import org.threeten.bp.o;
import org.threeten.bp.p;
import org.threeten.bp.s.b;
import org.threeten.bp.s.h;
import org.threeten.bp.s.m;
import org.threeten.bp.t.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;

/* compiled from: DateTimeBuilder */
final class a extends c implements e, Cloneable {

    /* renamed from: g  reason: collision with root package name */
    final Map<i, Long> f11497g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    h f11498h;

    /* renamed from: i  reason: collision with root package name */
    o f11499i;

    /* renamed from: j  reason: collision with root package name */
    b f11500j;

    /* renamed from: k  reason: collision with root package name */
    f f11501k;

    /* renamed from: l  reason: collision with root package name */
    boolean f11502l;

    /* renamed from: m  reason: collision with root package name */
    k f11503m;

    private void I(LocalDate localDate) {
        if (localDate != null) {
            F(localDate);
            for (i next : this.f11497g.keySet()) {
                if ((next instanceof org.threeten.bp.temporal.a) && next.a()) {
                    try {
                        long y = localDate.y(next);
                        Long l2 = this.f11497g.get(next);
                        if (y != l2.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + next + " " + y + " differs from " + next + " " + l2 + " derived from " + localDate);
                        }
                    } catch (DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }

    private void M() {
        f fVar;
        if (this.f11497g.size() > 0) {
            b bVar = this.f11500j;
            if (bVar == null || (fVar = this.f11501k) == null) {
                b bVar2 = this.f11500j;
                if (bVar2 != null) {
                    O(bVar2);
                    return;
                }
                f fVar2 = this.f11501k;
                if (fVar2 != null) {
                    O(fVar2);
                    return;
                }
                return;
            }
            O(bVar.D(fVar));
        }
    }

    private void O(e eVar) {
        Iterator<Map.Entry<i, Long>> it = this.f11497g.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            i iVar = (i) next.getKey();
            long longValue = ((Long) next.getValue()).longValue();
            if (eVar.t(iVar)) {
                try {
                    long y = eVar.y(iVar);
                    if (y == longValue) {
                        it.remove();
                    } else {
                        throw new DateTimeException("Cross check failed: " + iVar + " " + y + " vs " + iVar + " " + longValue);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private Long Q(i iVar) {
        return this.f11497g.get(iVar);
    }

    private void R(j jVar) {
        if (this.f11498h instanceof m) {
            I(m.f11663i.K(this.f11497g, jVar));
        } else if (this.f11497g.containsKey(org.threeten.bp.temporal.a.EPOCH_DAY)) {
            I(LocalDate.B0(this.f11497g.remove(org.threeten.bp.temporal.a.EPOCH_DAY).longValue()));
        }
    }

    private void S() {
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.INSTANT_SECONDS)) {
            o oVar = this.f11499i;
            if (oVar != null) {
                T(oVar);
                return;
            }
            Long l2 = this.f11497g.get(org.threeten.bp.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                T(p.O(l2.intValue()));
            }
        }
    }

    private void T(o oVar) {
        org.threeten.bp.s.f A = this.f11498h.A(d.T(this.f11497g.remove(org.threeten.bp.temporal.a.INSTANT_SECONDS).longValue()), oVar);
        if (this.f11500j == null) {
            F(A.R());
        } else {
            c0(org.threeten.bp.temporal.a.INSTANT_SECONDS, A.R());
        }
        C(org.threeten.bp.temporal.a.SECOND_OF_DAY, (long) A.T().o0());
    }

    private void U(j jVar) {
        long j2 = 0;
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY)) {
            long longValue = this.f11497g.remove(org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY).longValue();
            if (!(jVar == j.LENIENT || (jVar == j.SMART && longValue == 0))) {
                org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY.p(longValue);
            }
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            C(aVar, longValue);
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM)) {
            long longValue2 = this.f11497g.remove(org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM).longValue();
            if (!(jVar == j.LENIENT || (jVar == j.SMART && longValue2 == 0))) {
                org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM.p(longValue2);
            }
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j2 = longValue2;
            }
            C(aVar2, j2);
        }
        if (jVar != j.LENIENT) {
            if (this.f11497g.containsKey(org.threeten.bp.temporal.a.AMPM_OF_DAY)) {
                org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.AMPM_OF_DAY;
                aVar3.p(this.f11497g.get(aVar3).longValue());
            }
            if (this.f11497g.containsKey(org.threeten.bp.temporal.a.HOUR_OF_AMPM)) {
                org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.HOUR_OF_AMPM;
                aVar4.p(this.f11497g.get(aVar4).longValue());
            }
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.AMPM_OF_DAY) && this.f11497g.containsKey(org.threeten.bp.temporal.a.HOUR_OF_AMPM)) {
            C(org.threeten.bp.temporal.a.HOUR_OF_DAY, (this.f11497g.remove(org.threeten.bp.temporal.a.AMPM_OF_DAY).longValue() * 12) + this.f11497g.remove(org.threeten.bp.temporal.a.HOUR_OF_AMPM).longValue());
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.NANO_OF_DAY)) {
            long longValue3 = this.f11497g.remove(org.threeten.bp.temporal.a.NANO_OF_DAY).longValue();
            if (jVar != j.LENIENT) {
                org.threeten.bp.temporal.a.NANO_OF_DAY.p(longValue3);
            }
            C(org.threeten.bp.temporal.a.SECOND_OF_DAY, longValue3 / 1000000000);
            C(org.threeten.bp.temporal.a.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MICRO_OF_DAY)) {
            long longValue4 = this.f11497g.remove(org.threeten.bp.temporal.a.MICRO_OF_DAY).longValue();
            if (jVar != j.LENIENT) {
                org.threeten.bp.temporal.a.MICRO_OF_DAY.p(longValue4);
            }
            C(org.threeten.bp.temporal.a.SECOND_OF_DAY, longValue4 / 1000000);
            C(org.threeten.bp.temporal.a.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MILLI_OF_DAY)) {
            long longValue5 = this.f11497g.remove(org.threeten.bp.temporal.a.MILLI_OF_DAY).longValue();
            if (jVar != j.LENIENT) {
                org.threeten.bp.temporal.a.MILLI_OF_DAY.p(longValue5);
            }
            C(org.threeten.bp.temporal.a.SECOND_OF_DAY, longValue5 / 1000);
            C(org.threeten.bp.temporal.a.MILLI_OF_SECOND, longValue5 % 1000);
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.SECOND_OF_DAY)) {
            long longValue6 = this.f11497g.remove(org.threeten.bp.temporal.a.SECOND_OF_DAY).longValue();
            if (jVar != j.LENIENT) {
                org.threeten.bp.temporal.a.SECOND_OF_DAY.p(longValue6);
            }
            C(org.threeten.bp.temporal.a.HOUR_OF_DAY, longValue6 / 3600);
            C(org.threeten.bp.temporal.a.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            C(org.threeten.bp.temporal.a.SECOND_OF_MINUTE, longValue6 % 60);
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MINUTE_OF_DAY)) {
            long longValue7 = this.f11497g.remove(org.threeten.bp.temporal.a.MINUTE_OF_DAY).longValue();
            if (jVar != j.LENIENT) {
                org.threeten.bp.temporal.a.MINUTE_OF_DAY.p(longValue7);
            }
            C(org.threeten.bp.temporal.a.HOUR_OF_DAY, longValue7 / 60);
            C(org.threeten.bp.temporal.a.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (jVar != j.LENIENT) {
            if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MILLI_OF_SECOND)) {
                org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.MILLI_OF_SECOND;
                aVar5.p(this.f11497g.get(aVar5).longValue());
            }
            if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MICRO_OF_SECOND)) {
                org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.MICRO_OF_SECOND;
                aVar6.p(this.f11497g.get(aVar6).longValue());
            }
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MILLI_OF_SECOND) && this.f11497g.containsKey(org.threeten.bp.temporal.a.MICRO_OF_SECOND)) {
            C(org.threeten.bp.temporal.a.MICRO_OF_SECOND, (this.f11497g.remove(org.threeten.bp.temporal.a.MILLI_OF_SECOND).longValue() * 1000) + (this.f11497g.get(org.threeten.bp.temporal.a.MICRO_OF_SECOND).longValue() % 1000));
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MICRO_OF_SECOND) && this.f11497g.containsKey(org.threeten.bp.temporal.a.NANO_OF_SECOND)) {
            C(org.threeten.bp.temporal.a.MICRO_OF_SECOND, this.f11497g.get(org.threeten.bp.temporal.a.NANO_OF_SECOND).longValue() / 1000);
            this.f11497g.remove(org.threeten.bp.temporal.a.MICRO_OF_SECOND);
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MILLI_OF_SECOND) && this.f11497g.containsKey(org.threeten.bp.temporal.a.NANO_OF_SECOND)) {
            C(org.threeten.bp.temporal.a.MILLI_OF_SECOND, this.f11497g.get(org.threeten.bp.temporal.a.NANO_OF_SECOND).longValue() / 1000000);
            this.f11497g.remove(org.threeten.bp.temporal.a.MILLI_OF_SECOND);
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MICRO_OF_SECOND)) {
            C(org.threeten.bp.temporal.a.NANO_OF_SECOND, this.f11497g.remove(org.threeten.bp.temporal.a.MICRO_OF_SECOND).longValue() * 1000);
        } else if (this.f11497g.containsKey(org.threeten.bp.temporal.a.MILLI_OF_SECOND)) {
            C(org.threeten.bp.temporal.a.NANO_OF_SECOND, this.f11497g.remove(org.threeten.bp.temporal.a.MILLI_OF_SECOND).longValue() * 1000000);
        }
    }

    private a V(i iVar, long j2) {
        this.f11497g.put(iVar, Long.valueOf(j2));
        return this;
    }

    private boolean X(j jVar) {
        int i2 = 0;
        loop0:
        while (i2 < 100) {
            for (Map.Entry<i, Long> key : this.f11497g.entrySet()) {
                i iVar = (i) key.getKey();
                Object l2 = iVar.l(this.f11497g, this, jVar);
                if (l2 != null) {
                    if (l2 instanceof org.threeten.bp.s.f) {
                        org.threeten.bp.s.f fVar = (org.threeten.bp.s.f) l2;
                        o oVar = this.f11499i;
                        if (oVar == null) {
                            this.f11499i = fVar.G();
                        } else if (!oVar.equals(fVar.G())) {
                            throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f11499i);
                        }
                        l2 = fVar.S();
                    }
                    if (l2 instanceof b) {
                        c0(iVar, (b) l2);
                    } else if (l2 instanceof f) {
                        b0(iVar, (f) l2);
                    } else if (l2 instanceof org.threeten.bp.s.c) {
                        org.threeten.bp.s.c cVar = (org.threeten.bp.s.c) l2;
                        c0(iVar, cVar.U());
                        b0(iVar, cVar.V());
                    } else {
                        throw new DateTimeException("Unknown type: " + l2.getClass().getName());
                    }
                } else if (!this.f11497g.containsKey(iVar)) {
                }
                i2++;
            }
        }
        if (i2 == 100) {
            throw new DateTimeException("Badly written field");
        } else if (i2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private void Y() {
        if (this.f11501k != null) {
            return;
        }
        if (!this.f11497g.containsKey(org.threeten.bp.temporal.a.INSTANT_SECONDS) && !this.f11497g.containsKey(org.threeten.bp.temporal.a.SECOND_OF_DAY) && !this.f11497g.containsKey(org.threeten.bp.temporal.a.SECOND_OF_MINUTE)) {
            return;
        }
        if (this.f11497g.containsKey(org.threeten.bp.temporal.a.NANO_OF_SECOND)) {
            long longValue = this.f11497g.get(org.threeten.bp.temporal.a.NANO_OF_SECOND).longValue();
            this.f11497g.put(org.threeten.bp.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
            this.f11497g.put(org.threeten.bp.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
            return;
        }
        this.f11497g.put(org.threeten.bp.temporal.a.NANO_OF_SECOND, 0L);
        this.f11497g.put(org.threeten.bp.temporal.a.MICRO_OF_SECOND, 0L);
        this.f11497g.put(org.threeten.bp.temporal.a.MILLI_OF_SECOND, 0L);
    }

    private void a0() {
        if (this.f11500j != null && this.f11501k != null) {
            Long l2 = this.f11497g.get(org.threeten.bp.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                this.f11497g.put(org.threeten.bp.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f11500j.D(this.f11501k).D(p.O(l2.intValue())).y(org.threeten.bp.temporal.a.INSTANT_SECONDS)));
            } else if (this.f11499i != null) {
                this.f11497g.put(org.threeten.bp.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f11500j.D(this.f11501k).D(this.f11499i).y(org.threeten.bp.temporal.a.INSTANT_SECONDS)));
            }
        }
    }

    private void b0(i iVar, f fVar) {
        long m0 = fVar.m0();
        Long put = this.f11497g.put(org.threeten.bp.temporal.a.NANO_OF_DAY, Long.valueOf(m0));
        if (put != null && put.longValue() != m0) {
            throw new DateTimeException("Conflict found: " + f.b0(put.longValue()) + " differs from " + fVar + " while resolving  " + iVar);
        }
    }

    private void c0(i iVar, b bVar) {
        if (this.f11498h.equals(bVar.G())) {
            long T = bVar.T();
            Long put = this.f11497g.put(org.threeten.bp.temporal.a.EPOCH_DAY, Long.valueOf(T));
            if (put != null && put.longValue() != T) {
                throw new DateTimeException("Conflict found: " + LocalDate.B0(put.longValue()) + " differs from " + LocalDate.B0(T) + " while resolving  " + iVar);
            }
            return;
        }
        throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f11498h);
    }

    private void d0(j jVar) {
        Long l2 = this.f11497g.get(org.threeten.bp.temporal.a.HOUR_OF_DAY);
        Long l3 = this.f11497g.get(org.threeten.bp.temporal.a.MINUTE_OF_HOUR);
        Long l4 = this.f11497g.get(org.threeten.bp.temporal.a.SECOND_OF_MINUTE);
        Long l5 = this.f11497g.get(org.threeten.bp.temporal.a.NANO_OF_SECOND);
        if (l2 != null) {
            if (l3 == null && (l4 != null || l5 != null)) {
                return;
            }
            if (l3 == null || l4 != null || l5 == null) {
                if (jVar != j.LENIENT) {
                    if (l2 != null) {
                        if (jVar == j.SMART && l2.longValue() == 24 && ((l3 == null || l3.longValue() == 0) && ((l4 == null || l4.longValue() == 0) && (l5 == null || l5.longValue() == 0)))) {
                            l2 = 0L;
                            this.f11503m = k.d(1);
                        }
                        int o = org.threeten.bp.temporal.a.HOUR_OF_DAY.o(l2.longValue());
                        if (l3 != null) {
                            int o2 = org.threeten.bp.temporal.a.MINUTE_OF_HOUR.o(l3.longValue());
                            if (l4 != null) {
                                int o3 = org.threeten.bp.temporal.a.SECOND_OF_MINUTE.o(l4.longValue());
                                if (l5 != null) {
                                    D(f.a0(o, o2, o3, org.threeten.bp.temporal.a.NANO_OF_SECOND.o(l5.longValue())));
                                } else {
                                    D(f.Y(o, o2, o3));
                                }
                            } else if (l5 == null) {
                                D(f.X(o, o2));
                            }
                        } else if (l4 == null && l5 == null) {
                            D(f.X(o, 0));
                        }
                    }
                } else if (l2 != null) {
                    long longValue = l2.longValue();
                    if (l3 == null) {
                        int p = org.threeten.bp.t.d.p(org.threeten.bp.t.d.e(longValue, 24));
                        D(f.X((int) ((long) org.threeten.bp.t.d.g(longValue, 24)), 0));
                        this.f11503m = k.d(p);
                    } else if (l4 != null) {
                        if (l5 == null) {
                            l5 = 0L;
                        }
                        long k2 = org.threeten.bp.t.d.k(org.threeten.bp.t.d.k(org.threeten.bp.t.d.k(org.threeten.bp.t.d.m(longValue, 3600000000000L), org.threeten.bp.t.d.m(l3.longValue(), 60000000000L)), org.threeten.bp.t.d.m(l4.longValue(), 1000000000)), l5.longValue());
                        D(f.b0(org.threeten.bp.t.d.h(k2, 86400000000000L)));
                        this.f11503m = k.d((int) org.threeten.bp.t.d.e(k2, 86400000000000L));
                    } else {
                        long k3 = org.threeten.bp.t.d.k(org.threeten.bp.t.d.m(longValue, 3600), org.threeten.bp.t.d.m(l3.longValue(), 60));
                        D(f.c0(org.threeten.bp.t.d.h(k3, 86400)));
                        this.f11503m = k.d((int) org.threeten.bp.t.d.e(k3, 86400));
                    }
                }
                this.f11497g.remove(org.threeten.bp.temporal.a.HOUR_OF_DAY);
                this.f11497g.remove(org.threeten.bp.temporal.a.MINUTE_OF_HOUR);
                this.f11497g.remove(org.threeten.bp.temporal.a.SECOND_OF_MINUTE);
                this.f11497g.remove(org.threeten.bp.temporal.a.NANO_OF_SECOND);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public a C(i iVar, long j2) {
        org.threeten.bp.t.d.i(iVar, "field");
        Long Q = Q(iVar);
        if (Q == null || Q.longValue() == j2) {
            V(iVar, j2);
            return this;
        }
        throw new DateTimeException("Conflict found: " + iVar + " " + Q + " differs from " + iVar + " " + j2 + ": " + this);
    }

    /* access modifiers changed from: package-private */
    public void D(f fVar) {
        this.f11501k = fVar;
    }

    /* access modifiers changed from: package-private */
    public void F(b bVar) {
        this.f11500j = bVar;
    }

    public <R> R G(org.threeten.bp.temporal.k<R> kVar) {
        return kVar.a(this);
    }

    public a W(j jVar, Set<i> set) {
        b bVar;
        if (set != null) {
            this.f11497g.keySet().retainAll(set);
        }
        S();
        R(jVar);
        U(jVar);
        if (X(jVar)) {
            S();
            R(jVar);
            U(jVar);
        }
        d0(jVar);
        M();
        k kVar = this.f11503m;
        if (!(kVar == null || kVar.c() || (bVar = this.f11500j) == null || this.f11501k == null)) {
            this.f11500j = bVar.S(this.f11503m);
            this.f11503m = k.f11618j;
        }
        Y();
        a0();
        return this;
    }

    public <R> R h(org.threeten.bp.temporal.k<R> kVar) {
        if (kVar == j.g()) {
            return this.f11499i;
        }
        if (kVar == j.a()) {
            return this.f11498h;
        }
        if (kVar == j.b()) {
            b bVar = this.f11500j;
            if (bVar != null) {
                return LocalDate.c0(bVar);
            }
            return null;
        } else if (kVar == j.c()) {
            return this.f11501k;
        } else {
            if (kVar == j.f() || kVar == j.d()) {
                return kVar.a(this);
            }
            if (kVar == j.e()) {
                return null;
            }
            return kVar.a(this);
        }
    }

    public boolean t(i iVar) {
        b bVar;
        f fVar;
        if (iVar == null) {
            return false;
        }
        if (this.f11497g.containsKey(iVar) || (((bVar = this.f11500j) != null && bVar.t(iVar)) || ((fVar = this.f11501k) != null && fVar.t(iVar)))) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.f11497g.size() > 0) {
            sb.append("fields=");
            sb.append(this.f11497g);
        }
        sb.append(", ");
        sb.append(this.f11498h);
        sb.append(", ");
        sb.append(this.f11499i);
        sb.append(", ");
        sb.append(this.f11500j);
        sb.append(", ");
        sb.append(this.f11501k);
        sb.append(']');
        return sb.toString();
    }

    public long y(i iVar) {
        org.threeten.bp.t.d.i(iVar, "field");
        Long Q = Q(iVar);
        if (Q != null) {
            return Q.longValue();
        }
        b bVar = this.f11500j;
        if (bVar != null && bVar.t(iVar)) {
            return this.f11500j.y(iVar);
        }
        f fVar = this.f11501k;
        if (fVar != null && fVar.t(iVar)) {
            return this.f11501k.y(iVar);
        }
        throw new DateTimeException("Field not found: " + iVar);
    }
}
