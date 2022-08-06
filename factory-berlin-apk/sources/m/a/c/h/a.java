package m.a.c.h;

import java.util.ArrayList;
import kotlin.jvm.internal.k;
import m.a.c.e.b;
import m.a.c.e.e;
import m.a.d.c;

/* compiled from: Module.kt */
public final class a {
    private final ArrayList<b<?>> a = new ArrayList<>();
    private final ArrayList<c> b = new ArrayList<>();
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11170d;

    public a(boolean z, boolean z2) {
        this.c = z;
        this.f11170d = z2;
    }

    private final void d(b<?> bVar, e eVar) {
        boolean z = false;
        bVar.g().c(eVar.b() || this.c);
        e g2 = bVar.g();
        if (eVar.a() || this.f11170d) {
            z = true;
        }
        g2.d(z);
    }

    public final <T> void a(b<T> bVar, e eVar) {
        k.f(bVar, "definition");
        k.f(eVar, "options");
        d(bVar, eVar);
        this.a.add(bVar);
    }

    public final ArrayList<b<?>> b() {
        return this.a;
    }

    public final ArrayList<c> c() {
        return this.b;
    }
}
