package com.sensorberg.smartworkspace.app.activities.login.external;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.f0;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.activities.main.SingleActivity;
import e.c.b.b;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/sensorberg/smartworkspace/app/activities/login/external/ExternalLoginActivity;", "Lcom/sensorberg/smartworkspace/app/n/a/a;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig$delegate", "Lkotlin/Lazy;", "getBuildConfig", "()Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig", "<init>", "()V", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ExternalLoginActivity.kt */
public final class ExternalLoginActivity extends com.sensorberg.smartworkspace.app.n.a.a {
    public static final b A = new b((DefaultConstructorMarker) null);
    private final kotlin.e z = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f6894h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6895i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6896j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6894h = componentCallbacks;
            this.f6895i = aVar;
            this.f6896j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.c] */
        public final com.sensorberg.smartworkspace.app.utils.c d() {
            ComponentCallbacks componentCallbacks = this.f6894h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(com.sensorberg.smartworkspace.app.utils.c.class), this.f6895i, this.f6896j);
        }
    }

    /* compiled from: ExternalLoginActivity.kt */
    public static final class b {
        private b() {
        }

        public final void a(Activity activity, String str) {
            k.e(activity, "activity");
            k.e(str, "url");
            n.a.a.f("Launching oauth2 login flow via Chrome custom tab", new Object[0]);
            b.a aVar = new b.a();
            aVar.c(androidx.core.content.a.c(activity, R.color.secondary));
            aVar.a().a(activity, Uri.parse(str));
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ExternalLoginActivity.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ExternalLoginActivity f6897g;

        c(ExternalLoginActivity externalLoginActivity, com.sensorberg.smartworkspace.app.k.a aVar) {
            this.f6897g = externalLoginActivity;
        }

        public final void onClick(View view) {
            b bVar = ExternalLoginActivity.A;
            ExternalLoginActivity externalLoginActivity = this.f6897g;
            bVar.a(externalLoginActivity, externalLoginActivity.N().p());
            this.f6897g.finish();
        }
    }

    /* compiled from: ExternalLoginActivity.kt */
    static final class d<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ExternalLoginActivity f6898g;

        /* compiled from: ExternalLoginActivity.kt */
        static final class a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f6899h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f6899h = dVar;
            }

            public final void a(x xVar) {
                k.e(xVar, "it");
                g.e.c.e.b(this.f6899h.f6898g, new Intent(this.f6899h.f6898g, SingleActivity.class));
                this.f6899h.f6898g.overridePendingTransition(0, 0);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        d(ExternalLoginActivity externalLoginActivity, com.sensorberg.smartworkspace.app.k.a aVar) {
            this.f6898g = externalLoginActivity;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: ExternalLoginActivity.kt */
    static final class e<T> implements f0<g.e.h.a.a<? extends String>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartworkspace.app.k.a f6900g;

        /* compiled from: ExternalLoginActivity.kt */
        static final class a extends l implements kotlin.e0.c.l<String, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ e f6901h;

            /* renamed from: com.sensorberg.smartworkspace.app.activities.login.external.ExternalLoginActivity$e$a$a  reason: collision with other inner class name */
            /* compiled from: ExternalLoginActivity.kt */
            static final class C0416a implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ a f6902g;

                C0416a(a aVar) {
                    this.f6902g = aVar;
                }

                public final void run() {
                    TextView textView = this.f6902g.f6901h.f6900g.v;
                    k.d(textView, "bind.loginError");
                    textView.setVisibility(8);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f6901h = eVar;
            }

            public final void a(String str) {
                k.e(str, "message");
                TextView textView = this.f6901h.f6900g.v;
                k.d(textView, "bind.loginError");
                textView.setText(str);
                TextView textView2 = this.f6901h.f6900g.v;
                k.d(textView2, "bind.loginError");
                textView2.setVisibility(0);
                this.f6901h.f6900g.s().postDelayed(new C0416a(this), TimeUnit.SECONDS.toMillis(3));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((String) obj);
                return x.a;
            }
        }

        e(ExternalLoginActivity externalLoginActivity, com.sensorberg.smartworkspace.app.k.a aVar) {
            this.f6900g = aVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<String> aVar) {
            aVar.a(new a(this));
        }
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartworkspace.app.utils.c N() {
        return (com.sensorberg.smartworkspace.app.utils.c) this.z.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Bundle extras;
        String string;
        String dataString;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (dataString = intent.getDataString()) == null) {
            com.sensorberg.smartworkspace.app.k.a aVar = (com.sensorberg.smartworkspace.app.k.a) L(R.layout.activity_login_external);
            Intent intent2 = getIntent();
            if (intent2 != null && (extras = intent2.getExtras()) != null && (string = extras.getString("ExternalAuthLogin.key.data")) != null) {
                aVar.v.setOnClickListener(new c(this, aVar));
                a aVar2 = (a) m.a.b.a.d.a.b.b(this, v.b(a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
                aVar2.w().o(this, new d(this, aVar));
                aVar2.v().o(this, new e(this, aVar));
                k.d(string, "it");
                aVar2.x(string);
                return;
            }
            return;
        }
        Intent intent3 = new Intent(this, ExternalLoginActivity.class);
        intent3.putExtra("ExternalAuthLogin.key.data", dataString);
        g.e.c.e.b(this, intent3);
        overridePendingTransition(0, 0);
    }
}
