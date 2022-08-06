package retrofit2.w.c;

import k.c0;
import k.x;
import retrofit2.f;

/* compiled from: ScalarRequestBodyConverter */
final class a<T> implements f<T, c0> {
    static final a<Object> a = new a<>();
    private static final x b = x.e("text/plain; charset=UTF-8");

    private a() {
    }

    /* renamed from: a */
    public c0 convert(T t) {
        return c0.d(b, String.valueOf(t));
    }
}
