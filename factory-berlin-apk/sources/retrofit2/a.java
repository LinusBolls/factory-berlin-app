package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import k.c0;
import k.e0;
import kotlin.x;
import retrofit2.f;
import retrofit2.x.t;

/* compiled from: BuiltInConverters */
final class a extends f.a {
    private boolean a = true;

    /* renamed from: retrofit2.a$a  reason: collision with other inner class name */
    /* compiled from: BuiltInConverters */
    static final class C0804a implements f<e0, e0> {
        static final C0804a a = new C0804a();

        C0804a() {
        }

        /* renamed from: a */
        public e0 convert(e0 e0Var) {
            try {
                return v.a(e0Var);
            } finally {
                e0Var.close();
            }
        }
    }

    /* compiled from: BuiltInConverters */
    static final class b implements f<c0, c0> {
        static final b a = new b();

        b() {
        }

        public c0 a(c0 c0Var) {
            return c0Var;
        }

        public /* bridge */ /* synthetic */ Object convert(Object obj) {
            c0 c0Var = (c0) obj;
            a(c0Var);
            return c0Var;
        }
    }

    /* compiled from: BuiltInConverters */
    static final class c implements f<e0, e0> {
        static final c a = new c();

        c() {
        }

        public e0 a(e0 e0Var) {
            return e0Var;
        }

        public /* bridge */ /* synthetic */ Object convert(Object obj) {
            e0 e0Var = (e0) obj;
            a(e0Var);
            return e0Var;
        }
    }

    /* compiled from: BuiltInConverters */
    static final class d implements f<Object, String> {
        static final d a = new d();

        d() {
        }

        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters */
    static final class e implements f<e0, x> {
        static final e a = new e();

        e() {
        }

        /* renamed from: a */
        public x convert(e0 e0Var) {
            e0Var.close();
            return x.a;
        }
    }

    /* compiled from: BuiltInConverters */
    static final class f implements f<e0, Void> {
        static final f a = new f();

        f() {
        }

        /* renamed from: a */
        public Void convert(e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    a() {
    }

    public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, r rVar) {
        if (c0.class.isAssignableFrom(v.i(type))) {
            return b.a;
        }
        return null;
    }

    public f<e0, ?> d(Type type, Annotation[] annotationArr, r rVar) {
        if (type == e0.class) {
            if (v.m(annotationArr, t.class)) {
                return c.a;
            }
            return C0804a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (!this.a || type != x.class) {
                return null;
            }
            try {
                return e.a;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
                return null;
            }
        }
    }
}
