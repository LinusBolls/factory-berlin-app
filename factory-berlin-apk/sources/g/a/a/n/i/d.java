package g.a.a.n.i;

import com.apollographql.apollo.exception.ApolloNetworkException;
import g.a.a.h.g;
import g.a.a.h.h;
import g.a.a.h.k;
import g.a.a.h.m;
import g.a.a.h.q;
import g.a.a.h.r.a.b;
import g.a.a.h.s.i;
import g.a.a.m.a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k.b0;
import k.c0;
import k.d0;
import k.e;
import k.f;
import k.v;
import k.x;
import k.y;

/* compiled from: ApolloServerInterceptor */
public final class d implements g.a.a.m.a {

    /* renamed from: i  reason: collision with root package name */
    static final x f9236i = x.g("application/json; charset=utf-8");
    final v a;
    final e.a b;
    final i<b.c> c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f9237d;

    /* renamed from: e  reason: collision with root package name */
    final g.a.a.h.s.c f9238e;

    /* renamed from: f  reason: collision with root package name */
    final q f9239f;

    /* renamed from: g  reason: collision with root package name */
    AtomicReference<e> f9240g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    volatile boolean f9241h;

    /* compiled from: ApolloServerInterceptor */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a.c f9242g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a.C0610a f9243h;

        a(a.c cVar, a.C0610a aVar) {
            this.f9242g = cVar;
            this.f9243h = aVar;
        }

