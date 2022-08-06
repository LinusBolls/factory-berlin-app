package g.b.a.a.i;

import com.google.auto.value.AutoValue;
import g.b.a.a.b;
import g.b.a.a.c;
import g.b.a.a.e;
import g.b.a.a.i.b;

@AutoValue
/* compiled from: SendRequest */
abstract class l {

    @AutoValue.Builder
    /* compiled from: SendRequest */
    public static abstract class a {
        public abstract l a();

        /* access modifiers changed from: package-private */
        public abstract a b(b bVar);

        /* access modifiers changed from: package-private */
        public abstract a c(c<?> cVar);

        /* access modifiers changed from: package-private */
        public abstract a d(e<?, byte[]> eVar);

        public abstract a e(m mVar);

        public abstract a f(String str);
    }

    l() {
    }

    public static a a() {
        return new b.C0629b();
    }

    public abstract g.b.a.a.b b();

    /* access modifiers changed from: package-private */
    public abstract c<?> c();

    public byte[] d() {
        return e().a(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract e<?, byte[]> e();

    public abstract m f();

    public abstract String g();
}
