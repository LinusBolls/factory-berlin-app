package g.a.a.h;

import kotlin.jvm.internal.k;

/* compiled from: Input.kt */
public final class h<V> {
    public static final a c = new a((DefaultConstructorMarker) null);
    public final V a;
    public final boolean b;

    /* compiled from: Input.kt */
    public static final class a {
        private a() {
        }

        public final <V> h<V> a() {
            return new h<>(null, false);
        }

        public final <V> h<V> b(V v) {
            return new h<>(v, true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = g.a.a.h.h.c.b(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <V> g.a.a.h.h<V> c(V r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000b
                g.a.a.h.h$a r0 = g.a.a.h.h.c
                g.a.a.h.h r2 = r0.b(r2)
                if (r2 == 0) goto L_0x000b
                goto L_0x000f
            L_0x000b:
                g.a.a.h.h r2 = r1.a()
            L_0x000f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.a.h.h.a.c(java.lang.Object):g.a.a.h.h");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public h(V v, boolean z) {
        this.a = v;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return !(k.a(this.a, hVar.a) ^ true) && this.b == hVar.b;
    }

    public int hashCode() {
        V v = this.a;
        return ((v != null ? v.hashCode() : 0) * 31) + b.a(this.b);
    }
}
