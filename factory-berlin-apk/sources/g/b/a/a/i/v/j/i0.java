package g.b.a.a.i.v.j;

import android.content.Context;
import h.a.b;
import i.a.a;

/* compiled from: SchemaManager_Factory */
public final class i0 implements b<h0> {
    private final a<Context> a;
    private final a<String> b;
    private final a<Integer> c;

    public i0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static i0 a(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        return new i0(aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public h0 get() {
        return new h0(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
