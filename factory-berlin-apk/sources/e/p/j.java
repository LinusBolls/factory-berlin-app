package e.p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PagedStorage */
final class j<T> extends AbstractList<T> {
    private static final List p = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private int f8843g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<List<T>> f8844h;

    /* renamed from: i  reason: collision with root package name */
    private int f8845i;

    /* renamed from: j  reason: collision with root package name */
    private int f8846j;

    /* renamed from: k  reason: collision with root package name */
    private int f8847k;

    /* renamed from: l  reason: collision with root package name */
    private int f8848l;

    /* renamed from: m  reason: collision with root package name */
    private int f8849m;

    /* renamed from: n  reason: collision with root package name */
    private int f8850n;
    private int o;

    /* compiled from: PagedStorage */
    interface a {
        void a(int i2, int i3);

        void d();

        void e();

        void g(int i2, int i3, int i4);

        void i(int i2, int i3);

        void j(int i2);

        void k(int i2, int i3, int i4);

        void l(int i2);

        void m(int i2, int i3);
    }

    j() {
        this.f8843g = 0;
        this.f8844h = new ArrayList<>();
        this.f8845i = 0;
        this.f8846j = 0;
        this.f8847k = 0;
        this.f8848l = 0;
        this.f8849m = 1;
        this.f8850n = 0;
        this.o = 0;
    }

    private boolean J(int i2, int i3, int i4) {
        List list = this.f8844h.get(i4);
        return list == null || (this.f8847k > i2 && this.f8844h.size() > 2 && list != p && this.f8847k - list.size() >= i3);
    }

    private void z(int i2, List<T> list, int i3, int i4) {
        this.f8843g = i2;
        this.f8844h.clear();
        this.f8844h.add(list);
        this.f8845i = i3;
        this.f8846j = i4;
        int size = list.size();
        this.f8847k = size;
        this.f8848l = size;
        this.f8849m = list.size();
        this.f8850n = 0;
        this.o = 0;
    }

    /* access modifiers changed from: package-private */
    public void D(int i2, List<T> list, int i3, int i4, a aVar) {
        z(i2, list, i3, i4);
        aVar.j(size());
    }

