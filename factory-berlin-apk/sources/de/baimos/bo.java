package de.baimos;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import de.baimos.ca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class bo {
    private static bo a;

    static class a {
        final List<bx> a;
        final ca b;
        final bw c;

        /* renamed from: d  reason: collision with root package name */
        final Handler f8243d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final Object f8244e = new Object();

        /* renamed from: f  reason: collision with root package name */
        private final boolean f8245f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f8246g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f8247h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public boolean f8248i;

        /* renamed from: j  reason: collision with root package name */
        private final List<bz> f8249j = new ArrayList();

        /* renamed from: k  reason: collision with root package name */
        private final Set<String> f8250k = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public final Map<String, bz> f8251l = new HashMap();

        /* renamed from: m  reason: collision with root package name */
        private final Runnable f8252m = new Runnable() {
            public void run() {
                if (!a.this.f8248i) {
                    a.this.e();
                    a aVar = a.this;
                    aVar.f8243d.postDelayed(this, aVar.b.k());
                }
            }
        };

        /* renamed from: n  reason: collision with root package name */
        private final Runnable f8253n = new Runnable() {
            public void run() {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (a.this.f8244e) {
                    Iterator it = a.this.f8251l.values().iterator();
                    while (it.hasNext()) {
                        final bz bzVar = (bz) it.next();
                        if (bzVar.c() < elapsedRealtimeNanos - a.this.b.i()) {
                            it.remove();
                            a.this.f8243d.post(new Runnable() {
                                public void run() {
                                    a.this.c.a(4, bzVar);
                                }
                            });
                        }
                    }
                    if (!a.this.f8251l.isEmpty()) {
                        a.this.f8243d.postDelayed(this, a.this.b.j());
                    }
                }
            }
        };

        a(boolean z, boolean z2, List<bx> list, ca caVar, bw bwVar, Handler handler) {
            this.a = Collections.unmodifiableList(list);
            this.b = caVar;
            this.c = bwVar;
            this.f8243d = handler;
            boolean z3 = false;
            this.f8248i = false;
            this.f8247h = caVar.b() != 1 && (!(Build.VERSION.SDK_INT >= 23) || !caVar.g());
            this.f8245f = !list.isEmpty() && (!z2 || !caVar.e());
            long k2 = caVar.k();
            if (k2 > 0 && (!z || !caVar.f())) {
                z3 = true;
            }
            this.f8246g = z3;
            if (z3) {
                handler.postDelayed(this.f8252m, k2);
            }
        }

        private boolean b(bz bzVar) {
            for (bx a2 : this.a) {
                if (a2.a(bzVar)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f8248i = true;
            this.f8243d.removeCallbacksAndMessages((Object) null);
            synchronized (this.f8244e) {
                this.f8251l.clear();
                this.f8250k.clear();
                this.f8249j.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            this.c.a(i2);
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, bz bzVar) {
            boolean isEmpty;
            bz put;
            if (this.f8248i) {
                return;
            }
            if (this.a.isEmpty() || b(bzVar)) {
                String address = bzVar.a().getAddress();
                if (this.f8247h) {
                    synchronized (this.f8251l) {
                        isEmpty = this.f8251l.isEmpty();
                        put = this.f8251l.put(address, bzVar);
                    }
                    if (put == null && (this.b.b() & 2) > 0) {
                        this.c.a(2, bzVar);
                    }
                    if (isEmpty && (this.b.b() & 4) > 0) {
                        this.f8243d.removeCallbacks(this.f8253n);
                        this.f8243d.postDelayed(this.f8253n, this.b.j());
                    }
                } else if (this.f8246g) {
                    synchronized (this.f8244e) {
                        if (!this.f8250k.contains(address)) {
                            this.f8249j.add(bzVar);
                            this.f8250k.add(address);
                        }
                    }
                } else {
                    this.c.a(i2, bzVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(List<bz> list) {
            if (!this.f8248i) {
                if (this.f8245f) {
                    ArrayList arrayList = new ArrayList();
                    for (bz next : list) {
                        if (b(next)) {
                            arrayList.add(next);
                        }
                    }
                    list = arrayList;
                }
                this.c.a(list);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.f8246g && !this.f8248i) {
                synchronized (this.f8244e) {
                    this.c.a((List<bz>) new ArrayList(this.f8249j));
                    this.f8249j.clear();
                    this.f8250k.clear();
                }
            }
        }
    }

    bo() {
    }

    public static synchronized bo a() {
        synchronized (bo.class) {
            if (a != null) {
                bo boVar = a;
                return boVar;
            } else if (Build.VERSION.SDK_INT >= 26) {
                cb cbVar = new cb();
                a = cbVar;
                return cbVar;
            } else if (Build.VERSION.SDK_INT >= 23) {
                bs bsVar = new bs();
                a = bsVar;
                return bsVar;
            } else if (Build.VERSION.SDK_INT >= 21) {
                br brVar = new br();
                a = brVar;
                return brVar;
            } else {
                bq bqVar = new bq();
                a = bqVar;
                return bqVar;
            }
        }
    }

    public final void a(bw bwVar) {
        if (bwVar != null) {
            b(bwVar);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public final void a(List<bx> list, ca caVar, bw bwVar) {
        if (bwVar != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            if (list == null) {
                list = Collections.emptyList();
            }
            if (caVar == null) {
                caVar = new ca.a().a();
            }
            a(list, caVar, bwVar, handler);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    /* access modifiers changed from: package-private */
    public abstract void a(List<bx> list, ca caVar, bw bwVar, Handler handler);

    /* access modifiers changed from: package-private */
    public abstract void b(bw bwVar);
}
