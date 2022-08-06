package e.k.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import e.e.g;
import java.util.ArrayList;

/* compiled from: AnimationHandler */
class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<a> f8751g = new ThreadLocal<>();
    private final g<b, Long> a = new g<>();
    final ArrayList<b> b = new ArrayList<>();
    private final C0571a c = new C0571a();

    /* renamed from: d  reason: collision with root package name */
    private c f8752d;

    /* renamed from: e  reason: collision with root package name */
    long f8753e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8754f = false;

    /* renamed from: e.k.a.a$a  reason: collision with other inner class name */
    /* compiled from: AnimationHandler */
    class C0571a {
        C0571a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            a.this.f8753e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f8753e);
            if (a.this.b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    /* compiled from: AnimationHandler */
    interface b {
        boolean a(long j2);
    }

    /* compiled from: AnimationHandler */
    static abstract class c {
        final C0571a a;

        c(C0571a aVar) {
            this.a = aVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    /* compiled from: AnimationHandler */
    private static class d extends c {
        private final Runnable b = new C0572a();
        private final Handler c = new Handler(Looper.myLooper());

        /* renamed from: d  reason: collision with root package name */
        long f8755d = -1;

        /* renamed from: e.k.a.a$d$a  reason: collision with other inner class name */
        /* compiled from: AnimationHandler */
        class C0572a implements Runnable {
            C0572a() {
            }

            public void run() {
                d.this.f8755d = SystemClock.uptimeMillis();
                d.this.a.a();
            }
        }

        d(C0571a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.c.postDelayed(this.b, Math.max(10 - (SystemClock.uptimeMillis() - this.f8755d), 0));
        }
    }

    /* compiled from: AnimationHandler */
    private static class e extends c {
        private final Choreographer b = Choreographer.getInstance();
        private final Choreographer.FrameCallback c = new C0573a();

        /* renamed from: e.k.a.a$e$a  reason: collision with other inner class name */
        /* compiled from: AnimationHandler */
        class C0573a implements Choreographer.FrameCallback {
            C0573a() {
            }

            public void doFrame(long j2) {
                e.this.a.a();
            }
        }

        e(C0571a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f8754f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f8754f = false;
        }
    }

    public static a d() {
        if (f8751g.get() == null) {
            f8751g.set(new a());
        }
        return f8751g.get();
    }

    private boolean f(b bVar, long j2) {
        Long l2 = this.a.get(bVar);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j2) {
            return false;
        }
        this.a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j2) {
        if (this.b.size() == 0) {
            e().a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j2 > 0) {
            this.a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            b bVar = this.b.get(i2);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j2);
            }
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public c e() {
        if (this.f8752d == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f8752d = new e(this.c);
            } else {
                this.f8752d = new d(this.c);
            }
        }
        return this.f8752d;
    }

    public void g(b bVar) {
        this.a.remove(bVar);
        int indexOf = this.b.indexOf(bVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, (Object) null);
            this.f8754f = true;
        }
    }
}
