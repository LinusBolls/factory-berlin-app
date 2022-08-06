package g.e.n.a.l;

import g.e.n.a.k;
import kotlin.c0.d;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.q;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.e3.e;

/* compiled from: MasterDetectorImpl.kt */
public final class c implements b {
    private final g.e.n.a.l.e.a a;
    private final g.e.n.a.l.f.a b;
    private final g.e.n.a.l.f.c c;

    /* renamed from: d  reason: collision with root package name */
    private final g.e.n.a.l.e.c f9953d;

    @f(c = "com.sensorberg.smartspaces.blescanner.detector.MasterDetectorImpl$state$1", f = "MasterDetectorImpl.kt", l = {}, m = "invokeSuspend")
    /* compiled from: MasterDetectorImpl.kt */
    static final class a extends k implements q<Boolean, Boolean, d<? super d>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private boolean f9954k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f9955l;

        /* renamed from: m  reason: collision with root package name */
        int f9956m;

        a(d dVar) {
            super(3, dVar);
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f9956m == 0) {
                l.b(obj);
                return new d(this.f9955l, false, this.f9954k, false, 10, (DefaultConstructorMarker) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object k(Object obj, Object obj2, Object obj3) {
            return ((a) s(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (d) obj3)).i(x.a);
        }

        public final d<x> s(boolean z, boolean z2, d<? super d> dVar) {
            kotlin.jvm.internal.k.e(dVar, "continuation");
            a aVar = new a(dVar);
            aVar.f9954k = z;
            aVar.f9955l = z2;
            return aVar;
        }
    }

    @f(c = "com.sensorberg.smartspaces.blescanner.detector.MasterDetectorImpl$state$2", f = "MasterDetectorImpl.kt", l = {}, m = "invokeSuspend")
    /* compiled from: MasterDetectorImpl.kt */
    static final class b extends k implements q<d, Boolean, d<? super d>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f9957k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f9958l;

        /* renamed from: m  reason: collision with root package name */
        int f9959m;

        b(d dVar) {
            super(3, dVar);
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f9959m == 0) {
                l.b(obj);
                return d.b(this.f9957k, false, this.f9958l, false, false, 13, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object k(Object obj, Object obj2, Object obj3) {
            return ((b) s((d) obj, ((Boolean) obj2).booleanValue(), (d) obj3)).i(x.a);
        }

        public final d<x> s(d dVar, boolean z, d<? super d> dVar2) {
            kotlin.jvm.internal.k.e(dVar, "previous");
            kotlin.jvm.internal.k.e(dVar2, "continuation");
            b bVar = new b(dVar2);
            bVar.f9957k = dVar;
            bVar.f9958l = z;
            return bVar;
        }
    }

    @f(c = "com.sensorberg.smartspaces.blescanner.detector.MasterDetectorImpl$state$3", f = "MasterDetectorImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: g.e.n.a.l.c$c  reason: collision with other inner class name */
    /* compiled from: MasterDetectorImpl.kt */
    static final class C0688c extends k implements q<d, g.e.n.a.k, d<? super d>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f9960k;

        /* renamed from: l  reason: collision with root package name */
        private g.e.n.a.k f9961l;

        /* renamed from: m  reason: collision with root package name */
        int f9962m;

        C0688c(d dVar) {
            super(3, dVar);
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f9962m == 0) {
                l.b(obj);
                d dVar = this.f9960k;
                g.e.n.a.k kVar = this.f9961l;
                return d.b(dVar, false, false, false, (kVar instanceof k.a) || (kVar instanceof k.c), 7, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object k(Object obj, Object obj2, Object obj3) {
            return ((C0688c) s((d) obj, (g.e.n.a.k) obj2, (d) obj3)).i(x.a);
        }

        public final d<x> s(d dVar, g.e.n.a.k kVar, d<? super d> dVar2) {
            kotlin.jvm.internal.k.e(dVar, "previous");
            kotlin.jvm.internal.k.e(kVar, "simpleBleScannerStatus");
            kotlin.jvm.internal.k.e(dVar2, "continuation");
            C0688c cVar = new C0688c(dVar2);
            cVar.f9960k = dVar;
            cVar.f9961l = kVar;
            return cVar;
        }
    }

    public c(g.e.n.a.l.e.a aVar, g.e.n.a.l.f.a aVar2, g.e.n.a.l.f.c cVar, g.e.n.a.l.e.c cVar2) {
        kotlin.jvm.internal.k.e(aVar, "bluetoothServiceDetector");
        kotlin.jvm.internal.k.e(aVar2, "locationPermissionDetector");
        kotlin.jvm.internal.k.e(cVar, "locationServiceDetector");
        kotlin.jvm.internal.k.e(cVar2, "scannerStateDetector");
        this.a = aVar;
        this.b = aVar2;
        this.c = cVar;
        this.f9953d = cVar2;
    }

    public kotlinx.coroutines.e3.c<d> a() {
        return e.d(e.j(e.j(e.j(this.a.a(), this.b.a(), new a((d) null)), this.c.a(), new b((d) null)), this.f9953d.a(), new C0688c((d) null)));
    }
}
