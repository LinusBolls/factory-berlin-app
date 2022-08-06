package g.b.a.a.i.v;

import g.b.a.a.h;
import g.b.a.a.i.m;

/* compiled from: DefaultScheduler */
final /* synthetic */ class a implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final c f9288g;

    /* renamed from: h  reason: collision with root package name */
    private final m f9289h;

    /* renamed from: i  reason: collision with root package name */
    private final h f9290i;

    /* renamed from: j  reason: collision with root package name */
    private final g.b.a.a.i.h f9291j;

    private a(c cVar, m mVar, h hVar, g.b.a.a.i.h hVar2) {
        this.f9288g = cVar;
        this.f9289h = mVar;
        this.f9290i = hVar;
        this.f9291j = hVar2;
    }

    public static Runnable a(c cVar, m mVar, h hVar, g.b.a.a.i.h hVar2) {
        return new a(cVar, mVar, hVar, hVar2);
    }

    public void run() {
        c.c(this.f9288g, this.f9289h, this.f9290i, this.f9291j);
    }
}
