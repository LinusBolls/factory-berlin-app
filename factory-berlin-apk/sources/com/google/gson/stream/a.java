package com.google.gson.stream;

import com.google.gson.internal.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: JsonReader */
public class a implements Closeable {
    private static final char[] v = ")]}'\n".toCharArray();

    /* renamed from: g  reason: collision with root package name */
    private final Reader f4333g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4334h = false;

    /* renamed from: i  reason: collision with root package name */
    private final char[] f4335i = new char[1024];

    /* renamed from: j  reason: collision with root package name */
    private int f4336j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f4337k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f4338l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f4339m = 0;

    /* renamed from: n  reason: collision with root package name */
    int f4340n = 0;
    private long o;
    private int p;
    private String q;
    private int[] r;
    private int s;
    private String[] t;
    private int[] u;

    /* renamed from: com.google.gson.stream.a$a  reason: collision with other inner class name */
    /* compiled from: JsonReader */
    class C0120a extends e {
        C0120a() {
        }

        public void a(a aVar) {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).L0();
                return;
            }
            int i2 = aVar.f4340n;
            if (i2 == 0) {
                i2 = aVar.j();
            }
            if (i2 == 13) {
                aVar.f4340n = 9;
            } else if (i2 == 12) {
                aVar.f4340n = 8;
            } else if (i2 == 14) {
                aVar.f4340n = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.Z() + aVar.y());
            }
        }
    }

    static {
        e.a = new C0120a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.r = iArr;
        this.s = 0;
        this.s = 0 + 1;
        iArr[0] = 6;
        this.t = new String[32];
        this.u = new int[32];
        if (reader != null) {
            this.f4333g = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void F0() {
        char c;
        do {
            if (this.f4336j < this.f4337k || n(1)) {
                char[] cArr = this.f4335i;
                int i2 = this.f4336j;
                int i3 = i2 + 1;
                this.f4336j = i3;
                c = cArr[i2];
                if (c == 10) {
                    this.f4338l++;
                    this.f4339m = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f4336j
            int r2 = r1 + r0
            int r3 = r4.f4337k
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f4335i
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.h()
        L_0x004b:
            int r1 = r4.f4336j
            int r1 = r1 + r0
            r4.f4336j = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f4336j = r1
            r0 = 1
            boolean r0 = r4.n(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.G0():void");
    }

    private IOException H0(String str) {
        throw new MalformedJsonException(str + y());
    }

    private int K(boolean z) {
        char[] cArr = this.f4335i;
        int i2 = this.f4336j;
        int i3 = this.f4337k;
        while (true) {
            if (i2 == i3) {
                this.f4336j = i2;
                if (n(1)) {
                    i2 = this.f4336j;
                    i3 = this.f4337k;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + y());
                }
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == 10) {
                this.f4338l++;
                this.f4339m = i4;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f4336j = i4;
                    if (i4 == i3) {
                        this.f4336j = i4 - 1;
                        boolean n2 = n(2);
                        this.f4336j++;
                        if (!n2) {
                            return c;
                        }
                    }
                    h();
                    int i5 = this.f4336j;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.f4336j = i5 + 1;
                        if (w0("*/")) {
                            i2 = this.f4336j + 2;
                            i3 = this.f4337k;
                        } else {
                            H0("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f4336j = i5 + 1;
                        F0();
                        i2 = this.f4336j;
                        i3 = this.f4337k;
                    }
                } else if (c == '#') {
                    this.f4336j = i4;
                    h();
                    F0();
                    i2 = this.f4336j;
                    i3 = this.f4337k;
                } else {
                    this.f4336j = i4;
                    return c;
                }
            }
            i2 = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f4336j = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String M(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.f4335i
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f4336j
            int r4 = r10.f4337k
        L_0x0008:
            r5 = r4
            r4 = r3
        L_0x000a:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L_0x005d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0029
            r10.f4336j = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L_0x0021:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r3 != r9) goto L_0x0050
            r10.f4336j = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0041
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0041:
            r2.append(r0, r4, r8)
            char r3 = r10.n0()
            r2.append(r3)
            int r3 = r10.f4336j
            int r4 = r10.f4337k
            goto L_0x0008
        L_0x0050:
            r6 = 10
            if (r3 != r6) goto L_0x005b
            int r3 = r10.f4338l
            int r3 = r3 + r7
            r10.f4338l = r3
            r10.f4339m = r8
        L_0x005b:
            r3 = r8
            goto L_0x000a
        L_0x005d:
            if (r2 != 0) goto L_0x006d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L_0x006d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f4336j = r3
            boolean r3 = r10.n(r7)
            if (r3 == 0) goto L_0x007b
            goto L_0x0004
        L_0x007b:
            java.lang.String r11 = "Unterminated string"
            r10.H0(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.M(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String U() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f4336j
            int r4 = r3 + r2
            int r5 = r6.f4337k
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f4335i
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.h()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f4335i
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.n(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f4335i
            int r4 = r6.f4336j
            r1.append(r3, r4, r2)
            int r3 = r6.f4336j
            int r3 = r3 + r2
            r6.f4336j = r3
            r2 = 1
            boolean r2 = r6.n(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f4335i
            int r3 = r6.f4336j
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f4335i
            int r3 = r6.f4336j
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f4336j
            int r2 = r2 + r0
            r6.f4336j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.U():java.lang.String");
    }

    private int b0() {
        String str;
        String str2;
        int i2;
        char c = this.f4335i[this.f4336j];
        if (c == 't' || c == 'T') {
            i2 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i2 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i2 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f4336j + i3 >= this.f4337k && !n(i3 + 1)) {
                return 0;
            }
            char c2 = this.f4335i[this.f4336j + i3];
            if (c2 != str2.charAt(i3) && c2 != str.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f4336j + length < this.f4337k || n(length + 1)) && q(this.f4335i[this.f4336j + length])) {
            return 0;
        }
        this.f4336j += length;
        this.f4340n = i2;
        return i2;
    }

    private void h() {
        if (!this.f4334h) {
            H0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    private void i() {
        K(true);
        int i2 = this.f4336j - 1;
        this.f4336j = i2;
        char[] cArr = v;
        if (i2 + cArr.length <= this.f4337k || n(cArr.length)) {
            int i3 = 0;
            while (true) {
                char[] cArr2 = v;
                if (i3 >= cArr2.length) {
                    this.f4336j += cArr2.length;
                    return;
                } else if (this.f4335i[this.f4336j + i3] == cArr2[i3]) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    private int i0() {
        char c;
        char[] cArr = this.f4335i;
        int i2 = this.f4336j;
        int i3 = this.f4337k;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = true;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!n(i5 + 1)) {
                    break;
                }
                i2 = this.f4336j;
                i3 = this.f4337k;
            }
            c = cArr[i2 + i5];
            if (c == '+') {
                i4 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i4 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i5++;
            } else {
                if (c == '-') {
                    i4 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i4 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j2 = (long) (-(c - '0'));
                        i4 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j2 == 0) {
                                return 0;
                            }
                            long j3 = (10 * j2) - ((long) (c - '0'));
                            int i6 = (j2 > -922337203685477580L ? 1 : (j2 == -922337203685477580L ? 0 : -1));
                            z &= i6 > 0 || (i6 == 0 && j3 < j2);
                            j2 = j3;
                        } else if (c2 == 3) {
                            i4 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i4 = 0;
                            c2 = 7;
                        }
                        i4 = 0;
                    }
                }
                i5++;
            }
            c2 = 6;
            i5++;
        }
        if (q(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.o = j2;
            this.f4336j += i5;
            this.f4340n = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.p = i5;
            this.f4340n = 16;
            return 16;
        }
    }

    private void l0(int i2) {
        int i3 = this.s;
        int[] iArr = this.r;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.r = Arrays.copyOf(iArr, i4);
            this.u = Arrays.copyOf(this.u, i4);
            this.t = (String[]) Arrays.copyOf(this.t, i4);
        }
        int[] iArr2 = this.r;
        int i5 = this.s;
        this.s = i5 + 1;
        iArr2[i5] = i2;
    }

    private boolean n(int i2) {
        int i3;
        char[] cArr = this.f4335i;
        int i4 = this.f4339m;
        int i5 = this.f4336j;
        this.f4339m = i4 - i5;
        int i6 = this.f4337k;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f4337k = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f4337k = 0;
        }
        this.f4336j = 0;
        do {
            Reader reader = this.f4333g;
            int i8 = this.f4337k;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            int i9 = this.f4337k + read;
            this.f4337k = i9;
            if (this.f4338l == 0 && (i3 = this.f4339m) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f4336j++;
                this.f4339m = i3 + 1;
                i2++;
            }
        } while (this.f4337k < i2);
        return true;
    }

    private char n0() {
        int i2;
        int i3;
        if (this.f4336j != this.f4337k || n(1)) {
            char[] cArr = this.f4335i;
            int i4 = this.f4336j;
            int i5 = i4 + 1;
            this.f4336j = i5;
            char c = cArr[i4];
            if (c == 10) {
                this.f4338l++;
                this.f4339m = i5;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    H0("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f4337k || n(4)) {
                    char c2 = 0;
                    int i6 = this.f4336j;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c3 = this.f4335i[i6];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i2 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f4335i, this.f4336j, 4));
                            } else {
                                i2 = c3 - 'A';
                            }
                            i3 = i2 + 10;
                        } else {
                            i3 = c3 - '0';
                        }
                        c2 = (char) (c4 + i3);
                        i6++;
                    }
                    this.f4336j += 4;
                    return c2;
                } else {
                    H0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        H0("Unterminated escape sequence");
        throw null;
    }

    private boolean q(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    private void t0(char c) {
        char[] cArr = this.f4335i;
        do {
            int i2 = this.f4336j;
            int i3 = this.f4337k;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    this.f4336j = i4;
                    return;
                } else if (c2 == '\\') {
                    this.f4336j = i4;
                    n0();
                    i2 = this.f4336j;
                    i3 = this.f4337k;
                } else {
                    if (c2 == 10) {
                        this.f4338l++;
                        this.f4339m = i4;
                    }
                    i2 = i4;
                }
            }
            this.f4336j = i2;
        } while (n(1));
        H0("Unterminated string");
        throw null;
    }

    private boolean w0(String str) {
        int length = str.length();
        while (true) {
            int i2 = 0;
            if (this.f4336j + length > this.f4337k && !n(length)) {
                return false;
            }
            char[] cArr = this.f4335i;
            int i3 = this.f4336j;
            if (cArr[i3] == 10) {
                this.f4338l++;
                this.f4339m = i3 + 1;
            } else {
                while (i2 < length) {
                    if (this.f4335i[this.f4336j + i2] == str.charAt(i2)) {
                        i2++;
                    }
                }
                return true;
            }
            this.f4336j++;
        }
    }

    public int D() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 15) {
            long j2 = this.o;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f4340n = 0;
                int[] iArr = this.u;
                int i4 = this.s - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.o + y());
        }
        if (i2 == 16) {
            this.q = new String(this.f4335i, this.f4336j, this.p);
            this.f4336j += this.p;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.q = U();
            } else {
                this.q = M(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.q);
                this.f4340n = 0;
                int[] iArr2 = this.u;
                int i5 = this.s - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + Z() + y());
        }
        this.f4340n = 11;
        double parseDouble = Double.parseDouble(this.q);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.q = null;
            this.f4340n = 0;
            int[] iArr3 = this.u;
            int i7 = this.s - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.q + y());
    }

    public long F() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 15) {
            this.f4340n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.o;
        }
        if (i2 == 16) {
            this.q = new String(this.f4335i, this.f4336j, this.p);
            this.f4336j += this.p;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.q = U();
            } else {
                this.q = M(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.q);
                this.f4340n = 0;
                int[] iArr2 = this.u;
                int i4 = this.s - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + Z() + y());
        }
        this.f4340n = 11;
        double parseDouble = Double.parseDouble(this.q);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.q = null;
            this.f4340n = 0;
            int[] iArr3 = this.u;
            int i5 = this.s - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.q + y());
    }

    public void L() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 7) {
            this.f4340n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + Z() + y());
    }

    public b Z() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void a() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 3) {
            l0(1);
            this.u[this.s - 1] = 0;
            this.f4340n = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + Z() + y());
    }

    public void b() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 1) {
            l0(3);
            this.f4340n = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + Z() + y());
    }

    public void close() {
        this.f4340n = 0;
        this.r[0] = 8;
        this.s = 1;
        this.f4333g.close();
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.s;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.r[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.u[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.t;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean hasNext() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        int K;
        int[] iArr = this.r;
        int i2 = this.s;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int K2 = K(true);
            if (K2 != 44) {
                if (K2 == 59) {
                    h();
                } else if (K2 == 93) {
                    this.f4340n = 4;
                    return 4;
                } else {
                    H0("Unterminated array");
                    throw null;
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            this.r[this.s - 1] = 4;
            if (i3 == 5 && (K = K(true)) != 44) {
                if (K == 59) {
                    h();
                } else if (K == 125) {
                    this.f4340n = 2;
                    return 2;
                } else {
                    H0("Unterminated object");
                    throw null;
                }
            }
            int K3 = K(true);
            if (K3 == 34) {
                this.f4340n = 13;
                return 13;
            } else if (K3 == 39) {
                h();
                this.f4340n = 12;
                return 12;
            } else if (K3 != 125) {
                h();
                this.f4336j--;
                if (q((char) K3)) {
                    this.f4340n = 14;
                    return 14;
                }
                H0("Expected name");
                throw null;
            } else if (i3 != 5) {
                this.f4340n = 2;
                return 2;
            } else {
                H0("Expected name");
                throw null;
            }
        } else if (i3 == 4) {
            iArr[i2 - 1] = 5;
            int K4 = K(true);
            if (K4 != 58) {
                if (K4 == 61) {
                    h();
                    if (this.f4336j < this.f4337k || n(1)) {
                        char[] cArr = this.f4335i;
                        int i4 = this.f4336j;
                        if (cArr[i4] == '>') {
                            this.f4336j = i4 + 1;
                        }
                    }
                } else {
                    H0("Expected ':'");
                    throw null;
                }
            }
        } else if (i3 == 6) {
            if (this.f4334h) {
                i();
            }
            this.r[this.s - 1] = 7;
        } else if (i3 == 7) {
            if (K(false) == -1) {
                this.f4340n = 17;
                return 17;
            }
            h();
            this.f4336j--;
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int K5 = K(true);
        if (K5 == 34) {
            this.f4340n = 9;
            return 9;
        } else if (K5 != 39) {
            if (!(K5 == 44 || K5 == 59)) {
                if (K5 == 91) {
                    this.f4340n = 3;
                    return 3;
                } else if (K5 != 93) {
                    if (K5 != 123) {
                        this.f4336j--;
                        int b0 = b0();
                        if (b0 != 0) {
                            return b0;
                        }
                        int i0 = i0();
                        if (i0 != 0) {
                            return i0;
                        }
                        if (q(this.f4335i[this.f4336j])) {
                            h();
                            this.f4340n = 10;
                            return 10;
                        }
                        H0("Expected value");
                        throw null;
                    }
                    this.f4340n = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.f4340n = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                h();
                this.f4336j--;
                this.f4340n = 7;
                return 7;
            }
            H0("Unexpected value");
            throw null;
        } else {
            h();
            this.f4340n = 8;
            return 8;
        }
    }

    public void k() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 4) {
            int i3 = this.s - 1;
            this.s = i3;
            int[] iArr = this.u;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f4340n = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + Z() + y());
    }

    public void l() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 2) {
            int i3 = this.s - 1;
            this.s = i3;
            this.t[i3] = null;
            int[] iArr = this.u;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f4340n = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + Z() + y());
    }

    public boolean nextBoolean() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 5) {
            this.f4340n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f4340n = 0;
            int[] iArr2 = this.u;
            int i4 = this.s - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + Z() + y());
        }
    }

    public String nextName() {
        String str;
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 14) {
            str = U();
        } else if (i2 == 12) {
            str = M('\'');
        } else if (i2 == 13) {
            str = M('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + Z() + y());
        }
        this.f4340n = 0;
        this.t[this.s - 1] = str;
        return str;
    }

    public String nextString() {
        String str;
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 10) {
            str = U();
        } else if (i2 == 8) {
            str = M('\'');
        } else if (i2 == 9) {
            str = M('\"');
        } else if (i2 == 11) {
            str = this.q;
            this.q = null;
        } else if (i2 == 15) {
            str = Long.toString(this.o);
        } else if (i2 == 16) {
            str = new String(this.f4335i, this.f4336j, this.p);
            this.f4336j += this.p;
        } else {
            throw new IllegalStateException("Expected a string but was " + Z() + y());
        }
        this.f4340n = 0;
        int[] iArr = this.u;
        int i3 = this.s - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public final boolean o() {
        return this.f4334h;
    }

    public final void r0(boolean z) {
        this.f4334h = z;
    }

    public void skipValue() {
        int i2 = 0;
        do {
            int i3 = this.f4340n;
            if (i3 == 0) {
                i3 = j();
            }
            if (i3 == 3) {
                l0(1);
            } else if (i3 == 1) {
                l0(3);
            } else {
                if (i3 == 4) {
                    this.s--;
                } else if (i3 == 2) {
                    this.s--;
                } else if (i3 == 14 || i3 == 10) {
                    G0();
                    this.f4340n = 0;
                } else if (i3 == 8 || i3 == 12) {
                    t0('\'');
                    this.f4340n = 0;
                } else if (i3 == 9 || i3 == 13) {
                    t0('\"');
                    this.f4340n = 0;
                } else {
                    if (i3 == 16) {
                        this.f4336j += this.p;
                    }
                    this.f4340n = 0;
                }
                i2--;
                this.f4340n = 0;
            }
            i2++;
            this.f4340n = 0;
        } while (i2 != 0);
        int[] iArr = this.u;
        int i4 = this.s;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.t[i4 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + y();
    }

    /* access modifiers changed from: package-private */
    public String y() {
        return " at line " + (this.f4338l + 1) + " column " + ((this.f4336j - this.f4339m) + 1) + " path " + getPath();
    }

    public double z() {
        int i2 = this.f4340n;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 15) {
            this.f4340n = 0;
            int[] iArr = this.u;
            int i3 = this.s - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.o;
        }
        if (i2 == 16) {
            this.q = new String(this.f4335i, this.f4336j, this.p);
            this.f4336j += this.p;
        } else if (i2 == 8 || i2 == 9) {
            this.q = M(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.q = U();
        } else if (i2 != 11) {
            throw new IllegalStateException("Expected a double but was " + Z() + y());
        }
        this.f4340n = 11;
        double parseDouble = Double.parseDouble(this.q);
        if (this.f4334h || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.q = null;
            this.f4340n = 0;
            int[] iArr2 = this.u;
            int i4 = this.s - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + y());
    }
}
