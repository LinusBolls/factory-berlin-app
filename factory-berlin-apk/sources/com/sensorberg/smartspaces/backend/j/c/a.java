package com.sensorberg.smartspaces.backend.j.c;

import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.n;
import l.i;

/* compiled from: CreateBookingMutation.kt */
public final class a implements j<c, c, k.c> {

    /* renamed from: g  reason: collision with root package name */
    private static final String f5766g = g.a.a.h.s.k.a("mutation CreateBooking($unitId: ID!, $uniqueRequestId: String!, $startsAt: ISO8601DateTime!, $endsAt: ISO8601DateTime!) {\n  viewerBookUnit(unitId: $unitId, uniqueRequestId: $uniqueRequestId, startsAt: $startsAt, endsAt: $endsAt) {\n    __typename\n    unit {\n      __typename\n      id\n      name\n    }\n    unitBooking {\n      __typename\n      id\n      startsAt\n      endsAt\n    }\n  }\n}");

    /* renamed from: h  reason: collision with root package name */
    private static final l f5767h = new C0224a();
    private final transient k.c b = new h(this);
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5768d;

    /* renamed from: e  reason: collision with root package name */
    private final long f5769e;

    /* renamed from: f  reason: collision with root package name */
    private final long f5770f;

    /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$a  reason: collision with other inner class name */
    /* compiled from: CreateBookingMutation.kt */
    public static final class C0224a implements l {
        C0224a() {
        }

        public String name() {
            return "CreateBooking";
        }
    }

