package com.sensorberg.smartspaces.sdk.internal.s;

import android.content.Context;
import g.a.a.h.p;
import java.util.List;
import java.util.Map;
import k.g;
import k.v;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: SmartspacesKoinComponent.kt */
public final class e {

    /* compiled from: SmartspacesKoinComponent.kt */
    static final class a extends l implements kotlin.e0.c.l<m.a.c.b, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f6611h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f6612i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6613j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, kotlin.e0.c.l lVar, kotlin.e0.c.a aVar) {
            super(1);
            this.f6611h = list;
            this.f6612i = lVar;
            this.f6613j = aVar;
        }

        public final void a(m.a.c.b bVar) {
            k.e(bVar, "$receiver");
            bVar.g(v.K(this.f6611h, this.f6612i.o(this.f6613j)));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.b) obj);
            return x.a;
        }
    }

    /* compiled from: SmartspacesKoinComponent.kt */
    static final class b extends l implements kotlin.e0.c.l<kotlin.e0.c.a<? extends x>, m.a.c.h.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f6614h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ v f6615i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f6616j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g f6617k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Map f6618l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, v vVar, String str, g gVar, Map map) {
            super(1);
            this.f6614h = context;
            this.f6615i = vVar;
            this.f6616j = str;
            this.f6617k = gVar;
            this.f6618l = map;
        }

        /* renamed from: a */
        public final m.a.c.h.a o(kotlin.e0.c.a<x> aVar) {
            k.e(aVar, "dependencyReload");
            return a.a.a(aVar, this.f6614h, this.f6615i, this.f6616j, this.f6617k, this.f6618l);
        }
    }

    public static final void a() {
        b.b.a();
    }

    public static final void b(kotlin.e0.c.a<x> aVar, List<m.a.c.h.a> list, kotlin.e0.c.l<? super kotlin.e0.c.a<x>, m.a.c.h.a> lVar) {
        k.e(aVar, "dependencyReload");
        k.e(list, "firstModules");
        k.e(lVar, "factory");
        b.b.c(m.a.d.a.a(new a(list, lVar, aVar)));
    }

    public static final kotlin.e0.c.l<kotlin.e0.c.a<x>, m.a.c.h.a> c(Context context, v vVar, String str, g gVar, Map<p, ? extends g.a.a.h.b<? extends Object>> map) {
        k.e(context, "context");
        k.e(vVar, "baseHttpUrl");
        k.e(str, "oauthId");
        k.e(gVar, "certificatePinner");
        k.e(map, "apolloTypeAdapters");
        return new b(context, vVar, str, gVar, map);
    }
}
