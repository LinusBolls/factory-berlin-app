package m.a.a.a.b;

import android.app.Application;
import android.content.Context;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import m.a.c.e.c;
import m.a.c.e.d;

/* compiled from: KoinExt.kt */
public final class a {

    /* renamed from: m.a.a.a.b.a$a  reason: collision with other inner class name */
    /* compiled from: KoinExt.kt */
    static final class C0781a extends l implements p<m.a.c.l.a, m.a.c.i.a, Context> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f11142h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0781a(Context context) {
            super(2);
            this.f11142h = context;
        }

        /* renamed from: a */
        public final Context l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
            k.f(aVar, "$receiver");
            k.f(aVar2, "it");
            return this.f11142h;
        }
    }

    /* compiled from: KoinExt.kt */
    static final class b extends l implements p<m.a.c.l.a, m.a.c.i.a, Application> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f11143h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(2);
            this.f11143h = context;
        }

        /* renamed from: a */
        public final Application l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
            k.f(aVar, "$receiver");
            k.f(aVar2, "it");
            return (Application) this.f11143h;
        }
    }

    public static final m.a.c.b a(m.a.c.b bVar, Context context) {
        k.f(bVar, "$this$androidContext");
        k.f(context, "androidContext");
        if (m.a.c.b.c.b().d(m.a.c.g.b.INFO)) {
            m.a.c.b.c.b().c("[init] declare Android Context");
        }
        m.a.c.k.a f2 = bVar.d().d().f();
        c cVar = c.a;
        C0781a aVar = new C0781a(context);
        d dVar = d.Single;
        m.a.c.e.b bVar2 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(Context.class));
        bVar2.n(aVar);
        bVar2.o(dVar);
        f2.k(bVar2);
        if (context instanceof Application) {
            m.a.c.k.a f3 = bVar.d().d().f();
            c cVar2 = c.a;
            b bVar3 = new b(context);
            d dVar2 = d.Single;
            m.a.c.e.b bVar4 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(Application.class));
            bVar4.n(bVar3);
            bVar4.o(dVar2);
            f3.k(bVar4);
        }
        return bVar;
    }
}
