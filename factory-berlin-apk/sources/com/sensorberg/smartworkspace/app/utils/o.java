package com.sensorberg.smartworkspace.app.utils;

import android.content.Context;
import g.a.a.h.b;
import g.a.a.h.c;
import g.e.n.g.s;
import kotlin.jvm.internal.k;
import org.threeten.bp.d;

/* compiled from: SmartSpaceSdkFactory.kt */
public final class o {
    public static final o a = new o();

    /* compiled from: SmartSpaceSdkFactory.kt */
    public static final class a implements b<Long> {
        a() {
        }

        public /* bridge */ /* synthetic */ c a(Object obj) {
            return d(((Number) obj).longValue());
        }

        /* renamed from: c */
        public Long b(c<?> cVar) {
            k.e(cVar, "value");
            return Long.valueOf(d.V(String.valueOf(cVar.a)).e0());
        }

        public c<?> d(long j2) {
            return new c.f(g.e.n.c.i.a.b.b(j2));
        }
    }

    private o() {
    }

    private final b<Long> b() {
        return new a();
    }

    public final s a(Context context, c cVar) {
        k.e(context, "context");
        k.e(cVar, "config");
        n.a.a.f("Initializing Smartspaces App with standard SDK", new Object[0]);
        s.a aVar = new s.a(context, cVar.d(), cVar.t(), cVar.e());
        aVar.c(cVar.H());
        aVar.a(com.sensorberg.smartworkspace.app.i.f.a.f7155h, a.b());
        return aVar.b();
    }
}
