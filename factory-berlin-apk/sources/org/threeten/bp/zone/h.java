package org.threeten.bp.zone;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.bp.t.d;

/* compiled from: ZoneRulesProvider */
public abstract class h {
    private static final CopyOnWriteArrayList<h> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, h> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        g.a();
    }

    protected h() {
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(b.keySet());
    }

    private static h b(String str) {
        h hVar = (h) b.get(str);
        if (hVar != null) {
            return hVar;
        }
        if (b.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    public static f c(String str, boolean z) {
        d.i(str, "zoneId");
        return b(str).d(str, z);
    }

    public static void f(h hVar) {
        d.i(hVar, "provider");
        g(hVar);
        a.add(hVar);
    }

    private static void g(h hVar) {
        for (String next : hVar.e()) {
            d.i(next, "zoneId");
            if (b.putIfAbsent(next, hVar) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + next + ", currently loading from provider: " + hVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract f d(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract Set<String> e();
}
