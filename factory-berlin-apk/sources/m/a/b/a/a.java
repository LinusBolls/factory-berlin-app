package m.a.b.a;

import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import kotlin.h0.b;
import kotlin.jvm.internal.k;

/* compiled from: ViewModelParameters.kt */
public final class a<T> {
    private final b<T> a;
    private final v b;
    private final m.a.c.j.a c;

    /* renamed from: d  reason: collision with root package name */
    private final kotlin.e0.c.a<s0> f11144d;

    /* renamed from: e  reason: collision with root package name */
    private final kotlin.e0.c.a<m.a.c.i.a> f11145e;

    public a(b<T> bVar, v vVar, m.a.c.j.a aVar, kotlin.e0.c.a<? extends s0> aVar2, kotlin.e0.c.a<m.a.c.i.a> aVar3) {
        k.f(bVar, "clazz");
        k.f(vVar, "owner");
        this.a = bVar;
        this.b = vVar;
        this.c = aVar;
        this.f11144d = aVar2;
        this.f11145e = aVar3;
    }

    public final b<T> a() {
        return this.a;
    }

    public final kotlin.e0.c.a<s0> b() {
        return this.f11144d;
    }

    public final v c() {
        return this.b;
    }

    public final kotlin.e0.c.a<m.a.c.i.a> d() {
        return this.f11145e;
    }

    public final m.a.c.j.a e() {
        return this.c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2, kotlin.e0.c.a aVar3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, vVar, (i2 & 4) != 0 ? null : aVar, (i2 & 8) != 0 ? null : aVar2, (i2 & 16) != 0 ? null : aVar3);
    }
}
