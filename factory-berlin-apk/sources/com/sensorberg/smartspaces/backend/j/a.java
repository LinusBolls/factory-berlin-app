package com.sensorberg.smartspaces.backend.j;

import g.a.a.h.k;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.o;
import g.a.a.h.s.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.x;

/* compiled from: GetIotDeviceDetailsQuery.kt */
public final class a implements g.a.a.h.m<i, i, k.c> {
    private static final String b = g.a.a.h.s.k.a("query GetIotDeviceDetails {\n  viewer {\n    __typename\n    accessibleUnits {\n      __typename\n      nodes {\n        __typename\n        id\n        name\n        iotDevices {\n          __typename\n          nodes {\n            __typename\n            allowedPeriods {\n              __typename\n              startsAt\n              endsAt\n            }\n            id\n            name\n            iotDeviceType {\n              __typename\n              id\n              name\n              externalIdentifier\n            }\n            properties {\n              __typename\n              ... on Binary {\n                allowedPeriods {\n                  __typename\n                  startsAt\n                  endsAt\n                }\n                kind\n                readable\n                writable\n                bit: value\n              }\n              ... on Numeric {\n                allowedPeriods {\n                  __typename\n                  startsAt\n                  endsAt\n                }\n                kind\n                readable\n                writable\n                value\n                maxValue\n                minValue\n              }\n            }\n          }\n        }\n      }\n    }\n  }\n}");
    private static final g.a.a.h.l c = new g();

