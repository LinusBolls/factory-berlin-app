package com.sensorberg.smartspaces.sdk.internal.o.a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.SystemClock;
import com.sensorberg.smartspaces.sdk.internal.o.a.c;
import com.sensorberg.synchronousgatt.GattException;
import com.sensorberg.synchronousgatt.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: GattTransport.kt */
public final class e extends g.e.k.e<d> {
    /* access modifiers changed from: private */
    public static final UUID J = UUID.fromString("6e400001-b5a3-f393-e0a9-e50e24dcca9e");
    /* access modifiers changed from: private */
    public static final UUID K = UUID.fromString("6e400003-b5a3-f393-e0a9-e50e24dcca9e");
    /* access modifiers changed from: private */
    public static final UUID L = UUID.fromString("6e400002-b5a3-f393-e0a9-e50e24dcca9e");
    /* access modifiers changed from: private */
    public static final UUID M = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    private static final byte[] N = {13, 20, 1, 13};
    private com.sensorberg.synchronousgatt.c A;
    private BluetoothGattService B;
    /* access modifiers changed from: private */
    public BluetoothGattCharacteristic C;
    /* access modifiers changed from: private */
    public BluetoothGattCharacteristic D;
    /* access modifiers changed from: private */
    public BluetoothGattDescriptor E;
    private final Runnable F;
    /* access modifiers changed from: private */
    public final a G;
    private final f H;
    /* access modifiers changed from: private */
    public final g I;
    private final Context q;
    private boolean r;
    /* access modifiers changed from: private */
    public int s;
    /* access modifiers changed from: private */
    public final c.C0384c.a t = new c.C0384c.a();
    /* access modifiers changed from: private */
    public final c.b u;
    /* access modifiers changed from: private */
    public long v;
    private byte[] w;
    private final long x;
    private d y;
    /* access modifiers changed from: private */
    public volatile boolean z;

    /* compiled from: GattTransport.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GattTransport.kt */
    private static final class b extends IOException {
    }

