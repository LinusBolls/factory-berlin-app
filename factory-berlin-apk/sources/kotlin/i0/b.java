package kotlin.i0;

import java.util.Iterator;
import kotlin.jvm.internal.k;

/* compiled from: Sequences.kt */
public final class b<T> implements d<T>, c<T> {
    /* access modifiers changed from: private */
    public final d<T> a;
    /* access modifiers changed from: private */
    public final int b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, kotlin.jvm.internal.z.a {

        /* renamed from: g  reason: collision with root package name */
        private final Iterator<T> f10629g;

        /* renamed from: h  reason: collision with root package name */
        private int f10630h;

        a(b bVar) {
            this.f10629g = bVar.a.iterator();
            this.f10630h = bVar.b;
        }

        private final void a() {
            while (this.f10630h > 0 && this.f10629g.hasNext()) {
                this.f10629g.next();
                this.f10630h--;
            }
        }

        public boolean hasNext() {
            a();
            return this.f10629g.hasNext();
        }

        public T next() {
            a();
            return this.f10629g.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(d<? extends T> dVar, int i2) {
        k.e(dVar, "sequence");
        this.a = dVar;
        this.b = i2;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + this.b + '.').toString());
        }
    }

    public d<T> a(int i2) {
        int i3 = this.b + i2;
        return i3 < 0 ? new b(this, i2) : new b(this.a, i3);
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
