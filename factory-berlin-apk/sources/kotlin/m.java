package kotlin;

import java.io.Serializable;
import kotlin.e0.c.a;
import kotlin.jvm.internal.k;

/* compiled from: LazyJVM.kt */
final class m<T> implements e<T>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private a<? extends T> f10690g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Object f10691h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f10692i;

    public m(a<? extends T> aVar, Object obj) {
        k.e(aVar, "initializer");
        this.f10690g = aVar;
        this.f10691h = u.a;
        this.f10692i = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f10691h != u.a;
    }

    public T getValue() {
        T t;
        T t2 = this.f10691h;
        if (t2 != u.a) {
            return t2;
        }
        synchronized (this.f10692i) {
            t = this.f10691h;
            if (t == u.a) {
                a aVar = this.f10690g;
                k.c(aVar);
                t = aVar.d();
                this.f10691h = t;
                this.f10690g = null;
            }
        }
        return t;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a aVar, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }
}
