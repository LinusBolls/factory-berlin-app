package androidx.work.impl.k.e;

import androidx.work.impl.k.f.d;
import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController */
public abstract class c<T> implements androidx.work.impl.k.a<T> {
    private final List<String> a = new ArrayList();
    private T b;
    private d<T> c;

    /* renamed from: d  reason: collision with root package name */
    private a f1703d;

    /* compiled from: ConstraintController */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(d<T> dVar) {
        this.c = dVar;
    }

    private void h() {
        if (!this.a.isEmpty() && this.f1703d != null) {
            T t = this.b;
            if (t == null || c(t)) {
                this.f1703d.b(this.a);
            } else {
                this.f1703d.a(this.a);
            }
        }
    }

    public void a(T t) {
        this.b = t;
        h();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(j jVar);

    /* access modifiers changed from: package-private */
    public abstract boolean c(T t);

    public boolean d(String str) {
        T t = this.b;
        return t != null && c(t) && this.a.contains(str);
    }

    public void e(List<j> list) {
        this.a.clear();
        for (j next : list) {
            if (b(next)) {
                this.a.add(next.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h();
    }

    public void f() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.f1703d != aVar) {
            this.f1703d = aVar;
            h();
        }
    }
}
