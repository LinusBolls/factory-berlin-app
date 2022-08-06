package g.a.a.h.r.a;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* compiled from: HttpCachePolicy.kt */
public final class b {
    public static final a a = new a(C0598b.CACHE_ONLY);
    public static final c b = new c(C0598b.NETWORK_ONLY, 0, (TimeUnit) null, false);

    /* compiled from: HttpCachePolicy.kt */
    public static final class a extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C0598b bVar) {
            super(bVar, 0, (TimeUnit) null, false);
            k.f(bVar, "fetchStrategy");
        }
    }

    /* renamed from: g.a.a.h.r.a.b$b  reason: collision with other inner class name */
    /* compiled from: HttpCachePolicy.kt */
    public enum C0598b {
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_FIRST,
        NETWORK_FIRST
    }

    /* compiled from: HttpCachePolicy.kt */
    public static class c {
        public final C0598b a;
        public final long b;
        public final TimeUnit c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f9083d;

        public c(C0598b bVar, long j2, TimeUnit timeUnit, boolean z) {
            k.f(bVar, "fetchStrategy");
            this.a = bVar;
            this.b = j2;
            this.c = timeUnit;
            this.f9083d = z;
        }

        public final long a() {
            TimeUnit timeUnit = this.c;
            if (timeUnit != null) {
                return timeUnit.toMillis(this.b);
            }
            return 0;
        }
    }

    static {
        new a(C0598b.CACHE_FIRST);
        new a(C0598b.NETWORK_FIRST);
    }
}
