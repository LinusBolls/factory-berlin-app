package okhttp3.internal.http2;

import de.baimos.core.util.filter.ConnectionParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import l.b0;
import l.f;
import l.h;
import l.i;
import l.p;

/* compiled from: Hpack.kt */
public final class c {
    private static final b[] a = {new b(b.f11341i, ""), new b(b.f11338f, "GET"), new b(b.f11338f, "POST"), new b(b.f11339g, "/"), new b(b.f11339g, "/index.html"), new b(b.f11340h, "http"), new b(b.f11340h, "https"), new b(b.f11337e, "200"), new b(b.f11337e, "204"), new b(b.f11337e, "206"), new b(b.f11337e, "304"), new b(b.f11337e, "400"), new b(b.f11337e, "404"), new b(b.f11337e, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b((String) ConnectionParameters.IS_SERVER_SIDE, ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
    private static final Map<i, Integer> b;
    public static final c c;

    static {
        c cVar = new c();
        c = cVar;
        b = cVar.d();
    }

    private c() {
    }

    private final Map<i, Integer> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int length = a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!linkedHashMap.containsKey(a[i2].b)) {
                linkedHashMap.put(a[i2].b, Integer.valueOf(i2));
            }
        }
        Map<i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.b(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final i a(i iVar) {
        k.f(iVar, "name");
        int G = iVar.G();
        for (int i2 = 0; i2 < G; i2++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte l2 = iVar.l(i2);
            if (b2 <= l2 && b3 >= l2) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.L());
            }
        }
        return iVar;
    }

    public final Map<i, Integer> b() {
        return b;
    }

    public final b[] c() {
        return a;
    }

    /* compiled from: Hpack.kt */
    public static final class a {
        private final List<b> a;
        private final h b;
        public b[] c;

        /* renamed from: d  reason: collision with root package name */
        private int f11342d;

        /* renamed from: e  reason: collision with root package name */
        public int f11343e;

        /* renamed from: f  reason: collision with root package name */
        public int f11344f;

        /* renamed from: g  reason: collision with root package name */
        private final int f11345g;

        /* renamed from: h  reason: collision with root package name */
        private int f11346h;

        public a(b0 b0Var, int i2, int i3) {
            k.f(b0Var, "source");
            this.f11345g = i2;
            this.f11346h = i3;
            this.a = new ArrayList();
            this.b = p.d(b0Var);
            b[] bVarArr = new b[8];
            this.c = bVarArr;
            this.f11342d = bVarArr.length - 1;
        }

        private final void a() {
            int i2 = this.f11346h;
            int i3 = this.f11344f;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                d(i3 - i2);
            }
        }

        private final void b() {
            i.j(this.c, (Object) null, 0, 0, 6, (Object) null);
            this.f11342d = this.c.length - 1;
            this.f11343e = 0;
            this.f11344f = 0;
        }

        private final int c(int i2) {
            return this.f11342d + 1 + i2;
        }

        private final int d(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    if (length < this.f11342d || i2 <= 0) {
                        b[] bVarArr = this.c;
                        int i4 = this.f11342d;
                        System.arraycopy(bVarArr, i4 + 1, bVarArr, i4 + 1 + i3, this.f11343e);
                        this.f11342d += i3;
                    } else {
                        b bVar = this.c[length];
                        if (bVar != null) {
                            int i5 = bVar.a;
                            i2 -= i5;
                            this.f11344f -= i5;
                            this.f11343e--;
                            i3++;
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                }
                b[] bVarArr2 = this.c;
                int i42 = this.f11342d;
                System.arraycopy(bVarArr2, i42 + 1, bVarArr2, i42 + 1 + i3, this.f11343e);
                this.f11342d += i3;
            }
            return i3;
        }

