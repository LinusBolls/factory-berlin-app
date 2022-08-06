package g.a.a.h;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: Response.kt */
public final class n<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final b f9046h = new b((DefaultConstructorMarker) null);
    private final k<?, ?, ?> a;
    private final T b;
    private final List<e> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f9047d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9048e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f9049f;

    /* renamed from: g  reason: collision with root package name */
    private final f f9050g;

    /* compiled from: Response.kt */
    public static final class a<T> {
        private T a;
        private List<e> b;
        private Set<String> c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f9051d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, ? extends Object> f9052e;

        /* renamed from: f  reason: collision with root package name */
        private f f9053f = f.a;

        /* renamed from: g  reason: collision with root package name */
        private final k<?, ?, ?> f9054g;

        public a(k<?, ?, ?> kVar) {
            k.f(kVar, "operation");
            this.f9054g = kVar;
        }

        public final n<T> a() {
            return new n<>(this);
        }

        public final a<T> b(T t) {
            this.a = t;
            return this;
        }

        public final a<T> c(Set<String> set) {
            this.c = set;
            return this;
        }

        public final a<T> d(List<e> list) {
            this.b = list;
            return this;
        }

        public final a<T> e(f fVar) {
            k.f(fVar, "executionContext");
            this.f9053f = fVar;
            return this;
        }

        public final a<T> f(Map<String, ? extends Object> map) {
            this.f9052e = map;
            return this;
        }

        public final a<T> g(boolean z) {
            this.f9051d = z;
            return this;
        }

        public final T h() {
            return this.a;
        }

        public final Set<String> i() {
            return this.c;
        }

        public final List<e> j() {
            return this.b;
        }

        public final f k() {
            return this.f9053f;
        }

        public final Map<String, Object> l() {
            return this.f9052e;
        }

        public final boolean m() {
            return this.f9051d;
        }

        public final k<?, ?, ?> n() {
            return this.f9054g;
        }
    }

    /* compiled from: Response.kt */
    public static final class b {
        private b() {
        }

        public final <T> a<T> a(k<?, ?, ?> kVar) {
            k.f(kVar, "operation");
            return new a<>(kVar);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public n(k<?, ?, ?> kVar, T t, List<e> list, Set<String> set, boolean z, Map<String, ? extends Object> map, f fVar) {
        k.f(kVar, "operation");
        k.f(set, "dependentKeys");
        k.f(map, "extensions");
        k.f(fVar, "executionContext");
        this.a = kVar;
        this.b = t;
        this.c = list;
        this.f9047d = set;
        this.f9048e = z;
        this.f9049f = map;
        this.f9050g = fVar;
    }

    public static final <T> a<T> a(k<?, ?, ?> kVar) {
        return f9046h.a(kVar);
    }

    public final T b() {
        return this.b;
    }

    public final boolean c() {
        return this.f9048e;
    }

    public final T d() {
        return this.b;
    }

    public final List<e> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return !(k.a(this.a, nVar.a) ^ true) && !(k.a(this.b, nVar.b) ^ true) && !(k.a(this.c, nVar.c) ^ true) && !(k.a(this.f9047d, nVar.f9047d) ^ true) && this.f9048e == nVar.f9048e && !(k.a(this.f9049f, nVar.f9049f) ^ true) && !(k.a(this.f9050g, nVar.f9050g) ^ true);
    }

    public final f f() {
        return this.f9050g;
    }

    public final boolean g() {
        List<e> list = this.c;
        return !(list == null || list.isEmpty());
    }

    public final a<T> h() {
        a<T> aVar = new a<>(this.a);
        aVar.b(this.b);
        aVar.d(this.c);
        aVar.c(this.f9047d);
        aVar.g(this.f9048e);
        aVar.f(this.f9049f);
        aVar.e(this.f9050g);
        return aVar;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        T t = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
        List<e> list = this.c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((((((hashCode2 + i2) * 31) + this.f9047d.hashCode()) * 31) + defpackage.b.a(this.f9048e)) * 31) + this.f9049f.hashCode();
    }

    public String toString() {
        return "Response(operation=" + this.a + ", data=" + this.b + ", errors=" + this.c + ", dependentKeys=" + this.f9047d + ", fromCache=" + this.f9048e + ", extensions=" + this.f9049f + ", executionContext=" + this.f9050g + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(k kVar, Object obj, List list, Set set, boolean z, Map map, f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, obj, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? i0.b() : set, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? e0.e() : map, (i2 & 64) != 0 ? f.a : fVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(g.a.a.h.n.a<T> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.k.f(r10, r0)
            g.a.a.h.k r2 = r10.n()
            java.lang.Object r3 = r10.h()
            java.util.List r4 = r10.j()
            java.util.Set r0 = r10.i()
            if (r0 == 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            java.util.Set r0 = kotlin.a0.i0.b()
        L_0x001c:
            r5 = r0
            boolean r6 = r10.m()
            java.util.Map r0 = r10.l()
            if (r0 == 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            java.util.Map r0 = kotlin.a0.e0.e()
        L_0x002c:
            r7 = r0
            g.a.a.h.f r8 = r10.k()
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.h.n.<init>(g.a.a.h.n$a):void");
    }
}
