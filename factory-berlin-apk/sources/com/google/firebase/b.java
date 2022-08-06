package com.google.firebase;

import android.content.Context;
import com.google.firebase.g.a;

/* compiled from: FirebaseApp */
final /* synthetic */ class b implements a {
    private final c a;
    private final Context b;

    private b(c cVar, Context context) {
        this.a = cVar;
        this.b = context;
    }

    public static a a(c cVar, Context context) {
        return new b(cVar, context);
    }

    public Object get() {
        return c.r(this.a, this.b);
    }
}
