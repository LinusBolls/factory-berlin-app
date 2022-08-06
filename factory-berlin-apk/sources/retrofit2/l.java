package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import k.e0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.f;

@IgnoreJRERequirement
/* compiled from: OptionalConverterFactory */
final class l extends f.a {
    static final f.a a = new l();

    @IgnoreJRERequirement
    /* compiled from: OptionalConverterFactory */
    static final class a<T> implements f<e0, Optional<T>> {
        final f<e0, T> a;

        a(f<e0, T> fVar) {
            this.a = fVar;
        }

        /* renamed from: a */
        public Optional<T> convert(e0 e0Var) {
            return Optional.ofNullable(this.a.convert(e0Var));
        }
    }

    l() {
    }

    public f<e0, ?> d(Type type, Annotation[] annotationArr, r rVar) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a(rVar.i(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
