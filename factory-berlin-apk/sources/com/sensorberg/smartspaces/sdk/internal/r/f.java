package com.sensorberg.smartspaces.sdk.internal.r;

import android.app.Application;
import g.e.m.c;
import g.e.n.c.g.b;
import g.e.n.g.j;
import java.util.List;
import kotlin.c0.d;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: PostBoxControllerDecorator.kt */
public final class f extends a<j> implements j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(jVar);
        k.e(jVar, "first");
    }

    public Object B(b bVar, Application application, d<? super c<x>> dVar) {
        return ((j) D()).B(bVar, application, dVar);
    }

    public kotlinx.coroutines.e3.c<List<b>> q(String str) {
        k.e(str, "unitId");
        return ((j) D()).q(str);
    }
}
