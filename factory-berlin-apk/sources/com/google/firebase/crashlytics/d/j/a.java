package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoCrashlyticsReportEncoder */
public final class a implements com.google.firebase.encoders.f.a {
    public static final com.google.firebase.encoders.f.a a = new a();

    /* renamed from: com.google.firebase.crashlytics.d.j.a$a  reason: collision with other inner class name */
    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class C0093a implements com.google.firebase.encoders.b<v.b> {
        static final C0093a a = new C0093a();

        private C0093a() {
        }

        /* renamed from: b */
        public void a(v.b bVar, com.google.firebase.encoders.c cVar) {
            cVar.f("key", bVar.b());
            cVar.f("value", bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class b implements com.google.firebase.encoders.b<v> {
        static final b a = new b();

        private b() {
        }

        /* renamed from: b */
        public void a(v vVar, com.google.firebase.encoders.c cVar) {
            cVar.f("sdkVersion", vVar.i());
            cVar.f("gmpAppId", vVar.e());
            cVar.c("platform", vVar.h());
            cVar.f("installationUuid", vVar.f());
            cVar.f("buildVersion", vVar.c());
            cVar.f("displayVersion", vVar.d());
            cVar.f("session", vVar.j());
            cVar.f("ndkPayload", vVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class c implements com.google.firebase.encoders.b<v.c> {
        static final c a = new c();

        private c() {
        }

        /* renamed from: b */
        public void a(v.c cVar, com.google.firebase.encoders.c cVar2) {
            cVar2.f("files", cVar.b());
            cVar2.f("orgId", cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class d implements com.google.firebase.encoders.b<v.c.b> {
        static final d a = new d();

        private d() {
        }

        /* renamed from: b */
        public void a(v.c.b bVar, com.google.firebase.encoders.c cVar) {
            cVar.f("filename", bVar.c());
            cVar.f("contents", bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class e implements com.google.firebase.encoders.b<v.d.a> {
        static final e a = new e();

        private e() {
        }

        /* renamed from: b */
        public void a(v.d.a aVar, com.google.firebase.encoders.c cVar) {
            cVar.f("identifier", aVar.c());
            cVar.f("version", aVar.f());
            cVar.f("displayVersion", aVar.b());
            cVar.f("organization", aVar.e());
            cVar.f("installationUuid", aVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class f implements com.google.firebase.encoders.b<v.d.a.b> {
        static final f a = new f();

        private f() {
        }

        /* renamed from: b */
        public void a(v.d.a.b bVar, com.google.firebase.encoders.c cVar) {
            cVar.f("clsId", bVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class g implements com.google.firebase.encoders.b<v.d.c> {
        static final g a = new g();

        private g() {
        }

        /* renamed from: b */
        public void a(v.d.c cVar, com.google.firebase.encoders.c cVar2) {
            cVar2.c("arch", cVar.b());
            cVar2.f("model", cVar.f());
            cVar2.c("cores", cVar.c());
            cVar2.b("ram", cVar.h());
            cVar2.b("diskSpace", cVar.d());
            cVar2.a("simulator", cVar.j());
            cVar2.c("state", cVar.i());
            cVar2.f("manufacturer", cVar.e());
            cVar2.f("modelClass", cVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class h implements com.google.firebase.encoders.b<v.d> {
        static final h a = new h();

        private h() {
        }

        /* renamed from: b */
        public void a(v.d dVar, com.google.firebase.encoders.c cVar) {
            cVar.f("generator", dVar.f());
            cVar.f("identifier", dVar.i());
            cVar.b("startedAt", dVar.k());
            cVar.f("endedAt", dVar.d());
            cVar.a("crashed", dVar.m());
            cVar.f("app", dVar.b());
            cVar.f("user", dVar.l());
            cVar.f("os", dVar.j());
            cVar.f("device", dVar.c());
            cVar.f("events", dVar.e());
            cVar.c("generatorType", dVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class i implements com.google.firebase.encoders.b<v.d.C0096d.a> {
        static final i a = new i();

        private i() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.a aVar, com.google.firebase.encoders.c cVar) {
            cVar.f("execution", aVar.d());
            cVar.f("customAttributes", aVar.c());
            cVar.f("background", aVar.b());
            cVar.c("uiOrientation", aVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class j implements com.google.firebase.encoders.b<v.d.C0096d.a.b.C0098a> {
        static final j a = new j();

        private j() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.a.b.C0098a aVar, com.google.firebase.encoders.c cVar) {
            cVar.b("baseAddress", aVar.b());
            cVar.b("size", aVar.d());
            cVar.f("name", aVar.c());
            cVar.f("uuid", aVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class k implements com.google.firebase.encoders.b<v.d.C0096d.a.b> {
        static final k a = new k();

        private k() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.a.b bVar, com.google.firebase.encoders.c cVar) {
            cVar.f("threads", bVar.e());
            cVar.f("exception", bVar.c());
            cVar.f("signal", bVar.d());
            cVar.f("binaries", bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class l implements com.google.firebase.encoders.b<v.d.C0096d.a.b.c> {
        static final l a = new l();

        private l() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.a.b.c cVar, com.google.firebase.encoders.c cVar2) {
            cVar2.f("type", cVar.f());
            cVar2.f("reason", cVar.e());
            cVar2.f("frames", cVar.c());
            cVar2.f("causedBy", cVar.b());
            cVar2.c("overflowCount", cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class m implements com.google.firebase.encoders.b<v.d.C0096d.a.b.C0102d> {
        static final m a = new m();

        private m() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.a.b.C0102d dVar, com.google.firebase.encoders.c cVar) {
            cVar.f("name", dVar.d());
            cVar.f("code", dVar.c());
            cVar.b("address", dVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class n implements com.google.firebase.encoders.b<v.d.C0096d.a.b.e> {
        static final n a = new n();

        private n() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.a.b.e eVar, com.google.firebase.encoders.c cVar) {
            cVar.f("name", eVar.d());
            cVar.c("importance", eVar.c());
            cVar.f("frames", eVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class o implements com.google.firebase.encoders.b<v.d.C0096d.a.b.e.C0105b> {
        static final o a = new o();

        private o() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.a.b.e.C0105b bVar, com.google.firebase.encoders.c cVar) {
            cVar.b("pc", bVar.e());
            cVar.f("symbol", bVar.f());
            cVar.f("file", bVar.b());
            cVar.b("offset", bVar.d());
            cVar.c("importance", bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class p implements com.google.firebase.encoders.b<v.d.C0096d.c> {
        static final p a = new p();

        private p() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.c cVar, com.google.firebase.encoders.c cVar2) {
            cVar2.f("batteryLevel", cVar.b());
            cVar2.c("batteryVelocity", cVar.c());
            cVar2.a("proximityOn", cVar.g());
            cVar2.c("orientation", cVar.e());
            cVar2.b("ramUsed", cVar.f());
            cVar2.b("diskUsed", cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class q implements com.google.firebase.encoders.b<v.d.C0096d> {
        static final q a = new q();

        private q() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d dVar, com.google.firebase.encoders.c cVar) {
            cVar.b("timestamp", dVar.e());
            cVar.f("type", dVar.f());
            cVar.f("app", dVar.b());
            cVar.f("device", dVar.c());
            cVar.f("log", dVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class r implements com.google.firebase.encoders.b<v.d.C0096d.C0107d> {
        static final r a = new r();

        private r() {
        }

        /* renamed from: b */
        public void a(v.d.C0096d.C0107d dVar, com.google.firebase.encoders.c cVar) {
            cVar.f("content", dVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class s implements com.google.firebase.encoders.b<v.d.e> {
        static final s a = new s();

        private s() {
        }

        /* renamed from: b */
        public void a(v.d.e eVar, com.google.firebase.encoders.c cVar) {
            cVar.c("platform", eVar.c());
            cVar.f("version", eVar.d());
            cVar.f("buildVersion", eVar.b());
            cVar.a("jailbroken", eVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder */
    private static final class t implements com.google.firebase.encoders.b<v.d.f> {
        static final t a = new t();

        private t() {
        }

        /* renamed from: b */
        public void a(v.d.f fVar, com.google.firebase.encoders.c cVar) {
            cVar.f("identifier", fVar.b());
        }
    }

    private a() {
    }

    public void a(com.google.firebase.encoders.f.b<?> bVar) {
        bVar.a(v.class, b.a);
        bVar.a(b.class, b.a);
        bVar.a(v.d.class, h.a);
        bVar.a(f.class, h.a);
        bVar.a(v.d.a.class, e.a);
        bVar.a(g.class, e.a);
        bVar.a(v.d.a.b.class, f.a);
        bVar.a(h.class, f.a);
        bVar.a(v.d.f.class, t.a);
        bVar.a(u.class, t.a);
        bVar.a(v.d.e.class, s.a);
        bVar.a(t.class, s.a);
        bVar.a(v.d.c.class, g.a);
        bVar.a(i.class, g.a);
        bVar.a(v.d.C0096d.class, q.a);
        bVar.a(j.class, q.a);
        bVar.a(v.d.C0096d.a.class, i.a);
        bVar.a(k.class, i.a);
        bVar.a(v.d.C0096d.a.b.class, k.a);
        bVar.a(l.class, k.a);
        bVar.a(v.d.C0096d.a.b.e.class, n.a);
        bVar.a(p.class, n.a);
        bVar.a(v.d.C0096d.a.b.e.C0105b.class, o.a);
        bVar.a(q.class, o.a);
        bVar.a(v.d.C0096d.a.b.c.class, l.a);
        bVar.a(n.class, l.a);
        bVar.a(v.d.C0096d.a.b.C0102d.class, m.a);
        bVar.a(o.class, m.a);
        bVar.a(v.d.C0096d.a.b.C0098a.class, j.a);
        bVar.a(m.class, j.a);
        bVar.a(v.b.class, C0093a.a);
        bVar.a(c.class, C0093a.a);
        bVar.a(v.d.C0096d.c.class, p.a);
        bVar.a(r.class, p.a);
        bVar.a(v.d.C0096d.C0107d.class, r.a);
        bVar.a(s.class, r.a);
        bVar.a(v.c.class, c.a);
        bVar.a(d.class, c.a);
        bVar.a(v.c.b.class, d.a);
        bVar.a(e.class, d.a);
    }
}
