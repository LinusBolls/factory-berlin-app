package retrofit2.w.c;

import java.io.IOException;
import k.e0;
import retrofit2.f;

/* compiled from: ScalarResponseBodyConverters */
final class d implements f<e0, Character> {
    static final d a = new d();

    d() {
    }

    /* renamed from: a */
    public Character convert(e0 e0Var) {
        String o = e0Var.o();
        if (o.length() == 1) {
            return Character.valueOf(o.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + o.length());
    }
}
