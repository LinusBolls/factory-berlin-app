package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {
    private e.b.a.b.b<String, b> a = new e.b.a.b.b<>();
    private Bundle b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private Recreator.a f1470d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1471e = true;

    public interface a {
        void a(b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    public void b(p pVar, Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            pVar.a(new t() {
                public void d(v vVar, p.a aVar) {
                    if (aVar == p.a.ON_START) {
                        SavedStateRegistry.this.f1471e = true;
                    } else if (aVar == p.a.ON_STOP) {
                        SavedStateRegistry.this.f1471e = false;
                    }
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        e.b.a.b.b<K, V>.d g2 = this.a.g();
        while (g2.hasNext()) {
            Map.Entry entry = (Map.Entry) g2.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.a.k(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) {
        if (this.f1471e) {
            if (this.f1470d == null) {
                this.f1470d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f1470d.b(cls.getName());
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
