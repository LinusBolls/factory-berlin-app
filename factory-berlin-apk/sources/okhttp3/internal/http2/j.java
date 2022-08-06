package okhttp3.internal.http2;

import k.h0.b;
import kotlin.jvm.internal.k;
import l.g;
import l.h;
import l.i;

/* compiled from: Huffman.kt */
public final class j {
    private static final int[] a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] b = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    private static final a c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final j f11454d;

    static {
        j jVar = new j();
        f11454d = jVar;
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            jVar.a(i2, a[i2], b[i2]);
        }
    }

    private j() {
    }

    private final void a(int i2, int i3, int i4) {
        a aVar = new a(i2, i4);
        a aVar2 = c;
        while (i4 > 8) {
            i4 -= 8;
            int i5 = (i3 >>> i4) & 255;
            a[] a2 = aVar2.a();
            if (a2 != null) {
                a aVar3 = a2[i5];
                if (aVar3 == null) {
                    aVar3 = new a();
                    a2[i5] = aVar3;
                }
                aVar2 = aVar3;
            } else {
                k.m();
                throw null;
            }
        }
        int i6 = 8 - i4;
        int i7 = (i3 << i6) & 255;
        int i8 = 1 << i6;
        a[] a3 = aVar2.a();
        if (a3 != null) {
            i.i(a3, aVar, i7, i8 + i7);
        } else {
            k.m();
            throw null;
        }
    }

    public final void b(h hVar, long j2, g gVar) {
        k.f(hVar, "source");
        k.f(gVar, "sink");
        a aVar = c;
        int i2 = 0;
        int i3 = 0;
        for (long j3 = 0; j3 < j2; j3++) {
            i2 = (i2 << 8) | b.b(hVar.readByte(), 255);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = i3 - 8;
                int i5 = (i2 >>> i4) & 255;
                a[] a2 = aVar.a();
                if (a2 != null) {
                    aVar = a2[i5];
                    if (aVar == null) {
                        k.m();
                        throw null;
                    } else if (aVar.a() == null) {
                        gVar.R(aVar.b());
                        i3 -= aVar.c();
                        aVar = c;
                    } else {
                        i3 = i4;
                    }
                } else {
                    k.m();
                    throw null;
                }
            }
        }
        while (i3 > 0) {
            int i6 = (i2 << (8 - i3)) & 255;
            a[] a3 = aVar.a();
            if (a3 != null) {
                a aVar2 = a3[i6];
                if (aVar2 == null) {
                    k.m();
                    throw null;
                } else if (aVar2.a() == null && aVar2.c() <= i3) {
                    gVar.R(aVar2.b());
                    i3 -= aVar2.c();
                    aVar = c;
                } else {
                    return;
                }
            } else {
                k.m();
                throw null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(l.i r9, l.g r10) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.k.f(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.k.f(r10, r0)
            int r0 = r9.G()
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L_0x0013:
            if (r1 >= r0) goto L_0x003b
            byte r5 = r9.l(r1)
            r6 = 255(0xff, float:3.57E-43)
            int r5 = k.h0.b.b(r5, r6)
            int[] r6 = a
            r6 = r6[r5]
            byte[] r7 = b
            byte r5 = r7[r5]
            long r3 = r3 << r5
            long r6 = (long) r6
            long r3 = r3 | r6
            int r2 = r2 + r5
        L_0x002b:
            r5 = 8
            if (r2 < r5) goto L_0x0038
            int r2 = r2 + -8
            long r5 = r3 >> r2
            int r6 = (int) r5
            r10.R(r6)
            goto L_0x002b
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x003b:
            if (r2 <= 0) goto L_0x004a
            int r9 = 8 - r2
            long r0 = r3 << r9
            r3 = 255(0xff, double:1.26E-321)
            long r2 = r3 >>> r2
            long r0 = r0 | r2
            int r9 = (int) r0
            r10.R(r9)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.j.c(l.i, l.g):void");
    }

    public final int d(i iVar) {
        k.f(iVar, "bytes");
        int G = iVar.G();
        long j2 = 0;
        for (int i2 = 0; i2 < G; i2++) {
            j2 += (long) b[b.b(iVar.l(i2), 255)];
        }
        return (int) ((j2 + ((long) 7)) >> 3);
    }

    /* compiled from: Huffman.kt */
    private static final class a {
        private final a[] a;
        private final int b;
        private final int c;

        public a() {
            this.a = new a[256];
            this.b = 0;
            this.c = 0;
        }

        public final a[] a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public a(int i2, int i3) {
            this.a = null;
            this.b = i2;
            int i4 = i3 & 7;
            this.c = i4 == 0 ? 8 : i4;
        }
    }
}
