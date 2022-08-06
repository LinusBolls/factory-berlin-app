package com.apollographql.apollo.api.internal.json;

import g.a.a.h.c;
import g.a.a.h.p;
import g.a.a.h.q;
import g.a.a.h.s.f;
import g.a.a.h.s.g;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: InputFieldJsonWriter.kt */
public final class b implements g {
    private final f a;
    private final q b;

    /* compiled from: InputFieldJsonWriter.kt */
    private static final class a implements g.b {
        private final f a;
        private final q b;

        public a(f fVar, q qVar) {
            k.f(fVar, "jsonWriter");
            k.f(qVar, "scalarTypeAdapters");
            this.a = fVar;
            this.b = qVar;
        }

        public void a(p pVar, Object obj) {
            k.f(pVar, "scalarType");
            if (obj == null) {
                this.a.F();
                return;
            }
            c<?> a2 = this.b.a(pVar).a(obj);
            if (a2 instanceof c.f) {
                b((String) ((c.f) a2).a);
            } else if (a2 instanceof c.b) {
                d((Boolean) ((c.b) a2).a);
            } else if (a2 instanceof c.e) {
                e((Number) ((c.e) a2).a);
            } else if (a2 instanceof c.d) {
                h.a(((c.d) a2).a, this.a);
            } else if (a2 instanceof c.C0596c) {
                h.a(((c.C0596c) a2).a, this.a);
            }
        }

        public void b(String str) {
            if (str == null) {
                this.a.F();
            } else {
                this.a.r0(str);
            }
        }

        public void c(f fVar) {
            if (fVar == null) {
                this.a.F();
                return;
            }
            this.a.b();
            fVar.a(new b(this.a, this.b));
            this.a.i();
        }

        public void d(Boolean bool) {
            if (bool == null) {
                this.a.F();
            } else {
                this.a.l0(bool);
            }
        }

        public void e(Number number) {
            if (number == null) {
                this.a.F();
            } else {
                this.a.n0(number);
            }
        }
    }

    public b(f fVar, q qVar) {
        k.f(fVar, "jsonWriter");
        k.f(qVar, "scalarTypeAdapters");
        this.a = fVar;
        this.b = qVar;
    }

    public void a(String str, Integer num) {
        k.f(str, "fieldName");
        if (num == null) {
            f fVar = this.a;
            fVar.D(str);
            fVar.F();
            return;
        }
        f fVar2 = this.a;
        fVar2.D(str);
        fVar2.n0(num);
    }

    public void b(String str, g.c cVar) {
        k.f(str, "fieldName");
        if (cVar == null) {
            f fVar = this.a;
            fVar.D(str);
            fVar.F();
            return;
        }
        f fVar2 = this.a;
        fVar2.D(str);
        fVar2.a();
        cVar.a(new a(this.a, this.b));
        this.a.h();
    }

    public void c(String str, l<? super g.b, x> lVar) {
        k.f(str, "fieldName");
        k.f(lVar, "block");
        g.a.a(this, str, lVar);
    }

    public void d(String str, p pVar, Object obj) {
        k.f(str, "fieldName");
        k.f(pVar, "scalarType");
        if (obj == null) {
            f fVar = this.a;
            fVar.D(str);
            fVar.F();
            return;
        }
        c<?> a2 = this.b.a(pVar).a(obj);
        if (a2 instanceof c.f) {
            e(str, (String) ((c.f) a2).a);
        } else if (a2 instanceof c.b) {
            f(str, (Boolean) ((c.b) a2).a);
        } else if (a2 instanceof c.e) {
            g(str, (Number) ((c.e) a2).a);
        } else if (a2 instanceof c.d) {
            f fVar2 = this.a;
            fVar2.D(str);
            h.a(((c.d) a2).a, fVar2);
        } else if (a2 instanceof c.C0596c) {
            f fVar3 = this.a;
            fVar3.D(str);
            h.a(((c.C0596c) a2).a, fVar3);
        }
    }

    public void e(String str, String str2) {
        k.f(str, "fieldName");
        if (str2 == null) {
            f fVar = this.a;
            fVar.D(str);
            fVar.F();
            return;
        }
        f fVar2 = this.a;
        fVar2.D(str);
        fVar2.r0(str2);
    }

    public void f(String str, Boolean bool) {
        k.f(str, "fieldName");
        if (bool == null) {
            f fVar = this.a;
            fVar.D(str);
            fVar.F();
            return;
        }
        f fVar2 = this.a;
        fVar2.D(str);
        fVar2.l0(bool);
    }

    public void g(String str, Number number) {
        k.f(str, "fieldName");
        if (number == null) {
            f fVar = this.a;
            fVar.D(str);
            fVar.F();
            return;
        }
        f fVar2 = this.a;
        fVar2.D(str);
        fVar2.n0(number);
    }
}
