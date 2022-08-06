package g.e.n.d.z;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.synchronousgatt.b;
import g.e.m.c;
import g.e.n.c.d.o.f;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;

/* compiled from: PostBoxGattInteractorImpl.kt */
public final class a implements g.e.n.c.g.f.d {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f10162d;
    /* access modifiers changed from: private */
    public final Context a;
    private final b b;
    private final d0 c;

    /* renamed from: g.e.n.d.z.a$a  reason: collision with other inner class name */
    /* compiled from: PostBoxGattInteractorImpl.kt */
    public static final class C0718a {
        private C0718a() {
        }

        public /* synthetic */ C0718a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.sensorberg.smartspaces.myrenz.gatt.PostBoxGattInteractorImpl$connect$2", f = "PostBoxGattInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* compiled from: PostBoxGattInteractorImpl.kt */
    static final class b extends k implements p<i0, kotlin.c0.d<? super g.e.m.c<? extends x>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10163k;

        /* renamed from: l  reason: collision with root package name */
        int f10164l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f10165m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f10166n;
        final /* synthetic */ BluetoothDevice o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.sensorberg.synchronousgatt.c cVar, BluetoothDevice bluetoothDevice, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f10165m = aVar;
            this.f10166n = cVar;
            this.o = bluetoothDevice;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.f10165m, this.f10166n, this.o, dVar);
            bVar.f10163k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f10164l == 0) {
                l.b(obj);
                try {
                    b.d f2 = this.f10166n.f(this.f10165m.a, false, 2, 9000);
                    if (f2.c() == 2) {
                        if (f2.d() == 0) {
                            n.a.a.a("connected", new Object[0]);
                            return new c.b(x.a);
                        }
                    }
                    return this.f10165m.g("Could not connect to device: " + this.o.getAddress() + ", status:" + f2.d());
                } catch (Exception e2) {
                    return new c.a((Throwable) e2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.smartspaces.myrenz.gatt.PostBoxGattInteractorImpl$discoverServices$2", f = "PostBoxGattInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* compiled from: PostBoxGattInteractorImpl.kt */
    static final class c extends k implements p<i0, kotlin.c0.d<? super g.e.m.c<? extends List<? extends BluetoothGattService>>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10167k;

        /* renamed from: l  reason: collision with root package name */
        int f10168l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f10169m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f10170n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, com.sensorberg.synchronousgatt.c cVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f10169m = aVar;
            this.f10170n = cVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            c cVar = new c(this.f10169m, this.f10170n, dVar);
            cVar.f10167k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f10168l == 0) {
                l.b(obj);
                try {
                    b.j j2 = this.f10170n.j(7000);
                    if (j2.d() != 0) {
                        return this.f10169m.g("Failed to discover services. Status:" + j2.d());
                    }
                    n.a.a.a("services discovered", new Object[0]);
                    return new c.b(j2.c());
                } catch (Exception e2) {
                    return new c.a((Throwable) e2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.smartspaces.myrenz.gatt.PostBoxGattInteractorImpl$getCharacteristic$2", f = "PostBoxGattInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* compiled from: PostBoxGattInteractorImpl.kt */
    static final class d extends k implements p<i0, kotlin.c0.d<? super g.e.m.c<? extends BluetoothGattCharacteristic>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10171k;

        /* renamed from: l  reason: collision with root package name */
        int f10172l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f10173m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ BluetoothGattService f10174n;
        final /* synthetic */ com.sensorberg.synchronousgatt.c o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, BluetoothGattService bluetoothGattService, com.sensorberg.synchronousgatt.c cVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f10173m = aVar;
            this.f10174n = bluetoothGattService;
            this.o = cVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            d dVar2 = new d(this.f10173m, this.f10174n, this.o, dVar);
            dVar2.f10171k = (i0) obj;
            return dVar2;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f10172l == 0) {
                l.b(obj);
                try {
                    BluetoothGattCharacteristic characteristic = this.f10174n.getCharacteristic(a.f10162d);
                    kotlin.jvm.internal.k.d(characteristic, "bluetoothGattService.get…A_ID_CHARACTERISTIC_UUID)");
                    b.C0542b n2 = this.o.n(characteristic, 5000);
                    if (n2.d() != 0) {
                        return this.f10173m.g("Failed to read characteristic. Status(" + n2.d() + ')');
                    }
                    n.a.a.a("got characteristic for UUID: " + a.f10162d, new Object[0]);
                    return new c.b(n2.c());
                } catch (Exception e2) {
                    return new c.a((Throwable) e2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final Object l(Object obj, Object obj2) {
            return ((d) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.smartspaces.myrenz.gatt.PostBoxGattInteractorImpl", f = "PostBoxGattInteractorImpl.kt", l = {26, 29, 35}, m = "readPkaId")
    /* compiled from: PostBoxGattInteractorImpl.kt */
    static final class e extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10175j;

        /* renamed from: k  reason: collision with root package name */
        int f10176k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f10177l;

        /* renamed from: m  reason: collision with root package name */
        Object f10178m;

        /* renamed from: n  reason: collision with root package name */
        Object f10179n;
        Object o;
        Object p;
        Object q;
        Object r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f10177l = aVar;
        }

        public final Object i(Object obj) {
            this.f10175j = obj;
            this.f10176k |= RecyclerView.UNDEFINED_DURATION;
            return this.f10177l.a((BluetoothDevice) null, this);
        }
    }

    static {
        new C0718a((DefaultConstructorMarker) null);
        UUID fromString = UUID.fromString("B2F03829-9135-11E6-AE22-56B6B6499611");
        kotlin.jvm.internal.k.d(fromString, "UUID.fromString(\"B2F0382…-11E6-AE22-56B6B6499611\")");
        f10162d = fromString;
    }

    public a(Context context, b bVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(bVar, "synchronousGattFactory");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.a = context;
        this.b = bVar;
        this.c = d0Var;
    }

    /* access modifiers changed from: private */
    public final c.a g(String str) {
        n.a.a.a(str, new Object[0]);
        return new c.a((Throwable) new Exception(str));
    }

    private final g.e.m.c<BluetoothGattService> h(List<? extends BluetoothGattService> list) {
        T t;
        UUID a2 = f.c.b.a();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (kotlin.jvm.internal.k.a(((BluetoothGattService) t).getUuid(), a2)) {
                break;
            }
        }
        BluetoothGattService bluetoothGattService = (BluetoothGattService) t;
        if (bluetoothGattService == null) {
            return g("Failed to get service with id: " + a2);
        }
        n.a.a.a("got service for UUID: " + a2, new Object[0]);
        return new c.b(bluetoothGattService);
    }

    private final g.e.m.c<String> j(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        kotlin.jvm.internal.k.d(value, "bluetoothGattCharacteristic.value");
        if (value.length == 0) {
            return g("No data available inside characteristic");
        }
        if (value.length < 12) {
            return g("Invalid PkaId length. Expected 12 but was " + value.length);
        }
        String n2 = p.n(value, 0, 12, false, 4, (Object) null);
        n.a.a.a("pkaId=" + n2, new Object[0]);
        return new c.b(n2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(android.bluetooth.BluetoothDevice r10, kotlin.c0.d<? super g.e.m.c<java.lang.String>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof g.e.n.d.z.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r11
            g.e.n.d.z.a$e r0 = (g.e.n.d.z.a.e) r0
            int r1 = r0.f10176k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10176k = r1
            goto L_0x0018
        L_0x0013:
            g.e.n.d.z.a$e r0 = new g.e.n.d.z.a$e
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f10175j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10176k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0079
            if (r2 == r5) goto L_0x0069
            if (r2 == r4) goto L_0x0050
            if (r2 != r3) goto L_0x0048
            java.lang.Object r10 = r0.r
            g.e.m.c r10 = (g.e.m.c) r10
            java.lang.Object r10 = r0.q
            g.e.m.c r10 = (g.e.m.c) r10
            java.lang.Object r10 = r0.p
            g.e.m.c r10 = (g.e.m.c) r10
            java.lang.Object r10 = r0.o
            com.sensorberg.synchronousgatt.c r10 = (com.sensorberg.synchronousgatt.c) r10
            java.lang.Object r1 = r0.f10179n
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            java.lang.Object r0 = r0.f10178m
            g.e.n.d.z.a r0 = (g.e.n.d.z.a) r0
            kotlin.l.b(r11)
            goto L_0x00fd
        L_0x0048:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0050:
            java.lang.Object r10 = r0.p
            g.e.m.c r10 = (g.e.m.c) r10
            java.lang.Object r2 = r0.o
            com.sensorberg.synchronousgatt.c r2 = (com.sensorberg.synchronousgatt.c) r2
            java.lang.Object r4 = r0.f10179n
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            java.lang.Object r5 = r0.f10178m
            g.e.n.d.z.a r5 = (g.e.n.d.z.a) r5
            kotlin.l.b(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r4
            r4 = r8
            goto L_0x00c5
        L_0x0069:
            java.lang.Object r10 = r0.o
            com.sensorberg.synchronousgatt.c r10 = (com.sensorberg.synchronousgatt.c) r10
            java.lang.Object r2 = r0.f10179n
            android.bluetooth.BluetoothDevice r2 = (android.bluetooth.BluetoothDevice) r2
            java.lang.Object r5 = r0.f10178m
            g.e.n.d.z.a r5 = (g.e.n.d.z.a) r5
            kotlin.l.b(r11)
            goto L_0x00ad
        L_0x0079:
            kotlin.l.b(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "readPkaId for "
            r11.append(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            n.a.a.a(r11, r2)
            g.e.n.d.z.b r11 = r9.b
            com.sensorberg.synchronousgatt.c r11 = r11.a(r10)
            r0.f10178m = r9
            r0.f10179n = r10
            r0.o = r11
            r0.f10176k = r5
            java.lang.Object r2 = r9.e(r11, r10, r0)
            if (r2 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            r5 = r9
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L_0x00ad:
            g.e.m.c r11 = (g.e.m.c) r11
            boolean r6 = r11 instanceof g.e.m.c.a
            if (r6 == 0) goto L_0x00b4
            return r11
        L_0x00b4:
            r0.f10178m = r5
            r0.f10179n = r2
            r0.o = r10
            r0.p = r11
            r0.f10176k = r4
            java.lang.Object r4 = r5.f(r10, r0)
            if (r4 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            g.e.m.c r4 = (g.e.m.c) r4
            boolean r6 = r4 instanceof g.e.m.c.a
            if (r6 == 0) goto L_0x00cc
            return r4
        L_0x00cc:
            java.lang.Object r6 = r4.a()
            kotlin.jvm.internal.k.c(r6)
            java.util.List r6 = (java.util.List) r6
            g.e.m.c r6 = r5.h(r6)
            boolean r7 = r6 instanceof g.e.m.c.a
            if (r7 == 0) goto L_0x00de
            return r6
        L_0x00de:
            java.lang.Object r7 = r6.a()
            kotlin.jvm.internal.k.c(r7)
            android.bluetooth.BluetoothGattService r7 = (android.bluetooth.BluetoothGattService) r7
            r0.f10178m = r5
            r0.f10179n = r2
            r0.o = r10
            r0.p = r11
            r0.q = r4
            r0.r = r6
            r0.f10176k = r3
            java.lang.Object r11 = r5.i(r10, r7, r0)
            if (r11 != r1) goto L_0x00fc
            return r1
        L_0x00fc:
            r0 = r5
        L_0x00fd:
            g.e.m.c r11 = (g.e.m.c) r11
            boolean r1 = r11 instanceof g.e.m.c.a
            if (r1 == 0) goto L_0x0104
            return r11
        L_0x0104:
            java.lang.Object r11 = r11.a()
            kotlin.jvm.internal.k.c(r11)
            android.bluetooth.BluetoothGattCharacteristic r11 = (android.bluetooth.BluetoothGattCharacteristic) r11
            g.e.m.c r11 = r0.j(r11)
            r0 = 2000(0x7d0, double:9.88E-321)
            r10.i(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.n.d.z.a.a(android.bluetooth.BluetoothDevice, kotlin.c0.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e(com.sensorberg.synchronousgatt.c cVar, BluetoothDevice bluetoothDevice, kotlin.c0.d<? super g.e.m.c<x>> dVar) {
        return kotlinx.coroutines.d.c(this.c, new b(this, cVar, bluetoothDevice, (kotlin.c0.d) null), dVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object f(com.sensorberg.synchronousgatt.c cVar, kotlin.c0.d<? super g.e.m.c<? extends List<? extends BluetoothGattService>>> dVar) {
        return kotlinx.coroutines.d.c(this.c, new c(this, cVar, (kotlin.c0.d) null), dVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object i(com.sensorberg.synchronousgatt.c cVar, BluetoothGattService bluetoothGattService, kotlin.c0.d<? super g.e.m.c<? extends BluetoothGattCharacteristic>> dVar) {
        return kotlinx.coroutines.d.c(this.c, new d(this, bluetoothGattService, cVar, (kotlin.c0.d) null), dVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, b bVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bVar, (i2 & 4) != 0 ? a1.b() : d0Var);
    }
}
