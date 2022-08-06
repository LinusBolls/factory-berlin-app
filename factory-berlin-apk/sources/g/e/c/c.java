package g.e.c;

import android.os.SystemClock;
import android.util.LruCache;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: Debounce.kt */
public final class c {
    /* access modifiers changed from: private */
    public static final LruCache<String, b> a = new LruCache<>(50);
    public static final a b = new a((DefaultConstructorMarker) null);

    /* compiled from: Debounce.kt */
    public static final class a {
        private a() {
        }

        public final boolean a(String str) {
            b bVar;
            k.f(str, "key");
            if (!(str.length() == 0)) {
                synchronized (c.a) {
                    bVar = (b) c.a.get(str);
                    x xVar = x.a;
                }
                if (bVar != null) {
                    return bVar.a();
                }
                return false;
            }
            throw new IllegalArgumentException("Key cannot be empty");
        }

        public final boolean b(String str, long j2) {
            k.f(str, "key");
            boolean z = true;
            if (!(str.length() == 0)) {
                synchronized (c.a) {
                    b bVar = (b) c.a.get(str);
                    if (bVar == null || !bVar.a()) {
                        c.a.put(str, new b(SystemClock.elapsedRealtime(), j2));
                        z = false;
                    }
                }
                return z;
            }
            throw new IllegalArgumentException("Key cannot be empty");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Debounce.kt */
    private static final class b {
        private final long a;
        private final long b;

        public b(long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }

        public final boolean a() {
            return this.a + this.b > SystemClock.elapsedRealtime();
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (this.a == bVar.a) {
                        if (this.b == bVar.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j2 = this.a;
            long j3 = this.b;
            return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public String toString() {
            return "DebounceInstance(timestamp=" + this.a + ", timeout=" + this.b + ")";
        }
    }
}
