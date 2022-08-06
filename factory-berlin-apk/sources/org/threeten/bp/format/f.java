package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.o;
import org.threeten.bp.p;
import org.threeten.bp.s.b;
import org.threeten.bp.s.h;
import org.threeten.bp.t.c;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.m;

/* compiled from: DateTimePrintContext */
final class f {
    private e a;
    private Locale b;
    private h c;

    /* renamed from: d  reason: collision with root package name */
    private int f11575d;

    /* compiled from: DateTimePrintContext */
    class a extends c {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f11576g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f11577h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f11578i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ o f11579j;

        a(b bVar, e eVar, h hVar, o oVar) {
            this.f11576g = bVar;
            this.f11577h = eVar;
            this.f11578i = hVar;
            this.f11579j = oVar;
        }

        public m f(i iVar) {
            if (this.f11576g == null || !iVar.a()) {
                return this.f11577h.f(iVar);
            }
            return this.f11576g.f(iVar);
        }

        public <R> R h(k<R> kVar) {
            if (kVar == j.a()) {
                return this.f11578i;
            }
            if (kVar == j.g()) {
                return this.f11579j;
            }
            if (kVar == j.e()) {
                return this.f11577h.h(kVar);
            }
            return kVar.a(this);
        }

        public boolean t(i iVar) {
            if (this.f11576g == null || !iVar.a()) {
                return this.f11577h.t(iVar);
            }
            return this.f11576g.t(iVar);
        }

        public long y(i iVar) {
            if (this.f11576g == null || !iVar.a()) {
                return this.f11577h.y(iVar);
            }
            return this.f11576g.y(iVar);
        }
    }

    f(e eVar, c cVar) {
        this.a = a(eVar, cVar);
        this.b = cVar.f();
        this.c = cVar.e();
    }

    private static e a(e eVar, c cVar) {
        h d2 = cVar.d();
        o g2 = cVar.g();
        if (d2 == null && g2 == null) {
            return eVar;
        }
        h hVar = (h) eVar.h(j.a());
        o oVar = (o) eVar.h(j.g());
        b bVar = null;
        if (d.c(hVar, d2)) {
            d2 = null;
        }
        if (d.c(oVar, g2)) {
            g2 = null;
        }
        if (d2 == null && g2 == null) {
            return eVar;
        }
        h hVar2 = d2 != null ? d2 : hVar;
        if (g2 != null) {
            oVar = g2;
        }
        if (g2 != null) {
            if (eVar.t(org.threeten.bp.temporal.a.INSTANT_SECONDS)) {
                if (hVar2 == null) {
                    hVar2 = org.threeten.bp.s.m.f11663i;
                }
                return hVar2.A(org.threeten.bp.d.G(eVar), g2);
            }
            o l2 = g2.l();
            p pVar = (p) eVar.h(j.d());
            if ((l2 instanceof p) && pVar != null && !l2.equals(pVar)) {
                throw new DateTimeException("Invalid override zone for temporal: " + g2 + " " + eVar);
            }
        }
        if (d2 != null) {
            if (eVar.t(org.threeten.bp.temporal.a.EPOCH_DAY)) {
                bVar = hVar2.h(eVar);
            } else if (!(d2 == org.threeten.bp.s.m.f11663i && hVar == null)) {
                org.threeten.bp.temporal.a[] values = org.threeten.bp.temporal.a.values();
                int length = values.length;
                int i2 = 0;
                while (i2 < length) {
                    org.threeten.bp.temporal.a aVar = values[i2];
                    if (!aVar.a() || !eVar.t(aVar)) {
                        i2++;
                    } else {
                        throw new DateTimeException("Invalid override chronology for temporal: " + d2 + " " + eVar);
                    }
                }
            }
        }
        return new a(bVar, eVar, hVar2, oVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f11575d--;
    }

    /* access modifiers changed from: package-private */
    public Locale c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public h d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public e e() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Long f(i iVar) {
        try {
            return Long.valueOf(this.a.y(iVar));
        } catch (DateTimeException e2) {
            if (this.f11575d > 0) {
                return null;
            }
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public <R> R g(k<R> kVar) {
        R h2 = this.a.h(kVar);
        if (h2 != null || this.f11575d != 0) {
            return h2;
        }
        throw new DateTimeException("Unable to extract value: " + this.a.getClass());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f11575d++;
    }

    public String toString() {
        return this.a.toString();
    }
}
