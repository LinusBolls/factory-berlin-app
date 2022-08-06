package androidx.work.impl.k;

import android.content.Context;
import androidx.work.i;
import androidx.work.impl.k.e.b;
import androidx.work.impl.k.e.c;
import androidx.work.impl.k.e.e;
import androidx.work.impl.k.e.f;
import androidx.work.impl.k.e.g;
import androidx.work.impl.k.e.h;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.k.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkConstraintsTracker */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f1702d = i.f("WorkConstraintsTracker");
    private final c a;
    private final c<?>[] b;
    private final Object c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = cVar;
        this.b = new c[]{new androidx.work.impl.k.e.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new androidx.work.impl.k.e.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    public void a(List<String> list) {
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (c(next)) {
                    i.c().a(f1702d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            if (this.a != null) {
                this.a.d(arrayList);
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.c) {
            if (this.a != null) {
                this.a.c(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.c) {
            for (c<?> cVar : this.b) {
                if (cVar.d(str)) {
                    i.c().a(f1702d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(List<j> list) {
        synchronized (this.c) {
            for (c<?> g2 : this.b) {
                g2.g((c.a) null);
            }
            for (c<?> e2 : this.b) {
                e2.e(list);
            }
            for (c<?> g3 : this.b) {
                g3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            for (c<?> f2 : this.b) {
                f2.f();
            }
        }
    }
}
