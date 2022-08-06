package g.b.a.a.i.v;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import g.b.a.a.i.v.j.c;
import h.a.b;
import i.a.a;
import java.util.concurrent.Executor;

/* compiled from: DefaultScheduler_Factory */
public final class d implements b<c> {
    private final a<Executor> a;
    private final a<e> b;
    private final a<s> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<c> f9295d;

    /* renamed from: e  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.synchronization.a> f9296e;

    public d(a<Executor> aVar, a<e> aVar2, a<s> aVar3, a<c> aVar4, a<com.google.android.datatransport.runtime.synchronization.a> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f9295d = aVar4;
        this.f9296e = aVar5;
    }

    public static d a(a<Executor> aVar, a<e> aVar2, a<s> aVar3, a<c> aVar4, a<com.google.android.datatransport.runtime.synchronization.a> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: b */
    public c get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.f9295d.get(), this.f9296e.get());
    }
}
