package retrofit2.w.a;

import com.google.gson.JsonIOException;
import com.google.gson.s;
import com.google.gson.stream.a;
import com.google.gson.stream.b;
import k.e0;
import retrofit2.f;

/* compiled from: GsonResponseBodyConverter */
final class c<T> implements f<e0, T> {
    private final com.google.gson.f a;
    private final s<T> b;

    c(com.google.gson.f fVar, s<T> sVar) {
        this.a = fVar;
        this.b = sVar;
    }

    /* renamed from: a */
    public T convert(e0 e0Var) {
        a o = this.a.o(e0Var.b());
        try {
            T b2 = this.b.b(o);
            if (o.Z() == b.END_DOCUMENT) {
                return b2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }
}
