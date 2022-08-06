package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema */
abstract class g0 {
    private static final g0 a = new b();
    private static final g0 b = new c();

    /* compiled from: ListFieldSchema */
    private static final class b extends g0 {
        private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j2) {
            return (List) q1.A(obj, j2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.crypto.tink.shaded.protobuf.e0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.crypto.tink.shaded.protobuf.e0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.crypto.tink.shaded.protobuf.e0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.f0
                if (r1 == 0) goto L_0x0014
                com.google.crypto.tink.shaded.protobuf.e0 r0 = new com.google.crypto.tink.shaded.protobuf.e0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.a1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.a0.i
                if (r1 == 0) goto L_0x0024
                com.google.crypto.tink.shaded.protobuf.a0$i r0 = (com.google.crypto.tink.shaded.protobuf.a0.i) r0
                com.google.crypto.tink.shaded.protobuf.a0$i r6 = r0.w(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.crypto.tink.shaded.protobuf.q1.P(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.crypto.tink.shaded.protobuf.q1.P(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.p1
                if (r1 == 0) goto L_0x0062
                com.google.crypto.tink.shaded.protobuf.e0 r1 = new com.google.crypto.tink.shaded.protobuf.e0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.crypto.tink.shaded.protobuf.p1 r0 = (com.google.crypto.tink.shaded.protobuf.p1) r0
                r1.addAll(r0)
                com.google.crypto.tink.shaded.protobuf.q1.P(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.a1
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.a0.i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.a0$i r1 = (com.google.crypto.tink.shaded.protobuf.a0.i) r1
                boolean r2 = r1.O()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.crypto.tink.shaded.protobuf.a0$i r0 = r1.w(r0)
                com.google.crypto.tink.shaded.protobuf.q1.P(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.g0.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j2) {
            Object obj2;
            List list = (List) q1.A(obj, j2);
            if (list instanceof f0) {
                obj2 = ((f0) list).A();
            } else if (!c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof a1) || !(list instanceof a0.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    a0.i iVar = (a0.i) list;
                    if (iVar.O()) {
                        iVar.t();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            q1.P(obj, j2, obj2);
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j2) {
            List f2 = f(obj2, j2);
            List g2 = g(obj, j2, f2.size());
            int size = g2.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                g2.addAll(f2);
            }
            if (size > 0) {
                f2 = g2;
            }
            q1.P(obj, j2, f2);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j2) {
            return g(obj, j2, 10);
        }
    }

    /* compiled from: ListFieldSchema */
    private static final class c extends g0 {
        private c() {
            super();
        }

        static <E> a0.i<E> f(Object obj, long j2) {
            return (a0.i) q1.A(obj, j2);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j2) {
            f(obj, j2).t();
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j2) {
            a0.i f2 = f(obj, j2);
            a0.i f3 = f(obj2, j2);
            int size = f2.size();
            int size2 = f3.size();
            if (size > 0 && size2 > 0) {
                if (!f2.O()) {
                    f2 = f2.w(size2 + size);
                }
                f2.addAll(f3);
            }
            if (size > 0) {
                f3 = f2;
            }
            q1.P(obj, j2, f3);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j2) {
            a0.i f2 = f(obj, j2);
            if (f2.O()) {
                return f2;
            }
            int size = f2.size();
            a0.i w = f2.w(size == 0 ? 10 : size * 2);
            q1.P(obj, j2, w);
            return w;
        }
    }

    static g0 a() {
        return a;
    }

    static g0 b() {
        return b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j2);

    /* access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j2);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j2);

    private g0() {
    }
}
