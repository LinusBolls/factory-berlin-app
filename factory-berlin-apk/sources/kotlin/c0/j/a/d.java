package kotlin.c0.j.a;

import kotlin.c0.e;
import kotlin.c0.g;
import kotlin.jvm.internal.k;

/* compiled from: ContinuationImpl.kt */
public abstract class d extends a {

    /* renamed from: h  reason: collision with root package name */
    private transient kotlin.c0.d<Object> f10611h;

    /* renamed from: i  reason: collision with root package name */
    private final g f10612i;

    public d(kotlin.c0.d<Object> dVar, g gVar) {
        super(dVar);
        this.f10612i = gVar;
    }

    public g c() {
        g gVar = this.f10612i;
        k.c(gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    public void p() {
        kotlin.c0.d<Object> dVar = this.f10611h;
        if (!(dVar == null || dVar == this)) {
            g.b bVar = c().get(e.c);
            k.c(bVar);
            ((e) bVar).h(dVar);
        }
        this.f10611h = c.f10610g;
    }

    public final kotlin.c0.d<Object> q() {
        kotlin.c0.d<Object> dVar = this.f10611h;
        if (dVar == null) {
            e eVar = (e) c().get(e.c);
            if (eVar == null || (dVar = eVar.i(this)) == null) {
                dVar = this;
            }
            this.f10611h = dVar;
        }
        return dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(kotlin.c0.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.c() : null);
    }
}
