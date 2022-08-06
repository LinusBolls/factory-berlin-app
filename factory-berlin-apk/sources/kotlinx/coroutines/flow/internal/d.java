package kotlinx.coroutines.flow.internal;

import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.x;
import kotlinx.coroutines.e3.c;

/* compiled from: ChannelFlow.kt */
public final class d<T> extends c<T, T> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c cVar, g gVar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i3 & 2) != 0 ? h.f10600g : gVar, (i3 & 4) != 0 ? -3 : i2);
    }

    /* access modifiers changed from: protected */
    public a<T> f(g gVar, int i2) {
        return new d(this.c, gVar, i2);
    }

    /* access modifiers changed from: protected */
    public Object m(kotlinx.coroutines.e3.d<? super T> dVar, kotlin.c0.d<? super x> dVar2) {
        Object a = this.c.a(dVar, dVar2);
        return a == d.c() ? a : x.a;
    }

    public d(c<? extends T> cVar, g gVar, int i2) {
        super(cVar, gVar, i2);
    }
}