    /* compiled from: GattTransport.kt */
    static final class c extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6441h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f6442i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, com.sensorberg.synchronousgatt.c cVar) {
            super(0);
            this.f6441h = eVar;
            this.f6442i = cVar;
        }

        public final void a() {
            this.f6441h.Y(this.f6442i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: GattTransport.kt */
    static final class d extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6443h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f6444i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, com.sensorberg.synchronousgatt.c cVar) {
            super(0);
            this.f6443h = eVar;
            this.f6444i = cVar;
        }

        public final void a() {
            this.f6443h.o0(this.f6444i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.o.a.e$e  reason: collision with other inner class name */
    /* compiled from: GattTransport.kt */
    static final class C0385e extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6445h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f6446i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0385e(e eVar, com.sensorberg.synchronousgatt.c cVar) {
            super(0);
            this.f6445h = eVar;
            this.f6446i = cVar;
        }

        public final void a() {
            b.j j2 = this.f6446i.j(this.f6445h.I.c);
            this.f6445h.r0(j2.a().getService(e.J));
            e eVar = this.f6445h;
            BluetoothGattService k0 = eVar.k0();
            BluetoothGattDescriptor bluetoothGattDescriptor = null;
            eVar.C = k0 != null ? k0.getCharacteristic(e.L) : null;
            e eVar2 = this.f6445h;
            BluetoothGattService k02 = eVar2.k0();
            eVar2.D = k02 != null ? k02.getCharacteristic(e.K) : null;
            e eVar3 = this.f6445h;
            BluetoothGattCharacteristic L = eVar3.D;
            if (L != null) {
                bluetoothGattDescriptor = L.getDescriptor(e.M);
            }
            eVar3.E = bluetoothGattDescriptor;
            if (this.f6445h.n0(j2.d(), this.f6445h.C, this.f6445h.D, this.f6445h.E)) {
                throw new b();
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: GattTransport.kt */
    static final class f extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6447h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f6448i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, com.sensorberg.synchronousgatt.c cVar) {
            super(0);
            this.f6447h = eVar;
            this.f6448i = cVar;
        }

        public final void a() {
            BluetoothGattDescriptor D = this.f6447h.E;
            k.c(D);
            D.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            com.sensorberg.synchronousgatt.c cVar = this.f6448i;
            BluetoothGattCharacteristic L = this.f6447h.D;
            k.c(L);
            cVar.p(L, true);
            com.sensorberg.synchronousgatt.c cVar2 = this.f6448i;
            BluetoothGattDescriptor D2 = this.f6447h.E;
            k.c(D2);
            if (cVar2.r(D2, this.f6447h.I.f6461d).c() != 0) {
                throw new b();
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: GattTransport.kt */
    static final class g extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f6449h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f6450i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.sensorberg.synchronousgatt.c cVar, int i2) {
            super(0);
            this.f6449h = cVar;
            this.f6450i = i2;
        }

        public final void a() {
            this.f6449h.o(this.f6450i, 10000);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: GattTransport.kt */
    static final class h implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f6451g;

        h(e eVar) {
            this.f6451g = eVar;
        }

        public final void run() {
            n.a.a.f("Starting GattTransport " + this.f6451g.hashCode() + '.', new Object[0]);
            d dVar = (d) this.f6451g.n();
            if (dVar == null) {
                dVar = d.NOT_STARTED;
            }
            if (dVar != d.NOT_STARTED) {
                n.a.a.d(new IllegalStateException("GattTransport (" + this.f6451g.hashCode() + ") can only be executed once. Current " + dVar));
            }
            this.f6451g.v = SystemClock.elapsedRealtime();
            this.f6451g.t.f(SystemClock.elapsedRealtime());
            this.f6451g.u.f("Started");
            this.f6451g.w(d.ON_GOING);
            this.f6451g.e0();
            this.f6451g.t.g(this.f6451g.d0());
            this.f6451g.t.i(this.f6451g.s);
            this.f6451g.m0();
        }
    }

    /* compiled from: GattTransport.kt */
    static final class i extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6452h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.synchronousgatt.c f6453i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, com.sensorberg.synchronousgatt.c cVar) {
            super(0);
            this.f6452h = eVar;
            this.f6453i = cVar;
        }

        public final void a() {
            byte[] bArr;
            String str = this.f6452h.G.a() + 10;
            Charset charset = kotlin.j0.d.a;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                k.d(bytes, "(this as java.lang.String).getBytes(charset)");
                ByteBuffer wrap = ByteBuffer.wrap(bytes);
                k.d(wrap, "ByteBuffer.wrap(messageByteArray)");
                while (wrap.hasRemaining()) {
                    if (wrap.remaining() >= 20) {
                        bArr = this.f6452h.i0(20);
                        wrap.get(bArr);
                    } else {
                        bArr = this.f6452h.i0(wrap.remaining());
                        wrap.get(bArr);
                    }
                    BluetoothGattCharacteristic H = this.f6452h.C;
                    k.c(H);
                    H.setValue(bArr);
                    com.sensorberg.synchronousgatt.c cVar = this.f6453i;
                    BluetoothGattCharacteristic H2 = this.f6452h.C;
                    k.c(H2);
                    if (cVar.q(H2, this.f6452h.I.f6462e).c() != 0) {
                        throw new b();
                    } else if (!this.f6452h.z) {
                        this.f6452h.t0();
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public e(Context context, BluetoothDevice bluetoothDevice, a aVar, f fVar, g gVar) {
        k.e(context, "context");
        k.e(bluetoothDevice, "device");
        k.e(aVar, "callback");
        k.e(fVar, "retry");
        k.e(gVar, "timeout");
        this.G = aVar;
        this.H = fVar;
        this.I = gVar;
        Context applicationContext = context.getApplicationContext();
        k.d(applicationContext, "context.applicationContext");
        this.q = applicationContext;
        c.b bVar = new c.b();
        bVar.f("Not Started");
        this.u = bVar;
        this.x = 3;
        this.y = d.ON_GOING;
        this.A = new com.sensorberg.synchronousgatt.c(bluetoothDevice);
        w(d.NOT_STARTED);
        this.F = new h(this);
    }

    /* access modifiers changed from: private */
    public final void Y(com.sensorberg.synchronousgatt.c cVar) {
        b.d f2 = cVar.f(this.q, false, 2, this.I.b);
        if (f2.c() != 2 || f2.d() != 0) {
            n.a.a.k("Failed to connect. Status(%s), newState(%s)", Integer.valueOf(f2.d()), Integer.valueOf(f2.c()));
            throw new b();
        }
    }

    private final void Z(com.sensorberg.synchronousgatt.c cVar) {
        this.t.b(d0());
        this.u.f("Awaiting response");
        b.a d2 = cVar.d(this.I.f6463f);
        c.b bVar = this.u;
        byte[] value = d2.c().getValue();
        k.d(value, "characteristicChanged.characteristic.value");
        bVar.e(new String(value, kotlin.j0.d.a));
        this.u.c(true);
        this.r = true;
        n.a.a.f("Gatt execution success", new Object[0]);
        t0();
    }

    private final void b0(com.sensorberg.synchronousgatt.c cVar) {
        this.t.c(d0());
        h0(this.H.a, "connect", new c(this, cVar), new d(this, cVar));
        if (!this.z) {
            t0();
            return;
        }
        throw new CancellationException();
    }

    private final void c0(com.sensorberg.synchronousgatt.c cVar) {
        this.t.e(d0());
        g0(this.H.b, "discover", new C0385e(this, cVar));
        if (!this.z) {
            t0();
            return;
        }
        throw new CancellationException();
    }

    /* access modifiers changed from: private */
    public final long d0() {
        return SystemClock.elapsedRealtime() - this.v;
    }

    /* access modifiers changed from: private */
    public final void e0() {
        for (int i2 = 0; i2 <= this.H.f6457e && !this.r && !this.z && d0() < this.I.a; i2++) {
            if (i2 > 0) {
                Thread.sleep(2000);
            }
            f0(i2);
            this.t.h(i2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f0(int r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Executing attempt "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            n.a.a.a(r0, r1)
            com.sensorberg.smartspaces.sdk.internal.o.a.c$b r0 = r3.u
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Attempt number "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.f(r1)
            com.sensorberg.smartspaces.sdk.internal.o.a.c$c$a r0 = r3.t
            r0.h(r4)
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r3.b0(r4)     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r4 = 256(0x100, float:3.59E-43)
            com.sensorberg.synchronousgatt.c r0 = r3.A     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r3.q0(r4, r0)     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r3.c0(r4)     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r3.p0(r4)     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r3.u0(r4)     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r3.Z(r4)     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            r3.s0(r4)     // Catch:{ CancellationException -> 0x00b1, GattException -> 0x007d, b -> 0x0069 }
            com.sensorberg.smartspaces.sdk.internal.o.a.c$c$a r4 = r3.t     // Catch:{ Exception -> 0x0093 }
            long r0 = r3.d0()     // Catch:{ Exception -> 0x0093 }
            r4.d(r0)     // Catch:{ Exception -> 0x0093 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ Exception -> 0x0093 }
            com.sensorberg.smartspaces.sdk.internal.o.a.g r0 = r3.I     // Catch:{ Exception -> 0x0093 }
            long r0 = r0.f6464g     // Catch:{ Exception -> 0x0093 }
            goto L_0x0090
        L_0x0067:
            r4 = move-exception
            goto L_0x0099
        L_0x0069:
            r4 = move-exception
            r3.l0(r4)     // Catch:{ all -> 0x0067 }
            com.sensorberg.smartspaces.sdk.internal.o.a.c$c$a r4 = r3.t     // Catch:{ Exception -> 0x0093 }
            long r0 = r3.d0()     // Catch:{ Exception -> 0x0093 }
            r4.d(r0)     // Catch:{ Exception -> 0x0093 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ Exception -> 0x0093 }
            com.sensorberg.smartspaces.sdk.internal.o.a.g r0 = r3.I     // Catch:{ Exception -> 0x0093 }
            long r0 = r0.f6464g     // Catch:{ Exception -> 0x0093 }
            goto L_0x0090
        L_0x007d:
            r4 = move-exception
            r3.l0(r4)     // Catch:{ all -> 0x0067 }
            com.sensorberg.smartspaces.sdk.internal.o.a.c$c$a r4 = r3.t     // Catch:{ Exception -> 0x0093 }
            long r0 = r3.d0()     // Catch:{ Exception -> 0x0093 }
            r4.d(r0)     // Catch:{ Exception -> 0x0093 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ Exception -> 0x0093 }
            com.sensorberg.smartspaces.sdk.internal.o.a.g r0 = r3.I     // Catch:{ Exception -> 0x0093 }
            long r0 = r0.f6464g     // Catch:{ Exception -> 0x0093 }
        L_0x0090:
            r4.i(r0)     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            com.sensorberg.synchronousgatt.c r4 = r3.A
            r4.e()
            return
        L_0x0099:
            com.sensorberg.smartspaces.sdk.internal.o.a.c$c$a r0 = r3.t     // Catch:{ Exception -> 0x00ab }
            long r1 = r3.d0()     // Catch:{ Exception -> 0x00ab }
            r0.d(r1)     // Catch:{ Exception -> 0x00ab }
            com.sensorberg.synchronousgatt.c r0 = r3.A     // Catch:{ Exception -> 0x00ab }
            com.sensorberg.smartspaces.sdk.internal.o.a.g r1 = r3.I     // Catch:{ Exception -> 0x00ab }
            long r1 = r1.f6464g     // Catch:{ Exception -> 0x00ab }
            r0.i(r1)     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            com.sensorberg.synchronousgatt.c r0 = r3.A
            r0.e()
            throw r4
        L_0x00b1:
            com.sensorberg.smartspaces.sdk.internal.o.a.c$c$a r4 = r3.t     // Catch:{ Exception -> 0x00c3 }
            long r0 = r3.d0()     // Catch:{ Exception -> 0x00c3 }
            r4.d(r0)     // Catch:{ Exception -> 0x00c3 }
            com.sensorberg.synchronousgatt.c r4 = r3.A     // Catch:{ Exception -> 0x00c3 }
            com.sensorberg.smartspaces.sdk.internal.o.a.g r0 = r3.I     // Catch:{ Exception -> 0x00c3 }
            long r0 = r0.f6464g     // Catch:{ Exception -> 0x00c3 }
            r4.i(r0)     // Catch:{ Exception -> 0x00c3 }
        L_0x00c3:
            com.sensorberg.synchronousgatt.c r4 = r3.A
            r4.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.o.a.e.f0(int):void");
    }

    private final void g0(int i2, String str, kotlin.e0.c.a<x> aVar) {
        h0(i2, str, aVar, (kotlin.e0.c.a<x>) null);
    }

    private final void h0(int i2, String str, kotlin.e0.c.a<x> aVar, kotlin.e0.c.a<x> aVar2) {
        int i3 = 0;
        while (!this.z) {
            try {
                n.a.a.a("Gatt executing " + str + ", count " + i3, new Object[0]);
                this.u.f("Executing " + str + " : " + i3);
                aVar.d();
                return;
            } catch (Exception e2) {
                this.u.f("Error on " + str + ' ' + e2.getClass().getSimpleName());
                if (i3 >= i2) {
                    n.a.a.m(e2, "Failed to " + str + ", with " + e2 + ". Throwing exception", new Object[0]);
                    throw e2;
                } else if (!(e2 instanceof GattException.NoResult) && !(e2 instanceof GattException.UnexpectedDisconnection) && !(e2 instanceof GattException.UnexpectedResult) && !(e2 instanceof GattException.Timeout) && !(e2 instanceof b)) {
                    n.a.a.m(e2, "Unexpected exception. Failed to " + str + ", with " + e2 + ". Throwing exception", new Object[0]);
                    throw e2;
                } else {
                    if (aVar2 == null) {
                        n.a.a.m(e2, "Failed to " + str + ", retrying (" + i3 + ')', new Object[0]);
                    } else {
                        n.a.a.m(e2, "Failed to " + str + ", executing recovery and retrying (" + i3 + ')', new Object[0]);
                        aVar2.d();
                    }
                    this.s++;
                    i3++;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r0.length != r2) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] i0(int r2) {
        /*
            r1 = this;
            byte[] r0 = r1.w
            if (r0 == 0) goto L_0x000a
            kotlin.jvm.internal.k.c(r0)
            int r0 = r0.length
            if (r0 == r2) goto L_0x000e
        L_0x000a:
            byte[] r2 = new byte[r2]
            r1.w = r2
        L_0x000e:
            byte[] r2 = r1.w
            kotlin.jvm.internal.k.c(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.o.a.e.i0(int):byte[]");
    }

    private final void l0(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Gatt error";
        }
        if (exc instanceof GattException.Timeout) {
            this.y = d.END_FAIL_TIMEOUT;
            this.u.d(new com.sensorberg.smartspaces.sdk.exception.GattException(message, 20));
        } else if (exc instanceof GattException.UnexpectedDisconnection) {
            this.y = d.END_FAIL_BLUETOOTH;
            this.u.d(new com.sensorberg.smartspaces.sdk.exception.GattException(message, 21));
        } else if (exc instanceof GattException.UnexpectedResult) {
            this.y = d.END_FAIL_BLUETOOTH;
            this.u.d(new com.sensorberg.smartspaces.sdk.exception.GattException(message, 22));
        } else if (exc instanceof GattException.NoResult) {
            this.y = d.END_FAIL_BLUETOOTH;
            this.u.d(new com.sensorberg.smartspaces.sdk.exception.GattException(message, 23));
        } else if (exc instanceof b) {
            this.y = d.END_FAIL_BLUETOOTH;
            this.u.d(new com.sensorberg.smartspaces.sdk.exception.GattException(message, 24));
        } else {
            n.a.a.m(exc, "Failed to '" + this.u.f6417d + '\'', new Object[0]);
            throw exc;
        }
    }

    /* access modifiers changed from: private */
    public final void m0() {
        if (this.r) {
            this.u.f("Success");
            w(d.END_SUCCESS);
        } else if (this.z) {
            this.u.b(true);
            c.b bVar = this.u;
            bVar.f("Cancelled on " + this.u.f6417d);
            w(d.END_CANCELLED);
        } else {
            w(this.y);
        }
        c.b bVar2 = this.u;
        bVar2.g(this.t.a());
        c a2 = bVar2.a();
        k.d(a2, "result.setStatistic(statistic.build()).build()");
        this.G.b(a2);
    }

    /* access modifiers changed from: private */
    public final boolean n0(int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattCharacteristic bluetoothGattCharacteristic2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        return i2 != 0 || bluetoothGattCharacteristic == null || bluetoothGattCharacteristic2 == null || bluetoothGattDescriptor == null;
    }

    /* access modifiers changed from: private */
    public final void o0(com.sensorberg.synchronousgatt.c cVar) {
        BluetoothGatt m2 = cVar.m();
        if (m2 != null) {
            m2.disconnect();
        }
        Thread.sleep(2000);
    }

    private final void p0(com.sensorberg.synchronousgatt.c cVar) {
        this.t.k(d0());
        g0(this.H.c, "register notify", new f(this, cVar));
        if (!this.z) {
            t0();
            return;
        }
        throw new CancellationException();
    }

    private final void q0(int i2, com.sensorberg.synchronousgatt.c cVar) {
        g0(0, "requestMtu", new g(cVar, i2));
        if (!this.z) {
            t0();
            return;
        }
        throw new CancellationException();
    }

    private final void s0(com.sensorberg.synchronousgatt.c cVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.C;
        k.c(bluetoothGattCharacteristic);
        bluetoothGattCharacteristic.setValue(N);
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.C;
        k.c(bluetoothGattCharacteristic2);
        cVar.q(bluetoothGattCharacteristic2, this.I.f6462e);
    }

    /* access modifiers changed from: private */
    public final void t0() {
        long j2 = this.x;
        if (j2 > 0) {
            try {
                Thread.sleep(j2);
            } catch (InterruptedException unused) {
            }
        }
    }

    private final void u0(com.sensorberg.synchronousgatt.c cVar) {
        this.t.j(d0());
        g0(this.H.f6456d, "write message", new i(this, cVar));
        if (!this.z) {
            t0();
            return;
        }
        throw new CancellationException();
    }

    public final void a0() {
        if (!this.z) {
            d dVar = (d) n();
            if (dVar == d.NOT_STARTED || dVar == d.ON_GOING) {
                this.z = true;
                RuntimeException runtimeException = new RuntimeException("cancel() invocation, printing stacktrace");
                n.a.a.b(runtimeException, "Operation cancelled during " + this.u.f6417d, new Object[0]);
                return;
            }
            n.a.a.a("cancel() invocation ignored. Current " + dVar, new Object[0]);
        }
    }

    public final Runnable j0() {
        return this.F;
    }

    public final BluetoothGattService k0() {
        return this.B;
    }

    public final void r0(BluetoothGattService bluetoothGattService) {
        this.B = bluetoothGattService;
    }
}
