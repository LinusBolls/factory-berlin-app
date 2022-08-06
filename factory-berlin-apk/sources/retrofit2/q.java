package retrofit2;

import k.d0;
import k.e0;

/* compiled from: Response */
public final class q<T> {
    private final d0 a;
    private final T b;
    private final e0 c;

    private q(d0 d0Var, T t, e0 e0Var) {
        this.a = d0Var;
        this.b = t;
        this.c = e0Var;
    }

    public static <T> q<T> c(e0 e0Var, d0 d0Var) {
        v.b(e0Var, "body == null");
        v.b(d0Var, "rawResponse == null");
        if (!d0Var.z()) {
            return new q<>(d0Var, (Object) null, e0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> q<T> g(T t, d0 d0Var) {
        v.b(d0Var, "rawResponse == null");
        if (d0Var.z()) {
            return new q<>(d0Var, t, (e0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.j();
    }

    public e0 d() {
        return this.c;
    }

    public boolean e() {
        return this.a.z();
    }

    public String f() {
        return this.a.D();
    }

    public String toString() {
        return this.a.toString();
    }
}
