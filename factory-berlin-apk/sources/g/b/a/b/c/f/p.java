package g.b.a.b.c.f;

import g.b.a.b.d.b.h;
import g.b.a.b.d.b.i;

final class p extends l<h> {
    private final /* synthetic */ String a;
    private final /* synthetic */ i b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(m mVar, String str, i iVar) {
        super();
        this.a = str;
        this.b = iVar;
    }

    public final /* synthetic */ void a(Object obj) {
        String str = this.a;
        i.a aVar = new i.a(this.b);
        aVar.c(2);
        ((h) obj).b(str, aVar.a());
    }
}
