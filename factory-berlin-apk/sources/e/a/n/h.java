package e.a.n;

import android.view.View;
import android.view.animation.Interpolator;
import e.h.k.a0;
import e.h.k.y;
import e.h.k.z;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class h {
    final ArrayList<y> a = new ArrayList<>();
    private long b = -1;
    private Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    z f8409d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8410e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f8411f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    class a extends a0 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        public void b(View view) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == h.this.a.size()) {
                z zVar = h.this.f8409d;
                if (zVar != null) {
                    zVar.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.a) {
                this.a = true;
                z zVar = h.this.f8409d;
                if (zVar != null) {
                    zVar.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.b = 0;
            this.a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f8410e) {
            Iterator<y> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f8410e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f8410e = false;
    }

    public h c(y yVar) {
        if (!this.f8410e) {
            this.a.add(yVar);
        }
        return this;
    }

    public h d(y yVar, y yVar2) {
        this.a.add(yVar);
        yVar2.h(yVar.c());
        this.a.add(yVar2);
        return this;
    }

    public h e(long j2) {
        if (!this.f8410e) {
            this.b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f8410e) {
            this.c = interpolator;
        }
        return this;
    }

    public h g(z zVar) {
        if (!this.f8410e) {
            this.f8409d = zVar;
        }
        return this;
    }

    public void h() {
        if (!this.f8410e) {
            Iterator<y> it = this.a.iterator();
            while (it.hasNext()) {
                y next = it.next();
                long j2 = this.b;
                if (j2 >= 0) {
                    next.d(j2);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    next.e(interpolator);
                }
                if (this.f8409d != null) {
                    next.f(this.f8411f);
                }
                next.j();
            }
            this.f8410e = true;
        }
    }
}
