package g.b.c.a;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.q0;
import g.b.c.a.h0.v0;
import g.b.c.a.h0.w0;
import g.b.c.a.h0.x0;
import g.b.c.a.h0.z0;
import g.b.c.a.r;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: Registry */
public final class x {
    private static final Logger a = Logger.getLogger(x.class.getName());
    private static final ConcurrentMap<String, e> b = new ConcurrentHashMap();
    private static final ConcurrentMap<String, d> c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f9685d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, s<?>> f9686e = new ConcurrentHashMap();

    /* compiled from: Registry */
    class a implements e {
        final /* synthetic */ j a;

        a(j jVar) {
            this.a = jVar;
        }

        public <Q> g<Q> a(Class<Q> cls) {
            try {
                return new h(this.a, cls);
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException("Primitive type not supported", e2);
            }
        }

        public g<?> b() {
            j jVar = this.a;
            return new h(jVar, jVar.a());
        }

        public Class<?> c() {
            return null;
        }

        public Class<?> d() {
            return this.a.getClass();
        }

        public Set<Class<?>> e() {
            return this.a.h();
        }
    }

    /* compiled from: Registry */
    class b implements e {
        final /* synthetic */ u a;
        final /* synthetic */ j b;

        b(u uVar, j jVar) {
            this.a = uVar;
            this.b = jVar;
        }

        public <Q> g<Q> a(Class<Q> cls) {
            try {
                return new t(this.a, this.b, cls);
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException("Primitive type not supported", e2);
            }
        }

        public g<?> b() {
            u uVar = this.a;
            return new t(uVar, this.b, uVar.a());
        }

        public Class<?> c() {
            return this.b.getClass();
        }

        public Class<?> d() {
            return this.a.getClass();
        }

        public Set<Class<?>> e() {
            return this.a.h();
        }
    }

    /* compiled from: Registry */
    class c implements d {
        c(j jVar) {
        }
    }

    /* compiled from: Registry */
    private interface d {
    }

    /* compiled from: Registry */
    private interface e {
        <P> g<P> a(Class<P> cls);

        g<?> b();

        Class<?> c();

        Class<?> d();

        Set<Class<?>> e();
    }

    static {
        new ConcurrentHashMap();
    }

