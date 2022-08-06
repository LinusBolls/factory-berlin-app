package m.a.c.i;

import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: DefinitionParameters.kt */
public final class b {
    public static final a a() {
        return new a(new Object[0]);
    }

    public static final a b(Object... objArr) {
        k.f(objArr, "parameters");
        if (objArr.length <= 5) {
            return new a(Arrays.copyOf(objArr, objArr.length));
        }
        throw new IllegalStateException("Can't build DefinitionParameters for more than 5 arguments".toString());
    }
}
