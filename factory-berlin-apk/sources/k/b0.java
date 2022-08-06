package k;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.h0.b;
import k.h0.f.f;
import k.u;
import kotlin.a0.l;
import kotlin.j;
import kotlin.jvm.internal.k;

/* compiled from: Request.kt */
public final class b0 {
    private d a;
    private final v b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final u f10276d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f10277e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, Object> f10278f;

    public b0(v vVar, String str, u uVar, c0 c0Var, Map<Class<?>, ? extends Object> map) {
        k.f(vVar, "url");
        k.f(str, "method");
        k.f(uVar, "headers");
        k.f(map, "tags");
        this.b = vVar;
        this.c = str;
        this.f10276d = uVar;
        this.f10277e = c0Var;
        this.f10278f = map;
    }

    public final c0 a() {
        return this.f10277e;
    }

    public final d b() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar;
        }
        d b2 = d.o.b(this.f10276d);
        this.a = b2;
        return b2;
    }

    public final Map<Class<?>, Object> c() {
        return this.f10278f;
    }

    public final String d(String str) {
        k.f(str, "name");
        return this.f10276d.a(str);
    }

    public final List<String> e(String str) {
        k.f(str, "name");
        return this.f10276d.k(str);
    }

    public final u f() {
        return this.f10276d;
    }

    public final boolean g() {
        return this.b.j();
    }

    public final String h() {
        return this.c;
    }

    public final a i() {
        return new a(this);
    }

    public final <T> T j(Class<? extends T> cls) {
        k.f(cls, "type");
        return cls.cast(this.f10278f.get(cls));
    }

    public final v k() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        if (this.f10276d.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (Object next : this.f10276d) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    j jVar = (j) next;
                    String str = (String) jVar.a();
                    String str2 = (String) jVar.b();
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i2 = i3;
                } else {
                    l.o();
                    throw null;
                }
            }
            sb.append(']');
        }
        if (!this.f10278f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f10278f);
        }
        sb.append('}');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* compiled from: Request.kt */
    public static class a {
        private v a;
        private String b;
        private u.a c;

        /* renamed from: d  reason: collision with root package name */
        private c0 f10279d;

        /* renamed from: e  reason: collision with root package name */
        private Map<Class<?>, Object> f10280e;

        public a() {
            this.f10280e = new LinkedHashMap();
            this.b = "GET";
            this.c = new u.a();
        }

        public a a(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            this.c.a(str, str2);
            return this;
        }

        public b0 b() {
            v vVar = this.a;
            if (vVar != null) {
                return new b0(vVar, this.b, this.c.e(), this.f10279d, b.P(this.f10280e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(d dVar) {
            k.f(dVar, "cacheControl");
            String dVar2 = dVar.toString();
            if (dVar2.length() == 0) {
                i("Cache-Control");
            } else {
                e("Cache-Control", dVar2);
            }
            return this;
        }

        public a d() {
            g("GET", (c0) null);
            return this;
        }

        public a e(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            this.c.i(str, str2);
            return this;
        }

        public a f(u uVar) {
            k.f(uVar, "headers");
            this.c = uVar.g();
            return this;
        }

        public a g(String str, c0 c0Var) {
            k.f(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ f.e(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!f.b(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.b = str;
                this.f10279d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a h(c0 c0Var) {
            k.f(c0Var, "body");
            g("POST", c0Var);
            return this;
        }

        public a i(String str) {
            k.f(str, "name");
            this.c.h(str);
            return this;
        }

        public <T> a j(Class<? super T> cls, T t) {
            k.f(cls, "type");
            if (t == null) {
                this.f10280e.remove(cls);
            } else {
                if (this.f10280e.isEmpty()) {
                    this.f10280e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f10280e;
                Object cast = cls.cast(t);
                if (cast != null) {
                    map.put(cls, cast);
                } else {
                    k.m();
                    throw null;
                }
            }
            return this;
        }

        public a k(Object obj) {
            j(Object.class, obj);
            return this;
        }

        public a l(String str) {
            k.f(str, "url");
            if (p.B(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                k.b(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (p.B(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                k.b(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            m(v.f10527l.d(str));
            return this;
        }

        public a m(v vVar) {
            k.f(vVar, "url");
            this.a = vVar;
            return this;
        }

        public a(b0 b0Var) {
            Map<Class<?>, Object> map;
            k.f(b0Var, "request");
            this.f10280e = new LinkedHashMap();
            this.a = b0Var.k();
            this.b = b0Var.h();
            this.f10279d = b0Var.a();
            if (b0Var.c().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = e0.o(b0Var.c());
            }
            this.f10280e = map;
            this.c = b0Var.f().g();
        }
    }
}
