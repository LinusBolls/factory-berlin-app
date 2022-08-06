package com.sensorberg.smartworkspace.app.i;

import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import g.a.a.h.s.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.i;

/* compiled from: SnoozeAlarmMutation.kt */
public final class c implements j<d, d, k.c> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7107e = g.a.a.h.s.k.a("mutation SnoozeAlarm($alarmId: String!, $snoozeSeconds: Int!) {\n  snoozeViewerAlarm(alarmId: $alarmId, snoozeSeconds: $snoozeSeconds) {\n    __typename\n    alarm {\n      __typename\n      id\n      enabled\n      endsAt\n      maxSnoozeSeconds\n    }\n    unit {\n      __typename\n      name\n    }\n  }\n}");

    /* renamed from: f  reason: collision with root package name */
    private static final l f7108f = new b();
    private final transient k.c b = new h(this);
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7109d;

    /* compiled from: SnoozeAlarmMutation.kt */
    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final o[] f7110f = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("id", "id", (Map<String, ? extends Object>) null, false, com.sensorberg.smartworkspace.app.i.f.a.f7154g, (List<? extends o.c>) null), o.f9055g.a("enabled", "enabled", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.b("endsAt", "endsAt", (Map<String, ? extends Object>) null, true, com.sensorberg.smartworkspace.app.i.f.a.f7155h, (List<? extends o.c>) null), o.f9055g.e("maxSnoozeSeconds", "maxSnoozeSeconds", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: g  reason: collision with root package name */
        public static final C0450a f7111g = new C0450a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f7112d;

        /* renamed from: e  reason: collision with root package name */
        private final int f7113e;

        /* renamed from: com.sensorberg.smartworkspace.app.i.c$a$a  reason: collision with other inner class name */
        /* compiled from: SnoozeAlarmMutation.kt */
        public static final class C0450a {
            private C0450a() {
            }

            public final a a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(a.f7110f[0]);
                kotlin.jvm.internal.k.c(f2);
                o oVar2 = a.f7110f[1];
                if (oVar2 != null) {
                    Object c = oVar.c((o.d) oVar2);
                    kotlin.jvm.internal.k.c(c);
                    String str = (String) c;
                    Boolean j2 = oVar.j(a.f7110f[2]);
                    kotlin.jvm.internal.k.c(j2);
                    boolean booleanValue = j2.booleanValue();
                    o oVar3 = a.f7110f[3];
                    if (oVar3 != null) {
                        Integer e2 = oVar.e(a.f7110f[4]);
                        kotlin.jvm.internal.k.c(e2);
                        return new a(f2, str, booleanValue, (Long) oVar.c((o.d) oVar3), e2.intValue());
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }

            public /* synthetic */ C0450a(DefaultConstructorMarker defaultConstructorMarker) {
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
                pVar.f(a.f7110f[0], this.b.f());
                o oVar = a.f7110f[1];
                if (oVar != null) {
                    pVar.b((o.d) oVar, this.b.d());
                    pVar.e(a.f7110f[2], Boolean.valueOf(this.b.b()));
                    o oVar2 = a.f7110f[3];
                    if (oVar2 != null) {
                        pVar.b((o.d) oVar2, this.b.c());
                        pVar.a(a.f7110f[4], Integer.valueOf(this.b.e()));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            }
        }

        public a(String str, String str2, boolean z, Long l2, int i2) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(str2, "id");
            this.a = str;
            this.b = str2;
            this.c = z;
            this.f7112d = l2;
            this.f7113e = i2;
        }

        public final boolean b() {
            return this.c;
        }

        public final Long c() {
            return this.f7112d;
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.f7113e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.k.a(this.a, aVar.a) && kotlin.jvm.internal.k.a(this.b, aVar.b) && this.c == aVar.c && kotlin.jvm.internal.k.a(this.f7112d, aVar.f7112d) && this.f7113e == aVar.f7113e;
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
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
            Long l2 = this.f7112d;
            if (l2 != null) {
                i2 = l2.hashCode();
            }
            return ((i3 + i2) * 31) + this.f7113e;
        }

        public String toString() {
            return "Alarm(__typename=" + this.a + ", id=" + this.b + ", enabled=" + this.c + ", endsAt=" + this.f7112d + ", maxSnoozeSeconds=" + this.f7113e + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, boolean z, Long l2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "ViewerAlarm" : str, str2, z, l2, i2);
        }
    }

    /* compiled from: SnoozeAlarmMutation.kt */
    public static final class b implements l {
        b() {
        }

        public String name() {
            return "SnoozeAlarm";
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.i.c$c  reason: collision with other inner class name */
    /* compiled from: SnoozeAlarmMutation.kt */
    public static final class C0451c {
        private C0451c() {
        }

        public /* synthetic */ C0451c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SnoozeAlarmMutation.kt */
    public static final class d implements k.b {
        /* access modifiers changed from: private */
        public static final o[] b = {o.f9055g.g("snoozeViewerAlarm", "snoozeViewerAlarm", e0.f(kotlin.n.a("alarmId", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "alarmId"))), kotlin.n.a("snoozeSeconds", e0.f(kotlin.n.a("kind", "Variable"), kotlin.n.a("variableName", "snoozeSeconds")))), true, (List<? extends o.c>) null)};
        public static final a c = new a((DefaultConstructorMarker) null);
        private final e a;

        /* compiled from: SnoozeAlarmMutation.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.c$d$a$a  reason: collision with other inner class name */
            /* compiled from: SnoozeAlarmMutation.kt */
            static final class C0452a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, e> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0452a f7114h = new C0452a();

                C0452a() {
                    super(1);
                }

                /* renamed from: a */
                public final e o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return e.f7116e.a(oVar);
                }
            }

            private a() {
            }

            public final d a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                return new d((e) oVar.d(d.b[0], C0452a.f7114h));
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
                o oVar = d.b[0];
                e c = this.b.c();
                pVar.c(oVar, c != null ? c.e() : null);
            }
        }

        public d(e eVar) {
            this.a = eVar;
        }

        public n a() {
            n.a aVar = n.a;
            return new b(this);
        }

        public final e c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.k.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar != null) {
                return eVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(snoozeViewerAlarm=" + this.a + ")";
        }
    }

    /* compiled from: SnoozeAlarmMutation.kt */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final o[] f7115d = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("alarm", "alarm", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.g("unit", "unit", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null)};

        /* renamed from: e  reason: collision with root package name */
        public static final a f7116e = new a((DefaultConstructorMarker) null);
        private final String a;
        private final a b;
        private final f c;

        /* compiled from: SnoozeAlarmMutation.kt */
        public static final class a {

            /* renamed from: com.sensorberg.smartworkspace.app.i.c$e$a$a  reason: collision with other inner class name */
            /* compiled from: SnoozeAlarmMutation.kt */
            static final class C0453a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, a> {

                /* renamed from: h  reason: collision with root package name */
                public static final C0453a f7117h = new C0453a();

                C0453a() {
                    super(1);
                }

                /* renamed from: a */
                public final a o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return a.f7111g.a(oVar);
                }
            }

            /* compiled from: SnoozeAlarmMutation.kt */
            static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.a.a.h.s.o, f> {

                /* renamed from: h  reason: collision with root package name */
                public static final b f7118h = new b();

                b() {
                    super(1);
                }

                /* renamed from: a */
                public final f o(g.a.a.h.s.o oVar) {
                    kotlin.jvm.internal.k.e(oVar, "reader");
                    return f.f7119d.a(oVar);
                }
            }

            private a() {
            }

            public final e a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(e.f7115d[0]);
                kotlin.jvm.internal.k.c(f2);
                Object d2 = oVar.d(e.f7115d[1], C0453a.f7117h);
                kotlin.jvm.internal.k.c(d2);
                Object d3 = oVar.d(e.f7115d[2], b.f7118h);
                kotlin.jvm.internal.k.c(d3);
                return new e(f2, (a) d2, (f) d3);
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
                pVar.f(e.f7115d[0], this.b.d());
                pVar.c(e.f7115d[1], this.b.b().g());
                pVar.c(e.f7115d[2], this.b.c().d());
            }
        }

        public e(String str, a aVar, f fVar) {
            kotlin.jvm.internal.k.e(str, "__typename");
            kotlin.jvm.internal.k.e(aVar, "alarm");
            kotlin.jvm.internal.k.e(fVar, "unit");
            this.a = str;
            this.b = aVar;
            this.c = fVar;
        }

        public final a b() {
            return this.b;
        }

        public final f c() {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.k.a(this.a, eVar.a) && kotlin.jvm.internal.k.a(this.b, eVar.b) && kotlin.jvm.internal.k.a(this.c, eVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            a aVar = this.b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            f fVar = this.c;
            if (fVar != null) {
                i2 = fVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "SnoozeViewerAlarm(__typename=" + this.a + ", alarm=" + this.b + ", unit=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, a aVar, f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "SnoozeAlarmMutationPayload" : str, aVar, fVar);
        }
    }

    /* compiled from: SnoozeAlarmMutation.kt */
    public static final class f {
        /* access modifiers changed from: private */
        public static final o[] c = {o.f9055g.h("__typename", "__typename", (Map<String, ? extends Object>) null, false, (List<? extends o.c>) null), o.f9055g.h("name", "name", (Map<String, ? extends Object>) null, true, (List<? extends o.c>) null)};

        /* renamed from: d  reason: collision with root package name */
        public static final a f7119d = new a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;

        /* compiled from: SnoozeAlarmMutation.kt */
        public static final class a {
            private a() {
            }

            public final f a(g.a.a.h.s.o oVar) {
                kotlin.jvm.internal.k.e(oVar, "reader");
                String f2 = oVar.f(f.c[0]);
                kotlin.jvm.internal.k.c(f2);
                return new f(f2, oVar.f(f.c[1]));
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

    /* compiled from: ResponseFieldMapper.kt */
    public static final class g implements m<d> {
        public d a(g.a.a.h.s.o oVar) {
            kotlin.jvm.internal.k.f(oVar, "responseReader");
            return d.c.a(oVar);
        }
    }

    /* compiled from: SnoozeAlarmMutation.kt */
    public static final class h extends k.c {
        final /* synthetic */ c a;

        /* compiled from: InputFieldMarshaller.kt */
        public static final class a implements g.a.a.h.s.f {
            final /* synthetic */ h b;

            public a(h hVar) {
                this.b = hVar;
            }

            public void a(g.a.a.h.s.g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
                gVar.e("alarmId", this.b.a.h());
                gVar.a("snoozeSeconds", Integer.valueOf(this.b.a.i()));
            }
        }

        h(c cVar) {
            this.a = cVar;
        }

        public g.a.a.h.s.f b() {
            f.a aVar = g.a.a.h.s.f.a;
            return new a(this);
        }

        public Map<String, Object> c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("alarmId", this.a.h());
            linkedHashMap.put("snoozeSeconds", Integer.valueOf(this.a.i()));
            return linkedHashMap;
        }
    }

    static {
        new C0451c((DefaultConstructorMarker) null);
    }

    public c(String str, int i2) {
        kotlin.jvm.internal.k.e(str, "alarmId");
        this.c = str;
        this.f7109d = i2;
    }

    public String b() {
        return "bc64e59e26c5d3bf0edaa2a75871a3c0919176897701ea37b23d0db5e5f1ac76";
    }

    public m<d> c() {
        m.a aVar = m.a;
        return new g();
    }

    public i d(q qVar) {
        kotlin.jvm.internal.k.e(qVar, "scalarTypeAdapters");
        return g.a.a.h.s.h.a(this, false, true, qVar);
    }

    public String e() {
        return f7107e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.k.a(this.c, cVar.c) && this.f7109d == cVar.f7109d;
    }

    public /* bridge */ /* synthetic */ Object f(k.b bVar) {
        d dVar = (d) bVar;
        j(dVar);
        return dVar;
    }

    public k.c g() {
        return this.b;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        String str = this.c;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f7109d;
    }

    public final int i() {
        return this.f7109d;
    }

    public d j(d dVar) {
        return dVar;
    }

    public l name() {
        return f7108f;
    }

    public String toString() {
        return "SnoozeAlarmMutation(alarmId=" + this.c + ", snoozeSeconds=" + this.f7109d + ")";
    }
}
