package com.sensorberg.smartspaces.backend.m;

import g.e.k.e;
import kotlin.c0.d;
import kotlin.c0.j.a.h;
import kotlin.e0.c.l;
import kotlin.k;
import kotlin.x;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j;

/* compiled from: ObservableDataToCoroutine.kt */
public final class f {

    /* compiled from: ObservableDataToCoroutine.kt */
    public static final class a implements l<T, x> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f6041g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6042h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.a f6043i;

        a(i iVar, e eVar, g.e.k.a aVar) {
            this.f6041g = iVar;
            this.f6042h = eVar;
            this.f6043i = aVar;
        }

        public void a(T t) {
            if (this.f6043i.c()) {
                this.f6042h.v(this);
                i.a.a(this.f6041g, (Throwable) null, 1, (Object) null);
            }
            if (t != null) {
                this.f6042h.v(this);
                i iVar = this.f6041g;
                k.a aVar = k.f10687h;
                k.a(t);
                iVar.m(t);
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    public static final <T> Object a(e<T> eVar, g.e.k.a aVar, d<? super T> dVar) {
        j jVar = new j(c.b(dVar), 1);
        jVar.w();
        eVar.r(new a(jVar, eVar, aVar));
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }
}
