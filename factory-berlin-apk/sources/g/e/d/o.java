package g.e.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;

/* compiled from: TabTypeManager.kt */
public final class o {
    private static final List<n> a = new ArrayList();
    public static final o b = new o();

    private o() {
    }

    public final void a(n nVar) {
        k.e(nVar, "abstractTabType");
        a.add(nVar);
    }

    public final void b() {
        a.clear();
    }

    public final List<n> c(List<String> list) {
        T t;
        k.e(list, "types");
        ArrayList arrayList = new ArrayList(o.p(list, 10));
        for (String str : list) {
            Iterator<T> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (k.a(((n) t).getType(), str)) {
                    break;
                }
            }
            n nVar = (n) t;
            if (nVar != null) {
                arrayList.add(nVar);
            } else {
                throw new NoSuchElementException("Unknown tab type: " + str);
            }
        }
        return arrayList;
    }
}
