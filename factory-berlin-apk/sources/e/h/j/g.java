package e.h.j;

/* compiled from: Pools */
public class g<T> extends f<T> {
    private final Object c = new Object();

    public g(int i2) {
        super(i2);
    }

    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    public T b() {
        T b;
        synchronized (this.c) {
            b = super.b();
        }
        return b;
    }
}
