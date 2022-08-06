package com.sensorberg.smartworkspace.app.screens.door.d;

import android.view.View;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.k.m1;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: FavoriteListViewHolder.kt */
public final class h extends d<i, m1> {
    private final m1 u;
    /* access modifiers changed from: private */
    public final l<IotUnit, x> v;
    /* access modifiers changed from: private */
    public final l<IotUnit, x> w;

    /* compiled from: FavoriteListViewHolder.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f7382g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f7383h;

        a(h hVar, i iVar) {
            this.f7382g = hVar;
            this.f7383h = iVar;
        }

        public final void onClick(View view) {
            this.f7382g.w.o(this.f7383h.d());
        }
    }

    /* compiled from: FavoriteListViewHolder.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f7384g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f7385h;

        b(h hVar, i iVar) {
            this.f7384g = hVar;
            this.f7385h = iVar;
        }

        public final void onClick(View view) {
            this.f7384g.v.o(this.f7385h.d());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.view.ViewGroup r2, com.sensorberg.smartworkspace.app.k.m1 r3, kotlin.e0.c.l<? super com.sensorberg.smartspaces.sdk.model.IotUnit, kotlin.x> r4, kotlin.e0.c.l<? super com.sensorberg.smartspaces.sdk.model.IotUnit, kotlin.x> r5) {
        /*
            r1 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.k.e(r2, r0)
            java.lang.String r2 = "binding"
            kotlin.jvm.internal.k.e(r3, r2)
            android.view.View r2 = r3.s()
            java.lang.String r0 = "binding.root"
            kotlin.jvm.internal.k.d(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            r1.u = r3
            r1.v = r4
            r1.w = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.door.d.h.<init>(android.view.ViewGroup, com.sensorberg.smartworkspace.app.k.m1, kotlin.e0.c.l, kotlin.e0.c.l):void");
    }

    /* renamed from: P */
    public void M(i iVar) {
        k.e(iVar, "model");
        this.u.M(iVar);
        if (this.w != null) {
            this.u.v.setOnClickListener(new a(this, iVar));
        }
        if (this.v != null) {
            this.u.s().setOnClickListener(new b(this, iVar));
        }
    }
}
