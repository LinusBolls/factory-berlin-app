package m.a.c.e;

import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import m.a.c.f.c;
import m.a.c.f.d;
import m.a.c.f.e;

/* compiled from: BeanDefinition.kt */
public final class b<T> {
    private ArrayList<kotlin.h0.b<?>> a;
    private m.a.c.f.a<T> b;
    public p<? super m.a.c.l.a, ? super m.a.c.i.a, ? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    private e f11152d;

    /* renamed from: e  reason: collision with root package name */
    private f f11153e;

    /* renamed from: f  reason: collision with root package name */
    public d f11154f;

    /* renamed from: g  reason: collision with root package name */
    private l<? super T, x> f11155g;

    /* renamed from: h  reason: collision with root package name */
    private l<? super T, x> f11156h;

    /* renamed from: i  reason: collision with root package name */
    private final m.a.c.j.a f11157i;

    /* renamed from: j  reason: collision with root package name */
    private final m.a.c.j.a f11158j;

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.h0.b<?> f11159k;

    /* compiled from: BeanDefinition.kt */
    static final class a extends kotlin.jvm.internal.l implements l<kotlin.h0.b<?>, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f11160h = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String o(kotlin.h0.b<?> bVar) {
            k.f(bVar, "it");
            return m.a.e.a.a(bVar);
        }
    }

    public b(m.a.c.j.a aVar, m.a.c.j.a aVar2, kotlin.h0.b<?> bVar) {
        k.f(bVar, "primaryType");
        this.f11157i = aVar;
        this.f11158j = aVar2;
        this.f11159k = bVar;
        this.a = new ArrayList<>();
        this.f11152d = new e(false, false, 3, (DefaultConstructorMarker) null);
        this.f11153e = new f((Map) null, 1, (DefaultConstructorMarker) null);
    }

    public final void a() {
        m.a.c.f.a<T> aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
        this.b = null;
    }

    public final void b() {
        m.a.c.f.a<T> aVar;
        d dVar = this.f11154f;
        if (dVar != null) {
            int i2 = a.a[dVar.ordinal()];
            if (i2 == 1) {
                aVar = new e<>(this);
            } else if (i2 == 2) {
                aVar = new m.a.c.f.b<>(this);
            } else if (i2 == 3) {
                aVar = new d<>(this);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.b = aVar;
            return;
        }
        k.q("kind");
        throw null;
    }

    public final p<m.a.c.l.a, m.a.c.i.a, T> c() {
        p<? super m.a.c.l.a, ? super m.a.c.i.a, ? extends T> pVar = this.c;
        if (pVar != null) {
            return pVar;
        }
        k.q("definition");
        throw null;
    }

    public final m.a.c.f.a<T> d() {
        return this.b;
    }

    public final l<T, x> e() {
        return this.f11156h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            b bVar = (b) obj;
            return !(k.a(this.f11157i, bVar.f11157i) ^ true) && !(k.a(this.f11159k, bVar.f11159k) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    public final l<T, x> f() {
        return this.f11155g;
    }

    public final e g() {
        return this.f11152d;
    }

    public final kotlin.h0.b<?> h() {
        return this.f11159k;
    }

    public int hashCode() {
        m.a.c.j.a aVar = this.f11157i;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f11159k.hashCode();
    }

    public final f i() {
        return this.f11153e;
    }

    public final m.a.c.j.a j() {
        return this.f11157i;
    }

    public final m.a.c.j.a k() {
        return this.f11158j;
    }

    public final ArrayList<kotlin.h0.b<?>> l() {
        return this.a;
    }

    public final <T> T m(c cVar) {
        T c2;
        k.f(cVar, "context");
        m.a.c.f.a<T> aVar = this.b;
        if (aVar != null && (c2 = aVar.c(cVar)) != null) {
            return c2;
        }
        throw new IllegalStateException(("Definition without any InstanceContext - " + this).toString());
    }

    public final void n(p<? super m.a.c.l.a, ? super m.a.c.i.a, ? extends T> pVar) {
        k.f(pVar, "<set-?>");
        this.c = pVar;
    }

    public final void o(d dVar) {
        k.f(dVar, "<set-?>");
        this.f11154f = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r2 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r1 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r15 = this;
            m.a.c.e.d r0 = r15.f11154f
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r0.toString()
            m.a.c.j.a r1 = r15.f11157i
            java.lang.String r2 = "', "
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "name:'"
            r1.append(r4)
            m.a.c.j.a r4 = r15.f11157i
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            m.a.c.j.a r4 = r15.f11158j
            if (r4 == 0) goto L_0x0047
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "scope:'"
            r4.append(r5)
            m.a.c.j.a r5 = r15.f11158j
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            if (r2 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = r3
        L_0x0048:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "primary_type:'"
            r4.append(r5)
            kotlin.h0.b<?> r5 = r15.f11159k
            java.lang.String r5 = m.a.e.a.a(r5)
            r4.append(r5)
            r5 = 39
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.util.ArrayList<kotlin.h0.b<?>> r5 = r15.a
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0090
            java.util.ArrayList<kotlin.h0.b<?>> r6 = r15.a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            m.a.c.e.b$a r12 = m.a.c.e.b.a.f11160h
            r13 = 30
            r14 = 0
            java.lang.String r7 = ","
            java.lang.String r3 = kotlin.a0.v.F(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ", secondary_type:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x0090:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[type:"
            r5.append(r6)
            r5.append(r0)
            r0 = 44
            r5.append(r0)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        L_0x00b8:
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.k.q(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.c.e.b.toString():java.lang.String");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(m.a.c.j.a aVar, m.a.c.j.a aVar2, kotlin.h0.b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : aVar, (i2 & 2) != 0 ? null : aVar2, bVar);
    }
}
