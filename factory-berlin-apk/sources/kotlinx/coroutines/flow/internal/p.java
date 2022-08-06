package kotlinx.coroutines.flow.internal;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.TypeCastException;
import kotlin.c0.g;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.x1;

/* compiled from: SafeCollector.common.kt */
public final class p {

    /* compiled from: SafeCollector.common.kt */
    static final class a extends l implements kotlin.e0.c.p<Integer, g.b, Integer> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f10929h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar) {
            super(2);
            this.f10929h = nVar;
        }

        public final int a(int i2, g.b bVar) {
            g.c key = bVar.getKey();
            g.b bVar2 = this.f10929h.f10927n.get(key);
            if (key != x1.f11076e) {
                return bVar != bVar2 ? RecyclerView.UNDEFINED_DURATION : i2 + 1;
            }
            x1 x1Var = (x1) bVar2;
            if (bVar != null) {
                x1 b = p.b((x1) bVar, x1Var);
                if (b == x1Var) {
                    return x1Var == null ? i2 : i2 + 1;
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n" + "\t\tChild of " + b + ", expected child of " + x1Var + ".\n" + "\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n" + "\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Job");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            return Integer.valueOf(a(((Number) obj).intValue(), (g.b) obj2));
        }
    }

    public static final void a(n<?> nVar, g gVar) {
        if (((Number) gVar.fold(0, new a(nVar))).intValue() != nVar.f10923j) {
            throw new IllegalStateException(("Flow invariant is violated:\n" + "\t\tFlow was collected in " + nVar.f10927n + ",\n" + "\t\tbut emission happened in " + gVar + ".\n" + "\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final x1 b(x1 x1Var, x1 x1Var2) {
        while (x1Var != null) {
            if (x1Var == x1Var2 || !(x1Var instanceof v)) {
                return x1Var;
            }
            x1Var = ((v) x1Var).V0();
        }
        return null;
    }
}
