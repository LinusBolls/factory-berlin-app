package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.n0;

/* compiled from: ThreadSafeHeap.kt */
public class c0<T extends d0 & Comparable<? super T>> {
    private volatile int _size = 0;
    private T[] a;

    private final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = new d0[4];
            this.a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, c() * 2);
            k.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (d0[]) copyOf;
            this.a = tArr3;
            return tArr3;
        }
    }

    private final void j(int i2) {
        this._size = i2;
    }

    private final void k(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 < c()) {
                T[] tArr = this.a;
                if (tArr != null) {
                    int i4 = i3 + 1;
                    if (i4 < c()) {
                        T t = tArr[i4];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i3];
                            if (t2 == null) {
                                k.m();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i3 = i4;
                            }
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                    T t3 = tArr[i2];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i3];
                        if (t4 == null) {
                            k.m();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m(i2, i3);
                            i2 = i3;
                        } else {
                            return;
                        }
                    } else {
                        k.m();
                        throw null;
                    }
                } else {
                    k.m();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    private final void l(int i2) {
        while (i2 > 0) {
            T[] tArr = this.a;
            if (tArr != null) {
                int i3 = (i2 - 1) / 2;
                T t = tArr[i3];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        k.m();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m(i2, i3);
                        i2 = i3;
                    } else {
                        return;
                    }
                } else {
                    k.m();
                    throw null;
                }
            } else {
                k.m();
                throw null;
            }
        }
    }

    private final void m(int i2, int i3) {
        T[] tArr = this.a;
        if (tArr != null) {
            T t = tArr[i3];
            if (t != null) {
                T t2 = tArr[i2];
                if (t2 != null) {
                    tArr[i2] = t;
                    tArr[i3] = t2;
                    t.f(i2);
                    t2.f(i3);
                    return;
                }
                k.m();
                throw null;
            }
            k.m();
            throw null;
        }
        k.m();
        throw null;
    }

    public final void a(T t) {
        if (n0.a()) {
            if (!(t.j() == null)) {
                throw new AssertionError();
            }
        }
        t.h(this);
        d0[] f2 = f();
        int c = c();
        j(c + 1);
        f2[c] = t;
        t.f(c);
        l(c);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.j() == null) {
                z = false;
            } else {
                int i2 = t.i();
                if (n0.a()) {
                    if (i2 >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                h(i2);
            }
        }
        return z;
    }

    public final T h(int i2) {
        boolean z = false;
        if (n0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.a;
        if (tArr != null) {
            j(c() - 1);
            if (i2 < c()) {
                m(i2, c());
                int i3 = (i2 - 1) / 2;
                if (i2 > 0) {
                    T t = tArr[i2];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i3];
                        if (t2 == null) {
                            k.m();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m(i2, i3);
                            l(i3);
                        }
                    } else {
                        k.m();
                        throw null;
                    }
                }
                k(i2);
            }
            T t3 = tArr[c()];
            if (t3 != null) {
                if (n0.a()) {
                    if (t3.j() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.h((c0<?>) null);
                t3.f(-1);
                tArr[c()] = null;
                return t3;
            }
            k.m();
            throw null;
        }
        k.m();
        throw null;
    }

    public final T i() {
        T h2;
        synchronized (this) {
            h2 = c() > 0 ? h(0) : null;
        }
        return h2;
    }
}
