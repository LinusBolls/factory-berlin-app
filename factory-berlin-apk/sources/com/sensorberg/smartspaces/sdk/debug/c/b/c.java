package com.sensorberg.smartspaces.sdk.debug.c.b;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import g.e.n.g.g;
import g.e.n.g.h;
import g.e.n.g.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: IotDevicesViewModel.kt */
public final class c extends n0 implements d {

    /* renamed from: i  reason: collision with root package name */
    private final com.sensorberg.smartspaces.sdk.debug.b f6217i = new com.sensorberg.smartspaces.sdk.debug.b();

    /* renamed from: j  reason: collision with root package name */
    private final e f6218j = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final c0<String> f6219k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<String> f6220l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final c0<List<C0367c>> f6221m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<List<C0367c>> f6222n;
    /* access modifiers changed from: private */
    public final e0<String> o;

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6223h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6224i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6225j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6223h = aVar;
            this.f6224i = aVar2;
            this.f6225j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.g.g, java.lang.Object] */
        public final g d() {
            return this.f6223h.e(v.b(g.class), this.f6224i, this.f6225j);
        }
    }

    @f(c = "com.sensorberg.smartspaces.sdk.debug.screens.iotdevices.IotDevicesViewModel$1", f = "IotDevicesViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: IotDevicesViewModel.kt */
    static final class b extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f6226k;

        /* renamed from: l  reason: collision with root package name */
        int f6227l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f6228m;

        /* compiled from: IotDevicesViewModel.kt */
        static final class a<T> implements f0<String> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ b f6229g;

            a(b bVar) {
                this.f6229g = bVar;
            }

            /* renamed from: a */
            public final void k(String str) {
                this.f6229g.f6228m.f6219k.u(str);
            }
        }

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.c$b$b  reason: collision with other inner class name */
        /* compiled from: IotDevicesViewModel.kt */
        static final class C0365b<T> implements f0<List<? extends C0367c>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ b f6230g;

            C0365b(b bVar) {
                this.f6230g = bVar;
            }

            /* renamed from: a */
            public final void k(List<? extends C0367c> list) {
                this.f6230g.f6228m.f6221m.u(list);
            }
        }

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.c$b$c  reason: collision with other inner class name */
        /* compiled from: SafeCollector.common.kt */
        public static final class C0366c implements kotlinx.coroutines.e3.c<List<? extends IotDevice>> {
            final /* synthetic */ kotlinx.coroutines.e3.c a;

            /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.c$b$c$a */
            /* compiled from: Collect.kt */
            public static final class a implements kotlinx.coroutines.e3.d<g.e.m.c<? extends List<? extends IotDevice>>> {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.e3.d f6231g;

                public a(kotlinx.coroutines.e3.d dVar, C0366c cVar) {
                    this.f6231g = dVar;
                }

                public Object a(Object obj, kotlin.c0.d dVar) {
                    kotlinx.coroutines.e3.d dVar2 = this.f6231g;
                    Object a = ((g.e.m.c) obj).a();
                    if (a == null) {
                        return a == d.c() ? a : x.a;
                    }
                    Object a2 = dVar2.a(a, dVar);
                    return a2 == d.c() ? a2 : x.a;
                }
            }

            public C0366c(kotlinx.coroutines.e3.c cVar) {
                this.a = cVar;
            }

            public Object a(kotlinx.coroutines.e3.d dVar, kotlin.c0.d dVar2) {
                Object a2 = this.a.a(new a(dVar, this), dVar2);
                if (a2 == d.c()) {
                    return a2;
                }
                return x.a;
            }
        }

        @f(c = "com.sensorberg.smartspaces.sdk.debug.screens.iotdevices.IotDevicesViewModel$1$titleFlow$1", f = "IotDevicesViewModel.kt", l = {}, m = "invokeSuspend")
        /* compiled from: IotDevicesViewModel.kt */
        static final class d extends k implements q<List<? extends IotDevice>, g.b, kotlin.c0.d<? super String>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private List f6232k;

            /* renamed from: l  reason: collision with root package name */
            private g.b f6233l;

            /* renamed from: m  reason: collision with root package name */
            int f6234m;

            d(kotlin.c0.d dVar) {
                super(3, dVar);
            }

            public final Object i(Object obj) {
                Object unused = d.c();
                if (this.f6234m == 0) {
                    kotlin.l.b(obj);
                    List list = this.f6232k;
                    g.b bVar = this.f6233l;
                    return bVar + " - " + list.size() + " devices";
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object k(Object obj, Object obj2, Object obj3) {
                return ((d) s((List) obj, (g.b) obj2, (kotlin.c0.d) obj3)).i(x.a);
            }

            public final kotlin.c0.d<x> s(List<IotDevice> list, g.b bVar, kotlin.c0.d<? super String> dVar) {
                kotlin.jvm.internal.k.e(list, "iotDevices");
                kotlin.jvm.internal.k.e(bVar, "status");
                kotlin.jvm.internal.k.e(dVar, "continuation");
                d dVar2 = new d(dVar);
                dVar2.f6232k = list;
                dVar2.f6233l = bVar;
                return dVar2;
            }
        }

        @f(c = "com.sensorberg.smartspaces.sdk.debug.screens.iotdevices.IotDevicesViewModel$1$widgetListFlow$1", f = "IotDevicesViewModel.kt", l = {}, m = "invokeSuspend")
        /* compiled from: IotDevicesViewModel.kt */
        static final class e extends k implements q<List<? extends IotDevice>, String, kotlin.c0.d<? super List<? extends C0367c>>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private List f6235k;

            /* renamed from: l  reason: collision with root package name */
            private String f6236l;

            /* renamed from: m  reason: collision with root package name */
            int f6237m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ b f6238n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(b bVar, kotlin.c0.d dVar) {
                super(3, dVar);
                this.f6238n = bVar;
            }

            public final Object i(Object obj) {
                Object unused = d.c();
                if (this.f6237m == 0) {
                    kotlin.l.b(obj);
                    return this.f6238n.f6228m.B(this.f6235k, this.f6236l);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object k(Object obj, Object obj2, Object obj3) {
                return ((e) s((List) obj, (String) obj2, (kotlin.c0.d) obj3)).i(x.a);
            }

            public final kotlin.c0.d<x> s(List<IotDevice> list, String str, kotlin.c0.d<? super List<? extends C0367c>> dVar) {
                kotlin.jvm.internal.k.e(list, "deviceList");
                kotlin.jvm.internal.k.e(dVar, "continuation");
                e eVar = new e(this.f6238n, dVar);
                eVar.f6235k = list;
                eVar.f6236l = str;
                return eVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f6228m = cVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.f6228m, dVar);
            bVar.f6226k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f6227l == 0) {
                kotlin.l.b(obj);
                C0366c cVar = new C0366c(g.a.a(this.f6228m.x(), t.None, (h) null, (g.e.n.g.k) null, 0, 14, (Object) null));
                this.f6228m.f6219k.v(androidx.lifecycle.k.c(kotlinx.coroutines.e3.e.j(cVar, this.f6228m.x().a(), new d((kotlin.c0.d) null)), (kotlin.c0.g) null, 0, 3, (Object) null), new a(this));
                this.f6228m.f6221m.v(androidx.lifecycle.k.c(kotlinx.coroutines.e3.e.j(cVar, androidx.lifecycle.k.a(this.f6228m.o), new e(this, (kotlin.c0.d) null)), (kotlin.c0.g) null, 0, 3, (Object) null), new C0365b(this));
                return x.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.c$c  reason: collision with other inner class name */
    /* compiled from: IotDevicesViewModel.kt */
    public static abstract class C0367c {
        private final long a;

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.c$c$a */
        /* compiled from: IotDevicesViewModel.kt */
        public static final class a extends C0367c {
            private final long b;
            private final String c;

            /* renamed from: d  reason: collision with root package name */
            private final String f6239d;

            /* renamed from: e  reason: collision with root package name */
            private final String f6240e;

            /* renamed from: f  reason: collision with root package name */
            private final String f6241f;

            /* renamed from: g  reason: collision with root package name */
            private final String f6242g;

            /* renamed from: h  reason: collision with root package name */
            private final String f6243h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(long j2, String str, String str2, String str3, String str4, String str5, String str6) {
                super(j2, (DefaultConstructorMarker) null);
                kotlin.jvm.internal.k.e(str, "name");
                kotlin.jvm.internal.k.e(str2, "typeName");
                kotlin.jvm.internal.k.e(str3, "typeExternalIdentifier");
                kotlin.jvm.internal.k.e(str4, "containedUnit");
                kotlin.jvm.internal.k.e(str5, "properties");
                kotlin.jvm.internal.k.e(str6, "iotDeviceId");
                this.b = j2;
                this.c = str;
                this.f6239d = str2;
                this.f6240e = str3;
                this.f6241f = str4;
                this.f6242g = str5;
                this.f6243h = str6;
            }

            public long a() {
                return this.b;
            }

            public final String b() {
                return this.f6241f;
            }

            public final String c() {
                return this.f6243h;
            }

            public final String d() {
                return this.c;
            }

            public final String e() {
                return this.f6242g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return a() == aVar.a() && kotlin.jvm.internal.k.a(this.c, aVar.c) && kotlin.jvm.internal.k.a(this.f6239d, aVar.f6239d) && kotlin.jvm.internal.k.a(this.f6240e, aVar.f6240e) && kotlin.jvm.internal.k.a(this.f6241f, aVar.f6241f) && kotlin.jvm.internal.k.a(this.f6242g, aVar.f6242g) && kotlin.jvm.internal.k.a(this.f6243h, aVar.f6243h);
            }

            public final String f() {
                return this.f6240e;
            }

            public final String g() {
                return this.f6239d;
            }

            public int hashCode() {
                long a = a();
                int i2 = ((int) (a ^ (a >>> 32))) * 31;
                String str = this.c;
                int i3 = 0;
                int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f6239d;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f6240e;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.f6241f;
                int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String str5 = this.f6242g;
                int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
                String str6 = this.f6243h;
                if (str6 != null) {
                    i3 = str6.hashCode();
                }
                return hashCode5 + i3;
            }

            public String toString() {
                return "Device(id=" + a() + ", name=" + this.c + ", typeName=" + this.f6239d + ", typeExternalIdentifier=" + this.f6240e + ", containedUnit=" + this.f6241f + ", properties=" + this.f6242g + ", iotDeviceId=" + this.f6243h + ")";
            }
        }

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.c$c$b */
        /* compiled from: IotDevicesViewModel.kt */
        public static final class b extends C0367c {
            private final long b;
            private final String c;

            /* renamed from: d  reason: collision with root package name */
            private final String f6244d;

            /* renamed from: e  reason: collision with root package name */
            private final String f6245e;

            /* renamed from: f  reason: collision with root package name */
            private final IotDevice f6246f;

            /* renamed from: g  reason: collision with root package name */
            private final Property f6247g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(long j2, String str, String str2, String str3, IotDevice iotDevice, Property property) {
                super(j2, (DefaultConstructorMarker) null);
                kotlin.jvm.internal.k.e(str, "name");
                kotlin.jvm.internal.k.e(str2, "readWrite");
                kotlin.jvm.internal.k.e(str3, "value");
                kotlin.jvm.internal.k.e(iotDevice, "iotDevice");
                kotlin.jvm.internal.k.e(property, "property");
                this.b = j2;
                this.c = str;
                this.f6244d = str2;
                this.f6245e = str3;
                this.f6246f = iotDevice;
                this.f6247g = property;
            }

            public long a() {
                return this.b;
            }

            public final IotDevice b() {
                return this.f6246f;
            }

            public final String c() {
                return this.c;
            }

            public final Property d() {
                return this.f6247g;
            }

            public final String e() {
                return this.f6244d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return a() == bVar.a() && kotlin.jvm.internal.k.a(this.c, bVar.c) && kotlin.jvm.internal.k.a(this.f6244d, bVar.f6244d) && kotlin.jvm.internal.k.a(this.f6245e, bVar.f6245e) && kotlin.jvm.internal.k.a(this.f6246f, bVar.f6246f) && kotlin.jvm.internal.k.a(this.f6247g, bVar.f6247g);
            }

            public final String f() {
                return this.f6245e;
            }

            public int hashCode() {
                long a = a();
                int i2 = ((int) (a ^ (a >>> 32))) * 31;
                String str = this.c;
                int i3 = 0;
                int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.f6244d;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f6245e;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                IotDevice iotDevice = this.f6246f;
                int hashCode4 = (hashCode3 + (iotDevice != null ? iotDevice.hashCode() : 0)) * 31;
                Property property = this.f6247g;
                if (property != null) {
                    i3 = property.hashCode();
                }
                return hashCode4 + i3;
            }

            public String toString() {
                return "DeviceDetail(id=" + a() + ", name=" + this.c + ", readWrite=" + this.f6244d + ", value=" + this.f6245e + ", iotDevice=" + this.f6246f + ", property=" + this.f6247g + ")";
            }
        }

        private C0367c(long j2) {
            this.a = j2;
        }

        public long a() {
            return this.a;
        }

        public /* synthetic */ C0367c(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }
    }

    public c() {
        c0<String> c0Var = new c0<>();
        this.f6219k = c0Var;
        this.f6220l = c0Var;
        c0<List<C0367c>> c0Var2 = new c0<>();
        this.f6221m = c0Var2;
        this.f6222n = c0Var2;
        this.o = new e0<>("");
        x1 unused = e.b(o0.a(this), (kotlin.c0.g) null, (l0) null, new b(this, (kotlin.c0.d) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final List<C0367c> B(List<IotDevice> list, String str) {
        C0367c.b bVar;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (IotDevice iotDevice : list) {
                boolean a2 = kotlin.jvm.internal.k.a(iotDevice.getId(), str);
                arrayList.add(new C0367c.a(this.f6217i.a(iotDevice.getId()), "Name: " + iotDevice.getName(), "Device type name: " + iotDevice.getDeviceType().getName(), "Device type external-id: " + iotDevice.getDeviceType().getExternalIdentifier(), "Contained unit: " + iotDevice.getContainedUnit().getName(), "Properties: " + iotDevice.getProperties().size(), iotDevice.getId()));
                if (a2) {
                    for (Property property : iotDevice.getProperties()) {
                        if (property instanceof Property.Binary) {
                            long a3 = this.f6217i.a(iotDevice.getId() + '-' + property.getKind());
                            StringBuilder sb = new StringBuilder();
                            sb.append("Kind: ");
                            sb.append(property.getKind());
                            bVar = new C0367c.b(a3, sb.toString(), z(property), "Bit value: " + ((Property.Binary) property).getValue(), iotDevice, property);
                        } else if (property instanceof Property.Numeric) {
                            long a4 = this.f6217i.a(iotDevice.getId() + '-' + property.getKind());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Kind: ");
                            sb2.append(property.getKind());
                            String sb3 = sb2.toString();
                            String z = z(property);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Value: ");
                            Property.Numeric numeric = (Property.Numeric) property;
                            sb4.append(numeric.getValue());
                            sb4.append(" (");
                            sb4.append(numeric.getMinValue());
                            sb4.append('/');
                            sb4.append(numeric.getMaxValue());
                            sb4.append(')');
                            bVar = new C0367c.b(a4, sb3, z, sb4.toString(), iotDevice, property);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList.add(bVar);
                    }
                    continue;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final g x() {
        return (g) this.f6218j.getValue();
    }

    private final String z(Property property) {
        if (!property.getReadable() || !property.getWritable()) {
            return property.getReadable() ? "Access: read-only" : "Access: write-only";
        }
        return "Access: read / write";
    }

    public final void A(String str) {
        kotlin.jvm.internal.k.e(str, "id");
        if (kotlin.jvm.internal.k.a(this.o.l(), str)) {
            this.o.u("");
        } else {
            this.o.u(str);
        }
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }

    public final LiveData<List<C0367c>> w() {
        return this.f6222n;
    }

    public final LiveData<String> y() {
        return this.f6220l;
    }
}
