package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.u.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet */
final class u<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final u f3823d = new u(true);
    private final j1<T, Object> a;
    private boolean b;
    private boolean c;

    /* compiled from: FieldSet */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.s1$b[] r0 = com.google.crypto.tink.shaded.protobuf.s1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.google.crypto.tink.shaded.protobuf.s1$b r2 = com.google.crypto.tink.shaded.protobuf.s1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.s1$b r3 = com.google.crypto.tink.shaded.protobuf.s1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.s1$b r4 = com.google.crypto.tink.shaded.protobuf.s1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.s1$b r5 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.s1$b r6 = com.google.crypto.tink.shaded.protobuf.s1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.s1$b r7 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.s1$b r8 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.crypto.tink.shaded.protobuf.s1$b r9 = com.google.crypto.tink.shaded.protobuf.s1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.crypto.tink.shaded.protobuf.s1$b r10 = com.google.crypto.tink.shaded.protobuf.s1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.crypto.tink.shaded.protobuf.s1$c[] r9 = com.google.crypto.tink.shaded.protobuf.s1.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                a = r9
                com.google.crypto.tink.shaded.protobuf.s1$c r10 = com.google.crypto.tink.shaded.protobuf.s1.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.crypto.tink.shaded.protobuf.s1$c r9 = com.google.crypto.tink.shaded.protobuf.s1.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.crypto.tink.shaded.protobuf.s1$c r1 = com.google.crypto.tink.shaded.protobuf.s1.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.crypto.tink.shaded.protobuf.s1$c r1 = com.google.crypto.tink.shaded.protobuf.s1.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.crypto.tink.shaded.protobuf.s1$c r1 = com.google.crypto.tink.shaded.protobuf.s1.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.crypto.tink.shaded.protobuf.s1$c r1 = com.google.crypto.tink.shaded.protobuf.s1.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.crypto.tink.shaded.protobuf.s1$c r1 = com.google.crypto.tink.shaded.protobuf.s1.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.crypto.tink.shaded.protobuf.s1$c r1 = com.google.crypto.tink.shaded.protobuf.s1.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.crypto.tink.shaded.protobuf.s1$c r1 = com.google.crypto.tink.shaded.protobuf.s1.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u.a.<clinit>():void");
        }
    }

    /* compiled from: FieldSet */
    public interface b<T extends b<T>> extends Comparable<T> {
        q0.a E(q0.a aVar, q0 q0Var);

        s1.c H();

        boolean J();

        int m();

        boolean s();

        s1.b u();
    }

    private u() {
        this.a = j1.o(16);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(s1.b bVar, int i2, Object obj) {
        int U = CodedOutputStream.U(i2);
        if (bVar == s1.b.GROUP) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(s1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((q0) obj);
            case 10:
                if (obj instanceof c0) {
                    return CodedOutputStream.B((c0) obj);
                }
                return CodedOutputStream.G((q0) obj);
            case 11:
                if (obj instanceof i) {
                    return CodedOutputStream.h((i) obj);
                }
                return CodedOutputStream.T((String) obj);
            case 12:
                if (obj instanceof i) {
                    return CodedOutputStream.h((i) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                if (obj instanceof a0.c) {
                    return CodedOutputStream.l(((a0.c) obj).m());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        s1.b u = bVar.u();
        int m2 = bVar.m();
        if (!bVar.s()) {
            return d(u, m2, obj);
        }
        int i2 = 0;
        if (bVar.J()) {
            for (Object e2 : (List) obj) {
                i2 += e(u, e2);
            }
            return CodedOutputStream.U(m2) + i2 + CodedOutputStream.J(i2);
        }
        for (Object d2 : (List) obj) {
            i2 += d(u, m2, d2);
        }
        return i2;
    }

    public static <T extends b<T>> u<T> g() {
        return f3823d;
    }

    private int j(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.H() != s1.c.MESSAGE || bVar.s() || bVar.J()) {
            return f(bVar, value);
        }
        if (value instanceof c0) {
            return CodedOutputStream.z(((b) entry.getKey()).m(), (c0) value);
        }
        return CodedOutputStream.D(((b) entry.getKey()).m(), (q0) value);
    }

    static int l(s1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.f();
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.H() == s1.c.MESSAGE) {
            if (bVar.s()) {
                for (q0 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof q0) {
                    if (!((q0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof c0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static boolean q(s1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof i) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof a0.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof q0) || (obj instanceof c0)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void u(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c0) {
            value = ((c0) value).f();
        }
        if (bVar.s()) {
            Object h2 = h(bVar);
            if (h2 == null) {
                h2 = new ArrayList();
            }
            for (Object c2 : (List) value) {
                ((List) h2).add(c(c2));
            }
            this.a.put(bVar, h2);
        } else if (bVar.H() == s1.c.MESSAGE) {
            Object h3 = h(bVar);
            if (h3 == null) {
                this.a.put(bVar, c(value));
                return;
            }
            this.a.put(bVar, bVar.E(((q0) h3).e(), (q0) value).k());
        } else {
            this.a.put(bVar, c(value));
        }
    }

    public static <T extends b<T>> u<T> v() {
        return new u<>();
    }

    private void x(s1.b bVar, Object obj) {
        if (!q(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void y(CodedOutputStream codedOutputStream, s1.b bVar, int i2, Object obj) {
        if (bVar == s1.b.GROUP) {
            codedOutputStream.x0(i2, (q0) obj);
            return;
        }
        codedOutputStream.T0(i2, l(bVar, false));
        z(codedOutputStream, bVar, obj);
    }

    static void z(CodedOutputStream codedOutputStream, s1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.o0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.w0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.E0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.X0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.C0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.u0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.s0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.i0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.z0((q0) obj);
                return;
            case 10:
                codedOutputStream.G0((q0) obj);
                return;
            case 11:
                if (obj instanceof i) {
                    codedOutputStream.m0((i) obj);
                    return;
                } else {
                    codedOutputStream.S0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof i) {
                    codedOutputStream.m0((i) obj);
                    return;
                } else {
                    codedOutputStream.j0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.V0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.K0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.M0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.O0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.Q0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof a0.c) {
                    codedOutputStream.q0(((a0.c) obj).m());
                    return;
                } else {
                    codedOutputStream.q0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public void a(T t, Object obj) {
        List list;
        if (t.s()) {
            x(t.u(), obj);
            Object h2 = h(t);
            if (h2 == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) h2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public u<T> clone() {
        u<T> v = v();
        for (int i2 = 0; i2 < this.a.i(); i2++) {
            Map.Entry<T, Object> h2 = this.a.h(i2);
            v.w((b) h2.getKey(), h2.getValue());
        }
        for (Map.Entry next : this.a.k()) {
            v.w((b) next.getKey(), next.getValue());
        }
        v.c = this.c;
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return this.a.equals(((u) obj).a);
    }

    public Object h(T t) {
        Object obj = this.a.get(t);
        return obj instanceof c0 ? ((c0) obj).f() : obj;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int i() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.i(); i3++) {
            i2 += j(this.a.h(i3));
        }
        for (Map.Entry<T, Object> j2 : this.a.k()) {
            i2 += j(j2);
        }
        return i2;
    }

    public int k() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.i(); i3++) {
            Map.Entry<T, Object> h2 = this.a.h(i3);
            i2 += f((b) h2.getKey(), h2.getValue());
        }
        for (Map.Entry next : this.a.k()) {
            i2 += f((b) next.getKey(), next.getValue());
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.a.isEmpty();
    }

    public boolean n() {
        return this.b;
    }

    public boolean o() {
        for (int i2 = 0; i2 < this.a.i(); i2++) {
            if (!p(this.a.h(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> p : this.a.k()) {
            if (!p(p)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        if (this.c) {
            return new c0.c(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void s() {
        if (!this.b) {
            this.a.n();
            this.b = true;
        }
    }

    public void t(u<T> uVar) {
        for (int i2 = 0; i2 < uVar.a.i(); i2++) {
            u(uVar.a.h(i2));
        }
        for (Map.Entry<T, Object> u : uVar.a.k()) {
            u(u);
        }
    }

    public void w(T t, Object obj) {
        if (!t.s()) {
            x(t.u(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object x : arrayList) {
                x(t.u(), x);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof c0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private u(boolean z) {
        this(j1.o(0));
        s();
    }

    private u(j1<T, Object> j1Var) {
        this.a = j1Var;
        s();
    }
}
