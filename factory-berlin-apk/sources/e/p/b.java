package e.p;

import e.p.g;
import java.util.concurrent.Executor;

/* compiled from: ContiguousDataSource */
abstract class b<Key, Value> extends d<Key, Value> {
    b() {
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract void g(int i2, Value value, int i3, Executor executor, g.a<Value> aVar);

    /* access modifiers changed from: package-private */
    public abstract void h(int i2, Value value, int i3, Executor executor, g.a<Value> aVar);

    /* access modifiers changed from: package-private */
    public abstract void i(Key key, int i2, int i3, boolean z, Executor executor, g.a<Value> aVar);

    /* access modifiers changed from: package-private */
    public abstract Key j(int i2, Value value);

    /* access modifiers changed from: package-private */
    public boolean k() {
        return true;
    }
}
