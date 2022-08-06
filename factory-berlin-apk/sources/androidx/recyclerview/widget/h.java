package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: DiffUtil */
public class h {
    private static final Comparator<g> a = new a();

    /* compiled from: DiffUtil */
    static class a implements Comparator<g> {
        a() {
        }

        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            int i2 = gVar.a - gVar2.a;
            return i2 == 0 ? gVar.b - gVar2.b : i2;
        }
    }

    /* compiled from: DiffUtil */
    public static abstract class b {
        public abstract boolean a(int i2, int i3);

        public abstract boolean b(int i2, int i3);

        public abstract Object c(int i2, int i3);

        public abstract int d();

        public abstract int e();
    }

    /* compiled from: DiffUtil */
    public static class c {
        private final List<g> a;
        private final int[] b;
        private final int[] c;

        /* renamed from: d  reason: collision with root package name */
        private final b f1282d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1283e;

        /* renamed from: f  reason: collision with root package name */
        private final int f1284f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f1285g;

        c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.c, 0);
            this.f1282d = bVar;
            this.f1283e = bVar.e();
            this.f1284f = bVar.d();
            this.f1285g = z;
            a();
            h();
        }

        private void a() {
            g gVar = this.a.isEmpty() ? null : this.a.get(0);
            if (gVar == null || gVar.a != 0 || gVar.b != 0) {
                g gVar2 = new g();
                gVar2.a = 0;
                gVar2.b = 0;
                gVar2.f1287d = false;
                gVar2.c = 0;
                gVar2.f1288e = false;
                this.a.add(0, gVar2);
            }
        }

        private void c(List<e> list, r rVar, int i2, int i3, int i4) {
            if (!this.f1285g) {
                rVar.c(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int i6 = i4 + i5;
                int i7 = this.c[i6] & 31;
                if (i7 == 0) {
                    rVar.c(i2, 1);
                    for (e eVar : list) {
                        eVar.b++;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = this.c[i6] >> 5;
                    rVar.b(j(list, i8, true).b, i2);
                    if (i7 == 4) {
                        rVar.d(i2, 1, this.f1282d.c(i8, i6));
                    }
                } else if (i7 == 16) {
                    list.add(new e(i6, i2, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString((long) i7));
                }
            }
        }

        private void d(List<e> list, r rVar, int i2, int i3, int i4) {
            if (!this.f1285g) {
                rVar.a(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int i6 = i4 + i5;
                int i7 = this.b[i6] & 31;
                if (i7 == 0) {
                    rVar.a(i2 + i5, 1);
                    for (e eVar : list) {
                        eVar.b--;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = this.b[i6] >> 5;
                    e j2 = j(list, i8, false);
                    rVar.b(i2 + i5, j2.b - 1);
                    if (i7 == 4) {
                        rVar.d(j2.b - 1, 1, this.f1282d.c(i6, i8));
                    }
                } else if (i7 == 16) {
                    list.add(new e(i6, i2 + i5, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString((long) i7));
                }
            }
        }

        private void f(int i2, int i3, int i4) {
            if (this.b[i2 - 1] == 0) {
                g(i2, i3, i4, false);
            }
        }

        private boolean g(int i2, int i3, int i4, boolean z) {
            int i5;
            int i6;
            if (z) {
                i3--;
                i5 = i2;
                i6 = i3;
            } else {
                i6 = i2 - 1;
                i5 = i6;
            }
            while (i4 >= 0) {
                g gVar = this.a.get(i4);
                int i7 = gVar.a;
                int i8 = gVar.c;
                int i9 = i7 + i8;
                int i10 = gVar.b + i8;
                int i11 = 8;
                if (z) {
                    for (int i12 = i5 - 1; i12 >= i9; i12--) {
                        if (this.f1282d.b(i12, i6)) {
                            if (!this.f1282d.a(i12, i6)) {
                                i11 = 4;
                            }
                            this.c[i6] = (i12 << 5) | 16;
                            this.b[i12] = (i6 << 5) | i11;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i13 = i3 - 1; i13 >= i10; i13--) {
                        if (this.f1282d.b(i6, i13)) {
                            if (!this.f1282d.a(i6, i13)) {
                                i11 = 4;
                            }
                            int i14 = i2 - 1;
                            this.b[i14] = (i13 << 5) | 16;
                            this.c[i13] = (i14 << 5) | i11;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = gVar.a;
                i3 = gVar.b;
                i4--;
            }
            return false;
        }

        private void h() {
            int i2 = this.f1283e;
            int i3 = this.f1284f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                g gVar = this.a.get(size);
                int i4 = gVar.a;
                int i5 = gVar.c;
                int i6 = i4 + i5;
                int i7 = gVar.b + i5;
                if (this.f1285g) {
                    while (i2 > i6) {
                        f(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i7) {
                        i(i2, i3, size);
                        i3--;
                    }
                }
                for (int i8 = 0; i8 < gVar.c; i8++) {
                    int i9 = gVar.a + i8;
                    int i10 = gVar.b + i8;
                    int i11 = this.f1282d.a(i9, i10) ? 1 : 2;
                    this.b[i9] = (i10 << 5) | i11;
                    this.c[i10] = (i9 << 5) | i11;
                }
                i2 = gVar.a;
                i3 = gVar.b;
            }
        }

        private void i(int i2, int i3, int i4) {
            if (this.c[i3 - 1] == 0) {
                g(i2, i3, i4, true);
            }
        }

        private static e j(List<e> list, int i2, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.a == i2 && eVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public int b(int i2) {
            if (i2 < 0 || i2 >= this.f1283e) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i2 + ", old list size = " + this.f1283e);
            }
            int i3 = this.b[i2];
            if ((i3 & 31) == 0) {
                return -1;
            }
            return i3 >> 5;
        }

        public void e(r rVar) {
            e eVar;
            if (rVar instanceof e) {
                eVar = (e) rVar;
            } else {
                eVar = new e(rVar);
            }
            ArrayList arrayList = new ArrayList();
            int i2 = this.f1283e;
            int i3 = this.f1284f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                g gVar = this.a.get(size);
                int i4 = gVar.c;
                int i5 = gVar.a + i4;
                int i6 = gVar.b + i4;
                if (i5 < i2) {
                    d(arrayList, eVar, i5, i2 - i5, i5);
                }
                if (i6 < i3) {
                    c(arrayList, eVar, i5, i3 - i6, i6);
                }
                for (int i7 = i4 - 1; i7 >= 0; i7--) {
                    int[] iArr = this.b;
                    int i8 = gVar.a;
                    if ((iArr[i8 + i7] & 31) == 2) {
                        eVar.d(i8 + i7, 1, this.f1282d.c(i8 + i7, gVar.b + i7));
                    }
                }
                i2 = gVar.a;
                i3 = gVar.b;
            }
            eVar.e();
        }
    }

    /* compiled from: DiffUtil */
    public static abstract class d<T> {
        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);

        public Object c(T t, T t2) {
            return null;
        }
    }

    /* compiled from: DiffUtil */
    private static class e {
        int a;
        int b;
        boolean c;

        public e(int i2, int i3, boolean z) {
            this.a = i2;
            this.b = i3;
            this.c = z;
        }
    }

    /* compiled from: DiffUtil */
    static class f {
        int a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f1286d;

        public f() {
        }

        public f(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.f1286d = i5;
        }
    }

    /* compiled from: DiffUtil */
    static class g {
        int a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1287d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1288e;

        g() {
        }
    }

    public static c a(b bVar) {
        return b(bVar, true);
    }

    public static c b(b bVar, boolean z) {
        f fVar;
        int e2 = bVar.e();
        int d2 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(0, e2, 0, d2));
        int abs = e2 + d2 + Math.abs(e2 - d2);
        int i2 = abs * 2;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            f fVar2 = (f) arrayList2.remove(arrayList2.size() - 1);
            g c2 = c(bVar, fVar2.a, fVar2.b, fVar2.c, fVar2.f1286d, iArr, iArr2, abs);
            if (c2 != null) {
                if (c2.c > 0) {
                    arrayList.add(c2);
                }
                c2.a += fVar2.a;
                c2.b += fVar2.c;
                if (arrayList3.isEmpty()) {
                    fVar = new f();
                } else {
                    fVar = (f) arrayList3.remove(arrayList3.size() - 1);
                }
                fVar.a = fVar2.a;
                fVar.c = fVar2.c;
                if (c2.f1288e) {
                    fVar.b = c2.a;
                    fVar.f1286d = c2.b;
                } else if (c2.f1287d) {
                    fVar.b = c2.a - 1;
                    fVar.f1286d = c2.b;
                } else {
                    fVar.b = c2.a;
                    fVar.f1286d = c2.b - 1;
                }
                arrayList2.add(fVar);
                if (!c2.f1288e) {
                    int i3 = c2.a;
                    int i4 = c2.c;
                    fVar2.a = i3 + i4;
                    fVar2.c = c2.b + i4;
                } else if (c2.f1287d) {
                    int i5 = c2.a;
                    int i6 = c2.c;
                    fVar2.a = i5 + i6 + 1;
                    fVar2.c = c2.b + i6;
                } else {
                    int i7 = c2.a;
                    int i8 = c2.c;
                    fVar2.a = i7 + i8;
                    fVar2.c = c2.b + i8 + 1;
                }
                arrayList2.add(fVar2);
            } else {
                arrayList3.add(fVar2);
            }
        }
        Collections.sort(arrayList, a);
        return new c(bVar, arrayList, iArr, iArr2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[LOOP:1: B:10:0x0033->B:33:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.h.g c(androidx.recyclerview.widget.h.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x012f
            if (r4 >= r5) goto L_0x0011
            goto L_0x012f
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x0127
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a0
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009a
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009a
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009a
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009a
            androidx.recyclerview.widget.h$g r0 = new androidx.recyclerview.widget.h$g
            r0.<init>()
            r3 = r2[r5]
            r0.a = r3
            int r3 = r3 - r12
            r0.b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.c = r1
            r0.f1287d = r14
            r13 = 0
            r0.f1288e = r13
            return r0
        L_0x009a:
            r13 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a0:
            r13 = 0
            r5 = r11
        L_0x00a2:
            if (r5 > r9) goto L_0x011c
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c4
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00bb
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 >= r12) goto L_0x00bc
            goto L_0x00c5
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = 1
            goto L_0x00cb
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = 0
        L_0x00cb:
            int r16 = r12 - r10
        L_0x00cd:
            if (r12 <= 0) goto L_0x00ea
            if (r16 <= 0) goto L_0x00ea
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.b(r13, r3)
            if (r3 == 0) goto L_0x00ec
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cd
        L_0x00ea:
            r18 = r3
        L_0x00ec:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0115
            if (r10 < r11) goto L_0x0115
            if (r10 > r9) goto L_0x0115
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0115
            androidx.recyclerview.widget.h$g r0 = new androidx.recyclerview.widget.h$g
            r0.<init>()
            r4 = r2[r3]
            r0.a = r4
            int r4 = r4 - r10
            r0.b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.c = r1
            r0.f1287d = r14
            r3 = 1
            r0.f1288e = r3
            return r0
        L_0x0115:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a2
        L_0x011c:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.c(androidx.recyclerview.widget.h$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.h$g");
    }
}
