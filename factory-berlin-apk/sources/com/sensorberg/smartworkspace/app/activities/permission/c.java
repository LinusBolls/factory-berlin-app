package com.sensorberg.smartworkspace.app.activities.permission;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import com.sensorberg.smartworkspace.app.App;
import com.sensorberg.smartworkspace.app.activities.permission.b;
import g.e.l.e;
import g.e.n.g.y;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: PermissionViewModel.kt */
public final class c extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final c0<b> f7024i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<b> f7025j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<String> f7026k = h0.a("android.permission.ACCESS_BACKGROUND_LOCATION");

    /* compiled from: PermissionViewModel.kt */
    static final class a<T> implements f0<y.a> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7027g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f7028h;

        a(c cVar, LiveData liveData) {
            this.f7027g = cVar;
            this.f7028h = liveData;
        }

        /* renamed from: a */
        public final void k(y.a aVar) {
            this.f7027g.u((e) this.f7028h.l());
        }
    }

    /* compiled from: PermissionViewModel.kt */
    static final class b<T> implements f0<e> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7029g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f7030h;

        b(c cVar, LiveData liveData) {
            this.f7029g = cVar;
            this.f7030h = liveData;
        }

        /* renamed from: a */
        public final void k(e eVar) {
            this.f7029g.u((e) this.f7030h.l());
        }
    }

    public c(y yVar, LiveData<e> liveData) {
        k.e(yVar, "userManager");
        k.e(liveData, "permissionsLiveData");
        c0<b> c0Var = new c0<>();
        this.f7024i = c0Var;
        this.f7025j = c0Var;
        this.f7024i.v(yVar.getStatusLiveData(), new a(this, liveData));
        this.f7024i.v(liveData, new b(this, liveData));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean s(g.e.l.e r7, java.util.Set<java.lang.String> r8) {
        /*
            r6 = this;
            g.e.l.d r0 = g.e.l.d.SHOW_RATIONALE
            java.util.Set r0 = r7.c(r0)
            java.lang.String r1 = "filter(PermissionResult.SHOW_RATIONALE)"
            kotlin.jvm.internal.k.d(r0, r1)
            int r1 = r0.size()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0013:
            r2 = 0
            goto L_0x009d
        L_0x0016:
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0022
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x003e
        L_0x0022:
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            g.e.l.a r1 = (g.e.l.a) r1
            java.lang.String r1 = r1.a()
            boolean r1 = r8.contains(r1)
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0026
            r0 = 1
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            goto L_0x0013
        L_0x0041:
            java.util.Set r7 = r7.d()
            java.lang.String r0 = "permissionSet"
            kotlin.jvm.internal.k.d(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0053:
            boolean r1 = r7.hasNext()
            java.lang.String r4 = "it"
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r7.next()
            r5 = r1
            g.e.l.a r5 = (g.e.l.a) r5
            kotlin.jvm.internal.k.d(r5, r4)
            java.lang.String r4 = r5.a()
            boolean r4 = r8.contains(r4)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0053
            r0.add(r1)
            goto L_0x0053
        L_0x0074:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x007b
            goto L_0x009d
        L_0x007b:
            java.util.Iterator r7 = r0.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009d
            java.lang.Object r8 = r7.next()
            g.e.l.a r8 = (g.e.l.a) r8
            kotlin.jvm.internal.k.d(r8, r4)
            g.e.l.d r8 = r8.b()
            g.e.l.d r0 = g.e.l.d.GRANTED
            if (r8 != r0) goto L_0x0098
            r8 = 1
            goto L_0x0099
        L_0x0098:
            r8 = 0
        L_0x0099:
            if (r8 != 0) goto L_0x007f
            goto L_0x0013
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.activities.permission.c.s(g.e.l.e, java.util.Set):boolean");
    }

    /* access modifiers changed from: private */
    public final void u(e eVar) {
        Object obj;
        if (eVar != null) {
            if (eVar.b()) {
                obj = b.C0427b.a;
            } else if (eVar.a()) {
                obj = b.a.a;
            } else if (eVar.f()) {
                obj = b.c.a;
            } else if (s(eVar, this.f7026k)) {
                Set<g.e.l.a> d2 = eVar.d();
                k.d(d2, "permissions.permissionSet");
                ArrayList arrayList = new ArrayList();
                for (T next : d2) {
                    g.e.l.a aVar = (g.e.l.a) next;
                    Set<String> set = this.f7026k;
                    k.d(aVar, "it");
                    if (set.contains(aVar.a())) {
                        arrayList.add(next);
                    }
                }
                obj = new b.d(v.V(arrayList));
            } else if (eVar.g()) {
                obj = b.f.a;
            } else {
                throw new IllegalStateException("unknown permission state");
            }
            n.a.a.a("PermissionState: " + obj, new Object[0]);
            n.a.a.a(String.valueOf(eVar), new Object[0]);
            this.f7024i.u(obj);
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        App.f6872k.a(this);
    }

    public final LiveData<b> t() {
        return this.f7025j;
    }

    public final void v() {
        this.f7024i.u(b.c.a);
    }

    public final void w() {
        this.f7024i.u(b.e.a);
    }
}
