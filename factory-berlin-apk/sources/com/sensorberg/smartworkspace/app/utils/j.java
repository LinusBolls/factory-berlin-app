package com.sensorberg.smartworkspace.app.utils;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import kotlin.e;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: PinInput.kt */
public class j {
    /* access modifiers changed from: private */
    public String a;
    /* access modifiers changed from: private */
    public final e0<String> b;
    private final e c = g.a(new d(this));

    /* renamed from: d  reason: collision with root package name */
    private Context f8008d;

    /* renamed from: e  reason: collision with root package name */
    private c f8009e;

    /* renamed from: f  reason: collision with root package name */
    private final com.sensorberg.encryptor.d f8010f;

    /* compiled from: PinInput.kt */
    static final class a<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f8011g;

        a(j jVar) {
            this.f8011g = jVar;
        }

        /* renamed from: a */
        public final void k(String str) {
            this.f8011g.a = str;
        }
    }

    /* compiled from: PinInput.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PinInput.kt */
    public static final class c implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f8012g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f8013h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f8014i;

        c(j jVar, l lVar, String str) {
            this.f8012g = jVar;
            this.f8013h = lVar;
            this.f8014i = str;
        }

        /* renamed from: a */
        public void k(String str) {
            if (str != null) {
                this.f8012g.b.t(this);
                this.f8013h.o(Boolean.valueOf(k.a(str, this.f8014i)));
            }
        }
    }

    /* compiled from: PinInput.kt */
    static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<LiveData<Boolean>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f8015h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(0);
            this.f8015h = jVar;
        }

        /* renamed from: a */
        public final LiveData<Boolean> d() {
            return this.f8015h.f().contains("pin-input");
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public j(Context context, c cVar, com.sensorberg.encryptor.d dVar) {
        k.e(context, "context");
        k.e(cVar, "buildConfig");
        k.e(dVar, "encryptor");
        this.f8008d = context;
        this.f8009e = cVar;
        this.f8010f = dVar;
        this.b = dVar.b("pin-input");
        this.b.p(new a(this));
    }

    private final LiveData<Boolean> e() {
        return (LiveData) this.c.getValue();
    }

    private final boolean g() {
        Object systemService = this.f8008d.getSystemService("keyguard");
        if (systemService != null) {
            KeyguardManager keyguardManager = (KeyguardManager) systemService;
            if (Build.VERSION.SDK_INT >= 23) {
                return keyguardManager.isDeviceSecure();
            }
            return i() || h(keyguardManager);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.KeyguardManager");
    }

    private final boolean h(KeyguardManager keyguardManager) {
        return keyguardManager.isKeyguardSecure();
    }

    public final void c(String str, l<? super Boolean, x> lVar) {
        k.e(str, "other");
        k.e(lVar, "callback");
        String str2 = this.a;
        if (str2 != null) {
            lVar.o(Boolean.valueOf(k.a(str2, str)));
            return;
        }
        this.b.p(new c(this, lVar, str));
    }

    public final void d() {
        this.b.u(null);
    }

    public final com.sensorberg.encryptor.d f() {
        return this.f8010f;
    }

    public final boolean i() {
        return Settings.System.getInt(this.f8008d.getContentResolver(), "lock_pattern_autolock", 0) == 1;
    }

    public final LiveData<Boolean> j() {
        return e();
    }

    public final void k(String str) {
        k.e(str, "newPin");
        this.b.u(str);
    }

    public final boolean l() {
        String q = this.f8009e.q();
        if (k.a(q, "only_if_unprotected_device") && g()) {
            return false;
        }
        if (k.a(q, "always")) {
            return true;
        }
        return true ^ k.a(q, "never");
    }
}
