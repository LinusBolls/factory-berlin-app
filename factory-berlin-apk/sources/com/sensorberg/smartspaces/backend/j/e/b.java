package com.sensorberg.smartspaces.backend.j.e;

import g.a.a.h.k;
import g.a.a.h.l;
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

/* compiled from: GetScheduleQuery.kt */
public final class b implements m<c, c, k.c> {

    /* renamed from: k  reason: collision with root package name */
    private static final String f5904k = g.a.a.h.s.k.a("query GetSchedule($firstItemsPerPage: Int, $lastItemsPerPage: Int, $afterCursor: String, $beforeCursor: String, $fromIso8601DateTime: ISO8601DateTime!, $toIso8601DateTime: ISO8601DateTime!, $unitId: ID!, $states: [UnitBookingStateEnum!]!) {\n  units(ids: [$unitId]) {\n    __typename\n    nodes {\n      __typename\n      unitBookings(first:$firstItemsPerPage, last:$lastItemsPerPage, after: $afterCursor, before: $beforeCursor, from: $fromIso8601DateTime, to: $toIso8601DateTime, states:$states) {\n        __typename\n        pageInfo {\n          __typename\n          hasNextPage\n          hasPreviousPage\n          startCursor\n          endCursor\n        }\n        nodes {\n          __typename\n          id\n          startsAt\n          endsAt\n          user {\n            __typename\n            id\n          }\n        }\n      }\n    }\n  }\n}");

    /* renamed from: l  reason: collision with root package name */
    private static final l f5905l = new a();
    private final transient k.c b;
    private final g.a.a.h.h<Integer> c;

    /* renamed from: d  reason: collision with root package name */
    private final g.a.a.h.h<Integer> f5906d;

    /* renamed from: e  reason: collision with root package name */
    private final g.a.a.h.h<String> f5907e;

    /* renamed from: f  reason: collision with root package name */
    private final g.a.a.h.h<String> f5908f;

    /* renamed from: g  reason: collision with root package name */
    private final long f5909g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5910h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5911i;

    /* renamed from: j  reason: collision with root package name */
    private final List<com.sensorberg.smartspaces.backend.j.f.c> f5912j;

    /* compiled from: GetScheduleQuery.kt */
    public static final class a implements l {
        a() {
        }

