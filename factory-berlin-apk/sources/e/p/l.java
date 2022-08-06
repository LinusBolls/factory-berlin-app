package e.p;

import e.p.d;
import e.p.g;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PositionalDataSource */
public abstract class l<T> extends d<Integer, T> {

    /* compiled from: PositionalDataSource */
    static class a<Value> extends b<Integer, Value> {
        final l<Value> c;

        a(l<Value> lVar) {
            this.c = lVar;
        }

        public void a(d.b bVar) {
            this.c.a(bVar);
        }

        public void c() {
            this.c.c();
        }

        public boolean e() {
            return this.c.e();
        }

        public void f(d.b bVar) {
            this.c.f(bVar);
        }

        /* access modifiers changed from: package-private */
        public void g(int i2, Value value, int i3, Executor executor, g.a<Value> aVar) {
            this.c.j(1, i2 + 1, i3, executor, aVar);
        }

        /* access modifiers changed from: package-private */
        public void h(int i2, Value value, int i3, Executor executor, g.a<Value> aVar) {
            int i4 = i2 - 1;
            if (i4 < 0) {
                this.c.j(2, i4, 0, executor, aVar);
                return;
            }
            int min = Math.min(i3, i4 + 1);
            this.c.j(2, (i4 - min) + 1, min, executor, aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void i(Integer num, int i2, int i3, boolean z, Executor executor, g.a<Value> aVar) {
            Integer num2;
            if (num == null) {
                num2 = 0;
            } else {
                i2 = Math.max(i2 / i3, 2) * i3;
                num2 = Integer.valueOf(Math.max(0, ((num.intValue() - (i2 / 2)) / i3) * i3));
            }
            this.c.i(false, num2.intValue(), i2, i3, executor, aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Integer j(int i2, Value value) {
            return Integer.valueOf(i2);
        }
    }

    /* compiled from: PositionalDataSource */
    public static abstract class b<T> {
        public abstract void a(List<T> list, int i2, int i3);
    }

    /* compiled from: PositionalDataSource */
    static class c<T> extends b<T> {
        final d.c<T> a;
        private final boolean b;
        private final int c;

        c(l lVar, boolean z, int i2, g.a<T> aVar) {
            this.a = new d.c<>(lVar, 0, (Executor) null, aVar);
            this.b = z;
            this.c = i2;
            if (i2 < 1) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }

        public void a(List<T> list, int i2, int i3) {
            if (!this.a.a()) {
                d.c.d(list, i2, i3);
                if (list.size() + i2 != i3 && list.size() % this.c != 0) {
                    throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + list.size() + ", position " + i2 + ", totalCount " + i3 + ", pageSize " + this.c);
                } else if (this.b) {
                    this.a.b(new g(list, i2, (i3 - i2) - list.size(), 0));
                } else {
                    this.a.b(new g(list, i2));
                }
            }
        }
    }

    /* compiled from: PositionalDataSource */
    public static class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i2, int i3, int i4, boolean z) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
        }
    }

    /* compiled from: PositionalDataSource */
    public static abstract class e<T> {
        public abstract void a(List<T> list);
    }

    /* compiled from: PositionalDataSource */
    static class f<T> extends e<T> {
        private d.c<T> a;
        private final int b;

        f(l lVar, int i2, int i3, Executor executor, g.a<T> aVar) {
            this.a = new d.c<>(lVar, i2, executor, aVar);
            this.b = i3;
        }

        public void a(List<T> list) {
            if (!this.a.a()) {
                this.a.b(new g(list, 0, 0, this.b));
            }
        }
    }

    /* compiled from: PositionalDataSource */
    public static class g {
        public final int a;
        public final int b;

        public g(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    public static int g(d dVar, int i2) {
        int i3 = dVar.a;
        int i4 = dVar.b;
        int i5 = dVar.c;
        return Math.max(0, Math.min(((((i2 - i4) + i5) - 1) / i5) * i5, (i3 / i5) * i5));
    }

    public static int h(d dVar, int i2, int i3) {
        return Math.min(i3 - i2, dVar.b);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void i(boolean z, int i2, int i3, int i4, Executor executor, g.a<T> aVar) {
        c cVar = new c(this, z, i4, aVar);
        k(new d(i2, i3, i4, z), cVar);
        cVar.a.c(executor);
    }

    /* access modifiers changed from: package-private */
    public final void j(int i2, int i3, int i4, Executor executor, g.a<T> aVar) {
        f fVar = new f(this, i2, i3, executor, aVar);
        if (i4 == 0) {
            fVar.a(Collections.emptyList());
        } else {
            l(new g(i3, i4), fVar);
        }
    }

    public abstract void k(d dVar, b<T> bVar);

    public abstract void l(g gVar, e<T> eVar);

    /* access modifiers changed from: package-private */
    public b<Integer, T> m() {
        return new a(this);
    }
}
