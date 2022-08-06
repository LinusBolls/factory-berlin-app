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
import l.i;

/* compiled from: AlarmQuery.kt */
public final class a implements m<d, d, k.c> {
    private static final String b = g.a.a.h.s.k.a("query Alarm {\n  viewer {\n    __typename\n    alarms {\n      __typename\n      nodes {\n        __typename\n        id\n        enabled\n        endsAt\n        maxSnoozeSeconds\n        unit {\n          __typename\n          name\n        }\n      }\n    }\n  }\n}");
    private static final l c = new b();

    /* renamed from: com.sensorberg.smartworkspace.app.i.a$a  reason: collision with other inner class name */
    /* compiled from: AlarmQuery.kt */
    public static final class C0430a {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.f("nodes", "nodes", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0431a f7081d = new C0431a((DefaultConstructorMarker) null);
        private final String a;
        private final List<e> b;

        /* renamed from: com.sensorberg.smartworkspace.app.i.a$a$a  reason: collision with other inner class name */
        /* compiled from: AlarmQuery.kt */
        public static final class C0431a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.a$a$a$a  reason: collision with other inner class name */
            /* compiled from: AlarmQuery.kt */
            static final class C0432a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<o.b, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0432a f7082h = new C0432a();

                /* renamed from: com.sensorberg.smartworkspace.app.i.a$a$a$a$a  reason: collision with other inner class name */
                /* compiled from: AlarmQuery.kt */
                static final class C0433a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                    /* renamed from: h  reason: collision with root package name */
                    public static final C0433a f7083h = new C0433a();

                    C0433a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final e o(g.a.a.h.s.o oVar) {
                        kotlin.jvm.internal.k.e(oVar, "reader");
                        return e.f7087h.a(oVar);
                    }
                }

