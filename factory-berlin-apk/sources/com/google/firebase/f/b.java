package com.google.firebase.f;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import com.google.firebase.f.c;

/* compiled from: DefaultHeartBeatInfo */
public class b implements c {
    private d a;

    private b(Context context) {
        this.a = d.a(context);
    }

    public static d<c> b() {
        d.b<c> a2 = d.a(c.class);
        a2.b(n.f(Context.class));
        a2.e(a.b());
        return a2.c();
    }

    static /* synthetic */ c c(e eVar) {
        return new b((Context) eVar.get(Context.class));
    }

    public c.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = this.a.c(str, currentTimeMillis);
        boolean b = this.a.b(currentTimeMillis);
        if (c && b) {
            return c.a.COMBINED;
        }
        if (b) {
            return c.a.GLOBAL;
        }
        if (c) {
            return c.a.SDK;
        }
        return c.a.NONE;
    }
}
