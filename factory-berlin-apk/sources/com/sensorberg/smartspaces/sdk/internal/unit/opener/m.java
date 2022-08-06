package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.k.e;
import g.e.k.g;
import g.e.m.a;
import g.e.n.g.i;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: OpeningStep.kt */
public abstract class m extends e<g.e.m.a<IotUnit, i>> {
    public static final a u = new a((DefaultConstructorMarker) null);
    private volatile Exception q;
    private final l<Exception, x> r = new b(this);
    private g.e.n.g.e s;
    private g<g.e.m.a<IotUnit, i>> t;

    /* compiled from: OpeningStep.kt */
    public static final class a {

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.opener.m$a$a  reason: collision with other inner class name */
        /* compiled from: OpeningStep.kt */
        public static final class C0410a extends g<g.e.m.a<IotUnit, i>> {
            C0410a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: E */
            public void C(g.e.m.a<IotUnit, i> aVar) {
                g.e.m.a aVar2 = (g.e.m.a) n();
                IotUnit iotUnit = aVar2 != null ? (IotUnit) aVar2.c() : null;
                if (iotUnit != null) {
                    aVar = aVar != null ? g.e.m.a.b(aVar, (a.b) null, iotUnit, (Object) null, (Exception) null, 13, (Object) null) : null;
                }
                super.C(aVar);
            }
        }

        private a() {
        }

        public final e<g.e.m.a<IotUnit, i>> a(m mVar, g.e.n.g.e eVar) {
            k.e(mVar, "starter");
            C0410a aVar = new C0410a();
            n.a.a.a("Starting first step " + mVar.getClass().getSimpleName(), new Object[0]);
            mVar.A(aVar, eVar);
            return aVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OpeningStep.kt */
    static final class b extends kotlin.jvm.internal.l implements l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f6767h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(1);
            this.f6767h = mVar;
        }

        public final void a(Exception exc) {
            k.e(exc, "it");
            this.f6767h.a(exc);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    /* access modifiers changed from: private */
    public final void A(g<g.e.m.a<IotUnit, i>> gVar, g.e.n.g.e eVar) {
        this.s = eVar;
        this.t = gVar;
        if (eVar != null) {
            eVar.a(this.r);
        }
        gVar.D(this);
        n.a.a.a("Executing " + getClass().getSimpleName(), new Object[0]);
        F();
    }

    /* access modifiers changed from: private */
    public final void a(Exception exc) {
        n.a.a.a("Cancelling " + getClass().getSimpleName(), new Object[0]);
        this.q = exc;
        g.e.n.g.e eVar = this.s;
        if (eVar != null) {
            eVar.d(this.r);
        }
        E(exc);
        this.s = null;
    }

    /* access modifiers changed from: protected */
    public final Exception B() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public final boolean C() {
        return this.q != null;
    }

    /* access modifiers changed from: protected */
    public final void D(m mVar) {
        k.e(mVar, "next");
        n.a.a.a("Finished " + getClass().getSimpleName() + ", next is " + mVar.getClass().getSimpleName(), new Object[0]);
        g.e.n.g.e eVar = this.s;
        if (eVar != null) {
            eVar.d(this.r);
        }
        if (!C()) {
            g<g.e.m.a<IotUnit, i>> gVar = this.t;
            if (gVar != null) {
                mVar.A(gVar, this.s);
                this.s = null;
                return;
            }
            k.q("wrapper");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void E(Exception exc) {
        k.e(exc, "exception");
    }

    public abstract void F();
}
