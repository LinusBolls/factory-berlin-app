package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.g;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends g implements v, s0, o, androidx.savedstate.b, c {

    /* renamed from: h  reason: collision with root package name */
    private final w f55h = new w(this);

    /* renamed from: i  reason: collision with root package name */
    private final androidx.savedstate.a f56i = androidx.savedstate.a.a(this);

    /* renamed from: j  reason: collision with root package name */
    private r0 f57j;

    /* renamed from: k  reason: collision with root package name */
    private p0.b f58k;

    /* renamed from: l  reason: collision with root package name */
    private final OnBackPressedDispatcher f59l = new OnBackPressedDispatcher(new a());

    /* renamed from: m  reason: collision with root package name */
    private int f60m;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {
        Object a;
        r0 b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                a().a(new t() {
                    public void d(v vVar, p.a aVar) {
                        if (aVar == p.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            a().a(new t() {
                public void d(v vVar, p.a aVar) {
                    if (aVar == p.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.o().a();
                    }
                }
            });
            int i2 = Build.VERSION.SDK_INT;
            if (19 <= i2 && i2 <= 23) {
                a().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public p a() {
        return this.f55h;
    }

    public final OnBackPressedDispatcher c() {
        return this.f59l;
    }

    public final SavedStateRegistry d() {
        return this.f56i.b();
    }

    public p0.b i() {
        if (getApplication() != null) {
            if (this.f58k == null) {
                this.f58k = new k0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.f58k;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object m() {
        return null;
    }

    public r0 o() {
        if (getApplication() != null) {
            if (this.f57j == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f57j = bVar.b;
                }
                if (this.f57j == null) {
                    this.f57j = new r0();
                }
            }
            return this.f57j;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f59l.c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f56i.c(bundle);
        i0.g(this);
        int i2 = this.f60m;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object m2 = m();
        r0 r0Var = this.f57j;
        if (r0Var == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            r0Var = bVar.b;
        }
        if (r0Var == null && m2 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = m2;
        bVar2.b = r0Var;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        p a2 = a();
        if (a2 instanceof w) {
            ((w) a2).p(p.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f56i.d(bundle);
    }
}
