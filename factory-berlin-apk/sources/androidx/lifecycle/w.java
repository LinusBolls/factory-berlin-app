package androidx.lifecycle;

import androidx.lifecycle.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry */
public class w extends p {
    private e.b.a.b.a<u, b> a = new e.b.a.b.a<>();
    private p.b b;
    private final WeakReference<v> c;

    /* renamed from: d  reason: collision with root package name */
    private int f1040d = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1041e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1042f = false;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<p.b> f1043g = new ArrayList<>();

    /* compiled from: LifecycleRegistry */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.p$b[] r0 = androidx.lifecycle.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                androidx.lifecycle.p$b r2 = androidx.lifecycle.p.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.p$b r3 = androidx.lifecycle.p.b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.p$b r4 = androidx.lifecycle.p.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.p$b r5 = androidx.lifecycle.p.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.p$b r6 = androidx.lifecycle.p.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.p$a[] r5 = androidx.lifecycle.p.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                a = r5
                androidx.lifecycle.p$a r6 = androidx.lifecycle.p.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.p$a r5 = androidx.lifecycle.p.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w.a.<clinit>():void");
        }
    }

    /* compiled from: LifecycleRegistry */
    static class b {
        p.b a;
        t b;

        b(u uVar, p.b bVar) {
            this.b = z.f(uVar);
            this.a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, p.a aVar) {
            p.b h2 = w.h(aVar);
            this.a = w.l(this.a, h2);
            this.b.d(vVar, aVar);
            this.a = h2;
        }
    }

    public w(v vVar) {
        this.c = new WeakReference<>(vVar);
        this.b = p.b.INITIALIZED;
    }

    private void d(v vVar) {
        Iterator<Map.Entry<u, b>> a2 = this.a.a();
        while (a2.hasNext() && !this.f1042f) {
            Map.Entry next = a2.next();
            b bVar = (b) next.getValue();
            while (bVar.a.compareTo(this.b) > 0 && !this.f1042f && this.a.contains(next.getKey())) {
                p.a f2 = f(bVar.a);
                o(h(f2));
                bVar.a(vVar, f2);
                n();
            }
        }
    }

    private p.b e(u uVar) {
        Map.Entry<u, b> m2 = this.a.m(uVar);
        p.b bVar = null;
        p.b bVar2 = m2 != null ? m2.getValue().a : null;
        if (!this.f1043g.isEmpty()) {
            ArrayList<p.b> arrayList = this.f1043g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.b, bVar2), bVar);
    }

    private static p.a f(p.b bVar) {
        int i2 = a.b[bVar.ordinal()];
        if (i2 == 1) {
            throw new IllegalArgumentException();
        } else if (i2 == 2) {
            return p.a.ON_DESTROY;
        } else {
            if (i2 == 3) {
                return p.a.ON_STOP;
            }
            if (i2 == 4) {
                return p.a.ON_PAUSE;
            }
            if (i2 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private void g(v vVar) {
        e.b.a.b.b<K, V>.d g2 = this.a.g();
        while (g2.hasNext() && !this.f1042f) {
            Map.Entry entry = (Map.Entry) g2.next();
            b bVar = (b) entry.getValue();
            while (bVar.a.compareTo(this.b) < 0 && !this.f1042f && this.a.contains(entry.getKey())) {
                o(bVar.a);
                bVar.a(vVar, r(bVar.a));
                n();
            }
        }
    }

    static p.b h(p.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return p.b.CREATED;
            case 3:
            case 4:
                return p.b.STARTED;
            case 5:
                return p.b.RESUMED;
            case 6:
                return p.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.a.size() == 0) {
            return true;
        }
        p.b bVar = this.a.d().getValue().a;
        p.b bVar2 = this.a.i().getValue().a;
        if (bVar == bVar2 && this.b == bVar2) {
            return true;
        }
        return false;
    }

    static p.b l(p.b bVar, p.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(p.b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.f1041e || this.f1040d != 0) {
                this.f1042f = true;
                return;
            }
            this.f1041e = true;
            q();
            this.f1041e = false;
        }
    }

    private void n() {
        ArrayList<p.b> arrayList = this.f1043g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(p.b bVar) {
        this.f1043g.add(bVar);
    }

    private void q() {
        v vVar = (v) this.c.get();
        if (vVar != null) {
            while (!j()) {
                this.f1042f = false;
                if (this.b.compareTo(this.a.d().getValue().a) < 0) {
                    d(vVar);
                }
                Map.Entry<u, b> i2 = this.a.i();
                if (!this.f1042f && i2 != null && this.b.compareTo(i2.getValue().a) > 0) {
                    g(vVar);
                }
            }
            this.f1042f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    private static p.a r(p.b bVar) {
        int i2 = a.b[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return p.a.ON_START;
            }
            if (i2 == 3) {
                return p.a.ON_RESUME;
            }
            if (i2 == 4) {
                throw new IllegalArgumentException();
            } else if (i2 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return p.a.ON_CREATE;
    }

    public void a(u uVar) {
        v vVar;
        p.b bVar = this.b;
        p.b bVar2 = p.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = p.b.INITIALIZED;
        }
        b bVar3 = new b(uVar, bVar2);
        if (this.a.k(uVar, bVar3) == null && (vVar = (v) this.c.get()) != null) {
            boolean z = this.f1040d != 0 || this.f1041e;
            p.b e2 = e(uVar);
            this.f1040d++;
            while (bVar3.a.compareTo(e2) < 0 && this.a.contains(uVar)) {
                o(bVar3.a);
                bVar3.a(vVar, r(bVar3.a));
                n();
                e2 = e(uVar);
            }
            if (!z) {
                q();
            }
            this.f1040d--;
        }
    }

    public p.b b() {
        return this.b;
    }

    public void c(u uVar) {
        this.a.l(uVar);
    }

    public void i(p.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(p.b bVar) {
        p(bVar);
    }

    public void p(p.b bVar) {
        m(bVar);
    }
}