    /* access modifiers changed from: package-private */
    public void E(int i2, List<T> list, int i3, int i4, int i5, a aVar) {
        int size = (list.size() + (i5 - 1)) / i5;
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 * i5;
            int i8 = i6 + 1;
            List<T> subList = list.subList(i7, Math.min(list.size(), i8 * i5));
            if (i6 == 0) {
                z(i2, subList, (list.size() + i3) - subList.size(), i4);
            } else {
                F(i7 + i2, subList, (a) null);
            }
            i6 = i8;
        }
        aVar.j(size());
    }

    public void F(int i2, List<T> list, a aVar) {
        int size = list.size();
        if (size != this.f8849m) {
            int size2 = size();
            int i3 = this.f8849m;
            boolean z = false;
            boolean z2 = i2 == size2 - (size2 % i3) && size < i3;
            if (this.f8845i == 0 && this.f8844h.size() == 1 && size > this.f8849m) {
                z = true;
            }
            if (!z && !z2) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (z) {
                this.f8849m = size;
            }
        }
        int i4 = i2 / this.f8849m;
        a(i4, i4);
        int i5 = i4 - (this.f8843g / this.f8849m);
        List list2 = this.f8844h.get(i5);
        if (list2 == null || list2 == p) {
            this.f8844h.set(i5, list);
            this.f8847k += size;
            if (aVar != null) {
                aVar.i(i2, size);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid position " + i2 + ": data already loaded");
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        return this.f8849m > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean K(int i2, int i3) {
        return J(i2, i3, this.f8844h.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public boolean L(int i2, int i3) {
        return J(i2, i3, 0);
    }

    /* access modifiers changed from: package-private */
    public boolean M(int i2, boolean z) {
        if (this.f8849m < 1 || this.f8844h.size() < 2) {
            throw new IllegalStateException("Trimming attempt before sufficient load");
        }
        int i3 = this.f8843g;
        if (i2 < i3) {
            return z;
        }
        if (i2 >= this.f8848l + i3) {
            return !z;
        }
        int i4 = (i2 - i3) / this.f8849m;
        if (z) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (this.f8844h.get(i5) != null) {
                    return false;
                }
            }
        } else {
            for (int size = this.f8844h.size() - 1; size > i4; size--) {
                if (this.f8844h.get(size) != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void N(List<T> list, a aVar) {
        int size = list.size();
        if (size == 0) {
            aVar.e();
            return;
        }
        int i2 = this.f8849m;
        if (i2 > 0 && size != i2) {
            if (this.f8844h.size() != 1 || size <= this.f8849m) {
                this.f8849m = -1;
            } else {
                this.f8849m = size;
            }
        }
        this.f8844h.add(0, list);
        this.f8847k += size;
        this.f8848l += size;
        int min = Math.min(this.f8843g, size);
        int i3 = size - min;
        if (min != 0) {
            this.f8843g -= min;
        }
        this.f8846j -= i3;
        this.f8850n += size;
        aVar.g(this.f8843g, min, i3);
    }

    /* access modifiers changed from: package-private */
    public boolean P(int i2, int i3, int i4) {
        if (this.f8847k + i4 <= i2 || this.f8844h.size() <= 1 || this.f8847k < i3) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public j<T> Q() {
        return new j<>(this);
    }

    /* access modifiers changed from: package-private */
    public boolean R(boolean z, int i2, int i3, a aVar) {
        int i4 = 0;
        while (K(i2, i3)) {
            ArrayList<List<T>> arrayList = this.f8844h;
            List remove = arrayList.remove(arrayList.size() - 1);
            int size = remove == null ? this.f8849m : remove.size();
            i4 += size;
            this.f8848l -= size;
            this.f8847k -= remove == null ? 0 : remove.size();
        }
        if (i4 > 0) {
            int i5 = this.f8843g + this.f8848l;
            if (z) {
                this.f8845i += i4;
                aVar.m(i5, i4);
            } else {
                aVar.a(i5, i4);
            }
        }
        if (i4 > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean S(boolean z, int i2, int i3, a aVar) {
        int i4 = 0;
        while (L(i2, i3)) {
            List remove = this.f8844h.remove(0);
            int size = remove == null ? this.f8849m : remove.size();
            i4 += size;
            this.f8848l -= size;
            this.f8847k -= remove == null ? 0 : remove.size();
        }
        if (i4 > 0) {
            if (z) {
                int i5 = this.f8843g;
                this.f8843g = i5 + i4;
                aVar.m(i5, i4);
            } else {
                this.f8846j += i4;
                aVar.a(this.f8843g, i4);
            }
        }
        if (i4 > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void T(int i2, List<T> list, int i3, int i4, int i5, a aVar) {
        boolean z = i4 != Integer.MAX_VALUE;
        boolean z2 = i3 > m();
        if (!z || !P(i4, i5, list.size()) || !M(i2, z2)) {
            F(i2, list, aVar);
        } else {
            this.f8844h.set((i2 - this.f8843g) / this.f8849m, (Object) null);
            this.f8848l -= list.size();
            if (z2) {
                this.f8844h.remove(0);
                this.f8843g += list.size();
            } else {
                ArrayList<List<T>> arrayList = this.f8844h;
                arrayList.remove(arrayList.size() - 1);
                this.f8845i += list.size();
            }
        }
        if (!z) {
            return;
        }
        if (z2) {
            S(true, i4, i5, aVar);
        } else {
            R(true, i4, i5, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        int i4;
        int i5 = this.f8843g / this.f8849m;
        if (i2 < i5) {
            int i6 = 0;
            while (true) {
                i4 = i5 - i2;
                if (i6 >= i4) {
                    break;
                }
                this.f8844h.add(0, (Object) null);
                i6++;
            }
            int i7 = i4 * this.f8849m;
            this.f8848l += i7;
            this.f8843g -= i7;
        } else {
            i2 = i5;
        }
        if (i3 >= this.f8844h.size() + i2) {
            int min = Math.min(this.f8845i, ((i3 + 1) - (this.f8844h.size() + i2)) * this.f8849m);
            for (int size = this.f8844h.size(); size <= i3 - i2; size++) {
                ArrayList<List<T>> arrayList = this.f8844h;
                arrayList.add(arrayList.size(), (Object) null);
            }
            this.f8848l += min;
            this.f8845i -= min;
        }
    }

    public void d(int i2, int i3, int i4, a aVar) {
        int i5 = this.f8849m;
        if (i4 != i5) {
            if (i4 < i5) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (this.f8844h.size() == 1 && this.f8845i == 0) {
                this.f8849m = i4;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        int size = size();
        int i6 = this.f8849m;
        int i7 = ((size + i6) - 1) / i6;
        int max = Math.max((i2 - i3) / i6, 0);
        int min = Math.min((i2 + i3) / this.f8849m, i7 - 1);
        a(max, min);
        int i8 = this.f8843g / this.f8849m;
        while (max <= min) {
            int i9 = max - i8;
            if (this.f8844h.get(i9) == null) {
                this.f8844h.set(i9, p);
                aVar.l(max);
            }
            max++;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(List<T> list, a aVar) {
        int size = list.size();
        if (size == 0) {
            aVar.d();
            return;
        }
        if (this.f8849m > 0) {
            ArrayList<List<T>> arrayList = this.f8844h;
            int size2 = arrayList.get(arrayList.size() - 1).size();
            int i2 = this.f8849m;
            if (size2 != i2 || size > i2) {
                this.f8849m = -1;
            }
        }
        this.f8844h.add(list);
        this.f8847k += size;
        this.f8848l += size;
        int min = Math.min(this.f8845i, size);
        int i3 = size - min;
        if (min != 0) {
            this.f8845i -= min;
        }
        this.o += size;
        aVar.k((this.f8843g + this.f8848l) - size, min, i3);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i2 = this.f8843g;
        int size = this.f8844h.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list = this.f8844h.get(i3);
            if (list != null && list != p) {
                break;
            }
            i2 += this.f8849m;
        }
        return i2;
    }

    public T get(int i2) {
        int i3;
        if (i2 < 0 || i2 >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + size());
        }
        int i4 = i2 - this.f8843g;
        if (i4 >= 0 && i4 < this.f8848l) {
            if (H()) {
                int i5 = this.f8849m;
                i3 = i4 / i5;
                i4 %= i5;
            } else {
                int size = this.f8844h.size();
                i3 = 0;
                while (i3 < size) {
                    int size2 = this.f8844h.get(i3).size();
                    if (size2 > i4) {
                        break;
                    }
                    i4 -= size2;
                    i3++;
                }
            }
            List list = this.f8844h.get(i3);
            if (!(list == null || list.size() == 0)) {
                return list.get(i4);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        int i2 = this.f8845i;
        for (int size = this.f8844h.size() - 1; size >= 0; size--) {
            List list = this.f8844h.get(size);
            if (list != null && list != p) {
                break;
            }
            i2 += this.f8849m;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public T j() {
        return this.f8844h.get(0).get(0);
    }

    /* access modifiers changed from: package-private */
    public T k() {
        ArrayList<List<T>> arrayList = this.f8844h;
        List list = arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f8843g;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f8843g + this.f8846j + (this.f8848l / 2);
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.f8850n;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f8844h.size();
    }

    /* access modifiers changed from: package-private */
    public int r() {
        return this.f8846j;
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return this.f8848l;
    }

    public int size() {
        return this.f8843g + this.f8848l + this.f8845i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("leading " + this.f8843g + ", storage " + this.f8848l + ", trailing " + u());
        for (int i2 = 0; i2 < this.f8844h.size(); i2++) {
            sb.append(" ");
            sb.append(this.f8844h.get(i2));
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public int u() {
        return this.f8845i;
    }

    public boolean y(int i2, int i3) {
        List list;
        int i4 = this.f8843g / i2;
        if (i3 < i4 || i3 >= this.f8844h.size() + i4 || (list = this.f8844h.get(i3 - i4)) == null || list == p) {
            return false;
        }
        return true;
    }

    private j(j<T> jVar) {
        this.f8843g = jVar.f8843g;
        this.f8844h = new ArrayList<>(jVar.f8844h);
        this.f8845i = jVar.f8845i;
        this.f8846j = jVar.f8846j;
        this.f8847k = jVar.f8847k;
        this.f8848l = jVar.f8848l;
        this.f8849m = jVar.f8849m;
        this.f8850n = jVar.f8850n;
        this.o = jVar.o;
    }
}
