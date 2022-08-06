package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;

final class SavedStateHandleController implements t {

    /* renamed from: g  reason: collision with root package name */
    private final String f948g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f949h = false;

    /* renamed from: i  reason: collision with root package name */
    private final j0 f950i;

    static final class a implements SavedStateRegistry.a {
        a() {
        }

        public void a(b bVar) {
            if (bVar instanceof s0) {
                r0 o = ((s0) bVar).o();
                SavedStateRegistry d2 = bVar.d();
                for (String b : o.c()) {
                    SavedStateHandleController.h(o.b(b), d2, bVar.a());
                }
                if (!o.c().isEmpty()) {
                    d2.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, j0 j0Var) {
        this.f948g = str;
        this.f950i = j0Var;
    }

    static void h(n0 n0Var, SavedStateRegistry savedStateRegistry, p pVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) n0Var.k("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.l()) {
            savedStateHandleController.i(savedStateRegistry, pVar);
            m(savedStateRegistry, pVar);
        }
    }

    static SavedStateHandleController j(SavedStateRegistry savedStateRegistry, p pVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, j0.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.i(savedStateRegistry, pVar);
        m(savedStateRegistry, pVar);
        return savedStateHandleController;
    }

    private static void m(final SavedStateRegistry savedStateRegistry, final p pVar) {
        p.b b = pVar.b();
        if (b == p.b.INITIALIZED || b.a(p.b.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            pVar.a(new t() {
                public void d(v vVar, p.a aVar) {
                    if (aVar == p.a.ON_START) {
                        pVar.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    public void d(v vVar, p.a aVar) {
        if (aVar == p.a.ON_DESTROY) {
            this.f949h = false;
            vVar.a().c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(SavedStateRegistry savedStateRegistry, p pVar) {
        if (!this.f949h) {
            this.f949h = true;
            pVar.a(this);
            savedStateRegistry.d(this.f948g, this.f950i.b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    public j0 k() {
        return this.f950i;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f949h;
    }
}
