package g.b.a.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import g.b.a.a.i.r;
import g.b.a.a.i.v.c;
import g.b.a.a.i.v.i;
import g.b.a.a.i.v.j.b0;
import g.b.a.a.i.v.j.c0;
import g.b.a.a.i.v.j.f;
import g.b.a.a.i.v.j.h;
import g.b.a.a.i.v.j.i0;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent */
final class d extends r {

    /* renamed from: g  reason: collision with root package name */
    private i.a.a<Executor> f9272g;

    /* renamed from: h  reason: collision with root package name */
    private i.a.a<Context> f9273h;

    /* renamed from: i  reason: collision with root package name */
    private i.a.a f9274i;

    /* renamed from: j  reason: collision with root package name */
    private i.a.a f9275j;

    /* renamed from: k  reason: collision with root package name */
    private i.a.a f9276k;

    /* renamed from: l  reason: collision with root package name */
    private i.a.a<b0> f9277l;

    /* renamed from: m  reason: collision with root package name */
    private i.a.a<g> f9278m;

    /* renamed from: n  reason: collision with root package name */
    private i.a.a<s> f9279n;
    private i.a.a<c> o;
    private i.a.a<m> p;
    private i.a.a<q> q;
    private i.a.a<q> r;

    /* compiled from: DaggerTransportRuntimeComponent */
    private static final class b implements r.a {
        private Context a;

        private b() {
        }

        public b a(Context context) {
            h.a.d.b(context);
            this.a = context;
            return this;
        }

        public r k() {
            h.a.d.a(this.a, Context.class);
            return new d(this.a);
        }

        public /* bridge */ /* synthetic */ r.a l(Context context) {
            a(context);
            return this;
        }
    }

    public static r.a h() {
        return new b();
    }

    private void i(Context context) {
        this.f9272g = h.a.a.a(j.a());
        h.a.b a2 = h.a.c.a(context);
        this.f9273h = a2;
        j a3 = j.a(a2, g.b.a.a.i.w.c.a(), g.b.a.a.i.w.d.a());
        this.f9274i = a3;
        this.f9275j = h.a.a.a(l.a(this.f9273h, a3));
        this.f9276k = i0.a(this.f9273h, f.a(), g.b.a.a.i.v.j.g.a());
        this.f9277l = h.a.a.a(c0.a(g.b.a.a.i.w.c.a(), g.b.a.a.i.w.d.a(), h.a(), this.f9276k));
        g.b.a.a.i.v.g b2 = g.b.a.a.i.v.g.b(g.b.a.a.i.w.c.a());
        this.f9278m = b2;
        i a4 = i.a(this.f9273h, this.f9277l, b2, g.b.a.a.i.w.d.a());
        this.f9279n = a4;
        i.a.a<Executor> aVar = this.f9272g;
        i.a.a aVar2 = this.f9275j;
        i.a.a<b0> aVar3 = this.f9277l;
        this.o = g.b.a.a.i.v.d.a(aVar, aVar2, a4, aVar3, aVar3);
        i.a.a<Context> aVar4 = this.f9273h;
        i.a.a aVar5 = this.f9275j;
        i.a.a<b0> aVar6 = this.f9277l;
        this.p = n.a(aVar4, aVar5, aVar6, this.f9279n, this.f9272g, aVar6, g.b.a.a.i.w.c.a());
        i.a.a<Executor> aVar7 = this.f9272g;
        i.a.a<b0> aVar8 = this.f9277l;
        this.q = com.google.android.datatransport.runtime.scheduling.jobscheduling.r.a(aVar7, aVar8, this.f9279n, aVar8);
        this.r = h.a.a.a(s.a(g.b.a.a.i.w.c.a(), g.b.a.a.i.w.d.a(), this.o, this.p, this.q));
    }

    /* access modifiers changed from: package-private */
    public g.b.a.a.i.v.j.c a() {
        return this.f9277l.get();
    }

    /* access modifiers changed from: package-private */
    public q b() {
        return this.r.get();
    }

    private d(Context context) {
        i(context);
    }
}
