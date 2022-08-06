package com.sensorberg.smartspaces.sdk.internal.v;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import g.e.i.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MagnetoTapDetection */
class c {
    private final Set<b> a;
    private float b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private float f6806d;

    /* renamed from: e  reason: collision with root package name */
    private long f6807e;

    /* renamed from: f  reason: collision with root package name */
    private long f6808f;

    /* renamed from: g  reason: collision with root package name */
    private long f6809g;

    /* renamed from: h  reason: collision with root package name */
    private final SensorManager f6810h;

    /* renamed from: i  reason: collision with root package name */
    private final Sensor f6811i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f6812j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public g.e.i.b f6813k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6814l;

    /* renamed from: m  reason: collision with root package name */
    private long f6815m;

    /* renamed from: n  reason: collision with root package name */
    private final SensorEventListener f6816n;

    /* compiled from: MagnetoTapDetection */
    class a implements SensorEventListener {
        a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float sqrt = (float) Math.sqrt(Math.pow((double) fArr[0], 2.0d) + Math.pow((double) fArr[1], 2.0d) + Math.pow((double) fArr[2], 2.0d));
            c.this.f(sqrt / c.this.f6813k.a(sqrt), sensorEvent.timestamp);
        }
    }

    /* compiled from: MagnetoTapDetection */
    public interface b {
        void a(C0413c cVar);
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.v.c$c  reason: collision with other inner class name */
    /* compiled from: MagnetoTapDetection */
    public static class C0413c {
        /* synthetic */ C0413c(float f2, long j2, a aVar) {
            this(f2, j2);
        }

        private C0413c(float f2, long j2) {
        }
    }

    public c(Context context) {
        this(context, f.c.b());
    }

    private void d() {
        if (this.f6811i != null) {
            this.f6814l = false;
            this.f6815m = 0;
            this.f6813k = b.a.a(this.f6806d, this.c, this.f6807e, this.f6808f);
            this.f6810h.registerListener(this.f6816n, this.f6811i, 1, this.f6812j);
        }
    }

    private void e() {
        if (this.f6811i != null) {
            this.f6810h.unregisterListener(this.f6816n);
        }
    }

    /* access modifiers changed from: private */
    public void f(float f2, long j2) {
        boolean z = this.f6814l;
        boolean z2 = f2 > this.b;
        this.f6814l = z2;
        if (!z && z2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f6815m + this.f6809g < elapsedRealtime) {
                C0413c cVar = new C0413c(f2, j2, (a) null);
                for (b a2 : this.a) {
                    a2.a(cVar);
                }
                this.f6815m = elapsedRealtime;
            }
        }
    }

    public void c(b bVar) {
        if (this.a.isEmpty()) {
            d();
        }
        this.a.add(bVar);
    }

    public void g(b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            e();
        }
    }

    public void h(float f2, float f3, float f4, long j2, long j3, long j4) {
        this.b = f2;
        this.c = f3;
        this.f6806d = f4;
        this.f6807e = j2;
        this.f6808f = j3;
        this.f6809g = j4;
    }

    public c(Context context, Handler handler) {
        Sensor sensor;
        this.a = Collections.synchronizedSet(new HashSet());
        this.b = 2.075f;
        this.c = 100.0f;
        this.f6806d = 10.0f;
        this.f6807e = 5;
        this.f6808f = 50;
        this.f6809g = 1000;
        this.f6814l = false;
        this.f6815m = 0;
        this.f6816n = new a();
        this.f6812j = handler;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f6810h = sensorManager;
        if (sensorManager == null) {
            sensor = null;
        } else {
            sensor = sensorManager.getDefaultSensor(2);
        }
        this.f6811i = sensor;
    }
}
