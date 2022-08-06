package com.sensorberg.smartworkspace.app.activities.login.external;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.n0;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.App;
import g.e.m.d.e;
import g.e.m.d.f;
import g.e.n.g.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: ExternalLoginViewModel.kt */
public final class a extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f6903i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final e0<Boolean> f6904j = new e0<>();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e0<g.e.h.a.a<String>> f6905k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<String>> f6906l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final e0<g.e.h.a.a<x>> f6907m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<x>> f6908n;
    /* access modifiers changed from: private */
    public final String o;
    private final y p;

    /* renamed from: com.sensorberg.smartworkspace.app.activities.login.external.a$a  reason: collision with other inner class name */
    /* compiled from: ExternalLoginViewModel.kt */
    static final class C0417a extends l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6909h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0417a(a aVar) {
            super(1);
            this.f6909h = aVar;
        }

        public final void a(Void voidR) {
            this.f6909h.f6903i.set(false);
            this.f6909h.f6907m.u(new g.e.h.a.a(x.a));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: ExternalLoginViewModel.kt */
    static final class b extends l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6910h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f6910h = aVar;
        }

        public final void a(Exception exc) {
            String str;
            this.f6910h.f6903i.set(false);
            if (exc == null || (str = exc.getMessage()) == null) {
                str = this.f6910h.o;
            }
            this.f6910h.f6905k.s(new g.e.h.a.a(str));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    public a(y yVar, Resources resources) {
        k.e(yVar, "userManager");
        k.e(resources, "resources");
        this.p = yVar;
        e0<g.e.h.a.a<String>> e0Var = new e0<>();
        this.f6905k = e0Var;
        this.f6906l = e0Var;
        e0<g.e.h.a.a<x>> e0Var2 = new e0<>();
        this.f6907m = e0Var2;
        this.f6908n = e0Var2;
        String string = resources.getString(R.string.unknown_error);
        k.d(string, "resources.getString(R.string.unknown_error)");
        this.o = string;
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        this.f6904j.u(Boolean.TRUE);
        App.f6872k.a(this);
    }

    public final LiveData<g.e.h.a.a<String>> v() {
        return this.f6906l;
    }

    public final LiveData<g.e.h.a.a<x>> w() {
        return this.f6908n;
    }

    public final void x(String str) {
        k.e(str, "uri");
        if (this.f6903i.compareAndSet(false, true)) {
            e<Boolean, P> a = f.a(this.p.y(str), this.f6904j);
            a.g(new C0417a(this));
            a.f(new b(this));
        }
    }
}
