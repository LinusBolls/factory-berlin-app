package androidx.room;

import e.s.a.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement */
public abstract class s {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final l b;
    private volatile f c;

    public s(l lVar) {
        this.b = lVar;
    }

    private f c() {
        return this.b.f(d());
    }

    private f e(boolean z) {
        if (!z) {
            return c();
        }
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }

    public f a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public void f(f fVar) {
        if (fVar == this.c) {
            this.a.set(false);
        }
    }
}
