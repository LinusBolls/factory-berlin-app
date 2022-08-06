package e.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f8459k = new int[0];

    /* renamed from: l  reason: collision with root package name */
    private static final Object[] f8460l = new Object[0];

    /* renamed from: m  reason: collision with root package name */
    private static Object[] f8461m;

    /* renamed from: n  reason: collision with root package name */
    private static int f8462n;
    private static Object[] o;
    private static int p;

    /* renamed from: g  reason: collision with root package name */
    private int[] f8463g;

    /* renamed from: h  reason: collision with root package name */
    Object[] f8464h;

    /* renamed from: i  reason: collision with root package name */
    int f8465i;

    /* renamed from: j  reason: collision with root package name */
    private f<E, E> f8466j;

    /* compiled from: ArraySet */
    class a extends f<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i2, int i3) {
            return b.this.f8464h[i2];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f8465i;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e2, E e3) {
            b.this.add(e2);
        }

        /* access modifiers changed from: protected */
        public void h(int i2) {
            b.this.k(i2);
        }

        /* access modifiers changed from: protected */
        public E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                if (o != null) {
                    Object[] objArr = o;
                    this.f8464h = objArr;
                    o = (Object[]) objArr[0];
                    this.f8463g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    p--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                if (f8461m != null) {
                    Object[] objArr2 = f8461m;
                    this.f8464h = objArr2;
                    f8461m = (Object[]) objArr2[0];
                    this.f8463g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8462n--;
                    return;
                }
            }
        }
        this.f8463g = new int[i2];
        this.f8464h = new Object[i2];
    }

    private static void e(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (p < 10) {
                    objArr[0] = o;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    o = objArr;
                    p++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f8462n < 10) {
                    objArr[0] = f8461m;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f8461m = objArr;
                    f8462n++;
                }
            }
        }
    }

    private f<E, E> g() {
        if (this.f8466j == null) {
            this.f8466j = new a();
        }
        return this.f8466j;
    }

    private int i(Object obj, int i2) {
        int i3 = this.f8465i;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f8463g, i3, i2);
        if (a2 < 0 || obj.equals(this.f8464h[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f8463g[i4] == i2) {
            if (obj.equals(this.f8464h[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f8463g[i5] == i2) {
            if (obj.equals(this.f8464h[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    private int j() {
        int i2 = this.f8465i;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f8463g, i2, 0);
        if (a2 < 0 || this.f8464h[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f8463g[i3] == 0) {
            if (this.f8464h[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f8463g[i4] == 0) {
            if (this.f8464h[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = j();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = i(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f8465i;
        if (i5 >= this.f8463g.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f8463g;
            Object[] objArr = this.f8464h;
            a(i6);
            int[] iArr2 = this.f8463g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8464h, 0, objArr.length);
            }
            e(iArr, objArr, this.f8465i);
        }
        int i7 = this.f8465i;
        if (i4 < i7) {
            int[] iArr3 = this.f8463g;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f8464h;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f8465i - i4);
        }
        this.f8463g[i4] = i2;
        this.f8464h[i4] = e2;
        this.f8465i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        d(this.f8465i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i2 = this.f8465i;
        if (i2 != 0) {
            e(this.f8463g, this.f8464h, i2);
            this.f8463g = f8459k;
            this.f8464h = f8460l;
            this.f8465i = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public void d(int i2) {
        int[] iArr = this.f8463g;
        if (iArr.length < i2) {
            Object[] objArr = this.f8464h;
            a(i2);
            int i3 = this.f8465i;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f8463g, 0, i3);
                System.arraycopy(objArr, 0, this.f8464h, 0, this.f8465i);
            }
            e(iArr, objArr, this.f8465i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f8465i) {
                try {
                    if (!set.contains(l(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f8463g;
        int i2 = this.f8465i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? j() : i(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f8465i <= 0;
    }

    public Iterator<E> iterator() {
        return g().m().iterator();
    }

    public E k(int i2) {
        E[] eArr = this.f8464h;
        E e2 = eArr[i2];
        int i3 = this.f8465i;
        if (i3 <= 1) {
            e(this.f8463g, eArr, i3);
            this.f8463g = f8459k;
            this.f8464h = f8460l;
            this.f8465i = 0;
        } else {
            int[] iArr = this.f8463g;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = this.f8465i - 1;
                this.f8465i = i5;
                if (i2 < i5) {
                    int[] iArr2 = this.f8463g;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr = this.f8464h;
                    System.arraycopy(objArr, i6, objArr, i2, this.f8465i - i2);
                }
                this.f8464h[this.f8465i] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f8463g;
                Object[] objArr2 = this.f8464h;
                a(i4);
                this.f8465i--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f8463g, 0, i2);
                    System.arraycopy(objArr2, 0, this.f8464h, 0, i2);
                }
                int i7 = this.f8465i;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f8463g, i2, i7 - i2);
                    System.arraycopy(objArr2, i8, this.f8464h, i2, this.f8465i - i2);
                }
            }
        }
        return e2;
    }

    public E l(int i2) {
        return this.f8464h[i2];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        k(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f8465i - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f8464h[i2])) {
                k(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f8465i;
    }

    public Object[] toArray() {
        int i2 = this.f8465i;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f8464h, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8465i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8465i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object l2 = l(i2);
            if (l2 != this) {
                sb.append(l2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f8463g = f8459k;
            this.f8464h = f8460l;
        } else {
            a(i2);
        }
        this.f8465i = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f8465i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f8465i);
        }
        System.arraycopy(this.f8464h, 0, tArr, 0, this.f8465i);
        int length = tArr.length;
        int i2 = this.f8465i;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
