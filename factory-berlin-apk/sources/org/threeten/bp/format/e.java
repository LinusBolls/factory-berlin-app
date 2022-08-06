package org.threeten.bp.format;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.format.d;
import org.threeten.bp.k;
import org.threeten.bp.o;
import org.threeten.bp.s.h;
import org.threeten.bp.s.m;
import org.threeten.bp.t.c;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;

/* compiled from: DateTimeParseContext */
final class e {
    private Locale a;
    private h b;
    private h c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public o f11564d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11565e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11566f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<b> f11567g;

    /* compiled from: DateTimeParseContext */
    final class b extends c {

        /* renamed from: g  reason: collision with root package name */
        h f11568g;

        /* renamed from: h  reason: collision with root package name */
        o f11569h;

        /* renamed from: i  reason: collision with root package name */
        final Map<i, Long> f11570i;

        /* renamed from: j  reason: collision with root package name */
        boolean f11571j;

        /* renamed from: k  reason: collision with root package name */
        k f11572k;

        /* renamed from: l  reason: collision with root package name */
        List<Object[]> f11573l;

        /* access modifiers changed from: protected */
        public b C() {
            b bVar = new b();
            bVar.f11568g = this.f11568g;
            bVar.f11569h = this.f11569h;
            bVar.f11570i.putAll(this.f11570i);
            bVar.f11571j = this.f11571j;
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public a D() {
            a aVar = new a();
            aVar.f11497g.putAll(this.f11570i);
            aVar.f11498h = e.this.h();
            o oVar = this.f11569h;
            if (oVar != null) {
                aVar.f11499i = oVar;
            } else {
                aVar.f11499i = e.this.f11564d;
            }
            aVar.f11502l = this.f11571j;
            aVar.f11503m = this.f11572k;
            return aVar;
        }

        public <R> R h(org.threeten.bp.temporal.k<R> kVar) {
            if (kVar == j.a()) {
                return this.f11568g;
            }
            if (kVar == j.g() || kVar == j.f()) {
                return this.f11569h;
            }
            return super.h(kVar);
        }

        public boolean t(i iVar) {
            return this.f11570i.containsKey(iVar);
        }

        public String toString() {
            return this.f11570i.toString() + AndroidSdkMetrics.SEPARATOR + this.f11568g + AndroidSdkMetrics.SEPARATOR + this.f11569h;
        }

        public int w(i iVar) {
            if (this.f11570i.containsKey(iVar)) {
                return d.p(this.f11570i.get(iVar).longValue());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }

        public long y(i iVar) {
            if (this.f11570i.containsKey(iVar)) {
                return this.f11570i.get(iVar).longValue();
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }

        private b() {
            this.f11568g = null;
            this.f11569h = null;
            this.f11570i = new HashMap();
            this.f11572k = k.f11618j;
        }
    }

    e(c cVar) {
        this.f11565e = true;
        this.f11566f = true;
        this.f11567g = new ArrayList<>();
        this.a = cVar.f();
        this.b = cVar.e();
        this.c = cVar.d();
        this.f11564d = cVar.g();
        this.f11567g.add(new b());
    }

    static boolean d(char c2, char c3) {
        return c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    private b f() {
        ArrayList<b> arrayList = this.f11567g;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public void b(d.o oVar, long j2, int i2, int i3) {
        b f2 = f();
        if (f2.f11573l == null) {
            f2.f11573l = new ArrayList(2);
        }
        f2.f11573l.add(new Object[]{oVar, Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* access modifiers changed from: package-private */
    public boolean c(char c2, char c3) {
        if (l()) {
            return c2 == c3;
        }
        return d(c2, c3);
    }

    /* access modifiers changed from: package-private */
    public e e() {
        return new e(this);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        if (z) {
            ArrayList<b> arrayList = this.f11567g;
            arrayList.remove(arrayList.size() - 2);
            return;
        }
        ArrayList<b> arrayList2 = this.f11567g;
        arrayList2.remove(arrayList2.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public h h() {
        h hVar = f().f11568g;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = this.c;
        return hVar2 == null ? m.f11663i : hVar2;
    }

    /* access modifiers changed from: package-private */
    public Locale i() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Long j(i iVar) {
        return f().f11570i.get(iVar);
    }

    /* access modifiers changed from: package-private */
    public h k() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f11565e;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f11566f;
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z) {
        this.f11565e = z;
    }

    /* access modifiers changed from: package-private */
    public void o(o oVar) {
        org.threeten.bp.t.d.i(oVar, "zone");
        f().f11569h = oVar;
    }

    /* access modifiers changed from: package-private */
    public int p(i iVar, long j2, int i2, int i3) {
        org.threeten.bp.t.d.i(iVar, "field");
        Long put = f().f11570i.put(iVar, Long.valueOf(j2));
        return (put == null || put.longValue() == j2) ? i3 : ~i2;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        f().f11571j = true;
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z) {
        this.f11566f = z;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.f11567g.add(f().C());
    }

    /* access modifiers changed from: package-private */
    public boolean t(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4) {
        if (i2 + i4 > charSequence.length() || i3 + i4 > charSequence2.length()) {
            return false;
        }
        if (l()) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (charSequence.charAt(i2 + i5) != charSequence2.charAt(i3 + i5)) {
                    return false;
                }
            }
            return true;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            char charAt = charSequence.charAt(i2 + i6);
            char charAt2 = charSequence2.charAt(i3 + i6);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return f().toString();
    }

    /* access modifiers changed from: package-private */
    public b u() {
        return f();
    }

    e(e eVar) {
        this.f11565e = true;
        this.f11566f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f11567g = arrayList;
        this.a = eVar.a;
        this.b = eVar.b;
        this.c = eVar.c;
        this.f11564d = eVar.f11564d;
        this.f11565e = eVar.f11565e;
        this.f11566f = eVar.f11566f;
        arrayList.add(new b());
    }
}
