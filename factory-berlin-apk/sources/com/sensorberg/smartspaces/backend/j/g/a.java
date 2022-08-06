package com.sensorberg.smartspaces.backend.j.g;

import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.m;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.h;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.o;
import g.a.a.h.s.p;
import java.util.List;
import java.util.Map;
import kotlin.n;
import kotlin.x;
import l.i;

/* compiled from: GetRootUnitsQuery.kt */
public final class a implements m<c, c, k.c> {
    private static final String b = g.a.a.h.s.k.a("query GetRootUnits {\n  units(roots: true) {\n    __typename\n    nodes {\n      __typename\n      id\n      name\n    }\n  }\n}");
    private static final l c = new C0321a();

    /* renamed from: com.sensorberg.smartspaces.backend.j.g.a$a  reason: collision with other inner class name */
    /* compiled from: GetRootUnitsQuery.kt */
    public static final class C0321a implements l {
        C0321a() {
        }

        public String name() {
            return "GetRootUnits";
        }
    }

    /* compiled from: GetRootUnitsQuery.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetRootUnitsQuery.kt */
    public static final class c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("units", "units", d0.b(n.a("roots", "true")), false, (List<? extends o.c>) null)};
        public static final C0322a c = new C0322a((DefaultConstructorMarker) null);
        private final e a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.g.a$c$a  reason: collision with other inner class name */
        /* compiled from: GetRootUnitsQuery.kt */
        public static final class C0322a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.g.a$c$a$a  reason: collision with other inner class name */
            /* compiled from: GetRootUnitsQuery.kt */
            static final class C0323a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0323a f5947h = new C0323a();

                C0323a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return e.f5950d.a(oVar);
                }
            }

            private C0322a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                Object d2 = oVar.d(c.b[0], C0323a.f5947h);
                kotlin.jvm.internal.k.c(d2);
                return new c((e) d2);
            }

            public /* synthetic */ C0322a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ c b;

            public b(c cVar) {
                this.b = cVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.c(c.b[0], this.b.c().d());
            }
        }

        public c(e eVar) {
            kotlin.jvm.internal.k.e(eVar, "units");
            this.a = eVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public final e c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.k.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar != null) {
                return eVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(units=" + this.a + ")";
        }
    }

    /* compiled from: GetRootUnitsQuery.kt */
    public static final class d {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f5948d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final C0324a f5949e = new C0324a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.g.a$d$a  reason: collision with other inner class name */
        /* compiled from: GetRootUnitsQuery.kt */
        public static final class C0324a {
            private C0324a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.f5948d[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = d.f5948d[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new d(f2, (String) c, oVar.f(d.f5948d[2]));
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0324a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ d b;

            public b(d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(d.f5948d[0], this.b.d());
                o oVar = d.f5948d[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    pVar.f(d.f5948d[2], this.b.c());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public d(String str, String str2, String str3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public final g.a.a.h.s.n e() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b) && kotlin.jvm.internal.k.a(this.c, dVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", id=" + this.b + ", name=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2, str3);
        }
    }

    /* compiled from: GetRootUnitsQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0325a f5950d = new C0325a((DefaultConstructorMarker) null);
        private final String a;
        private final List<d> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.g.a$e$a  reason: collision with other inner class name */
        /* compiled from: GetRootUnitsQuery.kt */
        public static final class C0325a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.g.a$e$a$a  reason: collision with other inner class name */
            /* compiled from: GetRootUnitsQuery.kt */
            static final class C0326a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0326a f5951h = new C0326a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.g.a$e$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetRootUnitsQuery.kt */
                static final class C0327a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0327a f5952h = new C0327a();

                    C0327a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final d o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return d.f5949e.a(oVar);
                    }
                }

                C0326a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (d) bVar.b(C0327a.f5952h);
                }
            }

            private C0325a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new e(f2, oVar.g(e.c[1], C0326a.f5951h));
            }

            public /* synthetic */ C0325a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ e b;

            public b(e eVar) {
                this.b = eVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(e.c[0], this.b.c());
                pVar.d(e.c[1], this.b.b(), c.f5953h);
            }
        }

        /* compiled from: GetRootUnitsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends d>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5953h = new c();

            c() {
                super(2);
            }

            public final void a(List<d> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (d dVar : list) {
                        bVar.a(dVar != null ? dVar.e() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public e(String str, List<d> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<d> b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final g.a.a.h.s.n d() {
            n.a aVar = g.a.a.h.s.n.a;
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
            List<d> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Units(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitConnection" : str, list);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class f implements g.a.a.h.s.m<c> {
        public c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return c.c.a(oVar);
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return h.a(this, z, z2, qVar);
    }

    public String b() {
        return "794e1e1d00ad8783fb52273f887f070c25a94cc931d4d58f7104748606a6efc9";
    }

    public g.a.a.h.s.m<c> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new f();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return h.a(this, false, true, qVar);
    }

    public String e() {
        return b;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        c cVar = (c) bVar;
        h(cVar);
        return cVar;
    }

    public k.c g() {
        return k.a;
    }

    public c h(c cVar) {
        return cVar;
    }

    public l name() {
        return c;
    }
}
