package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class p5 {
    static int a(int i2, byte[] bArr, int i3, int i4, s5 s5Var) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                return k(bArr, i3, s5Var);
            }
            if (i5 == 1) {
                return i3 + 8;
            }
            if (i5 == 2) {
                return i(bArr, i3, s5Var) + s5Var.a;
            }
            if (i5 == 3) {
                int i6 = (i2 & -8) | 4;
                int i7 = 0;
                while (i3 < i4) {
                    i3 = i(bArr, i3, s5Var);
                    i7 = s5Var.a;
                    if (i7 == i6) {
                        break;
                    }
                    i3 = a(i7, bArr, i3, i4, s5Var);
                }
                if (i3 <= i4 && i7 == i6) {
                    return i3;
                }
                throw zzig.e();
            } else if (i5 == 5) {
                return i3 + 4;
            } else {
                throw zzig.c();
            }
        } else {
            throw zzig.c();
        }
    }

    static int b(int i2, byte[] bArr, int i3, int i4, h7<?> h7Var, s5 s5Var) {
        c7 c7Var = (c7) h7Var;
        int i5 = i(bArr, i3, s5Var);
        c7Var.g(s5Var.a);
        while (i5 < i4) {
            int i6 = i(bArr, i5, s5Var);
            if (i2 != s5Var.a) {
                break;
            }
            i5 = i(bArr, i6, s5Var);
            c7Var.g(s5Var.a);
        }
        return i5;
    }

    static int c(int i2, byte[] bArr, int i3, int i4, s9 s9Var, s5 s5Var) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int k2 = k(bArr, i3, s5Var);
                s9Var.c(i2, Long.valueOf(s5Var.b));
                return k2;
            } else if (i5 == 1) {
                s9Var.c(i2, Long.valueOf(l(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int i6 = i(bArr, i3, s5Var);
                int i7 = s5Var.a;
                if (i7 < 0) {
                    throw zzig.b();
                } else if (i7 <= bArr.length - i6) {
                    if (i7 == 0) {
                        s9Var.c(i2, t5.f2545h);
                    } else {
                        s9Var.c(i2, t5.j(bArr, i6, i7));
                    }
                    return i6 + i7;
                } else {
                    throw zzig.a();
                }
            } else if (i5 == 3) {
                s9 g2 = s9.g();
                int i8 = (i2 & -8) | 4;
                int i9 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int i10 = i(bArr, i3, s5Var);
                    int i11 = s5Var.a;
                    i9 = i11;
                    if (i11 == i8) {
                        i3 = i10;
                        break;
                    }
                    int c = c(i9, bArr, i10, i4, g2, s5Var);
                    i9 = i11;
                    i3 = c;
                }
                if (i3 > i4 || i9 != i8) {
                    throw zzig.e();
                }
                s9Var.c(i2, g2);
                return i3;
            } else if (i5 == 5) {
                s9Var.c(i2, Integer.valueOf(h(bArr, i3)));
                return i3 + 4;
            } else {
                throw zzig.c();
            }
        } else {
            throw zzig.c();
        }
    }

    static int d(int i2, byte[] bArr, int i3, s5 s5Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            s5Var.a = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            s5Var.a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            s5Var.a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            s5Var.a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                s5Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    static int e(y8<?> y8Var, int i2, byte[] bArr, int i3, int i4, h7<?> h7Var, s5 s5Var) {
        int g2 = g(y8Var, bArr, i3, i4, s5Var);
        h7Var.add(s5Var.c);
        while (g2 < i4) {
            int i5 = i(bArr, g2, s5Var);
            if (i2 != s5Var.a) {
                break;
            }
            g2 = g(y8Var, bArr, i5, i4, s5Var);
            h7Var.add(s5Var.c);
        }
        return g2;
    }

    static int f(y8 y8Var, byte[] bArr, int i2, int i3, int i4, s5 s5Var) {
        n8 n8Var = (n8) y8Var;
        Object b = n8Var.b();
        int o = n8Var.o(b, bArr, i2, i3, i4, s5Var);
        n8Var.e(b);
        s5Var.c = b;
        return o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int g(com.google.android.gms.internal.measurement.y8 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.s5 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = d(r8, r7, r0, r10)
            int r8 = r10.a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.b()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.g(r1, r2, r3, r4, r5)
            r6.e(r9)
            r10.c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzig r6 = com.google.android.gms.internal.measurement.zzig.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.g(com.google.android.gms.internal.measurement.y8, byte[], int, int, com.google.android.gms.internal.measurement.s5):int");
    }

    static int h(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i2, s5 s5Var) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return d(b, bArr, i3, s5Var);
        }
        s5Var.a = b;
        return i3;
    }

    static int j(byte[] bArr, int i2, h7<?> h7Var, s5 s5Var) {
        c7 c7Var = (c7) h7Var;
        int i3 = i(bArr, i2, s5Var);
        int i4 = s5Var.a + i3;
        while (i3 < i4) {
            i3 = i(bArr, i3, s5Var);
            c7Var.g(s5Var.a);
        }
        if (i3 == i4) {
            return i3;
        }
        throw zzig.a();
    }

    static int k(byte[] bArr, int i2, s5 s5Var) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 >= 0) {
            s5Var.b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b < 0) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i5;
            int i7 = i6;
            b = b2;
            i4 = i7;
        }
        s5Var.b = j3;
        return i4;
    }

    static long l(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static double m(byte[] bArr, int i2) {
        return Double.longBitsToDouble(l(bArr, i2));
    }

    static int n(byte[] bArr, int i2, s5 s5Var) {
        int i3 = i(bArr, i2, s5Var);
        int i4 = s5Var.a;
        if (i4 < 0) {
            throw zzig.b();
        } else if (i4 == 0) {
            s5Var.c = "";
            return i3;
        } else {
            s5Var.c = new String(bArr, i3, i4, b7.a);
            return i3 + i4;
        }
    }

    static float o(byte[] bArr, int i2) {
        return Float.intBitsToFloat(h(bArr, i2));
    }

    static int p(byte[] bArr, int i2, s5 s5Var) {
        int i3 = i(bArr, i2, s5Var);
        int i4 = s5Var.a;
        if (i4 < 0) {
            throw zzig.b();
        } else if (i4 == 0) {
            s5Var.c = "";
            return i3;
        } else {
            s5Var.c = y9.k(bArr, i3, i4);
            return i3 + i4;
        }
    }

    static int q(byte[] bArr, int i2, s5 s5Var) {
        int i3 = i(bArr, i2, s5Var);
        int i4 = s5Var.a;
        if (i4 < 0) {
            throw zzig.b();
        } else if (i4 > bArr.length - i3) {
            throw zzig.a();
        } else if (i4 == 0) {
            s5Var.c = t5.f2545h;
            return i3;
        } else {
            s5Var.c = t5.j(bArr, i3, i4);
            return i3 + i4;
        }
    }
}