        private final i f(int i2) {
            if (h(i2)) {
                return c.c.c()[i2].b;
            }
            int c2 = c(i2 - c.c.c().length);
            if (c2 >= 0) {
                b[] bVarArr = this.c;
                if (c2 < bVarArr.length) {
                    b bVar = bVarArr[c2];
                    if (bVar != null) {
                        return bVar.b;
                    }
                    k.m();
                    throw null;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private final void g(int i2, b bVar) {
            this.a.add(bVar);
            int i3 = bVar.a;
            if (i2 != -1) {
                b bVar2 = this.c[c(i2)];
                if (bVar2 != null) {
                    i3 -= bVar2.a;
                } else {
                    k.m();
                    throw null;
                }
            }
            int i4 = this.f11346h;
            if (i3 > i4) {
                b();
                return;
            }
            int d2 = d((this.f11344f + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f11343e + 1;
                b[] bVarArr = this.c;
                if (i5 > bVarArr.length) {
                    b[] bVarArr2 = new b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f11342d = this.c.length - 1;
                    this.c = bVarArr2;
                }
                int i6 = this.f11342d;
                this.f11342d = i6 - 1;
                this.c[i6] = bVar;
                this.f11343e++;
            } else {
                this.c[i2 + c(i2) + d2] = bVar;
            }
            this.f11344f += i3;
        }

        private final boolean h(int i2) {
            return i2 >= 0 && i2 <= c.c.c().length - 1;
        }

        private final int i() {
            return k.h0.b.b(this.b.readByte(), 255);
        }

        private final void l(int i2) {
            if (h(i2)) {
                this.a.add(c.c.c()[i2]);
                return;
            }
            int c2 = c(i2 - c.c.c().length);
            if (c2 >= 0) {
                b[] bVarArr = this.c;
                if (c2 < bVarArr.length) {
                    List<b> list = this.a;
                    b bVar = bVarArr[c2];
                    if (bVar != null) {
                        list.add(bVar);
                        return;
                    } else {
                        k.m();
                        throw null;
                    }
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private final void n(int i2) {
            g(-1, new b(f(i2), j()));
        }

        private final void o() {
            c cVar = c.c;
            i j2 = j();
            cVar.a(j2);
            g(-1, new b(j2, j()));
        }

        private final void p(int i2) {
            this.a.add(new b(f(i2), j()));
        }

        private final void q() {
            c cVar = c.c;
            i j2 = j();
            cVar.a(j2);
            this.a.add(new b(j2, j()));
        }

        public final List<b> e() {
            List<b> R = v.R(this.a);
            this.a.clear();
            return R;
        }

        public final i j() {
            int i2 = i();
            boolean z = (i2 & 128) == 128;
            long m2 = (long) m(i2, 127);
            if (!z) {
                return this.b.w(m2);
            }
            f fVar = new f();
            j.f11454d.b(this.b, m2, fVar);
            return fVar.K0();
        }

        public final void k() {
            while (!this.b.Q()) {
                int b2 = k.h0.b.b(this.b.readByte(), 255);
                if (b2 == 128) {
                    throw new IOException("index == 0");
                } else if ((b2 & 128) == 128) {
                    l(m(b2, 127) - 1);
                } else if (b2 == 64) {
                    o();
                } else if ((b2 & 64) == 64) {
                    n(m(b2, 63) - 1);
                } else if ((b2 & 32) == 32) {
                    int m2 = m(b2, 31);
                    this.f11346h = m2;
                    if (m2 < 0 || m2 > this.f11345g) {
                        throw new IOException("Invalid dynamic table size update " + this.f11346h);
                    }
                    a();
                } else if (b2 == 16 || b2 == 0) {
                    q();
                } else {
                    p(m(b2, 15) - 1);
                }
            }
        }

        public final int m(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int i6 = i();
                if ((i6 & 128) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += (i6 & 127) << i5;
                i5 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(b0 b0Var, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(b0Var, i2, (i4 & 4) != 0 ? i2 : i3);
        }
    }

    /* compiled from: Hpack.kt */
    public static final class b {
        private int a;
        private boolean b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public b[] f11347d;

        /* renamed from: e  reason: collision with root package name */
        private int f11348e;

        /* renamed from: f  reason: collision with root package name */
        public int f11349f;

        /* renamed from: g  reason: collision with root package name */
        public int f11350g;

        /* renamed from: h  reason: collision with root package name */
        public int f11351h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f11352i;

        /* renamed from: j  reason: collision with root package name */
        private final f f11353j;

        public b(int i2, boolean z, f fVar) {
            k.f(fVar, "out");
            this.f11351h = i2;
            this.f11352i = z;
            this.f11353j = fVar;
            this.a = Integer.MAX_VALUE;
            this.c = i2;
            b[] bVarArr = new b[8];
            this.f11347d = bVarArr;
            this.f11348e = bVarArr.length - 1;
        }

        private final void a() {
            int i2 = this.c;
            int i3 = this.f11350g;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                c(i3 - i2);
            }
        }

        private final void b() {
            i.j(this.f11347d, (Object) null, 0, 0, 6, (Object) null);
            this.f11348e = this.f11347d.length - 1;
            this.f11349f = 0;
            this.f11350g = 0;
        }

        private final int c(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f11347d.length;
                while (true) {
                    length--;
                    if (length < this.f11348e || i2 <= 0) {
                        b[] bVarArr = this.f11347d;
                        int i4 = this.f11348e;
                        System.arraycopy(bVarArr, i4 + 1, bVarArr, i4 + 1 + i3, this.f11349f);
                        b[] bVarArr2 = this.f11347d;
                        int i5 = this.f11348e;
                        Arrays.fill(bVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                        this.f11348e += i3;
                    } else {
                        b[] bVarArr3 = this.f11347d;
                        b bVar = bVarArr3[length];
                        if (bVar != null) {
                            i2 -= bVar.a;
                            int i6 = this.f11350g;
                            b bVar2 = bVarArr3[length];
                            if (bVar2 != null) {
                                this.f11350g = i6 - bVar2.a;
                                this.f11349f--;
                                i3++;
                            } else {
                                k.m();
                                throw null;
                            }
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                }
                b[] bVarArr4 = this.f11347d;
                int i42 = this.f11348e;
                System.arraycopy(bVarArr4, i42 + 1, bVarArr4, i42 + 1 + i3, this.f11349f);
                b[] bVarArr22 = this.f11347d;
                int i52 = this.f11348e;
                Arrays.fill(bVarArr22, i52 + 1, i52 + 1 + i3, (Object) null);
                this.f11348e += i3;
            }
            return i3;
        }

        private final void d(b bVar) {
            int i2 = bVar.a;
            int i3 = this.c;
            if (i2 > i3) {
                b();
                return;
            }
            c((this.f11350g + i2) - i3);
            int i4 = this.f11349f + 1;
            b[] bVarArr = this.f11347d;
            if (i4 > bVarArr.length) {
                b[] bVarArr2 = new b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f11348e = this.f11347d.length - 1;
                this.f11347d = bVarArr2;
            }
            int i5 = this.f11348e;
            this.f11348e = i5 - 1;
            this.f11347d[i5] = bVar;
            this.f11349f++;
            this.f11350g += i2;
        }

        public final void e(int i2) {
            this.f11351h = i2;
            int min = Math.min(i2, 16384);
            int i3 = this.c;
            if (i3 != min) {
                if (min < i3) {
                    this.a = Math.min(this.a, min);
                }
                this.b = true;
                this.c = min;
                a();
            }
        }

        public final void f(i iVar) {
            k.f(iVar, "data");
            if (!this.f11352i || j.f11454d.d(iVar) >= iVar.G()) {
                h(iVar.G(), 127, 0);
                this.f11353j.X0(iVar);
                return;
            }
            f fVar = new f();
            j.f11454d.c(iVar, fVar);
            i K0 = fVar.K0();
            h(K0.G(), 127, 128);
            this.f11353j.X0(K0);
        }

        public final void g(List<b> list) {
            int i2;
            int i3;
            k.f(list, "headerBlock");
            if (this.b) {
                int i4 = this.a;
                if (i4 < this.c) {
                    h(i4, 31, 32);
                }
                this.b = false;
                this.a = Integer.MAX_VALUE;
                h(this.c, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = list.get(i5);
                i K = bVar.b.K();
                i iVar = bVar.c;
                Integer num = c.c.b().get(K);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (2 <= i3 && 7 >= i3) {
                        if (k.a(c.c.c()[i3 - 1].c, iVar)) {
                            i2 = i3;
                        } else if (k.a(c.c.c()[i3].c, iVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.f11348e + 1;
                    int length = this.f11347d.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        b bVar2 = this.f11347d[i6];
                        if (bVar2 != null) {
                            if (k.a(bVar2.b, K)) {
                                b bVar3 = this.f11347d[i6];
                                if (bVar3 == null) {
                                    k.m();
                                    throw null;
                                } else if (k.a(bVar3.c, iVar)) {
                                    i3 = c.c.c().length + (i6 - this.f11348e);
                                    break;
                                } else if (i2 == -1) {
                                    i2 = (i6 - this.f11348e) + c.c.c().length;
                                }
                            }
                            i6++;
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                }
                if (i3 != -1) {
                    h(i3, 127, 128);
                } else if (i2 == -1) {
                    this.f11353j.a1(64);
                    f(K);
                    f(iVar);
                    d(bVar);
                } else if (!K.I(b.f11336d) || !(!k.a(b.f11341i, K))) {
                    h(i2, 63, 64);
                    f(iVar);
                    d(bVar);
                } else {
                    h(i2, 15, 0);
                    f(iVar);
                }
            }
        }

        public final void h(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.f11353j.a1(i2 | i4);
                return;
            }
            this.f11353j.a1(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.f11353j.a1(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.f11353j.a1(i5);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i2, boolean z, f fVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 4096 : i2, (i3 & 2) != 0 ? true : z, fVar);
        }
    }
}
