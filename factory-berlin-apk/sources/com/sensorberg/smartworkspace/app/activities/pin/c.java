package com.sensorberg.smartworkspace.app.activities.pin;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import com.sensorberg.smartworkspace.app.App;
import com.sensorberg.smartworkspace.app.utils.LockedState;
import com.sensorberg.smartworkspace.app.utils.j;
import com.sensorberg.smartworkspace.app.utils.p;
import g.e.g.a;
import g.e.n.g.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: PinViewModel.kt */
public final class c extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private String f7045i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final c0<b> f7046j = new c0<>();

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7047k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f7048l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final j f7049m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final y f7050n;
    /* access modifiers changed from: private */
    public final LockedState o;
    private final a p;

    /* compiled from: PinViewModel.kt */
    public enum a {
        UNLOCK,
        REGISTER,
        CHANGE
    }

    /* compiled from: PinViewModel.kt */
    public enum b {
        UNLOCK,
        REGISTER_1ST,
        REGISTER_2ND,
        CHANGE_1ST,
        CHANGE_2ND,
        PROCESSING,
        NO_MATCH,
        FINGERPRINT_NOT_RECOGNIZED,
        WRONG_PIN,
        LOGOUT,
        SUCCESS
    }

    /* renamed from: com.sensorberg.smartworkspace.app.activities.pin.c$c  reason: collision with other inner class name */
    /* compiled from: PinViewModel.kt */
    static final class C0428c<T> implements f0<a.b> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7063g;

        C0428c(c cVar) {
            this.f7063g = cVar;
        }

        /* renamed from: a */
        public final void k(a.b bVar) {
            if (bVar != null) {
                int i2 = d.c[bVar.ordinal()];
                if (i2 == 1) {
                    this.f7063g.f7046j.u(b.FINGERPRINT_NOT_RECOGNIZED);
                } else if (i2 == 2) {
                    this.f7063g.o.f(this.f7063g);
                    this.f7063g.f7046j.u(b.SUCCESS);
                }
            }
        }
    }

    /* compiled from: PinViewModel.kt */
    static final class d extends l implements kotlin.e0.c.l<Boolean, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f7064h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.f7064h = cVar;
        }

        public final void a(boolean z) {
            if (z) {
                this.f7064h.f7046j.u(b.PROCESSING);
                this.f7064h.D(b.CHANGE_1ST);
                return;
            }
            this.f7064h.f7046j.u(b.WRONG_PIN);
            this.f7064h.D(b.UNLOCK);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(((Boolean) obj).booleanValue());
            return x.a;
        }
    }

    /* compiled from: PinViewModel.kt */
    static final class e extends l implements kotlin.e0.c.l<Boolean, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f7065h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.f7065h = cVar;
        }

        public final void a(boolean z) {
            if (z) {
                this.f7065h.o.f(this.f7065h);
                this.f7065h.f7046j.u(b.SUCCESS);
                return;
            }
            c cVar = this.f7065h;
            cVar.f7048l = cVar.f7048l + 1;
            if (this.f7065h.f7048l >= 3) {
                this.f7065h.f7049m.d();
                this.f7065h.f7050n.g();
                this.f7065h.f7046j.u(b.LOGOUT);
                return;
            }
            this.f7065h.f7046j.u(b.WRONG_PIN);
            this.f7065h.D(b.UNLOCK);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(((Boolean) obj).booleanValue());
            return x.a;
        }
    }

    /* compiled from: PinViewModel.kt */
    static final class f implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7066g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7067h;

        f(c cVar, b bVar) {
            this.f7066g = cVar;
            this.f7067h = bVar;
        }

        public final void run() {
            this.f7066g.f7046j.u(this.f7067h);
        }
    }

    /* compiled from: PinViewModel.kt */
    public static final class g implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7068g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f7069h;

        g(c cVar, LiveData liveData) {
            this.f7068g = cVar;
            this.f7069h = liveData;
        }

        /* renamed from: a */
        public void k(Boolean bool) {
            if (k.a(bool, Boolean.TRUE)) {
                this.f7069h.t(this);
                this.f7068g.o.f(this.f7068g);
                this.f7068g.D(b.SUCCESS);
            }
        }
    }

    public c(j jVar, Application application, y yVar, LockedState lockedState, a aVar) {
        k.e(jVar, "pinInput");
        k.e(application, "application");
        k.e(yVar, "userManager");
        k.e(lockedState, "lockedState");
        k.e(aVar, "mode");
        this.f7049m = jVar;
        this.f7050n = yVar;
        this.o = lockedState;
        this.p = aVar;
        boolean c = g.e.g.a.a.c(application);
        this.f7047k = c;
        if (this.p == a.UNLOCK && c) {
            this.f7046j.v(g.e.g.a.a.a(application), y());
        }
        int i2 = d.a[this.p.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.f7046j.u(b.UNLOCK);
        } else if (i2 == 3) {
            this.f7046j.u(b.REGISTER_1ST);
        }
    }

    private final void A(String str) {
        if (this.f7046j.l() == b.UNLOCK) {
            this.f7049m.c(str, new d(this));
        } else if (this.f7046j.l() == b.CHANGE_1ST) {
            this.f7045i = str;
            this.f7046j.u(b.PROCESSING);
            D(b.CHANGE_2ND);
        } else if (this.f7046j.l() != b.CHANGE_2ND) {
        } else {
            if (k.a(str, this.f7045i)) {
                E(str);
                return;
            }
            this.f7046j.u(b.NO_MATCH);
            D(b.CHANGE_2ND);
        }
    }

    private final void B(String str) {
        if (this.f7046j.l() == b.REGISTER_1ST) {
            this.f7045i = str;
            this.f7046j.u(b.PROCESSING);
            D(b.REGISTER_2ND);
        } else if (this.f7046j.l() != b.REGISTER_2ND) {
        } else {
            if (k.a(str, this.f7045i)) {
                E(str);
                return;
            }
            this.f7046j.u(b.NO_MATCH);
            D(b.REGISTER_2ND);
        }
    }

    private final void C(String str) {
        if (this.f7046j.l() == b.UNLOCK) {
            this.f7049m.c(str, new e(this));
        }
    }

    /* access modifiers changed from: private */
    public final void D(b bVar) {
        p.f8017d.c().postDelayed(new f(this, bVar), 444);
    }

    private final void E(String str) {
        this.f7046j.u(b.PROCESSING);
        LiveData<Boolean> j2 = this.f7049m.j();
        j2.p(new g(this, j2));
        this.f7049m.k(str);
    }

    private final f0<a.b> y() {
        return new C0428c(this);
    }

    public final boolean F() {
        return this.f7047k && this.p == a.UNLOCK;
    }

    public final LiveData<b> G() {
        return this.f7046j;
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        App.f6872k.a(this);
    }

    public final void z(CharSequence charSequence) {
        k.e(charSequence, "chars");
        int i2 = d.b[this.p.ordinal()];
        if (i2 == 1) {
            C(charSequence.toString());
        } else if (i2 == 2) {
            A(charSequence.toString());
        } else if (i2 == 3) {
            B(charSequence.toString());
        }
    }
}
