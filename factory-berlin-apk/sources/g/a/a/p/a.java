package g.a.a.p;

import com.apollographql.apollo.api.internal.json.g;
import com.apollographql.apollo.cache.normalized.k.h;
import g.a.a.h.e;
import g.a.a.h.k;
import g.a.a.h.k.b;
import g.a.a.h.q;
import g.a.a.h.s.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: OperationResponseParser */
public final class a<D extends k.b, W> {
    final k<D, W, ?> a;
    final m b;
    final q c;

    /* renamed from: d  reason: collision with root package name */
    final h<Map<String, Object>> f9250d;

    /* renamed from: g.a.a.p.a$a  reason: collision with other inner class name */
    /* compiled from: OperationResponseParser */
    class C0626a implements g.b<Object> {
        C0626a() {
        }

        public Object a(g gVar) {
            Map<String, Object> q = gVar.q();
            k.c g2 = a.this.a.g();
            g.a.a.n.h.a aVar = new g.a.a.n.h.a();
            a aVar2 = a.this;
            return a.this.b.a(new g.a.a.n.j.a(g2, q, aVar, aVar2.c, aVar2.f9250d));
        }
    }

    /* compiled from: OperationResponseParser */
    class b implements g.b<Map<String, Object>> {
        b(a aVar) {
        }

        /* renamed from: b */
        public Map<String, Object> a(g gVar) {
            return gVar.q();
        }
    }

    /* compiled from: OperationResponseParser */
    class c implements g.a<e> {

        /* renamed from: g.a.a.p.a$c$a  reason: collision with other inner class name */
        /* compiled from: OperationResponseParser */
        class C0627a implements g.b<e> {
            C0627a(c cVar) {
            }

            /* renamed from: b */
            public e a(g gVar) {
                return a.b(gVar.q());
            }
        }

        c(a aVar) {
        }

        /* renamed from: b */
        public e a(g gVar) {
            return (e) gVar.k(true, new C0627a(this));
        }
    }

    public a(k<D, W, ?> kVar, m mVar, q qVar, h<Map<String, Object>> hVar) {
        this.a = kVar;
        this.b = mVar;
        this.c = qVar;
        this.f9250d = hVar;
    }

    public static e b(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (true) {
            String str = "";
            while (true) {
                if (!it.hasNext()) {
                    return new e(str, arrayList, hashMap);
                }
                Map.Entry next = it.next();
                if ("message".equals(next.getKey())) {
                    Object value = next.getValue();
                    if (value != null) {
                        str = value.toString();
                    }
                } else if ("locations".equals(next.getKey())) {
                    List<Map> list = (List) next.getValue();
                    if (list != null) {
                        for (Map c2 : list) {
                            arrayList.add(c(c2));
                        }
                    }
                } else if (next.getValue() != null) {
                    hashMap.put((String) next.getKey(), next.getValue());
                }
            }
        }
    }

    private static e.a c(Map<String, Object> map) {
        long j2;
        long j3 = -1;
        if (map != null) {
            j2 = -1;
            for (Map.Entry next : map.entrySet()) {
                if ("line".equals(next.getKey())) {
                    j3 = ((Number) next.getValue()).longValue();
                } else if ("column".equals(next.getKey())) {
                    j2 = ((Number) next.getValue()).longValue();
                }
            }
        } else {
            j2 = -1;
        }
        return new e.a(j3, j2);
    }

    private List<e> d(g gVar) {
        return gVar.i(true, new c(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.apollographql.apollo.api.internal.json.a} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [g.a.a.h.k$b] */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.a.a.h.n<W> a(l.h r8) {
        /*
            r7 = this;
            com.apollographql.apollo.cache.normalized.k.h<java.util.Map<java.lang.String, java.lang.Object>> r0 = r7.f9250d
            g.a.a.h.k<D, W, ?> r1 = r7.a
            r0.p(r1)
            r0 = 0
            com.apollographql.apollo.api.internal.json.a r1 = new com.apollographql.apollo.api.internal.json.a     // Catch:{ all -> 0x0087 }
            r1.<init>(r8)     // Catch:{ all -> 0x0087 }
            r1.X()     // Catch:{ all -> 0x0084 }
            com.apollographql.apollo.api.internal.json.g r8 = new com.apollographql.apollo.api.internal.json.g     // Catch:{ all -> 0x0084 }
            r8.<init>(r1)     // Catch:{ all -> 0x0084 }
            r2 = r0
            r3 = r2
        L_0x0017:
            boolean r4 = r8.b()     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x005b
            java.lang.String r4 = r8.j()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "data"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x0084 }
            r6 = 1
            if (r5 == 0) goto L_0x0036
            g.a.a.p.a$a r0 = new g.a.a.p.a$a     // Catch:{ all -> 0x0084 }
            r0.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r8.k(r6, r0)     // Catch:{ all -> 0x0084 }
            g.a.a.h.k$b r0 = (g.a.a.h.k.b) r0     // Catch:{ all -> 0x0084 }
            goto L_0x0017
        L_0x0036:
            java.lang.String r5 = "errors"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x0084 }
            if (r5 == 0) goto L_0x0043
            java.util.List r2 = r7.d(r8)     // Catch:{ all -> 0x0084 }
            goto L_0x0017
        L_0x0043:
            java.lang.String r5 = "extensions"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0057
            g.a.a.p.a$b r3 = new g.a.a.p.a$b     // Catch:{ all -> 0x0084 }
            r3.<init>(r7)     // Catch:{ all -> 0x0084 }
            java.lang.Object r3 = r8.k(r6, r3)     // Catch:{ all -> 0x0084 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0084 }
            goto L_0x0017
        L_0x0057:
            r8.p()     // Catch:{ all -> 0x0084 }
            goto L_0x0017
        L_0x005b:
            r1.z0()     // Catch:{ all -> 0x0084 }
            g.a.a.h.k<D, W, ?> r8 = r7.a     // Catch:{ all -> 0x0084 }
            g.a.a.h.n$a r8 = g.a.a.h.n.a(r8)     // Catch:{ all -> 0x0084 }
            g.a.a.h.k<D, W, ?> r4 = r7.a     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r4.f(r0)     // Catch:{ all -> 0x0084 }
            r8.b(r0)     // Catch:{ all -> 0x0084 }
            r8.d(r2)     // Catch:{ all -> 0x0084 }
            com.apollographql.apollo.cache.normalized.k.h<java.util.Map<java.lang.String, java.lang.Object>> r0 = r7.f9250d     // Catch:{ all -> 0x0084 }
            java.util.Set r0 = r0.k()     // Catch:{ all -> 0x0084 }
            r8.c(r0)     // Catch:{ all -> 0x0084 }
            r8.f(r3)     // Catch:{ all -> 0x0084 }
            g.a.a.h.n r8 = r8.a()     // Catch:{ all -> 0x0084 }
            r1.close()
            return r8
        L_0x0084:
            r8 = move-exception
            r0 = r1
            goto L_0x0088
        L_0x0087:
            r8 = move-exception
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.close()
        L_0x008d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.p.a.a(l.h):g.a.a.h.n");
    }
}
