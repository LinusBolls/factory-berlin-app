package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    private final Runnable a;
    final ArrayDeque<b> b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements t, a {

        /* renamed from: g  reason: collision with root package name */
        private final p f69g;

        /* renamed from: h  reason: collision with root package name */
        private final b f70h;

        /* renamed from: i  reason: collision with root package name */
        private a f71i;

        LifecycleOnBackPressedCancellable(p pVar, b bVar) {
            this.f69g = pVar;
            this.f70h = bVar;
            pVar.a(this);
        }

        public void cancel() {
            this.f69g.c(this);
            this.f70h.e(this);
            a aVar = this.f71i;
            if (aVar != null) {
                aVar.cancel();
                this.f71i = null;
            }
        }

        public void d(v vVar, p.a aVar) {
            if (aVar == p.a.ON_START) {
                this.f71i = OnBackPressedDispatcher.this.b(this.f70h);
            } else if (aVar == p.a.ON_STOP) {
                a aVar2 = this.f71i;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == p.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    private class a implements a {

        /* renamed from: g  reason: collision with root package name */
        private final b f73g;

        a(b bVar) {
            this.f73g = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.f73g);
            this.f73g.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(v vVar, b bVar) {
        p a2 = vVar.a();
        if (a2.b() != p.b.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    public a b(b bVar) {
        this.b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
