package l.d0;

import kotlin.jvm.internal.k;
import l.b;
import l.f;
import l.s;
import l.w;

/* compiled from: Buffer.kt */
public final class a {
    private static final byte[] a = b.a("0123456789abcdef");

    public static final byte[] a() {
        return a;
    }

    public static final boolean b(w wVar, int i2, byte[] bArr, int i3, int i4) {
        k.f(wVar, "segment");
        k.f(bArr, "bytes");
        int i5 = wVar.c;
        byte[] bArr2 = wVar.a;
        while (i3 < i4) {
            if (i2 == i5) {
                wVar = wVar.f11136f;
                if (wVar != null) {
                    byte[] bArr3 = wVar.a;
                    int i6 = wVar.b;
                    bArr2 = bArr3;
                    i2 = i6;
                    i5 = wVar.c;
                } else {
                    k.m();
                    throw null;
                }
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public static final String c(f fVar, long j2) {
        k.f(fVar, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (fVar.b0(j3) == ((byte) 13)) {
                String Q0 = fVar.Q0(j3);
                fVar.x(2);
                return Q0;
            }
        }
        String Q02 = fVar.Q0(j2);
        fVar.x(1);
        return Q02;
    }

    public static final int d(f fVar, s sVar, boolean z) {
        int i2;
        int i3;
        int i4;
        w wVar;
        int i5;
        f fVar2 = fVar;
        k.f(fVar2, "$this$selectPrefix");
        k.f(sVar, "options");
        w wVar2 = fVar2.f11099g;
        if (wVar2 != null) {
            byte[] bArr = wVar2.a;
            int i6 = wVar2.b;
            int i7 = wVar2.c;
            int[] i8 = sVar.i();
            w wVar3 = wVar2;
            int i9 = 0;
            int i10 = -1;
            loop0:
            while (true) {
                int i11 = i9 + 1;
                int i12 = i8[i9];
                int i13 = i11 + 1;
                int i14 = i8[i11];
                if (i14 != -1) {
                    i10 = i14;
                }
                if (wVar3 == null) {
                    break;
                }
                if (i12 < 0) {
                    int i15 = i13 + (i12 * -1);
                    while (true) {
                        int i16 = i6 + 1;
                        int i17 = i13 + 1;
                        if ((bArr[i6] & 255) != i8[i13]) {
                            return i10;
                        }
                        boolean z2 = i17 == i15;
                        if (i16 != i7) {
                            w wVar4 = wVar3;
                            i4 = i7;
                            i5 = i16;
                            wVar = wVar4;
                        } else if (wVar3 != null) {
                            w wVar5 = wVar3.f11136f;
                            if (wVar5 != null) {
                                i5 = wVar5.b;
                                byte[] bArr2 = wVar5.a;
                                i4 = wVar5.c;
                                if (wVar5 != wVar2) {
                                    byte[] bArr3 = bArr2;
                                    wVar = wVar5;
                                    bArr = bArr3;
                                } else if (!z2) {
                                    break loop0;
                                } else {
                                    bArr = bArr2;
                                    wVar = null;
                                }
                            } else {
                                k.m();
                                throw null;
                            }
                        } else {
                            k.m();
                            throw null;
                        }
                        if (z2) {
                            i3 = i8[i17];
                            i2 = i5;
                            i7 = i4;
                            wVar3 = wVar;
                            break;
                        }
                        i6 = i5;
                        i7 = i4;
                        i13 = i17;
                        wVar3 = wVar;
                    }
                } else {
                    i2 = i6 + 1;
                    byte b = bArr[i6] & 255;
                    int i18 = i13 + i12;
                    while (i13 != i18) {
                        if (b == i8[i13]) {
                            i3 = i8[i13 + i12];
                            if (i2 == i7) {
                                wVar3 = wVar3.f11136f;
                                if (wVar3 != null) {
                                    i2 = wVar3.b;
                                    bArr = wVar3.a;
                                    i7 = wVar3.c;
                                    if (wVar3 == wVar2) {
                                        wVar3 = null;
                                    }
                                } else {
                                    k.m();
                                    throw null;
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                    return i10;
                }
                if (i3 >= 0) {
                    return i3;
                }
                i9 = -i3;
                i6 = i2;
            }
            if (z) {
                return -2;
            }
            return i10;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    public static /* synthetic */ int e(f fVar, s sVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return d(fVar, sVar, z);
    }
}