                C0432a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(o.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "reader");
                    return (e) bVar.b(C0433a.f7083h);
                }
            }

            private C0431a() {
            }

            public final C0430a a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(C0430a.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new C0430a(f2, oVar.g(C0430a.c[1], C0432a.f7082h));
            }

            public /* synthetic */ C0431a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.i.a$a$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ C0430a b;

            public b(C0430a aVar) {
                this.b = aVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(C0430a.c[0], this.b.c());
                pVar.d(C0430a.c[1], this.b.b(), c.f7084h);
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.i.a$a$c */
        /* compiled from: AlarmQuery.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<List<? extends e>, p.b, x> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f7084h = new c();

            c() {
                super(2);
            }

            public final void a(List<e> list, p.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                if (list != null) {
                    for (e eVar : list) {
                        bVar.a(eVar != null ? eVar.h() : null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                a((List) obj, (p.b) obj2);
                return x.a;
            }
        }

        public C0430a(String str, List<e> list) {
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
            if (!(obj instanceof C0430a)) {
                return false;
            }
            C0430a aVar = (C0430a) obj;
            return kotlin.jvm.internal.k.a(this.a, aVar.a) && kotlin.jvm.internal.k.a(this.b, aVar.b);
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
            return "Alarms(__typename=" + this.a + ", nodes=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0430a(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "ViewerAlarmConnection" : str, list);
        }
    }

    /* compiled from: AlarmQuery.kt */
    public static final class b implements l {
        b() {
        }

        public String name() {
            return "Alarm";
        }
    }

    /* compiled from: AlarmQuery.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AlarmQuery.kt */
    public static final class d implements k.b {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] b = {g.a.a.h.o.f9055g.g("viewer", "viewer", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};
        public static final C0434a c = new C0434a((DefaultConstructorMarker) null);
        private final g a;

        /* renamed from: com.sensorberg.smartworkspace.app.i.a$d$a  reason: collision with other inner class name */
        /* compiled from: AlarmQuery.kt */
        public static final class C0434a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.a$d$a$a  reason: collision with other inner class name */
            /* compiled from: AlarmQuery.kt */
            static final class C0435a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, g> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0435a f7085h = new C0435a();

                C0435a() {
                    super(1);
                }

                /* renamed from: a */
                public final g o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return g.f7093d.a(oVar);
                }
            }

            private C0434a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new d((g) oVar.d(d.b[0], C0435a.f7085h));
            }

            public /* synthetic */ C0434a(DefaultConstructorMarker defaultConstructorMarker) {
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
                g c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public d(g gVar) {
            this.a = gVar;
        }

        public n a() {
            n.a aVar = n.a;
            return new b(this);
        }

        public final g c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.k.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            g gVar = this.a;
            if (gVar != null) {
                return gVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(viewer=" + this.a + ")";
        }
    }

    /* compiled from: AlarmQuery.kt */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final g.a.a.h.o[] f7086g = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartworkspace.app.i.f.a.f7154g, (List<? extends o.c>) null), g.a.a.h.o.f9055g.a("enabled", "enabled", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, true, com.sensorberg.smartworkspace.app.i.f.a.f7155h, (List<? extends o.c>) null), g.a.a.h.o.f9055g.e("maxSnoozeSeconds", "maxSnoozeSeconds", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("unit", "unit", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: h  reason: collision with root package name */
        public static final C0436a f7087h = new C0436a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f7088d;

        /* renamed from: e  reason: collision with root package name */
        private final int f7089e;

        /* renamed from: f  reason: collision with root package name */
        private final f f7090f;

        /* renamed from: com.sensorberg.smartworkspace.app.i.a$e$a  reason: collision with other inner class name */
        /* compiled from: AlarmQuery.kt */
        public static final class C0436a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.a$e$a$a  reason: collision with other inner class name */
            /* compiled from: AlarmQuery.kt */
            static final class C0437a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0437a f7091h = new C0437a();

                C0437a() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f7092d.a(oVar);
                }
            }

            private C0436a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.f7086g[0]);
                kotlin.jvm.internal.k.c(f2);
                g.a.a.h.o oVar2 = e.f7086g[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String str = (String) c;
                    Boolean j2 = oVar.j(e.f7086g[2]);
                    kotlin.jvm.internal.k.c(j2);
                    boolean booleanValue = j2.booleanValue();
                    g.a.a.h.o oVar3 = e.f7086g[3];
                    if (oVar3 != null) {
                        Integer e2 = oVar.e(e.f7086g[4]);
                        kotlin.jvm.internal.k.c(e2);
                        int intValue = e2.intValue();
                        Object d2 = oVar.d(e.f7086g[5], C0437a.f7091h);
                        kotlin.jvm.internal.k.c(d2);
                        return new e(f2, str, booleanValue, (Long) oVar.c((o.d) oVar3), intValue, (f) d2);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0436a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(e.f7086g[0], this.b.g());
                g.a.a.h.o oVar = e.f7086g[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.d());
                    pVar.e(e.f7086g[2], Boolean.valueOf(this.b.b()));
                    g.a.a.h.o oVar2 = e.f7086g[3];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, this.b.c());
                        pVar.a(e.f7086g[4], Integer.valueOf(this.b.e()));
                        pVar.c(e.f7086g[5], this.b.f().d());
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public e(String str, String str2, boolean z, Long l2, int i2, f fVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            kotlin.jvm.internal.k.e(fVar, "unit");
            this.a = str;
            this.b = str2;
            this.c = z;
            this.f7088d = l2;
            this.f7089e = i2;
            this.f7090f = fVar;
        }

        public final boolean b() {
            return this.c;
        }

        public final Long c() {
            return this.f7088d;
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.f7089e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b) && this.c == eVar.c && kotlin.jvm.internal.k.a(this.f7088d, eVar.f7088d) && this.f7089e == eVar.f7089e && kotlin.jvm.internal.k.a(this.f7090f, eVar.f7090f);
        }

        public final f f() {
            return this.f7090f;
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
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
            Long l2 = this.f7088d;
            int hashCode3 = (((i3 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.f7089e) * 31;
            f fVar = this.f7090f;
            if (fVar != null) {
                i2 = fVar.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", id=" + this.b + ", enabled=" + this.c + ", endsAt=" + this.f7088d + ", maxSnoozeSeconds=" + this.f7089e + ", unit=" + this.f7090f + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, String str2, boolean z, Long l2, int i2, f fVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "ViewerAlarm" : str, str2, z, l2, i2, fVar);
        }
    }

    /* compiled from: AlarmQuery.kt */
    public static final class f {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0438a f7092d = new C0438a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* renamed from: com.sensorberg.smartworkspace.app.i.a$f$a  reason: collision with other inner class name */
        /* compiled from: AlarmQuery.kt */
        public static final class C0438a {
            private C0438a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new f(f2, oVar.f(f.c[1]));
            }

            public /* synthetic */ C0438a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(f.c[1], this.b.b());
            }
        }

        public f(String str, String str2) {
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
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Unit(__typename=" + this.a + ", name=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Unit" : str, str2);
        }
    }

    /* compiled from: AlarmQuery.kt */
    public static final class g {
        /* access modifiers changed from: private */
        public static final g.a.a.h.o[] c = {g.a.a.h.o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), g.a.a.h.o.f9055g.g("alarms", "alarms", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final C0439a f7093d = new C0439a((DefaultConstructorMarker) null);
        private final String a;
        private final C0430a b;

        /* renamed from: com.sensorberg.smartworkspace.app.i.a$g$a  reason: collision with other inner class name */
        /* compiled from: AlarmQuery.kt */
        public static final class C0439a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.a$g$a$a  reason: collision with other inner class name */
            /* compiled from: AlarmQuery.kt */
            static final class C0440a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, C0430a> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0440a f7094h = new C0440a();

                C0440a() {
                    super(1);
                }

                /* renamed from: a */
                public final C0430a o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return C0430a.f7081d.a(oVar);
                }
            }

            private C0439a() {
            }

            public final g a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(g.c[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(g.c[1], C0440a.f7094h);
                kotlin.jvm.internal.k.c(d2);
                return new g(f2, (C0430a) d2);
            }

            public /* synthetic */ C0439a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.c(g.c[1], this.b.b().d());
            }
        }

        public g(String str, C0430a aVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(aVar, "alarms");
            this.a = str;
            this.b = aVar;
        }

        public final C0430a b() {
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
            C0430a aVar = this.b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Viewer(__typename=" + this.a + ", alarms=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(String str, C0430a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Viewer" : str, aVar);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class h implements g.a.a.h.s.m<d> {
        public d a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return d.c.a(oVar);
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    public i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, z, z2, qVar);
    }

    public String b() {
        return "bfdb43d9f2c241acd903fe069782f3a28a3ef4cfdcca2276996f9bcf39b88a49";
    }

    public g.a.a.h.s.m<d> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new h();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return b;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        d dVar = (d) bVar;
        h(dVar);
        return dVar;
    }

    public k.c g() {
        return k.a;
    }

    public d h(d dVar) {
        return dVar;
    }

    public l name() {
        return c;
    }
}
