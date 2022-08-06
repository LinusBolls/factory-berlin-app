package com.sensorberg.smartworkspace.app.activities.login.internal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.f0;
import com.google.android.material.textfield.TextInputEditText;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.activities.login.internal.a;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/sensorberg/smartworkspace/app/activities/login/internal/UsernameLoginActivity;", "Lcom/sensorberg/smartworkspace/app/n/a/a;", "Landroid/os/Bundle;", "savedInstanceState", "", "handleSavedInstanceState", "(Landroid/os/Bundle;)V", "onCreate", "Lcom/sensorberg/smartworkspace/app/databinding/ActivityLoginUsernameBinding;", "binding", "Lcom/sensorberg/smartworkspace/app/databinding/ActivityLoginUsernameBinding;", "Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig$delegate", "Lkotlin/Lazy;", "getBuildConfig", "()Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig", "Lcom/sensorberg/smartworkspace/app/activities/login/internal/UsernameViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/activities/login/internal/UsernameViewModel;", "viewModel", "<init>", "()V", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: UsernameLoginActivity.kt */
public final class UsernameLoginActivity extends com.sensorberg.smartworkspace.app.n.a.a {
    public static final c C = new c((DefaultConstructorMarker) null);
    private final kotlin.e A = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private com.sensorberg.smartworkspace.app.k.d B;
    private final kotlin.e z = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f6932h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6933i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6934j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6932h = componentCallbacks;
            this.f6933i = aVar;
            this.f6934j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.c] */
        public final com.sensorberg.smartworkspace.app.utils.c d() {
            ComponentCallbacks componentCallbacks = this.f6932h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(com.sensorberg.smartworkspace.app.utils.c.class), this.f6933i, this.f6934j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f6935h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6936i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6937j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6935h = vVar;
            this.f6936i = aVar;
            this.f6937j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartworkspace.app.activities.login.internal.a, androidx.lifecycle.n0] */
        /* renamed from: a */
        public final a d() {
            return m.a.b.a.d.a.b.b(this.f6935h, v.b(a.class), this.f6936i, this.f6937j);
        }
    }

    /* compiled from: UsernameLoginActivity.kt */
    public static final class c {
        private c() {
        }

        private final Intent a(Context context) {
            return new Intent(context, UsernameLoginActivity.class);
        }

        public final com.sensorberg.smartworkspace.app.h.a.a b(int i2) {
            if (i2 == -1) {
                return com.sensorberg.smartworkspace.app.h.a.a.SUCCESSFUL;
            }
            if (i2 != 0) {
                n.a.a.c("unknown result code: " + i2, new Object[0]);
            }
            return com.sensorberg.smartworkspace.app.h.a.a.FAILED;
        }

        public final void c(Activity activity) {
            k.e(activity, "activity");
            activity.startActivityForResult(a(activity), 2);
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UsernameLoginActivity.kt */
    static final class d<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UsernameLoginActivity f6938g;

        /* compiled from: UsernameLoginActivity.kt */
        static final class a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f6939h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f6939h = dVar;
            }

            public final void a(x xVar) {
                k.e(xVar, "it");
                TextInputEditText textInputEditText = UsernameLoginActivity.M(this.f6939h.f6938g).A;
                k.d(textInputEditText, "binding.usernameInput");
                g.e.c.e.a(textInputEditText);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        d(UsernameLoginActivity usernameLoginActivity) {
            this.f6938g = usernameLoginActivity;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: UsernameLoginActivity.kt */
    static final class e<T> implements f0<g.e.h.a.a<? extends a.C0420a>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UsernameLoginActivity f6940g;

        e(UsernameLoginActivity usernameLoginActivity) {
            this.f6940g = usernameLoginActivity;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends a.C0420a> aVar) {
            a.C0420a aVar2 = (a.C0420a) aVar.b();
            if (aVar2 == null) {
                return;
            }
            if (k.a(aVar2, a.C0420a.b.a)) {
                this.f6940g.setResult(-1);
                this.f6940g.finish();
            } else if (aVar2 instanceof a.C0420a.C0421a) {
                UsernameLoginActivity.M(this.f6940g).x.setText(((a.C0420a.C0421a) aVar2).a());
                TextView textView = UsernameLoginActivity.M(this.f6940g).x;
                k.d(textView, "binding.loginError");
                textView.setVisibility(0);
            }
        }
    }

    public static final /* synthetic */ com.sensorberg.smartworkspace.app.k.d M(UsernameLoginActivity usernameLoginActivity) {
        com.sensorberg.smartworkspace.app.k.d dVar = usernameLoginActivity.B;
        if (dVar != null) {
            return dVar;
        }
        k.q("binding");
        throw null;
    }

    private final com.sensorberg.smartworkspace.app.utils.c N() {
        return (com.sensorberg.smartworkspace.app.utils.c) this.z.getValue();
    }

    private final a O() {
        return (a) this.A.getValue();
    }

    private final void P(Bundle bundle) {
        if (bundle == null) {
            if (N().D()) {
                O().K(N().y());
                O().J(N().w());
            }
            com.sensorberg.smartworkspace.app.k.d dVar = this.B;
            if (dVar != null) {
                dVar.A.requestFocus();
                com.sensorberg.smartworkspace.app.k.d dVar2 = this.B;
                if (dVar2 != null) {
                    TextInputEditText textInputEditText = dVar2.A;
                    k.d(textInputEditText, "binding.usernameInput");
                    g.e.c.e.c(textInputEditText);
                    return;
                }
                k.q("binding");
                throw null;
            }
            k.q("binding");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        n.a.a.f("Starting UsernamePasswordLoginActivity", new Object[0]);
        super.onCreate(bundle);
        com.sensorberg.smartworkspace.app.k.d dVar = (com.sensorberg.smartworkspace.app.k.d) L(R.layout.activity_login_username);
        this.B = dVar;
        if (dVar != null) {
            dVar.M(O());
            O().w().o(this, new d(this));
            O().B().o(this, new e(this));
            P(bundle);
            setResult(0);
            return;
        }
        k.q("binding");
        throw null;
    }
}
