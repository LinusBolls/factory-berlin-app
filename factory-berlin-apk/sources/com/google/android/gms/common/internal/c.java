package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T extends IInterface> {
    private static final com.google.android.gms.common.d[] v = new com.google.android.gms.common.d[0];
    private l0 a;
    private final Context b;
    private final j c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.gms.common.f f2114d;

    /* renamed from: e  reason: collision with root package name */
    final Handler f2115e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f2116f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Object f2117g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public o f2118h;

    /* renamed from: i  reason: collision with root package name */
    protected C0063c f2119i;

    /* renamed from: j  reason: collision with root package name */
    private T f2120j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<h<?>> f2121k;

    /* renamed from: l  reason: collision with root package name */
    private j f2122l;

    /* renamed from: m  reason: collision with root package name */
    private int f2123m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final a f2124n;
    /* access modifiers changed from: private */
    public final b o;
    private final int p;
    private final String q;
    /* access modifiers changed from: private */
    public com.google.android.gms.common.b r;
    /* access modifiers changed from: private */
    public boolean s;
    private volatile f0 t;
    protected AtomicInteger u;

    public interface a {
        void i(int i2);

        void o(Bundle bundle);
    }

    public interface b {
        void l(com.google.android.gms.common.b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface C0063c {
        void a(com.google.android.gms.common.b bVar);
    }

    protected class d implements C0063c {
        public d() {
        }

        public void a(com.google.android.gms.common.b bVar) {
            if (bVar.K()) {
                c cVar = c.this;
                cVar.d((l) null, cVar.A());
            } else if (c.this.o != null) {
                c.this.o.l(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    private abstract class f extends h<Boolean> {

        /* renamed from: d  reason: collision with root package name */
        private final int f2125d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f2126e;

        protected f(int i2, Bundle bundle) {
            super(Boolean.TRUE);
            this.f2125d = i2;
            this.f2126e = bundle;
        }

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void c(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.P(r0, null)
                return
            L_0x000c:
                int r5 = r4.f2125d
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.P(r0, null)
                android.os.Bundle r5 = r4.f2126e
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                com.google.android.gms.common.b r5 = new com.google.android.gms.common.b
                int r0 = r4.f2125d
                r5.<init>(r0, r1)
                r4.f(r5)
                goto L_0x0076
            L_0x0031:
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.P(r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.c.this
                java.lang.String r2 = r2.p()
                r1[r0] = r2
                r0 = 2
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.c.this
                java.lang.String r2 = r2.c()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.g()
                if (r5 != 0) goto L_0x0076
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.P(r0, null)
                com.google.android.gms.common.b r5 = new com.google.android.gms.common.b
                r0 = 8
                r5.<init>(r0, r1)
                r4.f(r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.f.c(java.lang.Object):void");
        }

        /* access modifiers changed from: protected */
        public final void d() {
        }

        /* access modifiers changed from: protected */
        public abstract void f(com.google.android.gms.common.b bVar);

        /* access modifiers changed from: protected */
        public abstract boolean g();
    }

    final class g extends g.b.a.b.c.c.d {
        public g(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.d();
            hVar.b();
        }

        private static boolean b(Message message) {
            int i2 = message.what;
            return i2 == 2 || i2 == 1 || i2 == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.u
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x0015
                a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x002e
                r4 = 7
                if (r0 == r4) goto L_0x002e
                if (r0 != r1) goto L_0x002a
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                boolean r0 = r0.t()
                if (r0 == 0) goto L_0x002e
            L_0x002a:
                int r0 = r8.what
                if (r0 != r3) goto L_0x003a
            L_0x002e:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                boolean r0 = r0.i()
                if (r0 != 0) goto L_0x003a
                a(r8)
                return
            L_0x003a:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0085
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r1 = new com.google.android.gms.common.b
                int r8 = r8.arg2
                r1.<init>(r8)
                com.google.android.gms.common.b unused = r0.r = r1
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                boolean r8 = r8.f0()
                if (r8 == 0) goto L_0x0064
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                boolean r8 = r8.s
                if (r8 != 0) goto L_0x0064
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                r8.P(r5, null)
                return
            L_0x0064:
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.r
                if (r8 == 0) goto L_0x0073
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.r
                goto L_0x0078
            L_0x0073:
                com.google.android.gms.common.b r8 = new com.google.android.gms.common.b
                r8.<init>(r4)
            L_0x0078:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$c r0 = r0.f2119i
                r0.a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                r0.E(r8)
                return
            L_0x0085:
                if (r0 != r3) goto L_0x00a8
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.r
                if (r8 == 0) goto L_0x0096
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.r
                goto L_0x009b
            L_0x0096:
                com.google.android.gms.common.b r8 = new com.google.android.gms.common.b
                r8.<init>(r4)
            L_0x009b:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$c r0 = r0.f2119i
                r0.a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                r0.E(r8)
                return
            L_0x00a8:
                if (r0 != r5) goto L_0x00c7
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00b3
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00b3:
                com.google.android.gms.common.b r0 = new com.google.android.gms.common.b
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$c r8 = r8.f2119i
                r8.a(r0)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                r8.E(r0)
                return
            L_0x00c7:
                r1 = 6
                if (r0 != r1) goto L_0x00ef
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                r0.P(r3, null)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$a r0 = r0.f2124n
                if (r0 == 0) goto L_0x00e2
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$a r0 = r0.f2124n
                int r1 = r8.arg2
                r0.i(r1)
            L_0x00e2:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                int r8 = r8.arg2
                r0.F(r8)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                boolean unused = r8.U(r3, r2, r6)
                return
            L_0x00ef:
                r1 = 2
                if (r0 != r1) goto L_0x00fe
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                boolean r0 = r0.b()
                if (r0 != 0) goto L_0x00fe
                a(r8)
                return
            L_0x00fe:
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x010c
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.c$h r8 = (com.google.android.gms.common.internal.c.h) r8
                r8.e()
                return
            L_0x010c:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.g.handleMessage(android.os.Message):void");
        }
    }

    protected abstract class h<TListener> {
        private TListener a;
        private boolean b = false;

        public h(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
        }

        public final void b() {
            a();
            synchronized (c.this.f2121k) {
                c.this.f2121k.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void c(TListener tlistener);

        /* access modifiers changed from: protected */
        public abstract void d();

        public final void e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    c(tlistener);
                } catch (RuntimeException e2) {
                    d();
                    throw e2;
                }
            } else {
                d();
            }
            synchronized (this) {
                this.b = true;
            }
            b();
        }
    }

    public static final class i extends m.a {
        private c a;
        private final int b;

        public i(c cVar, int i2) {
            this.a = cVar;
            this.b = i2;
        }

        public final void C0(int i2, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        public final void O0(int i2, IBinder iBinder, Bundle bundle) {
            r.l(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.G(i2, iBinder, bundle, this.b);
            this.a = null;
        }

        public final void r0(int i2, IBinder iBinder, f0 f0Var) {
            r.l(this.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.k(f0Var);
            this.a.T(f0Var);
            O0(i2, iBinder, f0Var.f2144g);
        }
    }

    public final class j implements ServiceConnection {
        private final int a;

        public j(int i2) {
            this.a = i2;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o oVar;
            if (iBinder == null) {
                c.this.W(16);
                return;
            }
            synchronized (c.this.f2117g) {
                c cVar = c.this;
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof o)) {
                        oVar = new n(iBinder);
                    } else {
                        oVar = (o) queryLocalInterface;
                    }
                }
                o unused = cVar.f2118h = oVar;
            }
            c.this.O(0, (Bundle) null, this.a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (c.this.f2117g) {
                o unused = c.this.f2118h = null;
            }
            Handler handler = c.this.f2115e;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    protected final class k extends f {

        /* renamed from: g  reason: collision with root package name */
        private final IBinder f2128g;

        public k(int i2, IBinder iBinder, Bundle bundle) {
            super(i2, bundle);
            this.f2128g = iBinder;
        }

        /* access modifiers changed from: protected */
        public final void f(com.google.android.gms.common.b bVar) {
            if (c.this.o != null) {
                c.this.o.l(bVar);
            }
            c.this.E(bVar);
        }

        /* access modifiers changed from: protected */
        public final boolean g() {
            try {
                String interfaceDescriptor = this.f2128g.getInterfaceDescriptor();
                if (!c.this.c().equals(interfaceDescriptor)) {
                    String c = c.this.c();
                    StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(c);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface e2 = c.this.e(this.f2128g);
                if (e2 == null || (!c.this.U(2, 4, e2) && !c.this.U(3, 4, e2))) {
                    return false;
                }
                com.google.android.gms.common.b unused = c.this.r = null;
                Bundle w = c.this.w();
                if (c.this.f2124n == null) {
                    return true;
                }
                c.this.f2124n.o(w);
                return true;
            } catch (RemoteException unused2) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class l extends f {
        public l(int i2, Bundle bundle) {
            super(i2, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        public final void f(com.google.android.gms.common.b bVar) {
            if (!c.this.t() || !c.this.f0()) {
                c.this.f2119i.a(bVar);
                c.this.E(bVar);
                return;
            }
            c.this.W(16);
        }

        /* access modifiers changed from: protected */
        public final boolean g() {
            c.this.f2119i.a(com.google.android.gms.common.b.f2098k);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c.a r13, com.google.android.gms.common.internal.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.j.a(r10)
            com.google.android.gms.common.f r4 = com.google.android.gms.common.f.f()
            com.google.android.gms.common.internal.r.k(r13)
            r6 = r13
            com.google.android.gms.common.internal.c$a r6 = (com.google.android.gms.common.internal.c.a) r6
            com.google.android.gms.common.internal.r.k(r14)
            r7 = r14
            com.google.android.gms.common.internal.c$b r7 = (com.google.android.gms.common.internal.c.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void P(int i2, T t2) {
        l0 l0Var;
        r.a((i2 == 4) == (t2 != null));
        synchronized (this.f2116f) {
            this.f2123m = i2;
            this.f2120j = t2;
            H(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.f2122l == null || this.a == null)) {
                        String c2 = this.a.c();
                        String a2 = this.a.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c2);
                        sb.append(" on ");
                        sb.append(a2);
                        Log.e("GmsClient", sb.toString());
                        this.c.b(this.a.c(), this.a.a(), this.a.b(), this.f2122l, d0());
                        this.u.incrementAndGet();
                    }
                    this.f2122l = new j(this.u.get());
                    if (this.f2123m != 3 || z() == null) {
                        l0Var = new l0(C(), p(), false, 129);
                    } else {
                        l0Var = new l0(x().getPackageName(), z(), true, 129);
                    }
                    this.a = l0Var;
                    if (!this.c.c(new j.a(l0Var.c(), this.a.a(), this.a.b()), this.f2122l, d0())) {
                        String c3 = this.a.c();
                        String a3 = this.a.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c3).length() + 34 + String.valueOf(a3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c3);
                        sb2.append(" on ");
                        sb2.append(a3);
                        Log.e("GmsClient", sb2.toString());
                        O(16, (Bundle) null, this.u.get());
                    }
                } else if (i2 == 4) {
                    D(t2);
                }
            } else if (this.f2122l != null) {
                this.c.b(this.a.c(), this.a.a(), this.a.b(), this.f2122l, d0());
                this.f2122l = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void T(f0 f0Var) {
        this.t = f0Var;
    }

    /* access modifiers changed from: private */
    public final boolean U(int i2, int i3, T t2) {
        synchronized (this.f2116f) {
            if (this.f2123m != i2) {
                return false;
            }
            P(i3, t2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void W(int i2) {
        int i3;
        if (e0()) {
            i3 = 5;
            this.s = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.f2115e;
        handler.sendMessage(handler.obtainMessage(i3, this.u.get(), 16));
    }

    private final String d0() {
        String str = this.q;
        return str == null ? this.b.getClass().getName() : str;
    }

    private final boolean e0() {
        boolean z;
        synchronized (this.f2116f) {
            z = this.f2123m == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final boolean f0() {
        if (this.s || TextUtils.isEmpty(c()) || TextUtils.isEmpty(z())) {
            return false;
        }
        try {
            Class.forName(c());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public Set<Scope> A() {
        return Collections.EMPTY_SET;
    }

    public final T B() {
        T t2;
        synchronized (this.f2116f) {
            if (this.f2123m != 5) {
                s();
                r.o(this.f2120j != null, "Client is connected but service is null");
                t2 = this.f2120j;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public String C() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    public void D(T t2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void E(com.google.android.gms.common.b bVar) {
        bVar.l();
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void F(int i2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void G(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f2115e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    public void H(int i2, T t2) {
    }

    public boolean I() {
        return false;
    }

    public void J(int i2) {
        Handler handler = this.f2115e;
        handler.sendMessage(handler.obtainMessage(6, this.u.get(), i2));
    }

    /* access modifiers changed from: protected */
    public void K(C0063c cVar, int i2, PendingIntent pendingIntent) {
        r.l(cVar, "Connection progress callbacks cannot be null.");
        this.f2119i = cVar;
        Handler handler = this.f2115e;
        handler.sendMessage(handler.obtainMessage(3, this.u.get(), i2, pendingIntent));
    }

    /* access modifiers changed from: protected */
    public final void O(int i2, Bundle bundle, int i3) {
        Handler handler = this.f2115e;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2, (Bundle) null)));
    }

    public void a(e eVar) {
        eVar.a();
    }

    public boolean b() {
        boolean z;
        synchronized (this.f2116f) {
            z = this.f2123m == 4;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public void d(l lVar, Set<Scope> set) {
        Bundle y = y();
        h hVar = new h(this.p);
        hVar.f2149j = this.b.getPackageName();
        hVar.f2152m = y;
        if (set != null) {
            hVar.f2151l = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (o()) {
            hVar.f2153n = u() != null ? u() : new Account("<<default account>>", "com.google");
            if (lVar != null) {
                hVar.f2150k = lVar.asBinder();
            }
        } else if (I()) {
            hVar.f2153n = u();
        }
        hVar.o = v;
        hVar.p = v();
        try {
            synchronized (this.f2117g) {
                if (this.f2118h != null) {
                    this.f2118h.W(new i(this, this.u.get()), hVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            J(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            G(8, (IBinder) null, (Bundle) null, this.u.get());
        }
    }

    /* access modifiers changed from: protected */
    public abstract T e(IBinder iBinder);

    public boolean f() {
        return true;
    }

    public int g() {
        return com.google.android.gms.common.f.a;
    }

    public boolean i() {
        boolean z;
        synchronized (this.f2116f) {
            if (this.f2123m != 2) {
                if (this.f2123m != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final com.google.android.gms.common.d[] j() {
        f0 f0Var = this.t;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f2145h;
    }

    public String k() {
        l0 l0Var;
        if (b() && (l0Var = this.a) != null) {
            return l0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void l(C0063c cVar) {
        r.l(cVar, "Connection progress callbacks cannot be null.");
        this.f2119i = cVar;
        P(2, (IInterface) null);
    }

    public void m() {
        this.u.incrementAndGet();
        synchronized (this.f2121k) {
            int size = this.f2121k.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2121k.get(i2).a();
            }
            this.f2121k.clear();
        }
        synchronized (this.f2117g) {
            this.f2118h = null;
        }
        P(1, (IInterface) null);
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract String p();

    public void r() {
        int h2 = this.f2114d.h(this.b, g());
        if (h2 != 0) {
            P(1, (IInterface) null);
            K(new d(), h2, (PendingIntent) null);
            return;
        }
        l(new d());
    }

    /* access modifiers changed from: protected */
    public final void s() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public com.google.android.gms.common.d[] v() {
        return v;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public Bundle y() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public String z() {
        return null;
    }

    protected c(Context context, Looper looper, j jVar, com.google.android.gms.common.f fVar, int i2, a aVar, b bVar, String str) {
        this.f2116f = new Object();
        this.f2117g = new Object();
        this.f2121k = new ArrayList<>();
        this.f2123m = 1;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = new AtomicInteger(0);
        r.l(context, "Context must not be null");
        this.b = context;
        r.l(looper, "Looper must not be null");
        Looper looper2 = looper;
        r.l(jVar, "Supervisor must not be null");
        this.c = jVar;
        r.l(fVar, "API availability must not be null");
        this.f2114d = fVar;
        this.f2115e = new g(looper);
        this.p = i2;
        this.f2124n = aVar;
        this.o = bVar;
        this.q = str;
    }
}
