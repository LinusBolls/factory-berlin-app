package kotlinx.coroutines.internal;

import kotlin.c0.g;

/* compiled from: ThreadContext.kt */
final class e0 {
    private Object[] a;
    private int b;
    private final g c;

    public e0(g gVar, int i2) {
        this.c = gVar;
        this.a = new Object[i2];
    }

    public final void a(Object obj) {
        Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = obj;
    }

    public final g b() {
        return this.c;
    }

    public final void c() {
        this.b = 0;
    }

    public final Object d() {
        Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        return objArr[i2];
    }
}
