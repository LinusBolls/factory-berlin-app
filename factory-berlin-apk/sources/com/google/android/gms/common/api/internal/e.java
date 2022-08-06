package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class e implements Handler.Callback {

    /* renamed from: n  reason: collision with root package name */
    public static final Status f2058n = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status o = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object p = new Object();
    private static e q;
    /* access modifiers changed from: private */
    public long a = 5000;
    /* access modifiers changed from: private */
    public long b = 120000;
    /* access modifiers changed from: private */
    public long c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f2059d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final com.google.android.gms.common.e f2060e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final k f2061f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f2062g = new AtomicInteger(1);

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f2063h = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Map<q0<?>, a<?>> f2064i = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public r f2065j = null;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Set<q0<?>> f2066k = new e.e.b();

    /* renamed from: l  reason: collision with root package name */
    private final Set<q0<?>> f2067l = new e.e.b();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Handler f2068m;

    public class a<O extends a.d> implements d.a, d.b {
        private final Queue<u> a = new LinkedList();
        /* access modifiers changed from: private */
        public final a.f b;
        private final a.b c;

        /* renamed from: d  reason: collision with root package name */
        private final q0<O> f2069d;

        /* renamed from: e  reason: collision with root package name */
        private final o f2070e;

        /* renamed from: f  reason: collision with root package name */
        private final Set<r0> f2071f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Map<i.a<?>, d0> f2072g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        private final int f2073h;

        /* renamed from: i  reason: collision with root package name */
        private final f0 f2074i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2075j;

        /* renamed from: k  reason: collision with root package name */
        private final List<b> f2076k = new ArrayList();

        /* renamed from: l  reason: collision with root package name */
        private com.google.android.gms.common.b f2077l = null;

        public a(com.google.android.gms.common.api.c<O> cVar) {
            a.f j2 = cVar.j(e.this.f2068m.getLooper(), this);
            this.b = j2;
            if (j2 instanceof u) {
                this.c = ((u) j2).k0();
            } else {
                this.c = j2;
            }
            this.f2069d = cVar.n();
            this.f2070e = new o();
            this.f2073h = cVar.g();
            if (this.b.o()) {
                this.f2074i = cVar.l(e.this.f2059d, e.this.f2068m);
            } else {
                this.f2074i = null;
            }
        }

        private final void A() {
            if (this.f2075j) {
                e.this.f2068m.removeMessages(11, this.f2069d);
                e.this.f2068m.removeMessages(9, this.f2069d);
                this.f2075j = false;
            }
        }

        private final void B() {
            e.this.f2068m.removeMessages(12, this.f2069d);
            e.this.f2068m.sendMessageDelayed(e.this.f2068m.obtainMessage(12, this.f2069d), e.this.c);
        }

        private final void E(u uVar) {
            uVar.d(this.f2070e, d());
            try {
                uVar.c(this);
            } catch (DeadObjectException unused) {
                i(1);
                this.b.m();
            }
        }

        /* access modifiers changed from: private */
        public final boolean F(boolean z) {
            r.d(e.this.f2068m);
            if (!this.b.b() || this.f2072g.size() != 0) {
                return false;
            }
            if (this.f2070e.e()) {
                if (z) {
                    B();
                }
                return false;
            }
            this.b.m();
            return true;
        }

        private final boolean K(com.google.android.gms.common.b bVar) {
            synchronized (e.p) {
                if (e.this.f2065j != null) {
                    if (e.this.f2066k.contains(this.f2069d)) {
                        e.this.f2065j.a(bVar, this.f2073h);
                        throw null;
                    }
                }
            }
            return false;
        }

        private final void L(com.google.android.gms.common.b bVar) {
            for (r0 next : this.f2071f) {
                String str = null;
                if (p.a(bVar, com.google.android.gms.common.b.f2098k)) {
                    str = this.b.k();
                }
                next.b(this.f2069d, bVar, str);
            }
            this.f2071f.clear();
        }

        private final com.google.android.gms.common.d f(com.google.android.gms.common.d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                com.google.android.gms.common.d[] j2 = this.b.j();
                if (j2 == null) {
                    j2 = new com.google.android.gms.common.d[0];
                }
                e.e.a aVar = new e.e.a(j2.length);
                for (com.google.android.gms.common.d dVar : j2) {
                    aVar.put(dVar.l(), Long.valueOf(dVar.n()));
                }
                for (com.google.android.gms.common.d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.l()) || ((Long) aVar.get(dVar2.l())).longValue() < dVar2.n()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final void h(b bVar) {
            if (!this.f2076k.contains(bVar) || this.f2075j) {
                return;
            }
            if (!this.b.b()) {
                a();
            } else {
                v();
            }
        }

        /* access modifiers changed from: private */
        public final void r(b bVar) {
            com.google.android.gms.common.d[] g2;
            if (this.f2076k.remove(bVar)) {
                e.this.f2068m.removeMessages(15, bVar);
                e.this.f2068m.removeMessages(16, bVar);
                com.google.android.gms.common.d b2 = bVar.b;
                ArrayList arrayList = new ArrayList(this.a.size());
                for (u uVar : this.a) {
                    if ((uVar instanceof e0) && (g2 = ((e0) uVar).g(this)) != null && com.google.android.gms.common.util.b.b(g2, b2)) {
                        arrayList.add(uVar);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    u uVar2 = (u) obj;
                    this.a.remove(uVar2);
                    uVar2.e(new UnsupportedApiCallException(b2));
                }
            }
        }

        private final boolean s(u uVar) {
            if (!(uVar instanceof e0)) {
                E(uVar);
                return true;
            }
            e0 e0Var = (e0) uVar;
            com.google.android.gms.common.d f2 = f(e0Var.g(this));
            if (f2 == null) {
                E(uVar);
                return true;
            } else if (e0Var.h(this)) {
                b bVar = new b(this.f2069d, f2, (v) null);
                int indexOf = this.f2076k.indexOf(bVar);
                if (indexOf >= 0) {
                    b bVar2 = this.f2076k.get(indexOf);
                    e.this.f2068m.removeMessages(15, bVar2);
                    e.this.f2068m.sendMessageDelayed(Message.obtain(e.this.f2068m, 15, bVar2), e.this.a);
                    return false;
                }
                this.f2076k.add(bVar);
                e.this.f2068m.sendMessageDelayed(Message.obtain(e.this.f2068m, 15, bVar), e.this.a);
                e.this.f2068m.sendMessageDelayed(Message.obtain(e.this.f2068m, 16, bVar), e.this.b);
                com.google.android.gms.common.b bVar3 = new com.google.android.gms.common.b(2, (PendingIntent) null);
                if (K(bVar3)) {
                    return false;
                }
                e.this.o(bVar3, this.f2073h);
                return false;
            } else {
                e0Var.e(new UnsupportedApiCallException(f2));
                return false;
            }
        }

        /* access modifiers changed from: private */
        public final void t() {
            y();
            L(com.google.android.gms.common.b.f2098k);
            A();
            Iterator<d0> it = this.f2072g.values().iterator();
            while (it.hasNext()) {
                d0 next = it.next();
                if (f(next.a.b()) != null) {
                    it.remove();
                } else {
                    try {
                        next.a.c(this.c, new h());
                    } catch (DeadObjectException unused) {
                        i(1);
                        this.b.m();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            v();
            B();
        }

        /* access modifiers changed from: private */
        public final void u() {
            y();
            this.f2075j = true;
            this.f2070e.g();
            e.this.f2068m.sendMessageDelayed(Message.obtain(e.this.f2068m, 9, this.f2069d), e.this.a);
            e.this.f2068m.sendMessageDelayed(Message.obtain(e.this.f2068m, 11, this.f2069d), e.this.b);
            e.this.f2061f.a();
        }

        private final void v() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                u uVar = (u) obj;
                if (!this.b.b()) {
                    return;
                }
                if (s(uVar)) {
                    this.a.remove(uVar);
                }
            }
        }

        public final boolean C() {
            return F(true);
        }

        public final void D(Status status) {
            r.d(e.this.f2068m);
            for (u b2 : this.a) {
                b2.b(status);
            }
            this.a.clear();
        }

        public final void J(com.google.android.gms.common.b bVar) {
            r.d(e.this.f2068m);
            this.b.m();
            l(bVar);
        }

        public final void a() {
            r.d(e.this.f2068m);
            if (!this.b.b() && !this.b.i()) {
                int b2 = e.this.f2061f.b(e.this.f2059d, this.b);
                if (b2 != 0) {
                    l(new com.google.android.gms.common.b(b2, (PendingIntent) null));
                    return;
                }
                c cVar = new c(this.b, this.f2069d);
                if (this.b.o()) {
                    this.f2074i.V0(cVar);
                }
                this.b.l(cVar);
            }
        }

        public final int b() {
            return this.f2073h;
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            return this.b.b();
        }

        public final boolean d() {
            return this.b.o();
        }

        public final void e() {
            r.d(e.this.f2068m);
            if (this.f2075j) {
                a();
            }
        }

        public final void i(int i2) {
            if (Looper.myLooper() == e.this.f2068m.getLooper()) {
                u();
            } else {
                e.this.f2068m.post(new x(this));
            }
        }

        public final void j(u uVar) {
            r.d(e.this.f2068m);
            if (!this.b.b()) {
                this.a.add(uVar);
                com.google.android.gms.common.b bVar = this.f2077l;
                if (bVar == null || !bVar.q()) {
                    a();
                } else {
                    l(this.f2077l);
                }
            } else if (s(uVar)) {
                B();
            } else {
                this.a.add(uVar);
            }
        }

        public final void k(r0 r0Var) {
            r.d(e.this.f2068m);
            this.f2071f.add(r0Var);
        }

        public final void l(com.google.android.gms.common.b bVar) {
            r.d(e.this.f2068m);
            f0 f0Var = this.f2074i;
            if (f0Var != null) {
                f0Var.W0();
            }
            y();
            e.this.f2061f.a();
            L(bVar);
            if (bVar.l() == 4) {
                D(e.o);
            } else if (this.a.isEmpty()) {
                this.f2077l = bVar;
            } else if (!K(bVar) && !e.this.o(bVar, this.f2073h)) {
                if (bVar.l() == 18) {
                    this.f2075j = true;
                }
                if (this.f2075j) {
                    e.this.f2068m.sendMessageDelayed(Message.obtain(e.this.f2068m, 9, this.f2069d), e.this.a);
                    return;
                }
                String b2 = this.f2069d.b();
                StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 38);
                sb.append("API: ");
                sb.append(b2);
                sb.append(" is not available on this device.");
                D(new Status(17, sb.toString()));
            }
        }

        public final a.f n() {
            return this.b;
        }

        public final void o(Bundle bundle) {
            if (Looper.myLooper() == e.this.f2068m.getLooper()) {
                t();
            } else {
                e.this.f2068m.post(new w(this));
            }
        }

        public final void p() {
            Status status;
            r.d(e.this.f2068m);
            if (this.f2075j) {
                A();
                if (e.this.f2060e.g(e.this.f2059d) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                D(status);
                this.b.m();
            }
        }

        public final void w() {
            r.d(e.this.f2068m);
            D(e.f2058n);
            this.f2070e.f();
            for (i.a p0Var : (i.a[]) this.f2072g.keySet().toArray(new i.a[this.f2072g.size()])) {
                j(new p0(p0Var, new h()));
            }
            L(new com.google.android.gms.common.b(4));
            if (this.b.b()) {
                this.b.a(new y(this));
            }
        }

        public final Map<i.a<?>, d0> x() {
            return this.f2072g;
        }

        public final void y() {
            r.d(e.this.f2068m);
            this.f2077l = null;
        }

        public final com.google.android.gms.common.b z() {
            r.d(e.this.f2068m);
            return this.f2077l;
        }
    }

    private class c implements i0, c.C0063c {
        /* access modifiers changed from: private */
        public final a.f a;
        /* access modifiers changed from: private */
        public final q0<?> b;
        private l c = null;

        /* renamed from: d  reason: collision with root package name */
        private Set<Scope> f2079d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f2080e = false;

        public c(a.f fVar, q0<?> q0Var) {
            this.a = fVar;
            this.b = q0Var;
        }

        /* access modifiers changed from: private */
        public final void g() {
            l lVar;
            if (this.f2080e && (lVar = this.c) != null) {
                this.a.d(lVar, this.f2079d);
            }
        }

        public final void a(com.google.android.gms.common.b bVar) {
            e.this.f2068m.post(new a0(this, bVar));
        }

        public final void b(com.google.android.gms.common.b bVar) {
            ((a) e.this.f2064i.get(this.b)).J(bVar);
        }

        public final void c(l lVar, Set<Scope> set) {
            if (lVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new com.google.android.gms.common.b(4));
                return;
            }
            this.c = lVar;
            this.f2079d = set;
            g();
        }
    }

    private e(Context context, Looper looper, com.google.android.gms.common.e eVar) {
        this.f2059d = context;
        this.f2068m = new g.b.a.b.c.b.d(looper, this);
        this.f2060e = eVar;
        this.f2061f = new k(eVar);
        Handler handler = this.f2068m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static e h(Context context) {
        e eVar;
        synchronized (p) {
            if (q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                q = new e(context.getApplicationContext(), handlerThread.getLooper(), com.google.android.gms.common.e.n());
            }
            eVar = q;
        }
        return eVar;
    }

    private final void i(com.google.android.gms.common.api.c<?> cVar) {
        q0<?> n2 = cVar.n();
        a aVar = this.f2064i.get(n2);
        if (aVar == null) {
            aVar = new a(cVar);
            this.f2064i.put(n2, aVar);
        }
        if (aVar.d()) {
            this.f2067l.add(n2);
        }
        aVar.a();
    }

    public static e j() {
        e eVar;
        synchronized (p) {
            r.l(q, "Must guarantee manager is non-null before using getInstance");
            eVar = q;
        }
        return eVar;
    }

    public final g<Map<q0<?>, String>> b(Iterable<? extends com.google.android.gms.common.api.c<?>> iterable) {
        r0 r0Var = new r0(iterable);
        Handler handler = this.f2068m;
        handler.sendMessage(handler.obtainMessage(2, r0Var));
        return r0Var.a();
    }

    public final void c(com.google.android.gms.common.b bVar, int i2) {
        if (!o(bVar, i2)) {
            Handler handler = this.f2068m;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
        }
    }

    public final void d(com.google.android.gms.common.api.c<?> cVar) {
        Handler handler = this.f2068m;
        handler.sendMessage(handler.obtainMessage(7, cVar));
    }

    public final <O extends a.d> void e(com.google.android.gms.common.api.c<O> cVar, int i2, c<? extends com.google.android.gms.common.api.g, a.b> cVar2) {
        n0 n0Var = new n0(i2, cVar2);
        Handler handler = this.f2068m;
        handler.sendMessage(handler.obtainMessage(4, new c0(n0Var, this.f2063h.get(), cVar)));
    }

    public final <O extends a.d, ResultT> void f(com.google.android.gms.common.api.c<O> cVar, int i2, m<a.b, ResultT> mVar, h<ResultT> hVar, l lVar) {
        o0 o0Var = new o0(i2, mVar, hVar, lVar);
        Handler handler = this.f2068m;
        handler.sendMessage(handler.obtainMessage(4, new c0(o0Var, this.f2063h.get(), cVar)));
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        long j2 = 300000;
        a aVar = null;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.c = j2;
                this.f2068m.removeMessages(12);
                for (q0<?> obtainMessage : this.f2064i.keySet()) {
                    Handler handler = this.f2068m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.c);
                }
                break;
            case 2:
                r0 r0Var = (r0) message.obj;
                Iterator<q0<?>> it = r0Var.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        q0 next = it.next();
                        a aVar2 = this.f2064i.get(next);
                        if (aVar2 == null) {
                            r0Var.b(next, new com.google.android.gms.common.b(13), (String) null);
                            break;
                        } else if (aVar2.c()) {
                            r0Var.b(next, com.google.android.gms.common.b.f2098k, aVar2.n().k());
                        } else if (aVar2.z() != null) {
                            r0Var.b(next, aVar2.z(), (String) null);
                        } else {
                            aVar2.k(r0Var);
                            aVar2.a();
                        }
                    }
                }
            case 3:
                for (a next2 : this.f2064i.values()) {
                    next2.y();
                    next2.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                c0 c0Var = (c0) message.obj;
                a aVar3 = this.f2064i.get(c0Var.c.n());
                if (aVar3 == null) {
                    i(c0Var.c);
                    aVar3 = this.f2064i.get(c0Var.c.n());
                }
                if (aVar3.d() && this.f2063h.get() != c0Var.b) {
                    c0Var.a.b(f2058n);
                    aVar3.w();
                    break;
                } else {
                    aVar3.j(c0Var.a);
                    break;
                }
                break;
            case 5:
                int i3 = message.arg1;
                com.google.android.gms.common.b bVar = (com.google.android.gms.common.b) message.obj;
                Iterator<a<?>> it2 = this.f2064i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a next3 = it2.next();
                        if (next3.b() == i3) {
                            aVar = next3;
                        }
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String e2 = this.f2060e.e(bVar.l());
                    String n2 = bVar.n();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 69 + String.valueOf(n2).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(e2);
                    sb2.append(": ");
                    sb2.append(n2);
                    aVar.D(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (com.google.android.gms.common.util.l.a() && (this.f2059d.getApplicationContext() instanceof Application)) {
                    b.k((Application) this.f2059d.getApplicationContext());
                    b.i().g(new v(this));
                    if (!b.i().n(true)) {
                        this.c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                i((com.google.android.gms.common.api.c) message.obj);
                break;
            case 9:
                if (this.f2064i.containsKey(message.obj)) {
                    this.f2064i.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (q0<?> remove : this.f2067l) {
                    this.f2064i.remove(remove).w();
                }
                this.f2067l.clear();
                break;
            case 11:
                if (this.f2064i.containsKey(message.obj)) {
                    this.f2064i.get(message.obj).p();
                    break;
                }
                break;
            case 12:
                if (this.f2064i.containsKey(message.obj)) {
                    this.f2064i.get(message.obj).C();
                    break;
                }
                break;
            case 14:
                s sVar = (s) message.obj;
                q0<?> b2 = sVar.b();
                if (this.f2064i.containsKey(b2)) {
                    sVar.a().c(Boolean.valueOf(this.f2064i.get(b2).F(false)));
                    break;
                } else {
                    sVar.a().c(Boolean.FALSE);
                    break;
                }
            case 15:
                b bVar2 = (b) message.obj;
                if (this.f2064i.containsKey(bVar2.a)) {
                    this.f2064i.get(bVar2.a).h(bVar2);
                    break;
                }
                break;
            case 16:
                b bVar3 = (b) message.obj;
                if (this.f2064i.containsKey(bVar3.a)) {
                    this.f2064i.get(bVar3.a).r(bVar3);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int k() {
        return this.f2062g.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final boolean o(com.google.android.gms.common.b bVar, int i2) {
        return this.f2060e.u(this.f2059d, bVar, i2);
    }

    public final void w() {
        Handler handler = this.f2068m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    private static class b {
        /* access modifiers changed from: private */
        public final q0<?> a;
        /* access modifiers changed from: private */
        public final com.google.android.gms.common.d b;

        private b(q0<?> q0Var, com.google.android.gms.common.d dVar) {
            this.a = q0Var;
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (!p.a(this.a, bVar.a) || !p.a(this.b, bVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return p.b(this.a, this.b);
        }

        public final String toString() {
            p.a c = p.c(this);
            c.a("key", this.a);
            c.a("feature", this.b);
            return c.toString();
        }

        /* synthetic */ b(q0 q0Var, com.google.android.gms.common.d dVar, v vVar) {
            this(q0Var, dVar);
        }
    }
}
