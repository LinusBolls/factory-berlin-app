package com.sensorberg.smartworkspace.app.utils;

import android.os.Handler;
import androidx.lifecycle.LiveData;
import g.e.h.b.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import kotlin.x;

/* compiled from: ExpirableLiveDataMap.kt */
public final class d<KEY, VALUE> extends LiveData<Map<KEY, ? extends VALUE>> {
    private final Map<KEY, a<KEY>> q = new LinkedHashMap();
    private final l<KEY, x> r = new b(this);
    private final Handler s;

    /* compiled from: ExpirableLiveDataMap.kt */
    public static final class a<KEY> {
        private final g.e.h.b.b a = c.b.a();
        private final Runnable b = new C0539a(this);
        private final KEY c;

        /* renamed from: d  reason: collision with root package name */
        private final long f8001d;

        /* renamed from: e  reason: collision with root package name */
        private final Handler f8002e;

        /* renamed from: f  reason: collision with root package name */
        private final l<KEY, x> f8003f;

        /* renamed from: com.sensorberg.smartworkspace.app.utils.d$a$a  reason: collision with other inner class name */
        /* compiled from: ExpirableLiveDataMap.kt */
        static final class C0539a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f8004g;

            C0539a(a aVar) {
                this.f8004g = aVar;
            }

            public final void run() {
                this.f8004g.b();
            }
        }

        public a(KEY key, long j2, Handler handler, l<? super KEY, x> lVar) {
            k.e(handler, "handler");
            k.e(lVar, "remover");
            this.c = key;
            this.f8001d = j2;
            this.f8002e = handler;
            this.f8003f = lVar;
        }

        /* access modifiers changed from: private */
        public final void b() {
            n.a.a.a("Expiring data for " + this.c, new Object[0]);
            this.f8003f.o(this.c);
            this.f8002e.removeCallbacks(this.b);
        }

        public final void c() {
            long a2 = this.a.a();
            long j2 = this.f8001d;
            if (a2 < j2) {
                long j3 = j2 - a2;
                n.a.a.a("Scheduling data `" + this.c + "` to be cleared in " + j3, new Object[0]);
                this.f8002e.postDelayed(this.b, j3);
                return;
            }
            b();
        }

        public final void d() {
            this.f8002e.removeCallbacks(this.b);
        }
    }

    /* compiled from: ExpirableLiveDataMap.kt */
    static final class b extends kotlin.jvm.internal.l implements l<KEY, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f8005h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.f8005h = dVar;
        }

        public final void a(KEY key) {
            this.f8005h.w(key);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    public d(Handler handler) {
        k.e(handler, "handler");
        this.s = handler;
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        for (a c : new ArrayList(this.q.values())) {
            c.c();
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        for (a d2 : this.q.values()) {
            d2.d();
        }
        super.r();
    }

    public final void v(KEY key, VALUE value, long j2) {
        Map b2 = y.b((Map) l());
        if (b2 == null) {
            b2 = new LinkedHashMap();
        }
        b2.put(key, value);
        a aVar = new a(key, j2, this.s, this.r);
        a aVar2 = this.q.get(key);
        if (aVar2 != null) {
            aVar2.d();
        }
        this.q.put(key, aVar);
        if (n()) {
            aVar.c();
        }
        u(b2);
    }

    public final void w(KEY key) {
        x(h0.a(key));
    }

    public final void x(Collection<? extends KEY> collection) {
        k.e(collection, "keys");
        Map b2 = y.b((Map) l());
        boolean z = false;
        for (T next : collection) {
            a remove = this.q.remove(next);
            if (remove != null) {
                remove.d();
                z = true;
            }
            if (!(b2 == null || b2.remove(next) == null)) {
                z = true;
            }
        }
        if (z) {
            u(b2);
        }
    }
}
