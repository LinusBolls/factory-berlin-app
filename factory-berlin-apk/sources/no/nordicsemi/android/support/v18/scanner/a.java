package no.nordicsemi.android.support.v18.scanner;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import no.nordicsemi.android.support.v18.scanner.n;

/* compiled from: BluetoothLeScannerCompat */
public abstract class a {
    private static a a;

    /* renamed from: no.nordicsemi.android.support.v18.scanner.a$a  reason: collision with other inner class name */
    /* compiled from: BluetoothLeScannerCompat */
    static class C0788a {
        /* access modifiers changed from: private */
        public final Object a = new Object();
        private final boolean b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f11184d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f11185e;

        /* renamed from: f  reason: collision with root package name */
        final List<k> f11186f;

        /* renamed from: g  reason: collision with root package name */
        final n f11187g;

        /* renamed from: h  reason: collision with root package name */
        final j f11188h;

        /* renamed from: i  reason: collision with root package name */
        final Handler f11189i;

        /* renamed from: j  reason: collision with root package name */
        private final List<m> f11190j = new ArrayList();

        /* renamed from: k  reason: collision with root package name */
        private final Set<String> f11191k = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public final Map<String, m> f11192l = new HashMap();

        /* renamed from: m  reason: collision with root package name */
        private final Runnable f11193m = new C0789a();

        /* renamed from: n  reason: collision with root package name */
        private final Runnable f11194n = new b();

        /* renamed from: no.nordicsemi.android.support.v18.scanner.a$a$a  reason: collision with other inner class name */
        /* compiled from: BluetoothLeScannerCompat */
        class C0789a implements Runnable {
            C0789a() {
            }

            public void run() {
                if (!C0788a.this.f11185e) {
                    C0788a.this.e();
                    C0788a aVar = C0788a.this;
                    aVar.f11189i.postDelayed(this, aVar.f11187g.k());
                }
            }
        }

        /* renamed from: no.nordicsemi.android.support.v18.scanner.a$a$b */
        /* compiled from: BluetoothLeScannerCompat */
        class b implements Runnable {

            /* renamed from: no.nordicsemi.android.support.v18.scanner.a$a$b$a  reason: collision with other inner class name */
            /* compiled from: BluetoothLeScannerCompat */
            class C0790a implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ m f11197g;

                C0790a(m mVar) {
                    this.f11197g = mVar;
                }

                public void run() {
                    C0788a.this.f11188h.c(4, this.f11197g);
                }
            }

            b() {
            }

            public void run() {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (C0788a.this.a) {
                    Iterator it = C0788a.this.f11192l.values().iterator();
                    while (it.hasNext()) {
                        m mVar = (m) it.next();
                        if (mVar.d() < elapsedRealtimeNanos - C0788a.this.f11187g.d()) {
                            it.remove();
                            C0788a.this.f11189i.post(new C0790a(mVar));
                        }
                    }
                    if (!C0788a.this.f11192l.isEmpty()) {
                        C0788a.this.f11189i.postDelayed(this, C0788a.this.f11187g.e());
                    }
                }
            }
        }

        C0788a(boolean z, boolean z2, List<k> list, n nVar, j jVar, Handler handler) {
            this.f11186f = Collections.unmodifiableList(list);
            this.f11187g = nVar;
            this.f11188h = jVar;
            this.f11189i = handler;
            boolean z3 = false;
            this.f11185e = false;
            this.f11184d = nVar.b() != 1 && (!(Build.VERSION.SDK_INT >= 23) || !nVar.n());
            this.b = !list.isEmpty() && (!z2 || !nVar.o());
            long k2 = nVar.k();
            if (k2 > 0 && (!z || !nVar.m())) {
                z3 = true;
            }
            this.c = z3;
            if (z3) {
                handler.postDelayed(this.f11193m, k2);
            }
        }

        private boolean i(m mVar) {
            for (k k2 : this.f11186f) {
                if (k2.k(mVar)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f11185e = true;
            this.f11189i.removeCallbacksAndMessages((Object) null);
            synchronized (this.a) {
                this.f11192l.clear();
                this.f11191k.clear();
                this.f11190j.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.c && !this.f11185e) {
                synchronized (this.a) {
                    this.f11188h.a(new ArrayList(this.f11190j));
                    this.f11190j.clear();
                    this.f11191k.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i2) {
            this.f11188h.b(i2);
        }

        /* access modifiers changed from: package-private */
        public void g(int i2, m mVar) {
            boolean isEmpty;
            m put;
            if (this.f11185e) {
                return;
            }
            if (this.f11186f.isEmpty() || i(mVar)) {
                String address = mVar.a().getAddress();
                if (this.f11184d) {
                    synchronized (this.f11192l) {
                        isEmpty = this.f11192l.isEmpty();
                        put = this.f11192l.put(address, mVar);
                    }
                    if (put == null && (this.f11187g.b() & 2) > 0) {
                        this.f11188h.c(2, mVar);
                    }
                    if (isEmpty && (this.f11187g.b() & 4) > 0) {
                        this.f11189i.removeCallbacks(this.f11194n);
                        this.f11189i.postDelayed(this.f11194n, this.f11187g.e());
                    }
                } else if (this.c) {
                    synchronized (this.a) {
                        if (!this.f11191k.contains(address)) {
                            this.f11190j.add(mVar);
                            this.f11191k.add(address);
                        }
                    }
                } else {
                    this.f11188h.c(i2, mVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h(List<m> list) {
            if (!this.f11185e) {
                if (this.b) {
                    ArrayList arrayList = new ArrayList();
                    for (m next : list) {
                        if (i(next)) {
                            arrayList.add(next);
                        }
                    }
                    list = arrayList;
                }
                this.f11188h.a(list);
            }
        }
    }

    a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            if (a != null) {
                a aVar = a;
                return aVar;
            } else if (Build.VERSION.SDK_INT >= 26) {
                e eVar = new e();
                a = eVar;
                return eVar;
            } else if (Build.VERSION.SDK_INT >= 23) {
                d dVar = new d();
                a = dVar;
                return dVar;
            } else if (Build.VERSION.SDK_INT >= 21) {
                c cVar = new c();
                a = cVar;
                return cVar;
            } else {
                b bVar = new b();
                a = bVar;
                return bVar;
            }
        }
    }

    public final void b(List<k> list, n nVar, j jVar) {
        if (jVar != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            if (list == null) {
                list = Collections.emptyList();
            }
            if (nVar == null) {
                nVar = new n.b().a();
            }
            c(list, nVar, jVar, handler);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    /* access modifiers changed from: package-private */
    public abstract void c(List<k> list, n nVar, j jVar, Handler handler);

    public final void d(j jVar) {
        if (jVar != null) {
            e(jVar);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    /* access modifiers changed from: package-private */
    public abstract void e(j jVar);
}
