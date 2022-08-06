package kotlin.f0;

import java.util.Random;
import kotlin.jvm.internal.k;

/* compiled from: PlatformRandom.kt */
public final class b extends a {
    private final a c = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random c() {
        Object obj = this.c.get();
        k.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
