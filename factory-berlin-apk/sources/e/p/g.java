package e.p;

import java.util.Collections;
import java.util.List;

/* compiled from: PageResult */
class g<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final g f8816e = new g(Collections.emptyList(), 0);

    /* renamed from: f  reason: collision with root package name */
    private static final g f8817f = new g(Collections.emptyList(), 0);
    public final List<T> a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8818d;

    /* compiled from: PageResult */
    static abstract class a<T> {
        a() {
        }

        public abstract void a(int i2, g<T> gVar);
    }

    g(List<T> list, int i2, int i3, int i4) {
        this.a = list;
        this.b = i2;
        this.c = i3;
        this.f8818d = i4;
    }

    static <T> g<T> a() {
        return f8816e;
    }

    static <T> g<T> b() {
        return f8817f;
    }

    public boolean c() {
        return this == f8817f;
    }

    public String toString() {
        return "Result " + this.b + ", " + this.a + ", " + this.c + ", offset " + this.f8818d;
    }

    g(List<T> list, int i2) {
        this.a = list;
        this.b = 0;
        this.c = 0;
        this.f8818d = i2;
    }
}
