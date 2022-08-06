package com.sensorberg.smartspaces.backend.j.c;

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
import kotlin.x;

/* compiled from: GetBookingsQuery.kt */
public final class c implements m<C0252c, C0252c, k.c> {

    /* renamed from: j  reason: collision with root package name */
    private static final String f5818j = g.a.a.h.s.k.a("query GetBookings($firstItemsPerPage: Int, $lastItemsPerPage: Int, $afterCursor: String, $beforeCursor: String, $fromIso8601DateTime: ISO8601DateTime!, $toIso8601DateTime: ISO8601DateTime, $states: [UnitBookingStateEnum!]!) {\n  viewer {\n    __typename\n    unitBookings(first:$firstItemsPerPage, last:$lastItemsPerPage, after: $afterCursor, before: $beforeCursor, from: $fromIso8601DateTime, to: $toIso8601DateTime, onActuator: false, states: $states) {\n      __typename\n      pageInfo {\n        __typename\n        hasNextPage\n        hasPreviousPage\n        startCursor\n        endCursor\n      }\n      nodes {\n        __typename\n        id\n        startsAt\n        endsAt\n        unit {\n          __typename\n          id\n          name\n        }\n      }\n    }\n  }\n}");

    /* renamed from: k  reason: collision with root package name */
    private static final l f5819k = new a();
    private final transient k.c b;
    private final g.a.a.h.h<Integer> c;

    /* renamed from: d  reason: collision with root package name */
    private final g.a.a.h.h<Integer> f5820d;

    /* renamed from: e  reason: collision with root package name */
    private final g.a.a.h.h<String> f5821e;

    /* renamed from: f  reason: collision with root package name */
    private final g.a.a.h.h<String> f5822f;

    /* renamed from: g  reason: collision with root package name */
    private final long f5823g;

    /* renamed from: h  reason: collision with root package name */
    private final g.a.a.h.h<Long> f5824h;

    /* renamed from: i  reason: collision with root package name */
    private final List<com.sensorberg.smartspaces.backend.j.f.c> f5825i;

    /* compiled from: GetBookingsQuery.kt */
    public static final class a implements l {
        a() {
        }

        public String name() {
            return "GetBookings";
        }
    }

