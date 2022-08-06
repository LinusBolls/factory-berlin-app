package com.google.android.gms.internal.measurement;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class q4<K, V> extends h4<K, V> {

    /* renamed from: m  reason: collision with root package name */
    static final h4<Object, Object> f2495m = new q4((Object) null, new Object[0], 0);

    /* renamed from: j  reason: collision with root package name */
    private final transient Object f2496j;

    /* renamed from: k  reason: collision with root package name */
    private final transient Object[] f2497k;

    /* renamed from: l  reason: collision with root package name */
    private final transient int f2498l;

    private q4(Object obj, Object[] objArr, int i2) {
        this.f2496j = obj;
        this.f2497k = objArr;
        this.f2498l = i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v3 ?, r2v5 ?, r2v4 ?, r2v6 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    static <K, V> com.google.android.gms.internal.measurement.q4<K, V> d(int r10, java.lang.Object[] r11) {
        /*
            if (r10 != 0) goto L_0x0007
            com.google.android.gms.internal.measurement.h4<java.lang.Object, java.lang.Object> r10 = f2495m
            com.google.android.gms.internal.measurement.q4 r10 = (com.google.android.gms.internal.measurement.q4) r10
            return r10
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 != r2) goto L_0x0019
            r10 = r11[r1]
            r1 = r11[r2]
            com.google.android.gms.internal.measurement.n3.a(r10, r1)
            com.google.android.gms.internal.measurement.q4 r10 = new com.google.android.gms.internal.measurement.q4
            r10.<init>(r0, r11, r2)
            return r10
        L_0x0019:
            int r3 = r11.length
            int r3 = r3 >> r2
            com.google.android.gms.internal.measurement.b3.g(r10, r3)
            int r3 = com.google.android.gms.internal.measurement.l4.k(r10)
            if (r10 != r2) goto L_0x002d
            r1 = r11[r1]
            r2 = r11[r2]
            com.google.android.gms.internal.measurement.n3.a(r1, r2)
            goto L_0x00e1
        L_0x002d:
            int r0 = r3 + -1
            r2 = 128(0x80, float:1.794E-43)
            r4 = -1
            if (r3 > r2) goto L_0x006f
            byte[] r2 = new byte[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x0039:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.measurement.n3.a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.measurement.z3.a(r6)
        L_0x004e:
            r6 = r6 & r0
            byte r7 = r2[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x005c
            byte r3 = (byte) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0039
        L_0x005c:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0067
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0067:
            java.lang.IllegalArgumentException r10 = e(r4, r5, r11, r7)
            throw r10
        L_0x006c:
            r0 = r2
            goto L_0x00e1
        L_0x006f:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r3 > r2) goto L_0x00ad
            short[] r2 = new short[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x0079:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.measurement.n3.a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.measurement.z3.a(r6)
        L_0x008e:
            r6 = r6 & r0
            short r7 = r2[r6]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x009d
            short r3 = (short) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0079
        L_0x009d:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00a8
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00a8:
            java.lang.IllegalArgumentException r10 = e(r4, r5, r11, r7)
            throw r10
        L_0x00ad:
            int[] r2 = new int[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x00b2:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r5 = r11[r3]
            r6 = r3 ^ 1
            r6 = r11[r6]
            com.google.android.gms.internal.measurement.n3.a(r5, r6)
            int r7 = r5.hashCode()
            int r7 = com.google.android.gms.internal.measurement.z3.a(r7)
        L_0x00c7:
            r7 = r7 & r0
            r8 = r2[r7]
            if (r8 != r4) goto L_0x00d1
            r2[r7] = r3
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00d1:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x00dc
            int r7 = r7 + 1
            goto L_0x00c7
        L_0x00dc:
            java.lang.IllegalArgumentException r10 = e(r5, r6, r11, r8)
            throw r10
        L_0x00e1:
            com.google.android.gms.internal.measurement.q4 r1 = new com.google.android.gms.internal.measurement.q4
            r1.<init>(r0, r11, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q4.d(int, java.lang.Object[]):com.google.android.gms.internal.measurement.q4");
    }

    private static IllegalArgumentException e(Object obj, Object obj2, Object[] objArr, int i2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i2]);
        String valueOf4 = String.valueOf(objArr[i2 ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final l4<Map.Entry<K, V>> a() {
        return new t4(this, this.f2497k, 0, this.f2498l);
    }

    /* access modifiers changed from: package-private */
    public final l4<K> b() {
        return new v4(this, new u4(this.f2497k, 0, this.f2498l));
    }

    /* access modifiers changed from: package-private */
    public final c4<V> c() {
        return new u4(this.f2497k, 1, this.f2498l);
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.f2496j;
        V[] vArr = this.f2497k;
        int i2 = this.f2498l;
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a = z3.a(obj.hashCode());
                while (true) {
                    int i3 = a & length;
                    byte b = bArr[i3] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (vArr[b].equals(obj)) {
                        return vArr[b ^ 1];
                    }
                    a = i3 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a2 = z3.a(obj.hashCode());
                while (true) {
                    int i4 = a2 & length2;
                    short s = sArr[i4] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr[s].equals(obj)) {
                        return vArr[s ^ 1];
                    }
                    a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a3 = z3.a(obj.hashCode());
                while (true) {
                    int i5 = a3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (vArr[i6].equals(obj)) {
                        return vArr[i6 ^ 1];
                    }
                    a3 = i5 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.f2498l;
    }
}
