package e.e;

/* compiled from: SparseArrayCompat */
public class h<E> implements Cloneable {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f8497k = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f8498g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f8499h;

    /* renamed from: i  reason: collision with root package name */
    private Object[] f8500i;

    /* renamed from: j  reason: collision with root package name */
    private int f8501j;

    public h() {
        this(10);
    }

    private void f() {
        int i2 = this.f8501j;
        int[] iArr = this.f8499h;
        Object[] objArr = this.f8500i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f8497k) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f8498g = false;
        this.f8501j = i3;
    }

    public void c(int i2, E e2) {
        int i3 = this.f8501j;
        if (i3 == 0 || i2 > this.f8499h[i3 - 1]) {
            if (this.f8498g && this.f8501j >= this.f8499h.length) {
                f();
            }
            int i4 = this.f8501j;
            if (i4 >= this.f8499h.length) {
                int e3 = c.e(i4 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f8499h;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f8500i;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8499h = iArr;
                this.f8500i = objArr;
            }
            this.f8499h[i4] = i2;
            this.f8500i[i4] = e2;
            this.f8501j = i4 + 1;
            return;
        }
        s(i2, e2);
    }

    public void d() {
        int i2 = this.f8501j;
        Object[] objArr = this.f8500i;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f8501j = 0;
        this.f8498g = false;
    }

    /* renamed from: e */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f8499h = (int[]) this.f8499h.clone();
            hVar.f8500i = (Object[]) this.f8500i.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E g(int i2) {
        return h(i2, (Object) null);
    }

    public E h(int i2, E e2) {
        int a = c.a(this.f8499h, this.f8501j, i2);
        if (a >= 0) {
            E[] eArr = this.f8500i;
            if (eArr[a] != f8497k) {
                return eArr[a];
            }
        }
        return e2;
    }

    public int m(int i2) {
        if (this.f8498g) {
            f();
        }
        return c.a(this.f8499h, this.f8501j, i2);
    }

    public int p(E e2) {
        if (this.f8498g) {
            f();
        }
        for (int i2 = 0; i2 < this.f8501j; i2++) {
            if (this.f8500i[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public int r(int i2) {
        if (this.f8498g) {
            f();
        }
        return this.f8499h[i2];
    }

    public void s(int i2, E e2) {
        int a = c.a(this.f8499h, this.f8501j, i2);
        if (a >= 0) {
            this.f8500i[a] = e2;
            return;
        }
        int i3 = ~a;
        if (i3 < this.f8501j) {
            Object[] objArr = this.f8500i;
            if (objArr[i3] == f8497k) {
                this.f8499h[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f8498g && this.f8501j >= this.f8499h.length) {
            f();
            i3 = ~c.a(this.f8499h, this.f8501j, i2);
        }
        int i4 = this.f8501j;
        if (i4 >= this.f8499h.length) {
            int e3 = c.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f8499h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8500i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8499h = iArr;
            this.f8500i = objArr2;
        }
        int i5 = this.f8501j;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f8499h;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            Object[] objArr4 = this.f8500i;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f8501j - i3);
        }
        this.f8499h[i3] = i2;
        this.f8500i[i3] = e2;
        this.f8501j++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f8500i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f8499h
            int r1 = r3.f8501j
            int r4 = e.e.c.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f8500i
            r1 = r0[r4]
            java.lang.Object r2 = f8497k
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f8498g = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.h.t(int):void");
    }

    public String toString() {
        if (v() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8501j * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8501j; i2++) {
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
        Object[] objArr = this.f8500i;
        Object obj = objArr[i2];
        Object obj2 = f8497k;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f8498g = true;
        }
    }

    public int v() {
        if (this.f8498g) {
            f();
        }
        return this.f8501j;
    }

    public E w(int i2) {
        if (this.f8498g) {
            f();
        }
        return this.f8500i[i2];
    }

    public h(int i2) {
        this.f8498g = false;
        if (i2 == 0) {
            this.f8499h = c.a;
            this.f8500i = c.c;
            return;
        }
        int e2 = c.e(i2);
        this.f8499h = new int[e2];
        this.f8500i = new Object[e2];
    }
}
