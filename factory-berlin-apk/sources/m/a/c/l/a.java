package m.a.c.l;

import java.util.ArrayList;
import java.util.Set;
import kotlin.h0.b;
import kotlin.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import m.a.c.f.c;
import org.koin.core.error.NoBeanDefFoundException;

/* compiled from: Scope.kt */
public final class a {
    private final m.a.c.k.a a;
    private c b;
    private final ArrayList<b> c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11173d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11174e;

    /* renamed from: f  reason: collision with root package name */
    private final m.a.c.a f11175f;

    /* renamed from: m.a.c.l.a$a  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    static final class C0786a extends l implements kotlin.e0.c.a<T> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f11176h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f11177i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f11178j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f11179k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0786a(a aVar, b bVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f11176h = aVar;
            this.f11177i = bVar;
            this.f11178j = aVar2;
            this.f11179k = aVar3;
        }

        public final T d() {
            return this.f11176h.i(this.f11178j, this.f11177i, this.f11179k);
        }
    }

    public a(String str, boolean z, m.a.c.a aVar) {
        k.f(str, "id");
        k.f(aVar, "_koin");
        this.f11173d = str;
        this.f11174e = z;
        this.f11175f = aVar;
        this.a = new m.a.c.k.a();
        this.c = new ArrayList<>();
    }

    private final m.a.c.e.b<?> d(m.a.c.j.a aVar, b<?> bVar) {
        m.a.c.e.b<?> e2 = this.a.e(aVar, bVar);
        if (e2 != null) {
            return e2;
        }
        if (!this.f11174e) {
            return this.f11175f.d().d(aVar, bVar);
        }
        throw new NoBeanDefFoundException("No definition found for '" + m.a.e.a.a(bVar) + "' has been found. Check your module definitions.");
    }

    /* access modifiers changed from: private */
    public final <T> T i(m.a.c.j.a aVar, b<?> bVar, kotlin.e0.c.a<m.a.c.i.a> aVar2) {
        return d(aVar, bVar).m(new c(this.f11175f, this, aVar2));
    }

    public final void b() {
        synchronized (this) {
            if (m.a.c.b.c.b().d(m.a.c.g.b.DEBUG)) {
                m.a.c.g.c b2 = m.a.c.b.c.b();
                b2.c("closing scope:'" + this.f11173d + '\'');
            }
            for (b a2 : this.c) {
                a2.a(this);
            }
            this.c.clear();
            c cVar = this.b;
            if (cVar != null) {
                cVar.c(this);
            }
            this.a.b();
            this.f11175f.c(this.f11173d);
            x xVar = x.a;
        }
    }

    public final void c() {
        if (this.f11174e) {
            Set<m.a.c.e.b<?>> d2 = this.a.d();
            if (!d2.isEmpty()) {
                for (m.a.c.e.b m2 : d2) {
                    m2.m(new c(this.f11175f, this, (kotlin.e0.c.a) null, 4, (DefaultConstructorMarker) null));
                }
            }
        }
    }

    public final <T> T e(b<?> bVar, m.a.c.j.a aVar, kotlin.e0.c.a<m.a.c.i.a> aVar2) {
        k.f(bVar, "clazz");
        synchronized (this) {
            if (m.a.c.b.c.b().d(m.a.c.g.b.DEBUG)) {
                m.a.c.g.c b2 = m.a.c.b.c.b();
                b2.a("+- get '" + m.a.e.a.a(bVar) + '\'');
                j a2 = m.a.c.m.a.a(new C0786a(this, bVar, aVar, aVar2));
                T a3 = a2.a();
                double doubleValue = ((Number) a2.b()).doubleValue();
                m.a.c.g.c b3 = m.a.c.b.c.b();
                b3.a("+- got '" + m.a.e.a.a(bVar) + "' in " + doubleValue + " ms");
                return a3;
            }
            T i2 = i(aVar, bVar, aVar2);
            return i2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (k.a(this.f11173d, aVar.f11173d)) {
                    if (!(this.f11174e == aVar.f11174e) || !k.a(this.f11175f, aVar.f11175f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final m.a.c.k.a f() {
        return this.a;
    }

    public final String g() {
        return this.f11173d;
    }

    public final c h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.f11173d;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f11174e;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        m.a.c.a aVar = this.f11175f;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        c cVar = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(",set:'");
        sb.append(cVar != null ? cVar.b() : null);
        sb.append('\'');
        String sb2 = sb.toString();
        return "Scope[id:'" + this.f11173d + '\'' + sb2 + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, boolean z, m.a.c.a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z, aVar);
    }
}
