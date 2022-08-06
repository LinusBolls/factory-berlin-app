package g.e.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import e.p.h;
import g.e.n.c.i.b;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;
import org.threeten.bp.d;
import org.threeten.bp.e;
import org.threeten.bp.o;

/* compiled from: Extensions.kt */
public final class f {

    /* compiled from: Extensions.kt */
    static final class a<T> implements f0<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c0 f9752g;

        a(c0 c0Var) {
            this.f9752g = c0Var;
        }

        public final void k(T t) {
            if (!k.a(this.f9752g.l(), t)) {
                this.f9752g.u(t);
            }
        }
    }

    public static final e a(e eVar) {
        k.e(eVar, "$this$atStartOfHour");
        e J0 = eVar.I0(0).K0(0).J0(0);
        k.d(J0, "withMinute(0).withSecond(0).withNano(0)");
        return J0;
    }

    public static final h.f b(h.f fVar, int i2) {
        k.e(fVar, "$this$copy");
        h.f.a aVar = new h.f.a();
        aVar.f(fVar.b);
        aVar.b(fVar.c);
        aVar.c(fVar.f8838e);
        aVar.d(fVar.f8837d);
        aVar.e(i2);
        h.f a2 = aVar.a();
        k.d(a2, "PagedList.Config.Builder…eSize(pageSize)\n\t.build()");
        return a2;
    }

    public static final <T> LiveData<T> c(LiveData<T> liveData) {
        k.e(liveData, "$this$debounce");
        c0 c0Var = new c0();
        c0Var.v(liveData, new a(c0Var));
        return c0Var;
    }

    public static final m d(LocalDate localDate) {
        k.e(localDate, "$this$getRelativeDay");
        return m.f9758l.a(b.d(localDate));
    }

    public static final void e(Intent intent, Context context, Uri uri) {
        k.e(intent, "$this$showUri");
        k.e(context, "context");
        k.e(uri, "uri");
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static final e f(long j2) {
        e s0 = e.s0(d.S(j2), o.C());
        k.d(s0, "LocalDateTime.ofInstant(…, ZoneId.systemDefault())");
        return s0;
    }
}
