package com.apollographql.apollo.api.internal.json;

import com.apollographql.apollo.api.internal.json.c;
import java.io.EOFException;
import kotlin.jvm.internal.k;
import l.f;
import l.h;
import l.i;

/* compiled from: BufferedSourceJsonReader.kt */
public final class a implements c {
    private static final i s = i.f11104k.d("'\\");
    private static final i t = i.f11104k.d("\"\\");
    private static final i u = i.f11104k.d("{}[]:, \n\t\r/\\;#=");
    private static final i v = i.f11104k.d("\n\r");

    /* renamed from: g  reason: collision with root package name */
    private final f f1802g;

    /* renamed from: h  reason: collision with root package name */
    private int f1803h;

    /* renamed from: i  reason: collision with root package name */
    private long f1804i;

    /* renamed from: j  reason: collision with root package name */
    private int f1805j;

    /* renamed from: k  reason: collision with root package name */
    private String f1806k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f1807l;

    /* renamed from: m  reason: collision with root package name */
    private int f1808m = 1;

    /* renamed from: n  reason: collision with root package name */
    private final String[] f1809n = new String[32];
    private final int[] o = new int[32];
    private boolean p;
    private boolean q;
    private final h r;

    /* renamed from: com.apollographql.apollo.api.internal.json.a$a  reason: collision with other inner class name */
    /* compiled from: BufferedSourceJsonReader.kt */
    public static final class C0049a {
        private C0049a() {
        }

        public /* synthetic */ C0049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0049a((DefaultConstructorMarker) null);
    }

    public a(h hVar) {
        k.f(hVar, "source");
        this.r = hVar;
        this.f1802g = hVar.d();
        int[] iArr = new int[32];
        iArr[0] = 6;
        this.f1807l = iArr;
    }

    private final void D(i iVar) {
        while (true) {
            long c0 = this.r.c0(iVar);
            if (c0 == -1) {
                throw M("Unterminated string");
            } else if (this.f1802g.b0(c0) == ((byte) 92)) {
                this.f1802g.x(c0 + 1);
                z();
            } else {
                this.f1802g.x(c0 + 1);
                return;
            }
        }
    }

    private final boolean F(String str) {
        while (true) {
            int i2 = 0;
            if (!this.r.C((long) str.length())) {
                return false;
            }
            int length = str.length();
            while (i2 < length) {
                if (this.f1802g.b0((long) i2) != ((byte) str.charAt(i2))) {
                    this.f1802g.readByte();
                } else {
                    i2++;
                }
            }
            return true;
        }
    }

    private final void K() {
        long c0 = this.r.c0(v);
        f fVar = this.f1802g;
        fVar.x(c0 != -1 ? c0 + 1 : fVar.T0());
    }

    private final void L() {
        long c0 = this.r.c0(u);
        f fVar = this.f1802g;
        if (c0 == -1) {
            c0 = fVar.T0();
        }
        fVar.x(c0);
    }

    private final JsonEncodingException M(String str) {
        return new JsonEncodingException(str + " at path " + getPath());
    }