    /* compiled from: CreateBookingMutation.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CreateBookingMutation.kt */
    public static final class c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("viewerBookUnit", "viewerBookUnit", e0.f(n.a("unitId", e0.f(n.a("kind", "Variable"), n.a("variableName", "unitId"))), n.a("uniqueRequestId", e0.f(n.a("kind", "Variable"), n.a("variableName", "uniqueRequestId"))), n.a("startsAt", e0.f(n.a("kind", "Variable"), n.a("variableName", "startsAt"))), n.a("endsAt", e0.f(n.a("kind", "Variable"), n.a("variableName", "endsAt")))), true, (List<? extends o.c>) null)};
        public static final C0225a c = new C0225a((DefaultConstructorMarker) null);
        private final f a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$c$a  reason: collision with other inner class name */
        /* compiled from: CreateBookingMutation.kt */
        public static final class C0225a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$c$a$a  reason: collision with other inner class name */
            /* compiled from: CreateBookingMutation.kt */
            static final class C0226a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0226a f5771h = new C0226a();

                C0226a() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f5778e.a(oVar);
                }
            }

            private C0225a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new c((f) oVar.d(c.b[0], C0226a.f5771h));
            }

            public /* synthetic */ C0225a(DefaultConstructorMarker defaultConstructorMarker) {
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
                o oVar = c.b[0];
                f c = this.b.c();
                pVar.c(oVar, c != null ? c.e() : null);
            }
        }

        public c(f fVar) {
            this.a = fVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public final f c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.k.a(this.a, ((c) obj).a);
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
            return "Data(viewerBookUnit=" + this.a + ")";
        }
    }

    /* compiled from: CreateBookingMutation.kt */
    public static final class d {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f5772d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final C0227a f5773e = new C0227a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$d$a  reason: collision with other inner class name */
        /* compiled from: CreateBookingMutation.kt */
        public static final class C0227a {
            private C0227a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.f5772d[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = d.f5772d[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new d(f2, (String) c, oVar.f(d.f5772d[2]));
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0227a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(d.f5772d[0], this.b.d());
                o oVar = d.f5772d[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    pVar.f(d.f5772d[2], this.b.c());
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
            return "Unit(__typename=" + this.a + ", id=" + this.b + ", name=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2, str3);
        }
    }

    /* compiled from: CreateBookingMutation.kt */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final o[] f5774e = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.b("startsAt", "startsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, true, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null)};

        /* renamed from: f  reason: collision with root package name */
        public static final C0228a f5775f = new C0228a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f5776d;

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$e$a  reason: collision with other inner class name */
        /* compiled from: CreateBookingMutation.kt */
        public static final class C0228a {
            private C0228a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.f5774e[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = e.f5774e[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String str = (String) c;
                    o oVar3 = e.f5774e[2];
                    if (oVar3 != null) {
                        Object c2 = oVar.c((o.d) oVar3);
                        kotlin.jvm.internal.k.c(c2);
                        long longValue = ((Number) c2).longValue();
                        o oVar4 = e.f5774e[3];
                        if (oVar4 != null) {
                            return new e(f2, str, longValue, (Long) oVar.c((o.d) oVar4));
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0228a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(e.f5774e[0], this.b.e());
                o oVar = e.f5774e[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.c());
                    o oVar2 = e.f5774e[2];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, Long.valueOf(this.b.d()));
                        o oVar3 = e.f5774e[3];
                        if (oVar3 != null) {
                            pVar.b((o.d) oVar3, this.b.b());
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public e(String str, String str2, long j2, Long l2) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = str2;
            this.c = j2;
            this.f5776d = l2;
        }

        public final Long b() {
            return this.f5776d;
        }

        public final String c() {
            return this.b;
        }

        public final long d() {
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
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b) && this.c == eVar.c && kotlin.jvm.internal.k.a(this.f5776d, eVar.f5776d);
        }

        public final g.a.a.h.s.n f() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + defpackage.c.a(this.c)) * 31;
            Long l2 = this.f5776d;
            if (l2 != null) {
                i2 = l2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "UnitBooking(__typename=" + this.a + ", id=" + this.b + ", startsAt=" + this.c + ", endsAt=" + this.f5776d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, String str2, long j2, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBooking" : str, str2, j2, l2);
        }
    }

    /* compiled from: CreateBookingMutation.kt */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f5777d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("unit", "unit", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("unitBooking", "unitBooking", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final C0229a f5778e = new C0229a((DefaultConstructorMarker) null);
        private final String a;
        private final d b;
        private final e c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$f$a  reason: collision with other inner class name */
        /* compiled from: CreateBookingMutation.kt */
        public static final class C0229a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$f$a$a  reason: collision with other inner class name */
            /* compiled from: CreateBookingMutation.kt */
            static final class C0230a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0230a f5779h = new C0230a();

                C0230a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return d.f5773e.a(oVar);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$f$a$b */
            /* compiled from: CreateBookingMutation.kt */
            static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final b f5780h = new b();

                b() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return e.f5775f.a(oVar);
                }
            }

            private C0229a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.f5777d[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(f.f5777d[1], C0230a.f5779h);
                kotlin.jvm.internal.k.c(d2);
                return new f(f2, (d) d2, (e) oVar.d(f.f5777d[2], b.f5780h));
            }

            public /* synthetic */ C0229a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ f b;

            public b(f fVar) {
                this.b = fVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(f.f5777d[0], this.b.d());
                pVar.c(f.f5777d[1], this.b.b().e());
                o oVar = f.f5777d[2];
                e c = this.b.c();
                pVar.c(oVar, c != null ? c.f() : null);
            }
        }

        public f(String str, d dVar, e eVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(dVar, "unit");
            this.a = str;
            this.b = dVar;
            this.c = eVar;
        }

        public final d b() {
            return this.b;
        }

        public final e c() {
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && kotlin.jvm.internal.k.a(this.b, fVar.b) && kotlin.jvm.internal.k.a(this.c, fVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            d dVar = this.b;
            int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
            e eVar = this.c;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "ViewerBookUnit(__typename=" + this.a + ", unit=" + this.b + ", unitBooking=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, d dVar, e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "ViewerBookUnitMutationPayload" : str, dVar, eVar);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class g implements m<c> {
        public c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return c.c.a(oVar);
        }
    }

    /* compiled from: CreateBookingMutation.kt */
    public static final class h extends k.c {
        final /* synthetic */ a a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.a$h$a  reason: collision with other inner class name */
        /* compiled from: InputFieldMarshaller.kt */
        public static final class C0231a implements g.a.a.h.s.f {
            final /* synthetic */ h b;

            public C0231a(h hVar) {
                this.b = hVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
                gVar.d("unitId", com.sensorberg.smartspaces.backend.j.f.a.f5937g, this.b.a.k());
                gVar.e("uniqueRequestId", this.b.a.j());
                gVar.d("startsAt", com.sensorberg.smartspaces.backend.j.f.a.f5938h, Long.valueOf(this.b.a.i()));
                gVar.d("endsAt", com.sensorberg.smartspaces.backend.j.f.a.f5938h, Long.valueOf(this.b.a.h()));
            }
        }

        h(a aVar) {
            this.a = aVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new C0231a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("unitId", this.a.k());
            linkedHashMap.put("uniqueRequestId", this.a.j());
            linkedHashMap.put("startsAt", Long.valueOf(this.a.i()));
            linkedHashMap.put("endsAt", Long.valueOf(this.a.h()));
            return linkedHashMap;
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public a(String str, String str2, long j2, long j3) {
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(str2, "uniqueRequestId");
        this.c = str;
        this.f5768d = str2;
        this.f5769e = j2;
        this.f5770f = j3;
    }

    public String b() {
        return "923213d1a0e959606864107e0a2913a4ce9cc26cda4f31d3f1a6daff71416926";
    }

    public m<c> c() {
        m.a aVar = m.a;
        return new g();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f5766g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.k.a(this.c, aVar.c) && kotlin.jvm.internal.k.a(this.f5768d, aVar.f5768d) && this.f5769e == aVar.f5769e && this.f5770f == aVar.f5770f;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        c cVar = (c) bVar;
        l(cVar);
        return cVar;
    }

    public k.c g() {
        return this.b;
    }

    public final long h() {
        return this.f5770f;
    }

    public int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5768d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((hashCode + i2) * 31) + defpackage.c.a(this.f5769e)) * 31) + defpackage.c.a(this.f5770f);
    }

    public final long i() {
        return this.f5769e;
    }

    public final String j() {
        return this.f5768d;
    }

    public final String k() {
        return this.c;
    }

    public c l(c cVar) {
        return cVar;
    }

    public l name() {
        return f5767h;
    }

    public String toString() {
        return "CreateBookingMutation(unitId=" + this.c + ", uniqueRequestId=" + this.f5768d + ", startsAt=" + this.f5769e + ", endsAt=" + this.f5770f + ")";
    }
}
