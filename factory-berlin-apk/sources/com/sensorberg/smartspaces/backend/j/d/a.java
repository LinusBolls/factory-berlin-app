package com.sensorberg.smartspaces.backend.j.d;

import g.a.a.h.k;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.g;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.o;
import g.a.a.h.s.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.x;

/* compiled from: GetPostBoxQuery.kt */
public final class a implements g.a.a.h.m<h, h, k.c> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f5853e = g.a.a.h.s.k.a("query GetPostBox($id: String!, $deviceTypes: [String!]!) {\n  viewer {\n    __typename\n    accessibleUnits(ids: [$id]) {\n      __typename\n      nodes {\n        __typename\n        iotDevices(deviceTypes: $deviceTypes) {\n          __typename\n          nodes {\n            __typename\n            properties {\n              __typename\n              ... on Binary {\n                things {\n                  __typename\n                  connector {\n                    __typename\n                    ... on MyRenzParcelBox {\n                      pkaIdShort\n                    }\n                    ... on MyRenzBox {\n                      pkaIdShort\n                      username\n                      password\n                    }\n                  }\n                }\n              }\n            }\n          }\n        }\n      }\n    }\n  }\n}");

    /* renamed from: f  reason: collision with root package name */
    private static final g.a.a.h.l f5854f = new e();
    private final transient k.c b = new p(this);
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f5855d;

    /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$a  reason: collision with other inner class name */
    /* compiled from: GetPostBoxQuery.kt */
    public static final class C0263a {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0264a f5856d = new C0264a((DefaultConstructorMarker) null);
        private final String a;
        private final List<j> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$a$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0264a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$a$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0265a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, j> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0265a f5857h = new C0265a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$a$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetPostBoxQuery.kt */
                static final class C0266a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, j> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0266a f5858h = new C0266a();

                    C0266a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final j o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return j.f5877d.a(oVar);
                    }
                }

                C0265a() {
                    super(1);
                }

                /* renamed from: a */
                public final j o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (j) bVar.b(C0266a.f5858h);
                }
            }

            private C0264a() {
            }

            public final C0263a a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(C0263a.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new C0263a(f2, oVar.g(C0263a.c[1], C0265a.f5857h));
            }

            public /* synthetic */ C0264a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$a$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ C0263a b;

            public b(C0263a aVar) {
                this.b = aVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(C0263a.c[0], this.b.c());
                pVar.d(C0263a.c[1], this.b.b(), c.f5859h);
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$a$c */
        /* compiled from: GetPostBoxQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends j>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5859h = new c();

            c() {
                super(2);
            }

            public final void a(List<j> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (j jVar : list) {
                        bVar.a(jVar != null ? jVar.d() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public C0263a(String str, List<j> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<j> b() {
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
            if (!(obj instanceof C0263a)) {
                return false;
            }
            C0263a aVar = (C0263a) obj;
            return kotlin.jvm.internal.k.a(this.a, aVar.a) && kotlin.jvm.internal.k.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<j> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "AccessibleUnits(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0263a(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitConnection" : str, list);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class b {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("things", "things", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0267a f5860d = new C0267a((DefaultConstructorMarker) null);
        private final String a;
        private final List<m> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$b$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0267a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$b$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0268a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, m> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0268a f5861h = new C0268a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$b$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetPostBoxQuery.kt */
                static final class C0269a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, m> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0269a f5862h = new C0269a();

                    C0269a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final m o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return m.f5885d.a(oVar);
                    }
                }

                C0268a() {
                    super(1);
                }

                /* renamed from: a */
                public final m o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (m) bVar.b(C0269a.f5862h);
                }
            }

            private C0267a() {
            }

            public final b a(g.a.a.h.s.o oVar) {
                ArrayList arrayList;
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(b.c[0]);
                kotlin.jvm.internal.k.c(f2);
                List<m> g2 = oVar.g(b.c[1], C0268a.f5861h);
                if (g2 != null) {
                    arrayList = new ArrayList(o.p(g2, 10));
                    for (m mVar : g2) {
                        kotlin.jvm.internal.k.c(mVar);
                        arrayList.add(mVar);
                    }
                } else {
                    arrayList = null;
                }
                return new b(f2, arrayList);
            }

            public /* synthetic */ C0267a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$b$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0270b implements g.a.a.h.s.n {
            final /* synthetic */ b b;

            public C0270b(b bVar) {
                this.b = bVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(b.c[0], this.b.c());
                pVar.d(b.c[1], this.b.b(), c.f5863h);
            }
        }

        /* compiled from: GetPostBoxQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends m>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5863h = new c();

            c() {
                super(2);
            }

            public final void a(List<m> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (m d2 : list) {
                        bVar.a(d2.d());
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public b(String str, List<m> list) {
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

        public g.a.a.h.s.n d() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0270b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.k.a(this.a, bVar.a) && kotlin.jvm.internal.k.a(this.b, bVar.b);
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
            return "AsBinary(__typename=" + this.a + ", things=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Binary" : str, list);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class c {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final g.a.a.h.o[] f5864e = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("pkaIdShort", "pkaIdShort", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("username", "username", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("password", "password", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: f  reason: collision with root package name */
        public static final C0271a f5865f = new C0271a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5866d;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$c$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0271a {
            private C0271a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(c.f5864e[0]);
                kotlin.jvm.internal.k.c(f2);
                String f3 = oVar.f(c.f5864e[1]);
                kotlin.jvm.internal.k.c(f3);
                return new c(f2, f3, oVar.f(c.f5864e[2]), oVar.f(c.f5864e[3]));
            }

            public /* synthetic */ C0271a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(c.f5864e[0], this.b.e());
                pVar.f(c.f5864e[1], this.b.c());
                pVar.f(c.f5864e[2], this.b.d());
                pVar.f(c.f5864e[3], this.b.b());
            }
        }

        public c(String str, String str2, String str3, String str4) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "pkaIdShort");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f5866d = str4;
        }

        public final String b() {
            return this.f5866d;
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.k.a(this.a, cVar.a) && kotlin.jvm.internal.k.a(this.b, cVar.b) && kotlin.jvm.internal.k.a(this.c, cVar.c) && kotlin.jvm.internal.k.a(this.f5866d, cVar.f5866d);
        }

        public g.a.a.h.s.n f() {
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
            String str4 = this.f5866d;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "AsMyRenzBox(__typename=" + this.a + ", pkaIdShort=" + this.b + ", username=" + this.c + ", password=" + this.f5866d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "MyRenzBox" : str, str2, str3, str4);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class d {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("pkaIdShort", "pkaIdShort", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0272a f5867d = new C0272a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$d$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0272a {
            private C0272a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.c[0]);
                kotlin.jvm.internal.k.c(f2);
                String f3 = oVar.f(d.c[1]);
                kotlin.jvm.internal.k.c(f3);
                return new d(f2, f3);
            }

            public /* synthetic */ C0272a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(d.c[0], this.b.c());
                pVar.f(d.c[1], this.b.b());
            }
        }

        public d(String str, String str2) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "pkaIdShort");
            this.a = str;
            this.b = str2;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public g.a.a.h.s.n d() {
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
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b);
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
            return "AsMyRenzParcelBox(__typename=" + this.a + ", pkaIdShort=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "MyRenzParcelBox" : str, str2);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class e implements g.a.a.h.l {
        e() {
        }

        public String name() {
            return "GetPostBox";
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class g {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final g.a.a.h.o[] f5868d = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.d("__typename", "__typename", m.b(o.c.a.a(new String[]{"MyRenzParcelBox"}))), g.a.a.h.o.f9055g.d("__typename", "__typename", m.b(o.c.a.a(new String[]{"MyRenzBox"})))};

        /* renamed from: e  reason: collision with root package name */
        public static final C0273a f5869e = new C0273a((DefaultConstructorMarker) null);
        private final String a;
        private final d b;
        private final c c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$g$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0273a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$g$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0274a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, c> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0274a f5870h = new C0274a();

                C0274a() {
                    super(1);
                }

                /* renamed from: a */
                public final c o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return c.f5865f.a(oVar);
                }
            }

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$g$a$b */
            /* compiled from: GetPostBoxQuery.kt */
            static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final b f5871h = new b();

                b() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return d.f5867d.a(oVar);
                }
            }

            private C0273a() {
            }

            public final g a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(g.f5868d[0]);
                kotlin.jvm.internal.k.c(f2);
                return new g(f2, (d) oVar.b(g.f5868d[1], b.f5871h), (c) oVar.b(g.f5868d[2], C0274a.f5870h));
            }

            public /* synthetic */ C0273a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ g b;

            public b(g gVar) {
                this.b = gVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(g.f5868d[0], this.b.d());
                d c = this.b.c();
                g.a.a.h.s.n nVar = null;
                pVar.g(c != null ? c.d() : null);
                c b2 = this.b.b();
                if (b2 != null) {
                    nVar = b2.f();
                }
                pVar.g(nVar);
            }
        }

        public g(String str, d dVar, c cVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = dVar;
            this.c = cVar;
        }

        public final c b() {
            return this.c;
        }

        public final d c() {
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
            d dVar = this.b;
            int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
            c cVar = this.c;
            if (cVar != null) {
                i2 = cVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "Connector(__typename=" + this.a + ", asMyRenzParcelBox=" + this.b + ", asMyRenzBox=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(String str, d dVar, c cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Connector" : str, dVar, cVar);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class h implements k.b {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] b = {g.a.a.h.o.f9055g.g("viewer", "viewer", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};
        public static final C0275a c = new C0275a((DefaultConstructorMarker) null);
        private final n a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$h$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0275a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$h$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0276a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, n> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0276a f5872h = new C0276a();

                C0276a() {
                    super(1);
                }

                /* renamed from: a */
                public final n o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return n.f5887d.a(oVar);
                }
            }

            private C0275a() {
            }

            public final h a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new h((n) oVar.d(h.b[0], C0276a.f5872h));
            }

            public /* synthetic */ C0275a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ h b;

            public b(h hVar) {
                this.b = hVar;
            }

            public void a(g.a.a.h.s.p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                g.a.a.h.o oVar = h.b[0];
                n c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public h(n nVar) {
            this.a = nVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public final n c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof h) && kotlin.jvm.internal.k.a(this.a, ((h) obj).a);
            }
            return true;
        }

        public int hashCode() {
            n nVar = this.a;
            if (nVar != null) {
                return nVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(viewer=" + this.a + ")";
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class i {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0277a f5873d = new C0277a((DefaultConstructorMarker) null);
        private final String a;
        private final List<k> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$i$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0277a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$i$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0278a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, k> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0278a f5874h = new C0278a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$i$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetPostBoxQuery.kt */
                static final class C0279a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, k> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0279a f5875h = new C0279a();

                    C0279a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final k o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return k.f5879d.a(oVar);
                    }
                }

                C0278a() {
                    super(1);
                }

                /* renamed from: a */
                public final k o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (k) bVar.b(C0279a.f5875h);
                }
            }

            private C0277a() {
            }

            public final i a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(i.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new i(f2, oVar.g(i.c[1], C0278a.f5874h));
            }

            public /* synthetic */ C0277a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(i.c[0], this.b.c());
                pVar.d(i.c[1], this.b.b(), c.f5876h);
            }
        }

        /* compiled from: GetPostBoxQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends k>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5876h = new c();

            c() {
                super(2);
            }

            public final void a(List<k> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (k kVar : list) {
                        bVar.a(kVar != null ? kVar.d() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public i(String str, List<k> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<k> b() {
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
            List<k> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "IotDevices(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ i(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDeviceConnection" : str, list);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class j {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("iotDevices", "iotDevices", d0.b(kotlin.n.a("deviceTypes", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "deviceTypes")))), false, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0280a f5877d = new C0280a((DefaultConstructorMarker) null);
        private final String a;
        private final i b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$j$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0280a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$j$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0281a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, i> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0281a f5878h = new C0281a();

                C0281a() {
                    super(1);
                }

                /* renamed from: a */
                public final i o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return i.f5873d.a(oVar);
                }
            }

            private C0280a() {
            }

            public final j a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(j.c[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(j.c[1], C0281a.f5878h);
                kotlin.jvm.internal.k.c(d2);
                return new j(f2, (i) d2);
            }

            public /* synthetic */ C0280a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(j.c[0], this.b.c());
                pVar.c(j.c[1], this.b.b().d());
            }
        }

        public j(String str, i iVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(iVar, "iotDevices");
            this.a = str;
            this.b = iVar;
        }

        public final i b() {
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
            i iVar = this.b;
            if (iVar != null) {
                i2 = iVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", iotDevices=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(String str, i iVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, iVar);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class k {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("properties", "properties", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0282a f5879d = new C0282a((DefaultConstructorMarker) null);
        private final String a;
        private final List<l> b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$k$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0282a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$k$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0283a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, l> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0283a f5880h = new C0283a();

                /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$k$a$a$a  reason: collision with other inner class name */
                /* compiled from: GetPostBoxQuery.kt */
                static final class C0284a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, l> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0284a f5881h = new C0284a();

                    C0284a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final l o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return l.f5883d.a(oVar);
                    }
                }

                C0283a() {
                    super(1);
                }

                /* renamed from: a */
                public final l o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (l) bVar.b(C0284a.f5881h);
                }
            }

            private C0282a() {
            }

            public final k a(g.a.a.h.s.o oVar) {
                ArrayList arrayList;
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(k.c[0]);
                kotlin.jvm.internal.k.c(f2);
                List<l> g2 = oVar.g(k.c[1], C0283a.f5880h);
                if (g2 != null) {
                    arrayList = new ArrayList(o.p(g2, 10));
                    for (l lVar : g2) {
                        kotlin.jvm.internal.k.c(lVar);
                        arrayList.add(lVar);
                    }
                } else {
                    arrayList = null;
                }
                return new k(f2, arrayList);
            }

            public /* synthetic */ C0282a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.d(k.c[1], this.b.b(), c.f5882h);
            }
        }

        /* compiled from: GetPostBoxQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends l>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5882h = new c();

            c() {
                super(2);
            }

            public final void a(List<l> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (l d2 : list) {
                        bVar.a(d2.d());
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public k(String str, List<l> list) {
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
            List<l> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", properties=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ k(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDevice" : str, list);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class l {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.d("__typename", "__typename", m.b(o.c.a.a(new String[]{"Binary"})))};

        /* renamed from: d  reason: collision with root package name */
        public static final C0285a f5883d = new C0285a((DefaultConstructorMarker) null);
        private final String a;
        private final b b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$l$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0285a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$l$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0286a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, b> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0286a f5884h = new C0286a();

                C0286a() {
                    super(1);
                }

                /* renamed from: a */
                public final b o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return b.f5860d.a(oVar);
                }
            }

            private C0285a() {
            }

            public final l a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(l.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new l(f2, (b) oVar.b(l.c[1], C0286a.f5884h));
            }

            public /* synthetic */ C0285a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(l.c[0], this.b.c());
                b b2 = this.b.b();
                pVar.g(b2 != null ? b2.d() : null);
            }
        }

        public l(String str, b bVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = bVar;
        }

        public final b b() {
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
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.k.a(this.a, lVar.a) && kotlin.jvm.internal.k.a(this.b, lVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            b bVar = this.b;
            if (bVar != null) {
                i2 = bVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Property(__typename=" + this.a + ", asBinary=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ l(String str, b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Property" : str, bVar);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class m {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("connector", "connector", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0287a f5885d = new C0287a((DefaultConstructorMarker) null);
        private final String a;
        private final g b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$m$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0287a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$m$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0288a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, g> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0288a f5886h = new C0288a();

                C0288a() {
                    super(1);
                }

                /* renamed from: a */
                public final g o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return g.f5869e.a(oVar);
                }
            }

            private C0287a() {
            }

            public final m a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(m.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new m(f2, (g) oVar.d(m.c[1], C0288a.f5886h));
            }

            public /* synthetic */ C0287a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(m.c[0], this.b.c());
                g.a.a.h.o oVar = m.c[1];
                g b2 = this.b.b();
                pVar.c(oVar, b2 != null ? b2.e() : null);
            }
        }

        public m(String str, g gVar) {
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
            return new b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.k.a(this.a, mVar.a) && kotlin.jvm.internal.k.a(this.b, mVar.b);
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
            return "Thing(__typename=" + this.a + ", connector=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ m(String str, g gVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Thing" : str, gVar);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class n {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("accessibleUnits", "accessibleUnits", d0.b(kotlin.n.a("ids", "[{kind=Variable, variableName=id}]")), true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0289a f5887d = new C0289a((DefaultConstructorMarker) null);
        private final String a;
        private final C0263a b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$n$a  reason: collision with other inner class name */
        /* compiled from: GetPostBoxQuery.kt */
        public static final class C0289a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$n$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0290a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, C0263a> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0290a f5888h = new C0290a();

                C0290a() {
                    super(1);
                }

                /* renamed from: a */
                public final C0263a o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return C0263a.f5856d.a(oVar);
                }
            }

            private C0289a() {
            }

            public final n a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(n.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new n(f2, (C0263a) oVar.d(n.c[1], C0290a.f5888h));
            }

            public /* synthetic */ C0289a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(n.c[0], this.b.c());
                g.a.a.h.o oVar = n.c[1];
                C0263a b2 = this.b.b();
                pVar.c(oVar, b2 != null ? b2.d() : null);
            }
        }

        public n(String str, C0263a aVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = aVar;
        }

        public final C0263a b() {
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
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.k.a(this.a, nVar.a) && kotlin.jvm.internal.k.a(this.b, nVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C0263a aVar = this.b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Viewer(__typename=" + this.a + ", accessibleUnits=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ n(String str, C0263a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Viewer" : str, aVar);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class o implements g.a.a.h.s.m<h> {
        public h a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return h.c.a(oVar);
        }
    }

    /* compiled from: GetPostBoxQuery.kt */
    public static final class p extends k.c {
        final /* synthetic */ a a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$p$a  reason: collision with other inner class name */
        /* compiled from: InputFieldMarshaller.kt */
        public static final class C0291a implements g.a.a.h.s.f {
            final /* synthetic */ p b;

            /* renamed from: com.sensorberg.smartspaces.backend.j.d.a$p$a$a  reason: collision with other inner class name */
            /* compiled from: GetPostBoxQuery.kt */
            static final class C0292a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.b, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C0291a f5889h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0292a(C0291a aVar) {
                    super(1);
                    this.f5889h = aVar;
                }

                public final void a(g.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                    for (String b : this.f5889h.b.a.h()) {
                        bVar.b(b);
                    }
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((g.b) obj);
                    return x.a;
                }
            }

            public C0291a(p pVar) {
                this.b = pVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
                gVar.e("id", this.b.a.i());
                gVar.c("deviceTypes", new C0292a(this));
            }
        }

        p(a aVar) {
            this.a = aVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new C0291a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", this.a.i());
            linkedHashMap.put("deviceTypes", this.a.h());
            return linkedHashMap;
        }
    }

    static {
        new f((DefaultConstructorMarker) null);
    }

    public a(String str, List<String> list) {
        kotlin.jvm.internal.k.e(str, "id");
        kotlin.jvm.internal.k.e(list, "deviceTypes");
        this.c = str;
        this.f5855d = list;
    }

    public l.i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "6b905c50cbdd86b05ce90da1720676d616e397d051fbeeff91846bec2bab1ec1";
    }

    public g.a.a.h.s.m<h> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new o();
    }

    public l.i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f5853e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.k.a(this.c, aVar.c) && kotlin.jvm.internal.k.a(this.f5855d, aVar.f5855d);
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        h hVar = (h) bVar;
        j(hVar);
        return hVar;
    }

    public k.c g() {
        return this.b;
    }

    public final List<String> h() {
        return this.f5855d;
    }

    public int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f5855d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String i() {
        return this.c;
    }

    public h j(h hVar) {
        return hVar;
    }

    public g.a.a.h.l name() {
        return f5854f;
    }

    public String toString() {
        return "GetPostBoxQuery(id=" + this.c + ", deviceTypes=" + this.f5855d + ")";
    }
}
