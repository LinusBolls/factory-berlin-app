package com.sensorberg.notifications.sdk.internal;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import m.a.c.b;

/* compiled from: NotificationSdkComponent.kt */
final class f {
    private static b a;
    public static final f b = new f();

    /* compiled from: NotificationSdkComponent.kt */
    static final class a extends l implements kotlin.e0.c.l<b, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.h.a f5170h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m.a.c.h.a aVar) {
            super(1);
            this.f5170h = aVar;
        }

        public final void a(b bVar) {
            k.f(bVar, "$receiver");
            bVar.h(this.f5170h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((b) obj);
            return x.a;
        }
    }

    private f() {
    }

    public final m.a.c.a a() {
        b bVar = a;
        if (bVar != null) {
            return bVar.d();
        }
        k.q("koinInstance");
        throw null;
    }

    public final void b(m.a.c.h.a aVar) {
        k.f(aVar, "module");
        a = m.a.d.a.a(new a(aVar));
    }
}
