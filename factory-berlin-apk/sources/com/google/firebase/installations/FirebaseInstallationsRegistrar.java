package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.i.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements h {
    static /* synthetic */ e lambda$getComponents$0(e eVar) {
        return new d((c) eVar.get(c.class), (com.google.firebase.i.h) eVar.get(com.google.firebase.i.h.class), (com.google.firebase.f.c) eVar.get(com.google.firebase.f.c.class));
    }

    public List<d<?>> getComponents() {
        d.b<e> a = d.a(e.class);
        a.b(n.f(c.class));
        a.b(n.f(com.google.firebase.f.c.class));
        a.b(n.f(com.google.firebase.i.h.class));
        a.e(f.b());
        return Arrays.asList(new d[]{a.c(), g.a("fire-installations", "16.3.3")});
    }
}
