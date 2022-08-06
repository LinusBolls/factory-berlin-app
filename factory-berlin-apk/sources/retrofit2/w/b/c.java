package retrofit2.w.b;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.g;
import k.e0;
import l.h;
import l.i;
import retrofit2.f;

/* compiled from: MoshiResponseBodyConverter */
final class c<T> implements f<e0, T> {
    private static final i b = i.i("EFBBBF");
    private final JsonAdapter<T> a;

    c(JsonAdapter<T> jsonAdapter) {
        this.a = jsonAdapter;
    }

    /* renamed from: a */
    public T convert(e0 e0Var) {
        h n2 = e0Var.n();
        try {
            if (n2.y0(0, b)) {
                n2.x((long) b.G());
            }
            g q = g.q(n2);
            T b2 = this.a.b(q);
            if (q.y() == g.c.END_DOCUMENT) {
                return b2;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }
}
