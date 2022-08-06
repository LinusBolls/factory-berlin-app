package g.a.a.h.s;

import java.io.Serializable;

/* compiled from: Optional */
public abstract class i<T> implements Serializable {
    i() {
    }

    public static <T> i<T> a() {
        return a.j();
    }

    public static <T> i<T> d(T t) {
        if (t == null) {
            return a();
        }
        return new j(t);
    }

    public static <T> i<T> h(T t) {
        q.a(t);
        return new j(t);
    }

    public abstract i<T> b(b<T> bVar);

    public abstract <V> i<V> c(e<? super T, i<V>> eVar);

    public abstract T e();

    public abstract boolean f();

    public abstract <V> i<V> g(e<? super T, V> eVar);

    public abstract T i();
}
