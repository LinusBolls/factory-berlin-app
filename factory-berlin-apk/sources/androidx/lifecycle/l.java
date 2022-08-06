package androidx.lifecycle;

import androidx.lifecycle.k;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;

@f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1", f = "FlowLiveData.kt", l = {136}, m = "emit")
public final class l extends d {

    /* renamed from: j  reason: collision with root package name */
    /* synthetic */ Object f1016j;

    /* renamed from: k  reason: collision with root package name */
    int f1017k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ k.b.a f1018l;

    /* renamed from: m  reason: collision with root package name */
    Object f1019m;

    /* renamed from: n  reason: collision with root package name */
    Object f1020n;
    Object o;
    Object p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(k.b.a aVar, kotlin.c0.d dVar) {
        super(dVar);
        this.f1018l = aVar;
    }

    public final Object i(Object obj) {
        this.f1016j = obj;
        this.f1017k |= RecyclerView.UNDEFINED_DURATION;
        return this.f1018l.a((Object) null, this);
    }
}
