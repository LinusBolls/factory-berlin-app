package kotlinx.coroutines.channels;

/* compiled from: LinkedListChannel.kt */
public class m<E> extends a<E> {
    /* access modifiers changed from: protected */
    public final boolean I() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean J() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean q() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Object t(E e2) {
        s<?> v;
        do {
            Object t = super.t(e2);
            Object obj = b.a;
            if (t == obj) {
                return obj;
            }
            if (t == b.b) {
                v = v(e2);
                if (v == null) {
                    return b.a;
                }
            } else if (t instanceof k) {
                return t;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + t).toString());
            }
        } while (!(v instanceof k));
        return v;
    }
}
