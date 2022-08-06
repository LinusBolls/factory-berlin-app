package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema */
final class t0<T> implements g1<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = q1.B();
    private final int[] a;
    private final Object[] b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3809d;

    /* renamed from: e  reason: collision with root package name */
    private final q0 f3810e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3811f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3812g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f3813h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f3814i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f3815j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3816k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3817l;

    /* renamed from: m  reason: collision with root package name */
    private final v0 f3818m;

    /* renamed from: n  reason: collision with root package name */
    private final g0 f3819n;
    private final m1<?, ?> o;
    private final q<?> p;
    private final l0 q;

    /* compiled from: MessageSchema */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.s1$b[] r0 = com.google.crypto.tink.shaded.protobuf.s1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.a.<clinit>():void");
        }
    }

    private t0(int[] iArr, Object[] objArr, int i2, int i3, q0 q0Var, boolean z, boolean z2, int[] iArr2, int i4, int i5, v0 v0Var, g0 g0Var, m1<?, ?> m1Var, q<?> qVar, l0 l0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.f3809d = i3;
        this.f3812g = q0Var instanceof y;
        this.f3813h = z;
        this.f3811f = qVar != null && qVar.e(q0Var);
        this.f3814i = z2;
        this.f3815j = iArr2;
        this.f3816k = i4;
        this.f3817l = i5;
        this.f3818m = v0Var;
        this.f3819n = g0Var;
        this.o = m1Var;
        this.p = qVar;
        this.f3810e = q0Var;
        this.q = l0Var;
    }

    private static <T> int A(T t, long j2) {
        return q1.x(t, j2);
    }

    private static boolean B(int i2) {
        return (i2 & 536870912) != 0;
    }

    private boolean C(T t, int i2) {
        if (this.f3813h) {
            int t0 = t0(i2);
            long V = V(t0);
            switch (s0(t0)) {
                case 0:
                    if (q1.v(t, V) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (q1.w(t, V) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (q1.y(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (q1.y(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (q1.x(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (q1.y(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (q1.x(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return q1.p(t, V);
                case 8:
                    Object A = q1.A(t, V);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof i) {
                        return !i.f3733h.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (q1.A(t, V) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !i.f3733h.equals(q1.A(t, V));
                case 11:
                    if (q1.x(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (q1.x(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (q1.x(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (q1.y(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (q1.x(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (q1.y(t, V) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (q1.A(t, V) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i0 = i0(i2);
            if ((q1.x(t, (long) (i0 & 1048575)) & (1 << (i0 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    private boolean D(T t, int i2, int i3, int i4) {
        if (this.f3813h) {
            return C(t, i2);
        }
        return (i3 & i4) != 0;
    }

    private static boolean E(Object obj, int i2, g1 g1Var) {
        return g1Var.f(q1.A(obj, V(i2)));
    }

    private <N> boolean F(Object obj, int i2, int i3) {
        List list = (List) q1.A(obj, V(i2));
        if (list.isEmpty()) {
            return true;
        }
        g1 v = v(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!v.f(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(T t, int i2, int i3) {
        Map<?, ?> g2 = this.q.g(q1.A(t, V(i2)));
        if (g2.isEmpty()) {
            return true;
        }
        if (this.q.f(u(i3)).c.a() != s1.c.MESSAGE) {
            return true;
        }
        g1<?> g1Var = null;
        for (Object next : g2.values()) {
            if (g1Var == null) {
                g1Var = c1.a().d(next.getClass());
            }
            if (!g1Var.f(next)) {
                return false;
            }
        }
        return true;
    }

    private boolean H(T t, T t2, int i2) {
        long i0 = (long) (i0(i2) & 1048575);
        return q1.x(t, i0) == q1.x(t2, i0);
    }

    private boolean I(T t, int i2, int i3) {
        return q1.x(t, (long) (i0(i3) & 1048575)) == i2;
    }

    private static boolean J(int i2) {
        return (i2 & 268435456) != 0;
    }

    private static List<?> K(Object obj, long j2) {
        return (List) q1.A(obj, j2);
    }

    private static <T> long L(T t, long j2) {
        return q1.y(t, j2);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.u.b<ET>> void M(com.google.crypto.tink.shaded.protobuf.m1<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.q<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.f1 r20, com.google.crypto.tink.shaded.protobuf.p r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.u()     // Catch:{ all -> 0x060f }
            int r3 = r8.g0(r1)     // Catch:{ all -> 0x060f }
            if (r3 >= 0) goto L_0x008c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f3816k
        L_0x001e:
            int r1 = r8.f3817l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f3815j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f3811f     // Catch:{ all -> 0x060f }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.google.crypto.tink.shaded.protobuf.q0 r2 = r8.f3810e     // Catch:{ all -> 0x060f }
            r15 = r18
            java.lang.Object r1 = r15.b(r11, r2, r1)     // Catch:{ all -> 0x060f }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005b
            if (r14 != 0) goto L_0x004c
            com.google.crypto.tink.shaded.protobuf.u r14 = r18.d(r19)     // Catch:{ all -> 0x060f }
        L_0x004c:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x060f }
            goto L_0x000d
        L_0x005b:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0068
            boolean r1 = r20.E()     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0068:
            if (r13 != 0) goto L_0x006e
            java.lang.Object r13 = r9.f(r10)     // Catch:{ all -> 0x060f }
        L_0x006e:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0075:
            int r0 = r8.f3816k
        L_0x0077:
            int r1 = r8.f3817l
            if (r0 >= r1) goto L_0x0086
            int[] r1 = r8.f3815j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0086:
            if (r13 == 0) goto L_0x008b
            r9.o(r10, r13)
        L_0x008b:
            return
        L_0x008c:
            r15 = r18
            int r4 = r8.t0(r3)     // Catch:{ all -> 0x060f }
            int r2 = s0(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            switch(r2) {
                case 0: goto L_0x059b;
                case 1: goto L_0x058b;
                case 2: goto L_0x057b;
                case 3: goto L_0x056b;
                case 4: goto L_0x055b;
                case 5: goto L_0x054b;
                case 6: goto L_0x053b;
                case 7: goto L_0x052b;
                case 8: goto L_0x0523;
                case 9: goto L_0x04ec;
                case 10: goto L_0x04dc;
                case 11: goto L_0x04cc;
                case 12: goto L_0x04a9;
                case 13: goto L_0x0499;
                case 14: goto L_0x0489;
                case 15: goto L_0x0479;
                case 16: goto L_0x0469;
                case 17: goto L_0x0432;
                case 18: goto L_0x0423;
                case 19: goto L_0x0414;
                case 20: goto L_0x0405;
                case 21: goto L_0x03f6;
                case 22: goto L_0x03e7;
                case 23: goto L_0x03d8;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03ba;
                case 26: goto L_0x03b5;
                case 27: goto L_0x03a3;
                case 28: goto L_0x0394;
                case 29: goto L_0x0385;
                case 30: goto L_0x036e;
                case 31: goto L_0x035f;
                case 32: goto L_0x0350;
                case 33: goto L_0x0341;
                case 34: goto L_0x0332;
                case 35: goto L_0x0323;
                case 36: goto L_0x0314;
                case 37: goto L_0x0305;
                case 38: goto L_0x02f6;
                case 39: goto L_0x02e7;
                case 40: goto L_0x02d8;
                case 41: goto L_0x02c9;
                case 42: goto L_0x02ba;
                case 43: goto L_0x02ab;
                case 44: goto L_0x0294;
                case 45: goto L_0x0285;
                case 46: goto L_0x0276;
                case 47: goto L_0x0267;
                case 48: goto L_0x0258;
                case 49: goto L_0x0242;
                case 50: goto L_0x0231;
                case 51: goto L_0x021d;
                case 52: goto L_0x0209;
                case 53: goto L_0x01f5;
                case 54: goto L_0x01e1;
                case 55: goto L_0x01cd;
                case 56: goto L_0x01b9;
                case 57: goto L_0x01a5;
                case 58: goto L_0x0191;
                case 59: goto L_0x0189;
                case 60: goto L_0x0150;
                case 61: goto L_0x0140;
                case 62: goto L_0x012c;
                case 63: goto L_0x0105;
                case 64: goto L_0x00f1;
                case 65: goto L_0x00dd;
                case 66: goto L_0x00c9;
                case 67: goto L_0x00b5;
                case 68: goto L_0x00a1;
                default: goto L_0x0099;
            }     // Catch:{ InvalidWireTypeException -> 0x05c8 }
        L_0x0099:
            if (r13 != 0) goto L_0x05ab
            java.lang.Object r13 = r17.n()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x05ab
        L_0x00a1:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r2 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.b(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00b5:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.l()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00c9:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.j()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00dd:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.w()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00f1:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.G()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0105:
            int r2 = r20.d()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.a0$e r5 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x011c
            boolean r5 = r5.a(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x0116
            goto L_0x011c
        L_0x0116:
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.i1.L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x011c:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x012c:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.B()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0140:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.i r2 = r20.z()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0150:
            boolean r2 = r8.I(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r2 == 0) goto L_0x0172
            long r5 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.q1.A(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r5 = r0.e(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.a0.h(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x0184
        L_0x0172:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r2 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.e(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
        L_0x0184:
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0189:
            r8.l0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0191:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            boolean r2 = r20.t()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01a5:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.r()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01b9:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.h()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01cd:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.C()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01e1:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.f()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01f5:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.N()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0209:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            float r2 = r20.F()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x021d:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            double r6 = r20.D()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.p0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0231:
            java.lang.Object r4 = r8.u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.N(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0242:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r6 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.j0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0258:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.k(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0267:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.c(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0276:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.L(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0285:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.i(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0294:
            com.google.crypto.tink.shaded.protobuf.g0 r2 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.R(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.a0$e r3 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.i1.A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02ab:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.m(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02ba:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.o(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02c9:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.g(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02d8:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.P(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02e7:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.Q(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02f6:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.x(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0305:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.K(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0314:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.A(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0323:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.J(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0332:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.k(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0341:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.c(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0350:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.L(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x035f:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.i(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x036e:
            com.google.crypto.tink.shaded.protobuf.g0 r2 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.R(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.a0$e r3 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.i1.A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0385:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.m(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0394:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.H(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03a3:
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.k0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03b5:
            r8.m0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03ba:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.o(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03c9:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.g(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03d8:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.P(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03e7:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.Q(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03f6:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.x(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0405:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.K(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0414:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.A(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0423:
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r8.f3819n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.J(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0432:
            boolean r1 = r8.C(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r1 == 0) goto L_0x0455
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.q1.A(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r2 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.b(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.a0.h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0455:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r4 = r0.b(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0469:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.l()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0479:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.j()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0489:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.w()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0499:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.G()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04a9:
            int r2 = r20.d()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.a0$e r5 = r8.t(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x04c0
            boolean r5 = r5.a(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x04ba
            goto L_0x04c0
        L_0x04ba:
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.i1.L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04c0:
            long r4 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.N(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04cc:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.B()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04dc:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.i r4 = r20.z()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04ec:
            boolean r1 = r8.C(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r1 == 0) goto L_0x050f
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.q1.A(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r2 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.e(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.a0.h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x050f:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r8.v(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r4 = r0.e(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0523:
            r8.l0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x052b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            boolean r4 = r20.t()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.F(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x053b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.r()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x054b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.h()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x055b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.C()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x056b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.f()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x057b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.N()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x058b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            float r4 = r20.F()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.M(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x059b:
            long r1 = V(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            double r4 = r20.D()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.crypto.tink.shaded.protobuf.q1.L(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.o0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x05ab:
            boolean r1 = r9.m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f3816k
        L_0x05b3:
            int r1 = r8.f3817l
            if (r0 >= r1) goto L_0x05c2
            int[] r1 = r8.f3815j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b3
        L_0x05c2:
            if (r13 == 0) goto L_0x05c7
            r9.o(r10, r13)
        L_0x05c7:
            return
        L_0x05c8:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x05eb
            boolean r1 = r20.E()     // Catch:{ all -> 0x060f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f3816k
        L_0x05d6:
            int r1 = r8.f3817l
            if (r0 >= r1) goto L_0x05e5
            int[] r1 = r8.f3815j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d6
        L_0x05e5:
            if (r13 == 0) goto L_0x05ea
            r9.o(r10, r13)
        L_0x05ea:
            return
        L_0x05eb:
            if (r13 != 0) goto L_0x05f2
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x060f }
            r13 = r1
        L_0x05f2:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x060f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f3816k
        L_0x05fa:
            int r1 = r8.f3817l
            if (r0 >= r1) goto L_0x0609
            int[] r1 = r8.f3815j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fa
        L_0x0609:
            if (r13 == 0) goto L_0x060e
            r9.o(r10, r13)
        L_0x060e:
            return
        L_0x060f:
            r0 = move-exception
            int r1 = r8.f3816k
        L_0x0612:
            int r2 = r8.f3817l
            if (r1 >= r2) goto L_0x0621
            int[] r2 = r8.f3815j
            r2 = r2[r1]
            java.lang.Object r13 = r8.q(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0612
        L_0x0621:
            if (r13 == 0) goto L_0x0626
            r9.o(r10, r13)
        L_0x0626:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.M(com.google.crypto.tink.shaded.protobuf.m1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    private final <K, V> void N(Object obj, int i2, Object obj2, p pVar, f1 f1Var) {
        long V = V(t0(i2));
        Object A = q1.A(obj, V);
        if (A == null) {
            A = this.q.b(obj2);
            q1.P(obj, V, A);
        } else if (this.q.d(A)) {
            Object b2 = this.q.b(obj2);
            this.q.a(b2, A);
            q1.P(obj, V, b2);
            A = b2;
        }
        f1Var.I(this.q.h(A), this.q.f(obj2), pVar);
    }

    private void O(T t, T t2, int i2) {
        long V = V(t0(i2));
        if (C(t2, i2)) {
            Object A = q1.A(t, V);
            Object A2 = q1.A(t2, V);
            if (A != null && A2 != null) {
                q1.P(t, V, a0.h(A, A2));
                o0(t, i2);
            } else if (A2 != null) {
                q1.P(t, V, A2);
                o0(t, i2);
            }
        }
    }

    private void P(T t, T t2, int i2) {
        int t0 = t0(i2);
        int U = U(i2);
        long V = V(t0);
        if (I(t2, U, i2)) {
            Object A = q1.A(t, V);
            Object A2 = q1.A(t2, V);
            if (A != null && A2 != null) {
                q1.P(t, V, a0.h(A, A2));
                p0(t, U, i2);
            } else if (A2 != null) {
                q1.P(t, V, A2);
                p0(t, U, i2);
            }
        }
    }

    private void Q(T t, T t2, int i2) {
        int t0 = t0(i2);
        long V = V(t0);
        int U = U(i2);
        switch (s0(t0)) {
            case 0:
                if (C(t2, i2)) {
                    q1.L(t, V, q1.v(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 1:
                if (C(t2, i2)) {
                    q1.M(t, V, q1.w(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 2:
                if (C(t2, i2)) {
                    q1.O(t, V, q1.y(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 3:
                if (C(t2, i2)) {
                    q1.O(t, V, q1.y(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 4:
                if (C(t2, i2)) {
                    q1.N(t, V, q1.x(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 5:
                if (C(t2, i2)) {
                    q1.O(t, V, q1.y(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 6:
                if (C(t2, i2)) {
                    q1.N(t, V, q1.x(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 7:
                if (C(t2, i2)) {
                    q1.F(t, V, q1.p(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 8:
                if (C(t2, i2)) {
                    q1.P(t, V, q1.A(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 9:
                O(t, t2, i2);
                return;
            case 10:
                if (C(t2, i2)) {
                    q1.P(t, V, q1.A(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 11:
                if (C(t2, i2)) {
                    q1.N(t, V, q1.x(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 12:
                if (C(t2, i2)) {
                    q1.N(t, V, q1.x(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 13:
                if (C(t2, i2)) {
                    q1.N(t, V, q1.x(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 14:
                if (C(t2, i2)) {
                    q1.O(t, V, q1.y(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 15:
                if (C(t2, i2)) {
                    q1.N(t, V, q1.x(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 16:
                if (C(t2, i2)) {
                    q1.O(t, V, q1.y(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 17:
                O(t, t2, i2);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f3819n.d(t, t2, V);
                return;
            case 50:
                i1.F(this.q, t, t2, V);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (I(t2, U, i2)) {
                    q1.P(t, V, q1.A(t2, V));
                    p0(t, U, i2);
                    return;
                }
                return;
            case 60:
                P(t, t2, i2);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (I(t2, U, i2)) {
                    q1.P(t, V, q1.A(t2, V));
                    p0(t, U, i2);
                    return;
                }
                return;
            case 68:
                P(t, t2, i2);
                return;
            default:
                return;
        }
    }

    static <T> t0<T> R(Class<T> cls, o0 o0Var, v0 v0Var, g0 g0Var, m1<?, ?> m1Var, q<?> qVar, l0 l0Var) {
        if (o0Var instanceof e1) {
            return T((e1) o0Var, v0Var, g0Var, m1Var, qVar, l0Var);
        }
        return S((k1) o0Var, v0Var, g0Var, m1Var, qVar, l0Var);
    }

    static <T> t0<T> S(k1 k1Var, v0 v0Var, g0 g0Var, m1<?, ?> m1Var, q<?> qVar, l0 l0Var) {
        int i2;
        int i3;
        int i4;
        boolean z = k1Var.b() == b1.PROTO3;
        t[] e2 = k1Var.e();
        if (e2.length == 0) {
            i3 = 0;
            i2 = 0;
        } else {
            i3 = e2[0].i();
            i2 = e2[e2.length - 1].i();
        }
        int length = e2.length;
        int[] iArr = new int[(length * 3)];
        Object[] objArr = new Object[(length * 2)];
        int i5 = 0;
        int i6 = 0;
        for (t tVar : e2) {
            if (tVar.p() == v.MAP) {
                i5++;
            } else if (tVar.p().a() >= 18 && tVar.p().a() <= 49) {
                i6++;
            }
        }
        int[] iArr2 = null;
        int[] iArr3 = i5 > 0 ? new int[i5] : null;
        if (i6 > 0) {
            iArr2 = new int[i6];
        }
        int[] d2 = k1Var.d();
        if (d2 == null) {
            d2 = r;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < e2.length) {
            t tVar2 = e2[i7];
            int i12 = tVar2.i();
            r0(tVar2, iArr, i8, z, objArr);
            if (i9 < d2.length && d2[i9] == i12) {
                d2[i9] = i8;
                i9++;
            }
            if (tVar2.p() == v.MAP) {
                iArr3[i10] = i8;
                i10++;
            } else if (tVar2.p().a() >= 18 && tVar2.p().a() <= 49) {
                i4 = i8;
                iArr2[i11] = (int) q1.E(tVar2.h());
                i11++;
                i7++;
                i8 = i4 + 3;
            }
            i4 = i8;
            i7++;
            i8 = i4 + 3;
        }
        if (iArr3 == null) {
            iArr3 = r;
        }
        if (iArr2 == null) {
            iArr2 = r;
        }
        int[] iArr4 = new int[(d2.length + iArr3.length + iArr2.length)];
        System.arraycopy(d2, 0, iArr4, 0, d2.length);
        System.arraycopy(iArr3, 0, iArr4, d2.length, iArr3.length);
        System.arraycopy(iArr2, 0, iArr4, d2.length + iArr3.length, iArr2.length);
        return new t0(iArr, objArr, i3, i2, k1Var.c(), z, true, iArr4, d2.length, d2.length + iArr3.length, v0Var, g0Var, m1Var, qVar, l0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.crypto.tink.shaded.protobuf.t0<T> T(com.google.crypto.tink.shaded.protobuf.e1 r36, com.google.crypto.tink.shaded.protobuf.v0 r37, com.google.crypto.tink.shaded.protobuf.g0 r38, com.google.crypto.tink.shaded.protobuf.m1<?, ?> r39, com.google.crypto.tink.shaded.protobuf.q<?> r40, com.google.crypto.tink.shaded.protobuf.l0 r41) {
        /*
            com.google.crypto.tink.shaded.protobuf.b1 r0 = r36.b()
            com.google.crypto.tink.shaded.protobuf.b1 r1 = com.google.crypto.tink.shaded.protobuf.b1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r36.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = r
            r13 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = s
            java.lang.Object[] r18 = r36.d()
            com.google.crypto.tink.shaded.protobuf.q0 r19 = r36.c()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e6
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b1
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = n0(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r7 = (int) r6
            int r15 = r15 + 1
            r6 = r18[r15]
            boolean r9 = r6 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x029d
        L_0x0295:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = n0(r3, r6)
            r18[r15] = r6
        L_0x029d:
            r9 = r7
            long r6 = r5.objectFieldOffset(r6)
            int r7 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r4 = r7
            r7 = r9
            r9 = r10
            r6 = r14
            r14 = r33
            r15 = 0
            goto L_0x03a9
        L_0x02b1:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = n0(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0326
            r14 = 17
            if (r10 != r14) goto L_0x02c9
            goto L_0x0326
        L_0x02c9:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r9) goto L_0x02d0
            goto L_0x0316
        L_0x02d0:
            r14 = 12
            if (r10 == r14) goto L_0x0305
            r14 = 30
            if (r10 == r14) goto L_0x0305
            r14 = 44
            if (r10 != r14) goto L_0x02dd
            goto L_0x0305
        L_0x02dd:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fe
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0332
        L_0x02fe:
            r23 = r14
            r6 = r27
            goto L_0x0332
        L_0x0303:
            r9 = 1
            goto L_0x0332
        L_0x0305:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0332
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0322
        L_0x0316:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0322:
            r14 = r10
            r6 = r20
            goto L_0x0333
        L_0x0326:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0332:
            r14 = r10
        L_0x0333:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0392
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038c
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0368
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0363
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0351
        L_0x0363:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0368:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0379
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0381
        L_0x0379:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = n0(r3, r10)
            r18[r19] = r10
        L_0x0381:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r4 = (int) r3
            int r15 = r15 % 32
            goto L_0x039b
        L_0x038c:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0398
        L_0x0392:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0398:
            r14 = r15
            r4 = 0
            r15 = 0
        L_0x039b:
            r3 = 18
            if (r9 < r3) goto L_0x03a9
            r3 = 49
            if (r9 > r3) goto L_0x03a9
            int r3 = r24 + 1
            r13[r24] = r7
            r24 = r3
        L_0x03a9:
            int r3 = r22 + 1
            r11[r22] = r34
            int r10 = r3 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r1 = 0
        L_0x03c1:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r7
            r11[r3] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r4
            r11[r10] = r1
            r7 = r14
            r3 = r19
            r4 = r22
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r14 = r6
            r6 = r11
            r11 = r25
            r0 = r32
            goto L_0x0196
        L_0x03e6:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            com.google.crypto.tink.shaded.protobuf.t0 r0 = new com.google.crypto.tink.shaded.protobuf.t0
            com.google.crypto.tink.shaded.protobuf.q0 r9 = r36.c()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.T(com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.v0, com.google.crypto.tink.shaded.protobuf.g0, com.google.crypto.tink.shaded.protobuf.m1, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.l0):com.google.crypto.tink.shaded.protobuf.t0");
    }

    private int U(int i2) {
        return this.a[i2];
    }

    private static long V(int i2) {
        return (long) (i2 & 1048575);
    }

    private static <T> boolean W(T t, long j2) {
        return ((Boolean) q1.A(t, j2)).booleanValue();
    }

    private static <T> double X(T t, long j2) {
        return ((Double) q1.A(t, j2)).doubleValue();
    }

    private static <T> float Y(T t, long j2) {
        return ((Float) q1.A(t, j2)).floatValue();
    }

    private static <T> int Z(T t, long j2) {
        return ((Integer) q1.A(t, j2)).intValue();
    }

    private static <T> long a0(T t, long j2) {
        return ((Long) q1.A(t, j2)).longValue();
    }

    private <K, V> int b0(T t, byte[] bArr, int i2, int i3, int i4, long j2, e.b bVar) {
        T t2 = t;
        long j3 = j2;
        Unsafe unsafe = s;
        int i5 = i4;
        Object u = u(i4);
        Object object = unsafe.getObject(t, j3);
        if (this.q.d(object)) {
            Object b2 = this.q.b(u);
            this.q.a(b2, object);
            unsafe.putObject(t, j3, b2);
            object = b2;
        }
        return m(bArr, i2, i3, this.q.f(u), this.q.h(object), bVar);
    }

    private int c0(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, e.b bVar) {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i10 = i2;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        long j3 = j2;
        int i14 = i9;
        e.b bVar2 = bVar;
        Unsafe unsafe = s;
        long j4 = (long) (this.a[i14 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(t2, j3, Double.valueOf(e.d(bArr, i2)));
                    int i15 = i10 + 8;
                    unsafe.putInt(t2, j4, i12);
                    return i15;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(t2, j3, Float.valueOf(e.l(bArr, i2)));
                    int i16 = i10 + 4;
                    unsafe.putInt(t2, j4, i12);
                    return i16;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int L = e.L(bArr2, i10, bVar2);
                    unsafe.putObject(t2, j3, Long.valueOf(bVar2.b));
                    unsafe.putInt(t2, j4, i12);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int I = e.I(bArr2, i10, bVar2);
                    unsafe.putObject(t2, j3, Integer.valueOf(bVar2.a));
                    unsafe.putInt(t2, j4, i12);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(t2, j3, Long.valueOf(e.j(bArr, i2)));
                    int i17 = i10 + 8;
                    unsafe.putInt(t2, j4, i12);
                    return i17;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(t2, j3, Integer.valueOf(e.h(bArr, i2)));
                    int i18 = i10 + 4;
                    unsafe.putInt(t2, j4, i12);
                    return i18;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int L2 = e.L(bArr2, i10, bVar2);
                    unsafe.putObject(t2, j3, Boolean.valueOf(bVar2.b != 0));
                    unsafe.putInt(t2, j4, i12);
                    return L2;
                }
                break;
            case 59:
                if (i13 == 2) {
                    int I2 = e.I(bArr2, i10, bVar2);
                    int i19 = bVar2.a;
                    if (i19 == 0) {
                        unsafe.putObject(t2, j3, "");
                    } else if ((i7 & 536870912) == 0 || r1.n(bArr2, I2, I2 + i19)) {
                        unsafe.putObject(t2, j3, new String(bArr2, I2, i19, a0.a));
                        I2 += i19;
                    } else {
                        throw InvalidProtocolBufferException.c();
                    }
                    unsafe.putInt(t2, j4, i12);
                    return I2;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int p2 = e.p(v(i14), bArr2, i10, i3, bVar2);
                    Object object = unsafe.getInt(t2, j4) == i12 ? unsafe.getObject(t2, j3) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j3, bVar2.c);
                    } else {
                        unsafe.putObject(t2, j3, a0.h(object, bVar2.c));
                    }
                    unsafe.putInt(t2, j4, i12);
                    return p2;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int b2 = e.b(bArr2, i10, bVar2);
                    unsafe.putObject(t2, j3, bVar2.c);
                    unsafe.putInt(t2, j4, i12);
                    return b2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int I3 = e.I(bArr2, i10, bVar2);
                    int i20 = bVar2.a;
                    a0.e t3 = t(i14);
                    if (t3 == null || t3.a(i20)) {
                        unsafe.putObject(t2, j3, Integer.valueOf(i20));
                        unsafe.putInt(t2, j4, i12);
                    } else {
                        w(t).n(i11, Long.valueOf((long) i20));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i13 == 0) {
                    int I4 = e.I(bArr2, i10, bVar2);
                    unsafe.putObject(t2, j3, Integer.valueOf(j.b(bVar2.a)));
                    unsafe.putInt(t2, j4, i12);
                    return I4;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int L3 = e.L(bArr2, i10, bVar2);
                    unsafe.putObject(t2, j3, Long.valueOf(j.c(bVar2.b)));
                    unsafe.putInt(t2, j4, i12);
                    return L3;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int n2 = e.n(v(i14), bArr, i2, i3, (i11 & -8) | 4, bVar);
                    Object object2 = unsafe.getInt(t2, j4) == i12 ? unsafe.getObject(t2, j3) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j3, bVar2.c);
                    } else {
                        unsafe.putObject(t2, j3, a0.h(object2, bVar2.c));
                    }
                    unsafe.putInt(t2, j4, i12);
                    return n2;
                }
                break;
        }
        return i10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0105, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0155, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01dc, code lost:
        if (r0 != r15) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020a, code lost:
        if (r0 != r15) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0229, code lost:
        if (r0 != r15) goto L_0x023d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int e0(T r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.e.b r32) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0013:
            if (r0 >= r13) goto L_0x0250
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0025
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r0, r12, r3, r11)
            int r3 = r11.a
            r8 = r0
            r17 = r3
            goto L_0x0028
        L_0x0025:
            r17 = r0
            r8 = r3
        L_0x0028:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0035
            int r2 = r2 / 3
            int r0 = r15.h0(r7, r2)
            goto L_0x0039
        L_0x0035:
            int r0 = r15.g0(r7)
        L_0x0039:
            r4 = r0
            if (r4 != r10) goto L_0x0047
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x022d
        L_0x0047:
            int[] r0 = r15.a
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = s0(r5)
            long r1 = V(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0161
            r0 = 1
            switch(r3) {
                case 0: goto L_0x0148;
                case 1: goto L_0x0139;
                case 2: goto L_0x0127;
                case 3: goto L_0x0127;
                case 4: goto L_0x0119;
                case 5: goto L_0x0109;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00e2;
                case 8: goto L_0x00cb;
                case 9: goto L_0x00aa;
                case 10: goto L_0x009d;
                case 11: goto L_0x0119;
                case 12: goto L_0x008e;
                case 13: goto L_0x00f8;
                case 14: goto L_0x0109;
                case 15: goto L_0x007b;
                case 16: goto L_0x0060;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x019e
        L_0x0060:
            if (r6 != 0) goto L_0x019e
            int r6 = com.google.crypto.tink.shaded.protobuf.e.L(r12, r8, r11)
            r19 = r1
            long r0 = r11.b
            long r21 = com.google.crypto.tink.shaded.protobuf.j.c(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x0137
        L_0x007b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0159
            int r0 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r8, r11)
            int r1 = r11.a
            int r1 = com.google.crypto.tink.shaded.protobuf.j.b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0155
        L_0x008e:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0159
            int r0 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r8, r11)
            int r1 = r11.a
            r9.putInt(r14, r2, r1)
            goto L_0x0155
        L_0x009d:
            r2 = r1
            if (r6 != r10) goto L_0x019e
            int r0 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r8, r11)
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            goto L_0x0105
        L_0x00aa:
            r2 = r1
            if (r6 != r10) goto L_0x019e
            com.google.crypto.tink.shaded.protobuf.g1 r0 = r15.v(r4)
            int r0 = com.google.crypto.tink.shaded.protobuf.e.p(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c1
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            goto L_0x0105
        L_0x00c1:
            java.lang.Object r5 = r11.c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.a0.h(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0105
        L_0x00cb:
            r2 = r1
            if (r6 != r10) goto L_0x019e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00d8
            int r0 = com.google.crypto.tink.shaded.protobuf.e.C(r12, r8, r11)
            goto L_0x00dc
        L_0x00d8:
            int r0 = com.google.crypto.tink.shaded.protobuf.e.F(r12, r8, r11)
        L_0x00dc:
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            goto L_0x0105
        L_0x00e2:
            r2 = r1
            if (r6 != 0) goto L_0x019e
            int r1 = com.google.crypto.tink.shaded.protobuf.e.L(r12, r8, r11)
            long r5 = r11.b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            com.google.crypto.tink.shaded.protobuf.q1.F(r14, r2, r0)
            r0 = r1
            goto L_0x0105
        L_0x00f8:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x019e
            int r0 = com.google.crypto.tink.shaded.protobuf.e.h(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x0105:
            r2 = r4
            r1 = r7
            goto L_0x024d
        L_0x0109:
            r2 = r1
            if (r6 != r0) goto L_0x019e
            long r5 = com.google.crypto.tink.shaded.protobuf.e.j(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0153
        L_0x0119:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0159
            int r0 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r8, r11)
            int r1 = r11.a
            r9.putInt(r14, r2, r1)
            goto L_0x0155
        L_0x0127:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0159
            int r6 = com.google.crypto.tink.shaded.protobuf.e.L(r12, r8, r11)
            long r4 = r11.b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x0137:
            r0 = r6
            goto L_0x0155
        L_0x0139:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x0159
            float r0 = com.google.crypto.tink.shaded.protobuf.e.l(r12, r8)
            com.google.crypto.tink.shaded.protobuf.q1.M(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x0155
        L_0x0148:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x0159
            double r0 = com.google.crypto.tink.shaded.protobuf.e.d(r12, r8)
            com.google.crypto.tink.shaded.protobuf.q1.L(r14, r2, r0)
        L_0x0153:
            int r0 = r8 + 8
        L_0x0155:
            r1 = r7
            r2 = r10
            goto L_0x024d
        L_0x0159:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01a5
        L_0x0161:
            r0 = 27
            if (r3 != r0) goto L_0x01a9
            if (r6 != r10) goto L_0x019e
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.crypto.tink.shaded.protobuf.a0$i r0 = (com.google.crypto.tink.shaded.protobuf.a0.i) r0
            boolean r3 = r0.O()
            if (r3 != 0) goto L_0x0185
            int r3 = r0.size()
            if (r3 != 0) goto L_0x017c
            r3 = 10
            goto L_0x017e
        L_0x017c:
            int r3 = r3 * 2
        L_0x017e:
            com.google.crypto.tink.shaded.protobuf.a0$i r0 = r0.w(r3)
            r9.putObject(r14, r1, r0)
        L_0x0185:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.g1 r0 = r15.v(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.e.q(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x024d
        L_0x019e:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01a5:
            r26 = -1
            goto L_0x020d
        L_0x01a9:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e0
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x022c
        L_0x01de:
            goto L_0x023d
        L_0x01e0:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x020f
            r7 = r30
            if (r7 != r10) goto L_0x020d
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.b0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x022c
            goto L_0x01de
        L_0x020d:
            r2 = r15
            goto L_0x022d
        L_0x020f:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x022c
            goto L_0x01de
        L_0x022c:
            r2 = r0
        L_0x022d:
            com.google.crypto.tink.shaded.protobuf.n1 r4 = w(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.e.G(r0, r1, r2, r3, r4, r5)
        L_0x023d:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x024d:
            r10 = -1
            goto L_0x0013
        L_0x0250:
            r1 = r13
            if (r0 != r1) goto L_0x0254
            return r0
        L_0x0254:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.e0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private int f0(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, e.b bVar) {
        int i9;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i10 = i2;
        int i11 = i6;
        int i12 = i7;
        long j4 = j3;
        e.b bVar2 = bVar;
        a0.i iVar = (a0.i) s.getObject(t, j4);
        if (!iVar.O()) {
            int size = iVar.size();
            iVar = iVar.w(size == 0 ? 10 : size * 2);
            s.putObject(t, j4, iVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return e.s(bArr, i2, iVar, bVar2);
                }
                if (i11 == 1) {
                    return e.e(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i11 == 2) {
                    return e.v(bArr, i2, iVar, bVar2);
                }
                if (i11 == 5) {
                    return e.m(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return e.z(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return e.M(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return e.y(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return e.J(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return e.u(bArr, i2, iVar, bVar2);
                }
                if (i11 == 1) {
                    return e.k(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return e.t(bArr, i2, iVar, bVar2);
                }
                if (i11 == 5) {
                    return e.i(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i11 == 2) {
                    return e.r(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return e.a(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 26:
                if (i11 == 2) {
                    if ((j2 & 536870912) == 0) {
                        return e.D(i4, bArr, i2, i3, iVar, bVar);
                    }
                    return e.E(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 27:
                if (i11 == 2) {
                    return e.q(v(i12), i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 28:
                if (i11 == 2) {
                    return e.c(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i11 == 2) {
                    i9 = e.y(bArr, i2, iVar, bVar2);
                } else if (i11 == 0) {
                    i9 = e.J(i4, bArr, i2, i3, iVar, bVar);
                }
                y yVar = (y) t2;
                n1 n1Var = yVar.unknownFields;
                if (n1Var == n1.e()) {
                    n1Var = null;
                }
                n1 n1Var2 = (n1) i1.A(i5, iVar, t(i12), n1Var, this.o);
                if (n1Var2 != null) {
                    yVar.unknownFields = n1Var2;
                }
                return i9;
            case 33:
            case 47:
                if (i11 == 2) {
                    return e.w(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return e.A(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i11 == 2) {
                    return e.x(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return e.B(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 49:
                if (i11 == 3) {
                    return e.o(v(i12), i4, bArr, i2, i3, iVar, bVar);
                }
                break;
        }
        return i10;
    }

    private int g0(int i2) {
        if (i2 < this.c || i2 > this.f3809d) {
            return -1;
        }
        return q0(i2, 0);
    }

    private int h0(int i2, int i3) {
        if (i2 < this.c || i2 > this.f3809d) {
            return -1;
        }
        return q0(i2, i3);
    }

    private int i0(int i2) {
        return this.a[i2 + 2];
    }

    private <E> void j0(Object obj, long j2, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.M(this.f3819n.e(obj, j2), g1Var, pVar);
    }

    private boolean k(T t, T t2, int i2) {
        return C(t, i2) == C(t2, i2);
    }

    private <E> void k0(Object obj, int i2, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.q(this.f3819n.e(obj, V(i2)), g1Var, pVar);
    }

    private static <T> boolean l(T t, long j2) {
        return q1.p(t, j2);
    }

    private void l0(Object obj, int i2, f1 f1Var) {
        if (B(i2)) {
            q1.P(obj, V(i2), f1Var.O());
        } else if (this.f3812g) {
            q1.P(obj, V(i2), f1Var.p());
        } else {
            q1.P(obj, V(i2), f1Var.z());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <K, V> int m(byte[] r15, int r16, int r17, com.google.crypto.tink.shaded.protobuf.j0.a<K, V> r18, java.util.Map<K, V> r19, com.google.crypto.tink.shaded.protobuf.e.b r20) {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.crypto.tink.shaded.protobuf.e.I(r15, r0, r10)
            int r1 = r10.a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.b
            V r2 = r9.f3752d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r0, r15, r1, r10)
            int r1 = r10.a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.crypto.tink.shaded.protobuf.s1$b r1 = r9.c
            int r1 = r1.f()
            if (r3 != r1) goto L_0x006f
            com.google.crypto.tink.shaded.protobuf.s1$b r4 = r9.c
            V r0 = r9.f3752d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.c
            goto L_0x001d
        L_0x0057:
            com.google.crypto.tink.shaded.protobuf.s1$b r1 = r9.a
            int r1 = r1.f()
            if (r3 != r1) goto L_0x006f
            com.google.crypto.tink.shaded.protobuf.s1$b r4 = r9.a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.c
            goto L_0x001d
        L_0x006f:
            int r0 = com.google.crypto.tink.shaded.protobuf.e.N(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r0
        L_0x0081:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.m(byte[], int, int, com.google.crypto.tink.shaded.protobuf.j0$a, java.util.Map, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private void m0(Object obj, int i2, f1 f1Var) {
        if (B(i2)) {
            f1Var.y(this.f3819n.e(obj, V(i2)));
        } else {
            f1Var.v(this.f3819n.e(obj, V(i2)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int n(byte[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.s1.b r5, java.lang.Class<?> r6, com.google.crypto.tink.shaded.protobuf.e.b r7) {
        /*
            r1 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.t0.a.a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.L(r2, r3, r7)
            long r3 = r7.b
            long r3 = com.google.crypto.tink.shaded.protobuf.j.c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.I(r2, r3, r7)
            int r3 = r7.a
            int r3 = com.google.crypto.tink.shaded.protobuf.j.b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.c = r3
            goto L_0x00ae
        L_0x003d:
            com.google.crypto.tink.shaded.protobuf.c1 r5 = com.google.crypto.tink.shaded.protobuf.c1.a()
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r5.d(r6)
            int r2 = com.google.crypto.tink.shaded.protobuf.e.p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.L(r2, r3, r7)
            long r3 = r7.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.I(r2, r3, r7)
            int r3 = r7.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = com.google.crypto.tink.shaded.protobuf.e.l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.c = r2
            goto L_0x0084
        L_0x006f:
            long r4 = com.google.crypto.tink.shaded.protobuf.e.j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.c = r2
            goto L_0x0091
        L_0x007a:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.c = r2
        L_0x0084:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0087:
            double r4 = com.google.crypto.tink.shaded.protobuf.e.d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.c = r2
        L_0x0091:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x0094:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = com.google.crypto.tink.shaded.protobuf.e.L(r2, r3, r7)
            long r3 = r7.b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.n(byte[], int, int, com.google.crypto.tink.shaded.protobuf.s1$b, java.lang.Class, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private static Field n0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double o(T t, long j2) {
        return q1.v(t, j2);
    }

    private void o0(T t, int i2) {
        if (!this.f3813h) {
            int i0 = i0(i2);
            long j2 = (long) (i0 & 1048575);
            q1.N(t, j2, q1.x(t, j2) | (1 << (i0 >>> 20)));
        }
    }

    private boolean p(T t, T t2, int i2) {
        int t0 = t0(i2);
        long V = V(t0);
        switch (s0(t0)) {
            case 0:
                if (!k(t, t2, i2) || Double.doubleToLongBits(q1.v(t, V)) != Double.doubleToLongBits(q1.v(t2, V))) {
                    return false;
                }
                return true;
            case 1:
                if (!k(t, t2, i2) || Float.floatToIntBits(q1.w(t, V)) != Float.floatToIntBits(q1.w(t2, V))) {
                    return false;
                }
                return true;
            case 2:
                if (!k(t, t2, i2) || q1.y(t, V) != q1.y(t2, V)) {
                    return false;
                }
                return true;
            case 3:
                if (!k(t, t2, i2) || q1.y(t, V) != q1.y(t2, V)) {
                    return false;
                }
                return true;
            case 4:
                if (!k(t, t2, i2) || q1.x(t, V) != q1.x(t2, V)) {
                    return false;
                }
                return true;
            case 5:
                if (!k(t, t2, i2) || q1.y(t, V) != q1.y(t2, V)) {
                    return false;
                }
                return true;
            case 6:
                if (!k(t, t2, i2) || q1.x(t, V) != q1.x(t2, V)) {
                    return false;
                }
                return true;
            case 7:
                if (!k(t, t2, i2) || q1.p(t, V) != q1.p(t2, V)) {
                    return false;
                }
                return true;
            case 8:
                if (!k(t, t2, i2) || !i1.K(q1.A(t, V), q1.A(t2, V))) {
                    return false;
                }
                return true;
            case 9:
                if (!k(t, t2, i2) || !i1.K(q1.A(t, V), q1.A(t2, V))) {
                    return false;
                }
                return true;
            case 10:
                if (!k(t, t2, i2) || !i1.K(q1.A(t, V), q1.A(t2, V))) {
                    return false;
                }
                return true;
            case 11:
                if (!k(t, t2, i2) || q1.x(t, V) != q1.x(t2, V)) {
                    return false;
                }
                return true;
            case 12:
                if (!k(t, t2, i2) || q1.x(t, V) != q1.x(t2, V)) {
                    return false;
                }
                return true;
            case 13:
                if (!k(t, t2, i2) || q1.x(t, V) != q1.x(t2, V)) {
                    return false;
                }
                return true;
            case 14:
                if (!k(t, t2, i2) || q1.y(t, V) != q1.y(t2, V)) {
                    return false;
                }
                return true;
            case 15:
                if (!k(t, t2, i2) || q1.x(t, V) != q1.x(t2, V)) {
                    return false;
                }
                return true;
            case 16:
                if (!k(t, t2, i2) || q1.y(t, V) != q1.y(t2, V)) {
                    return false;
                }
                return true;
            case 17:
                if (!k(t, t2, i2) || !i1.K(q1.A(t, V), q1.A(t2, V))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return i1.K(q1.A(t, V), q1.A(t2, V));
            case 50:
                return i1.K(q1.A(t, V), q1.A(t2, V));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!H(t, t2, i2) || !i1.K(q1.A(t, V), q1.A(t2, V))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private void p0(T t, int i2, int i3) {
        q1.N(t, (long) (i0(i3) & 1048575), i2);
    }

    private final <UT, UB> UB q(Object obj, int i2, UB ub, m1<UT, UB> m1Var) {
        a0.e t;
        int U = U(i2);
        Object A = q1.A(obj, V(t0(i2)));
        if (A == null || (t = t(i2)) == null) {
            return ub;
        }
        return r(i2, U, this.q.h(A), t, ub, m1Var);
    }

    private int q0(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int U = U(i5);
            if (i2 == U) {
                return i5;
            }
            if (i2 < U) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB r(int i2, int i3, Map<K, V> map, a0.e eVar, UB ub, m1<UT, UB> m1Var) {
        j0.a<?, ?> f2 = this.q.f(u(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = m1Var.n();
                }
                i.g o2 = i.o(j0.b(f2, next.getKey(), next.getValue()));
                try {
                    j0.d(o2.b(), f2, next.getKey(), next.getValue());
                    m1Var.d(ub, i3, o2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void r0(com.google.crypto.tink.shaded.protobuf.t r8, int[] r9, int r10, boolean r11, java.lang.Object[] r12) {
        /*
            com.google.crypto.tink.shaded.protobuf.y0 r0 = r8.l()
            r1 = 0
            if (r0 == 0) goto L_0x0026
            com.google.crypto.tink.shaded.protobuf.v r11 = r8.p()
            int r11 = r11.a()
            int r11 = r11 + 51
            java.lang.reflect.Field r2 = r0.b()
            long r2 = com.google.crypto.tink.shaded.protobuf.q1.E(r2)
            int r3 = (int) r2
            java.lang.reflect.Field r0 = r0.a()
            long r4 = com.google.crypto.tink.shaded.protobuf.q1.E(r0)
            int r0 = (int) r4
        L_0x0023:
            r2 = r0
            r0 = 0
            goto L_0x0070
        L_0x0026:
            com.google.crypto.tink.shaded.protobuf.v r0 = r8.p()
            java.lang.reflect.Field r2 = r8.h()
            long r2 = com.google.crypto.tink.shaded.protobuf.q1.E(r2)
            int r3 = (int) r2
            int r2 = r0.a()
            if (r11 != 0) goto L_0x005b
            boolean r11 = r0.f()
            if (r11 != 0) goto L_0x005b
            boolean r11 = r0.h()
            if (r11 != 0) goto L_0x005b
            java.lang.reflect.Field r11 = r8.n()
            long r4 = com.google.crypto.tink.shaded.protobuf.q1.E(r11)
            int r0 = (int) r4
            int r11 = r8.o()
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            r7 = r0
            r0 = r11
            r11 = r2
            r2 = r7
            goto L_0x0070
        L_0x005b:
            java.lang.reflect.Field r11 = r8.a()
            if (r11 != 0) goto L_0x0065
            r11 = r2
            r0 = 0
            r2 = 0
            goto L_0x0070
        L_0x0065:
            java.lang.reflect.Field r11 = r8.a()
            long r4 = com.google.crypto.tink.shaded.protobuf.q1.E(r11)
            int r0 = (int) r4
            r11 = r2
            goto L_0x0023
        L_0x0070:
            int r4 = r8.i()
            r9[r10] = r4
            int r4 = r10 + 1
            boolean r5 = r8.q()
            if (r5 == 0) goto L_0x0081
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0082
        L_0x0081:
            r5 = 0
        L_0x0082:
            boolean r6 = r8.t()
            if (r6 == 0) goto L_0x008a
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x008a:
            r1 = r1 | r5
            int r11 = r11 << 20
            r11 = r11 | r1
            r11 = r11 | r3
            r9[r4] = r11
            int r11 = r10 + 2
            int r0 = r0 << 20
            r0 = r0 | r2
            r9[r11] = r0
            java.lang.Class r9 = r8.k()
            java.lang.Object r11 = r8.j()
            if (r11 == 0) goto L_0x00c2
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r11 = r8.j()
            r12[r10] = r11
            if (r9 == 0) goto L_0x00b3
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00df
        L_0x00b3:
            com.google.crypto.tink.shaded.protobuf.a0$e r9 = r8.f()
            if (r9 == 0) goto L_0x00df
            int r10 = r10 + 1
            com.google.crypto.tink.shaded.protobuf.a0$e r8 = r8.f()
            r12[r10] = r8
            goto L_0x00df
        L_0x00c2:
            if (r9 == 0) goto L_0x00cd
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00df
        L_0x00cd:
            com.google.crypto.tink.shaded.protobuf.a0$e r9 = r8.f()
            if (r9 == 0) goto L_0x00df
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.crypto.tink.shaded.protobuf.a0$e r8 = r8.f()
            r12[r10] = r8
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.r0(com.google.crypto.tink.shaded.protobuf.t, int[], int, boolean, java.lang.Object[]):void");
    }

    private static <T> float s(T t, long j2) {
        return q1.w(t, j2);
    }

    private static int s0(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    private a0.e t(int i2) {
        return (a0.e) this.b[((i2 / 3) * 2) + 1];
    }

    private int t0(int i2) {
        return this.a[i2 + 1];
    }

    private Object u(int i2) {
        return this.b[(i2 / 3) * 2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u0(T r18, com.google.crypto.tink.shaded.protobuf.t1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f3811f
            if (r3 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.q<?> r3 = r0.p
            com.google.crypto.tink.shaded.protobuf.u r3 = r3.c(r1)
            boolean r5 = r3.m()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.r()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.a
            int r7 = r7.length
            sun.misc.Unsafe r8 = s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x049a
            int r12 = r0.t0(r10)
            int r13 = r0.U(r10)
            int r14 = s0(r12)
            boolean r15 = r0.f3813h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x0056
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            com.google.crypto.tink.shaded.protobuf.q<?> r9 = r0.p
            int r9 = r9.a(r5)
            if (r9 > r13) goto L_0x0081
            com.google.crypto.tink.shaded.protobuf.q<?> r9 = r0.p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r9 = r6
            long r5 = V(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r0.v(r10)
            r2.M(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.B(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.N(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.p(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.i(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.I(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.f(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.i r4 = (com.google.crypto.tink.shaded.protobuf.i) r4
            r2.v(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r0.v(r10)
            r2.s(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.x0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = W(r1, r5)
            r2.e(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.n(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.z(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.k(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.H(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.d(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = Y(r1, r5)
            r2.C(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = X(r1, r5)
            r2.o(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.w0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.g1 r6 = r0.v(r10)
            com.google.crypto.tink.shaded.protobuf.i1.U(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            com.google.crypto.tink.shaded.protobuf.i1.b0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.N(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.W(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.T(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            com.google.crypto.tink.shaded.protobuf.i1.b0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.O(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.g1 r6 = r0.v(r10)
            com.google.crypto.tink.shaded.protobuf.i1.X(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.c0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            com.google.crypto.tink.shaded.protobuf.i1.N(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.W(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.T(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.i1.P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r0.v(r10)
            r2.M(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.B(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.N(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.p(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.i(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.I(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.f(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.i r4 = (com.google.crypto.tink.shaded.protobuf.i) r4
            r2.v(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r0.v(r10)
            r2.s(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.x0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = l(r1, r5)
            r2.e(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.n(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.z(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.k(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.H(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.d(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = s(r1, r5)
            r2.C(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = o(r1, r5)
            r2.o(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            com.google.crypto.tink.shaded.protobuf.q<?> r4 = r0.p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r3 = r0.o
            r0.y0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.u0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.t1):void");
    }

    private g1 v(int i2) {
        int i3 = (i2 / 3) * 2;
        g1 g1Var = (g1) this.b[i3];
        if (g1Var != null) {
            return g1Var;
        }
        g1 d2 = c1.a().d((Class) this.b[i3 + 1]);
        this.b[i3] = d2;
        return d2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v0(T r13, com.google.crypto.tink.shaded.protobuf.t1 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f3811f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.crypto.tink.shaded.protobuf.q<?> r0 = r12.p
            com.google.crypto.tink.shaded.protobuf.u r0 = r0.c(r13)
            boolean r2 = r0.m()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.r()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.t0(r5)
            int r7 = r12.U(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.q<?> r8 = r12.p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.q<?> r8 = r12.p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = s0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.g1 r8 = r12.v(r5)
            r14.M(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.B(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.N(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.p(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.i(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.I(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.f(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.i) r6
            r14.v(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.g1 r8 = r12.v(r5)
            r14.s(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            r12.x0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            boolean r6 = W(r13, r8)
            r14.e(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.n(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.z(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            r14.k(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.H(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            r14.d(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            float r6 = Y(r13, r8)
            r14.C(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            double r8 = X(r13, r8)
            r14.o(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            r12.w0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.g1 r8 = r12.v(r5)
            com.google.crypto.tink.shaded.protobuf.i1.U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.g1 r8 = r12.v(r5)
            com.google.crypto.tink.shaded.protobuf.i1.X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.i1.P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.g1 r8 = r12.v(r5)
            r14.M(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = L(r13, r8)
            r14.B(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = A(r13, r8)
            r14.N(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = L(r13, r8)
            r14.p(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = A(r13, r8)
            r14.i(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = A(r13, r8)
            r14.I(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = A(r13, r8)
            r14.f(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.i) r6
            r14.v(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            com.google.crypto.tink.shaded.protobuf.g1 r8 = r12.v(r5)
            r14.s(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r13, r8)
            r12.x0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            boolean r6 = l(r13, r8)
            r14.e(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = A(r13, r8)
            r14.n(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = L(r13, r8)
            r14.z(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            int r6 = A(r13, r8)
            r14.k(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = L(r13, r8)
            r14.H(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            long r8 = L(r13, r8)
            r14.d(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            float r6 = s(r13, r8)
            r14.C(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = V(r6)
            double r8 = o(r13, r8)
            r14.o(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.crypto.tink.shaded.protobuf.q<?> r3 = r12.p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r0 = r12.o
            r12.y0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.v0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.t1):void");
    }

    static n1 w(Object obj) {
        y yVar = (y) obj;
        n1 n1Var = yVar.unknownFields;
        if (n1Var != n1.e()) {
            return n1Var;
        }
        n1 l2 = n1.l();
        yVar.unknownFields = l2;
        return l2;
    }

    private <K, V> void w0(t1 t1Var, int i2, Object obj, int i3) {
        if (obj != null) {
            t1Var.x(i2, this.q.f(u(i3)), this.q.g(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0347, code lost:
        r4 = (r4 + r8) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0461, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0518, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x051e
            int r8 = r0.t0(r5)
            int r9 = r0.U(r5)
            int r10 = s0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.f3814i
            if (r11 == 0) goto L_0x0055
            com.google.crypto.tink.shaded.protobuf.v r11 = com.google.crypto.tink.shaded.protobuf.v.DOUBLE_LIST_PACKED
            int r11 = r11.a()
            if (r10 < r11) goto L_0x0055
            com.google.crypto.tink.shaded.protobuf.v r11 = com.google.crypto.tink.shaded.protobuf.v.SINT64_LIST_PACKED
            int r11 = r11.a()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = V(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x050c;
                case 1: goto L_0x0502;
                case 2: goto L_0x04f4;
                case 3: goto L_0x04e6;
                case 4: goto L_0x04d8;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c4;
                case 7: goto L_0x04b9;
                case 8: goto L_0x049d;
                case 9: goto L_0x048c;
                case 10: goto L_0x047d;
                case 11: goto L_0x0470;
                case 12: goto L_0x0463;
                case 13: goto L_0x0458;
                case 14: goto L_0x044f;
                case 15: goto L_0x0442;
                case 16: goto L_0x0435;
                case 17: goto L_0x0422;
                case 18: goto L_0x0413;
                case 19: goto L_0x0407;
                case 20: goto L_0x03fb;
                case 21: goto L_0x03ef;
                case 22: goto L_0x03e3;
                case 23: goto L_0x03d7;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bf;
                case 26: goto L_0x03b4;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0399;
                case 29: goto L_0x038c;
                case 30: goto L_0x037f;
                case 31: goto L_0x0372;
                case 32: goto L_0x0365;
                case 33: goto L_0x0358;
                case 34: goto L_0x034b;
                case 35: goto L_0x032b;
                case 36: goto L_0x030e;
                case 37: goto L_0x02f1;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02b6;
                case 40: goto L_0x0298;
                case 41: goto L_0x027a;
                case 42: goto L_0x025c;
                case 43: goto L_0x023e;
                case 44: goto L_0x0220;
                case 45: goto L_0x0202;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01c6;
                case 48: goto L_0x01a8;
                case 49: goto L_0x0198;
                case 50: goto L_0x0188;
                case 51: goto L_0x017a;
                case 52: goto L_0x016e;
                case 53: goto L_0x015e;
                case 54: goto L_0x014e;
                case 55: goto L_0x013e;
                case 56: goto L_0x0132;
                case 57: goto L_0x0125;
                case 58: goto L_0x0118;
                case 59: goto L_0x00fa;
                case 60: goto L_0x00e6;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a7;
                case 65: goto L_0x009b;
                case 66: goto L_0x008b;
                case 67: goto L_0x007b;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x041f
        L_0x0065:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.q0 r3 = (com.google.crypto.tink.shaded.protobuf.q0) r3
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.s(r9, r3, r4)
            goto L_0x041e
        L_0x007b:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = a0(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r9, r3)
            goto L_0x041e
        L_0x008b:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = Z(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r9, r3)
            goto L_0x041e
        L_0x009b:
            boolean r8 = r0.I(r1, r9, r5)
            if (r8 == 0) goto L_0x041f
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r9, r3)
            goto L_0x041e
        L_0x00a7:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r9, r3)
            goto L_0x0461
        L_0x00b4:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = Z(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.k(r9, r3)
            goto L_0x041e
        L_0x00c4:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = Z(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r9, r3)
            goto L_0x041e
        L_0x00d4:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x00e6:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.o(r9, r3, r4)
            goto L_0x041e
        L_0x00fa:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.i
            if (r4 == 0) goto L_0x0110
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x0110:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.S(r9, r3)
            goto L_0x041e
        L_0x0118:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d(r9, r3)
            goto L_0x041e
        L_0x0125:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m(r9, r3)
            goto L_0x0461
        L_0x0132:
            boolean r8 = r0.I(r1, r9, r5)
            if (r8 == 0) goto L_0x041f
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.o(r9, r3)
            goto L_0x041e
        L_0x013e:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = Z(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.v(r9, r3)
            goto L_0x041e
        L_0x014e:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = a0(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r9, r3)
            goto L_0x041e
        L_0x015e:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = a0(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.x(r9, r3)
            goto L_0x041e
        L_0x016e:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.q(r9, r8)
            goto L_0x041e
        L_0x017a:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.i(r9, r3)
            goto L_0x041e
        L_0x0188:
            com.google.crypto.tink.shaded.protobuf.l0 r3 = r0.q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.u(r5)
            int r3 = r3.c(r9, r4, r8)
            goto L_0x041e
        L_0x0198:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.j(r9, r3, r4)
            goto L_0x041e
        L_0x01a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.t(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x01bc
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01bc:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.r(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x01da
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01da:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x01f8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01f8:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x0202:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x0216
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0216:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x0220:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.e(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x0234
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0234:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x023e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.w(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x0252
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0252:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x025c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.b(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x0270
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0270:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x027a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x028e
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x028e:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x0298:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x02ac
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ac:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x02b6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.l(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x02ca
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ca:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x02d4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.y(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x02e8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02e8:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x02f1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.n(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x0305
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0305:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x030e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x0322
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0322:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
            goto L_0x0347
        L_0x032b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f3814i
            if (r4 == 0) goto L_0x033f
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x033f:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r9)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r3)
        L_0x0347:
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x0461
        L_0x034b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.s(r9, r3, r4)
            goto L_0x041e
        L_0x0358:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.q(r9, r3, r4)
            goto L_0x041e
        L_0x0365:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.h(r9, r3, r4)
            goto L_0x041e
        L_0x0372:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.f(r9, r3, r4)
            goto L_0x041e
        L_0x037f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.d(r9, r3, r4)
            goto L_0x041e
        L_0x038c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.v(r9, r3, r4)
            goto L_0x041e
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.c(r9, r3)
            goto L_0x041e
        L_0x03a5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.p(r9, r3, r4)
            goto L_0x041e
        L_0x03b4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.u(r9, r3)
            goto L_0x041e
        L_0x03bf:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.a(r9, r3, r4)
            goto L_0x041e
        L_0x03cb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.f(r9, r3, r4)
            goto L_0x041e
        L_0x03d7:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.h(r9, r3, r4)
            goto L_0x041e
        L_0x03e3:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.k(r9, r3, r4)
            goto L_0x041e
        L_0x03ef:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.x(r9, r3, r4)
            goto L_0x041e
        L_0x03fb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.m(r9, r3, r4)
            goto L_0x041e
        L_0x0407:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.f(r9, r3, r4)
            goto L_0x041e
        L_0x0413:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.h(r9, r3, r4)
        L_0x041e:
            int r6 = r6 + r3
        L_0x041f:
            r10 = 0
            goto L_0x0518
        L_0x0422:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.q0 r3 = (com.google.crypto.tink.shaded.protobuf.q0) r3
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.s(r9, r3, r4)
            goto L_0x041e
        L_0x0435:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r9, r3)
            goto L_0x041e
        L_0x0442:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r9, r3)
            goto L_0x041e
        L_0x044f:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x041f
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r9, r3)
            goto L_0x041e
        L_0x0458:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r9, r3)
        L_0x0461:
            int r6 = r6 + r4
            goto L_0x041f
        L_0x0463:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.k(r9, r3)
            goto L_0x041e
        L_0x0470:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r9, r3)
            goto L_0x041e
        L_0x047d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x048c:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.g1 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.i1.o(r9, r3, r4)
            goto L_0x041e
        L_0x049d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.i
            if (r4 == 0) goto L_0x04b1
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x04b1:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.S(r9, r3)
            goto L_0x041e
        L_0x04b9:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d(r9, r3)
            goto L_0x041e
        L_0x04c4:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r10 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m(r9, r10)
            goto L_0x0517
        L_0x04ce:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0518
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.o(r9, r3)
            goto L_0x0517
        L_0x04d8:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.v(r9, r3)
            goto L_0x0517
        L_0x04e6:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r9, r3)
            goto L_0x0517
        L_0x04f4:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.x(r9, r3)
            goto L_0x0517
        L_0x0502:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.q(r9, r8)
            goto L_0x0517
        L_0x050c:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.i(r9, r3)
        L_0x0517:
            int r6 = r6 + r3
        L_0x0518:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x051e:
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r2 = r0.o
            int r2 = r0.z(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f3811f
            if (r2 == 0) goto L_0x0534
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r0.p
            com.google.crypto.tink.shaded.protobuf.u r1 = r2.c(r1)
            int r1 = r1.k()
            int r6 = r6 + r1
        L_0x0534:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.x(java.lang.Object):int");
    }

    private void x0(int i2, Object obj, t1 t1Var) {
        if (obj instanceof String) {
            t1Var.F(i2, (String) obj);
        } else {
            t1Var.v(i2, (i) obj);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int y(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.t0(r4)
            int r7 = s0(r6)
            int r8 = r15.U(r4)
            long r9 = V(r6)
            com.google.crypto.tink.shaded.protobuf.v r6 = com.google.crypto.tink.shaded.protobuf.v.DOUBLE_LIST_PACKED
            int r6 = r6.a()
            if (r7 < r6) goto L_0x0038
            com.google.crypto.tink.shaded.protobuf.v r6 = com.google.crypto.tink.shaded.protobuf.v.SINT64_LIST_PACKED
            int r6 = r6.a()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.q0 r6 = (com.google.crypto.tink.shaded.protobuf.q0) r6
            com.google.crypto.tink.shaded.protobuf.g1 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.s(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = a0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = Z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = Z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.k(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = Z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.i) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.g1 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.i
            if (r7 == 0) goto L_0x00ec
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.i) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.S(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.o(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = Z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.v(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = a0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = a0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.x(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.q(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.i(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.crypto.tink.shaded.protobuf.l0 r6 = r0.q
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            java.lang.Object r9 = r15.u(r4)
            int r6 = r6.c(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = K(r1, r9)
            com.google.crypto.tink.shaded.protobuf.g1 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.i1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f3814i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.U(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = K(r1, r9)
            com.google.crypto.tink.shaded.protobuf.g1 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = K(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.q0 r6 = (com.google.crypto.tink.shaded.protobuf.q0) r6
            com.google.crypto.tink.shaded.protobuf.g1 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.s(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.crypto.tink.shaded.protobuf.q1.y(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.q1.x(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.q1.x(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.k(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.q1.x(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.i) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            com.google.crypto.tink.shaded.protobuf.g1 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.i1.o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.q1.A(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.i
            if (r7 == 0) goto L_0x0469
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.i) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.S(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.o(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.q1.x(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.v(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.crypto.tink.shaded.protobuf.q1.y(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.crypto.tink.shaded.protobuf.q1.y(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.x(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.q(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.i(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r2 = r0.o
            int r1 = r15.z(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.y(java.lang.Object):int");
    }

    private <UT, UB> void y0(m1<UT, UB> m1Var, T t, t1 t1Var) {
        m1Var.t(m1Var.g(t), t1Var);
    }

    private <UT, UB> int z(m1<UT, UB> m1Var, T t) {
        return m1Var.h(m1Var.g(t));
    }

    public void a(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 3) {
                Q(t, t2, i2);
            }
            i1.G(this.o, t, t2);
            if (this.f3811f) {
                i1.E(this.p, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    public void b(T t, byte[] bArr, int i2, int i3, e.b bVar) {
        if (this.f3813h) {
            e0(t, bArr, i2, i3, bVar);
        } else {
            d0(t, bArr, i2, i3, 0, bVar);
        }
    }

    public void c(T t, t1 t1Var) {
        t1Var.A();
        t1.a aVar = t1.a.DESCENDING;
        if (this.f3813h) {
            v0(t, t1Var);
        } else {
            u0(t, t1Var);
        }
    }

    public void d(T t, f1 f1Var, p pVar) {
        if (pVar != null) {
            M(this.o, this.p, t, f1Var, pVar);
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0345, code lost:
        if (r0 != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x038e, code lost:
        if (r0 != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b1, code lost:
        if (r0 != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03b4, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        r12 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015f, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fb, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0223, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0259, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r0 = r11;
        r3 = r13;
        r1 = r17;
        r13 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0262, code lost:
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0294, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0296, code lost:
        r6 = r6 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0298, code lost:
        r11 = r34;
        r2 = r8;
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a0, code lost:
        r0 = r34;
        r22 = r6;
        r19 = r7;
        r20 = r8;
        r28 = r10;
        r2 = r11;
        r8 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d0(T r30, byte[] r31, int r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.e.b r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = s
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x040d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.crypto.tink.shaded.protobuf.e.H(r0, r12, r3, r9)
            int r3 = r9.a
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0037
            int r2 = r2 / r8
            int r1 = r15.h0(r3, r2)
            goto L_0x003b
        L_0x0037:
            int r1 = r15.g0(r3)
        L_0x003b:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004e
            r17 = r3
            r2 = r4
            r8 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r0 = r11
            r20 = 0
            goto L_0x03b9
        L_0x004e:
            int[] r1 = r15.a
            int r18 = r2 + 1
            r1 = r1[r18]
            int r8 = s0(r1)
            long r11 = V(r1)
            r18 = r5
            r5 = 17
            r19 = r1
            if (r8 > r5) goto L_0x02ae
            int[] r5 = r15.a
            int r20 = r2 + 2
            r5 = r5[r20]
            int r20 = r5 >>> 20
            r1 = 1
            int r20 = r1 << r20
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r22
            if (r5 == r7) goto L_0x0086
            r13 = -1
            r17 = r2
            if (r7 == r13) goto L_0x007f
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
        L_0x007f:
            long r1 = (long) r5
            int r6 = r10.getInt(r14, r1)
            r7 = r5
            goto L_0x0089
        L_0x0086:
            r17 = r2
            r13 = -1
        L_0x0089:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x027e;
                case 1: goto L_0x0266;
                case 2: goto L_0x023f;
                case 3: goto L_0x023f;
                case 4: goto L_0x0226;
                case 5: goto L_0x0204;
                case 6: goto L_0x01e3;
                case 7: goto L_0x01c1;
                case 8: goto L_0x019c;
                case 9: goto L_0x0164;
                case 10: goto L_0x0148;
                case 11: goto L_0x0226;
                case 12: goto L_0x0117;
                case 13: goto L_0x01e3;
                case 14: goto L_0x0204;
                case 15: goto L_0x00fd;
                case 16: goto L_0x00dc;
                case 17: goto L_0x009a;
                default: goto L_0x008d;
            }
        L_0x008d:
            r12 = r31
            r11 = r4
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            goto L_0x02a0
        L_0x009a:
            r2 = 3
            if (r0 != r2) goto L_0x00d5
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r17
            com.google.crypto.tink.shaded.protobuf.g1 r0 = r15.v(r2)
            r1 = r31
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r33
            r4 = r5
            r13 = r18
            r5 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.e.n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r11, r1)
            goto L_0x00cf
        L_0x00c2:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.a0.h(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00cf:
            r6 = r6 | r20
            r12 = r31
            goto L_0x0298
        L_0x00d5:
            r8 = r17
            r13 = r18
            r17 = r3
            goto L_0x00f9
        L_0x00dc:
            r8 = r17
            r13 = r18
            r17 = r3
            if (r0 != 0) goto L_0x00f9
            r2 = r11
            r12 = r31
            int r11 = com.google.crypto.tink.shaded.protobuf.e.L(r12, r4, r9)
            long r0 = r9.b
            long r4 = com.google.crypto.tink.shaded.protobuf.j.c(r0)
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            goto L_0x0259
        L_0x00f9:
            r12 = r31
            goto L_0x015f
        L_0x00fd:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != 0) goto L_0x015f
            int r0 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r9)
            int r1 = r9.a
            int r1 = com.google.crypto.tink.shaded.protobuf.j.b(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0296
        L_0x0117:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != 0) goto L_0x015f
            int r0 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r9)
            int r1 = r9.a
            com.google.crypto.tink.shaded.protobuf.a0$e r4 = r15.t(r8)
            if (r4 == 0) goto L_0x0143
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L_0x0135
            goto L_0x0143
        L_0x0135:
            com.google.crypto.tink.shaded.protobuf.n1 r2 = w(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.n(r13, r1)
            goto L_0x0298
        L_0x0143:
            r10.putInt(r14, r2, r1)
            goto L_0x0296
        L_0x0148:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != r1) goto L_0x015f
            int r0 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r9)
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r2, r1)
            goto L_0x0296
        L_0x015f:
            r11 = r4
            r18 = -1
            goto L_0x02a0
        L_0x0164:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != r1) goto L_0x0196
            com.google.crypto.tink.shaded.protobuf.g1 r0 = r15.v(r8)
            r11 = r33
            r18 = -1
            int r0 = com.google.crypto.tink.shaded.protobuf.e.p(r0, r12, r4, r11, r9)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x0187
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r2, r1)
            goto L_0x01fb
        L_0x0187:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.a0.h(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x01fb
        L_0x0196:
            r11 = r33
            r18 = -1
            goto L_0x0223
        L_0x019c:
            r8 = r17
            r13 = r18
            r1 = 2
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x0223
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x01b7
            int r0 = com.google.crypto.tink.shaded.protobuf.e.C(r12, r4, r9)
            goto L_0x01bb
        L_0x01b7:
            int r0 = com.google.crypto.tink.shaded.protobuf.e.F(r12, r4, r9)
        L_0x01bb:
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r2, r1)
            goto L_0x01fb
        L_0x01c1:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != 0) goto L_0x0223
            int r0 = com.google.crypto.tink.shaded.protobuf.e.L(r12, r4, r9)
            long r4 = r9.b
            r23 = 0
            int r1 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x01de
            r1 = 1
            goto L_0x01df
        L_0x01de:
            r1 = 0
        L_0x01df:
            com.google.crypto.tink.shaded.protobuf.q1.F(r14, r2, r1)
            goto L_0x01fb
        L_0x01e3:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x0223
            int r0 = com.google.crypto.tink.shaded.protobuf.e.h(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x01fb:
            r6 = r6 | r20
            r2 = r8
            r3 = r13
            r1 = r17
            r13 = r11
            goto L_0x0262
        L_0x0204:
            r8 = r17
            r13 = r18
            r1 = 1
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x0223
            long r21 = com.google.crypto.tink.shaded.protobuf.e.j(r12, r4)
            r0 = r10
            r1 = r30
            r11 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x0294
        L_0x0223:
            r11 = r4
            goto L_0x02a0
        L_0x0226:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != 0) goto L_0x02a0
            int r0 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r11, r9)
            int r1 = r9.a
            r10.putInt(r14, r2, r1)
            goto L_0x0296
        L_0x023f:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != 0) goto L_0x02a0
            int r11 = com.google.crypto.tink.shaded.protobuf.e.L(r12, r11, r9)
            long r4 = r9.b
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
        L_0x0259:
            r6 = r6 | r20
            r2 = r8
            r0 = r11
            r3 = r13
            r1 = r17
            r13 = r33
        L_0x0262:
            r11 = r34
            goto L_0x0017
        L_0x0266:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != r1) goto L_0x02a0
            float r0 = com.google.crypto.tink.shaded.protobuf.e.l(r12, r11)
            com.google.crypto.tink.shaded.protobuf.q1.M(r14, r2, r0)
            int r0 = r11 + 4
            goto L_0x0296
        L_0x027e:
            r8 = r17
            r13 = r18
            r1 = 1
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != r1) goto L_0x02a0
            double r0 = com.google.crypto.tink.shaded.protobuf.e.d(r12, r11)
            com.google.crypto.tink.shaded.protobuf.q1.L(r14, r2, r0)
        L_0x0294:
            int r0 = r11 + 8
        L_0x0296:
            r6 = r6 | r20
        L_0x0298:
            r11 = r34
            r2 = r8
            r3 = r13
            r1 = r17
            goto L_0x02fd
        L_0x02a0:
            r0 = r34
            r22 = r6
            r19 = r7
            r20 = r8
            r28 = r10
            r2 = r11
            r8 = r13
            goto L_0x03b9
        L_0x02ae:
            r5 = r2
            r17 = r3
            r2 = r11
            r13 = r18
            r18 = -1
            r12 = r31
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x030e
            r1 = 2
            if (r0 != r1) goto L_0x0301
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.crypto.tink.shaded.protobuf.a0$i r0 = (com.google.crypto.tink.shaded.protobuf.a0.i) r0
            boolean r1 = r0.O()
            if (r1 != 0) goto L_0x02de
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d5
            r1 = 10
            goto L_0x02d7
        L_0x02d5:
            int r1 = r1 * 2
        L_0x02d7:
            com.google.crypto.tink.shaded.protobuf.a0$i r0 = r0.w(r1)
            r10.putObject(r14, r2, r0)
        L_0x02de:
            r8 = r0
            com.google.crypto.tink.shaded.protobuf.g1 r0 = r15.v(r5)
            r1 = r13
            r2 = r31
            r3 = r11
            r4 = r33
            r20 = r5
            r5 = r8
            r22 = r6
            r6 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.e.q(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r3 = r13
            r1 = r17
            r2 = r20
            r6 = r22
        L_0x02fd:
            r13 = r33
            goto L_0x0017
        L_0x0301:
            r20 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r15 = r11
            r18 = r13
            goto L_0x0391
        L_0x030e:
            r20 = r5
            r22 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0361
            r1 = r19
            long r5 = (long) r1
            r4 = r0
            r0 = r29
            r1 = r30
            r23 = r2
            r2 = r31
            r3 = r11
            r32 = r4
            r4 = r33
            r25 = r5
            r5 = r13
            r6 = r17
            r19 = r7
            r7 = r32
            r27 = r8
            r8 = r20
            r28 = r10
            r9 = r25
            r15 = r11
            r11 = r27
            r18 = r13
            r12 = r23
            r14 = r35
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03b4
        L_0x0347:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r17
            r3 = r18
            r7 = r19
            r2 = r20
            r6 = r22
        L_0x035d:
            r10 = r28
            goto L_0x0017
        L_0x0361:
            r32 = r0
            r23 = r2
            r27 = r8
            r28 = r10
            r15 = r11
            r18 = r13
            r1 = r19
            r19 = r7
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x0397
            r7 = r32
            r0 = 2
            if (r7 != r0) goto L_0x0391
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r20
            r6 = r23
            r8 = r35
            int r0 = r0.b0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03b4
            goto L_0x0347
        L_0x0391:
            r0 = r34
            r2 = r15
            r8 = r18
            goto L_0x03b9
        L_0x0397:
            r7 = r32
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r17
            r10 = r23
            r12 = r20
            r13 = r35
            int r0 = r0.c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03b4
            goto L_0x0347
        L_0x03b4:
            r2 = r0
            r8 = r18
            r0 = r34
        L_0x03b9:
            if (r8 != r0) goto L_0x03c7
            if (r0 == 0) goto L_0x03c7
            r9 = r29
            r10 = r0
            r0 = r2
            r3 = r8
            r7 = r19
            r6 = r22
            goto L_0x0415
        L_0x03c7:
            r9 = r29
            r10 = r0
            boolean r0 = r9.f3811f
            r11 = r35
            if (r0 == 0) goto L_0x03ea
            com.google.crypto.tink.shaded.protobuf.p r0 = r11.f3720d
            com.google.crypto.tink.shaded.protobuf.p r1 = com.google.crypto.tink.shaded.protobuf.p.b()
            if (r0 == r1) goto L_0x03ea
            com.google.crypto.tink.shaded.protobuf.q0 r5 = r9.f3810e
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r6 = r9.o
            r0 = r8
            r1 = r31
            r3 = r33
            r4 = r30
            r7 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.e.g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03f9
        L_0x03ea:
            com.google.crypto.tink.shaded.protobuf.n1 r4 = w(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.e.G(r0, r1, r2, r3, r4, r5)
        L_0x03f9:
            r14 = r30
            r12 = r31
            r13 = r33
            r3 = r8
            r15 = r9
            r9 = r11
            r1 = r17
            r7 = r19
            r2 = r20
            r6 = r22
            r11 = r10
            goto L_0x035d
        L_0x040d:
            r22 = r6
            r19 = r7
            r28 = r10
            r10 = r11
            r9 = r15
        L_0x0415:
            r1 = -1
            if (r7 == r1) goto L_0x0421
            long r1 = (long) r7
            r4 = r30
            r5 = r28
            r5.putInt(r4, r1, r6)
            goto L_0x0423
        L_0x0421:
            r4 = r30
        L_0x0423:
            r1 = 0
            int r2 = r9.f3816k
        L_0x0426:
            int r5 = r9.f3817l
            if (r2 >= r5) goto L_0x0439
            int[] r5 = r9.f3815j
            r5 = r5[r2]
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r6 = r9.o
            java.lang.Object r1 = r9.q(r4, r5, r1, r6)
            com.google.crypto.tink.shaded.protobuf.n1 r1 = (com.google.crypto.tink.shaded.protobuf.n1) r1
            int r2 = r2 + 1
            goto L_0x0426
        L_0x0439:
            if (r1 == 0) goto L_0x0440
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r2 = r9.o
            r2.o(r4, r1)
        L_0x0440:
            if (r10 != 0) goto L_0x044c
            r1 = r33
            if (r0 != r1) goto L_0x0447
            goto L_0x0452
        L_0x0447:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r0
        L_0x044c:
            r1 = r33
            if (r0 > r1) goto L_0x0453
            if (r3 != r10) goto L_0x0453
        L_0x0452:
            return r0
        L_0x0453:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.d0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public void e(T t) {
        int i2;
        int i3 = this.f3816k;
        while (true) {
            i2 = this.f3817l;
            if (i3 >= i2) {
                break;
            }
            long V = V(t0(this.f3815j[i3]));
            Object A = q1.A(t, V);
            if (A != null) {
                q1.P(t, V, this.q.e(A));
            }
            i3++;
        }
        int length = this.f3815j.length;
        while (i2 < length) {
            this.f3819n.c(t, (long) this.f3815j[i2]);
            i2++;
        }
        this.o.j(t);
        if (this.f3811f) {
            this.p.f(t);
        }
    }

    public final boolean f(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3816k; i5++) {
            int i6 = this.f3815j[i5];
            int U = U(i6);
            int t0 = t0(i6);
            if (!this.f3813h) {
                int i7 = this.a[i6 + 2];
                int i8 = 1048575 & i7;
                i2 = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = s.getInt(t, (long) i8);
                    i3 = i8;
                }
            } else {
                i2 = 0;
            }
            if (J(t0) && !D(t, i6, i4, i2)) {
                return false;
            }
            int s0 = s0(t0);
            if (s0 != 9 && s0 != 17) {
                if (s0 != 27) {
                    if (s0 == 60 || s0 == 68) {
                        if (I(t, U, i6) && !E(t, t0, v(i6))) {
                            return false;
                        }
                    } else if (s0 != 49) {
                        if (s0 == 50 && !G(t, t0, i6)) {
                            return false;
                        }
                    }
                }
                if (!F(t, t0, i6)) {
                    return false;
                }
            } else if (D(t, i6, i4, i2) && !E(t, t0, v(i6))) {
                return false;
            }
        }
        return !this.f3811f || this.p.c(t).o();
    }

    public boolean g(T t, T t2) {
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!p(t, t2, i2)) {
                return false;
            }
        }
        if (!this.o.g(t).equals(this.o.g(t2))) {
            return false;
        }
        if (this.f3811f) {
            return this.p.c(t).equals(this.p.c(t2));
        }
        return true;
    }

    public int h(T t) {
        return this.f3813h ? y(t) : x(t);
    }

    public T i() {
        return this.f3818m.a(this.f3810e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.t0(r1)
            int r4 = r8.U(r1)
            long r5 = V(r3)
            int r3 = s0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = W(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = Y(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = X(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.q1.y(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.q1.x(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.q1.y(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.q1.x(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.q1.x(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.q1.x(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.q1.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.crypto.tink.shaded.protobuf.q1.p(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.q1.x(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.q1.y(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.q1.x(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.q1.y(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.q1.y(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.crypto.tink.shaded.protobuf.q1.w(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.crypto.tink.shaded.protobuf.q1.v(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.a0.f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.m1<?, ?> r0 = r8.o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f3811f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.q<?> r0 = r8.p
            com.google.crypto.tink.shaded.protobuf.u r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.j(java.lang.Object):int");
    }
}
