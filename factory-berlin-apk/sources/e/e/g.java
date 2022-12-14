package e.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class g<K, V> {

    /* renamed from: j  reason: collision with root package name */
    static Object[] f8490j;

    /* renamed from: k  reason: collision with root package name */
    static int f8491k;

    /* renamed from: l  reason: collision with root package name */
    static Object[] f8492l;

    /* renamed from: m  reason: collision with root package name */
    static int f8493m;

    /* renamed from: g  reason: collision with root package name */
    int[] f8494g;

    /* renamed from: h  reason: collision with root package name */
    Object[] f8495h;

    /* renamed from: i  reason: collision with root package name */
    int f8496i;

    public g() {
        this.f8494g = c.a;
        this.f8495h = c.c;
        this.f8496i = 0;
    }

    private void a(int i2) {
        Class<g> cls = g.class;
        if (i2 == 8) {
            synchronized (cls) {
                if (f8492l != null) {
                    Object[] objArr = f8492l;
                    this.f8495h = objArr;
                    f8492l = (Object[]) objArr[0];
                    this.f8494g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8493m--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                if (f8490j != null) {
                    Object[] objArr2 = f8490j;
                    this.f8495h = objArr2;
                    f8490j = (Object[]) objArr2[0];
                    this.f8494g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8491k--;
                    return;
                }
            }
        }
        this.f8494g = new int[i2];
        this.f8495h = new Object[(i2 << 1)];
    }

    private static int b(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        Class<g> cls = g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f8493m < 10) {
                    objArr[0] = f8492l;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8492l = objArr;
                    f8493m++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f8491k < 10) {
                    objArr[0] = f8490j;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f8490j = objArr;
                    f8491k++;
                }
            }
        }
    }

    public void c(int i2) {
        int i3 = this.f8496i;
        int[] iArr = this.f8494g;
        if (iArr.length < i2) {
            Object[] objArr = this.f8495h;
            a(i2);
            if (this.f8496i > 0) {
                System.arraycopy(iArr, 0, this.f8494g, 0, i3);
                System.arraycopy(objArr, 0, this.f8495h, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.f8496i != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f8496i;
        if (i2 > 0) {
            int[] iArr = this.f8494g;
            Object[] objArr = this.f8495h;
            this.f8494g = c.a;
            this.f8495h = c.c;
            this.f8496i = 0;
            d(iArr, objArr, i2);
        }
        if (this.f8496i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i2) {
        int i3 = this.f8496i;
        if (i3 == 0) {
            return -1;
        }
        int b = b(this.f8494g, i3, i2);
        if (b < 0 || obj.equals(this.f8495h[b << 1])) {
            return b;
        }
        int i4 = b + 1;
        while (i4 < i3 && this.f8494g[i4] == i2) {
            if (obj.equals(this.f8495h[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = b - 1;
        while (i5 >= 0 && this.f8494g[i5] == i2) {
            if (obj.equals(this.f8495h[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f8496i) {
                try {
                    Object i3 = i(i2);
                    Object m2 = m(i2);
                    Object obj2 = gVar.get(i3);
                    if (m2 == null) {
                        if (obj2 != null || !gVar.containsKey(i3)) {
                            return false;
                        }
                    } else if (!m2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i4 = 0;
            while (i4 < this.f8496i) {
                try {
                    Object i5 = i(i4);
                    Object m3 = m(i4);
                    Object obj3 = map.get(i5);
                    if (m3 == null) {
                        if (obj3 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!m3.equals(obj3)) {
                        return false;
                    }
                    i4++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i2 = this.f8496i;
        if (i2 == 0) {
            return -1;
        }
        int b = b(this.f8494g, i2, 0);
        if (b < 0 || this.f8495h[b << 1] == null) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f8494g[i3] == 0) {
            if (this.f8495h[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f8494g[i4] == 0) {
            if (this.f8495h[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? this.f8495h[(f2 << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i2 = this.f8496i * 2;
        Object[] objArr = this.f8495h;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f8494g;
        Object[] objArr = this.f8495h;
        int i2 = this.f8496i;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public K i(int i2) {
        return this.f8495h[i2 << 1];
    }

    public boolean isEmpty() {
        return this.f8496i <= 0;
    }

    public void j(g<? extends K, ? extends V> gVar) {
        int i2 = gVar.f8496i;
        c(this.f8496i + i2);
        if (this.f8496i != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(gVar.i(i3), gVar.m(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(gVar.f8494g, 0, this.f8494g, 0, i2);
            System.arraycopy(gVar.f8495h, 0, this.f8495h, 0, i2 << 1);
            this.f8496i = i2;
        }
    }

    public V k(int i2) {
        V[] vArr = this.f8495h;
        int i3 = i2 << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f8496i;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.f8494g, vArr, i4);
            this.f8494g = c.a;
            this.f8495h = c.c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f8494g;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int[] iArr2 = this.f8494g;
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr2, i8, iArr2, i2, i9);
                    Object[] objArr = this.f8495h;
                    System.arraycopy(objArr, i8 << 1, objArr, i3, i9 << 1);
                }
                Object[] objArr2 = this.f8495h;
                int i10 = i6 << 1;
                objArr2[i10] = null;
                objArr2[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f8494g;
                Object[] objArr3 = this.f8495h;
                a(i7);
                if (i4 == this.f8496i) {
                    if (i2 > 0) {
                        System.arraycopy(iArr3, 0, this.f8494g, 0, i2);
                        System.arraycopy(objArr3, 0, this.f8495h, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr3, i11, this.f8494g, i2, i12);
                        System.arraycopy(objArr3, i11 << 1, this.f8495h, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f8496i) {
            this.f8496i = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.f8495h;
        V v2 = vArr[i3];
        vArr[i3] = v;
        return v2;
    }

    public V m(int i2) {
        return this.f8495h[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.f8496i;
        if (k2 == null) {
            i3 = g();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = e(k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            V[] vArr = this.f8495h;
            V v2 = vArr[i5];
            vArr[i5] = v;
            return v2;
        }
        int i6 = ~i3;
        if (i4 >= this.f8494g.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            int[] iArr = this.f8494g;
            Object[] objArr = this.f8495h;
            a(i7);
            if (i4 == this.f8496i) {
                int[] iArr2 = this.f8494g;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f8495h, 0, objArr.length);
                }
                d(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f8494g;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr2 = this.f8495h;
            System.arraycopy(objArr2, i6 << 1, objArr2, i8 << 1, (this.f8496i - i6) << 1);
        }
        int i9 = this.f8496i;
        if (i4 == i9) {
            int[] iArr4 = this.f8494g;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr3 = this.f8495h;
                int i10 = i6 << 1;
                objArr3[i10] = k2;
                objArr3[i10 + 1] = v;
                this.f8496i = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public V replace(K k2, V v) {
        int f2 = f(k2);
        if (f2 >= 0) {
            return l(f2, v);
        }
        return null;
    }

    public int size() {
        return this.f8496i;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8496i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8496i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m2 = m(i2);
            if (m2 != this) {
                sb.append(m2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        Object m2 = m(f2);
        if (obj2 != m2 && (obj2 == null || !obj2.equals(m2))) {
            return false;
        }
        k(f2);
        return true;
    }

    public boolean replace(K k2, V v, V v2) {
        int f2 = f(k2);
        if (f2 < 0) {
            return false;
        }
        V m2 = m(f2);
        if (m2 != v && (v == null || !v.equals(m2))) {
            return false;
        }
        l(f2, v2);
        return true;
    }

    public g(int i2) {
        if (i2 == 0) {
            this.f8494g = c.a;
            this.f8495h = c.c;
        } else {
            a(i2);
        }
        this.f8496i = 0;
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }
}
