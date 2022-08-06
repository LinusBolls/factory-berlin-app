package com.sensorberg.smartworkspace.app.activities.login.externalidentifier;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.f0;
import com.google.android.material.textfield.TextInputEditText;
import com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/sensorberg/smartworkspace/app/activities/login/externalidentifier/ExternalIdentifierLoginActivity;", "Landroidx/appcompat/app/c;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "()V", "Lcom/sensorberg/smartworkspace/app/databinding/ActivityLoginExternalIdentifierBinding;", "binding", "Lcom/sensorberg/smartworkspace/app/databinding/ActivityLoginExternalIdentifierBinding;", "Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig$delegate", "Lkotlin/Lazy;", "getBuildConfig", "()Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig", "Lcom/sensorberg/smartworkspace/app/activities/login/externalidentifier/ExternalIdentifierLoginViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/activities/login/externalidentifier/ExternalIdentifierLoginViewModel;", "viewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ExternalIdentifierLoginActivity.kt */
public final class ExternalIdentifierLoginActivity extends androidx.appcompat.app.c {
    public static final c B = new c((DefaultConstructorMarker) null);
    private final kotlin.e A = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e z = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f6911h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6912i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6913j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6911h = componentCallbacks;
            this.f6912i = aVar;
            this.f6913j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.c] */
        public final com.sensorberg.smartworkspace.app.utils.c d() {
            ComponentCallbacks componentCallbacks = this.f6911h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(com.sensorberg.smartworkspace.app.utils.c.class), this.f6912i, this.f6913j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f6914h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6915i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6916j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6914h = vVar;
            this.f6915i = aVar;
            this.f6916j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a] */
        /* renamed from: a */
        public final a d() {
            return m.a.b.a.d.a.b.b(this.f6914h, v.b(a.class), this.f6915i, this.f6916j);
        }
    }

    /* compiled from: ExternalIdentifierLoginActivity.kt */
    public static final class c {
        private c() {
        }

        private final Intent a(Context context) {
            return new Intent(context, ExternalIdentifierLoginActivity.class);
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
            activity.startActivityForResult(a(activity), 6);
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ExternalIdentifierLoginActivity.kt */
    static final class d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ExternalIdentifierLoginActivity f6917g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartworkspace.app.k.c f6918h;

        d(ExternalIdentifierLoginActivity externalIdentifierLoginActivity, com.sensorberg.smartworkspace.app.k.c cVar) {
            this.f6917g = externalIdentifierLoginActivity;
            this.f6918h = cVar;
        }

        public final void onClick(View view) {
            TextInputEditText textInputEditText = this.f6918h.a;
            k.d(textInputEditText, "binding.externalIdentifierTextInputEditText");
            this.f6917g.N().u(String.valueOf(textInputEditText.getText()));
        }
    }

    /* compiled from: ExternalIdentifierLoginActivity.kt */
    static final class e<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartworkspace.app.k.c f6919g;

        e(com.sensorberg.smartworkspace.app.k.c cVar) {
            this.f6919g = cVar;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            BlockingProgressBar blockingProgressBar = this.f6919g.f7157d;
            k.d(blockingProgressBar, "binding.progress");
            k.d(bool, "visible");
            blockingProgressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: ExternalIdentifierLoginActivity.kt */
    static final class f<T> implements f0<g.e.h.a.a<? extends Integer>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartworkspace.app.k.c f6920g;

        /* compiled from: ExternalIdentifierLoginActivity.kt */
        static final class a extends l implements kotlin.e0.c.l<Integer, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f6921h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f6921h = fVar;
            }

            public final void a(int i2) {
                this.f6921h.f6920g.c.setText(i2);
                TextView textView = this.f6921h.f6920g.c;
                k.d(textView, "binding.loginError");
                textView.setVisibility(0);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Number) obj).intValue());
                return x.a;
            }
        }

        f(com.sensorberg.smartworkspace.app.k.c cVar) {
            this.f6920g = cVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Integer> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: ExternalIdentifierLoginActivity.kt */
    static final class g<T> implements f0<g.e.h.a.a<? extends a.C0418a>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ExternalIdentifierLoginActivity f6922g;

        g(ExternalIdentifierLoginActivity externalIdentifierLoginActivity) {
            this.f6922g = externalIdentifierLoginActivity;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends a.C0418a> aVar) {
            if (k.a((a.C0418a) aVar.b(), a.C0418a.b.a)) {
                this.f6922g.setResult(-1);
                this.f6922g.finish();
            }
        }
    }

    private final com.sensorberg.smartworkspace.app.utils.c M() {
        return (com.sensorberg.smartworkspace.app.utils.c) this.z.getValue();
    }

    /* access modifiers changed from: private */
    public final a N() {
        return (a) this.A.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.sensorberg.smartworkspace.app.k.c b2 = com.sensorberg.smartworkspace.app.k.c.b(getLayoutInflater());
        k.d(b2, "ActivityLoginExternalIde…g.inflate(layoutInflater)");
        if (!p.s(M().x())) {
            b2.a.setText(M().x());
        }
        b2.b.setOnClickListener(new d(this, b2));
        N().w().o(this, new e(b2));
        N().v().o(this, new f(b2));
        N().x().o(this, new g(this));
        setContentView((View) b2.f7158e);
        setResult(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }
}
