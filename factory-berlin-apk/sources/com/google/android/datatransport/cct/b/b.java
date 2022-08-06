package com.google.android.datatransport.cct.b;

public final class b implements com.google.firebase.encoders.f.a {
    public static final com.google.firebase.encoders.f.a a = new b();

    private static final class a implements com.google.firebase.encoders.b<a> {
        static final a a = new a();

        private a() {
        }

        public void a(Object obj, Object obj2) {
            a aVar = (a) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("sdkVersion", aVar.i());
            cVar.f("model", aVar.f());
            cVar.f("hardware", aVar.d());
            cVar.f("device", aVar.b());
            cVar.f("product", aVar.h());
            cVar.f("osBuild", aVar.g());
            cVar.f("manufacturer", aVar.e());
            cVar.f("fingerprint", aVar.c());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$b  reason: collision with other inner class name */
    private static final class C0057b implements com.google.firebase.encoders.b<j> {
        static final C0057b a = new C0057b();

        private C0057b() {
        }

        public void a(Object obj, Object obj2) {
            ((com.google.firebase.encoders.c) obj2).f("logRequest", ((j) obj).b());
        }
    }

    private static final class c implements com.google.firebase.encoders.b<k> {
        static final c a = new c();

        private c() {
        }

        public void a(Object obj, Object obj2) {
            k kVar = (k) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("clientType", kVar.c());
            cVar.f("androidClientInfo", kVar.b());
        }
    }

    private static final class d implements com.google.firebase.encoders.b<l> {
        static final d a = new d();

        private d() {
        }

        public void a(Object obj, Object obj2) {
            l lVar = (l) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.b("eventTimeMs", lVar.d());
            cVar.f("eventCode", lVar.c());
            cVar.b("eventUptimeMs", lVar.e());
            cVar.f("sourceExtension", lVar.g());
            cVar.f("sourceExtensionJsonProto3", lVar.h());
            cVar.b("timezoneOffsetSeconds", lVar.i());
            cVar.f("networkConnectionInfo", lVar.f());
        }
    }

    private static final class e implements com.google.firebase.encoders.b<m> {
        static final e a = new e();

        private e() {
        }

        public void a(Object obj, Object obj2) {
            m mVar = (m) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.b("requestTimeMs", mVar.g());
            cVar.b("requestUptimeMs", mVar.h());
            cVar.f("clientInfo", mVar.b());
            cVar.f("logSource", mVar.d());
            cVar.f("logSourceName", mVar.e());
            cVar.f("logEvent", mVar.c());
            cVar.f("qosTier", mVar.f());
        }
    }

    private static final class f implements com.google.firebase.encoders.b<o> {
        static final f a = new f();

        private f() {
        }

        public void a(Object obj, Object obj2) {
            o oVar = (o) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("networkType", oVar.c());
            cVar.f("mobileSubtype", oVar.b());
        }
    }

    private b() {
    }

    public void a(com.google.firebase.encoders.f.b<?> bVar) {
        bVar.a(j.class, C0057b.a);
        bVar.a(d.class, C0057b.a);
        bVar.a(m.class, e.a);
        bVar.a(g.class, e.a);
        bVar.a(k.class, c.a);
        bVar.a(e.class, c.a);
        bVar.a(a.class, a.a);
        bVar.a(c.class, a.a);
        bVar.a(l.class, d.a);
        bVar.a(f.class, d.a);
        bVar.a(o.class, f.a);
        bVar.a(i.class, f.a);
    }
}
