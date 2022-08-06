package retrofit2;

import java.util.regex.Pattern;
import k.b0;
import k.c0;
import k.s;
import k.u;
import k.v;
import k.x;
import k.y;
import l.f;
import l.g;

/* compiled from: RequestBuilder */
final class o {

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f11817l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f11818m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final String a;
    private final v b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private v.a f11819d;

    /* renamed from: e  reason: collision with root package name */
    private final b0.a f11820e = new b0.a();

    /* renamed from: f  reason: collision with root package name */
    private final u.a f11821f;

    /* renamed from: g  reason: collision with root package name */
    private x f11822g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11823h;

    /* renamed from: i  reason: collision with root package name */
    private y.a f11824i;

    /* renamed from: j  reason: collision with root package name */
    private s.a f11825j;

    /* renamed from: k  reason: collision with root package name */
    private c0 f11826k;

    /* compiled from: RequestBuilder */
    private static class a extends c0 {
        private final c0 b;
        private final x c;

        a(c0 c0Var, x xVar) {
            this.b = c0Var;
            this.c = xVar;
        }

        public long a() {
            return this.b.a();
        }

        public x b() {
            return this.c;
        }

        public void i(g gVar) {
            this.b.i(gVar);
        }
    }

    o(String str, v vVar, String str2, u uVar, x xVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = vVar;
        this.c = str2;
        this.f11822g = xVar;
        this.f11823h = z;
        if (uVar != null) {
            this.f11821f = uVar.g();
        } else {
            this.f11821f = new u.a();
        }
        if (z2) {
            this.f11825j = new s.a();
        } else if (z3) {
            y.a aVar = new y.a();
            this.f11824i = aVar;
            aVar.f(y.f10545h);
        }
    }

    private static String g(String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                f fVar = new f();
                fVar.i1(str, 0, i2);
                h(fVar, str, i2, length, z);
                return fVar.P0();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void h(f fVar, String str, int i2, int i3, boolean z) {
        f fVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (fVar2 == null) {
                        fVar2 = new f();
                    }
                    fVar2.j1(codePointAt);
                    while (!fVar2.Q()) {
                        byte readByte = fVar2.readByte() & 255;
                        fVar.a1(37);
                        fVar.a1(f11817l[(readByte >> 4) & 15]);
                        fVar.a1(f11817l[readByte & 15]);
                    }
                } else {
                    fVar.j1(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z) {
        if (z) {
            this.f11825j.b(str, str2);
        } else {
            this.f11825j.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f11822g = x.e(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e2);
            }
        } else {
            this.f11821f.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(u uVar, c0 c0Var) {
        this.f11824i.c(uVar, c0Var);
    }

    /* access modifiers changed from: package-private */
    public void d(y.c cVar) {
        this.f11824i.d(cVar);
    }

    /* access modifiers changed from: package-private */
    public void e(String str, String str2, boolean z) {
        if (this.c != null) {
            String g2 = g(str2, z);
            String str3 = this.c;
            String replace = str3.replace("{" + str + "}", g2);
            if (!f11818m.matcher(replace).matches()) {
                this.c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void f(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            v.a l2 = this.b.l(str3);
            this.f11819d = l2;
            if (l2 != null) {
                this.c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        if (z) {
            this.f11819d.a(str, str2);
        } else {
            this.f11819d.c(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public b0.a i() {
        v vVar;
        v.a aVar = this.f11819d;
        if (aVar != null) {
            vVar = aVar.d();
        } else {
            vVar = this.b.r(this.c);
            if (vVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        a aVar2 = this.f11826k;
        if (aVar2 == null) {
            s.a aVar3 = this.f11825j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                y.a aVar4 = this.f11824i;
                if (aVar4 != null) {
                    aVar2 = aVar4.e();
                } else if (this.f11823h) {
                    aVar2 = c0.f((x) null, new byte[0]);
                }
            }
        }
        x xVar = this.f11822g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, xVar);
            } else {
                this.f11821f.a("Content-Type", xVar.toString());
            }
        }
        b0.a aVar5 = this.f11820e;
        aVar5.m(vVar);
        aVar5.f(this.f11821f.e());
        aVar5.g(this.a, aVar2);
        return aVar5;
    }

    /* access modifiers changed from: package-private */
    public void j(c0 c0Var) {
        this.f11826k = c0Var;
    }
}
