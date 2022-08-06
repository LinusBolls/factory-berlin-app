package com.sensorberg.smartspaces.sdk.internal.o.a;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.k;

/* compiled from: GattManager.kt */
public final class b {
    private final Context a;
    private final ExecutorService b = Executors.newSingleThreadExecutor();
    private final Runnable c = C0383b.f6413g;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f6411d = a.f6412g;

    /* compiled from: GattManager.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        public static final a f6412g = new a();

        a() {
        }

        public final void run() {
            Thread.sleep(3000);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.o.a.b$b  reason: collision with other inner class name */
    /* compiled from: GattManager.kt */
    static final class C0383b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        public static final C0383b f6413g = new C0383b();

        C0383b() {
        }

        public final void run() {
            Thread.sleep(1000);
        }
    }

    public b(Context context) {
        k.e(context, "c");
        this.a = context.getApplicationContext();
    }

    public final e a(BluetoothDevice bluetoothDevice, a aVar, f fVar, g gVar) {
        k.e(bluetoothDevice, "device");
        k.e(aVar, "callback");
        k.e(fVar, "retry");
        k.e(gVar, "timeout");
        Context context = this.a;
        k.d(context, "context");
        e eVar = new e(context, bluetoothDevice, aVar, fVar, gVar);
        this.b.execute(this.c);
        this.b.execute(eVar.j0());
        this.b.execute(this.f6411d);
        return eVar;
    }
}
