package com.sensorberg.smartspaces.backend.j.e;

import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.m;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.o;
import g.a.a.h.s.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.x;
import l.i;

/* compiled from: GetBookingParameterQuery.kt */
public final class a implements m<d, d, k.c> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f5890d = g.a.a.h.s.k.a("query GetBookingParameter($unitId: ID!) {\n  units(ids: [$unitId]) {\n    __typename\n    nodes {\n      __typename\n      bookableSetting {\n        __typename\n        durationMinimumInMinutes\n        durationMaximumInMinutes\n        maximumStartsAtOffsetInMinutes\n        requiresEndsAt\n        requiresActuator\n      }\n    }\n  }\n}");

    /* renamed from: e  reason: collision with root package name */
    private static final l f5891e = new b();
    private final transient k.c b = new h(this);
    private final String c;

    /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$a  reason: collision with other inner class name */
    /* compiled from: GetBookingParameterQuery.kt */
    public static final class C0293a {
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final o[] f5892g = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.e("durationMinimumInMinutes", "durationMinimumInMinutes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.e("durationMaximumInMinutes", "durationMaximumInMinutes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.e("maximumStartsAtOffsetInMinutes", "maximumStartsAtOffsetInMinutes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.a("requiresEndsAt", "requiresEndsAt", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.a("requiresActuator", "requiresActuator", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: h  reason: collision with root package name */
        public static final C0294a f5893h = new C0294a((DefaultConstructorMarker) null);
        private final String a;
        private final Integer b;
        private final Integer c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f5894d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f5895e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f5896f;

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$a$a  reason: collision with other inner class name */
        /* compiled from: GetBookingParameterQuery.kt */
        public static final class C0294a {
            private C0294a() {
            }

            public final C0293a a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(C0293a.f5892g[0]);
                kotlin.jvm.internal.k.c(f2);
                return new C0293a(f2, oVar.e(C0293a.f5892g[1]), oVar.e(C0293a.f5892g[2]), oVar.e(C0293a.f5892g[3]), oVar.j(C0293a.f5892g[4]), oVar.j(C0293a.f5892g[5]));
            }

            public /* synthetic */ C0294a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$a$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ C0293a b;

            public b(C0293a aVar) {
                this.b = aVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(C0293a.f5892g[0], this.b.g());
                pVar.a(C0293a.f5892g[1], this.b.c());
                pVar.a(C0293a.f5892g[2], this.b.b());
                pVar.a(C0293a.f5892g[3], this.b.d());
                pVar.e(C0293a.f5892g[4], this.b.f());
                pVar.e(C0293a.f5892g[5], this.b.e());
            }
        }

        public C0293a(String str, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = num;
            this.c = num2;
            this.f5894d = num3;
            this.f5895e = bool;
            this.f5896f = bool2;
        }

        public final Integer b() {
            return this.c;
        }

        public final Integer c() {
            return this.b;
        }

        public final Integer d() {
            return this.f5894d;
        }

        public final Boolean e() {
            return this.f5896f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0293a)) {
                return false;
            }
            C0293a aVar = (C0293a) obj;
            return kotlin.jvm.internal.k.a(this.a, aVar.a) && kotlin.jvm.internal.k.a(this.b, aVar.b) && kotlin.jvm.internal.k.a(this.c, aVar.c) && kotlin.jvm.internal.k.a(this.f5894d, aVar.f5894d) && kotlin.jvm.internal.k.a(this.f5895e, aVar.f5895e) && kotlin.jvm.internal.k.a(this.f5896f, aVar.f5896f);
        }

        public final Boolean f() {
            return this.f5895e;
        }

        public final String g() {
            return this.a;
        }

        public final n h() {
            n.a aVar = n.a;
            return new b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.c;
            int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f5894d;
            int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool = this.f5895e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.f5896f;
            if (bool2 != null) {
                i2 = bool2.hashCode();
            }
            return hashCode5 + i2;
        }

        public String toString() {
            return "BookableSetting(__typename=" + this.a + ", durationMinimumInMinutes=" + this.b + ", durationMaximumInMinutes=" + this.c + ", maximumStartsAtOffsetInMinutes=" + this.f5894d + ", requiresEndsAt=" + this.f5895e + ", requiresActuator=" + this.f5896f + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0293a(String str, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "BookableSetting" : str, num, num2, num3, bool, bool2);
        }
    }

    /* compiled from: GetBookingParameterQuery.kt */
    public static final class b implements l {
        b() {
        }

        public String name() {
            return "GetBookingParameter";
        }
    }

    /* compiled from: GetBookingParameterQuery.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetBookingParameterQuery.kt */
    public static final class d implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("units", "units", d0.b(kotlin.n.a("ids", "[{kind=Variable, variableName=unitId}]")), false, (List<? extends o.c>) null)};
        public static final C0295a c = new C0295a((DefaultConstructorMarker) null);
        private final f a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$d$a  reason: collision with other inner class name */
        /* compiled from: GetBookingParameterQuery.kt */
        public static final class C0295a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$d$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingParameterQuery.kt */
            static final class C0296a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0296a f5897h = new C0296a();

                C0296a() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f5900d.a(oVar);
                }
            }

            private C0295a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                Object d2 = oVar.d(d.b[0], C0296a.f5897h);
                kotlin.jvm.internal.k.c(d2);
                return new d((f) d2);
            }

            public /* synthetic */ C0295a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ d b;

            public b(d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.c(d.b[0], this.b.c().d());
            }
        }

        public d(f fVar) {
            kotlin.jvm.internal.k.e(fVar, "units");
            this.a = fVar;
        }

        public n a() {
            n.a aVar = n.a;
            return new b(this);
        }

        public final f c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.k.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(units=" + this.a + ")";
        }
    }

    /* compiled from: GetBookingParameterQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("bookableSetting", "bookableSetting", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0297a f5898d = new C0297a((DefaultConstructorMarker) null);
        private final String a;
        private final C0293a b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$e$a  reason: collision with other inner class name */
        /* compiled from: GetBookingParameterQuery.kt */
        public static final class C0297a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$e$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingParameterQuery.kt */
            static final class C0298a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, C0293a> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0298a f5899h = new C0298a();

                C0298a() {
                    super(1);
                }

                /* renamed from: a */
                public final C0293a o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return C0293a.f5893h.a(oVar);
                }
            }

            private C0297a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new e(f2, (C0293a) oVar.d(e.c[1], C0298a.f5899h));
            }

            public /* synthetic */ C0297a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ e b;

            public b(e eVar) {
                this.b = eVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(e.c[0], this.b.c());
                o oVar = e.c[1];
                C0293a b2 = this.b.b();
                pVar.c(oVar, b2 != null ? b2.h() : null);
            }
        }

        public e(String str, C0293a aVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = aVar;
        }

        public final C0293a b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final n d() {
            n.a aVar = n.a;
            return new b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C0293a aVar = this.b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", bookableSetting=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, C0293a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, aVar);
        }
    }

    /* compiled from: GetBookingParameterQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0299a f5900d = new C0299a((DefaultConstructorMarker) null);
        private final String a;
        private final List<e> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$f$a  reason: collision with other inner class name */
        /* compiled from: GetBookingParameterQuery.kt */
        public static final class C0299a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$f$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingParameterQuery.kt */
            static final class C0300a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0300a f5901h = new C0300a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$f$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetBookingParameterQuery.kt */
                static final class C0301a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0301a f5902h = new C0301a();

                    C0301a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final e o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return e.f5898d.a(oVar);
                    }
                }

                C0300a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (e) bVar.b(C0301a.f5902h);
                }
            }

            private C0299a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new f(f2, oVar.g(f.c[1], C0300a.f5901h));
            }

            public /* synthetic */ C0299a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ f b;

            public b(f fVar) {
                this.b = fVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(f.c[0], this.b.c());
                pVar.d(f.c[1], this.b.b(), c.f5903h);
            }
        }

        /* compiled from: GetBookingParameterQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends e>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5903h = new c();

            c() {
                super(2);
            }

            public final void a(List<e> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (e eVar : list) {
                        bVar.a(eVar != null ? eVar.d() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public f(String str, List<e> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<e> b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final n d() {
            n.a aVar = n.a;
            return new b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && kotlin.jvm.internal.k.a(this.b, fVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<e> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Units(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitConnection" : str, list);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class g implements g.a.a.h.s.m<d> {
        public d a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return d.c.a(oVar);
        }
    }

    /* compiled from: GetBookingParameterQuery.kt */
    public static final class h extends k.c {
        final /* synthetic */ a a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.a$h$a  reason: collision with other inner class name */
        /* compiled from: InputFieldMarshaller.kt */
        public static final class C0302a implements g.a.a.h.s.f {
            final /* synthetic */ h b;

            public C0302a(h hVar) {
                this.b = hVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
                gVar.d("unitId", com.sensorberg.smartspaces.backend.j.f.a.f5937g, this.b.a.h());
            }
        }

        h(a aVar) {
            this.a = aVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new C0302a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("unitId", this.a.h());
            return linkedHashMap;
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    public a(String str) {
        kotlin.jvm.internal.k.e(str, "unitId");
        this.c = str;
    }

    public i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "7acd518d44c6d2e3a65d4c2b02c6df4d0561dfc755c70ce50f5a7bf9ebf921d5";
    }

    public g.a.a.h.s.m<d> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new g();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f5890d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && kotlin.jvm.internal.k.a(this.c, ((a) obj).c);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        d dVar = (d) bVar;
        i(dVar);
        return dVar;
    }

    public k.c g() {
        return this.b;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public d i(d dVar) {
        return dVar;
    }

    public l name() {
        return f5891e;
    }

    public String toString() {
        return "GetBookingParameterQuery(unitId=" + this.c + ")";
    }
}
