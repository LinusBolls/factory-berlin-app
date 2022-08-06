package androidx.room;

import e.s.a.f;

/* compiled from: EntityInsertionAdapter */
public abstract class e<T> extends s {
    public e(l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public abstract void g(f fVar, T t);

    public final void h(Iterable<? extends T> iterable) {
        f a = a();
        try {
            for (Object g2 : iterable) {
                g(a, g2);
                a.executeInsert();
            }
        } finally {
            f(a);
        }
    }

    public final void i(T t) {
        f a = a();
        try {
            g(a, t);
            a.executeInsert();
        } finally {
            f(a);
        }
    }

    public final void j(T[] tArr) {
        f a = a();
        try {
            for (T g2 : tArr) {
                g(a, g2);
                a.executeInsert();
            }
        } finally {
            f(a);
        }
    }

    public final long k(T t) {
        f a = a();
        try {
            g(a, t);
            return a.executeInsert();
        } finally {
            f(a);
        }
    }
}
