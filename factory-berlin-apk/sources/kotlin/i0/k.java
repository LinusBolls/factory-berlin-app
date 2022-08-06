package kotlin.i0;

import java.util.Iterator;
import kotlin.e0.c.l;

/* compiled from: Sequences.kt */
public final class k<T, R> implements d<R> {
    /* access modifiers changed from: private */
    public final d<T> a;
    /* access modifiers changed from: private */
    public final l<T, R> b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, kotlin.jvm.internal.z.a {

        /* renamed from: g  reason: collision with root package name */
        private final Iterator<T> f10632g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f10633h;

        a(k kVar) {
            this.f10633h = kVar;
            this.f10632g = kVar.a.iterator();
        }

        public boolean hasNext() {
            return this.f10632g.hasNext();
        }

        public R next() {
            return this.f10633h.b.o(this.f10632g.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.k.e(dVar, "sequence");
        kotlin.jvm.internal.k.e(lVar, "transformer");
        this.a = dVar;
        this.b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
