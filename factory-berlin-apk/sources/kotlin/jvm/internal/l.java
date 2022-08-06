package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: Lambda.kt */
public abstract class l<R> implements g<R>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final int f10681g;

    public l(int i2) {
        this.f10681g = i2;
    }

    public int h() {
        return this.f10681g;
    }

    public String toString() {
        String f2 = v.f(this);
        k.d(f2, "Reflection.renderLambdaToString(this)");
        return f2;
    }
}
