package com.sensorberg.smartspaces.backend.j;

import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.g;
import g.a.a.h.s.h;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.n;
import kotlin.x;
import l.i;

/* compiled from: SetIoTDeviceStateMutation.kt */
public final class b implements j<c, c, k.c> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f5760e = g.a.a.h.s.k.a("mutation SetIoTDeviceState($iotDeviceId: ID!, $stateInput: [IotDeviceStateInput!]!) {\n  iotDeviceSetTargetState(id: $iotDeviceId, targetState: $stateInput) {\n    __typename\n    name\n  }\n}");

    /* renamed from: f  reason: collision with root package name */
    private static final l f5761f = new a();
    private final transient k.c b = new f(this);
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.sensorberg.smartspaces.backend.j.f.b> f5762d;

    /* compiled from: SetIoTDeviceStateMutation.kt */
    public static final class a implements l {
        a() {
        }

        public String name() {
            return "SetIoTDeviceState";
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.j.b$b  reason: collision with other inner class name */
    /* compiled from: SetIoTDeviceStateMutation.kt */
    public static final class C0219b {
        private C0219b() {
        }

        public /* synthetic */ C0219b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SetIoTDeviceStateMutation.kt */
    public static final class c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("iotDeviceSetTargetState", "iotDeviceSetTargetState", e0.f(n.a("id", e0.f(n.a("kind", "Variable"), n.a("variableName", "iotDeviceId"))), n.a("targetState", e0.f(n.a("kind", "Variable"), n.a("variableName", "stateInput")))), true, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final d a;

        /* compiled from: SetIoTDeviceStateMutation.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.b$c$a$a  reason: collision with other inner class name */
            /* compiled from: SetIoTDeviceStateMutation.kt */
            static final class C0220a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0220a f5763h = new C0220a();

                C0220a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return d.f5764d.a(oVar);
                }
            }

            private a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new c((d) oVar.d(c.b[0], C0220a.f5763h));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.b$c$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0221b implements g.a.a.h.s.n {
            final /* synthetic */ c b;

            public C0221b(c cVar) {
                this.b = cVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                o oVar = c.b[0];
                d c = this.b.c();
                pVar.c(oVar, c != null ? c.d() : null);
            }
        }

        public c(d dVar) {
            this.a = dVar;
        }

        public g.a.a.h.s.n a() {
            n.a aVar = g.a.a.h.s.n.a;
            return new C0221b(this);
        }

        public final d c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.k.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar != null) {
                return dVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(iotDeviceSetTargetState=" + this.a + ")";
        }
    }

    /* compiled from: SetIoTDeviceStateMutation.kt */
    public static final class d {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f5764d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: SetIoTDeviceStateMutation.kt */
        public static final class a {
            private a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new d(f2, oVar.f(d.c[1]));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.j.b$d$b  reason: collision with other inner class name */
        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class C0222b implements g.a.a.h.s.n {
            final /* synthetic */ d b;

            public C0222b(d dVar) {
                this.b = dVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                pVar.f(d.c[0], this.b.c());
                pVar.f(d.c[1], this.b.b());
            }
        }

        public d(String str, String str2) {
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
            return new C0222b(this);
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
            return "IotDeviceSetTargetState(__typename=" + this.a + ", name=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "IotDevice" : str, str2);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class e implements m<c> {
        public c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return c.c.a(oVar);
        }
    }

    /* compiled from: SetIoTDeviceStateMutation.kt */
    public static final class f extends k.c {
        final /* synthetic */ b a;

        /* compiled from: InputFieldMarshaller.kt */
        public static final class a implements g.a.a.h.s.f {
            final /* synthetic */ f b;

            /* renamed from: com.sensorberg.smartspaces.backend.j.b$f$a$a  reason: collision with other inner class name */
            /* compiled from: SetIoTDeviceStateMutation.kt */
            static final class C0223a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.b, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ a f5765h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0223a(a aVar) {
                    super(1);
                    this.f5765h = aVar;
                }

                public final void a(g.b bVar) {
                    kotlin.jvm.internal.k.e(bVar, "listItemWriter");
                    for (com.sensorberg.smartspaces.backend.j.f.b a : this.f5765h.b.a.i()) {
                        bVar.c(a.a());
                    }
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((g.b) obj);
                    return x.a;
                }
            }

            public a(f fVar) {
                this.b = fVar;
            }

            public void a(g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
                gVar.d("iotDeviceId", com.sensorberg.smartspaces.backend.j.f.a.f5937g, this.b.a.h());
                gVar.c("stateInput", new C0223a(this));
            }
        }

        f(b bVar) {
            this.a = bVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("iotDeviceId", this.a.h());
            linkedHashMap.put("stateInput", this.a.i());
            return linkedHashMap;
        }
    }

    static {
        new C0219b((DefaultConstructorMarker) null);
    }

    public b(String str, List<com.sensorberg.smartspaces.backend.j.f.b> list) {
        kotlin.jvm.internal.k.e(str, "iotDeviceId");
        kotlin.jvm.internal.k.e(list, "stateInput");
        this.c = str;
        this.f5762d = list;
    }

    public String b() {
        return "87d568703e1e732eab7846f86c80f2be0b0b52e91129ec656d9b93082922b2b7";
    }

    public m<c> c() {
        m.a aVar = m.a;
        return new e();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return h.a(this, false, true, qVar);
    }

    public String e() {
        return f5760e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.k.a(this.c, bVar.c) && kotlin.jvm.internal.k.a(this.f5762d, bVar.f5762d);
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        c cVar = (c) bVar;
        j(cVar);
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
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<com.sensorberg.smartspaces.backend.j.f.b> list = this.f5762d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final List<com.sensorberg.smartspaces.backend.j.f.b> i() {
        return this.f5762d;
    }

    public c j(c cVar) {
        return cVar;
    }

    public l name() {
        return f5761f;
    }

    public String toString() {
        return "SetIoTDeviceStateMutation(iotDeviceId=" + this.c + ", stateInput=" + this.f5762d + ")";
    }
}
