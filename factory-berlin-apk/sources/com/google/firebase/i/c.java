package com.google.firebase.i;

import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher */
public class c implements h {
    private final String a;
    private final d b;

    c(Set<f> set, d dVar) {
        this.a = d(set);
        this.b = dVar;
    }

    public static d<h> b() {
        d.b<h> a2 = d.a(h.class);
        a2.b(n.g(f.class));
        a2.e(b.b());
        return a2.c();
    }

    static /* synthetic */ h c(e eVar) {
        return new c(eVar.a(f.class), d.a());
    }

    private static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
