package g.e.k;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.x;

/* compiled from: Transformations.kt */
public final class h {
    public static final h a = new h();

    /* compiled from: Transformations.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<T, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9870h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f9870h = cVar;
        }

        public final void a(T t) {
            if (!h.a.k(t, this.f9870h.n())) {
                this.f9870h.w(t);
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<I, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9871h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f9872i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, kotlin.e0.c.l lVar) {
            super(1);
            this.f9871h = cVar;
            this.f9872i = lVar;
        }

        public final void a(I i2) {
            this.f9871h.w(this.f9872i.o(i2));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9873h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f9874i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(c cVar, e eVar) {
            super(0);
            this.f9873h = cVar;
            this.f9874i = eVar;
        }

        public final void a() {
            this.f9873h.A(this.f9874i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    public static final class d implements kotlin.e0.c.l<I, x> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f9875g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9876h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f9877i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f9878j;

        d(c cVar, e eVar, a aVar, kotlin.e0.c.l lVar) {
            this.f9875g = cVar;
            this.f9876h = eVar;
            this.f9877i = aVar;
            this.f9878j = lVar;
        }

        public void a(I i2) {
            if (i2 != null) {
                this.f9875g.A(this.f9876h);
                a aVar = this.f9877i;
                if (aVar == null || !aVar.c()) {
                    this.f9875g.w(this.f9878j.o(i2));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Collection f9879h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f9880i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Collection collection, c cVar) {
            super(0);
            this.f9879h = collection;
            this.f9880i = cVar;
        }

        public final void a() {
            for (e A : this.f9879h) {
                this.f9880i.A(A);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Object, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9881h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f9882i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, kotlin.e0.c.l lVar) {
            super(1);
            this.f9881h = cVar;
            this.f9882i = lVar;
        }

        public final void a(Object obj) {
            c cVar = this.f9881h;
            cVar.w(this.f9882i.o(cVar.n()));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Collection f9883h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f9884i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Collection collection, kotlin.e0.c.l lVar) {
            super(0);
            this.f9883h = collection;
            this.f9884i = lVar;
        }

        public final void a() {
            for (e v : this.f9883h) {
                v.v(this.f9884i);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* renamed from: g.e.k.h$h  reason: collision with other inner class name */
    /* compiled from: Transformations.kt */
    static final class C0679h extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Object, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f9885h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0679h(kotlin.e0.c.a aVar) {
            super(1);
            this.f9885h = aVar;
        }

        public final void a(Object obj) {
            this.f9885h.d();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.l<T, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9886h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(1);
            this.f9886h = cVar;
        }

        public final void a(T t) {
            this.f9886h.w(t);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9887h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f9888i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, e eVar) {
            super(0);
            this.f9887h = cVar;
            this.f9888i = eVar;
        }

