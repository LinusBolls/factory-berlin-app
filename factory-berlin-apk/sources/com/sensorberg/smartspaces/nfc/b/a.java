package com.sensorberg.smartspaces.nfc.b;

import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import m.a.c.b;

/* compiled from: NfcKoinComponent.kt */
final class a {
    private static b a;
    public static final a b = new a();

    /* renamed from: com.sensorberg.smartspaces.nfc.b.a$a  reason: collision with other inner class name */
    /* compiled from: NfcKoinComponent.kt */
    static final class C0356a extends l implements kotlin.e0.c.l<b, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f6172h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0356a(List list) {
            super(1);
            this.f6172h = list;
        }

        public final void a(b bVar) {
            k.e(bVar, "$receiver");
            bVar.g(this.f6172h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((b) obj);
            return x.a;
        }
    }

    private a() {
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
        throw new IllegalStateException("NfcKoinInstance has not been initialised");
    }

    public final void c(List<m.a.c.h.a> list) {
        k.e(list, "modules");
        a = m.a.d.a.a(new C0356a(list));
    }
}
