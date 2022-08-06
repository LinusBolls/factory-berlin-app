package g.e.m.d;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import g.e.m.a;
import java.lang.ref.WeakReference;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: RxObserver.kt */
public final class e<T, P> implements f0<g.e.m.a<T, P>> {

    /* renamed from: g  reason: collision with root package name */
    private l<? super T, x> f9915g;

    /* renamed from: h  reason: collision with root package name */
    private l<? super Exception, x> f9916h;

    /* renamed from: i  reason: collision with root package name */
    private l<? super P, x> f9917i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<g.e.m.a<T, P>> f9918j;

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f9919k = g.a(new a(this));
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final LiveData<Boolean> f9920l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public LiveData<g.e.m.a<T, P>> f9921m;

    /* compiled from: RxObserver.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<C0684a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9922h;

        /* renamed from: g.e.m.d.e$a$a  reason: collision with other inner class name */
        /* compiled from: RxObserver.kt */
        public static final class C0684a implements f0<Boolean> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f9923g;

            C0684a(a aVar) {
                this.f9923g = aVar;
            }

            /* renamed from: a */
            public void k(Boolean bool) {
                if (k.a(bool, Boolean.TRUE)) {
                    LiveData a = this.f9923g.f9922h.f9920l;
                    if (a != null) {
                        a.t(this);
                    }
                    LiveData b = this.f9923g.f9922h.f9921m;
                    if (b != null) {
                        b.t(this.f9923g.f9922h);
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.f9922h = eVar;
        }

        /* renamed from: a */
        public final C0684a d() {
            return new C0684a(this);
        }
    }

    public e(LiveData<Boolean> liveData, LiveData<g.e.m.a<T, P>> liveData2) {
        this.f9920l = liveData;
        this.f9921m = liveData2;
        LiveData<Boolean> liveData3 = this.f9920l;
        if (liveData3 != null) {
            liveData3.p(c());
        }
    }

    private final a.C0684a c() {
        return (a.C0684a) this.f9919k.getValue();
    }

    /* renamed from: d */
    public void k(g.e.m.a<T, P> aVar) {
        l<? super P, x> lVar;
        if (aVar == null) {
            this.f9918j = null;
            return;
        }
        this.f9918j = new WeakReference<>(aVar);
        if (aVar.f() == a.b.SUCCESS || aVar.f() == a.b.FAIL) {
            LiveData<Boolean> liveData = this.f9920l;
            if (liveData != null) {
                liveData.t(c());
            }
            LiveData<g.e.m.a<T, P>> liveData2 = this.f9921m;
            if (liveData2 != null) {
                liveData2.t(this);
            }
            this.f9921m = null;
        }
        int i2 = d.a[aVar.f().ordinal()];
        if (i2 == 1) {
            l<? super T, x> lVar2 = this.f9915g;
            if (lVar2 != null) {
                x o = lVar2.o(aVar.c());
            }
        } else if (i2 == 2) {
            l<? super Exception, x> lVar3 = this.f9916h;
            if (lVar3 != null) {
                x o2 = lVar3.o(aVar.d());
            }
        } else if (i2 == 3 && (lVar = this.f9917i) != null) {
            x o3 = lVar.o(aVar.e());
        }
    }

    public final e<T, P> e(l<? super P, x> lVar) {
        g.e.m.a aVar;
        k.e(lVar, "executingCallback");
        this.f9917i = lVar;
        WeakReference<g.e.m.a<T, P>> weakReference = this.f9918j;
        if (!(weakReference == null || (aVar = (g.e.m.a) weakReference.get()) == null || aVar.f() != a.b.EXECUTING)) {
            lVar.o(aVar.e());
        }
        return this;
    }

    public final e<T, P> f(l<? super Exception, x> lVar) {
        g.e.m.a aVar;
        k.e(lVar, "failCallback");
        this.f9916h = lVar;
        WeakReference<g.e.m.a<T, P>> weakReference = this.f9918j;
        if (!(weakReference == null || (aVar = (g.e.m.a) weakReference.get()) == null || aVar.f() != a.b.FAIL)) {
            lVar.o(aVar.d());
        }
        return this;
    }

    public final e<T, P> g(l<? super T, x> lVar) {
        g.e.m.a aVar;
        k.e(lVar, "successCallback");
        this.f9915g = lVar;
        WeakReference<g.e.m.a<T, P>> weakReference = this.f9918j;
        if (!(weakReference == null || (aVar = (g.e.m.a) weakReference.get()) == null || aVar.f() != a.b.SUCCESS)) {
            lVar.o(aVar.c());
        }
        return this;
    }
}
