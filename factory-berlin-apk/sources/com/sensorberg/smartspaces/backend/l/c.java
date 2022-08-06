package com.sensorberg.smartspaces.backend.l;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import m.a.c.b;

/* compiled from: BackendKoinComponent.kt */
final class c {
    private static b a;
    public static final c b = new c();

    /* compiled from: BackendKoinComponent.kt */
    static final class a extends l implements kotlin.e0.c.l<b, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.h.a f6011h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m.a.c.h.a aVar) {
            super(1);
            this.f6011h = aVar;
        }

        public final void a(b bVar) {
            k.e(bVar, "$receiver");
            bVar.h(this.f6011h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((b) obj);
            return x.a;
        }
    }

    private c() {
    }

    public final void a() {
        b().a();
        a = null;
    }

    public final m.a.c.a b() {
        m.a.c.a d2;
        b bVar = a;
        if (bVar != null && (d2 = bVar.d()) != null) {
            return d2;
        }
        throw new IllegalStateException("BackendKoinInstance has not been initialised");
    }

    public final void c(m.a.c.h.a aVar) {
        k.e(aVar, "module");
        a = m.a.d.a.a(new a(aVar));
    }
}