    private final void a() {
        if (!i()) {
            throw M("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private final int b() {
        int[] iArr = this.f1807l;
        int i2 = this.f1808m;
        int i3 = iArr[i2 - 1];
        boolean z = false;
        switch (i3) {
            case 1:
                iArr[i2 - 1] = 2;
                break;
            case 2:
                int k2 = k(true);
                this.f1802g.readByte();
                char c = (char) k2;
                if (c != ',') {
                    if (c == ';') {
                        a();
                        break;
                    } else if (c == ']') {
                        this.f1803h = 4;
                        return 4;
                    } else {
                        throw M("Unterminated array");
                    }
                }
                break;
            case 3:
            case 5:
                iArr[i2 - 1] = 4;
                if (i3 == 5) {
                    int k3 = k(true);
                    this.f1802g.readByte();
                    char c2 = (char) k3;
                    if (c2 != ',') {
                        if (c2 == ';') {
                            a();
                        } else if (c2 == '}') {
                            this.f1803h = 2;
                            return 2;
                        } else {
                            throw M("Unterminated object");
                        }
                    }
                }
                char k4 = (char) k(true);
                if (k4 == '\"') {
                    this.f1802g.readByte();
                    this.f1803h = 13;
                    return 13;
                } else if (k4 == '\'') {
                    this.f1802g.readByte();
                    a();
                    this.f1803h = 12;
                    return 12;
                } else if (k4 != '}') {
                    a();
                    if (j(k4)) {
                        this.f1803h = 14;
                        return 14;
                    }
                    throw M("Expected name");
                } else if (i3 != 5) {
                    this.f1802g.readByte();
                    this.f1803h = 2;
                    return 2;
                } else {
                    throw M("Expected name");
                }
            case 4:
                iArr[i2 - 1] = 5;
                int k5 = k(true);
                this.f1802g.readByte();
                char c3 = (char) k5;
                if (c3 != ':') {
                    if (c3 == '=') {
                        a();
                        if (this.r.C(1) && this.f1802g.b0(0) == ((byte) 62)) {
                            this.f1802g.readByte();
                            break;
                        }
                    } else {
                        throw M("Expected ':'");
                    }
                }
                break;
            case 6:
                iArr[i2 - 1] = 7;
                break;
            case 7:
                if (k(false) != -1) {
                    a();
                    break;
                } else {
                    this.f1803h = 17;
                    return 17;
                }
            default:
                if (i3 != 8) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalStateException("JsonReader is closed".toString());
                }
                break;
        }
        char k6 = (char) k(true);
        if (k6 == '\"') {
            this.f1802g.readByte();
            this.f1803h = 9;
            return 9;
        } else if (k6 == '\'') {
            a();
            this.f1802g.readByte();
            this.f1803h = 8;
            return 8;
        } else if (k6 == ',' || k6 == ';') {
            if (i3 == 1 || i3 == 2) {
                a();
                this.f1803h = 7;
                return 7;
            }
            throw M("Unexpected value");
        } else if (k6 == '[') {
            this.f1802g.readByte();
            this.f1803h = 3;
            return 3;
        } else if (k6 != ']') {
            if (k6 != '{') {
                int o2 = o();
                if (o2 != 0) {
                    return o2;
                }
                int q2 = q();
                if (q2 != 0) {
                    return q2;
                }
                if (j((char) this.f1802g.b0(0))) {
                    a();
                    this.f1803h = 10;
                    return 10;
                }
                throw M("Expected value");
            }
            this.f1802g.readByte();
            this.f1803h = 1;
            return 1;
        } else if (i3 == 1) {
            this.f1802g.readByte();
            this.f1803h = 4;
            return 4;
        } else if (i3 == 1 || i3 == 2) {
            a();
            this.f1803h = 7;
            return 7;
        } else {
            throw M("Unexpected value");
        }
    }

    private final boolean j(char c) {
        if (c == 9 || c == 10 || c == 13 || c == ' ') {
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
        a();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r9.f1802g.x(((long) r1) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 != 47) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r9.r.C(2) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        a();
        r3 = (char) r9.f1802g.b0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r3 == '*') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r3 == '/') goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r9.f1802g.readByte();
        r9.f1802g.readByte();
        K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r9.f1802g.readByte();
        r9.f1802g.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (F("*/") == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r9.f1802g.readByte();
        r9.f1802g.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        throw M("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r2 != 35) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        a();
        K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int k(boolean r10) {
        /*
            r9 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            l.h r2 = r9.r
            long r3 = (long) r1
            r5 = 1
            long r7 = r3 + r5
            boolean r2 = r2.C(r7)
            if (r2 == 0) goto L_0x008e
            l.f r2 = r9.f1802g
            int r1 = r1 + 1
            byte r2 = r2.b0(r3)
            r3 = 10
            if (r2 == r3) goto L_0x0002
            r3 = 32
            if (r2 == r3) goto L_0x0002
            r3 = 13
            if (r2 == r3) goto L_0x0002
            r3 = 9
            if (r2 != r3) goto L_0x0028
            goto L_0x0002
        L_0x0028:
            l.f r3 = r9.f1802g
            long r7 = (long) r1
            long r7 = r7 - r5
            r3.x(r7)
            r1 = 47
            if (r2 != r1) goto L_0x0081
            l.h r3 = r9.r
            r7 = 2
            boolean r3 = r3.C(r7)
            if (r3 != 0) goto L_0x003e
            return r2
        L_0x003e:
            r9.a()
            l.f r3 = r9.f1802g
            byte r3 = r3.b0(r5)
            char r3 = (char) r3
            r4 = 42
            if (r3 == r4) goto L_0x005d
            if (r3 == r1) goto L_0x004f
            return r2
        L_0x004f:
            l.f r1 = r9.f1802g
            r1.readByte()
            l.f r1 = r9.f1802g
            r1.readByte()
            r9.K()
            goto L_0x0001
        L_0x005d:
            l.f r1 = r9.f1802g
            r1.readByte()
            l.f r1 = r9.f1802g
            r1.readByte()
            java.lang.String r1 = "*/"
            boolean r1 = r9.F(r1)
            if (r1 == 0) goto L_0x007a
            l.f r1 = r9.f1802g
            r1.readByte()
            l.f r1 = r9.f1802g
            r1.readByte()
            goto L_0x0001
        L_0x007a:
            java.lang.String r10 = "Unterminated comment"
            com.apollographql.apollo.api.internal.json.JsonEncodingException r10 = r9.M(r10)
            throw r10
        L_0x0081:
            r1 = 35
            if (r2 != r1) goto L_0x008d
            r9.a()
            r9.K()
            goto L_0x0001
        L_0x008d:
            return r2
        L_0x008e:
            if (r10 != 0) goto L_0x0092
            r10 = -1
            return r10
        L_0x0092:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.internal.json.a.k(boolean):int");
    }

    private final String l(i iVar) {
        StringBuilder sb = null;
        while (true) {
            long c0 = this.r.c0(iVar);
            if (c0 == -1) {
                throw M("Unterminated string");
            } else if (this.f1802g.b0(c0) == ((byte) 92)) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f1802g.Q0(c0));
                this.f1802g.readByte();
                sb.append(z());
            } else if (sb == null) {
                String Q0 = this.f1802g.Q0(c0);
                this.f1802g.readByte();
                return Q0;
            } else {
                sb.append(this.f1802g.Q0(c0));
                this.f1802g.readByte();
                String sb2 = sb.toString();
                k.b(sb2, "builder.toString()");
                return sb2;
            }
        }
    }

    private final String n() {
        long c0 = this.r.c0(u);
        return c0 != -1 ? this.f1802g.Q0(c0) : this.f1802g.P0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int o() {
        /*
            r11 = this;
            l.f r0 = r11.f1802g
            r1 = 0
            byte r0 = r0.b0(r1)
            r1 = 70
            r2 = 0
            if (r0 == r1) goto L_0x002e
            r1 = 78
            if (r0 == r1) goto L_0x0028
            r1 = 84
            if (r0 == r1) goto L_0x0022
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x002e
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L_0x0028
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x0022
            return r2
        L_0x0022:
            r0 = 5
            java.lang.String r1 = "true"
            java.lang.String r3 = "TRUE"
            goto L_0x0033
        L_0x0028:
            r0 = 7
            java.lang.String r1 = "null"
            java.lang.String r3 = "NULL"
            goto L_0x0033
        L_0x002e:
            r0 = 6
            java.lang.String r1 = "false"
            java.lang.String r3 = "FALSE"
        L_0x0033:
            int r4 = r1.length()
            r5 = 1
        L_0x0038:
            r6 = 1
            if (r5 >= r4) goto L_0x005f
            l.h r8 = r11.r
            long r9 = (long) r5
            long r6 = r6 + r9
            boolean r6 = r8.C(r6)
            if (r6 != 0) goto L_0x0047
            return r2
        L_0x0047:
            l.f r6 = r11.f1802g
            byte r6 = r6.b0(r9)
            char r7 = r1.charAt(r5)
            byte r7 = (byte) r7
            if (r6 == r7) goto L_0x005c
            char r7 = r3.charAt(r5)
            byte r7 = (byte) r7
            if (r6 == r7) goto L_0x005c
            return r2
        L_0x005c:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x005f:
            l.h r1 = r11.r
            long r3 = (long) r4
            long r6 = r6 + r3
            boolean r1 = r1.C(r6)
            if (r1 == 0) goto L_0x0077
            l.f r1 = r11.f1802g
            byte r1 = r1.b0(r3)
            char r1 = (char) r1
            boolean r1 = r11.j(r1)
            if (r1 == 0) goto L_0x0077
            return r2
        L_0x0077:
            l.f r1 = r11.f1802g
            r1.x(r3)
            r11.f1803h = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.internal.json.a.o():int");
    }

    private final int q() {
        long j2;
        char c;
        int i2 = 0;
        char c2 = 0;
        long j3 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            j2 = (long) i2;
            if (!this.r.C(1 + j2)) {
                break;
            }
            byte b0 = this.f1802g.b0(j2);
            c = (char) b0;
            if (c != '+') {
                if (c != 'E' && c != 'e') {
                    if (c != '-') {
                        if (c != '.') {
                            byte b = (byte) 48;
                            if (b0 >= b && b0 <= ((byte) 57)) {
                                if (c2 == 0 || c2 == 1) {
                                    j3 = -((long) (b0 - b));
                                    c2 = 2;
                                } else if (c2 != 2) {
                                    if (c2 == 3) {
                                        c2 = 4;
                                    } else if (c2 == 5 || c2 == 6) {
                                        c2 = 7;
                                    }
                                } else if (j3 == 0) {
                                    return 0;
                                } else {
                                    long j4 = (((long) 10) * j3) - ((long) (b0 - b));
                                    int i3 = (j3 > -922337203685477580L ? 1 : (j3 == -922337203685477580L ? 0 : -1));
                                    z2 = (z2 && (i3 > 0)) || (i3 == 0 && j4 < j3);
                                    j3 = j4;
                                }
                            }
                        } else if (c2 != 2) {
                            return 0;
                        } else {
                            c2 = 3;
                        }
                    } else if (c2 == 0) {
                        c2 = 1;
                        z = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                    i2++;
                } else if (c2 != 2 && c2 != 4) {
                    return 0;
                } else {
                    c2 = 5;
                    i2++;
                }
            } else if (c2 != 5) {
                return 0;
            }
            c2 = 6;
            i2++;
        }
        if (j(c)) {
            return 0;
        }
        if (c2 == 2 && z2 && (j3 != Long.MIN_VALUE || z)) {
            if (!z) {
                j3 = -j3;
            }
            this.f1804i = j3;
            this.f1802g.x(j2);
            this.f1803h = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f1805j = i2;
            this.f1803h = 16;
            return 16;
        }
    }

    private final void y(int i2) {
        int i3 = this.f1808m;
        int[] iArr = this.f1807l;
        if (i3 != iArr.length) {
            this.f1808m = i3 + 1;
            iArr[i3] = i2;
            return;
        }
        throw new JsonDataException("Nesting too deep at " + getPath());
    }

    private final char z() {
        int i2;
        if (this.r.C(1)) {
            char readByte = (char) this.f1802g.readByte();
            if (readByte == 'u') {
                if (this.r.C(4)) {
                    char c = (char) 0;
                    for (int i3 = 0; i3 < 4; i3++) {
                        byte b0 = this.f1802g.b0((long) i3);
                        char c2 = (char) (c << 4);
                        byte b = (byte) 48;
                        if (b0 < b || b0 > ((byte) 57)) {
                            byte b2 = (byte) 97;
                            if ((b0 < b2 || b0 > ((byte) 102)) && (b0 < (b2 = (byte) 65) || b0 > ((byte) 70))) {
                                throw M("\\u" + this.f1802g.Q0(4));
                            }
                            i2 = (b0 - b2) + 10;
                        } else {
                            i2 = b0 - b;
                        }
                        c = (char) (c2 + i2);
                    }
                    this.f1802g.x(4);
                    return c;
                }
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            } else if (readByte == 't') {
                return 9;
            } else {
                if (readByte == 'b') {
                    return 8;
                }
                if (readByte == 'n') {
                    return 10;
                }
                if (readByte == 'r') {
                    return 13;
                }
                if (readByte == 10 || readByte == '\'' || readByte == '\"' || readByte == '\\' || readByte == '/' || i()) {
                    return readByte;
                }
                throw M("Invalid escape sequence: \\" + readByte);
            }
        } else {
            throw M("Unterminated escape sequence");
        }
    }

    public <T> T B0() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : b()) == 7) {
            this.f1803h = 0;
            int[] iArr = this.o;
            int i2 = this.f1808m - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + peek() + " at path " + getPath());
    }

    public c X() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : b()) == 1) {
            y(3);
            this.f1803h = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    public void close() {
        this.f1803h = 0;
        this.f1807l[0] = 8;
        this.f1808m = 1;
        this.f1802g.h();
        this.r.close();
    }

    public String getPath() {
        return d.a.a(this.f1808m, this.f1807l, this.f1809n, this.o);
    }

    public boolean h() {
        return this.q;
    }

    public boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : b();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    public boolean i() {
        return this.p;
    }

    public c k0() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : b()) == 4) {
            int i2 = this.f1808m - 1;
            this.f1808m = i2;
            int[] iArr = this.o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f1803h = 0;
            return this;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    public boolean nextBoolean() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : b();
        if (intValue == 5) {
            this.f1803h = 0;
            int[] iArr = this.o;
            int i2 = this.f1808m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (intValue == 6) {
            this.f1803h = 0;
            int[] iArr2 = this.o;
            int i3 = this.f1808m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
        }
    }

    public String nextName() {
        String str;
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : b()) {
            case 12:
                str = l(s);
                break;
            case 13:
                str = l(t);
                break;
            case 14:
                str = n();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f1803h = 0;
        this.f1809n[this.f1808m - 1] = str;
        return str;
    }

    public String nextString() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : b();
        if (intValue == 15) {
            str = String.valueOf(this.f1804i);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = l(s);
                    break;
                case 9:
                    str = l(t);
                    break;
                case 10:
                    str = n();
                    break;
                case 11:
                    String str2 = this.f1806k;
                    if (str2 != null) {
                        this.f1806k = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
            }
        } else {
            str = this.f1802g.Q0((long) this.f1805j);
        }
        this.f1803h = 0;
        int[] iArr = this.o;
        int i2 = this.f1808m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public c o0() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : b()) == 3) {
            y(1);
            this.o[this.f1808m - 1] = 0;
            this.f1803h = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
    }

    public c.a peek() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : b()) {
            case 1:
                return c.a.BEGIN_OBJECT;
            case 2:
                return c.a.END_OBJECT;
            case 3:
                return c.a.BEGIN_ARRAY;
            case 4:
                return c.a.END_ARRAY;
            case 5:
            case 6:
                return c.a.BOOLEAN;
            case 7:
                return c.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.a.STRING;
            case 12:
            case 13:
            case 14:
                return c.a.NAME;
            case 15:
            case 16:
                return c.a.NUMBER;
            case 17:
                return c.a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r7.f1803h = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void skipValue() {
        /*
            r7 = this;
            boolean r0 = r7.h()
            if (r0 != 0) goto L_0x0075
            r0 = 0
            r1 = 0
        L_0x0008:
            int r2 = r7.f1803h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.intValue()
            r4 = 1
            if (r3 != 0) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            int r2 = r2.intValue()
            goto L_0x0027
        L_0x0023:
            int r2 = r7.b()
        L_0x0027:
            switch(r2) {
                case 1: goto L_0x0058;
                case 2: goto L_0x004f;
                case 3: goto L_0x004b;
                case 4: goto L_0x0044;
                case 5: goto L_0x002a;
                case 6: goto L_0x002a;
                case 7: goto L_0x002a;
                case 8: goto L_0x003e;
                case 9: goto L_0x0038;
                case 10: goto L_0x0034;
                case 11: goto L_0x002a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0038;
                case 14: goto L_0x0034;
                case 15: goto L_0x002a;
                case 16: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x005e
        L_0x002b:
            l.f r2 = r7.f1802g
            int r3 = r7.f1805j
            long r5 = (long) r3
            r2.x(r5)
            goto L_0x005e
        L_0x0034:
            r7.L()
            goto L_0x005e
        L_0x0038:
            l.i r2 = t
            r7.D(r2)
            goto L_0x005e
        L_0x003e:
            l.i r2 = s
            r7.D(r2)
            goto L_0x005e
        L_0x0044:
            int r2 = r7.f1808m
            int r2 = r2 + -1
            r7.f1808m = r2
            goto L_0x0055
        L_0x004b:
            r7.y(r4)
            goto L_0x005c
        L_0x004f:
            int r2 = r7.f1808m
            int r2 = r2 + -1
            r7.f1808m = r2
        L_0x0055:
            int r1 = r1 + -1
            goto L_0x005e
        L_0x0058:
            r2 = 3
            r7.y(r2)
        L_0x005c:
            int r1 = r1 + 1
        L_0x005e:
            r7.f1803h = r0
            if (r1 != 0) goto L_0x0008
            int[] r0 = r7.o
            int r1 = r7.f1808m
            int r2 = r1 + -1
            r3 = r0[r2]
            int r3 = r3 + r4
            r0[r2] = r3
            java.lang.String[] r0 = r7.f1809n
            int r1 = r1 - r4
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        L_0x0075:
            com.apollographql.apollo.api.internal.json.JsonDataException r0 = new com.apollographql.apollo.api.internal.json.JsonDataException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot skip unexpected "
            r1.append(r2)
            com.apollographql.apollo.api.internal.json.c$a r2 = r7.peek()
            r1.append(r2)
            java.lang.String r2 = " at "
            r1.append(r2)
            java.lang.String r2 = r7.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.internal.json.a.skipValue():void");
    }

    public c z0() {
        Integer valueOf = Integer.valueOf(this.f1803h);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : b()) == 2) {
            int i2 = this.f1808m - 1;
            this.f1808m = i2;
            this.f1809n[i2] = null;
            int[] iArr = this.o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f1803h = 0;
            return this;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }
}
