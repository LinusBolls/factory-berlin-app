package e.e;

/* compiled from: LongSparseArray */
public class d<E> implements Cloneable {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f8468k = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f8469g;

    /* renamed from: h  reason: collision with root package name */
    private long[] f8470h;

    /* renamed from: i  reason: collision with root package name */
    private Object[] f8471i;

    /* renamed from: j  reason: collision with root package name */
    private int f8472j;

    public d() {
        this(10);
    }

    private void g() {
        int i2 = this.f8472j;
        long[] jArr = this.f8470h;
        Object[] objArr = this.f8471i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f8468k) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f8469g = false;
        this.f8472j = i3;
    }

    public void c(long j2, E e2) {
        int i2 = this.f8472j;
        if (i2 == 0 || j2 > this.f8470h[i2 - 1]) {
            if (this.f8469g && this.f8472j >= this.f8470h.length) {
                g();
            }
            int i3 = this.f8472j;
            if (i3 >= this.f8470h.length) {
                int f2 = c.f(i3 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f8470h;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f8471i;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8470h = jArr;
                this.f8471i = objArr;
            }
            this.f8470h[i3] = j2;
            this.f8471i[i3] = e2;
            this.f8472j = i3 + 1;
            return;
        }
        s(j2, e2);
    }

    public void d() {
        int i2 = this.f8472j;
        Object[] objArr = this.f8471i;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f8472j = 0;
        this.f8469g = false;
    }

    /* renamed from: e */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f8470h = (long[]) this.f8470h.clone();
            dVar.f8471i = (Object[]) this.f8471i.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Deprecated
    public void f(long j2) {
        t(j2);
    }

    public E h(long j2) {
        return m(j2, (Object) null);
    }

    public E m(long j2, E e2) {
        int b = c.b(this.f8470h, this.f8472j, j2);
        if (b >= 0) {
            E[] eArr = this.f8471i;
            if (eArr[b] != f8468k) {
                return eArr[b];
            }
        }
        return e2;
    }

    public int p(long j2) {
        if (this.f8469g) {
            g();
        }
        return c.b(this.f8470h, this.f8472j, j2);
    }

    public long r(int i2) {
        if (this.f8469g) {
            g();
        }
        return this.f8470h[i2];
    }

    public void s(long j2, E e2) {
        int b = c.b(this.f8470h, this.f8472j, j2);
        if (b >= 0) {
            this.f8471i[b] = e2;
            return;
        }
        int i2 = ~b;
        if (i2 < this.f8472j) {
            Object[] objArr = this.f8471i;
            if (objArr[i2] == f8468k) {
                this.f8470h[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f8469g && this.f8472j >= this.f8470h.length) {
            g();
            i2 = ~c.b(this.f8470h, this.f8472j, j2);
        }
        int i3 = this.f8472j;
        if (i3 >= this.f8470h.length) {
            int f2 = c.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f8470h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8471i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8470h = jArr;
            this.f8471i = objArr2;
        }
        int i4 = this.f8472j;
        if (i4 - i2 != 0) {
            long[] jArr3 = this.f8470h;
            int i5 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i5, i4 - i2);
            Object[] objArr4 = this.f8471i;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f8472j - i2);
        }
        this.f8470h[i2] = j2;
        this.f8471i[i2] = e2;
        this.f8472j++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f8471i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f8470h
            int r1 = r2.f8472j
            int r3 = e.e.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f8471i
            r0 = r4[r3]
            java.lang.Object r1 = f8468k
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f8469g = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.t(long):void");
    }

    public String toString() {
        if (v() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8472j * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8472j; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(r(i2));
            sb.append('=');
            Object w = w(i2);
            if (w != this) {
                sb.append(w);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(int i2) {
        Object[] objArr = this.f8471i;
        Object obj = objArr[i2];
        Object obj2 = f8468k;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f8469g = true;
        }
    }

    public int v() {
        if (this.f8469g) {
            g();
        }
        return this.f8472j;
    }

    public E w(int i2) {
        if (this.f8469g) {
            g();
        }
        return this.f8471i[i2];
    }

    public d(int i2) {
        this.f8469g = false;
        if (i2 == 0) {
            this.f8470h = c.b;
            this.f8471i = c.c;
            return;
        }
        int f2 = c.f(i2);
        this.f8470h = new long[f2];
        this.f8471i = new Object[f2];
    }
}