        public final void a() {
            this.f9887h.A(this.f9888i);
            if (this.f9887h.n() != null) {
                this.f9887h.w(null);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9889h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f9890i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar, l lVar) {
            super(0);
            this.f9889h = eVar;
            this.f9890i = lVar;
        }

        public final void a() {
            this.f9889h.v(this.f9890i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    public static final class l implements kotlin.e0.c.l<T, x> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f9891g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f9892h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f9893i;

        l(e eVar, a aVar, kotlin.e0.c.l lVar) {
            this.f9891g = eVar;
            this.f9892h = aVar;
            this.f9893i = lVar;
        }

        public void a(T t) {
            if (t != null) {
                this.f9891g.v(this);
                a aVar = this.f9892h;
                if (aVar == null || !aVar.c()) {
                    this.f9893i.o(t);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f9894h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f9895i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar, e eVar) {
            super(0);
            this.f9894h = cVar;
            this.f9895i = eVar;
        }

        public final void a() {
            this.f9894h.A(this.f9895i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    public static final class n implements kotlin.e0.c.l<I, x> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f9896g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9897h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f9898i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f9899j;

        /* compiled from: Transformations.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<O, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ n f9900h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar) {
                super(1);
                this.f9900h = nVar;
            }

            public final void a(O o) {
                this.f9900h.f9896g.w(o);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(obj);
                return x.a;
            }
        }

        n(c cVar, e eVar, a aVar, kotlin.e0.c.l lVar) {
            this.f9896g = cVar;
            this.f9897h = eVar;
            this.f9898i = aVar;
            this.f9899j = lVar;
        }

        public void a(I i2) {
            if (i2 != null) {
                this.f9896g.A(this.f9897h);
                a aVar = this.f9898i;
                if (aVar == null || !aVar.c()) {
                    this.f9896g.z((e) this.f9899j.o(i2), new a(this));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    private h() {
    }

    public static /* synthetic */ e d(h hVar, e eVar, a aVar, kotlin.e0.c.l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        return hVar.c(eVar, aVar, lVar);
    }

    public static /* synthetic */ e f(h hVar, Collection collection, a aVar, kotlin.e0.c.l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        return hVar.e(collection, aVar, lVar);
    }

    public static /* synthetic */ void j(h hVar, e eVar, a aVar, kotlin.e0.c.l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        hVar.i(eVar, aVar, lVar);
    }

    private final <T> boolean l(Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection.size() != collection2.size() || !collection.containsAll(collection2) || !collection2.containsAll(collection)) {
            return false;
        }
        Iterator<? extends T> it = collection2.iterator();
        for (Object k2 : collection) {
            if (!k(k2, it.next())) {
                return false;
            }
        }
        return true;
    }

    private final <T> boolean m(List<? extends T> list, List<? extends T> list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!k(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final <T> e<T> a(e<T> eVar) {
        kotlin.jvm.internal.k.f(eVar, "source");
        c cVar = new c();
        cVar.z(eVar, new a(cVar));
        return cVar;
    }

    public final <I, O> e<O> b(e<I> eVar, kotlin.e0.c.l<? super I, ? extends O> lVar) {
        kotlin.jvm.internal.k.f(eVar, "source");
        kotlin.jvm.internal.k.f(lVar, "mapper");
        c cVar = new c();
        cVar.z(eVar, new b(cVar, lVar));
        return cVar;
    }

    public final <I, O> e<O> c(e<I> eVar, a aVar, kotlin.e0.c.l<? super I, ? extends O> lVar) {
        kotlin.jvm.internal.k.f(eVar, "source");
        kotlin.jvm.internal.k.f(lVar, "mapper");
        c cVar = new c();
        if (aVar != null && aVar.c()) {
            return cVar;
        }
        cVar.z(eVar, new d(cVar, eVar, aVar, lVar));
        if (aVar != null) {
            aVar.d(new c(cVar, eVar));
        }
        return cVar;
    }

    public final <T> e<T> e(Collection<? extends e<? extends Object>> collection, a aVar, kotlin.e0.c.l<? super T, ? extends T> lVar) {
        kotlin.jvm.internal.k.f(collection, "sources");
        kotlin.jvm.internal.k.f(lVar, "mapper");
        c cVar = new c();
        if (aVar != null && aVar.c()) {
            return cVar;
        }
        f fVar = new f(cVar, lVar);
        for (e z : collection) {
            cVar.z(z, fVar);
        }
        if (aVar != null) {
            aVar.d(new e(collection, cVar));
        }
        return cVar;
    }

    public final void g(Collection<? extends e<? extends Object>> collection, a aVar, kotlin.e0.c.a<x> aVar2) {
        kotlin.jvm.internal.k.f(collection, "sources");
        kotlin.jvm.internal.k.f(aVar2, "onDataChanged");
        if (aVar == null || !aVar.c()) {
            C0679h hVar = new C0679h(aVar2);
            for (e r : collection) {
                r.r(hVar);
            }
            if (aVar != null) {
                aVar.d(new g(collection, hVar));
            }
        }
    }

    public final <T> e<T> h(e<T> eVar, a aVar) {
        kotlin.jvm.internal.k.f(eVar, "source");
        kotlin.jvm.internal.k.f(aVar, "cancellation");
        c cVar = new c();
        cVar.z(eVar, new i(cVar));
        aVar.d(new j(cVar, eVar));
        return cVar;
    }

    public final <T> void i(e<T> eVar, a aVar, kotlin.e0.c.l<? super T, x> lVar) {
        kotlin.jvm.internal.k.f(eVar, "source");
        kotlin.jvm.internal.k.f(lVar, "callback");
        if (aVar == null || !aVar.c()) {
            l lVar2 = new l(eVar, aVar, lVar);
            eVar.r(lVar2);
            if (aVar != null) {
                aVar.d(new k(eVar, lVar2));
            }
        }
    }

    public final <T> boolean k(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        if ((t instanceof Object[]) && (t2 instanceof Object[])) {
            return h.b((Object[]) t, (Object[]) t2);
        }
        if ((t instanceof List) && (t2 instanceof List)) {
            return m((List) t, (List) t2);
        }
        if ((t instanceof Collection) && (t2 instanceof Collection)) {
            return l((Collection) t, (Collection) t2);
        }
        if ((t instanceof byte[]) && (t2 instanceof byte[])) {
            return Arrays.equals((byte[]) t, (byte[]) t2);
        }
        if ((t instanceof short[]) && (t2 instanceof short[])) {
            return Arrays.equals((short[]) t, (short[]) t2);
        }
        if ((t instanceof int[]) && (t2 instanceof int[])) {
            return Arrays.equals((int[]) t, (int[]) t2);
        }
        if ((t instanceof long[]) && (t2 instanceof long[])) {
            return Arrays.equals((long[]) t, (long[]) t2);
        }
        if ((t instanceof float[]) && (t2 instanceof float[])) {
            return Arrays.equals((float[]) t, (float[]) t2);
        }
        if ((t instanceof double[]) && (t2 instanceof double[])) {
            return Arrays.equals((double[]) t, (double[]) t2);
        }
        if ((t instanceof char[]) && (t2 instanceof char[])) {
            return Arrays.equals((char[]) t, (char[]) t2);
        }
        if (!(t instanceof boolean[]) || !(t2 instanceof boolean[])) {
            return kotlin.jvm.internal.k.a(t, t2);
        }
        return Arrays.equals((boolean[]) t, (boolean[]) t2);
    }

    public final <I, O> e<O> n(e<I> eVar, a aVar, kotlin.e0.c.l<? super I, ? extends e<O>> lVar) {
        kotlin.jvm.internal.k.f(eVar, "source");
        kotlin.jvm.internal.k.f(lVar, "mapper");
        c cVar = new c();
        if (aVar != null && aVar.c()) {
            return cVar;
        }
        cVar.z(eVar, new n(cVar, eVar, aVar, lVar));
        if (aVar != null) {
            aVar.d(new m(cVar, eVar));
        }
        return cVar;
    }
}
