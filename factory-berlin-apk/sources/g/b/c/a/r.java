package g.b.c.a;

import g.b.c.a.h0.f1;
import g.b.c.a.h0.w0;
import g.b.c.a.h0.z0;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PrimitiveSet */
public final class r<P> {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f9682d = Charset.forName("UTF-8");
    private ConcurrentMap<String, List<a<P>>> a = new ConcurrentHashMap();
    private a<P> b;
    private final Class<P> c;

    /* compiled from: PrimitiveSet */
    public static final class a<P> {
        private final P a;
        private final byte[] b;
        private final w0 c;

        /* renamed from: d  reason: collision with root package name */
        private final f1 f9683d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9684e;

        a(P p, byte[] bArr, w0 w0Var, f1 f1Var, int i2) {
            this.a = p;
            this.b = Arrays.copyOf(bArr, bArr.length);
            this.c = w0Var;
            this.f9683d = f1Var;
            this.f9684e = i2;
        }

        public final byte[] a() {
            byte[] bArr = this.b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public int b() {
            return this.f9684e;
        }

        public f1 c() {
            return this.f9683d;
        }

        public P d() {
            return this.a;
        }

        public w0 e() {
            return this.c;
        }
    }

    private r(Class<P> cls) {
        this.c = cls;
    }

    public static <P> r<P> f(Class<P> cls) {
        return new r<>(cls);
    }

    public a<P> a(P p, z0.c cVar) {
        if (cVar.U() == w0.ENABLED) {
            a aVar = new a(p, c.a(cVar), cVar.U(), cVar.T(), cVar.S());
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            String str = new String(aVar.a(), f9682d);
            List list = (List) this.a.put(str, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(aVar);
                this.a.put(str, Collections.unmodifiableList(arrayList2));
            }
            return aVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public a<P> b() {
        return this.b;
    }

    public List<a<P>> c(byte[] bArr) {
        List<a<P>> list = (List) this.a.get(new String(bArr, f9682d));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> d() {
        return this.c;
    }

    public List<a<P>> e() {
        return c(c.a);
    }

    public void g(a<P> aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (aVar.e() != w0.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!c(aVar.a()).isEmpty()) {
            this.b = aVar;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
