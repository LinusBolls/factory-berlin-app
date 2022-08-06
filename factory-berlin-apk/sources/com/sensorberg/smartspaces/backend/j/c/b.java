package com.sensorberg.smartspaces.backend.j.c;

import g.a.a.h.k;
import g.a.a.h.m;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.g;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.o;
import g.a.a.h.s.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.n;
import kotlin.x;

/* compiled from: GetBookableUnitsQuery.kt */
public final class b implements m<c, c, k.c> {

    /* renamed from: j  reason: collision with root package name */
    private static final String f5781j = g.a.a.h.s.k.a("query GetBookableUnits($firstItemsPerPage: Int, $lastItemsPerPage: Int, $afterCursor: String, $beforeCursor: String, $endsAfter: ISO8601DateTime!, $states: [UnitBookingStateEnum!]!, $parentUnitIds: [ID!]) {\n  units(bookables: true, first:$firstItemsPerPage, last:$lastItemsPerPage, after: $afterCursor, before: $beforeCursor, parentUnitIds: $parentUnitIds) {\n    __typename\n    pageInfo {\n      __typename\n      hasNextPage\n      hasPreviousPage\n      startCursor\n      endCursor\n    }\n    nodes {\n      __typename\n      id\n      name\n      unitType {\n        __typename\n        externalIdentifier\n      }\n      unitBookings(onActuator: false, endsAfter: $endsAfter, states: $states) {\n        __typename\n        nodes {\n          __typename\n          id\n          startsAt\n          endsAt\n          user {\n            __typename\n            id\n          }\n        }\n      }\n    }\n  }\n}");

    /* renamed from: k  reason: collision with root package name */
    private static final g.a.a.h.l f5782k = new a();
    private final transient k.c b;
    private final g.a.a.h.h<Integer> c;

    /* renamed from: d  reason: collision with root package name */
    private final g.a.a.h.h<Integer> f5783d;

    /* renamed from: e  reason: collision with root package name */
    private final g.a.a.h.h<String> f5784e;

    /* renamed from: f  reason: collision with root package name */
    private final g.a.a.h.h<String> f5785f;

    /* renamed from: g  reason: collision with root package name */
    private final long f5786g;

    /* renamed from: h  reason: collision with root package name */
    private final List<com.sensorberg.smartspaces.backend.j.f.c> f5787h;

    /* renamed from: i  reason: collision with root package name */
    private final g.a.a.h.h<List<String>> f5788i;

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class a implements g.a.a.h.l {
        a() {
        }

        public String name() {
            return "GetBookableUnits";
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$b  reason: collision with other inner class name */
    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class C0232b {
        private C0232b() {
        }

        public /* synthetic */ C0232b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("units", "units", e0.f(n.a("bookables", "true"), n.a("first", e0.f(n.a("kind", "Variable"), n.a("variableName", "firstItemsPerPage"))), n.a("last", e0.f(n.a("kind", "Variable"), n.a("variableName", "lastItemsPerPage"))), n.a("after", e0.f(n.a("kind", "Variable"), n.a("variableName", "afterCursor"))), n.a("before", e0.f(n.a("kind", "Variable"), n.a("variableName", "beforeCursor"))), n.a("parentUnitIds", e0.f(n.a("kind", "Variable"), n.a("variableName", "parentUnitIds")))), false, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final i a;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$c$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0233a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, i> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0233a f5789h = new C0233a();

                C0233a() {
                    super(1);
                }

                /* renamed from: a */
                public final i o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return i.f5811e.a(oVar);
                }
            }

            private a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                Object d2 = oVar.d(c.b[0], C0233a.f5789h);
                kotlin.jvm.internal.k.c(d2);
                return new c((i) d2);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$c$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0234b implements g.a.a.h.s.n {
            final /* synthetic */ c b;

            public C0234b(c cVar) {
                this.b = cVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.c(c.b[0], this.b.c().e());
            }
        }

        public c(i iVar) {
            kotlin.jvm.internal.k.e(iVar, "units");
            this.a = iVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0234b(this);
        }

        public final i c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.k.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            i iVar = this.a;
            if (iVar != null) {
                return iVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(units=" + this.a + ")";
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class d {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f5790f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.g("unitType", "unitType", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("unitBookings", "unitBookings", e0.f(kotlin.n.a("onActuator", "false"), kotlin.n.a("endsAfter", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "endsAfter"))), kotlin.n.a("states", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "states")))), true, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final a f5791g = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final h f5792d;

        /* renamed from: e  reason: collision with root package name */
        private final g f5793e;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$d$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0235a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, g> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0235a f5794h = new C0235a();

                C0235a() {
                    super(1);
                }

                /* renamed from: a */
                public final g o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return g.f5805d.a(oVar);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$d$a$b  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0236b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, h> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0236b f5795h = new C0236b();

                C0236b() {
                    super(1);
                }

                /* renamed from: a */
                public final h o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return h.f5809d.a(oVar);
                }
            }