        public String name() {
            return "GetSchedule";
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$b  reason: collision with other inner class name */
    /* compiled from: GetScheduleQuery.kt */
    public static final class C0303b {
        private C0303b() {
        }

        public /* synthetic */ C0303b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("units", "units", d0.b(n.a("ids", "[{kind=Variable, variableName=unitId}]")), false, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final h a;

        /* compiled from: GetScheduleQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$c$a$a  reason: collision with other inner class name */
            /* compiled from: GetScheduleQuery.kt */
            static final class C0304a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, h> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0304a f5913h = new C0304a();

                C0304a() {
                    super(1);
                }

                /* renamed from: a */
                public final h o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return h.f5931d.a(oVar);
                }
            }

            private a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                Object d2 = oVar.d(c.b[0], C0304a.f5913h);
                kotlin.jvm.internal.k.c(d2);
                return new c((h) d2);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$c$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0305b implements g.a.a.h.s.n {
            final /* synthetic */ c b;

            public C0305b(c cVar) {
                this.b = cVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.c(c.b[0], this.b.c().d());
            }
        }

        public c(h hVar) {
            kotlin.jvm.internal.k.e(hVar, "units");
            this.a = hVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0305b(this);
        }

        public final h c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.k.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            h hVar = this.a;
            if (hVar != null) {
                return hVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(units=" + this.a + ")";
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class d {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("unitBookings", "unitBookings", e0.f(kotlin.n.a("first", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "firstItemsPerPage"))), kotlin.n.a("last", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "lastItemsPerPage"))), kotlin.n.a("after", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "afterCursor"))), kotlin.n.a("before", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "beforeCursor"))), kotlin.n.a("from", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "fromIso8601DateTime"))), kotlin.n.a("to", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "toIso8601DateTime"))), kotlin.n.a("states", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "states")))), true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5914d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final g b;

        /* compiled from: GetScheduleQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$d$a$a  reason: collision with other inner class name */
            /* compiled from: GetScheduleQuery.kt */
            static final class C0306a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, g> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0306a f5915h = new C0306a();

                C0306a() {
                    super(1);
                }

                /* renamed from: a */
                public final g o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return g.f5926e.a(oVar);
                }
            }

            private a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new d(f2, (g) oVar.d(d.c[1], C0306a.f5915h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$d$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0307b implements g.a.a.h.s.n {
            final /* synthetic */ d b;

            public C0307b(d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(d.c[0], this.b.c());
                o oVar = d.c[1];
                g b2 = this.b.b();
                pVar.c(oVar, b2 != null ? b2.e() : null);
            }
        }

        public d(String str, g gVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = gVar;
        }

        public final g b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final g.a.a.h.s.n d() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0307b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            g gVar = this.b;
            if (gVar != null) {
                i2 = gVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", unitBookings=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, g gVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, gVar);
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f5916f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.b("startsAt", "startsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, true, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), o.f9055g.g("user", "user", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final a f5917g = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f5918d;

        /* renamed from: e  reason: collision with root package name */
        private final i f5919e;

        /* compiled from: GetScheduleQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$e$a$a  reason: collision with other inner class name */
            /* compiled from: GetScheduleQuery.kt */
            static final class C0308a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, i> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0308a f5920h = new C0308a();

                C0308a() {
                    super(1);
                }

                /* renamed from: a */
                public final i o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return i.f5935d.a(oVar);
                }
            }

            private a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.f5916f[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = e.f5916f[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String str = (String) c;
                    o oVar3 = e.f5916f[2];
                    if (oVar3 != null) {
                        Object c2 = oVar.c((o.d) oVar3);
                        kotlin.jvm.internal.k.c(c2);
                        long longValue = ((Number) c2).longValue();
                        o oVar4 = e.f5916f[3];
                        if (oVar4 != null) {
                            return new e(f2, str, longValue, (Long) oVar.c((o.d) oVar4), (i) oVar.d(e.f5916f[4], C0308a.f5920h));
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

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$e$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0309b implements g.a.a.h.s.n {
            final /* synthetic */ e b;

            public C0309b(e eVar) {
                this.b = eVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(e.f5916f[0], this.b.f());
                o oVar = e.f5916f[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.c());
                    o oVar2 = e.f5916f[2];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, Long.valueOf(this.b.d()));
                        o oVar3 = e.f5916f[3];
                        if (oVar3 != null) {
                            pVar.b((o.d) oVar3, this.b.b());
                            o oVar4 = e.f5916f[4];
                            i e2 = this.b.e();
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

        public e(String str, String str2, long j2, Long l2, i iVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = str2;
            this.c = j2;
            this.f5918d = l2;
            this.f5919e = iVar;
        }

        public final Long b() {
            return this.f5918d;
        }

        public final String c() {
            return this.b;
        }

        public final long d() {
            return this.c;
        }

        public final i e() {
            return this.f5919e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b) && this.c == eVar.c && kotlin.jvm.internal.k.a(this.f5918d, eVar.f5918d) && kotlin.jvm.internal.k.a(this.f5919e, eVar.f5919e);
        }

        public final String f() {
            return this.a;
        }

        public final g.a.a.h.s.n g() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0309b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + defpackage.c.a(this.c)) * 31;
            Long l2 = this.f5918d;
            int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
            i iVar = this.f5919e;
            if (iVar != null) {
                i2 = iVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", id=" + this.b + ", startsAt=" + this.c + ", endsAt=" + this.f5918d + ", user=" + this.f5919e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, String str2, long j2, Long l2, i iVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBooking" : str, str2, j2, l2, iVar);
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f5921f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.a("hasNextPage", "hasNextPage", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.a("hasPreviousPage", "hasPreviousPage", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.h("startCursor", "startCursor", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.h("endCursor", "endCursor", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final a f5922g = new a((DefaultConstructorMarker) null);
        private final String a;
        private final boolean b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5923d;

        /* renamed from: e  reason: collision with root package name */
        private final String f5924e;

        /* compiled from: GetScheduleQuery.kt */
        public static final class a {
            private a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.f5921f[0]);
                kotlin.jvm.internal.k.c(f2);
                Boolean j2 = oVar.j(f.f5921f[1]);
                kotlin.jvm.internal.k.c(j2);
                boolean booleanValue = j2.booleanValue();
                Boolean j3 = oVar.j(f.f5921f[2]);
                kotlin.jvm.internal.k.c(j3);
                return new f(f2, booleanValue, j3.booleanValue(), oVar.f(f.f5921f[3]), oVar.f(f.f5921f[4]));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$f$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0310b implements g.a.a.h.s.n {
            final /* synthetic */ f b;

            public C0310b(f fVar) {
                this.b = fVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(f.f5921f[0], this.b.f());
                pVar.e(f.f5921f[1], Boolean.valueOf(this.b.c()));
                pVar.e(f.f5921f[2], Boolean.valueOf(this.b.d()));
                pVar.f(f.f5921f[3], this.b.e());
                pVar.f(f.f5921f[4], this.b.b());
            }
        }

        public f(String str, boolean z, boolean z2, String str2, String str3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = z;
            this.c = z2;
            this.f5923d = str2;
            this.f5924e = str3;
        }

        public final String b() {
            return this.f5924e;
        }

        public final boolean c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final String e() {
            return this.f5923d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && kotlin.jvm.internal.k.a(this.f5923d, fVar.f5923d) && kotlin.jvm.internal.k.a(this.f5924e, fVar.f5924e);
        }

        public final String f() {
            return this.a;
        }

        public final g.a.a.h.s.n g() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0310b(this);
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
            String str2 = this.f5923d;
            int hashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f5924e;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "PageInfo(__typename=" + this.a + ", hasNextPage=" + this.b + ", hasPreviousPage=" + this.c + ", startCursor=" + this.f5923d + ", endCursor=" + this.f5924e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, boolean z, boolean z2, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "PageInfo" : str, z, z2, str2, str3);
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class g {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f5925d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("pageInfo", "pageInfo", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final a f5926e = new a((DefaultConstructorMarker) null);
        private final String a;
        private final f b;
        private final List<e> c;

        /* compiled from: GetScheduleQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$g$a$a  reason: collision with other inner class name */
            /* compiled from: GetScheduleQuery.kt */
            static final class C0311a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0311a f5927h = new C0311a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$g$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetScheduleQuery.kt */
                static final class C0312a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0312a f5928h = new C0312a();

                    C0312a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final e o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return e.f5917g.a(oVar);
                    }
                }

                C0311a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (e) bVar.b(C0312a.f5928h);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$g$a$b  reason: collision with other inner class name */
            /* compiled from: GetScheduleQuery.kt */
            static final class C0313b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0313b f5929h = new C0313b();

                C0313b() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f5922g.a(oVar);
                }
            }

            private a() {
            }

            public final g a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(g.f5925d[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(g.f5925d[1], C0313b.f5929h);
                kotlin.jvm.internal.k.c(d2);
                return new g(f2, (f) d2, oVar.g(g.f5925d[2], C0311a.f5927h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$g$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0314b implements g.a.a.h.s.n {
            final /* synthetic */ g b;

            public C0314b(g gVar) {
                this.b = gVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(g.f5925d[0], this.b.d());
                pVar.c(g.f5925d[1], this.b.c().g());
                pVar.d(g.f5925d[2], this.b.b(), c.f5930h);
            }
        }

        /* compiled from: GetScheduleQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends e>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5930h = new c();

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

        public g(String str, f fVar, List<e> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(fVar, "pageInfo");
            this.a = str;
            this.b = fVar;
            this.c = list;
        }

        public final List<e> b() {
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
            return new C0314b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.k.a(this.a, gVar.a) && kotlin.jvm.internal.k.a(this.b, gVar.b) && kotlin.jvm.internal.k.a(this.c, gVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            f fVar = this.b;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            List<e> list = this.c;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "UnitBookings(__typename=" + this.a + ", pageInfo=" + this.b + ", nodes=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(String str, f fVar, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBookingConnection" : str, fVar, list);
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class h {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5931d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final List<d> b;

        /* compiled from: GetScheduleQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$h$a$a  reason: collision with other inner class name */
            /* compiled from: GetScheduleQuery.kt */
            static final class C0315a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0315a f5932h = new C0315a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$h$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetScheduleQuery.kt */
                static final class C0316a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0316a f5933h = new C0316a();

                    C0316a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final d o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return d.f5914d.a(oVar);
                    }
                }

                C0315a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (d) bVar.b(C0316a.f5933h);
                }
            }

            private a() {
            }

            public final h a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(h.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new h(f2, oVar.g(h.c[1], C0315a.f5932h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$h$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0317b implements g.a.a.h.s.n {
            final /* synthetic */ h b;

            public C0317b(h hVar) {
                this.b = hVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(h.c[0], this.b.c());
                pVar.d(h.c[1], this.b.b(), c.f5934h);
            }
        }

        /* compiled from: GetScheduleQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends d>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5934h = new c();

            c() {
                super(2);
            }

            public final void a(List<d> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (d dVar : list) {
                        bVar.a(dVar != null ? dVar.d() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public h(String str, List<d> list) {
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
            return new C0317b(this);
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
        public /* synthetic */ h(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitConnection" : str, list);
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class i {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5935d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: GetScheduleQuery.kt */
        public static final class a {
            private a() {
            }

            public final i a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(i.c[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = i.c[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new i(f2, (String) c);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$i$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0318b implements g.a.a.h.s.n {
            final /* synthetic */ i b;

            public C0318b(i iVar) {
                this.b = iVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(i.c[0], this.b.c());
                g.a.a.h.o oVar = i.c[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public i(String str, String str2) {
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
            return new C0318b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.k.a(this.a, iVar.a) && kotlin.jvm.internal.k.a(this.b, iVar.b);
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
        public /* synthetic */ i(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "User" : str, str2);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class j implements g.a.a.h.s.m<c> {
        public c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return c.c.a(oVar);
        }
    }

    /* compiled from: GetScheduleQuery.kt */
    public static final class k extends k.c {
        final /* synthetic */ b a;

        /* compiled from: InputFieldMarshaller.kt */
        public static final class a implements g.a.a.h.s.f {
            final /* synthetic */ k b;

            /* renamed from: com.sensorberg.smartspaces.backend.j.e.b$k$a$a  reason: collision with other inner class name */
            /* compiled from: GetScheduleQuery.kt */
            static final class C0319a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.b, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ a f5936h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0319a(a aVar) {
                    super(1);
                    this.f5936h = aVar;
                }

                public final void a(g.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                    for (com.sensorberg.smartspaces.backend.j.f.c a : this.f5936h.b.a.m()) {
                        bVar.b(a.a());
                    }
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((g.b) obj);
                    return x.a;
                }
            }

            public a(k kVar) {
                this.b = kVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
                if (this.b.a.j().b) {
                    gVar.a("firstItemsPerPage", (Integer) this.b.a.j().a);
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
                gVar.d("fromIso8601DateTime", com.sensorberg.smartspaces.backend.j.f.a.f5938h, Long.valueOf(this.b.a.k()));
                gVar.d("toIso8601DateTime", com.sensorberg.smartspaces.backend.j.f.a.f5938h, Long.valueOf(this.b.a.n()));
                gVar.d("unitId", com.sensorberg.smartspaces.backend.j.f.a.f5937g, this.b.a.o());
                gVar.c("states", new C0319a(this));
            }
        }

        k(b bVar) {
            this.a = bVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.a.j().b) {
                linkedHashMap.put("firstItemsPerPage", this.a.j().a);
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
            linkedHashMap.put("fromIso8601DateTime", Long.valueOf(this.a.k()));
            linkedHashMap.put("toIso8601DateTime", Long.valueOf(this.a.n()));
            linkedHashMap.put("unitId", this.a.o());
            linkedHashMap.put("states", this.a.m());
            return linkedHashMap;
        }
    }

    static {
        new C0303b((DefaultConstructorMarker) null);
    }

    public b(g.a.a.h.h<Integer> hVar, g.a.a.h.h<Integer> hVar2, g.a.a.h.h<String> hVar3, g.a.a.h.h<String> hVar4, long j2, long j3, String str, List<? extends com.sensorberg.smartspaces.backend.j.f.c> list) {
        kotlin.jvm.internal.k.e(hVar, "firstItemsPerPage");
        kotlin.jvm.internal.k.e(hVar2, "lastItemsPerPage");
        kotlin.jvm.internal.k.e(hVar3, "afterCursor");
        kotlin.jvm.internal.k.e(hVar4, "beforeCursor");
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(list, "states");
        this.c = hVar;
        this.f5906d = hVar2;
        this.f5907e = hVar3;
        this.f5908f = hVar4;
        this.f5909g = j2;
        this.f5910h = j3;
        this.f5911i = str;
        this.f5912j = list;
        this.b = new k(this);
    }

    public l.i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "4cf1d92dc78a49e5e77564c989b6e2ec9c37b939c3ea19f5e998bbec4f0e5995";
    }

    public g.a.a.h.s.m<c> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new j();
    }

    public l.i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f5904k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.k.a(this.c, bVar.c) && kotlin.jvm.internal.k.a(this.f5906d, bVar.f5906d) && kotlin.jvm.internal.k.a(this.f5907e, bVar.f5907e) && kotlin.jvm.internal.k.a(this.f5908f, bVar.f5908f) && this.f5909g == bVar.f5909g && this.f5910h == bVar.f5910h && kotlin.jvm.internal.k.a(this.f5911i, bVar.f5911i) && kotlin.jvm.internal.k.a(this.f5912j, bVar.f5912j);
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        c cVar = (c) bVar;
        p(cVar);
        return cVar;
    }

    public k.c g() {
        return this.b;
    }

    public final g.a.a.h.h<String> h() {
        return this.f5907e;
    }

    public int hashCode() {
        g.a.a.h.h<Integer> hVar = this.c;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        g.a.a.h.h<Integer> hVar2 = this.f5906d;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        g.a.a.h.h<String> hVar3 = this.f5907e;
        int hashCode3 = (hashCode2 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        g.a.a.h.h<String> hVar4 = this.f5908f;
        int hashCode4 = (((((hashCode3 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31) + defpackage.c.a(this.f5909g)) * 31) + defpackage.c.a(this.f5910h)) * 31;
        String str = this.f5911i;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        List<com.sensorberg.smartspaces.backend.j.f.c> list = this.f5912j;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode5 + i2;
    }

    public final g.a.a.h.h<String> i() {
        return this.f5908f;
    }

    public final g.a.a.h.h<Integer> j() {
        return this.c;
    }

    public final long k() {
        return this.f5909g;
    }

    public final g.a.a.h.h<Integer> l() {
        return this.f5906d;
    }

    public final List<com.sensorberg.smartspaces.backend.j.f.c> m() {
        return this.f5912j;
    }

    public final long n() {
        return this.f5910h;
    }

    public l name() {
        return f5905l;
    }

    public final String o() {
        return this.f5911i;
    }

    public c p(c cVar) {
        return cVar;
    }

    public String toString() {
        return "GetScheduleQuery(firstItemsPerPage=" + this.c + ", lastItemsPerPage=" + this.f5906d + ", afterCursor=" + this.f5907e + ", beforeCursor=" + this.f5908f + ", fromIso8601DateTime=" + this.f5909g + ", toIso8601DateTime=" + this.f5910h + ", unitId=" + this.f5911i + ", states=" + this.f5912j + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g.a.a.h.h hVar, g.a.a.h.h hVar2, g.a.a.h.h hVar3, g.a.a.h.h hVar4, long j2, long j3, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? g.a.a.h.h.c.a() : hVar, (i2 & 2) != 0 ? g.a.a.h.h.c.a() : hVar2, (i2 & 4) != 0 ? g.a.a.h.h.c.a() : hVar3, (i2 & 8) != 0 ? g.a.a.h.h.c.a() : hVar4, j2, j3, str, list);
    }
}
