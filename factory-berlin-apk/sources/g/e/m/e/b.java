package g.e.m.e;

import g.e.k.e;
import g.e.k.h;
import g.e.m.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: ResponseExtensions.kt */
public final class b {

    /* compiled from: ResponseExtensions.kt */
    static final class a extends l implements kotlin.e0.c.l<g.e.m.a<T, P>, T> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f9924h = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final T o(g.e.m.a<T, P> aVar) {
            if ((aVar != null ? aVar.f() : null) == a.b.SUCCESS) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: g.e.m.e.b$b  reason: collision with other inner class name */
    /* compiled from: ResponseExtensions.kt */
    static final class C0685b extends l implements kotlin.e0.c.l<g.e.m.a<T, P>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f9925h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0685b(String str) {
            super(1);
            this.f9925h = str;
        }

        public final void a(g.e.m.a<T, P> aVar) {
            String str;
            if (aVar != null) {
                int i2 = a.a[aVar.f().ordinal()];
                if (i2 == 1) {
                    str = "progress = " + aVar.e();
                } else if (i2 == 2) {
                    str = "data = " + aVar.c();
                } else if (i2 == 3) {
                    str = "exception = " + aVar.d();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                StringBuilder sb = new StringBuilder();
                String str2 = this.f9925h;
                if (str2 == null) {
                    str2 = "Response changed to";
                }
                sb.append(str2);
                sb.append(' ');
                sb.append(aVar.f());
                sb.append(';');
                sb.append(str);
                n.a.a.a(sb.toString(), new Object[0]);
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((g.e.m.a) obj);
            return x.a;
        }
    }

    public static final <T, P> e<T> a(e<g.e.m.a<T, P>> eVar) {
        k.e(eVar, "$this$onSuccess");
        return h.a.b(eVar, a.f9924h);
    }

    public static final <T, P> e<g.e.m.a<T, P>> b(e<g.e.m.a<T, P>> eVar, String str) {
        k.e(eVar, "$this$timber");
        eVar.r(new C0685b(str));
        return eVar;
    }
}
