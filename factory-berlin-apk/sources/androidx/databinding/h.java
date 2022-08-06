package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MergedDataBinderMapper */
public class h extends c {
    private Set<Class<? extends c>> a = new HashSet();
    private List<c> b = new CopyOnWriteArrayList();
    private List<String> c = new CopyOnWriteArrayList();

    private boolean f() {
        boolean z = false;
        for (String next : this.c) {
            try {
                Class<?> cls = Class.forName(next);
                if (c.class.isAssignableFrom(cls)) {
                    e((c) cls.newInstance());
                    this.c.remove(next);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e2);
            } catch (InstantiationException e3) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e3);
            }
        }
        return z;
    }

    public ViewDataBinding b(e eVar, View view, int i2) {
        for (c b2 : this.b) {
            ViewDataBinding b3 = b2.b(eVar, view, i2);
            if (b3 != null) {
                return b3;
            }
        }
        if (f()) {
            return b(eVar, view, i2);
        }
        return null;
    }

    public ViewDataBinding c(e eVar, View[] viewArr, int i2) {
        for (c c2 : this.b) {
            ViewDataBinding c3 = c2.c(eVar, viewArr, i2);
            if (c3 != null) {
                return c3;
            }
        }
        if (f()) {
            return c(eVar, viewArr, i2);
        }
        return null;
    }

    public int d(String str) {
        for (c d2 : this.b) {
            int d3 = d2.d(str);
            if (d3 != 0) {
                return d3;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public void e(c cVar) {
        if (this.a.add(cVar.getClass())) {
            this.b.add(cVar);
            for (c e2 : cVar.a()) {
                e(e2);
            }
        }
    }
}
