package retrofit2.w.a;

import com.google.gson.s;
import com.google.gson.stream.c;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import k.c0;
import k.x;
import retrofit2.f;

/* compiled from: GsonRequestBodyConverter */
final class b<T> implements f<T, c0> {
    private static final x c = x.e("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f11860d = Charset.forName("UTF-8");
    private final com.google.gson.f a;
    private final s<T> b;

    b(com.google.gson.f fVar, s<T> sVar) {
        this.a = fVar;
        this.b = sVar;
    }

    /* renamed from: a */
    public c0 convert(T t) {
        l.f fVar = new l.f();
        c p = this.a.p(new OutputStreamWriter(fVar.G0(), f11860d));
        this.b.d(p, t);
        p.close();
        return c0.e(c, fVar.K0());
    }
}
