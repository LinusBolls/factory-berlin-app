package com.sensorberg.smartspaces.backend.j.c;

import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.h;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.n;
import l.i;

/* compiled from: RemoveBookingMutation.kt */
public final class d implements j<c, c, k.c> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f5847d = g.a.a.h.s.k.a("mutation RemoveBooking($unitBookingId: ID!) {\n  removeUnitBooking(unitBookingId: $unitBookingId) {\n    __typename\n    unitBooking {\n      __typename\n      id\n    }\n  }\n}");

    /* renamed from: e  reason: collision with root package name */
    private static final l f5848e = new a();
    private final transient k.c b = new g(this);
    private final String c;

    /* compiled from: RemoveBookingMutation.kt */
    public static final class a implements l {
        a() {
        }

        public String name() {
            return "RemoveBooking";
        }
    }

    /* compiled from: RemoveBookingMutation.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RemoveBookingMutation.kt */
    public static final class c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("removeUnitBooking", "removeUnitBooking", d0.b(n.a("unitBookingId", e0.f(n.a("kind", "Variable"), n.a("variableName", "unitBookingId")))), true, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final C0261d a;

        /* compiled from: RemoveBookingMutation.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.d$c$a$a  reason: collision with other inner class name */
            /* compiled from: RemoveBookingMutation.kt */
            static final class C0260a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, C0261d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0260a f5849h = new C0260a();

                C0260a() {
                    super(1);
                }

                /* renamed from: a */
                public final C0261d o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return C0261d.f5850d.a(oVar);
                }
            }

            private a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new c((C0261d) oVar.d(c.b[0], C0260a.f5849h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
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
                C0261d c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public c(C0261d dVar) {
            this.a = dVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new b(this);
        }

        public final C0261d c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.k.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            C0261d dVar = this.a;
            if (dVar != null) {
                return dVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(removeUnitBooking=" + this.a + ")";
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.j.c.d$d  reason: collision with other inner class name */
    /* compiled from: RemoveBookingMutation.kt */
    public static final class C0261d {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("unitBooking", "unitBooking", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5850d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final e b;

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.d$d$a */
        /* compiled from: RemoveBookingMutation.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.c.d$d$a$a  reason: collision with other inner class name */
            /* compiled from: RemoveBookingMutation.kt */
            static final class C0262a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0262a f5851h = new C0262a();

                C0262a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return e.f5852d.a(oVar);
                }
            }

            private a() {
            }

            public final C0261d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(C0261d.c[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(C0261d.c[1], C0262a.f5851h);
                kotlin.jvm.internal.k.c(d2);
                return new C0261d(f2, (e) d2);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.c.d$d$b */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements g.a.a.h.s.n {
            final /* synthetic */ C0261d b;

            public b(C0261d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(C0261d.c[0], this.b.c());
                pVar.c(C0261d.c[1], this.b.b().d());
            }
        }

        public C0261d(String str, e eVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(eVar, "unitBooking");
            this.a = str;
            this.b = eVar;
        }

        public final e b() {
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
            if (!(obj instanceof C0261d)) {
                return false;
            }
            C0261d dVar = (C0261d) obj;
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            e eVar = this.b;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "RemoveUnitBooking(__typename=" + this.a + ", unitBooking=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0261d(String str, e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "RemoveUnitBookingMutationPayload" : str, eVar);
        }
    }

    /* compiled from: RemoveBookingMutation.kt */
    public static final class e {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5852d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: RemoveBookingMutation.kt */
        public static final class a {
            private a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.c[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = e.c[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new e(f2, (String) c);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
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
                o oVar = e.c[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.b());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public e(String str, String str2) {
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
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "UnitBooking(__typename=" + this.a + ", id=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UnitBooking" : str, str2);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class f implements m<c> {
        public c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return c.c.a(oVar);
        }
    }

    /* compiled from: RemoveBookingMutation.kt */
    public static final class g extends k.c {
        final /* synthetic */ d a;

        /* compiled from: InputFieldMarshaller.kt */
        public static final class a implements g.a.a.h.s.f {
            final /* synthetic */ g b;

            public a(g gVar) {
                this.b = gVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
                gVar.d("unitBookingId", com.sensorberg.smartspaces.backend.j.f.a.f5937g, this.b.a.h());
            }
        }

        g(d dVar) {
            this.a = dVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("unitBookingId", this.a.h());
            return linkedHashMap;
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public d(String str) {
        kotlin.jvm.internal.k.e(str, "unitBookingId");
        this.c = str;
    }

    public String b() {
        return "f373c3585005b9bb39bebc6edb0a592aced1c289650e4ec474c29d027b28f498";
    }

    public m<c> c() {
        m.a aVar = m.a;
        return new f();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return h.a(this, false, true, qVar);
    }

    public String e() {
        return f5847d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && kotlin.jvm.internal.k.a(this.c, ((d) obj).c);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        c cVar = (c) bVar;
        i(cVar);
        return cVar;
    }

    public k.c g() {
        return this.b;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public c i(c cVar) {
        return cVar;
    }

    public l name() {
        return f5848e;
    }

    public String toString() {
        return "RemoveBookingMutation(unitBookingId=" + this.c + ")";
    }
}
