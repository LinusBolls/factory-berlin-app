package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import android.bluetooth.BluetoothDevice;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import com.sensorberg.smartspaces.sdk.exception.CanceledException;
import com.sensorberg.smartspaces.sdk.internal.o.a.c;
import com.sensorberg.smartspaces.sdk.internal.o.a.e;
import com.sensorberg.smartspaces.sdk.internal.o.a.f;
import com.sensorberg.smartspaces.sdk.internal.o.a.g;
import com.sensorberg.smartspaces.sdk.internal.unit.opener.e;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: GatewayBleOpener.kt */
public final class h extends d {
    /* access modifiers changed from: private */
    public final f q = new f("ble");
    private final com.sensorberg.smartspaces.sdk.internal.o.a.a r = D();
    /* access modifiers changed from: private */
    public final ArrayBlockingQueue<String> s = new ArrayBlockingQueue<>(1);
    private final e t;
    /* access modifiers changed from: private */
    public Exception u;
    private final IotUnit v;
    /* access modifiers changed from: private */
    public final Resources w;

    /* compiled from: GatewayBleOpener.kt */
    static final class a extends l implements kotlin.e0.c.l<String, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f6757h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(1);
            this.f6757h = hVar;
        }

        public final void a(String str) {
            k.e(str, "it");
            n.a.a.a("Encrypted Message generated: " + str, new Object[0]);
            ArrayBlockingQueue A = this.f6757h.s;
            A.offer("1205" + str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return x.a;
        }
    }

    /* compiled from: GatewayBleOpener.kt */
    public static final class b implements com.sensorberg.smartspaces.sdk.internal.o.a.a {
        final /* synthetic */ h a;

        b(h hVar) {
            this.a = hVar;
        }

        public String a() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = (String) this.a.s.poll(20, TimeUnit.SECONDS);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("1205FAIL-TO-ENCRYPT-MESSAGE-");
                String str2 = Build.MANUFACTURER;
                k.d(str2, "Build.MANUFACTURER");
                Locale locale = Locale.US;
                k.d(locale, "Locale.US");
                if (str2 != null) {
                    String upperCase = str2.toUpperCase(locale);
                    k.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                    sb.append('-');
                    String str3 = Build.MODEL;
                    k.d(str3, "Build.MODEL");
                    Locale locale2 = Locale.US;
                    k.d(locale2, "Locale.US");
                    if (str3 != null) {
                        String upperCase2 = str3.toUpperCase(locale2);
                        k.d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
                        sb.append(upperCase2);
                        str = sb.toString();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            n.a.a.a("Returning encrypted message after " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms", new Object[0]);
            return str;
        }

        public void b(c cVar) {
            e eVar;
            e eVar2;
            k.e(cVar, "result");
            c.C0384c cVar2 = cVar.f6415e;
            if (cVar2 != null) {
                n.a.a.a(cVar2.toString(), new Object[0]);
                f z = this.a.q;
                c.C0384c cVar3 = cVar.f6415e;
                k.d(cVar3, "result.statistic");
                z.d(cVar3);
                if (cVar.a) {
                    String str = cVar.c;
                    k.c(str);
                    n.a.a.f("Gatt response: " + str, new Object[0]);
                    com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a.a a2 = com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a.a.f6771d.a(str);
                    h hVar = this.a;
                    if (a2.a() == com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a.b.OK) {
                        eVar2 = new e.a(SystemClock.elapsedRealtime(), this.a.q);
                    } else if (a2.a() == com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a.b.ERROR) {
                        eVar2 = new e.b.C0408b(SystemClock.elapsedRealtime(), this.a.q, new BleDeniedException(a2.c().a(this.a.w, a2.b()), str));
                    } else if (cVar.b) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        f z2 = this.a.q;
                        Exception y = this.a.u;
                        if (y == null) {
                            y = new CanceledException();
                        }
                        eVar2 = new e.b.c(elapsedRealtime, z2, y);
                    } else {
                        eVar2 = new e.b.a(SystemClock.elapsedRealtime(), this.a.q, new GatewayServerException(str));
                    }
                    hVar.w(eVar2);
                    return;
                }
                h hVar2 = this.a;
                if (cVar.b) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    f z3 = this.a.q;
                    Exception y2 = this.a.u;
                    if (y2 == null) {
                        y2 = new CanceledException();
                    }
                    eVar = new e.b.c(elapsedRealtime2, z3, y2);
                } else {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    f z4 = this.a.q;
                    Exception exc = cVar.f6416f;
                    if (exc == null) {
                        exc = new IOException(cVar.f6414d);
                    }
                    eVar = new e.b.a(elapsedRealtime3, z4, exc);
                }
                hVar2.w(eVar);
                return;
            }
            throw new IllegalArgumentException("GattResult.Statistic can't be null");
        }
    }

    public h(g.e.k.e<String> eVar, IotUnit iotUnit, m mVar, g.e.k.a aVar, com.sensorberg.smartspaces.sdk.internal.o.a.b bVar, Resources resources) {
        f fVar;
        k.e(eVar, "btle");
        k.e(iotUnit, "iotUnit");
        k.e(mVar, "scan");
        k.e(aVar, "cancellation");
        k.e(bVar, "gattManager");
        k.e(resources, "resources");
        this.v = iotUnit;
        this.w = resources;
        n.a.a.a("Starting GatewayBleOpener. Connecting to " + this.v.getDisplayName() + " via bluetooth", new Object[0]);
        int i2 = i.a[this.v.getType().ordinal()];
        if (i2 == 1) {
            fVar = f.f6454f;
        } else if (i2 == 2) {
            fVar = f.f6455g;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        g.e.k.h.a.i(eVar, aVar, new a(this));
        BluetoothDevice a2 = mVar.a();
        k.d(a2, "scan.device");
        com.sensorberg.smartspaces.sdk.internal.o.a.a aVar2 = this.r;
        k.d(fVar, "retry");
        g gVar = g.f6460h;
        k.d(gVar, "TimeoutSettings.DEFAULT");
        this.t = bVar.a(a2, aVar2, fVar, gVar);
    }

    private final com.sensorberg.smartspaces.sdk.internal.o.a.a D() {
        return new b(this);
    }

    public void a(Exception exc) {
        k.e(exc, "exception");
        this.u = exc;
        this.t.a0();
    }
}
