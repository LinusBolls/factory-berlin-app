package com.apollographql.apollo.api.internal.json;

import com.apollographql.apollo.api.internal.json.c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: ResponseJsonStreamReader.kt */
public class g {
    private final c a;

    /* compiled from: ResponseJsonStreamReader.kt */
    public interface a<T> {
        T a(g gVar);
    }

    /* compiled from: ResponseJsonStreamReader.kt */
    public interface b<T> {
        T a(g gVar);
    }

    /* compiled from: ResponseJsonStreamReader.kt */
    public static final class c implements a<Object> {
        final /* synthetic */ g a;

        c(g gVar) {
            this.a = gVar;
        }

        public Object a(g gVar) {
            k.f(gVar, "reader");
            if (this.a.d()) {
                return this.a.n();
            }
            if (this.a.g()) {
                return this.a.o();
            }
            return gVar.l(true);
        }
    }

    /* compiled from: ResponseJsonStreamReader.kt */
    public static final class d implements b<Map<String, ? extends Object>> {
        d() {
        }

        /* renamed from: b */
        public Map<String, Object> a(g gVar) {
            k.f(gVar, "reader");
            return gVar.q();
        }
    }

    public g(c cVar) {
        k.f(cVar, "jsonReader");
        this.a = cVar;
    }

    private final void a(boolean z) {
        if (!z && this.a.peek() == c.a.NULL) {
            throw new NullPointerException("corrupted response reader, expected non null value");
        }
    }

    private final boolean c() {
        return this.a.peek() == c.a.BOOLEAN;
    }

    private final boolean e() {
        return this.a.peek() == c.a.NULL;
    }

    private final boolean f() {
        return this.a.peek() == c.a.NUMBER;
    }

    public final boolean b() {
        return this.a.hasNext();
    }

    public final boolean d() {
        return this.a.peek() == c.a.BEGIN_ARRAY;
    }

    public final boolean g() {
        return this.a.peek() == c.a.BEGIN_OBJECT;
    }

    public final Boolean h(boolean z) {
        a(z);
        if (this.a.peek() == c.a.NULL) {
            return (Boolean) this.a.B0();
        }
        return Boolean.valueOf(this.a.nextBoolean());
    }

    public final <T> List<T> i(boolean z, a<T> aVar) {
        k.f(aVar, "listReader");
        a(z);
        if (this.a.peek() == c.a.NULL) {
            return (List) this.a.B0();
        }
        this.a.o0();
        ArrayList arrayList = new ArrayList();
        while (this.a.hasNext()) {
            arrayList.add(aVar.a(this));
        }
        this.a.k0();
        return arrayList;
    }

    public final String j() {
        return this.a.nextName();
    }

    public final <T> T k(boolean z, b<T> bVar) {
        k.f(bVar, "objectReader");
        a(z);
        if (this.a.peek() == c.a.NULL) {
            return this.a.B0();
        }
        this.a.X();
        T a2 = bVar.a(this);
        this.a.z0();
        return a2;
    }

    public Object l(boolean z) {
        a(z);
        if (e()) {
            p();
            x xVar = x.a;
            return null;
        } else if (c()) {
            return h(false);
        } else {
            if (!f()) {
                return m(false);
            }
            String m2 = m(false);
            if (m2 != null) {
                return new BigDecimal(m2);
            }
            k.m();
            throw null;
        }
    }

    public final String m(boolean z) {
        a(z);
        if (this.a.peek() == c.a.NULL) {
            return (String) this.a.B0();
        }
        return this.a.nextString();
    }

    public final List<Object> n() {
        return i(false, new c(this));
    }

    public final Map<String, Object> o() {
        return (Map) k(false, new d());
    }

    public final void p() {
        this.a.skipValue();
    }

    public final Map<String, Object> q() {
        if (g()) {
            return o();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (b()) {
            String j2 = j();
            if (e()) {
                p();
                x xVar = x.a;
                linkedHashMap.put(j2, (Object) null);
            } else if (g()) {
                linkedHashMap.put(j2, o());
            } else if (d()) {
                linkedHashMap.put(j2, n());
            } else {
                linkedHashMap.put(j2, l(true));
            }
        }
        return linkedHashMap;
    }
}
