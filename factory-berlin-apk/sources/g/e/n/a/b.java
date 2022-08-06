package g.e.n.a;

import g.e.n.c.d.f;
import g.e.p.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.q;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.e3.e;

/* compiled from: AdvancedBleScannerImpl.kt */
public final class b implements a {
    private final c<g.e.n.c.d.c> a = new a(this);
    /* access modifiers changed from: private */
    public final h b;
    private final g.e.n.a.l.b c;

    /* compiled from: AdvancedBleScannerImpl.kt */
    public static final class a extends c<g.e.n.c.d.c> {
        final /* synthetic */ b b;

        a(b bVar) {
            this.b = bVar;
        }

        public void d() {
            n.a.a.a("onLastObserverLeft", new Object[0]);
            this.b.f();
        }
    }

    @f(c = "com.sensorberg.smartspaces.blescanner.AdvancedBleScannerImpl$scanResults$$inlined$flatMapLatest$1", f = "AdvancedBleScannerImpl.kt", l = {227}, m = "invokeSuspend")
    /* renamed from: g.e.n.a.b$b  reason: collision with other inner class name */
    /* compiled from: Merge.kt */
    public static final class C0686b extends k implements q<d<? super g.e.n.c.d.c>, g.e.n.a.l.d, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f9934k;

        /* renamed from: l  reason: collision with root package name */
        private Object f9935l;

        /* renamed from: m  reason: collision with root package name */
        Object f9936m;

        /* renamed from: n  reason: collision with root package name */
        Object f9937n;
        Object o;
        Object p;
        int q;
        final /* synthetic */ b r;
        final /* synthetic */ g.e.n.c.d.d s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0686b(kotlin.c0.d dVar, b bVar, g.e.n.c.d.d dVar2) {
            super(3, dVar);
            this.r = bVar;
            this.s = dVar2;
        }

        public final Object i(Object obj) {
            kotlinx.coroutines.e3.c<g.e.n.c.d.c> cVar;
            Object c = d.c();
            int i2 = this.q;
            if (i2 == 0) {
                l.b(obj);
                d dVar = this.f9934k;
                Object obj2 = this.f9935l;
                g.e.n.c.d.f e2 = ((g.e.n.a.l.d) obj2).e();
                if (e2 instanceof f.b) {
                    this.r.e(this.s);
                    cVar = e.g();
                } else if (e2 instanceof f.c) {
                    cVar = this.r.b.b();
                } else if (e2 instanceof f.a) {
                    this.r.f();
                    cVar = e.g();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                this.f9936m = dVar;
                this.f9937n = obj2;
                this.o = dVar;
                this.p = cVar;
                this.q = 1;
                if (cVar.a(dVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlinx.coroutines.e3.c cVar2 = (kotlinx.coroutines.e3.c) this.p;
                d dVar2 = (d) this.o;
                d dVar3 = (d) this.f9936m;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object k(Object obj, Object obj2, Object obj3) {
            return ((C0686b) s((d) obj, obj2, (kotlin.c0.d) obj3)).i(x.a);
        }

        public final kotlin.c0.d<x> s(d<? super g.e.n.c.d.c> dVar, g.e.n.a.l.d dVar2, kotlin.c0.d<? super x> dVar3) {
            C0686b bVar = new C0686b(dVar3, this.r, this.s);
            bVar.f9934k = dVar;
            bVar.f9935l = dVar2;
            return bVar;
        }
    }

    public b(h hVar, g.e.n.a.l.b bVar) {
        kotlin.jvm.internal.k.e(hVar, "simpleBleScanner");
        kotlin.jvm.internal.k.e(bVar, "masterDetector");
        this.b = hVar;
        this.c = bVar;
    }

    /* access modifiers changed from: private */
    public final void e(g.e.n.c.d.d dVar) {
        n.a.a.a("startScan", new Object[0]);
        this.b.a(dVar);
    }

    /* access modifiers changed from: private */
    public final void f() {
        this.b.c();
    }

    public kotlinx.coroutines.e3.c<g.e.n.c.d.c> b(g.e.n.c.d.d dVar) {
        kotlin.jvm.internal.k.e(dVar, "bleScannerConfiguration");
        return this.a.b(e.q(this.c.a(), new C0686b((kotlin.c0.d) null, this, dVar)));
    }
}
