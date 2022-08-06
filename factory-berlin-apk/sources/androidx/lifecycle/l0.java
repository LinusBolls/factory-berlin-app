package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.p;

/* compiled from: ServiceLifecycleDispatcher */
public class l0 {
    private final w a;
    private final Handler b = new Handler();
    private a c;

    /* compiled from: ServiceLifecycleDispatcher */
    static class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final w f1021g;

        /* renamed from: h  reason: collision with root package name */
        final p.a f1022h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1023i = false;

        a(w wVar, p.a aVar) {
            this.f1021g = wVar;
            this.f1022h = aVar;
        }

        public void run() {
            if (!this.f1023i) {
                this.f1021g.i(this.f1022h);
                this.f1023i = true;
            }
        }
    }

    public l0(v vVar) {
        this.a = new w(vVar);
    }

    private void f(p.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        this.b.postAtFrontOfQueue(aVar3);
    }

    public p a() {
        return this.a;
    }

    public void b() {
        f(p.a.ON_START);
    }

    public void c() {
        f(p.a.ON_CREATE);
    }

    public void d() {
        f(p.a.ON_STOP);
        f(p.a.ON_DESTROY);
    }

    public void e() {
        f(p.a.ON_START);
    }
}
