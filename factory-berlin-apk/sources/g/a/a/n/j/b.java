package g.a.a.n.j;

import g.a.a.h.k;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.l;
import g.a.a.h.s.n;
import g.a.a.h.s.p;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.x;

/* compiled from: RealResponseWriter.kt */
public final class b implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9249d = new a((DefaultConstructorMarker) null);
    private final Map<String, C0624b> a = new LinkedHashMap();
    private final k.c b;
    private final q c;

    /* compiled from: RealResponseWriter.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final void b(o oVar, Object obj) {
            if (!oVar.d() && obj == null) {
                x xVar = x.a;
                String format = String.format("Mandatory response field `%s` resolved with null value", Arrays.copyOf(new Object[]{oVar.e()}, 1));
                kotlin.jvm.internal.k.b(format, "java.lang.String.format(format, *args)");
                throw new NullPointerException(format);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.a.a.n.j.b$b  reason: collision with other inner class name */
    /* compiled from: RealResponseWriter.kt */
    public static final class C0624b {
        private final o a;
        private final Object b;

        public C0624b(o oVar, Object obj) {
            kotlin.jvm.internal.k.f(oVar, "field");
            this.a = oVar;
            this.b = obj;
        }

        public final o a() {
            return this.a;
        }

        public final Object b() {
            return this.b;
        }
    }

    /* compiled from: RealResponseWriter.kt */
    private static final class c implements p.b {
        private final k.c a;
        private final q b;
        private final List<Object> c;

        public c(k.c cVar, q qVar, List<Object> list) {
            kotlin.jvm.internal.k.f(cVar, "operationVariables");
            kotlin.jvm.internal.k.f(qVar, "scalarTypeAdapters");
            kotlin.jvm.internal.k.f(list, "accumulator");
            this.a = cVar;
            this.b = qVar;
            this.c = list;
        }

        public void a(n nVar) {
            b bVar = new b(this.a, this.b);
            if (nVar != null) {
                nVar.a(bVar);
                this.c.add(bVar.j());
                return;
            }
            kotlin.jvm.internal.k.m();
            throw null;
        }
    }

    public b(k.c cVar, q qVar) {
        kotlin.jvm.internal.k.f(cVar, "operationVariables");
        kotlin.jvm.internal.k.f(qVar, "scalarTypeAdapters");
        this.b = cVar;
        this.c = qVar;
    }

    private final Map<String, Object> k(Map<String, C0624b> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object b2 = ((C0624b) next.getValue()).b();
            if (b2 == null) {
                linkedHashMap.put(str, (Object) null);
            } else if (b2 instanceof Map) {
                linkedHashMap.put(str, k((Map) b2));
            } else if (b2 instanceof List) {
                linkedHashMap.put(str, l((List) b2));
            } else {
                linkedHashMap.put(str, b2);
            }
        }
        return linkedHashMap;
    }

    private final List<?> l(List<?> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof Map) {
                arrayList.add(k((Map) next));
            } else if (next instanceof List) {
                arrayList.add(l((List) next));
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final void m(k.c cVar, l<Map<String, Object>> lVar, Map<String, C0624b> map) {
        Map<String, Object> k2 = k(map);
        for (String next : map.keySet()) {
            C0624b bVar = map.get(next);
            Object obj = k2.get(next);
            if (bVar != null) {
                lVar.g(bVar.a(), cVar, bVar.b());
                int i2 = c.a[bVar.a().f().ordinal()];
                if (i2 == 1) {
                    p(bVar, (Map) obj, lVar);
                } else if (i2 == 2) {
                    o(bVar.a(), (List) bVar.b(), (List) obj, lVar);
                } else if (obj == null) {
                    lVar.b();
                } else {
                    lVar.f(obj);
                }
                lVar.d(bVar.a(), cVar);
            } else {
                kotlin.jvm.internal.k.m();
                throw null;
            }
        }
    }

    private final void o(o oVar, List<?> list, List<?> list2, l<Map<String, Object>> lVar) {
        if (list == null) {
            lVar.b();
            return;
        }
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                lVar.a(i2);
                if (next instanceof Map) {
                    if (list2 != null) {
                        lVar.c(oVar, (Map) list2.get(i2));
                        k.c cVar = this.b;
                        if (next != null) {
                            m(cVar, lVar, (Map) next);
                            lVar.i(oVar, (Map) list2.get(i2));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.apollographql.apollo.internal.response.RealResponseWriter.FieldDescriptor>");
                        }
                    } else {
                        kotlin.jvm.internal.k.m();
                        throw null;
                    }
                } else if (next instanceof List) {
                    List list3 = (List) next;
                    if (list2 != null) {
                        o(oVar, list3, (List) list2.get(i2), lVar);
                    } else {
                        kotlin.jvm.internal.k.m();
                        throw null;
                    }
                } else if (list2 != null) {
                    lVar.f(list2.get(i2));
                } else {
                    kotlin.jvm.internal.k.m();
                    throw null;
                }
                lVar.h(i2);
                i2 = i3;
            } else {
                kotlin.a0.l.o();
                throw null;
            }
        }
        if (list2 != null) {
            lVar.e(list2);
        } else {
            kotlin.jvm.internal.k.m();
            throw null;
        }
    }

    private final void p(C0624b bVar, Map<String, ? extends Object> map, l<Map<String, Object>> lVar) {
        lVar.c(bVar.a(), map);
        Object b2 = bVar.b();
        if (b2 == null) {
            lVar.b();
        } else {
            m(this.b, lVar, (Map) b2);
        }
        lVar.i(bVar.a(), map);
    }

    private final void q(o oVar, Object obj) {
        f9249d.b(oVar, obj);
        this.a.put(oVar.e(), new C0624b(oVar, obj));
    }

    public void a(o oVar, Integer num) {
        kotlin.jvm.internal.k.f(oVar, "field");
        q(oVar, num != null ? BigDecimal.valueOf((long) num.intValue()) : null);
    }

    public void b(o.d dVar, Object obj) {
        kotlin.jvm.internal.k.f(dVar, "field");
        q(dVar, obj != null ? this.c.a(dVar.g()).a(obj).a : null);
    }

    public void c(o oVar, n nVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        f9249d.b(oVar, nVar);
        if (nVar == null) {
            this.a.put(oVar.e(), new C0624b(oVar, (Object) null));
            return;
        }
        b bVar = new b(this.b, this.c);
        nVar.a(bVar);
        this.a.put(oVar.e(), new C0624b(oVar, bVar.a));
    }

    public <T> void d(o oVar, List<? extends T> list, kotlin.e0.c.p<? super List<? extends T>, ? super p.b, kotlin.x> pVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(pVar, "block");
        p.a.a(this, oVar, list, pVar);
    }

    public void e(o oVar, Boolean bool) {
        kotlin.jvm.internal.k.f(oVar, "field");
        q(oVar, bool);
    }

    public void f(o oVar, String str) {
        kotlin.jvm.internal.k.f(oVar, "field");
        q(oVar, str);
    }

    public void g(n nVar) {
        if (nVar != null) {
            nVar.a(this);
        }
    }

    public void h(o oVar, Double d2) {
        kotlin.jvm.internal.k.f(oVar, "field");
        q(oVar, d2 != null ? BigDecimal.valueOf(d2.doubleValue()) : null);
    }

    public <T> void i(o oVar, List<? extends T> list, p.c<T> cVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(cVar, "listWriter");
        f9249d.b(oVar, list);
        if (list == null) {
            this.a.put(oVar.e(), new C0624b(oVar, (Object) null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        cVar.a(list, new c(this.b, this.c, arrayList));
        this.a.put(oVar.e(), new C0624b(oVar, arrayList));
    }

    public final Map<String, C0624b> j() {
        return this.a;
    }

    public final void n(l<Map<String, Object>> lVar) {
        kotlin.jvm.internal.k.f(lVar, "delegate");
        m(this.b, lVar, this.a);
    }
}