            private a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.f5790f[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = d.f5790f[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String f3 = oVar.f(d.f5790f[2]);
                    Object d2 = oVar.d(d.f5790f[3], C0236b.f5795h);
                    kotlin.jvm.internal.k.c(d2);
                    return new d(f2, (String) c, f3, (h) d2, (g) oVar.d(d.f5790f[4], C0235a.f5794h));
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$d$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0237b implements g.a.a.h.s.n {
            final /* synthetic */ d b;

            public C0237b(d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(d.f5790f[0], this.b.f());
                o oVar = d.f5790f[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    pVar.f(d.f5790f[2], this.b.c());
                    pVar.c(d.f5790f[3], this.b.e().d());
                    o oVar2 = d.f5790f[4];
                    g d2 = this.b.d();
                    pVar.c(oVar2, d2 != null ? d2.d() : null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public d(String str, String str2, String str3, h hVar, g gVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            kotlin.jvm.internal.k.e(hVar, "unitType");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f5792d = hVar;
            this.f5793e = gVar;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final g d() {
            return this.f5793e;
        }

        public final h e() {
            return this.f5792d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b) && kotlin.jvm.internal.k.a(this.c, dVar.c) && kotlin.jvm.internal.k.a(this.f5792d, dVar.f5792d) && kotlin.jvm.internal.k.a(this.f5793e, dVar.f5793e);
        }

        public final String f() {
            return this.a;
        }

        public final g.a.a.h.s.n g() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0237b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            h hVar = this.f5792d;
            int hashCode4 = (hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31;
            g gVar = this.f5793e;
            if (gVar != null) {
                i2 = gVar.hashCode();
            }
            return hashCode4 + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", id=" + this.b + ", name=" + this.c + ", unitType=" + this.f5792d + ", unitBookings=" + this.f5793e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, String str2, String str3, h hVar, g gVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2, str3, hVar, gVar);
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f5796f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.b("startsAt", "startsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, true, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), o.f9055g.g("user", "user", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final a f5797g = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f5798d;

        /* renamed from: e  reason: collision with root package name */
        private final j f5799e;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$e$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0238a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, j> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0238a f5800h = new C0238a();

                C0238a() {
                    super(1);
                }

                /* renamed from: a */
                public final j o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return j.f5816d.a(oVar);
                }
            }

            private a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.f5796f[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = e.f5796f[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String str = (String) c;
                    o oVar3 = e.f5796f[2];
                    if (oVar3 != null) {
                        Object c2 = oVar.c((o.d) oVar3);
                        kotlin.jvm.internal.k.c(c2);
                        long longValue = ((Number) c2).longValue();
                        o oVar4 = e.f5796f[3];
                        if (oVar4 != null) {
                            return new e(f2, str, longValue, (Long) oVar.c((o.d) oVar4), (j) oVar.d(e.f5796f[4], C0238a.f5800h));
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$e$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0239b implements g.a.a.h.s.n {
            final /* synthetic */ e b;

            public C0239b(e eVar) {
                this.b = eVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(e.f5796f[0], this.b.f());
                o oVar = e.f5796f[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.c());
                    o oVar2 = e.f5796f[2];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, Long.valueOf(this.b.d()));
                        o oVar3 = e.f5796f[3];
                        if (oVar3 != null) {
                            pVar.b((o.d) oVar3, this.b.b());
                            o oVar4 = e.f5796f[4];
                            j e2 = this.b.e();
                            pVar.c(oVar4, e2 != null ? e2.d() : null);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public e(String str, String str2, long j2, Long l2, j jVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = str2;
            this.c = j2;
            this.f5798d = l2;
            this.f5799e = jVar;
        }

        public final Long b() {
            return this.f5798d;
        }

        public final String c() {
            return this.b;
        }

        public final long d() {
            return this.c;
        }

        public final j e() {
            return this.f5799e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b) && this.c == eVar.c && kotlin.jvm.internal.k.a(this.f5798d, eVar.f5798d) && kotlin.jvm.internal.k.a(this.f5799e, eVar.f5799e);
        }

        public final String f() {
            return this.a;
        }

        public final g.a.a.h.s.n g() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0239b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + defpackage.c.a(this.c)) * 31;
            Long l2 = this.f5798d;
            int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
            j jVar = this.f5799e;
            if (jVar != null) {
                i2 = jVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", id=" + this.b + ", startsAt=" + this.c + ", endsAt=" + this.f5798d + ", user=" + this.f5799e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, String str2, long j2, Long l2, j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBooking" : str, str2, j2, l2, jVar);
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f5801f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.a("hasNextPage", "hasNextPage", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.a("hasPreviousPage", "hasPreviousPage", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.h("startCursor", "startCursor", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.h("endCursor", "endCursor", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final a f5802g = new a((DefaultConstructorMarker) null);
        private final String a;
        private final boolean b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5803d;

        /* renamed from: e  reason: collision with root package name */
        private final String f5804e;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {
            private a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.f5801f[0]);
                kotlin.jvm.internal.k.c(f2);
                Boolean j2 = oVar.j(f.f5801f[1]);
                kotlin.jvm.internal.k.c(j2);
                boolean booleanValue = j2.booleanValue();
                Boolean j3 = oVar.j(f.f5801f[2]);
                kotlin.jvm.internal.k.c(j3);
                return new f(f2, booleanValue, j3.booleanValue(), oVar.f(f.f5801f[3]), oVar.f(f.f5801f[4]));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$f$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0240b implements g.a.a.h.s.n {
            final /* synthetic */ f b;

            public C0240b(f fVar) {
                this.b = fVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(f.f5801f[0], this.b.f());
                pVar.e(f.f5801f[1], Boolean.valueOf(this.b.c()));
                pVar.e(f.f5801f[2], Boolean.valueOf(this.b.d()));
                pVar.f(f.f5801f[3], this.b.e());
                pVar.f(f.f5801f[4], this.b.b());
            }
        }

        public f(String str, boolean z, boolean z2, String str2, String str3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = z;
            this.c = z2;
            this.f5803d = str2;
            this.f5804e = str3;
        }

        public final String b() {
            return this.f5804e;
        }

        public final boolean c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final String e() {
            return this.f5803d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && kotlin.jvm.internal.k.a(this.f5803d, fVar.f5803d) && kotlin.jvm.internal.k.a(this.f5804e, fVar.f5804e);
        }

        public final String f() {
            return this.a;
        }

        public final g.a.a.h.s.n g() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0240b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.c;
            if (!z3) {
                z2 = z3;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            String str2 = this.f5803d;
            int hashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f5804e;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "PageInfo(__typename=" + this.a + ", hasNextPage=" + this.b + ", hasPreviousPage=" + this.c + ", startCursor=" + this.f5803d + ", endCursor=" + this.f5804e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, boolean z, boolean z2, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "PageInfo" : str, z, z2, str2, str3);
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class g {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5805d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final List<e> b;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$g$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0241a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0241a f5806h = new C0241a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$g$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetBookableUnitsQuery.kt */
                static final class C0242a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0242a f5807h = new C0242a();

                    C0242a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final e o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return e.f5797g.a(oVar);
                    }
                }

                C0241a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (e) bVar.b(C0242a.f5807h);
                }
            }

            private a() {
            }

            public final g a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(g.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new g(f2, oVar.g(g.c[1], C0241a.f5806h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$g$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0243b implements g.a.a.h.s.n {
            final /* synthetic */ g b;

            public C0243b(g gVar) {
                this.b = gVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(g.c[0], this.b.c());
                pVar.d(g.c[1], this.b.b(), c.f5808h);
            }
        }

        /* compiled from: GetBookableUnitsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends e>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5808h = new c();

            c() {
                super(2);
            }

            public final void a(List<e> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (e eVar : list) {
                        bVar.a(eVar != null ? eVar.g() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public g(String str, List<e> list) {
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

        public final g.a.a.h.s.n d() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0243b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.k.a(this.a, gVar.a) && kotlin.jvm.internal.k.a(this.b, gVar.b);
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
            return "UnitBookings(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBookingConnection" : str, list);
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class h {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("externalIdentifier", "externalIdentifier", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5809d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {
            private a() {
            }

            public final h a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(h.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new h(f2, oVar.f(h.c[1]));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$h$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0244b implements g.a.a.h.s.n {
            final /* synthetic */ h b;

            public C0244b(h hVar) {
                this.b = hVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(h.c[0], this.b.c());
                pVar.f(h.c[1], this.b.b());
            }
        }

        public h(String str, String str2) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = str2;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final g.a.a.h.s.n d() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0244b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.k.a(this.a, hVar.a) && kotlin.jvm.internal.k.a(this.b, hVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "UnitType(__typename=" + this.a + ", externalIdentifier=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitKind" : str, str2);
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class i {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final g.a.a.h.o[] f5810d = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("pageInfo", "pageInfo", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final a f5811e = new a((DefaultConstructorMarker) null);
        private final String a;
        private final f b;
        private final List<d> c;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$i$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0245a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0245a f5812h = new C0245a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$i$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetBookableUnitsQuery.kt */
                static final class C0246a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0246a f5813h = new C0246a();

                    C0246a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final d o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return d.f5791g.a(oVar);
                    }
                }

                C0245a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (d) bVar.b(C0246a.f5813h);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$i$a$b  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0247b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0247b f5814h = new C0247b();

                C0247b() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f5802g.a(oVar);
                }
            }

            private a() {
            }

            public final i a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(i.f5810d[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(i.f5810d[1], C0247b.f5814h);
                kotlin.jvm.internal.k.c(d2);
                return new i(f2, (f) d2, oVar.g(i.f5810d[2], C0245a.f5812h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$i$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0248b implements g.a.a.h.s.n {
            final /* synthetic */ i b;

            public C0248b(i iVar) {
                this.b = iVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(i.f5810d[0], this.b.d());
                pVar.c(i.f5810d[1], this.b.c().g());
                pVar.d(i.f5810d[2], this.b.b(), c.f5815h);
            }
        }

        /* compiled from: GetBookableUnitsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends d>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5815h = new c();

            c() {
                super(2);
            }

            public final void a(List<d> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (d dVar : list) {
                        bVar.a(dVar != null ? dVar.g() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public i(String str, f fVar, List<d> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(fVar, "pageInfo");
            this.a = str;
            this.b = fVar;
            this.c = list;
        }

        public final List<d> b() {
            return this.c;
        }

        public final f c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public final g.a.a.h.s.n e() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0248b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.k.a(this.a, iVar.a) && kotlin.jvm.internal.k.a(this.b, iVar.b) && kotlin.jvm.internal.k.a(this.c, iVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            f fVar = this.b;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            List<d> list = this.c;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "Units(__typename=" + this.a + ", pageInfo=" + this.b + ", nodes=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ i(String str, f fVar, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitConnection" : str, fVar, list);
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class j {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5816d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: GetBookableUnitsQuery.kt */
        public static final class a {
            private a() {
            }

            public final j a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(j.c[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = j.c[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new j(f2, (String) c);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$j$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0249b implements g.a.a.h.s.n {
            final /* synthetic */ j b;

            public C0249b(j jVar) {
                this.b = jVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(j.c[0], this.b.c());
                g.a.a.h.o oVar = j.c[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public j(String str, String str2) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = str2;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final g.a.a.h.s.n d() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0249b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.k.a(this.a, jVar.a) && kotlin.jvm.internal.k.a(this.b, jVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "User(__typename=" + this.a + ", id=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "User" : str, str2);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class k implements g.a.a.h.s.m<c> {
        public c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return c.c.a(oVar);
        }
    }

    /* compiled from: GetBookableUnitsQuery.kt */
    public static final class l extends k.c {
        final /* synthetic */ b a;

        /* compiled from: InputFieldMarshaller.kt */
        public static final class a implements g.a.a.h.s.f {
            final /* synthetic */ l b;

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$l$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookableUnitsQuery.kt */
            static final class C0250a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.b, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ a f5817h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0250a(a aVar) {
                    super(1);
                    this.f5817h = aVar;
                }

                public final void a(g.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                    for (com.sensorberg.smartspaces.backend.j.f.c a : this.f5817h.b.a.n()) {
                        bVar.b(a.a());
                    }
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((g.b) obj);
                    return x.a;
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.b$l$a$b  reason: collision with other inner class name */
            /* compiled from: InputFieldWriter.kt */
            public static final class C0251b implements g.c {
                final /* synthetic */ List b;

                public C0251b(List list) {
                    this.b = list;
                }

                public void a(g.b bVar) {
                    kotlin.jvm.internal.k.f(bVar, "listItemWriter");
                    for (String a : this.b) {
                        bVar.a(com.sensorberg.smartspaces.backend.j.f.a.f5937g, a);
                    }
                }
            }

            public a(l lVar) {
                this.b = lVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                C0251b bVar;
                kotlin.jvm.internal.k.f(gVar, "writer");
                if (this.b.a.k().b) {
                    gVar.a("firstItemsPerPage", (Integer) this.b.a.k().a);
                }
                if (this.b.a.l().b) {
                    gVar.a("lastItemsPerPage", (Integer) this.b.a.l().a);
                }
                if (this.b.a.h().b) {
                    gVar.e("afterCursor", (String) this.b.a.h().a);
                }
                if (this.b.a.i().b) {
                    gVar.e("beforeCursor", (String) this.b.a.i().a);
                }
                gVar.d("endsAfter", com.sensorberg.smartspaces.backend.j.f.a.f5938h, Long.valueOf(this.b.a.j()));
                gVar.c("states", new C0250a(this));
                if (this.b.a.m().b) {
                    List list = (List) this.b.a.m().a;
                    if (list != null) {
                        g.c.a aVar = g.c.a;
                        bVar = new C0251b(list);
                    } else {
                        bVar = null;
                    }
                    gVar.b("parentUnitIds", bVar);
                }
            }
        }

        l(b bVar) {
            this.a = bVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.a.k().b) {
                linkedHashMap.put("firstItemsPerPage", this.a.k().a);
            }
            if (this.a.l().b) {
                linkedHashMap.put("lastItemsPerPage", this.a.l().a);
            }
            if (this.a.h().b) {
                linkedHashMap.put("afterCursor", this.a.h().a);
            }
            if (this.a.i().b) {
                linkedHashMap.put("beforeCursor", this.a.i().a);
            }
            linkedHashMap.put("endsAfter", Long.valueOf(this.a.j()));
            linkedHashMap.put("states", this.a.n());
            if (this.a.m().b) {
                linkedHashMap.put("parentUnitIds", this.a.m().a);
            }
            return linkedHashMap;
        }
    }

    static {
        new C0232b((DefaultConstructorMarker) null);
    }

    public b(g.a.a.h.h<Integer> hVar, g.a.a.h.h<Integer> hVar2, g.a.a.h.h<String> hVar3, g.a.a.h.h<String> hVar4, long j2, List<? extends com.sensorberg.smartspaces.backend.j.f.c> list, g.a.a.h.h<List<String>> hVar5) {
        kotlin.jvm.internal.k.e(hVar, "firstItemsPerPage");
        kotlin.jvm.internal.k.e(hVar2, "lastItemsPerPage");
        kotlin.jvm.internal.k.e(hVar3, "afterCursor");
        kotlin.jvm.internal.k.e(hVar4, "beforeCursor");
        kotlin.jvm.internal.k.e(list, "states");
        kotlin.jvm.internal.k.e(hVar5, "parentUnitIds");
        this.c = hVar;
        this.f5783d = hVar2;
        this.f5784e = hVar3;
        this.f5785f = hVar4;
        this.f5786g = j2;
        this.f5787h = list;
        this.f5788i = hVar5;
        this.b = new l(this);
    }

    public l.i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "39ed7c9bf9c25a453715bade79dfb99fd57db78bb40d1a7dd589e9f7aacc9593";
    }

    public g.a.a.h.s.m<c> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new k();
    }

    public l.i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f5781j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.k.a(this.c, bVar.c) && kotlin.jvm.internal.k.a(this.f5783d, bVar.f5783d) && kotlin.jvm.internal.k.a(this.f5784e, bVar.f5784e) && kotlin.jvm.internal.k.a(this.f5785f, bVar.f5785f) && this.f5786g == bVar.f5786g && kotlin.jvm.internal.k.a(this.f5787h, bVar.f5787h) && kotlin.jvm.internal.k.a(this.f5788i, bVar.f5788i);
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        c cVar = (c) bVar;
        o(cVar);
        return cVar;
    }

    public k.c g() {
        return this.b;
    }

    public final g.a.a.h.h<String> h() {
        return this.f5784e;
    }

    public int hashCode() {
        g.a.a.h.h<Integer> hVar = this.c;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        g.a.a.h.h<Integer> hVar2 = this.f5783d;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        g.a.a.h.h<String> hVar3 = this.f5784e;
        int hashCode3 = (hashCode2 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        g.a.a.h.h<String> hVar4 = this.f5785f;
        int hashCode4 = (((hashCode3 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31) + defpackage.c.a(this.f5786g)) * 31;
        List<com.sensorberg.smartspaces.backend.j.f.c> list = this.f5787h;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        g.a.a.h.h<List<String>> hVar5 = this.f5788i;
        if (hVar5 != null) {
            i2 = hVar5.hashCode();
        }
        return hashCode5 + i2;
    }

    public final g.a.a.h.h<String> i() {
        return this.f5785f;
    }

    public final long j() {
        return this.f5786g;
    }

    public final g.a.a.h.h<Integer> k() {
        return this.c;
    }

    public final g.a.a.h.h<Integer> l() {
        return this.f5783d;
    }

    public final g.a.a.h.h<List<String>> m() {
        return this.f5788i;
    }

    public final List<com.sensorberg.smartspaces.backend.j.f.c> n() {
        return this.f5787h;
    }

    public g.a.a.h.l name() {
        return f5782k;
    }

    public c o(c cVar) {
        return cVar;
    }

    public String toString() {
        return "GetBookableUnitsQuery(firstItemsPerPage=" + this.c + ", lastItemsPerPage=" + this.f5783d + ", afterCursor=" + this.f5784e + ", beforeCursor=" + this.f5785f + ", endsAfter=" + this.f5786g + ", states=" + this.f5787h + ", parentUnitIds=" + this.f5788i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g.a.a.h.h hVar, g.a.a.h.h hVar2, g.a.a.h.h hVar3, g.a.a.h.h hVar4, long j2, List list, g.a.a.h.h hVar5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? g.a.a.h.h.c.a() : hVar, (i2 & 2) != 0 ? g.a.a.h.h.c.a() : hVar2, (i2 & 4) != 0 ? g.a.a.h.h.c.a() : hVar3, (i2 & 8) != 0 ? g.a.a.h.h.c.a() : hVar4, j2, list, (i2 & 64) != 0 ? g.a.a.h.h.c.a() : hVar5);
    }
}
