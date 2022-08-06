package com.sensorberg.smartworkspace.app.i;

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

/* compiled from: SpacesWithExternalIdentifiersQuery.kt */
public final class e implements m<d, d, k.c> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f7136d = g.a.a.h.s.k.a("query SpacesWithExternalIdentifiers($externalIdentifiers: [String!]) {\n  viewer {\n    __typename\n    accessibleUnits(unitTypeExternalIdentifier: $externalIdentifiers) {\n      __typename\n      nodes {\n        __typename\n        id\n        name\n        iotDevices {\n          __typename\n          nodes {\n            __typename\n            id\n          }\n        }\n      }\n    }\n  }\n}");

    /* renamed from: e  reason: collision with root package name */
    private static final l f7137e = new b();
    private final transient k.c b;
    private final g.a.a.h.h<List<String>> c;

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class a {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0463a f7138d = new C0463a((DefaultConstructorMarker) null);
        private final String a;
        private final List<f> b;

        /* renamed from: com.sensorberg.smartworkspace.app.i.e$a$a  reason: collision with other inner class name */
        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        public static final class C0463a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.e$a$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
            static final class C0464a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0464a f7139h = new C0464a();

                /* renamed from: com.sensorberg.smartworkspace.app.i.e$a$a$a$a  reason: collision with other inner class name */
                /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
                static final class C0465a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0465a f7140h = new C0465a();

                    C0465a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final f o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return f.f7148f.a(oVar);
                    }
                }

                C0464a() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (f) bVar.b(C0465a.f7140h);
                }
            }

            private C0463a() {
            }

            public final a a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(a.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new a(f2, oVar.g(a.c[1], C0464a.f7139h));
            }

            public /* synthetic */ C0463a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ a b;

            public b(a aVar) {
                this.b = aVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(a.c[0], this.b.c());
                pVar.d(a.c[1], this.b.b(), c.f7141h);
            }
        }

        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends f>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f7141h = new c();

            c() {
                super(2);
            }

            public final void a(List<f> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (f fVar : list) {
                        bVar.a(fVar != null ? fVar.f() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public a(String str, List<f> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<f> b() {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.k.a(this.a, aVar.a) && kotlin.jvm.internal.k.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<f> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "AccessibleUnits(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitConnection" : str, list);
        }
    }

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class b implements l {
        b() {
        }

        public String name() {
            return "SpacesWithExternalIdentifiers";
        }
    }

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class d implements k.b {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] b = {g.a.a.h.o.f9055g.g("viewer", "viewer", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final h a;

        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.e$d$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
            static final class C0466a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, h> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0466a f7142h = new C0466a();

                C0466a() {
                    super(1);
                }

                /* renamed from: a */
                public final h o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return h.f7152d.a(oVar);
                }
            }

            private a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new d((h) oVar.d(d.b[0], C0466a.f7142h));
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
                g.a.a.h.o oVar = d.b[0];
                h c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public d(h hVar) {
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
                return (obj instanceof d) && kotlin.jvm.internal.k.a(this.a, ((d) obj).a);
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

    /* renamed from: com.sensorberg.smartworkspace.app.i.e$e  reason: collision with other inner class name */
    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class C0467e {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f7143d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final List<g> b;

        /* renamed from: com.sensorberg.smartworkspace.app.i.e$e$a */
        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.e$e$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
            static final class C0468a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, g> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0468a f7144h = new C0468a();

                /* renamed from: com.sensorberg.smartworkspace.app.i.e$e$a$a$a  reason: collision with other inner class name */
                /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
                static final class C0469a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, g> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0469a f7145h = new C0469a();

                    C0469a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final g o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return g.f7151d.a(oVar);
                    }
                }

                C0468a() {
                    super(1);
                }

                /* renamed from: a */
                public final g o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (g) bVar.b(C0469a.f7145h);
                }
            }

            private a() {
            }

            public final C0467e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(C0467e.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new C0467e(f2, oVar.g(C0467e.c[1], C0468a.f7144h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.i.e$e$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ C0467e b;

            public b(C0467e eVar) {
                this.b = eVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(C0467e.c[0], this.b.c());
                pVar.d(C0467e.c[1], this.b.b(), c.f7146h);
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.i.e$e$c */
        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends g>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f7146h = new c();

            c() {
                super(2);
            }

            public final void a(List<g> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (g gVar : list) {
                        bVar.a(gVar != null ? gVar.d() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public C0467e(String str, List<g> list) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List<g> b() {
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
            if (!(obj instanceof C0467e)) {
                return false;
            }
            C0467e eVar = (C0467e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<g> list = this.b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "IotDevices(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0467e(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDeviceConnection" : str, list);
        }
    }

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final g.a.a.h.o[] f7147e = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartworkspace.app.i.f.a.f7154g, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("iotDevices", "iotDevices", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: f  reason: collision with root package name */
        public static final a f7148f = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final C0467e f7149d;

        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.e$f$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
            static final class C0470a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, C0467e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0470a f7150h = new C0470a();

                C0470a() {
                    super(1);
                }

                /* renamed from: a */
                public final C0467e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return C0467e.f7143d.a(oVar);
                }
            }

            private a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.f7147e[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = f.f7147e[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String f3 = oVar.f(f.f7147e[2]);
                    Object d2 = oVar.d(f.f7147e[3], C0470a.f7150h);
                    kotlin.jvm.internal.k.c(d2);
                    return new f(f2, (String) c, f3, (C0467e) d2);
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
                pVar.f(f.f7147e[0], this.b.e());
                g.a.a.h.o oVar = f.f7147e[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    pVar.f(f.f7147e[2], this.b.d());
                    pVar.c(f.f7147e[3], this.b.c().d());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public f(String str, String str2, String str3, C0467e eVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            kotlin.jvm.internal.k.e(eVar, "iotDevices");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f7149d = eVar;
        }

        public final String b() {
            return this.b;
        }

        public final C0467e c() {
            return this.f7149d;
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && kotlin.jvm.internal.k.a(this.b, fVar.b) && kotlin.jvm.internal.k.a(this.c, fVar.c) && kotlin.jvm.internal.k.a(this.f7149d, fVar.f7149d);
        }

        public final n f() {
            n.a aVar = n.a;
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
            C0467e eVar = this.f7149d;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", id=" + this.b + ", name=" + this.c + ", iotDevices=" + this.f7149d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, String str2, String str3, C0467e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2, str3, eVar);
        }
    }

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class g {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartworkspace.app.i.f.a.f7154g, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f7151d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        public static final class a {
            private a() {
            }

            public final g a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(g.c[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = g.c[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new g(f2, (String) c);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
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
                pVar.f(g.c[0], this.b.c());
                g.a.a.h.o oVar = g.c[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public g(String str, String str2) {
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

        public final n d() {
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
            return kotlin.jvm.internal.k.a(this.a, gVar.a) && kotlin.jvm.internal.k.a(this.b, gVar.b);
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
            return "Node1(__typename=" + this.a + ", id=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDevice" : str, str2);
        }
    }

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class h {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("accessibleUnits", "accessibleUnits", d0.b(kotlin.n.a("unitTypeExternalIdentifier", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "externalIdentifiers")))), true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f7152d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final a b;

        /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.e$h$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
            static final class C0471a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, a> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0471a f7153h = new C0471a();

                C0471a() {
                    super(1);
                }

                /* renamed from: a */
                public final a o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return a.f7138d.a(oVar);
                }
            }

            private a() {
            }

            public final h a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(h.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new h(f2, (a) oVar.d(h.c[1], C0471a.f7153h));
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
                a b2 = this.b.b();
                pVar.c(oVar, b2 != null ? b2.d() : null);
            }
        }

        public h(String str, a aVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            this.a = str;
            this.b = aVar;
        }

        public final a b() {
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
            a aVar = this.b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Viewer(__typename=" + this.a + ", accessibleUnits=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(String str, a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Viewer" : str, aVar);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class i implements g.a.a.h.s.m<d> {
        public d a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return d.c.a(oVar);
        }
    }

    /* compiled from: SpacesWithExternalIdentifiersQuery.kt */
    public static final class j extends k.c {
        final /* synthetic */ e a;

        /* compiled from: InputFieldMarshaller.kt */
        public static final class a implements g.a.a.h.s.f {
            final /* synthetic */ j b;

            /* renamed from: com.sensorberg.smartworkspace.app.i.e$j$a$a  reason: collision with other inner class name */
            /* compiled from: InputFieldWriter.kt */
            public static final class C0472a implements g.c {
                final /* synthetic */ List b;

                public C0472a(List list) {
                    this.b = list;
                }

                public void a(g.b bVar) {
                    kotlin.jvm.internal.k.f(bVar, "listItemWriter");
                    for (String b2 : this.b) {
                        bVar.b(b2);
                    }
                }
            }

            public a(j jVar) {
                this.b = jVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                C0472a aVar;
                kotlin.jvm.internal.k.f(gVar, "writer");
                if (this.b.a.h().b) {
                    List list = (List) this.b.a.h().a;
                    if (list != null) {
                        g.c.a aVar2 = g.c.a;
                        aVar = new C0472a(list);
                    } else {
                        aVar = null;
                    }
                    gVar.b("externalIdentifiers", aVar);
                }
            }
        }

        j(e eVar) {
            this.a = eVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.a.h().b) {
                linkedHashMap.put("externalIdentifiers", this.a.h().a);
            }
            return linkedHashMap;
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    public e() {
        this((g.a.a.h.h) null, 1, (DefaultConstructorMarker) null);
    }

    public e(g.a.a.h.h<List<String>> hVar) {
        kotlin.jvm.internal.k.e(hVar, "externalIdentifiers");
        this.c = hVar;
        this.b = new j(this);
    }

    public l.i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "ce934ed808e0a10b7be54e9f9d7f82d3ab7b8cfb34989a38a7e8b45e571aaa9f";
    }

    public g.a.a.h.s.m<d> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new i();
    }

    public l.i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f7136d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && kotlin.jvm.internal.k.a(this.c, ((e) obj).c);
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

    public final g.a.a.h.h<List<String>> h() {
        return this.c;
    }

    public int hashCode() {
        g.a.a.h.h<List<String>> hVar = this.c;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public d i(d dVar) {
        return dVar;
    }

    public l name() {
        return f7137e;
    }

    public String toString() {
        return "SpacesWithExternalIdentifiersQuery(externalIdentifiers=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g.a.a.h.h hVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? g.a.a.h.h.c.a() : hVar);
    }
}