    /* compiled from: GetBookingsQuery.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$c  reason: collision with other inner class name */
    /* compiled from: GetBookingsQuery.kt */
    public static final class C0252c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("viewer", "viewer", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final h a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$c$a */
        /* compiled from: GetBookingsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$c$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingsQuery.kt */
            static final class C0253a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, h> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0253a f5826h = new C0253a();

                C0253a() {
                    super(1);
                }

                /* renamed from: a */
                public final h o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return h.f5844d.a(oVar);
                }
            }

            private a() {
            }

            public final C0252c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new C0252c((h) oVar.d(C0252c.b[0], C0253a.f5826h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$c$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ C0252c b;

            public b(C0252c cVar) {
                this.b = cVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                o oVar = C0252c.b[0];
                h c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public C0252c(h hVar) {
            this.a = hVar;
        }

        public n a() {
            n.a aVar = n.a;
            return new b(this);
        }

        public final h c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0252c) && kotlin.jvm.internal.k.a(this.a, ((C0252c) obj).a);
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
            return "Data(viewer=" + this.a + ")";
        }
    }

    /* compiled from: GetBookingsQuery.kt */
    public static final class d {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f5827f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.b("startsAt", "startsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, true, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), o.f9055g.g("unit", "unit", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final a f5828g = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f5829d;

        /* renamed from: e  reason: collision with root package name */
        private final f f5830e;

        /* compiled from: GetBookingsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$d$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingsQuery.kt */
            static final class C0254a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0254a f5831h = new C0254a();

                C0254a() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f5837e.a(oVar);
                }
            }

            private a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.f5827f[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = d.f5827f[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String str = (String) c;
                    o oVar3 = d.f5827f[2];
                    if (oVar3 != null) {
                        Object c2 = oVar.c((o.d) oVar3);
                        kotlin.jvm.internal.k.c(c2);
                        long longValue = ((Number) c2).longValue();
                        o oVar4 = d.f5827f[3];
                        if (oVar4 != null) {
                            Object d2 = oVar.d(d.f5827f[4], C0254a.f5831h);
                            kotlin.jvm.internal.k.c(d2);
                            return new d(f2, str, longValue, (Long) oVar.c((o.d) oVar4), (f) d2);
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

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ d b;

            public b(d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(d.f5827f[0], this.b.f());
                o oVar = d.f5827f[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.c());
                    o oVar2 = d.f5827f[2];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, Long.valueOf(this.b.d()));
                        o oVar3 = d.f5827f[3];
                        if (oVar3 != null) {
                            pVar.b((o.d) oVar3, this.b.b());
                            pVar.c(d.f5827f[4], this.b.e().e());
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public d(String str, String str2, long j2, Long l2, f fVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            kotlin.jvm.internal.k.e(fVar, "unit");
            this.a = str;
            this.b = str2;
            this.c = j2;
            this.f5829d = l2;
            this.f5830e = fVar;
        }

        public final Long b() {
            return this.f5829d;
        }

        public final String c() {
            return this.b;
        }

        public final long d() {
            return this.c;
        }

        public final f e() {
            return this.f5830e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b) && this.c == dVar.c && kotlin.jvm.internal.k.a(this.f5829d, dVar.f5829d) && kotlin.jvm.internal.k.a(this.f5830e, dVar.f5830e);
        }

        public final String f() {
            return this.a;
        }

        public final n g() {
            n.a aVar = n.a;
            return new b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + defpackage.c.a(this.c)) * 31;
            Long l2 = this.f5829d;
            int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
            f fVar = this.f5830e;
            if (fVar != null) {
                i2 = fVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", id=" + this.b + ", startsAt=" + this.c + ", endsAt=" + this.f5829d + ", unit=" + this.f5830e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, String str2, long j2, Long l2, f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBooking" : str, str2, j2, l2, fVar);
        }
    }

    /* compiled from: GetBookingsQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f5832f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.a("hasNextPage", "hasNextPage", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.a("hasPreviousPage", "hasPreviousPage", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.h("startCursor", "startCursor", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), o.f9055g.h("endCursor", "endCursor", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final a f5833g = new a((DefaultConstructorMarker) null);
        private final String a;
        private final boolean b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5834d;

        /* renamed from: e  reason: collision with root package name */
        private final String f5835e;

        /* compiled from: GetBookingsQuery.kt */
        public static final class a {
            private a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.f5832f[0]);
                kotlin.jvm.internal.k.c(f2);
                Boolean j2 = oVar.j(e.f5832f[1]);
                kotlin.jvm.internal.k.c(j2);
                boolean booleanValue = j2.booleanValue();
                Boolean j3 = oVar.j(e.f5832f[2]);
                kotlin.jvm.internal.k.c(j3);
                return new e(f2, booleanValue, j3.booleanValue(), oVar.f(e.f5832f[3]), oVar.f(e.f5832f[4]));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(e.f5832f[0], this.b.f());
                pVar.e(e.f5832f[1], Boolean.valueOf(this.b.c()));
                pVar.e(e.f5832f[2], Boolean.valueOf(this.b.d()));
                pVar.f(e.f5832f[3], this.b.e());
                pVar.f(e.f5832f[4], this.b.b());
            }
        }

        public e(String str, boolean z, boolean z2, String str2, String str3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = z;
            this.c = z2;
            this.f5834d = str2;
            this.f5835e = str3;
        }

        public final String b() {
            return this.f5835e;
        }

        public final boolean c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final String e() {
            return this.f5834d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && kotlin.jvm.internal.k.a(this.f5834d, eVar.f5834d) && kotlin.jvm.internal.k.a(this.f5835e, eVar.f5835e);
        }

        public final String f() {
            return this.a;
        }

        public final n g() {
            n.a aVar = n.a;
            return new b(this);
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
            String str2 = this.f5834d;
            int hashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f5835e;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "PageInfo(__typename=" + this.a + ", hasNextPage=" + this.b + ", hasPreviousPage=" + this.c + ", startCursor=" + this.f5834d + ", endCursor=" + this.f5835e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, boolean z, boolean z2, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "PageInfo" : str, z, z2, str2, str3);
        }
    }

    /* compiled from: GetBookingsQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f5836d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final a f5837e = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* compiled from: GetBookingsQuery.kt */
        public static final class a {
            private a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.f5836d[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = f.f5836d[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new f(f2, (String) c, oVar.f(f.f5836d[2]));
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(f.f5836d[0], this.b.d());
                o oVar = f.f5836d[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    pVar.f(f.f5836d[2], this.b.c());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public f(String str, String str2, String str3) {
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

        public final n e() {
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
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && kotlin.jvm.internal.k.a(this.b, fVar.b) && kotlin.jvm.internal.k.a(this.c, fVar.c);
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
        public /* synthetic */ f(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2, str3);
        }
    }

    /* compiled from: GetBookingsQuery.kt */
    public static final class g {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f5838d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("pageInfo", "pageInfo", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final a f5839e = new a((DefaultConstructorMarker) null);
        private final String a;
        private final e b;
        private final List<d> c;

        /* compiled from: GetBookingsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$g$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingsQuery.kt */
            static final class C0255a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0255a f5840h = new C0255a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$g$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetBookingsQuery.kt */
                static final class C0256a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0256a f5841h = new C0256a();

                    C0256a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final d o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return d.f5828g.a(oVar);
                    }
                }

                C0255a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (d) bVar.b(C0256a.f5841h);
                }
            }

            /* compiled from: GetBookingsQuery.kt */
            static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final b f5842h = new b();

                b() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return e.f5833g.a(oVar);
                }
            }

            private a() {
            }

            public final g a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(g.f5838d[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(g.f5838d[1], b.f5842h);
                kotlin.jvm.internal.k.c(d2);
                return new g(f2, (e) d2, oVar.g(g.f5838d[2], C0255a.f5840h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ g b;

            public b(g gVar) {
                this.b = gVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(g.f5838d[0], this.b.d());
                pVar.c(g.f5838d[1], this.b.c().g());
                pVar.d(g.f5838d[2], this.b.b(), C0257c.f5843h);
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$g$c  reason: collision with other inner class name */
        /* compiled from: GetBookingsQuery.kt */
        static final class C0257c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends d>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0257c f5843h = new C0257c();

            C0257c() {
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

        public g(String str, e eVar, List<d> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(eVar, "pageInfo");
            this.a = str;
            this.b = eVar;
            this.c = list;
        }

        public final List<d> b() {
            return this.c;
        }

        public final e c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public final n e() {
            n.a aVar = n.a;
            return new b(this);
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
            e eVar = this.b;
            int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
            List<d> list = this.c;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "UnitBookings(__typename=" + this.a + ", pageInfo=" + this.b + ", nodes=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(String str, e eVar, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBookingConnection" : str, eVar, list);
        }
    }

    /* compiled from: GetBookingsQuery.kt */
    public static final class h {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("unitBookings", "unitBookings", e0.f(kotlin.n.a("first", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "firstItemsPerPage"))), kotlin.n.a("last", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "lastItemsPerPage"))), kotlin.n.a("after", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "afterCursor"))), kotlin.n.a("before", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "beforeCursor"))), kotlin.n.a("from", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "fromIso8601DateTime"))), kotlin.n.a("to", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "toIso8601DateTime"))), kotlin.n.a("onActuator", "false"), kotlin.n.a("states", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "states")))), true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5844d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final g b;

        /* compiled from: GetBookingsQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$h$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingsQuery.kt */
            static final class C0258a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, g> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0258a f5845h = new C0258a();

                C0258a() {
                    super(1);
                }

                /* renamed from: a */
                public final g o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return g.f5839e.a(oVar);
                }
            }

            private a() {
            }

            public final h a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(h.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new h(f2, (g) oVar.d(h.c[1], C0258a.f5845h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ h b;

            public b(h hVar) {
                this.b = hVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(h.c[0], this.b.c());
                g.a.a.h.o oVar = h.c[1];
                g b2 = this.b.b();
                pVar.c(oVar, b2 != null ? b2.e() : null);
            }
        }

        public h(String str, g gVar) {
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

        public final n d() {
            n.a aVar = n.a;
            return new b(this);
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
            g gVar = this.b;
            if (gVar != null) {
                i2 = gVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Viewer(__typename=" + this.a + ", unitBookings=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(String str, g gVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Viewer" : str, gVar);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class i implements g.a.a.h.s.m<C0252c> {
        public C0252c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return C0252c.c.a(oVar);
        }
    }

    /* compiled from: GetBookingsQuery.kt */
    public static final class j extends k.c {
        final /* synthetic */ c a;

        /* compiled from: InputFieldMarshaller.kt */
        public static final class a implements g.a.a.h.s.f {
            final /* synthetic */ j b;

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.c$j$a$a  reason: collision with other inner class name */
            /* compiled from: GetBookingsQuery.kt */
            static final class C0259a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.b, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ a f5846h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0259a(a aVar) {
                    super(1);
                    this.f5846h = aVar;
                }

                public final void a(g.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                    for (com.sensorberg.smartspaces.backend.j.f.c a : this.f5846h.b.a.m()) {
                        bVar.b(a.a());
                    }
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((g.b) obj);
                    return x.a;
                }
            }

            public a(j jVar) {
                this.b = jVar;
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
                if (this.b.a.n().b) {
                    gVar.d("toIso8601DateTime", com.sensorberg.smartspaces.backend.j.f.a.f5938h, this.b.a.n().a);
                }
                gVar.c("states", new C0259a(this));
            }
        }

        j(c cVar) {
            this.a = cVar;
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
            if (this.a.n().b) {
                linkedHashMap.put("toIso8601DateTime", this.a.n().a);
            }
            linkedHashMap.put("states", this.a.m());
            return linkedHashMap;
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public c(g.a.a.h.h<Integer> hVar, g.a.a.h.h<Integer> hVar2, g.a.a.h.h<String> hVar3, g.a.a.h.h<String> hVar4, long j2, g.a.a.h.h<Long> hVar5, List<? extends com.sensorberg.smartspaces.backend.j.f.c> list) {
        kotlin.jvm.internal.k.e(hVar, "firstItemsPerPage");
        kotlin.jvm.internal.k.e(hVar2, "lastItemsPerPage");
        kotlin.jvm.internal.k.e(hVar3, "afterCursor");
        kotlin.jvm.internal.k.e(hVar4, "beforeCursor");
        kotlin.jvm.internal.k.e(hVar5, "toIso8601DateTime");
        kotlin.jvm.internal.k.e(list, "states");
        this.c = hVar;
        this.f5820d = hVar2;
        this.f5821e = hVar3;
        this.f5822f = hVar4;
        this.f5823g = j2;
        this.f5824h = hVar5;
        this.f5825i = list;
        this.b = new j(this);
    }

    public l.i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "c1461d4c6afae91da781bc3963100bb8ea347825a38c9acb3dad63f87b965a9d";
    }

    public g.a.a.h.s.m<C0252c> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new i();
    }

    public l.i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f5818j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.k.a(this.c, cVar.c) && kotlin.jvm.internal.k.a(this.f5820d, cVar.f5820d) && kotlin.jvm.internal.k.a(this.f5821e, cVar.f5821e) && kotlin.jvm.internal.k.a(this.f5822f, cVar.f5822f) && this.f5823g == cVar.f5823g && kotlin.jvm.internal.k.a(this.f5824h, cVar.f5824h) && kotlin.jvm.internal.k.a(this.f5825i, cVar.f5825i);
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        C0252c cVar = (C0252c) bVar;
        o(cVar);
        return cVar;
    }

    public k.c g() {
        return this.b;
    }

    public final g.a.a.h.h<String> h() {
        return this.f5821e;
    }

    public int hashCode() {
        g.a.a.h.h<Integer> hVar = this.c;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        g.a.a.h.h<Integer> hVar2 = this.f5820d;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        g.a.a.h.h<String> hVar3 = this.f5821e;
        int hashCode3 = (hashCode2 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        g.a.a.h.h<String> hVar4 = this.f5822f;
        int hashCode4 = (((hashCode3 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31) + defpackage.c.a(this.f5823g)) * 31;
        g.a.a.h.h<Long> hVar5 = this.f5824h;
        int hashCode5 = (hashCode4 + (hVar5 != null ? hVar5.hashCode() : 0)) * 31;
        List<com.sensorberg.smartspaces.backend.j.f.c> list = this.f5825i;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode5 + i2;
    }

    public final g.a.a.h.h<String> i() {
        return this.f5822f;
    }

    public final g.a.a.h.h<Integer> j() {
        return this.c;
    }

    public final long k() {
        return this.f5823g;
    }

    public final g.a.a.h.h<Integer> l() {
        return this.f5820d;
    }

    public final List<com.sensorberg.smartspaces.backend.j.f.c> m() {
        return this.f5825i;
    }

    public final g.a.a.h.h<Long> n() {
        return this.f5824h;
    }

    public l name() {
        return f5819k;
    }

    public C0252c o(C0252c cVar) {
        return cVar;
    }

    public String toString() {
        return "GetBookingsQuery(firstItemsPerPage=" + this.c + ", lastItemsPerPage=" + this.f5820d + ", afterCursor=" + this.f5821e + ", beforeCursor=" + this.f5822f + ", fromIso8601DateTime=" + this.f5823g + ", toIso8601DateTime=" + this.f5824h + ", states=" + this.f5825i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g.a.a.h.h hVar, g.a.a.h.h hVar2, g.a.a.h.h hVar3, g.a.a.h.h hVar4, long j2, g.a.a.h.h hVar5, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? g.a.a.h.h.c.a() : hVar, (i2 & 2) != 0 ? g.a.a.h.h.c.a() : hVar2, (i2 & 4) != 0 ? g.a.a.h.h.c.a() : hVar3, (i2 & 8) != 0 ? g.a.a.h.h.c.a() : hVar4, j2, (i2 & 32) != 0 ? g.a.a.h.h.c.a() : hVar5, list);
    }
}