        public void run() {
            d.this.g(this.f9242g, this.f9243h);
        }
    }

    /* compiled from: ApolloServerInterceptor */
    class b implements f {
        final /* synthetic */ e a;
        final /* synthetic */ a.c b;
        final /* synthetic */ a.C0610a c;

        b(e eVar, a.c cVar, a.C0610a aVar) {
            this.a = eVar;
            this.b = cVar;
            this.c = aVar;
        }

        public void a(e eVar, d0 d0Var) {
            if (!d.this.f9241h && d.this.f9240g.compareAndSet(this.a, (Object) null)) {
                this.c.c(new a.d(d0Var));
                this.c.d();
            }
        }

        public void b(e eVar, IOException iOException) {
            if (!d.this.f9241h && d.this.f9240g.compareAndSet(this.a, (Object) null)) {
                d.this.f9238e.d(iOException, "Failed to execute http call for operation %s", this.b.b.name().name());
                this.c.a(new ApolloNetworkException("Failed to execute http call", iOException));
            }
        }
    }

    /* compiled from: ApolloServerInterceptor */
    private static final class c {
        public final String a;
        public final String b;
        public final File c;

        c(String str, String str2, File file) {
            this.a = str;
            this.b = str2;
            this.c = file;
        }
    }

    public d(v vVar, e.a aVar, b.c cVar, boolean z, q qVar, g.a.a.h.s.c cVar2) {
        g.a.a.h.s.q.b(vVar, "serverUrl == null");
        this.a = vVar;
        g.a.a.h.s.q.b(aVar, "httpCallFactory == null");
        this.b = aVar;
        this.c = i.d(cVar);
        this.f9237d = z;
        g.a.a.h.s.q.b(qVar, "scalarTypeAdapters == null");
        this.f9239f = qVar;
        g.a.a.h.s.q.b(cVar2, "logger == null");
        this.f9238e = cVar2;
    }

    static void c(v.a aVar, k kVar) {
        l.f fVar = new l.f();
        com.apollographql.apollo.api.internal.json.f K = com.apollographql.apollo.api.internal.json.f.K(fVar);
        K.Z(true);
        K.b();
        K.D("persistedQuery");
        K.b();
        K.D("version");
        K.i0(1);
        K.D("sha256Hash");
        K.r0(kVar.b());
        K.i();
        K.i();
        K.close();
        aVar.c("extensions", fVar.P0());
    }

    static void d(v.a aVar, k kVar, q qVar) {
        l.f fVar = new l.f();
        com.apollographql.apollo.api.internal.json.f K = com.apollographql.apollo.api.internal.json.f.K(fVar);
        K.Z(true);
        K.b();
        kVar.g().b().a(new com.apollographql.apollo.api.internal.json.b(K, qVar));
        K.i();
        K.close();
        aVar.c("variables", fVar.P0());
    }

    static String e(k kVar, q qVar) {
        return l(kVar, qVar, true, true).x().t();
    }

    static v i(v vVar, k kVar, q qVar, boolean z, boolean z2) {
        v.a k2 = vVar.k();
        if (!z2 || z) {
            k2.c("query", kVar.e());
        }
        if (kVar.g() != k.a) {
            d(k2, kVar, qVar);
        }
        k2.c("operationName", kVar.name().name());
        if (z2) {
            c(k2, kVar);
        }
        return k2.d();
    }

    static c0 j(c0 c0Var, ArrayList<c> arrayList) {
        l.f fVar = new l.f();
        com.apollographql.apollo.api.internal.json.f K = com.apollographql.apollo.api.internal.json.f.K(fVar);
        K.b();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            K.D(String.valueOf(i2));
            K.a();
            K.r0(arrayList.get(i2).a);
            K.h();
        }
        K.i();
        K.close();
        y.a aVar = new y.a();
        aVar.f(y.f10545h);
        aVar.b("operations", (String) null, c0Var);
        aVar.b("map", (String) null, c0.e(f9236i, fVar.K0()));
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            c cVar = arrayList.get(i3);
            aVar.b(String.valueOf(i3), cVar.c.getName(), c0.c(x.g(cVar.b), cVar.c));
        }
        return aVar.e();
    }

    static l.i l(k kVar, q qVar, boolean z, boolean z2) {
        if (kVar instanceof m) {
            return ((m) kVar).a(z2, z, qVar);
        }
        return kVar.d(qVar);
    }

    private static void m(Object obj, String str, ArrayList<c> arrayList) {
        int i2 = 0;
        if (obj instanceof g.a.a.h.i) {
            try {
                Field[] declaredFields = obj.getClass().getDeclaredFields();
                int length = declaredFields.length;
                while (i2 < length) {
                    Field field = declaredFields[i2];
                    field.setAccessible(true);
                    m(field.get(obj), str + "." + field.getName(), arrayList);
                    i2++;
                }
            } catch (IllegalAccessException unused) {
            }
        } else if (obj instanceof h) {
            m(((h) obj).a, str, arrayList);
        } else if (obj instanceof g) {
            g gVar = (g) obj;
            arrayList.add(new c(str, gVar.b(), new File(gVar.a())));
            System.out.println(str);
        } else if (obj instanceof g[]) {
            g[] gVarArr = (g[]) obj;
            int length2 = gVarArr.length;
            int i3 = 0;
            while (i2 < length2) {
                g gVar2 = gVarArr[i2];
                String str2 = str + "." + i3;
                arrayList.add(new c(str2, gVar2.b(), new File(gVar2.a())));
                System.out.println(str2);
                i3++;
                i2++;
            }
        } else if (obj instanceof Collection) {
            Object[] array = ((Collection) obj).toArray();
            while (i2 < array.length) {
                m(array[i2], str + "." + i2, arrayList);
                i2++;
            }
        }
    }

    static c0 n(c0 c0Var, k kVar) {
        ArrayList arrayList = new ArrayList();
        for (String next : kVar.g().c().keySet()) {
            Object obj = kVar.g().c().get(next);
            m(obj, "variables." + next, arrayList);
        }
        if (arrayList.isEmpty()) {
            return c0Var;
        }
        return j(c0Var, arrayList);
    }

    public void a() {
        this.f9241h = true;
        e andSet = this.f9240g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel();
        }
    }

    public void b(a.c cVar, g.a.a.m.b bVar, Executor executor, a.C0610a aVar) {
        executor.execute(new a(cVar, aVar));
    }

    /* access modifiers changed from: package-private */
    public void f(b0.a aVar, k kVar, g.a.a.i.a aVar2, g.a.a.o.a aVar3) {
        aVar.e("Accept", "application/json");
        aVar.e("X-APOLLO-OPERATION-ID", kVar.b());
        aVar.e("X-APOLLO-OPERATION-NAME", kVar.name().name());
        aVar.k(kVar.b());
        for (String next : aVar3.c()) {
            aVar.e(next, aVar3.b(next));
        }
        if (this.c.f()) {
            b.c e2 = this.c.e();
            boolean equalsIgnoreCase = "true".equalsIgnoreCase(aVar2.b("do-not-store"));
            aVar.e("X-APOLLO-CACHE-KEY", e(kVar, this.f9239f));
            aVar.e("X-APOLLO-CACHE-FETCH-STRATEGY", e2.a.name());
            aVar.e("X-APOLLO-EXPIRE-TIMEOUT", String.valueOf(e2.a()));
            aVar.e("X-APOLLO-EXPIRE-AFTER-READ", Boolean.toString(e2.f9083d));
            aVar.e("X-APOLLO-PREFETCH", Boolean.toString(this.f9237d));
            aVar.e("X-APOLLO-CACHE-DO-NOT-STORE", Boolean.toString(equalsIgnoreCase));
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a.c cVar, a.C0610a aVar) {
        e eVar;
        if (!this.f9241h) {
            aVar.b(a.b.NETWORK);
            try {
                if (!cVar.f9142h || !(cVar.b instanceof m)) {
                    eVar = k(cVar.b, cVar.c, cVar.f9138d, cVar.f9141g, cVar.f9143i);
                } else {
                    eVar = h(cVar.b, cVar.c, cVar.f9138d, cVar.f9141g, cVar.f9143i);
                }
                e andSet = this.f9240g.getAndSet(eVar);
                if (andSet != null) {
                    andSet.cancel();
                }
                if (eVar.n() || this.f9241h) {
                    this.f9240g.compareAndSet(eVar, (Object) null);
                } else {
                    eVar.K(new b(eVar, cVar, aVar));
                }
            } catch (IOException e2) {
                this.f9238e.d(e2, "Failed to prepare http call for operation %s", cVar.b.name().name());
                aVar.a(new ApolloNetworkException("Failed to prepare http call", e2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public e h(k kVar, g.a.a.i.a aVar, g.a.a.o.a aVar2, boolean z, boolean z2) {
        b0.a aVar3 = new b0.a();
        aVar3.m(i(this.a, kVar, this.f9239f, z, z2));
        aVar3.d();
        f(aVar3, kVar, aVar, aVar2);
        return this.b.c(aVar3.b());
    }

    /* access modifiers changed from: package-private */
    public e k(k kVar, g.a.a.i.a aVar, g.a.a.o.a aVar2, boolean z, boolean z2) {
        c0 n2 = n(c0.e(f9236i, l(kVar, this.f9239f, z, z2)), kVar);
        b0.a aVar3 = new b0.a();
        aVar3.m(this.a);
        aVar3.e("Content-Type", "application/json");
        aVar3.h(n2);
        f(aVar3, kVar, aVar, aVar2);
        return this.b.c(aVar3.b());
    }
}
