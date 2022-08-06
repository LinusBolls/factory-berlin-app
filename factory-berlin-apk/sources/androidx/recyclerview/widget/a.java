package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import e.h.j.e;
import e.h.j.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper */
class a implements s.a {
    private e<b> a;
    final ArrayList<b> b;
    final ArrayList<b> c;

    /* renamed from: d  reason: collision with root package name */
    final C0028a f1234d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f1235e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f1236f;

    /* renamed from: g  reason: collision with root package name */
    final s f1237g;

    /* renamed from: h  reason: collision with root package name */
    private int f1238h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    interface C0028a {
        void a(int i2, int i3);

        void b(b bVar);

        RecyclerView.d0 c(int i2);

        void d(int i2, int i3);

        void e(int i2, int i3);

        void f(int i2, int i3);

        void g(b bVar);

        void h(int i2, int i3, Object obj);
    }

    /* compiled from: AdapterHelper */
    static class b {
        int a;
        int b;
        Object c;

        /* renamed from: d  reason: collision with root package name */
        int f1239d;

        b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.b = i3;
            this.f1239d = i4;
            this.c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i2 = this.a;
            if (i2 == 1) {
                return "add";
            }
            if (i2 == 2) {
                return "rm";
            }
            if (i2 != 4) {
                return i2 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f1239d - this.b) == 1 && this.f1239d == bVar.b && this.b == bVar.f1239d) {
                return true;
            }
            if (this.f1239d != bVar.f1239d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.f1239d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.f1239d + ",p:" + this.c + "]";
        }
    }

    a(C0028a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        char c2;
        boolean z;
        boolean z2;
        int i2 = bVar.b;
        int i3 = bVar.f1239d + i2;
        char c3 = 65535;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.f1234d.c(i4) != null || h(i4)) {
                if (c3 == 0) {
                    k(b(2, i2, i5, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    v(b(2, i2, i5, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c3 = c2;
        }
        if (i5 != bVar.f1239d) {
            a(bVar);
            bVar = b(2, i2, i5, (Object) null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i2 = bVar.b;
        int i3 = bVar.f1239d + i2;
        int i4 = i2;
        char c2 = 65535;
        int i5 = 0;
        while (i2 < i3) {
            if (this.f1234d.c(i2) != null || h(i2)) {
                if (c2 == 0) {
                    k(b(4, i4, i5, bVar.c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    v(b(4, i4, i5, bVar.c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != bVar.f1239d) {
            Object obj = bVar.c;
            a(bVar);
            bVar = b(4, i4, i5, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (n(bVar.f1239d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.b;
                int i6 = bVar.f1239d + i5;
                while (i5 < i6) {
                    if (n(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z = z(bVar.b, i3);
        int i4 = bVar.b;
        int i5 = bVar.a;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f1239d; i7++) {
            int z2 = z(bVar.b + (i2 * i7), bVar.a);
            int i8 = bVar.a;
            if (i8 == 2 ? z2 == z : i8 == 4 && z2 == z + 1) {
                i6++;
            } else {
                b b2 = b(bVar.a, z, i6, bVar.c);
                l(b2, i4);
                a(b2);
                if (bVar.a == 4) {
                    i4 += i6;
                }
                z = z2;
                i6 = 1;
            }
        }
        Object obj = bVar.c;
        a(bVar);
        if (i6 > 0) {
            b b3 = b(bVar.a, z, i6, obj);
            l(b3, i4);
            a(b3);
        }
    }

    private void v(b bVar) {
        this.c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            this.f1234d.e(bVar.b, bVar.f1239d);
        } else if (i2 == 2) {
            this.f1234d.d(bVar.b, bVar.f1239d);
        } else if (i2 == 4) {
            this.f1234d.h(bVar.b, bVar.f1239d, bVar.c);
        } else if (i2 == 8) {
            this.f1234d.a(bVar.b, bVar.f1239d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i2, int i3) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.b;
                int i6 = bVar.f1239d;
                if (i5 >= i6) {
                    int i7 = i6;
                    i6 = i5;
                    i5 = i7;
                }
                if (i2 < i5 || i2 > i6) {
                    int i8 = bVar.b;
                    if (i2 < i8) {
                        if (i3 == 1) {
                            bVar.b = i8 + 1;
                            bVar.f1239d++;
                        } else if (i3 == 2) {
                            bVar.b = i8 - 1;
                            bVar.f1239d--;
                        }
                    }
                } else {
                    int i9 = bVar.b;
                    if (i5 == i9) {
                        if (i3 == 1) {
                            bVar.f1239d++;
                        } else if (i3 == 2) {
                            bVar.f1239d--;
                        }
                        i2++;
                    } else {
                        if (i3 == 1) {
                            bVar.b = i9 + 1;
                        } else if (i3 == 2) {
                            bVar.b = i9 - 1;
                        }
                        i2--;
                    }
                }
            } else {
                int i10 = bVar.b;
                if (i10 <= i2) {
                    if (i4 == 1) {
                        i2 -= bVar.f1239d;
                    } else if (i4 == 2) {
                        i2 += bVar.f1239d;
                    }
                } else if (i3 == 1) {
                    bVar.b = i10 + 1;
                } else if (i3 == 2) {
                    bVar.b = i10 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i11 = bVar2.f1239d;
                if (i11 == bVar2.b || i11 < 0) {
                    this.c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f1239d <= 0) {
                this.c.remove(size2);
                a(bVar2);
            }
        }
        return i2;
    }

    public void a(b bVar) {
        if (!this.f1236f) {
            bVar.c = null;
            this.a.a(bVar);
        }
    }

    public b b(int i2, int i3, int i4, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i2, i3, i4, obj);
        }
        b2.a = i2;
        b2.b = i3;
        b2.f1239d = i4;
        b2.c = obj;
        return b2;
    }

    public int e(int i2) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.b.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.b;
                    if (i5 <= i2) {
                        int i6 = bVar.f1239d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.b;
                    if (i7 == i2) {
                        i2 = bVar.f1239d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f1239d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.b <= i2) {
                i2 += bVar.f1239d;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1234d.b(this.c.get(i2));
        }
        x(this.c);
        this.f1238h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                this.f1234d.b(bVar);
                this.f1234d.e(bVar.b, bVar.f1239d);
            } else if (i3 == 2) {
                this.f1234d.b(bVar);
                this.f1234d.f(bVar.b, bVar.f1239d);
            } else if (i3 == 4) {
                this.f1234d.b(bVar);
                this.f1234d.h(bVar.b, bVar.f1239d, bVar.c);
            } else if (i3 == 8) {
                this.f1234d.b(bVar);
                this.f1234d.a(bVar.b, bVar.f1239d);
            }
            Runnable runnable = this.f1235e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.b);
        this.f1238h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i2) {
        this.f1234d.g(bVar);
        int i3 = bVar.a;
        if (i3 == 2) {
            this.f1234d.f(i2, bVar.f1239d);
        } else if (i3 == 4) {
            this.f1234d.h(i2, bVar.f1239d, bVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i2) {
        return n(i2, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i2, int i3) {
        int size = this.c.size();
        while (i3 < size) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.b;
                if (i5 == i2) {
                    i2 = bVar.f1239d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f1239d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f1239d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f1239d;
                }
            }
            i3++;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i2) {
        return (i2 & this.f1238h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.c.isEmpty() && !this.b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.b.add(b(4, i2, i3, obj));
        this.f1238h |= 4;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.b.add(b(1, i2, i3, (Object) null));
        this.f1238h |= 1;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 == 1) {
            this.b.add(b(8, i2, i3, (Object) null));
            this.f1238h |= 8;
            if (this.b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.b.add(b(2, i2, i3, (Object) null));
        this.f1238h |= 2;
        if (this.b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f1237g.b(this.b);
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                c(bVar);
            } else if (i3 == 2) {
                f(bVar);
            } else if (i3 == 4) {
                g(bVar);
            } else if (i3 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f1235e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public void x(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(list.get(i2));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void y() {
        x(this.b);
        x(this.c);
        this.f1238h = 0;
    }

    a(C0028a aVar, boolean z) {
        this.a = new f(30);
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.f1238h = 0;
        this.f1234d = aVar;
        this.f1236f = z;
        this.f1237g = new s(this);
    }
}
