package g.b.a.a.i.v.j;

import com.google.auto.value.AutoValue;
import g.b.a.a.i.v.j.a;

@AutoValue
/* compiled from: EventStoreConfig */
abstract class d {
    static final d a;

    @AutoValue.Builder
    /* compiled from: EventStoreConfig */
    static abstract class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract d a();

        /* access modifiers changed from: package-private */
        public abstract a b(int i2);

        /* access modifiers changed from: package-private */
        public abstract a c(long j2);

        /* access modifiers changed from: package-private */
        public abstract a d(int i2);

        /* access modifiers changed from: package-private */
        public abstract a e(int i2);

        /* access modifiers changed from: package-private */
        public abstract a f(long j2);
    }

    static {
        a a2 = a();
        a2.f(10485760);
        a2.d(200);
        a2.b(10000);
        a2.c(604800000);
        a2.e(81920);
        a = a2.a();
    }

    d() {
    }

    static a a() {
        return new a.b();
    }

    /* access modifiers changed from: package-private */
    public abstract int b();

    /* access modifiers changed from: package-private */
    public abstract long c();

    /* access modifiers changed from: package-private */
    public abstract int d();

    /* access modifiers changed from: package-private */
    public abstract int e();

    /* access modifiers changed from: package-private */
    public abstract long f();
}
