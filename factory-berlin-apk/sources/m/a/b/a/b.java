package m.a.b.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.v;
import kotlin.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import m.a.c.g.c;

/* compiled from: ViewModelResolution.kt */
public final class b {

    /* compiled from: ViewModelResolution.kt */
    public static final class a implements p0.b {
        final /* synthetic */ m.a.c.l.a a;
        final /* synthetic */ a b;

        a(m.a.c.l.a aVar, a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public <T extends n0> T a(Class<T> cls) {
            k.f(cls, "modelClass");
            return (n0) this.a.e(this.b.a(), this.b.e(), this.b.d());
        }
    }

    /* renamed from: m.a.b.a.b$b  reason: collision with other inner class name */
    /* compiled from: ViewModelResolution.kt */
    static final class C0782b extends l implements kotlin.e0.c.a<T> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p0 f11146h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f11147i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Class f11148j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0782b(p0 p0Var, a aVar, Class cls) {
            super(0);
            this.f11146h = p0Var;
            this.f11147i = aVar;
            this.f11148j = cls;
        }

        /* renamed from: a */
        public final T d() {
            if (this.f11147i.e() != null) {
                return this.f11146h.b(this.f11147i.e().toString(), this.f11148j);
            }
            return this.f11146h.a(this.f11148j);
        }
    }

    public static final <T extends n0> p0 a(m.a.c.l.a aVar, r0 r0Var, a<T> aVar2) {
        k.f(aVar, "$this$createViewModelProvider");
        k.f(r0Var, "vmStore");
        k.f(aVar2, "parameters");
        return new p0(r0Var, new a(aVar, aVar2));
    }

    public static final <T extends n0> T b(p0 p0Var, a<T> aVar) {
        T t;
        k.f(p0Var, "$this$getInstance");
        k.f(aVar, "parameters");
        Class<T> a2 = kotlin.e0.a.a(aVar.a());
        if (m.a.c.b.c.b().d(m.a.c.g.b.DEBUG)) {
            m.a.c.b.c.b().a("!- ViewModelProvider getting instance");
            j a3 = m.a.c.m.a.a(new C0782b(p0Var, aVar, a2));
            T t2 = (n0) a3.a();
            double doubleValue = ((Number) a3.b()).doubleValue();
            c b = m.a.c.b.c.b();
            b.a("!- ViewModelProvider got instance in " + doubleValue);
            k.b(t2, "instance");
            return t2;
        }
        if (aVar.e() != null) {
            t = p0Var.b(aVar.e().toString(), a2);
        } else {
            t = p0Var.a(a2);
        }
        k.b(t, "if (parameters.qualifier….get(javaClass)\n        }");
        return t;
    }

    public static final <T extends n0> T c(m.a.c.a aVar, a<T> aVar2) {
        k.f(aVar, "$this$getViewModel");
        k.f(aVar2, "parameters");
        return b(a(aVar.d(), d(aVar2.c(), aVar2), aVar2), aVar2);
    }

    public static final <T extends n0> r0 d(v vVar, a<T> aVar) {
        k.f(vVar, "$this$getViewModelStore");
        k.f(aVar, "parameters");
        if (aVar.b() != null) {
            r0 o = aVar.b().d().o();
            k.b(o, "parameters.from.invoke().viewModelStore");
            return o;
        } else if (vVar instanceof d) {
            r0 o2 = ((d) vVar).o();
            k.b(o2, "this.viewModelStore");
            return o2;
        } else if (vVar instanceof Fragment) {
            r0 o3 = ((Fragment) vVar).o();
            k.b(o3, "this.viewModelStore");
            return o3;
        } else {
            throw new IllegalStateException(("Can't getByClass ViewModel '" + aVar.a() + "' on " + vVar + " - Is not a FragmentActivity nor a Fragment neither a valid ViewModelStoreOwner").toString());
        }
    }
}
