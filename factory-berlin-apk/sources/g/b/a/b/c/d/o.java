package g.b.a.b.c.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class o extends WeakReference<Throwable> {
    private final int a;

    public o(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == o.class) {
            if (this == obj) {
                return true;
            }
            o oVar = (o) obj;
            return this.a == oVar.a && get() == oVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
