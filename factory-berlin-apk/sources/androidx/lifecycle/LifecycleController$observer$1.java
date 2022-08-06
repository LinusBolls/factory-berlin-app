package androidx.lifecycle;

import androidx.lifecycle.p;
import java.util.concurrent.CancellationException;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.x1;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "<anonymous parameter 1>", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged"}, k = 3, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LifecycleController.kt */
final class LifecycleController$observer$1 implements t {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ q f926g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ x1 f927h;

    public final void d(v vVar, p.a aVar) {
        k.f(vVar, "source");
        k.f(aVar, "<anonymous parameter 1>");
        p a = vVar.a();
        k.b(a, "source.lifecycle");
        if (a.b() != p.b.DESTROYED) {
            p a2 = vVar.a();
            k.b(a2, "source.lifecycle");
            if (a2.b().compareTo(this.f926g.a) < 0) {
                this.f926g.b.a();
                throw null;
            } else {
                this.f926g.b.b();
                throw null;
            }
        } else {
            q qVar = this.f926g;
            x1.a.b(this.f927h, (CancellationException) null, 1, (Object) null);
            qVar.c();
            throw null;
        }
    }
}
