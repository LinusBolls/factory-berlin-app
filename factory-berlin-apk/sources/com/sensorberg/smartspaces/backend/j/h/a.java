package com.sensorberg.smartspaces.backend.j.h;

import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.m;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.h;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.p;
import java.util.List;
import java.util.Map;
import l.i;

/* compiled from: GetUserQuery.kt */
public final class a implements m<c, c, k.c> {
    private static final String b = g.a.a.h.s.k.a("query GetUser {\n  viewer {\n    __typename\n    id\n    fullName\n  }\n}");
    private static final l c = new C0328a();

    /* renamed from: com.sensorberg.smartspaces.backend.j.h.a$a  reason: collision with other inner class name */
    /* compiled from: GetUserQuery.kt */
    public static final class C0328a implements l {
        C0328a() {
        }

        public String name() {
            return "GetUser";
        }
    }

    /* compiled from: GetUserQuery.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetUserQuery.kt */
    public static final class c implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("viewer", "viewer", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};
        public static final C0329a c = new C0329a((DefaultConstructorMarker) null);
        private final d a;

        /* renamed from: com.sensorberg.smartspaces.backend.j.h.a$c$a  reason: collision with other inner class name */
        /* compiled from: GetUserQuery.kt */
        public static final class C0329a {

            /* renamed from: com.sensorberg.smartspaces.backend.j.h.a$c$a$a  reason: collision with other inner class name */
            /* compiled from: GetUserQuery.kt */
            static final class C0330a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, d> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0330a f5954h = new C0330a();

                C0330a() {
                    super(1);
                }

                /* renamed from: a */
                public final d o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return d.f5956e.a(oVar);
                }
            }

            private C0329a() {
            }

            public final c a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new c((d) oVar.d(c.b[0], C0330a.f5954h));
            }

            public /* synthetic */ C0329a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: ResponseFieldMarshaller.kt */
        public static final class b implements n {
            final /* synthetic */ c b;

            public b(c cVar) {
                this.b = cVar;
            }

            public void a(p pVar) {
                kotlin.jvm.internal.k.f(pVar, "writer");
                o oVar = c.b[0];
                d c = this.b.c();
                pVar.c(oVar, c != null ? c.e() : null);
            }
        }

        public c(d dVar) {
            this.a = dVar;
        }

        public n a() {
            n.a aVar = n.a;
            return new b(this);
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
            return "Data(viewer=" + this.a + ")";
        }
    }

    /* compiled from: GetUserQuery.kt */
    public static final class d {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f5955d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartspaces.backend.j.f.a.f5937g, (List<? extends o.c>) null), o.f9055g.h("fullName", "fullName", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final C0331a f5956e = new C0331a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: com.sensorberg.smartspaces.backend.j.h.a$d$a  reason: collision with other inner class name */
        /* compiled from: GetUserQuery.kt */
        public static final class C0331a {
            private C0331a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(d.f5955d[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = d.f5955d[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    return new d(f2, (String) c, oVar.f(d.f5955d[2]));
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0331a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(d.f5955d[0], this.b.d());
                o oVar = d.f5955d[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.c());
                    pVar.f(d.f5955d[2], this.b.b());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public d(String str, String str2, String str3) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b) && kotlin.jvm.internal.k.a(this.c, dVar.c);
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
            return "Viewer(__typename=" + this.a + ", id=" + this.b + ", fullName=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Viewer" : str, str2, str3);
        }
    }

    /* compiled from: ResponseFieldMapper.kt */
    public static final class e implements g.a.a.h.s.m<c> {
        public c a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return c.c.a(oVar);
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public i a(boolean z, boolean z2, q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return h.a(this, z, z2, qVar);
    }

    public String b() {
        return "3cfe761cf8dcac7ef4e010142897e351145bdc30415f77fc7a2076256a5fc2fe";
    }

    public g.a.a.h.s.m<c> c() {
        m.a aVar = g.a.a.h.s.m.a;
        return new e();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return h.a(this, false, true, qVar);
    }

    public String e() {
        return b;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        c cVar = (c) bVar;
        h(cVar);
        return cVar;
    }

    public k.c g() {
        return k.a;
    }

    public c h(c cVar) {
        return cVar;
    }

    public l name() {
        return c;
    }
}
