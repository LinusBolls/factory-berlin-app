package com.sensorberg.smartspaces.sdk.internal.u;

import com.sensorberg.smartspaces.backend.j.a;
import com.sensorberg.smartspaces.sdk.internal.u.a;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.IotDeviceType;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartspaces.sdk.model.Proximity;
import com.sensorberg.smartspaces.sdk.model.SmartspaceUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.e3.d;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: IotDeviceMapper.kt */
public final class e {
    public static final e a = new e();

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements c<g.e.m.c<? extends List<? extends IotDevice>>> {
        final /* synthetic */ c a;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.u.e$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0399a implements d<g.e.m.c<? extends a.i>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f6643g;

            public C0399a(d dVar, a aVar) {
                this.f6643g = dVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                Object a = this.f6643g.a(((g.e.m.c) obj).b(b.f6644h), dVar);
                return a == d.c() ? a : x.a;
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0399a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    /* compiled from: IotDeviceMapper.kt */
    static final class b extends l implements kotlin.e0.c.l<a.i, List<? extends IotDevice>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f6644h = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final List<IotDevice> o(a.i iVar) {
            k.e(iVar, "it");
            return e.a.g(iVar);
        }
    }

    private e() {
    }

    public final boolean a(long j2, long j3) {
        long c = g.e.h.b.c.b.c();
        return j2 <= c && j3 >= c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.util.List<com.sensorberg.smartspaces.backend.j.a.b> r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x0034
            boolean r2 = r9 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0010
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x0010
        L_0x000e:
            r9 = 0
            goto L_0x0031
        L_0x0010:
            java.util.Iterator r9 = r9.iterator()
        L_0x0014:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x000e
            java.lang.Object r2 = r9.next()
            com.sensorberg.smartspaces.backend.j.a$b r2 = (com.sensorberg.smartspaces.backend.j.a.b) r2
            com.sensorberg.smartspaces.sdk.internal.u.e r3 = a
            long r4 = r2.c()
            long r6 = r2.b()
            boolean r2 = r3.a(r4, r6)
            if (r2 == 0) goto L_0x0014
            r9 = 1
        L_0x0031:
            if (r9 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.u.e.b(java.util.List):boolean");
    }

    public final boolean c(List<a.d> list) {
        k.e(list, "$this$isPropertyAvailable");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (a.d dVar : list) {
            if (a.a(dVar.c(), dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final c<g.e.m.c<List<IotDevice>>> d(c<? extends g.e.m.c<a.i>> cVar) {
        k.e(cVar, "flow");
        return new a(cVar);
    }

    public final Property.Binary e(boolean z, a.e eVar) {
        boolean z2;
        k.e(eVar, "property");
        List<a.c> b2 = eVar.b();
        if (b2 != null) {
            if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                Iterator<T> it = b2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a.c cVar = (a.c) it.next();
                    if (a.a(cVar.c(), cVar.b())) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = z;
        }
        Boolean c = eVar.c();
        return new Property.Binary(c != null ? c.booleanValue() : false, eVar.d(), eVar.e(), eVar.f(), 0, z2);
    }

    public final IotDevice f(SmartspaceUnit smartspaceUnit, a.m mVar) {
        a.j d2;
        k.e(smartspaceUnit, "smartspaceUnit");
        IotDevice iotDevice = null;
        if (!(mVar == null || (d2 = mVar.d()) == null)) {
            List<Property> h2 = h(b(mVar.b()), mVar.f());
            if (h2.isEmpty()) {
                return null;
            }
            IotDeviceType iotDeviceType = new IotDeviceType(d2.c(), d2.d(), d2.b());
            String c = mVar.c();
            String e2 = mVar.e();
            if (e2 == null) {
                e2 = "";
            }
            iotDevice = new IotDevice(c, e2, iotDeviceType, smartspaceUnit, Proximity.Unknown, 0, h2, new a.C0396a("TODO"), (m) null);
        }
        return iotDevice;
    }

    public final List<IotDevice> g(a.i iVar) {
        List<T> list;
        Collection collection;
        List<a.m> b2;
        a.o c;
        a.C0189a b3;
        List<a.l> b4;
        if (iVar == null || (c = iVar.c()) == null || (b3 = c.b()) == null || (b4 = b3.b()) == null || (list = v.w(b4)) == null) {
            list = n.g();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String b5 = t.b();
            String d2 = t.d();
            if (d2 == null) {
                d2 = "";
            }
            SmartspaceUnit smartspaceUnit = new SmartspaceUnit(b5, d2, 0);
            a.k c2 = t.c();
            if (c2 == null || (b2 = c2.b()) == null) {
                collection = n.g();
            } else {
                collection = new ArrayList();
                for (a.m f2 : b2) {
                    IotDevice f3 = a.f(smartspaceUnit, f2);
                    if (f3 != null) {
                        collection.add(f3);
                    }
                }
            }
            arrayList.addAll(collection);
        }
        return arrayList;
    }

    public final List<Property> h(boolean z, List<a.n> list) {
        Object obj;
        if (list == null) {
            return n.g();
        }
        ArrayList arrayList = new ArrayList();
        for (a.n nVar : list) {
            a.e b2 = nVar.b();
            a.f c = nVar.c();
            if (b2 != null) {
                obj = a.e(z, b2);
            } else {
                obj = c != null ? a.i(z, c) : null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Property.Numeric i(boolean z, a.f fVar) {
        k.e(fVar, "property");
        List<a.d> b2 = fVar.b();
        if (b2 != null) {
            z = c(b2);
        }
        boolean z2 = z;
        Double g2 = fVar.g();
        float doubleValue = g2 != null ? (float) g2.doubleValue() : 0.0f;
        Double e2 = fVar.e();
        float doubleValue2 = e2 != null ? (float) e2.doubleValue() : 0.0f;
        Double d2 = fVar.d();
        return new Property.Numeric(doubleValue, doubleValue2, d2 != null ? (float) d2.doubleValue() : 100.0f, fVar.c(), fVar.f(), fVar.h(), 0, z2);
    }
}
