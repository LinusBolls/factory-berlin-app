package g.e.n.c.h.b;

import g.e.n.c.a;
import g.e.n.c.i.c;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: ScheduleParams.kt */
public final class e {
    private final String a;
    private final c b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private final a f10073d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10074e;

    /* renamed from: f  reason: collision with root package name */
    private final List<g.e.n.c.e.c> f10075f;

    public e(String str, c cVar, c cVar2, a aVar, String str2, List<? extends g.e.n.c.e.c> list) {
        k.e(str, "unitId");
        k.e(cVar, "from");
        k.e(cVar2, "to");
        k.e(list, "bookingStates");
        this.a = str;
        this.b = cVar;
        this.c = cVar2;
        this.f10073d = aVar;
        this.f10074e = str2;
        this.f10075f = list;
    }

    public final List<g.e.n.c.e.c> a() {
        return this.f10075f;
    }

    public final c b() {
        return this.b;
    }

    public final a c() {
        return this.f10073d;
    }

    public final c d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.a, eVar.a) && k.a(this.b, eVar.b) && k.a(this.c, eVar.c) && k.a(this.f10073d, eVar.f10073d) && k.a(this.f10074e, eVar.f10074e) && k.a(this.f10075f, eVar.f10075f);
    }

    public final String f() {
        return this.f10074e;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        c cVar2 = this.c;
        int hashCode3 = (hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        a aVar = this.f10073d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str2 = this.f10074e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<g.e.n.c.e.c> list = this.f10075f;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        return "ScheduleParams(unitId=" + this.a + ", from=" + this.b + ", to=" + this.c + ", pageConfig=" + this.f10073d + ", userId=" + this.f10074e + ", bookingStates=" + this.f10075f + ")";
    }
}
