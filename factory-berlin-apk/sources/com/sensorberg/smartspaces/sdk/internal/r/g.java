package com.sensorberg.smartspaces.sdk.internal.r;

import com.sensorberg.smartspaces.sdk.internal.l;
import g.e.n.g.r;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: RefreshHandlerDecorator.kt */
public final class g extends a<l> implements l {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(l lVar) {
        super(lVar);
        k.e(lVar, "first");
    }

    public void c(List<? extends r> list) {
        k.e(list, "refresh");
        ((l) D()).c(list);
    }
}
