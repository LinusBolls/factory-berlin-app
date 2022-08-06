package kotlinx.coroutines.internal;

import kotlin.TypeCastException;

/* compiled from: ArrayQueue.kt */
public class a<T> {
    private Object[] a = new Object[16];
    private int b;
    private int c;

    private final void b() {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = i.g(objArr, objArr3, 0, this.b, 0, 10, (Object) null);
        Object[] objArr4 = this.a;
        int length2 = objArr4.length;
        int i2 = this.b;
        Object[] unused2 = i.g(objArr4, objArr2, length2 - i2, 0, i2, 4, (Object) null);
        this.a = objArr3;
        this.b = 0;
        this.c = length;
    }

    public final void a(T t) {
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = t;
        int length = (objArr.length - 1) & (i2 + 1);
        this.c = length;
        if (length == this.b) {
            b();
        }
    }

    public final boolean c() {
        return this.b == this.c;
    }

    public final T d() {
        int i2 = this.b;
        if (i2 == this.c) {
            return null;
        }
        T[] tArr = this.a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.b = (i2 + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }
}
