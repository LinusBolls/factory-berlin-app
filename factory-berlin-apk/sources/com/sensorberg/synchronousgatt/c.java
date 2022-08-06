package com.sensorberg.synchronousgatt;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import android.os.Build;
import com.sensorberg.synchronousgatt.GattException;
import com.sensorberg.synchronousgatt.b;
import java.util.concurrent.Exchanger;
import kotlin.x;

/* compiled from: SynchronousGatt.kt */
public final class c {
    /* access modifiers changed from: private */
    public final a a = new a();
    /* access modifiers changed from: private */
    public BluetoothGatt b;
    /* access modifiers changed from: private */
    public final BluetoothDevice c;

    /* compiled from: SynchronousGatt.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f8063h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.f8063h = cVar;
        }

        /* renamed from: a */
        public final x d() {
            BluetoothGatt a = this.f8063h.b;
            if (a == null) {
                return null;
            }
            a.close();
            return x.a;
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<BluetoothGatt> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f8064h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f8065i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f8066j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, Context context, boolean z) {
            super(0);
            this.f8064h = cVar;
            this.f8065i = context;
            this.f8066j = z;
        }

        /* renamed from: a */
        public final BluetoothGatt d() {
            BluetoothGatt connectGatt = this.f8064h.c.connectGatt(this.f8065i, this.f8066j, this.f8064h.a);
            kotlin.jvm.internal.k.b(connectGatt, "device.connectGatt(context, autoConnect, callback)");
            return connectGatt;
        }
    }

    /* renamed from: com.sensorberg.synchronousgatt.c$c  reason: collision with other inner class name */
    /* compiled from: SynchronousGatt.kt */
    static final class C0543c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<BluetoothGatt> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f8067h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f8068i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f8069j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f8070k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0543c(c cVar, Context context, boolean z, int i2) {
            super(0);
            this.f8067h = cVar;
            this.f8068i = context;
            this.f8069j = z;
            this.f8070k = i2;
        }

        /* renamed from: a */
        public final BluetoothGatt d() {
            BluetoothGatt connectGatt = this.f8067h.c.connectGatt(this.f8068i, this.f8069j, this.f8067h.a, this.f8070k);
            kotlin.jvm.internal.k.b(connectGatt, "device.connectGatt(conte…ect, callback, transport)");
            return connectGatt;
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f8071h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.f8071h = cVar;
        }

        /* renamed from: a */
        public final x d() {
            BluetoothGatt a = this.f8071h.b;
            if (a == null) {
                return null;
            }
            a.disconnect();
            return x.a;
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BluetoothGatt, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f8072h = new e();

        e() {
            super(1);
        }

        public final boolean a(BluetoothGatt bluetoothGatt) {
            kotlin.jvm.internal.k.f(bluetoothGatt, "it");
            return bluetoothGatt.discoverServices();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((BluetoothGatt) obj));
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.a<Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f8073h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ BluetoothGatt f8074i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(kotlin.e0.c.l lVar, BluetoothGatt bluetoothGatt) {
            super(0);
            this.f8073h = lVar;
            this.f8074i = bluetoothGatt;
        }

        public final boolean a() {
            return ((Boolean) this.f8073h.o(this.f8074i)).booleanValue();
        }

        public /* bridge */ /* synthetic */ Object d() {
            return Boolean.valueOf(a());
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Exchanger f8075h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f8076i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Exchanger exchanger, kotlin.e0.c.a aVar) {
            super(0);
            this.f8075h = exchanger;
            this.f8076i = aVar;
        }

        public final void a() {
            this.f8075h.exchange(this.f8076i.d());
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class h extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BluetoothGatt, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BluetoothGattCharacteristic f8077h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super(1);
            this.f8077h = bluetoothGattCharacteristic;
        }

        public final boolean a(BluetoothGatt bluetoothGatt) {
            kotlin.jvm.internal.k.f(bluetoothGatt, "it");
            return bluetoothGatt.readCharacteristic(this.f8077h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((BluetoothGatt) obj));
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BluetoothGatt, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f8078h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(int i2) {
            super(1);
            this.f8078h = i2;
        }

        public final boolean a(BluetoothGatt bluetoothGatt) {
            kotlin.jvm.internal.k.f(bluetoothGatt, "it");
            return bluetoothGatt.requestMtu(this.f8078h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((BluetoothGatt) obj));
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BluetoothGatt, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BluetoothGattCharacteristic f8079h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f8080i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
            super(1);
            this.f8079h = bluetoothGattCharacteristic;
            this.f8080i = z;
        }

        public final boolean a(BluetoothGatt bluetoothGatt) {
            kotlin.jvm.internal.k.f(bluetoothGatt, "it");
            return bluetoothGatt.setCharacteristicNotification(this.f8079h, this.f8080i);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((BluetoothGatt) obj));
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BluetoothGatt, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BluetoothGattCharacteristic f8081h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super(1);
            this.f8081h = bluetoothGattCharacteristic;
        }

        public final boolean a(BluetoothGatt bluetoothGatt) {
            kotlin.jvm.internal.k.f(bluetoothGatt, "it");
            return bluetoothGatt.writeCharacteristic(this.f8081h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((BluetoothGatt) obj));
        }
    }

    /* compiled from: SynchronousGatt.kt */
    static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BluetoothGatt, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BluetoothGattDescriptor f8082h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(BluetoothGattDescriptor bluetoothGattDescriptor) {
            super(1);
            this.f8082h = bluetoothGattDescriptor;
        }

        public final boolean a(BluetoothGatt bluetoothGatt) {
            kotlin.jvm.internal.k.f(bluetoothGatt, "it");
            return bluetoothGatt.writeDescriptor(this.f8082h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((BluetoothGatt) obj));
        }
    }

    public c(BluetoothDevice bluetoothDevice) {
        kotlin.jvm.internal.k.f(bluetoothDevice, "device");
        this.c = bluetoothDevice;
    }

    private final BluetoothGatt g(Context context, boolean z) {
        Object l2 = l(new b(this, context, z));
        kotlin.jvm.internal.k.b(l2, "executeOnUiSync { device… autoConnect, callback) }");
        return (BluetoothGatt) l2;
    }

    @TargetApi(23)
    private final BluetoothGatt h(Context context, boolean z, int i2) {
        Object l2 = l(new C0543c(this, context, z, i2));
        kotlin.jvm.internal.k.b(l2, "executeOnUiSync { device…t, callback, transport) }");
        return (BluetoothGatt) l2;
    }

    private final boolean k(kotlin.e0.c.l<? super BluetoothGatt, Boolean> lVar) {
        BluetoothGatt bluetoothGatt = this.b;
        if (bluetoothGatt != null) {
            boolean booleanValue = ((Boolean) l(new f(lVar, bluetoothGatt))).booleanValue();
            if (booleanValue) {
                return booleanValue;
            }
            throw new GattException.NoResult();
        }
        throw new IllegalStateException("Call 'connect()' before any other operation");
    }

    private final <T> T l(kotlin.e0.c.a<? extends T> aVar) {
        Exchanger exchanger = new Exchanger();
        g.e.e.a aVar2 = g.e.e.a.f9778f;
        aVar2.j(aVar2.e(), new g(exchanger, aVar));
        return exchanger.exchange((Object) null);
    }

    public final b.a d(long j2) {
        return (b.a) a.c(this.a, b.a.class, j2, false, 4, (Object) null);
    }

    public final void e() {
        l(new a(this));
    }

    public final b.d f(Context context, boolean z, int i2, long j2) {
        BluetoothGatt bluetoothGatt;
        kotlin.jvm.internal.k.f(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            bluetoothGatt = h(context, z, i2);
        } else {
            bluetoothGatt = g(context, z);
        }
        this.a.e(bluetoothGatt);
        this.b = bluetoothGatt;
        return (b.d) a.c(this.a, b.d.class, j2, false, 4, (Object) null);
    }

    public final b.d i(long j2) {
        l(new d(this));
        return (b.d) this.a.b(b.d.class, j2, true);
    }

    public final b.j j(long j2) {
        k(e.f8072h);
        return (b.j) a.c(this.a, b.j.class, j2, false, 4, (Object) null);
    }

    public final BluetoothGatt m() {
        return this.b;
    }

    public final b.C0542b n(BluetoothGattCharacteristic bluetoothGattCharacteristic, long j2) {
        kotlin.jvm.internal.k.f(bluetoothGattCharacteristic, "characteristic");
        k(new h(bluetoothGattCharacteristic));
        return (b.C0542b) a.c(this.a, b.C0542b.class, j2, false, 4, (Object) null);
    }

    public final b.g o(int i2, long j2) {
        k(new i(i2));
        return (b.g) a.c(this.a, b.g.class, j2, false, 4, (Object) null);
    }

    public final boolean p(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        kotlin.jvm.internal.k.f(bluetoothGattCharacteristic, "characteristic");
        return k(new j(bluetoothGattCharacteristic, z));
    }

    public final b.c q(BluetoothGattCharacteristic bluetoothGattCharacteristic, long j2) {
        kotlin.jvm.internal.k.f(bluetoothGattCharacteristic, "characteristic");
        k(new k(bluetoothGattCharacteristic));
        return (b.c) a.c(this.a, b.c.class, j2, false, 4, (Object) null);
    }

    public final b.f r(BluetoothGattDescriptor bluetoothGattDescriptor, long j2) {
        kotlin.jvm.internal.k.f(bluetoothGattDescriptor, "descriptor");
        k(new l(bluetoothGattDescriptor));
        return (b.f) a.c(this.a, b.f.class, j2, false, 4, (Object) null);
    }
}
