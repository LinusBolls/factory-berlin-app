package g.a.a.h;

import g.a.a.h.k.b;
import g.a.a.h.k.c;
import g.a.a.h.s.f;
import g.a.a.h.s.g;
import g.a.a.h.s.m;
import g.a.a.h.s.n;
import java.util.Map;
import l.i;

/* compiled from: Operation.kt */
public interface k<D extends b, T, V extends c> {
    public static final c a = new c();

    /* compiled from: Operation.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Operation.kt */
    public interface b {
        n a();
    }

    /* compiled from: Operation.kt */
    public static class c {

        /* compiled from: Operation.kt */
        public static final class a implements f {
            a() {
            }

            public void a(g gVar) {
                kotlin.jvm.internal.k.f(gVar, "writer");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
            if (r1 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            throw r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(g.a.a.h.q r5) {
            /*
                r4 = this;
                java.lang.String r0 = "scalarTypeAdapters"
                kotlin.jvm.internal.k.f(r5, r0)
                l.f r0 = new l.f
                r0.<init>()
                com.apollographql.apollo.api.internal.json.f$a r1 = com.apollographql.apollo.api.internal.json.f.f1818n
                com.apollographql.apollo.api.internal.json.f r1 = r1.a(r0)
                r2 = 1
                r1.Z(r2)     // Catch:{ all -> 0x0031 }
                r1.b()     // Catch:{ all -> 0x0031 }
                g.a.a.h.s.f r2 = r4.b()     // Catch:{ all -> 0x0031 }
                com.apollographql.apollo.api.internal.json.b r3 = new com.apollographql.apollo.api.internal.json.b     // Catch:{ all -> 0x0031 }
                r3.<init>(r1, r5)     // Catch:{ all -> 0x0031 }
                r2.a(r3)     // Catch:{ all -> 0x0031 }
                r1.i()     // Catch:{ all -> 0x0031 }
                if (r1 != 0) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r1.close()
            L_0x002c:
                java.lang.String r5 = r0.P0()
                return r5
            L_0x0031:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0033 }
            L_0x0033:
                r5 = move-exception
                if (r1 == 0) goto L_0x0039
                r1.close()     // Catch:{ all -> 0x0039 }
            L_0x0039:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.a.h.k.c.a(g.a.a.h.q):java.lang.String");
        }

        public f b() {
            return new a();
        }

        public Map<String, Object> c() {
            return e0.e();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    String b();

    m<D> c();

    i d(q qVar);

    String e();

    T f(D d2);

    V g();

    l name();
}
