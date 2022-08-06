package m.a.c.i;

import kotlin.jvm.internal.k;
import org.koin.core.error.NoParameterFoundException;

/* compiled from: DefinitionParameters.kt */
public final class a {
    private final Object[] a;

    /* renamed from: m.a.c.i.a$a  reason: collision with other inner class name */
    /* compiled from: DefinitionParameters.kt */
    public static final class C0785a {
        private C0785a() {
        }

        public /* synthetic */ C0785a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0785a((DefaultConstructorMarker) null);
    }

    public a(Object... objArr) {
        k.f(objArr, "values");
        this.a = objArr;
    }

    private final <T> T d(int i2) {
        T[] tArr = this.a;
        if (tArr.length > i2) {
            return tArr[i2];
        }
        throw new NoParameterFoundException("Can't get parameter value #" + i2 + " from " + this);
    }

    public final <T> T a() {
        return d(0);
    }

    public final <T> T b() {
        return d(1);
    }

    public final <T> T c() {
        return d(2);
    }
}
