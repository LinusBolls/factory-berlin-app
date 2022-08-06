package com.sensorberg.smartworkspace.app.i;

import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.m;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.o;
import g.a.a.h.s.p;
import java.util.List;
import java.util.Map;
import kotlin.x;

/* compiled from: SpacesQuery.kt */
public final class d implements m<C0457d, C0457d, k.c> {
    private static final String b = g.a.a.h.s.k.a("query Spaces {\n  viewer {\n    __typename\n    accessibleUnits {\n      __typename\n      nodes {\n        __typename\n        id\n        name\n        iotDevices {\n          __typename\n          nodes {\n            __typename\n            id\n          }\n        }\n      }\n    }\n  }\n}");
    private static final l c = new b();

    /* compiled from: SpacesQuery.kt */
    public static final class a {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0454a f7120d = new C0454a((DefaultConstructorMarker) null);
        private final String a;
        private final List<f> b;

        /* renamed from: com.sensorberg.smartworkspace.app.i.d$a$a  reason: collision with other inner class name */
        /* compiled from: SpacesQuery.kt */
        public static final class C0454a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.d$a$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesQuery.kt */
            static final class C0455a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0455a f7121h = new C0455a();

                /* renamed from: com.sensorberg.smartworkspace.app.i.d$a$a$a$a  reason: collision with other inner class name */
                /* compiled from: SpacesQuery.kt */
                static final class C0456a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0456a f7122h = new C0456a();

                    C0456a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final f o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return f.f7130f.a(oVar);
                    }
                }

                C0455a() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (f) bVar.b(C0456a.f7122h);
                }
            }

            private C0454a() {
            }

            public final a a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(a.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new a(f2, oVar.g(a.c[1], C0455a.f7121h));
            }

            public /* synthetic */ C0454a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.d(a.c[1], this.b.b(), c.f7123h);
            }
        }

        /* compiled from: SpacesQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends f>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f7123h = new c();

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

    /* compiled from: SpacesQuery.kt */
    public static final class b implements l {
        b() {
        }

        public String name() {
            return "Spaces";
        }
    }

    /* compiled from: SpacesQuery.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.i.d$d  reason: collision with other inner class name */
    /* compiled from: SpacesQuery.kt */
    public static final class C0457d implements k.b {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] b = {g.a.a.h.o.f9055g.g("viewer", "viewer", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final h a;

        /* renamed from: com.sensorberg.smartworkspace.app.i.d$d$a */
        /* compiled from: SpacesQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.d$d$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesQuery.kt */
            static final class C0458a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, h> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0458a f7124h = new C0458a();

                C0458a() {
                    super(1);
                }

                /* renamed from: a */
                public final h o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return h.f7134d.a(oVar);
                }
            }

            private a() {
            }

            public final C0457d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new C0457d((h) oVar.d(C0457d.b[0], C0458a.f7124h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.i.d$d$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ C0457d b;

            public b(C0457d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                g.a.a.h.o oVar = C0457d.b[0];
                h c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public C0457d(h hVar) {
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
                return (obj instanceof C0457d) && kotlin.jvm.internal.k.a(this.a, ((C0457d) obj).a);
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

    /* compiled from: SpacesQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f7125d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final List<g> b;

        /* compiled from: SpacesQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.d$e$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesQuery.kt */
            static final class C0459a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, g> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0459a f7126h = new C0459a();

                /* renamed from: com.sensorberg.smartworkspace.app.i.d$e$a$a$a  reason: collision with other inner class name */
                /* compiled from: SpacesQuery.kt */
                static final class C0460a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, g> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0460a f7127h = new C0460a();

                    C0460a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final g o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return g.f7133d.a(oVar);
                    }
                }

                C0459a() {
                    super(1);
                }

                /* renamed from: a */
                public final g o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (g) bVar.b(C0460a.f7127h);
                }
            }

            private a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new e(f2, oVar.g(e.c[1], C0459a.f7126h));
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
                pVar.f(e.c[0], this.b.c());
                pVar.d(e.c[1], this.b.b(), c.f7128h);
            }
        }

        /* compiled from: SpacesQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends g>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f7128h = new c();

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

        public e(String str, List<g> list) {
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
        public /* synthetic */ e(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDeviceConnection" : str, list);
        }
    }

    /* compiled from: SpacesQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final g.a.a.h.o[] f7129e = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartworkspace.app.i.f.a.f7154g, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("iotDevices", "iotDevices", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: f  reason: collision with root package name */
        public static final a f7130f = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final e f7131d;

        /* compiled from: SpacesQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.d$f$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesQuery.kt */
            static final class C0461a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0461a f7132h = new C0461a();

                C0461a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return e.f7125d.a(oVar);
                }
            }

            private a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.f7129e[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = f.f7129e[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String f3 = oVar.f(f.f7129e[2]);
                    Object d2 = oVar.d(f.f7129e[3], C0461a.f7132h);
                    kotlin.jvm.internal.k.c(d2);
                    return new f(f2, (String) c, f3, (e) d2);
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
                pVar.f(f.f7129e[0], this.b.e());
                g.a.a.h.o oVar = f.f7129e[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    pVar.f(f.f7129e[2], this.b.d());
                    pVar.c(f.f7129e[3], this.b.c().d());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public f(String str, String str2, String str3, e eVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            kotlin.jvm.internal.k.e(eVar, "iotDevices");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f7131d = eVar;
        }

        public final String b() {
            return this.b;
        }

        public final e c() {
            return this.f7131d;
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
            return kotlin.jvm.internal.k.a(this.a, fVar.a) && kotlin.jvm.internal.k.a(this.b, fVar.b) && kotlin.jvm.internal.k.a(this.c, fVar.c) && kotlin.jvm.internal.k.a(this.f7131d, fVar.f7131d);
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
            e eVar = this.f7131d;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", id=" + this.b + ", name=" + this.c + ", iotDevices=" + this.f7131d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, String str2, String str3, e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2, str3, eVar);
        }
    }

    /* compiled from: SpacesQuery.kt */
    public static final class g {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartworkspace.app.i.f.a.f7154g, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f7133d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: SpacesQuery.kt */
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

    /* compiled from: SpacesQuery.kt */
    public static final class h {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("accessibleUnits", "accessibleUnits", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f7134d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final a b;

        /* compiled from: SpacesQuery.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.d$h$a$a  reason: collision with other inner class name */
            /* compiled from: SpacesQuery.kt */
            static final class C0462a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, a> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0462a f7135h = new C0462a();

                C0462a() {
                    super(1);
                }

                /* renamed from: a */
                public final a o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return a.f7120d.a(oVar);
                }
            }

            private a() {
            }

            public final h a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(h.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new h(f2, (a) oVar.d(h.c[1], C0462a.f7135h));
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
    public static final class i implements g.a.a.h.s.m<C0457d> {
        public C0457d a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return C0457d.c.a(oVar);
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    public l.i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "6f5accb7b55eeb8594635e74b236e08946c5d128f079ac02a445304a129d4cc5";
    }

    public g.a.a.h.s.m<C0457d> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new i();
    }

    public l.i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return b;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        C0457d dVar = (C0457d) bVar;
        h(dVar);
        return dVar;
    }

    public k.c g() {
        return k.a;
    }

    public C0457d h(C0457d dVar) {
        return dVar;
    }

    public l name() {
        return c;
    }
}
