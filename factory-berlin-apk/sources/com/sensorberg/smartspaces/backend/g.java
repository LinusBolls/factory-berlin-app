package com.sensorberg.smartspaces.backend;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: Cache.kt */
public final class g<T> {
    /* access modifiers changed from: private */
    public T a;

    /* compiled from: Cache.kt */
    static final class a extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f5602h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f5602h = gVar;
        }

        public final void a() {
            this.f5602h.a = null;
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public g(g.e.k.a aVar) {
        k.e(aVar, "cancellation");
        aVar.d(new a(this));
    }

    public final void b(T t) {
        this.a = t;
    }

    public final T c() {
        return this.a;
    }
}
