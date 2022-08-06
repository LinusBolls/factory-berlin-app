package m.a.b.a.d.a;

import android.content.ComponentCallbacks;
import androidx.lifecycle.n0;
import androidx.lifecycle.v;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import m.a.c.a;

/* compiled from: LifecycleOwnerExt.kt */
public final class b {
    private static final a a(v vVar) {
        if (vVar != null) {
            return m.a.a.a.a.a.a((ComponentCallbacks) vVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }

    public static final <T extends n0> T b(v vVar, kotlin.h0.b<T> bVar, m.a.c.j.a aVar, kotlin.e0.c.a<m.a.c.i.a> aVar2) {
        k.f(vVar, "$this$getViewModel");
        k.f(bVar, "clazz");
        return m.a.b.a.b.c(a(vVar), new m.a.b.a.a(bVar, vVar, aVar, (kotlin.e0.c.a) null, aVar2, 8, (DefaultConstructorMarker) null));
    }
}