    /* renamed from: com.sensorberg.smartspaces.backend.j.a$a  reason: collision with other inner class name */
    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class C0189a {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0190a f5702d = new C0190a((DefaultConstructorMarker) null);
        private final String a;
        private final List<l> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$a$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0190a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$a$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0191a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, l> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0191a f5703h = new C0191a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.a$a$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetIotDeviceDetailsQuery.kt */
                static final class C0192a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, l> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0192a f5704h = new C0192a();

                    C0192a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final l o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return l.f5739f.a(oVar);
                    }
                }

                C0191a() {
                    super(1);
                }

                /* renamed from: a */
                public final l o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (l) bVar.b(C0192a.f5704h);
                }
            }

            private C0190a() {
            }

            public final C0189a a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(C0189a.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new C0189a(f2, oVar.g(C0189a.c[1], C0191a.f5703h));
            }

            public /* synthetic */ C0190a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$a$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ C0189a b;

            public b(C0189a aVar) {
                this.b = aVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(C0189a.c[0], this.b.c());
                pVar.d(C0189a.c[1], this.b.b(), c.f5705h);
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$a$c */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends l>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5705h = new c();

            c() {
                super(2);
            }

            public final void a(List<l> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (l lVar : list) {
                        bVar.a(lVar != null ? lVar.f() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public C0189a(String str, List<l> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<l> b() {
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
            if (!(obj instanceof C0189a)) {
                return false;
            }
            C0189a aVar = (C0189a) obj;
            return kotlin.jvm.internal.k.a(this.a, aVar.a) && kotlin.jvm.internal.k.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<l> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "AccessibleUnits(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0189a(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitConnection" : str, list);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final g.a.a.h.o[] f5706d = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("startsAt", "startsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final C0193a f5707e = new C0193a((DefaultConstructorMarker) null);
        private final String a;
        private final long b;
        private final long c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$b$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0193a {
            private C0193a() {
            }

            public final b a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(b.f5706d[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = b.f5706d[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    long longValue = ((Number) c).longValue();
                    g.a.a.h.o oVar3 = b.f5706d[2];
                    if (oVar3 != null) {
                        Object c2 = oVar.c((o.d) oVar3);
                        kotlin.jvm.internal.k.c(c2);
                        return new b(f2, longValue, ((Number) c2).longValue());
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0193a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$b$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0194b implements g.a.a.h.s.n {
            final /* synthetic */ b b;

            public C0194b(b bVar) {
                this.b = bVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(b.f5706d[0], this.b.d());
                g.a.a.h.o oVar = b.f5706d[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, Long.valueOf(this.b.c()));
                    g.a.a.h.o oVar2 = b.f5706d[2];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, Long.valueOf(this.b.b()));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public b(String str, long j2, long j3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = j2;
            this.c = j3;
        }

        public final long b() {
            return this.c;
        }

        public final long c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public final g.a.a.h.s.n e() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0194b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.k.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            String str = this.a;
            return ((((str != null ? str.hashCode() : 0) * 31) + defpackage.c.a(this.b)) * 31) + defpackage.c.a(this.c);
        }

        public String toString() {
            return "AllowedPeriod(__typename=" + this.a + ", startsAt=" + this.b + ", endsAt=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "AllowedPeriod" : str, j2, j3);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final g.a.a.h.o[] f5708d = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("startsAt", "startsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final C0195a f5709e = new C0195a((DefaultConstructorMarker) null);
        private final String a;
        private final long b;
        private final long c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$c$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0195a {
            private C0195a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(c.f5708d[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = c.f5708d[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    long longValue = ((Number) c).longValue();
                    g.a.a.h.o oVar3 = c.f5708d[2];
                    if (oVar3 != null) {
                        Object c2 = oVar.c((o.d) oVar3);
                        kotlin.jvm.internal.k.c(c2);
                        return new c(f2, longValue, ((Number) c2).longValue());
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0195a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ c b;

            public b(c cVar) {
                this.b = cVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(c.f5708d[0], this.b.d());
                g.a.a.h.o oVar = c.f5708d[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, Long.valueOf(this.b.c()));
                    g.a.a.h.o oVar2 = c.f5708d[2];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, Long.valueOf(this.b.b()));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public c(String str, long j2, long j3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = j2;
            this.c = j3;
        }

        public final long b() {
            return this.c;
        }

        public final long c() {
            return this.b;
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.k.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public int hashCode() {
            String str = this.a;
            return ((((str != null ? str.hashCode() : 0) * 31) + defpackage.c.a(this.b)) * 31) + defpackage.c.a(this.c);
        }

        public String toString() {
            return "AllowedPeriod1(__typename=" + this.a + ", startsAt=" + this.b + ", endsAt=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(String str, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "AllowedPeriod" : str, j2, j3);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class d {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final g.a.a.h.o[] f5710d = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("startsAt", "startsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5938h, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final C0196a f5711e = new C0196a((DefaultConstructorMarker) null);
        private final String a;
        private final long b;
        private final long c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$d$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0196a {
            private C0196a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.f5710d[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = d.f5710d[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    long longValue = ((Number) c).longValue();
                    g.a.a.h.o oVar3 = d.f5710d[2];
                    if (oVar3 != null) {
                        Object c2 = oVar.c((o.d) oVar3);
                        kotlin.jvm.internal.k.c(c2);
                        return new d(f2, longValue, ((Number) c2).longValue());
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0196a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ d b;

            public b(d dVar) {
                this.b = dVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(d.f5710d[0], this.b.d());
                g.a.a.h.o oVar = d.f5710d[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, Long.valueOf(this.b.c()));
                    g.a.a.h.o oVar2 = d.f5710d[2];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, Long.valueOf(this.b.b()));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public d(String str, long j2, long j3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = j2;
            this.c = j3;
        }

        public final long b() {
            return this.c;
        }

        public final long c() {
            return this.b;
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
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public int hashCode() {
            String str = this.a;
            return ((((str != null ? str.hashCode() : 0) * 31) + defpackage.c.a(this.b)) * 31) + defpackage.c.a(this.c);
        }

        public String toString() {
            return "AllowedPeriod2(__typename=" + this.a + ", startsAt=" + this.b + ", endsAt=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "AllowedPeriod" : str, j2, j3);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final g.a.a.h.o[] f5712g = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("allowedPeriods", "allowedPeriods", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("kind", "kind", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.a("readable", "readable", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.a("writable", "writable", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.a("bit", "value", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: h  reason: collision with root package name */
        public static final C0197a f5713h = new C0197a((DefaultConstructorMarker) null);
        private final String a;
        private final List<c> b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f5714d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f5715e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f5716f;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$e$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0197a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$e$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0198a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, c> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0198a f5717h = new C0198a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.a$e$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetIotDeviceDetailsQuery.kt */
                static final class C0199a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, c> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0199a f5718h = new C0199a();

                    C0199a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final c o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return c.f5709e.a(oVar);
                    }
                }

                C0198a() {
                    super(1);
                }

                /* renamed from: a */
                public final c o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (c) bVar.b(C0199a.f5718h);
                }
            }

            private C0197a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                ArrayList arrayList;
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.f5712g[0]);
                kotlin.jvm.internal.k.c(f2);
                List<c> g2 = oVar.g(e.f5712g[1], C0198a.f5717h);
                if (g2 != null) {
                    ArrayList arrayList2 = new ArrayList(o.p(g2, 10));
                    for (c cVar : g2) {
                        kotlin.jvm.internal.k.c(cVar);
                        arrayList2.add(cVar);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                String f3 = oVar.f(e.f5712g[2]);
                kotlin.jvm.internal.k.c(f3);
                Boolean j2 = oVar.j(e.f5712g[3]);
                kotlin.jvm.internal.k.c(j2);
                boolean booleanValue = j2.booleanValue();
                Boolean j3 = oVar.j(e.f5712g[4]);
                kotlin.jvm.internal.k.c(j3);
                return new e(f2, arrayList, f3, booleanValue, j3.booleanValue(), oVar.j(e.f5712g[5]));
            }

            public /* synthetic */ C0197a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ e b;

            public b(e eVar) {
                this.b = eVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(e.f5712g[0], this.b.g());
                pVar.d(e.f5712g[1], this.b.b(), c.f5719h);
                pVar.f(e.f5712g[2], this.b.d());
                pVar.e(e.f5712g[3], Boolean.valueOf(this.b.e()));
                pVar.e(e.f5712g[4], Boolean.valueOf(this.b.f()));
                pVar.e(e.f5712g[5], this.b.c());
            }
        }

        /* compiled from: GetIotDeviceDetailsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends c>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5719h = new c();

            c() {
                super(2);
            }

            public final void a(List<c> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (c e2 : list) {
                        bVar.a(e2.e());
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public e(String str, List<c> list, String str2, boolean z, boolean z2, Boolean bool) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "kind");
            this.a = str;
            this.b = list;
            this.c = str2;
            this.f5714d = z;
            this.f5715e = z2;
            this.f5716f = bool;
        }

        public final List<c> b() {
            return this.b;
        }

        public final Boolean c() {
            return this.f5716f;
        }

        public final String d() {
            return this.c;
        }

        public final boolean e() {
            return this.f5714d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b) && kotlin.jvm.internal.k.a(this.c, eVar.c) && this.f5714d == eVar.f5714d && this.f5715e == eVar.f5715e && kotlin.jvm.internal.k.a(this.f5716f, eVar.f5716f);
        }

        public final boolean f() {
            return this.f5715e;
        }

        public final String g() {
            return this.a;
        }

        public g.a.a.h.s.n h() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<c> list = this.b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.f5714d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f5715e;
            if (!z3) {
                z2 = z3;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            Boolean bool = this.f5716f;
            if (bool != null) {
                i2 = bool.hashCode();
            }
            return i4 + i2;
        }

        public String toString() {
            return "AsBinary(__typename=" + this.a + ", allowedPeriods=" + this.b + ", kind=" + this.c + ", readable=" + this.f5714d + ", writable=" + this.f5715e + ", bit=" + this.f5716f + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, List list, String str2, boolean z, boolean z2, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Binary" : str, list, str2, z, z2, bool);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final g.a.a.h.o[] f5720i = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("allowedPeriods", "allowedPeriods", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("kind", "kind", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.a("readable", "readable", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.a("writable", "writable", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.c("value", "value", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.c("maxValue", "maxValue", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.c("minValue", "minValue", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: j  reason: collision with root package name */
        public static final C0200a f5721j = new C0200a((DefaultConstructorMarker) null);
        private final String a;
        private final List<d> b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f5722d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f5723e;

        /* renamed from: f  reason: collision with root package name */
        private final Double f5724f;

        /* renamed from: g  reason: collision with root package name */
        private final Double f5725g;

        /* renamed from: h  reason: collision with root package name */
        private final Double f5726h;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$f$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0200a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$f$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0201a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0201a f5727h = new C0201a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.a$f$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetIotDeviceDetailsQuery.kt */
                static final class C0202a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0202a f5728h = new C0202a();

                    C0202a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final d o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return d.f5711e.a(oVar);
                    }
                }

                C0201a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (d) bVar.b(C0202a.f5728h);
                }
            }

            private C0200a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                ArrayList arrayList;
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.f5720i[0]);
                kotlin.jvm.internal.k.c(f2);
                List<d> g2 = oVar.g(f.f5720i[1], C0201a.f5727h);
                if (g2 != null) {
                    ArrayList arrayList2 = new ArrayList(o.p(g2, 10));
                    for (d dVar : g2) {
                        kotlin.jvm.internal.k.c(dVar);
                        arrayList2.add(dVar);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                String f3 = oVar.f(f.f5720i[2]);
                kotlin.jvm.internal.k.c(f3);
                Boolean j2 = oVar.j(f.f5720i[3]);
                kotlin.jvm.internal.k.c(j2);
                boolean booleanValue = j2.booleanValue();
                Boolean j3 = oVar.j(f.f5720i[4]);
                kotlin.jvm.internal.k.c(j3);
                return new f(f2, arrayList, f3, booleanValue, j3.booleanValue(), oVar.k(f.f5720i[5]), oVar.k(f.f5720i[6]), oVar.k(f.f5720i[7]));
            }

            public /* synthetic */ C0200a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ f b;

            public b(f fVar) {
                this.b = fVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(f.f5720i[0], this.b.i());
                pVar.d(f.f5720i[1], this.b.b(), c.f5729h);
                pVar.f(f.f5720i[2], this.b.c());
                pVar.e(f.f5720i[3], Boolean.valueOf(this.b.f()));
                pVar.e(f.f5720i[4], Boolean.valueOf(this.b.h()));
                pVar.h(f.f5720i[5], this.b.g());
                pVar.h(f.f5720i[6], this.b.d());
                pVar.h(f.f5720i[7], this.b.e());
            }
        }

        /* compiled from: GetIotDeviceDetailsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends d>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5729h = new c();

            c() {
                super(2);
            }

            public final void a(List<d> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (d e2 : list) {
                        bVar.a(e2.e());
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public f(String str, List<d> list, String str2, boolean z, boolean z2, Double d2, Double d3, Double d4) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "kind");
            this.a = str;
            this.b = list;
            this.c = str2;
            this.f5722d = z;
            this.f5723e = z2;
            this.f5724f = d2;
            this.f5725g = d3;
            this.f5726h = d4;
        }

        public final List<d> b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final Double d() {
            return this.f5725g;
        }

        public final Double e() {
            return this.f5726h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && kotlin.jvm.internal.k.a(this.b, fVar.b) && kotlin.jvm.internal.k.a(this.c, fVar.c) && this.f5722d == fVar.f5722d && this.f5723e == fVar.f5723e && kotlin.jvm.internal.k.a(this.f5724f, fVar.f5724f) && kotlin.jvm.internal.k.a(this.f5725g, fVar.f5725g) && kotlin.jvm.internal.k.a(this.f5726h, fVar.f5726h);
        }

        public final boolean f() {
            return this.f5722d;
        }

        public final Double g() {
            return this.f5724f;
        }

        public final boolean h() {
            return this.f5723e;
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<d> list = this.b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.f5722d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f5723e;
            if (!z3) {
                z2 = z3;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            Double d2 = this.f5724f;
            int hashCode4 = (i4 + (d2 != null ? d2.hashCode() : 0)) * 31;
            Double d3 = this.f5725g;
            int hashCode5 = (hashCode4 + (d3 != null ? d3.hashCode() : 0)) * 31;
            Double d4 = this.f5726h;
            if (d4 != null) {
                i2 = d4.hashCode();
            }
            return hashCode5 + i2;
        }

        public final String i() {
            return this.a;
        }

        public g.a.a.h.s.n j() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public String toString() {
            return "AsNumeric(__typename=" + this.a + ", allowedPeriods=" + this.b + ", kind=" + this.c + ", readable=" + this.f5722d + ", writable=" + this.f5723e + ", value=" + this.f5724f + ", maxValue=" + this.f5725g + ", minValue=" + this.f5726h + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, List list, String str2, boolean z, boolean z2, Double d2, Double d3, Double d4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Numeric" : str, list, str2, z, z2, d2, d3, d4);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class g implements g.a.a.h.l {
        g() {
        }

        public String name() {
            return "GetIotDeviceDetails";
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class i implements k.b {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] b = {g.a.a.h.o.f9055g.g("viewer", "viewer", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};
        public static final C0203a c = new C0203a((DefaultConstructorMarker) null);
        private final o a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$i$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0203a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$i$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0204a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, o> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0204a f5730h = new C0204a();

                C0204a() {
                    super(1);
                }

                /* renamed from: a */
                public final o o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return o.f5758d.a(oVar);
                }
            }

            private C0203a() {
            }

            public final i a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new i((o) oVar.d(i.b[0], C0204a.f5730h));
            }

            public /* synthetic */ C0203a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ i b;

            public b(i iVar) {
                this.b = iVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                g.a.a.h.o oVar = i.b[0];
                o c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public i(o oVar) {
            this.a = oVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public final o c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && kotlin.jvm.internal.k.a(this.a, ((i) obj).a);
            }
            return true;
        }

        public int hashCode() {
            o oVar = this.a;
            if (oVar != null) {
                return oVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(viewer=" + this.a + ")";
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class j {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final g.a.a.h.o[] f5731e = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("externalIdentifier", "externalIdentifier", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: f  reason: collision with root package name */
        public static final C0205a f5732f = new C0205a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5733d;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$j$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0205a {
            private C0205a() {
            }

            public final j a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(j.f5731e[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = j.f5731e[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String f3 = oVar.f(j.f5731e[2]);
                    kotlin.jvm.internal.k.c(f3);
                    String f4 = oVar.f(j.f5731e[3]);
                    kotlin.jvm.internal.k.c(f4);
                    return new j(f2, (String) c, f3, f4);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0205a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ j b;

            public b(j jVar) {
                this.b = jVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(j.f5731e[0], this.b.e());
                g.a.a.h.o oVar = j.f5731e[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.c());
                    pVar.f(j.f5731e[2], this.b.d());
                    pVar.f(j.f5731e[3], this.b.b());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public j(String str, String str2, String str3, String str4) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            kotlin.jvm.internal.k.e(str3, "name");
            kotlin.jvm.internal.k.e(str4, "externalIdentifier");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f5733d = str4;
        }

        public final String b() {
            return this.f5733d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.k.a(this.a, jVar.a) && kotlin.jvm.internal.k.a(this.b, jVar.b) && kotlin.jvm.internal.k.a(this.c, jVar.c) && kotlin.jvm.internal.k.a(this.f5733d, jVar.f5733d);
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
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f5733d;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "IotDeviceType(__typename=" + this.a + ", id=" + this.b + ", name=" + this.c + ", externalIdentifier=" + this.f5733d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDeviceKind" : str, str2, str3, str4);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class k {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0206a f5734d = new C0206a((DefaultConstructorMarker) null);
        private final String a;
        private final List<m> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$k$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0206a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$k$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0207a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, m> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0207a f5735h = new C0207a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.a$k$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetIotDeviceDetailsQuery.kt */
                static final class C0208a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, m> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0208a f5736h = new C0208a();

                    C0208a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final m o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return m.f5743h.a(oVar);
                    }
                }

                C0207a() {
                    super(1);
                }

                /* renamed from: a */
                public final m o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (m) bVar.b(C0208a.f5736h);
                }
            }

            private C0206a() {
            }

            public final k a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(k.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new k(f2, oVar.g(k.c[1], C0207a.f5735h));
            }

            public /* synthetic */ C0206a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ k b;

            public b(k kVar) {
                this.b = kVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(k.c[0], this.b.c());
                pVar.d(k.c[1], this.b.b(), c.f5737h);
            }
        }

        /* compiled from: GetIotDeviceDetailsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends m>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5737h = new c();

            c() {
                super(2);
            }

            public final void a(List<m> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (m mVar : list) {
                        bVar.a(mVar != null ? mVar.h() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public k(String str, List<m> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<m> b() {
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
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.k.a(this.a, kVar.a) && kotlin.jvm.internal.k.a(this.b, kVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<m> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "IotDevices(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ k(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDeviceConnection" : str, list);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class l {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final g.a.a.h.o[] f5738e = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("iotDevices", "iotDevices", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: f  reason: collision with root package name */
        public static final C0209a f5739f = new C0209a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final k f5740d;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$l$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0209a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$l$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0210a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, k> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0210a f5741h = new C0210a();

                C0210a() {
                    super(1);
                }

                /* renamed from: a */
                public final k o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return k.f5734d.a(oVar);
                }
            }

            private C0209a() {
            }

            public final l a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(l.f5738e[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = l.f5738e[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String f3 = oVar.f(l.f5738e[2]);
                    Object d2 = oVar.d(l.f5738e[3], C0210a.f5741h);
                    kotlin.jvm.internal.k.c(d2);
                    return new l(f2, (String) c, f3, (k) d2);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0209a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ l b;

            public b(l lVar) {
                this.b = lVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(l.f5738e[0], this.b.e());
                g.a.a.h.o oVar = l.f5738e[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    pVar.f(l.f5738e[2], this.b.d());
                    pVar.c(l.f5738e[3], this.b.c().d());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public l(String str, String str2, String str3, k kVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            kotlin.jvm.internal.k.e(kVar, "iotDevices");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f5740d = kVar;
        }

        public final String b() {
            return this.b;
        }

        public final k c() {
            return this.f5740d;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.k.a(this.a, lVar.a) && kotlin.jvm.internal.k.a(this.b, lVar.b) && kotlin.jvm.internal.k.a(this.c, lVar.c) && kotlin.jvm.internal.k.a(this.f5740d, lVar.f5740d);
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
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            k kVar = this.f5740d;
            if (kVar != null) {
                i2 = kVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", id=" + this.b + ", name=" + this.c + ", iotDevices=" + this.f5740d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ l(String str, String str2, String str3, k kVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2, str3, kVar);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class m {
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final g.a.a.h.o[] f5742g = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("allowedPeriods", "allowedPeriods", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("iotDeviceType", "iotDeviceType", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("properties", "properties", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: h  reason: collision with root package name */
        public static final C0211a f5743h = new C0211a((DefaultConstructorMarker) null);
        private final String a;
        private final List<b> b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5744d;

        /* renamed from: e  reason: collision with root package name */
        private final j f5745e;

        /* renamed from: f  reason: collision with root package name */
        private final List<n> f5746f;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$m$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0211a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$m$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0212a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, b> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0212a f5747h = new C0212a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.a$m$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetIotDeviceDetailsQuery.kt */
                static final class C0213a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, b> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0213a f5748h = new C0213a();

                    C0213a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final b o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return b.f5707e.a(oVar);
                    }
                }

                C0212a() {
                    super(1);
                }

                /* renamed from: a */
                public final b o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (b) bVar.b(C0213a.f5748h);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$m$a$b */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, j> {

                /* renamed from: h  reason: collision with root package name */
                public static final b f5749h = new b();

                b() {
                    super(1);
                }

                /* renamed from: a */
                public final j o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return j.f5732f.a(oVar);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$m$a$c */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, n> {

                /* renamed from: h  reason: collision with root package name */
                public static final c f5750h = new c();

                /* renamed from: com.sensorberg.smartspaces.backend.j.a$m$a$c$a  reason: collision with other inner class name */
                /* compiled from: GetIotDeviceDetailsQuery.kt */
                static final class C0214a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, n> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0214a f5751h = new C0214a();

                    C0214a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final n o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return n.f5755e.a(oVar);
                    }
                }

                c() {
                    super(1);
                }

                /* renamed from: a */
                public final n o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (n) bVar.b(C0214a.f5751h);
                }
            }

            private C0211a() {
            }

            public final m a(g.a.a.h.s.o oVar) {
                ArrayList arrayList;
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(m.f5742g[0]);
                kotlin.jvm.internal.k.c(f2);
                List<b> g2 = oVar.g(m.f5742g[1], C0212a.f5747h);
                ArrayList arrayList2 = null;
                if (g2 != null) {
                    arrayList = new ArrayList(o.p(g2, 10));
                    for (b bVar : g2) {
                        kotlin.jvm.internal.k.c(bVar);
                        arrayList.add(bVar);
                    }
                } else {
                    arrayList = null;
                }
                g.a.a.h.o oVar2 = m.f5742g[2];
                if (oVar2 != null) {
                    Object c2 = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c2);
                    String str = (String) c2;
                    String f3 = oVar.f(m.f5742g[3]);
                    j jVar = (j) oVar.d(m.f5742g[4], b.f5749h);
                    List<n> g3 = oVar.g(m.f5742g[5], c.f5750h);
                    if (g3 != null) {
                        arrayList2 = new ArrayList(o.p(g3, 10));
                        for (n nVar : g3) {
                            kotlin.jvm.internal.k.c(nVar);
                            arrayList2.add(nVar);
                        }
                    }
                    return new m(f2, arrayList, str, f3, jVar, arrayList2);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0211a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ m b;

            public b(m mVar) {
                this.b = mVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(m.f5742g[0], this.b.g());
                pVar.d(m.f5742g[1], this.b.b(), c.f5752h);
                g.a.a.h.o oVar = m.f5742g[2];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.c());
                    pVar.f(m.f5742g[3], this.b.e());
                    g.a.a.h.o oVar2 = m.f5742g[4];
                    j d2 = this.b.d();
                    pVar.c(oVar2, d2 != null ? d2.f() : null);
                    pVar.d(m.f5742g[5], this.b.f(), d.f5753h);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        /* compiled from: GetIotDeviceDetailsQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends b>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5752h = new c();

            c() {
                super(2);
            }

            public final void a(List<b> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (b e2 : list) {
                        bVar.a(e2.e());
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        /* compiled from: GetIotDeviceDetailsQuery.kt */
        static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends n>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final d f5753h = new d();

            d() {
                super(2);
            }

            public final void a(List<n> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (n e2 : list) {
                        bVar.a(e2.e());
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public m(String str, List<b> list, String str2, String str3, j jVar, List<n> list2) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = list;
            this.c = str2;
            this.f5744d = str3;
            this.f5745e = jVar;
            this.f5746f = list2;
        }

        public final List<b> b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final j d() {
            return this.f5745e;
        }

        public final String e() {
            return this.f5744d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.k.a(this.a, mVar.a) && kotlin.jvm.internal.k.a(this.b, mVar.b) && kotlin.jvm.internal.k.a(this.c, mVar.c) && kotlin.jvm.internal.k.a(this.f5744d, mVar.f5744d) && kotlin.jvm.internal.k.a(this.f5745e, mVar.f5745e) && kotlin.jvm.internal.k.a(this.f5746f, mVar.f5746f);
        }

        public final List<n> f() {
            return this.f5746f;
        }

        public final String g() {
            return this.a;
        }

        public final g.a.a.h.s.n h() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<b> list = this.b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f5744d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            j jVar = this.f5745e;
            int hashCode5 = (hashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            List<n> list2 = this.f5746f;
            if (list2 != null) {
                i2 = list2.hashCode();
            }
            return hashCode5 + i2;
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", allowedPeriods=" + this.b + ", id=" + this.c + ", name=" + this.f5744d + ", iotDeviceType=" + this.f5745e + ", properties=" + this.f5746f + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ m(String str, List list, String str2, String str3, j jVar, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDevice" : str, list, str2, str3, jVar, list2);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class n {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final g.a.a.h.o[] f5754d = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.d("__typename", "__typename", m.b(o.c.a.a(new String[]{"Binary"}))), g.a.a.h.o.f9055g.d("__typename", "__typename", m.b(o.c.a.a(new String[]{"Numeric"})))};

        /* renamed from: e  reason: collision with root package name */
        public static final C0215a f5755e = new C0215a((DefaultConstructorMarker) null);
        private final String a;
        private final e b;
        private final f c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$n$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0215a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$n$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0216a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0216a f5756h = new C0216a();

                C0216a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return e.f5713h.a(oVar);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$n$a$b */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final b f5757h = new b();

                b() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f5721j.a(oVar);
                }
            }

            private C0215a() {
            }

            public final n a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(n.f5754d[0]);
                kotlin.jvm.internal.k.c(f2);
                return new n(f2, (e) oVar.b(n.f5754d[1], C0216a.f5756h), (f) oVar.b(n.f5754d[2], b.f5757h));
            }

            public /* synthetic */ C0215a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ n b;

            public b(n nVar) {
                this.b = nVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(n.f5754d[0], this.b.d());
                e b2 = this.b.b();
                g.a.a.h.s.n nVar = null;
                pVar.g(b2 != null ? b2.h() : null);
                f c = this.b.c();
                if (c != null) {
                    nVar = c.j();
                }
                pVar.g(nVar);
            }
        }

        public n(String str, e eVar, f fVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = eVar;
            this.c = fVar;
        }

        public final e b() {
            return this.b;
        }

        public final f c() {
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
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.k.a(this.a, nVar.a) && kotlin.jvm.internal.k.a(this.b, nVar.b) && kotlin.jvm.internal.k.a(this.c, nVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            e eVar = this.b;
            int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
            f fVar = this.c;
            if (fVar != null) {
                i2 = fVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "Property(__typename=" + this.a + ", asBinary=" + this.b + ", asNumeric=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ n(String str, e eVar, f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Property" : str, eVar, fVar);
        }
    }

    /* compiled from: GetIotDeviceDetailsQuery.kt */
    public static final class o {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("accessibleUnits", "accessibleUnits", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0217a f5758d = new C0217a((DefaultConstructorMarker) null);
        private final String a;
        private final C0189a b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.a$o$a  reason: collision with other inner class name */
        /* compiled from: GetIotDeviceDetailsQuery.kt */
        public static final class C0217a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.a$o$a$a  reason: collision with other inner class name */
            /* compiled from: GetIotDeviceDetailsQuery.kt */
            static final class C0218a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, C0189a> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0218a f5759h = new C0218a();

                C0218a() {
                    super(1);
                }

                /* renamed from: a */
                public final C0189a o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return C0189a.f5702d.a(oVar);
                }
            }

            private C0217a() {
            }

            public final o a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(o.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new o(f2, (C0189a) oVar.d(o.c[1], C0218a.f5759h));
            }

            public /* synthetic */ C0217a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ o b;

            public b(o oVar) {
                this.b = oVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(o.c[0], this.b.c());
                g.a.a.h.o oVar = o.c[1];
                C0189a b2 = this.b.b();
                pVar.c(oVar, b2 != null ? b2.d() : null);
            }
        }

        public o(String str, C0189a aVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = aVar;
        }

        public final C0189a b() {
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
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return kotlin.jvm.internal.k.a(this.a, oVar.a) && kotlin.jvm.internal.k.a(this.b, oVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C0189a aVar = this.b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Viewer(__typename=" + this.a + ", accessibleUnits=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ o(String str, C0189a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Viewer" : str, aVar);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class p implements g.a.a.h.s.m<i> {
        public i a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return i.c.a(oVar);
        }
    }

    static {
        new h((DefaultConstructorMarker) null);
    }

    public l.i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "4df53629373e317350709cf1a0258b949c0364068c13b1207aace0e9f7ddf3e5";
    }

    public g.a.a.h.s.m<i> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new p();
    }

    public l.i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return b;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        i iVar = (i) bVar;
        h(iVar);
        return iVar;
    }

    public k.c g() {
        return g.a.a.h.k.a;
    }

    public i h(i iVar) {
        return iVar;
    }

    public g.a.a.h.l name() {
        return c;
    }
}
