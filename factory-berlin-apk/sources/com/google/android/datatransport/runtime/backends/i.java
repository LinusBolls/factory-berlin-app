package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import g.b.a.a.i.w.a;

/* compiled from: CreationContextFactory */
class i {
    private final Context a;
    private final a b;
    private final a c;

    i(Context context, a aVar, a aVar2) {
        this.a = context;
        this.b = aVar;
        this.c = aVar2;
    }

    /* access modifiers changed from: package-private */
    public h a(String str) {
        return h.a(this.a, this.b, this.c, str);
    }
}
