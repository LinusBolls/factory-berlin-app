package retrofit2.w.b;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.l;
import k.c0;
import k.x;
import retrofit2.f;

/* compiled from: MoshiRequestBodyConverter */
final class b<T> implements f<T, c0> {
    private static final x b = x.e("application/json; charset=UTF-8");
    private final JsonAdapter<T> a;

    b(JsonAdapter<T> jsonAdapter) {
        this.a = jsonAdapter;
    }

    /* renamed from: a */
    public c0 convert(T t) {
        l.f fVar = new l.f();
        this.a.h(l.q(fVar), t);
        return c0.e(b, fVar.K0());
    }
}
