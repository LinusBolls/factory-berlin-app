package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import android.os.SystemClock;
import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.internal.unit.opener.e;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.m.e.d;
import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: GatewayIpOpener.kt */
public final class j extends d {
    /* access modifiers changed from: private */
    public Exception q;
    /* access modifiers changed from: private */
    public final f r = new f(Statistics.CHANNEL_IP);

    /* compiled from: GatewayIpOpener.kt */
    static final class a extends l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f6758h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(1);
            this.f6758h = jVar;
        }

        public final void a(Void voidR) {
            this.f6758h.r.b();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: GatewayIpOpener.kt */
    static final class b extends l implements kotlin.e0.c.l<ActuatorRequest, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f6759h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(1);
            this.f6759h = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            if (r2.equals(com.sensorberg.smartspaces.backend.model.ActuatorRequest.STATE_APPROVED) == false) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
            if (r2.equals(com.sensorberg.smartspaces.backend.model.ActuatorRequest.STATE_SUCCESS) != false) goto L_0x0076;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.sensorberg.smartspaces.backend.model.ActuatorRequest r10) {
            /*
                r9 = this;
                com.sensorberg.smartspaces.sdk.internal.unit.opener.j r0 = r9.f6759h
                com.sensorberg.smartspaces.sdk.internal.unit.opener.f r0 = r0.r
                r0.c()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "GatewayIpOpener.onSuccess -> State: "
                r0.append(r1)
                r1 = 0
                if (r10 == 0) goto L_0x0019
                java.lang.String r2 = r10.state
                goto L_0x001a
            L_0x0019:
                r2 = r1
            L_0x001a:
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                n.a.a.a(r0, r2)
                com.sensorberg.smartspaces.sdk.internal.unit.opener.j r0 = r9.f6759h
                if (r10 == 0) goto L_0x002e
                java.lang.String r2 = r10.state
                goto L_0x002f
            L_0x002e:
                r2 = r1
            L_0x002f:
                if (r2 != 0) goto L_0x0032
                goto L_0x0086
            L_0x0032:
                int r3 = r2.hashCode()
                r4 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
                if (r3 == r4) goto L_0x006e
                r4 = -1335395429(0xffffffffb0677b9b, float:-8.4212964E-10)
                if (r3 == r4) goto L_0x004f
                r4 = 1185244855(0x46a566b7, float:21171.357)
                if (r3 == r4) goto L_0x0046
                goto L_0x0086
            L_0x0046:
                java.lang.String r3 = "approved"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0086
                goto L_0x0076
            L_0x004f:
                java.lang.String r3 = "denied"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0086
                com.sensorberg.smartspaces.sdk.internal.unit.opener.e$b$b r10 = new com.sensorberg.smartspaces.sdk.internal.unit.opener.e$b$b
                long r1 = android.os.SystemClock.elapsedRealtime()
                com.sensorberg.smartspaces.sdk.internal.unit.opener.j r3 = r9.f6759h
                com.sensorberg.smartspaces.sdk.internal.unit.opener.f r3 = r3.r
                com.sensorberg.smartspaces.sdk.internal.unit.opener.DeniedException r4 = new com.sensorberg.smartspaces.sdk.internal.unit.opener.DeniedException
                java.lang.String r5 = "Not authorized"
                r4.<init>(r5)
                r10.<init>(r1, r3, r4)
                goto L_0x00b0
            L_0x006e:
                java.lang.String r3 = "success"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0086
            L_0x0076:
                com.sensorberg.smartspaces.sdk.internal.unit.opener.e$a r10 = new com.sensorberg.smartspaces.sdk.internal.unit.opener.e$a
                long r1 = android.os.SystemClock.elapsedRealtime()
                com.sensorberg.smartspaces.sdk.internal.unit.opener.j r3 = r9.f6759h
                com.sensorberg.smartspaces.sdk.internal.unit.opener.f r3 = r3.r
                r10.<init>(r1, r3)
                goto L_0x00b0
            L_0x0086:
                com.sensorberg.smartspaces.sdk.internal.unit.opener.e$b$a r2 = new com.sensorberg.smartspaces.sdk.internal.unit.opener.e$b$a
                long r3 = android.os.SystemClock.elapsedRealtime()
                com.sensorberg.smartspaces.sdk.internal.unit.opener.j r5 = r9.f6759h
                com.sensorberg.smartspaces.sdk.internal.unit.opener.f r5 = r5.r
                java.io.IOException r6 = new java.io.IOException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Invalid IP ActuatorRequest state: "
                r7.append(r8)
                if (r10 == 0) goto L_0x00a2
                java.lang.String r1 = r10.state
            L_0x00a2:
                r7.append(r1)
                java.lang.String r10 = r7.toString()
                r6.<init>(r10)
                r2.<init>(r3, r5, r6)
                r10 = r2
            L_0x00b0:
                r0.w(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.unit.opener.j.b.a(com.sensorberg.smartspaces.backend.model.ActuatorRequest):void");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((ActuatorRequest) obj);
            return x.a;
        }
    }

    /* compiled from: GatewayIpOpener.kt */
    static final class c extends l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f6760h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(1);
            this.f6760h = jVar;
        }

        public final void a(Exception exc) {
            this.f6760h.r.c();
            n.a.a.a("GatewayIpOpener.onFail -> State: " + exc, new Object[0]);
            Exception y = this.f6760h.q;
            if (y != null) {
                exc = y;
            }
            if (exc == null) {
                exc = new IOException("Invalid IP ActuatorRequest state");
            }
            this.f6760h.w(new e.b.a(SystemClock.elapsedRealtime(), this.f6760h.r, exc));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    public j(IotUnit iotUnit, g.e.k.e<g.e.m.a<ActuatorRequest, Void>> eVar) {
        k.e(iotUnit, "iotUnit");
        k.e(eVar, "request");
        n.a.a.a("Starting GatewayIpOpener. Connecting to " + iotUnit.getDisplayName() + " via HTTP", new Object[0]);
        d b2 = g.e.m.e.e.b(eVar, (g.e.k.a) null, 1, (Object) null);
        b2.c(new a(this));
        b2.f(new b(this));
        b2.e(new c(this));
    }

    public void a(Exception exc) {
        k.e(exc, "exception");
        this.q = exc;
    }
}
