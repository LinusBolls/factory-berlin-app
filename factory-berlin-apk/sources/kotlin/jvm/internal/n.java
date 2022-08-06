package kotlin.jvm.internal;

import kotlin.h0.a;
import kotlin.h0.e;

/* compiled from: PropertyReference1 */
public abstract class n extends p implements e {
    public n(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    /* access modifiers changed from: protected */
    public a c() {
        v.d(this);
        return this;
    }

    public e.a n() {
        return ((e) i()).n();
    }

    public Object o(Object obj) {
        return get(obj);
    }
}
