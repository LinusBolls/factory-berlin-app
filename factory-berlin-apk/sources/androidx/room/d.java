package androidx.room;

import e.s.a.f;

/* compiled from: EntityDeletionOrUpdateAdapter */
public abstract class d<T> extends s {
    public d(l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public abstract void g(f fVar, T t);

    public final int h(T t) {
        f a = a();
        try {
            g(a, t);
            return a.executeUpdateDelete();
        } finally {
            f(a);
        }
    }

    public final int i(Iterable<? extends T> iterable) {
        f a = a();
        int i2 = 0;
        try {
            for (Object g2 : iterable) {
                g(a, g2);
                i2 += a.executeUpdateDelete();
            }
            return i2;
        } finally {
            f(a);
        }
    }

    public final int j(T[] tArr) {
        f a = a();
        try {
            int i2 = 0;
            for (T g2 : tArr) {
                g(a, g2);
                i2 += a.executeUpdateDelete();
            }
            return i2;
        } finally {
            f(a);
        }
    }
}
