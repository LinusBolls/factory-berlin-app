package com.squareup.moshi;

import com.squareup.moshi.g;
import java.io.EOFException;
import java.math.BigDecimal;
import l.f;
import l.h;

/* compiled from: JsonUtf8Reader */
final class i extends g {
    private static final l.i s = l.i.k("'\\");
    private static final l.i t = l.i.k("\"\\");
    private static final l.i u = l.i.k("{}[]:, \n\t\r\f/\\;#=");
    private static final l.i v = l.i.k("\n\r");
    private static final l.i w = l.i.k("*/");

    /* renamed from: m  reason: collision with root package name */
    private final h f8121m;

    /* renamed from: n  reason: collision with root package name */
    private final f f8122n;
    private int o = 0;
    private long p;
    private int q;
    private String r;

    i(h hVar) {
        if (hVar != null) {
            this.f8121m = hVar;
            this.f8122n = hVar.d();
            D(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private String F0(l.i iVar) {
        StringBuilder sb = null;
        while (true) {
            long c0 = this.f8121m.c0(iVar);
            if (c0 == -1) {
                b0("Unterminated string");
                throw null;
            } else if (this.f8122n.b0(c0) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f8122n.Q0(c0));
                this.f8122n.readByte();
                sb.append(J0());
            } else if (sb == null) {
                String Q0 = this.f8122n.Q0(c0);
                this.f8122n.readByte();
                return Q0;
            } else {
                sb.append(this.f8122n.Q0(c0));
                this.f8122n.readByte();
                return sb.toString();
            }
        }
    }

    private String G0() {
        long c0 = this.f8121m.c0(u);
        return c0 != -1 ? this.f8122n.Q0(c0) : this.f8122n.P0();
    }

    private int H0() {
        String str;
        String str2;
        int i2;
        byte b0 = this.f8122n.b0(0);
        if (b0 == 116 || b0 == 84) {
            i2 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (b0 == 102 || b0 == 70) {
            i2 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (b0 != 110 && b0 != 78) {
            return 0;
        } else {
            i2 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.f8121m.C((long) i4)) {
                return 0;
            }
            byte b02 = this.f8122n.b0((long) i3);
            if (b02 != str2.charAt(i3) && b02 != str.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.f8121m.C((long) (length + 1)) && t0(this.f8122n.b0((long) length))) {
            return 0;
        }
        this.f8122n.x((long) length);
        this.o = i2;
        return i2;
    }

    private int I0() {
        byte b0;
        boolean z = true;
        int i2 = 0;
        long j2 = 0;
        int i3 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i4 = i3 + 1;
            if (!this.f8121m.C((long) i4)) {
                break;
            }
            b0 = this.f8122n.b0((long) i3);
            if (b0 != 43) {
                if (b0 != 69 && b0 != 101) {
                    if (b0 != 45) {
                        if (b0 != 46) {
                            if (b0 >= 48 && b0 <= 57) {
                                if (c == z || c == 0) {
                                    j2 = (long) (-(b0 - 48));
                                    i2 = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j2 == 0) {
                                            return i2;
                                        }
                                        long j3 = (10 * j2) - ((long) (b0 - 48));
                                        int i5 = (j2 > -922337203685477580L ? 1 : (j2 == -922337203685477580L ? 0 : -1));
                                        z2 &= i5 > 0 || (i5 == 0 && j3 < j2);
                                        j2 = j3;
                                    } else if (c == 3) {
                                        i2 = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i2 = 0;
                                        c = 7;
                                    }
                                    i2 = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i2;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i2;
                    }
                    i3 = i4;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i2;
                } else {
                    c = 5;
                    i3 = i4;
                    z = true;
                }
            } else if (c != 5) {
                return i2;
            }
            c = 6;
            i3 = i4;
            z = true;
        }
        if (t0(b0)) {
            return 0;
        }
        if (c == 2 && z2 && ((j2 != Long.MIN_VALUE || z3) && (j2 != 0 || !z3))) {
            if (!z3) {
                j2 = -j2;
            }
            this.p = j2;
            this.f8122n.x((long) i3);
            this.o = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.q = i3;
            this.o = 17;
            return 17;
        }
    }

    private char J0() {
        int i2;
        int i3;
        if (this.f8121m.C(1)) {
            byte readByte = this.f8122n.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f8111k) {
                    return (char) readByte;
                }
                b0("Invalid escape sequence: \\" + ((char) readByte));
                throw null;
            } else if (this.f8121m.C(4)) {
                char c = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    byte b0 = this.f8122n.b0((long) i4);
                    char c2 = (char) (c << 4);
                    if (b0 < 48 || b0 > 57) {
                        if (b0 >= 97 && b0 <= 102) {
                            i2 = b0 - 97;
                        } else if (b0 < 65 || b0 > 70) {
                            b0("\\u" + this.f8122n.Q0(4));
                            throw null;
                        } else {
                            i2 = b0 - 65;
                        }
                        i3 = i2 + 10;
                    } else {
                        i3 = b0 - 48;
                    }
                    c = (char) (c2 + i3);
                }
                this.f8122n.x(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            b0("Unterminated escape sequence");
            throw null;
        }
    }

    private void K0(l.i iVar) {
        while (true) {
            long c0 = this.f8121m.c0(iVar);
            if (c0 == -1) {
                b0("Unterminated string");
                throw null;
            } else if (this.f8122n.b0(c0) == 92) {
                this.f8122n.x(c0 + 1);
                J0();
            } else {
                this.f8122n.x(c0 + 1);
                return;
            }
        }
    }

    private boolean L0() {
        long P = this.f8121m.P(w);
        boolean z = P != -1;
        f fVar = this.f8122n;
        fVar.x(z ? P + ((long) w.G()) : fVar.T0());
        return z;
    }

    private void M0() {
        long c0 = this.f8121m.c0(v);
        f fVar = this.f8122n;
        fVar.x(c0 != -1 ? c0 + 1 : fVar.T0());
    }

    private void N0() {
        long c0 = this.f8121m.c0(u);
        f fVar = this.f8122n;
        if (c0 == -1) {
            c0 = fVar.T0();
        }
        fVar.x(c0);
    }

    private void i0() {
        if (!this.f8111k) {
            b0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    private int l0() {
        int[] iArr = this.f8108h;
        int i2 = this.f8107g;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int w0 = w0(true);
            this.f8122n.readByte();
            if (w0 != 44) {
                if (w0 == 59) {
                    i0();
                } else if (w0 == 93) {
                    this.o = 4;
                    return 4;
                } else {
                    b0("Unterminated array");
                    throw null;
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            this.f8108h[this.f8107g - 1] = 4;
            if (i3 == 5) {
                int w02 = w0(true);
                this.f8122n.readByte();
                if (w02 != 44) {
                    if (w02 == 59) {
                        i0();
                    } else if (w02 == 125) {
                        this.o = 2;
                        return 2;
                    } else {
                        b0("Unterminated object");
                        throw null;
                    }
                }
            }
            int w03 = w0(true);
            if (w03 == 34) {
                this.f8122n.readByte();
                this.o = 13;
                return 13;
            } else if (w03 == 39) {
                this.f8122n.readByte();
                i0();
                this.o = 12;
                return 12;
            } else if (w03 != 125) {
                i0();
                if (t0((char) w03)) {
                    this.o = 14;
                    return 14;
                }
                b0("Expected name");
                throw null;
            } else if (i3 != 5) {
                this.f8122n.readByte();
                this.o = 2;
                return 2;
            } else {
                b0("Expected name");
                throw null;
            }
        } else if (i3 == 4) {
            iArr[i2 - 1] = 5;
            int w04 = w0(true);
            this.f8122n.readByte();
            if (w04 != 58) {
                if (w04 == 61) {
                    i0();
                    if (this.f8121m.C(1) && this.f8122n.b0(0) == 62) {
                        this.f8122n.readByte();
                    }
                } else {
                    b0("Expected ':'");
                    throw null;
                }
            }
        } else if (i3 == 6) {
            iArr[i2 - 1] = 7;
        } else if (i3 == 7) {
            if (w0(false) == -1) {
                this.o = 18;
                return 18;
            }
            i0();
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int w05 = w0(true);
        if (w05 == 34) {
            this.f8122n.readByte();
            this.o = 9;
            return 9;
        } else if (w05 != 39) {
            if (!(w05 == 44 || w05 == 59)) {
                if (w05 == 91) {
                    this.f8122n.readByte();
                    this.o = 3;
                    return 3;
                } else if (w05 != 93) {
                    if (w05 != 123) {
                        int H0 = H0();
                        if (H0 != 0) {
                            return H0;
                        }
                        int I0 = I0();
                        if (I0 != 0) {
                            return I0;
                        }
                        if (t0(this.f8122n.b0(0))) {
                            i0();
                            this.o = 10;
                            return 10;
                        }
                        b0("Expected value");
                        throw null;
                    }
                    this.f8122n.readByte();
                    this.o = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.f8122n.readByte();
                    this.o = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                i0();
                this.o = 7;
                return 7;
            }
            b0("Unexpected value");
            throw null;
        } else {
            i0();
            this.f8122n.readByte();
            this.o = 8;
            return 8;
        }
    }

    private int n0(String str, g.b bVar) {
        int length = bVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(bVar.a[i2])) {
                this.o = 0;
                this.f8109i[this.f8107g - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private int r0(String str, g.b bVar) {
        int length = bVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(bVar.a[i2])) {
                this.o = 0;
                int[] iArr = this.f8110j;
                int i3 = this.f8107g - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
        }
        return -1;
    }

    private boolean t0(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i0();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f8122n.x((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f8121m.C(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        i0();
        r3 = r6.f8122n.b0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f8122n.readByte();
        r6.f8122n.readByte();
        M0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f8122n.readByte();
        r6.f8122n.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (L0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        b0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        i0();
        M0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int w0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            l.h r2 = r6.f8121m
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.C(r4)
            if (r2 == 0) goto L_0x0082
            l.f r2 = r6.f8122n
            long r4 = (long) r1
            byte r1 = r2.b0(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            l.f r2 = r6.f8122n
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.x(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            l.h r3 = r6.f8121m
            r4 = 2
            boolean r3 = r3.C(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.i0()
            l.f r3 = r6.f8122n
            r4 = 1
            byte r3 = r3.b0(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            l.f r1 = r6.f8122n
            r1.readByte()
            l.f r1 = r6.f8122n
            r1.readByte()
            r6.M0()
            goto L_0x0001
        L_0x005c:
            l.f r1 = r6.f8122n
            r1.readByte()
            l.f r1 = r6.f8122n
            r1.readByte()
            boolean r1 = r6.L0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            r6.b0(r7)
            r7 = 0
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.i0()
            r6.M0()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.i.w0(boolean):int");
    }

    public <T> T B0() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 7) {
            this.o = 0;
            int[] iArr = this.f8110j;
            int i3 = this.f8107g - 1;
            iArr[i3] = iArr[i3] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + y() + " at path " + getPath());
    }

    public int K(g.b bVar) {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return n0(this.r, bVar);
        }
        int E0 = this.f8121m.E0(bVar.b);
        if (E0 != -1) {
            this.o = 0;
            this.f8109i[this.f8107g - 1] = bVar.a[E0];
            return E0;
        }
        String str = this.f8109i[this.f8107g - 1];
        String nextName = nextName();
        int n0 = n0(nextName, bVar);
        if (n0 == -1) {
            this.o = 15;
            this.r = nextName;
            this.f8109i[this.f8107g - 1] = str;
        }
        return n0;
    }

    public int L(g.b bVar) {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 < 8 || i2 > 11) {
            return -1;
        }
        if (i2 == 11) {
            return r0(this.r, bVar);
        }
        int E0 = this.f8121m.E0(bVar.b);
        if (E0 != -1) {
            this.o = 0;
            int[] iArr = this.f8110j;
            int i3 = this.f8107g - 1;
            iArr[i3] = iArr[i3] + 1;
            return E0;
        }
        String nextString = nextString();
        int r0 = r0(nextString, bVar);
        if (r0 == -1) {
            this.o = 11;
            this.r = nextString;
            int[] iArr2 = this.f8110j;
            int i4 = this.f8107g - 1;
            iArr2[i4] = iArr2[i4] - 1;
        }
        return r0;
    }

    public void Z() {
        if (!this.f8112l) {
            int i2 = this.o;
            if (i2 == 0) {
                i2 = l0();
            }
            if (i2 == 14) {
                N0();
            } else if (i2 == 13) {
                K0(t);
            } else if (i2 == 12) {
                K0(s);
            } else if (i2 != 15) {
                throw new JsonDataException("Expected a name but was " + y() + " at path " + getPath());
            }
            this.o = 0;
            this.f8109i[this.f8107g - 1] = "null";
            return;
        }
        g.c y = y();
        nextName();
        throw new JsonDataException("Cannot skip unexpected " + y + " at " + getPath());
    }

    public void a() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 3) {
            D(1);
            this.f8110j[this.f8107g - 1] = 0;
            this.o = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + y() + " at path " + getPath());
    }

    public void b() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 1) {
            D(3);
            this.o = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + y() + " at path " + getPath());
    }

    public void close() {
        this.o = 0;
        this.f8108h[0] = 8;
        this.f8107g = 1;
        this.f8122n.h();
        this.f8121m.close();
    }

    public void h() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 4) {
            int i3 = this.f8107g - 1;
            this.f8107g = i3;
            int[] iArr = this.f8110j;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.o = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + y() + " at path " + getPath());
    }

    public boolean hasNext() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    public void i() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 2) {
            int i3 = this.f8107g - 1;
            this.f8107g = i3;
            this.f8109i[i3] = null;
            int[] iArr = this.f8110j;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.o = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + y() + " at path " + getPath());
    }

    public double l() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 16) {
            this.o = 0;
            int[] iArr = this.f8110j;
            int i3 = this.f8107g - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.p;
        }
        if (i2 == 17) {
            this.r = this.f8122n.Q0((long) this.q);
        } else if (i2 == 9) {
            this.r = F0(t);
        } else if (i2 == 8) {
            this.r = F0(s);
        } else if (i2 == 10) {
            this.r = G0();
        } else if (i2 != 11) {
            throw new JsonDataException("Expected a double but was " + y() + " at path " + getPath());
        }
        this.o = 11;
        try {
            double parseDouble = Double.parseDouble(this.r);
            if (this.f8111k || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.r = null;
                this.o = 0;
                int[] iArr2 = this.f8110j;
                int i4 = this.f8107g - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.r + " at path " + getPath());
        }
    }

    public int n() {
        String str;
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 16) {
            long j2 = this.p;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.o = 0;
                int[] iArr = this.f8110j;
                int i4 = this.f8107g - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new JsonDataException("Expected an int but was " + this.p + " at path " + getPath());
        }
        if (i2 == 17) {
            this.r = this.f8122n.Q0((long) this.q);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                str = F0(t);
            } else {
                str = F0(s);
            }
            this.r = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.o = 0;
                int[] iArr2 = this.f8110j;
                int i5 = this.f8107g - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new JsonDataException("Expected an int but was " + y() + " at path " + getPath());
        }
        this.o = 11;
        try {
            double parseDouble = Double.parseDouble(this.r);
            int i6 = (int) parseDouble;
            if (((double) i6) == parseDouble) {
                this.r = null;
                this.o = 0;
                int[] iArr3 = this.f8110j;
                int i7 = this.f8107g - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new JsonDataException("Expected an int but was " + this.r + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.r + " at path " + getPath());
        }
    }

    public boolean nextBoolean() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 5) {
            this.o = 0;
            int[] iArr = this.f8110j;
            int i3 = this.f8107g - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.o = 0;
            int[] iArr2 = this.f8110j;
            int i4 = this.f8107g - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + y() + " at path " + getPath());
        }
    }

    public String nextName() {
        String str;
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 14) {
            str = G0();
        } else if (i2 == 13) {
            str = F0(t);
        } else if (i2 == 12) {
            str = F0(s);
        } else if (i2 == 15) {
            str = this.r;
        } else {
            throw new JsonDataException("Expected a name but was " + y() + " at path " + getPath());
        }
        this.o = 0;
        this.f8109i[this.f8107g - 1] = str;
        return str;
    }

    public String nextString() {
        String str;
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 10) {
            str = G0();
        } else if (i2 == 9) {
            str = F0(t);
        } else if (i2 == 8) {
            str = F0(s);
        } else if (i2 == 11) {
            str = this.r;
            this.r = null;
        } else if (i2 == 16) {
            str = Long.toString(this.p);
        } else if (i2 == 17) {
            str = this.f8122n.Q0((long) this.q);
        } else {
            throw new JsonDataException("Expected a string but was " + y() + " at path " + getPath());
        }
        this.o = 0;
        int[] iArr = this.f8110j;
        int i3 = this.f8107g - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public long o() {
        String str;
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        if (i2 == 16) {
            this.o = 0;
            int[] iArr = this.f8110j;
            int i3 = this.f8107g - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.p;
        }
        if (i2 == 17) {
            this.r = this.f8122n.Q0((long) this.q);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                str = F0(t);
            } else {
                str = F0(s);
            }
            this.r = str;
            try {
                long parseLong = Long.parseLong(str);
                this.o = 0;
                int[] iArr2 = this.f8110j;
                int i4 = this.f8107g - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new JsonDataException("Expected a long but was " + y() + " at path " + getPath());
        }
        this.o = 11;
        try {
            long longValueExact = new BigDecimal(this.r).longValueExact();
            this.r = null;
            this.o = 0;
            int[] iArr3 = this.f8110j;
            int i5 = this.f8107g - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.r + " at path " + getPath());
        }
    }

    public void skipValue() {
        if (!this.f8112l) {
            int i2 = 0;
            do {
                int i3 = this.o;
                if (i3 == 0) {
                    i3 = l0();
                }
                if (i3 == 3) {
                    D(1);
                } else if (i3 == 1) {
                    D(3);
                } else {
                    if (i3 == 4) {
                        i2--;
                        if (i2 >= 0) {
                            this.f8107g--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + y() + " at path " + getPath());
                        }
                    } else if (i3 == 2) {
                        i2--;
                        if (i2 >= 0) {
                            this.f8107g--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + y() + " at path " + getPath());
                        }
                    } else if (i3 == 14 || i3 == 10) {
                        N0();
                    } else if (i3 == 9 || i3 == 13) {
                        K0(t);
                    } else if (i3 == 8 || i3 == 12) {
                        K0(s);
                    } else if (i3 == 17) {
                        this.f8122n.x((long) this.q);
                    } else if (i3 == 18) {
                        throw new JsonDataException("Expected a value but was " + y() + " at path " + getPath());
                    }
                    this.o = 0;
                }
                i2++;
                this.o = 0;
            } while (i2 != 0);
            int[] iArr = this.f8110j;
            int i4 = this.f8107g;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            this.f8109i[i4 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + y() + " at " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f8121m + ")";
    }

    public g.c y() {
        int i2 = this.o;
        if (i2 == 0) {
            i2 = l0();
        }
        switch (i2) {
            case 1:
                return g.c.BEGIN_OBJECT;
            case 2:
                return g.c.END_OBJECT;
            case 3:
                return g.c.BEGIN_ARRAY;
            case 4:
                return g.c.END_ARRAY;
            case 5:
            case 6:
                return g.c.BOOLEAN;
            case 7:
                return g.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return g.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return g.c.NAME;
            case 16:
            case 17:
                return g.c.NUMBER;
            case 18:
                return g.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (hasNext()) {
            this.r = nextName();
            this.o = 11;
        }
    }
}
