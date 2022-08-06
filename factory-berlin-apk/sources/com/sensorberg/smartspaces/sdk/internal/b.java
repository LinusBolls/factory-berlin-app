package com.sensorberg.smartspaces.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.sensorberg.smartspaces.sdk.internal.p.e;
import com.sensorberg.smartspaces.sdk.internal.p.i;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import g.e.c.c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;

/* compiled from: BlueIdLifeCycleSynchronization.kt */
public final class b extends a implements d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f6392i = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final String f6393g = "BlueIdSyncing";

    /* renamed from: h  reason: collision with root package name */
    private final C0382b f6394h = new C0382b(this);

    /* compiled from: BlueIdLifeCycleSynchronization.kt */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            k.e(context, "context");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new b());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.b$b  reason: collision with other inner class name */
    /* compiled from: BlueIdLifeCycleSynchronization.kt */
    private static final class C0382b extends m.f {
        private final b a;

        public C0382b(b bVar) {
            k.e(bVar, "blueIdLifeCycleSynchronization");
            this.a = bVar;
        }

        public void i(m mVar, Fragment fragment) {
            k.e(mVar, "fm");
            k.e(fragment, "f");
            super.i(mVar, fragment);
            this.a.i();
        }
    }

    /* access modifiers changed from: private */
    public final void i() {
        e eVar = (e) n().d().e(v.b(e.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
        if (!c.b.b(this.f6393g, TimeUnit.MINUTES.toMillis(5)) && eVar.a().n() == i.Ready) {
            eVar.b();
        }
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }

    public void onActivityPaused(Activity activity) {
        k.e(activity, "activity");
        if (activity instanceof androidx.fragment.app.d) {
            ((androidx.fragment.app.d) activity).s().b1(this.f6394h);
        }
    }

    public void onActivityResumed(Activity activity) {
        k.e(activity, "activity");
        if (activity instanceof androidx.appcompat.app.c) {
            ((androidx.appcompat.app.c) activity).s().L0(this.f6394h, true);
        }
        i();
    }
}
