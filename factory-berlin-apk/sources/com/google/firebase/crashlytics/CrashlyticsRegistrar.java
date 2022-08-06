package com.google.firebase.crashlytics;

import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.crashlytics.d.a;
import com.google.firebase.i.g;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements h {
    /* access modifiers changed from: private */
    public c b(e eVar) {
        return c.a((c) eVar.get(c.class), (com.google.firebase.installations.e) eVar.get(com.google.firebase.installations.e.class), (a) eVar.get(a.class), (com.google.firebase.analytics.a.a) eVar.get(com.google.firebase.analytics.a.a.class));
    }

    public List<d<?>> getComponents() {
        d.b<c> a = d.a(c.class);
        a.b(n.f(c.class));
        a.b(n.f(com.google.firebase.installations.e.class));
        a.b(n.e(com.google.firebase.analytics.a.a.class));
        a.b(n.e(a.class));
        a.e(b.b(this));
        a.d();
        return Arrays.asList(new d[]{a.c(), g.a("fire-cls", "17.2.1")});
    }
}