    private x() {
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private static <KeyProtoT extends q0> e b(j<KeyProtoT> jVar) {
        return new a(jVar);
    }

    private static <KeyProtoT extends q0> d c(j<KeyProtoT> jVar) {
        return new c(jVar);
    }

    private static <KeyProtoT extends q0, PublicKeyProtoT extends q0> e d(u<KeyProtoT, PublicKeyProtoT> uVar, j<PublicKeyProtoT> jVar) {
        return new b(uVar, jVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void e(java.lang.String r5, java.lang.Class<?> r6, boolean r7) {
        /*
            java.lang.Class<g.b.c.a.x> r0 = g.b.c.a.x.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, g.b.c.a.x$e> r1 = b     // Catch:{ all -> 0x0083 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.util.concurrent.ConcurrentMap<java.lang.String, g.b.c.a.x$e> r1 = b     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0083 }
            g.b.c.a.x$e r1 = (g.b.c.a.x.e) r1     // Catch:{ all -> 0x0083 }
            java.lang.Class r2 = r1.d()     // Catch:{ all -> 0x0083 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0049
            if (r7 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = f9685d     // Catch:{ all -> 0x0083 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r6 == 0) goto L_0x0030
            goto L_0x0047
        L_0x0030:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r7.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch:{ all -> 0x0083 }
            r7.append(r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0083 }
            r6.<init>(r5)     // Catch:{ all -> 0x0083 }
            throw r6     // Catch:{ all -> 0x0083 }
        L_0x0047:
            monitor-exit(r0)
            return
        L_0x0049:
            java.util.logging.Logger r7 = a     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch:{ all -> 0x0083 }
            r2.append(r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0083 }
            r7.warning(r2)     // Catch:{ all -> 0x0083 }
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0083 }
            r4 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0083 }
            r5 = 1
            java.lang.Class r1 = r1.d()     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0083 }
            r3[r5] = r1     // Catch:{ all -> 0x0083 }
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0083 }
            r3[r5] = r6     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0083 }
            r7.<init>(r5)     // Catch:{ all -> 0x0083 }
            throw r7     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.x.e(java.lang.String, java.lang.Class, boolean):void");
    }

    private static synchronized e f(String str) {
        e eVar;
        synchronized (x.class) {
            if (b.containsKey(str)) {
                eVar = (e) b.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return eVar;
    }

    private static <P> g<P> g(String str, Class<P> cls) {
        e f2 = f(str);
        if (cls == null) {
            return f2.b();
        }
        if (f2.e().contains(cls)) {
            return f2.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f2.d() + ", supported primitives: " + t(f2.e()));
    }

    public static <P> P h(String str, i iVar, Class<P> cls) {
        a(cls);
        return j(str, iVar, cls);
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) {
        return h(str, i.g(bArr), cls);
    }

    private static <P> P j(String str, i iVar, Class<P> cls) {
        return g(str, cls).b(iVar);
    }

    public static <P> r<P> k(k kVar, g<P> gVar, Class<P> cls) {
        a(cls);
        return m(kVar, gVar, cls);
    }

    public static <P> r<P> l(k kVar, Class<P> cls) {
        return k(kVar, (g) null, cls);
    }

    private static <P> r<P> m(k kVar, g<P> gVar, Class<P> cls) {
        P p;
        z.d(kVar.f());
        r<P> f2 = r.f(cls);
        for (z0.c next : kVar.f().T()) {
            if (next.U() == w0.ENABLED) {
                if (gVar == null || !gVar.a(next.R().S())) {
                    p = j(next.R().S(), next.R().T(), cls);
                } else {
                    p = gVar.b(next.R().T());
                }
                r.a<P> a2 = f2.a(p, next);
                if (next.S() == kVar.f().U()) {
                    f2.g(a2);
                }
            }
        }
        return f2;
    }

    public static g<?> n(String str) {
        return f(str).b();
    }

    public static synchronized q0 o(x0 x0Var) {
        q0 c2;
        synchronized (x.class) {
            g<?> n2 = n(x0Var.S());
            if (((Boolean) f9685d.get(x0Var.S())).booleanValue()) {
                c2 = n2.c(x0Var.T());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + x0Var.S());
            }
        }
        return c2;
    }

    public static synchronized v0 p(x0 x0Var) {
        v0 d2;
        synchronized (x.class) {
            g<?> n2 = n(x0Var.S());
            if (((Boolean) f9685d.get(x0Var.S())).booleanValue()) {
                d2 = n2.d(x0Var.T());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + x0Var.S());
            }
        }
        return d2;
    }

    public static synchronized <KeyProtoT extends q0, PublicKeyProtoT extends q0> void q(u<KeyProtoT, PublicKeyProtoT> uVar, j<PublicKeyProtoT> jVar, boolean z) {
        Class<?> c2;
        synchronized (x.class) {
            if (uVar == null || jVar == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            String c3 = uVar.c();
            String c4 = jVar.c();
            e(c3, uVar.getClass(), z);
            e(c4, jVar.getClass(), false);
            if (!c3.equals(c4)) {
                if (b.containsKey(c3) && (c2 = ((e) b.get(c3)).c()) != null) {
                    if (!c2.equals(jVar.getClass())) {
                        Logger logger = a;
                        logger.warning("Attempted overwrite of a registered key manager for key type " + c3 + " with inconsistent public key type " + c4);
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{uVar.getClass().getName(), c2.getName(), jVar.getClass().getName()}));
                    }
                }
                if (!b.containsKey(c3) || ((e) b.get(c3)).c() == null) {
                    b.put(c3, d(uVar, jVar));
                    c.put(c3, c(uVar));
                }
                f9685d.put(c3, Boolean.valueOf(z));
                if (!b.containsKey(c4)) {
                    b.put(c4, b(jVar));
                }
                f9685d.put(c4, Boolean.FALSE);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized <KeyProtoT extends q0> void r(j<KeyProtoT> jVar, boolean z) {
        synchronized (x.class) {
            if (jVar != null) {
                String c2 = jVar.c();
                e(c2, jVar.getClass(), z);
                if (!b.containsKey(c2)) {
                    b.put(c2, b(jVar));
                    c.put(c2, c(jVar));
                }
                f9685d.put(c2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <P> void s(s<P> sVar) {
        synchronized (x.class) {
            if (sVar != null) {
                Class<P> b2 = sVar.b();
                if (f9686e.containsKey(b2)) {
                    s sVar2 = (s) f9686e.get(b2);
                    if (!sVar.getClass().equals(sVar2.getClass())) {
                        Logger logger = a;
                        logger.warning("Attempted overwrite of a registered SetWrapper for type " + b2);
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{b2.getName(), sVar2.getClass().getName(), sVar.getClass().getName()}));
                    }
                }
                f9686e.put(b2, sVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static String t(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    public static <P> P u(r<P> rVar) {
        s sVar = (s) f9686e.get(rVar.d());
        if (sVar != null) {
            return sVar.a(rVar);
        }
        throw new GeneralSecurityException("No wrapper found for " + rVar.d().getName());
    }
}
