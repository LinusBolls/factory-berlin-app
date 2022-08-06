package androidx.lifecycle;

import kotlin.jvm.internal.k;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.x1;

/* compiled from: ViewModel.kt */
public final class o0 {
    public static final i0 a(n0 n0Var) {
        k.f(n0Var, "$this$viewModelScope");
        i0 i0Var = (i0) n0Var.k("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (i0Var != null) {
            return i0Var;
        }
        Object o = n0Var.o("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new d(t2.b((x1) null, 1, (Object) null).plus(a1.c().r0())));
        k.b(o, "setTagIfAbsent(JOB_KEY,\n…patchers.Main.immediate))");
        return (i0) o;
    }
}
