package com.sensorberg.smartspaces.sdk.internal;

import android.content.Context;
import com.sensorberg.smartspaces.sdk.internal.v.e;
import g.e.n.g.a;
import g.e.n.g.c;
import g.e.n.g.f;
import g.e.n.g.g;
import g.e.n.g.j;
import g.e.n.g.r;
import g.e.n.g.s;
import g.e.n.g.v;
import g.e.n.g.x;
import g.e.n.g.y;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: SmartSpacesSdkImpl.kt */
public final class m implements s {
    private final y a;
    private final x b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private final g f6405d;

    /* renamed from: e  reason: collision with root package name */
    private final v f6406e;

    /* renamed from: f  reason: collision with root package name */
    private final f f6407f;

    /* renamed from: g  reason: collision with root package name */
    private final l f6408g;

    /* renamed from: h  reason: collision with root package name */
    private final a f6409h;

    /* renamed from: i  reason: collision with root package name */
    private final j f6410i;

    public m(Context context, boolean z, y yVar, x xVar, c cVar, g gVar, v vVar, f fVar, l lVar, a aVar, j jVar) {
        k.e(context, "context");
        k.e(yVar, "userManager");
        k.e(xVar, "unitController");
        k.e(cVar, "bookingManager");
        k.e(gVar, "iotDeviceController");
        k.e(vVar, "tapController");
        k.e(fVar, "graphQl");
        k.e(lVar, "refreshHandler");
        k.e(aVar, "authenticationController");
        k.e(jVar, "postBoxController");
        this.a = yVar;
        this.b = xVar;
        this.c = cVar;
        this.f6405d = gVar;
        this.f6406e = vVar;
        this.f6407f = fVar;
        this.f6408g = lVar;
        this.f6409h = aVar;
        this.f6410i = jVar;
        n.a.a.f("Initializing SmartWorkspace SDK", new Object[0]);
        b.f6392i.a(context);
        if (z) {
            e.f6834f.a(context);
        }
    }

    public void c(List<? extends r> list) {
        k.e(list, "refreshList");
        this.f6408g.c(list);
    }

    public void d(r rVar) {
        k.e(rVar, "refresh");
        this.f6408g.c(m.b(rVar));
    }

    public g e() {
        return this.f6405d;
    }

    public y f() {
        return this.a;
    }

    public j g() {
        return this.f6410i;
    }

    public a h() {
        return this.f6409h;
    }

    public x i() {
        return this.b;
    }

    public v j() {
        return this.f6406e;
    }

    public f k() {
        return this.f6407f;
    }

    public c l() {
        return this.c;
    }
}
