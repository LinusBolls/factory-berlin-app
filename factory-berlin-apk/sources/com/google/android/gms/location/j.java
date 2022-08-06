package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.c;
import g.b.a.b.c.e.b;
import g.b.a.b.c.e.s;

public class j {
    private static final a.g<s> a = new a.g<>();
    private static final a.C0060a<s, Object> b;
    public static final com.google.android.gms.common.api.a<Object> c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final d f2687d = new b();

    public static abstract class a<R extends g> extends c<R, s> {
        public a(d dVar) {
            super(j.c, dVar);
        }
    }

    static {
        o oVar = new o();
        b = oVar;
        c = new com.google.android.gms.common.api.a<>("LocationServices.API", oVar, a);
    }

    public static a a(Context context) {
        return new a(context);
    }
}
