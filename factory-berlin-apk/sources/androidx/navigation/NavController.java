package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.navigation.o;
import androidx.navigation.u;
import androidx.navigation.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {
    private final Context a;
    private Activity b;
    private t c;

    /* renamed from: d  reason: collision with root package name */
    q f1046d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f1047e;

    /* renamed from: f  reason: collision with root package name */
    private Parcelable[] f1048f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1049g;

    /* renamed from: h  reason: collision with root package name */
    final Deque<i> f1050h = new ArrayDeque();

    /* renamed from: i  reason: collision with root package name */
    private v f1051i;

    /* renamed from: j  reason: collision with root package name */
    private k f1052j;

    /* renamed from: k  reason: collision with root package name */
    private y f1053k = new y();

    /* renamed from: l  reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f1054l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private final u f1055m = new t() {
        public void d(v vVar, p.a aVar) {
            NavController navController = NavController.this;
            if (navController.f1046d != null) {
                for (i h2 : navController.f1050h) {
                    h2.h(aVar);
                }
            }
        }
    };

    /* renamed from: n  reason: collision with root package name */
    private final androidx.activity.b f1056n = new a(false);
    private boolean o = true;

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        public void b() {
            NavController.this.v();
        }
    }

    public interface b {
        void a(NavController navController, o oVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        y yVar = this.f1053k;
        yVar.a(new r(yVar));
        this.f1053k.a(new b(this.a));
    }

    private void H() {
        androidx.activity.b bVar = this.f1056n;
        boolean z = true;
        if (!this.o || i() <= 1) {
            z = false;
        }
        bVar.f(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:5:0x002d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b() {
        /*
            r10 = this;
        L_0x0000:
            java.util.Deque<androidx.navigation.i> r0 = r10.f1050h
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0030
            java.util.Deque<androidx.navigation.i> r0 = r10.f1050h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.i r0 = (androidx.navigation.i) r0
            androidx.navigation.o r0 = r0.e()
            boolean r0 = r0 instanceof androidx.navigation.q
            if (r0 == 0) goto L_0x0030
            java.util.Deque<androidx.navigation.i> r0 = r10.f1050h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.i r0 = (androidx.navigation.i) r0
            androidx.navigation.o r0 = r0.e()
            int r0 = r0.m()
            boolean r0 = r10.x(r0, r1)
            if (r0 == 0) goto L_0x0030
            goto L_0x0000
        L_0x0030:
            java.util.Deque<androidx.navigation.i> r0 = r10.f1050h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0110
            java.util.Deque<androidx.navigation.i> r0 = r10.f1050h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.i r0 = (androidx.navigation.i) r0
            androidx.navigation.o r0 = r0.e()
            r2 = 0
            boolean r3 = r0 instanceof androidx.navigation.c
            if (r3 == 0) goto L_0x0068
            java.util.Deque<androidx.navigation.i> r3 = r10.f1050h
            java.util.Iterator r3 = r3.descendingIterator()
        L_0x004f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r3.next()
            androidx.navigation.i r4 = (androidx.navigation.i) r4
            androidx.navigation.o r4 = r4.e()
            boolean r5 = r4 instanceof androidx.navigation.q
            if (r5 != 0) goto L_0x004f
            boolean r5 = r4 instanceof androidx.navigation.c
            if (r5 != 0) goto L_0x004f
            r2 = r4
        L_0x0068:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Deque<androidx.navigation.i> r4 = r10.f1050h
            java.util.Iterator r4 = r4.descendingIterator()
        L_0x0073:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c7
            java.lang.Object r5 = r4.next()
            androidx.navigation.i r5 = (androidx.navigation.i) r5
            androidx.lifecycle.p$b r6 = r5.f()
            androidx.navigation.o r7 = r5.e()
            if (r0 == 0) goto L_0x009f
            int r8 = r7.m()
            int r9 = r0.m()
            if (r8 != r9) goto L_0x009f
            androidx.lifecycle.p$b r7 = androidx.lifecycle.p.b.RESUMED
            if (r6 == r7) goto L_0x009a
            r3.put(r5, r7)
        L_0x009a:
            androidx.navigation.q r0 = r0.o()
            goto L_0x0073
        L_0x009f:
            if (r2 == 0) goto L_0x00c1
            int r7 = r7.m()
            int r8 = r2.m()
            if (r7 != r8) goto L_0x00c1
            androidx.lifecycle.p$b r7 = androidx.lifecycle.p.b.RESUMED
            if (r6 != r7) goto L_0x00b5
            androidx.lifecycle.p$b r6 = androidx.lifecycle.p.b.STARTED
            r5.l(r6)
            goto L_0x00bc
        L_0x00b5:
            androidx.lifecycle.p$b r7 = androidx.lifecycle.p.b.STARTED
            if (r6 == r7) goto L_0x00bc
            r3.put(r5, r7)
        L_0x00bc:
            androidx.navigation.q r2 = r2.o()
            goto L_0x0073
        L_0x00c1:
            androidx.lifecycle.p$b r6 = androidx.lifecycle.p.b.CREATED
            r5.l(r6)
            goto L_0x0073
        L_0x00c7:
            java.util.Deque<androidx.navigation.i> r0 = r10.f1050h
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r0.next()
            androidx.navigation.i r2 = (androidx.navigation.i) r2
            java.lang.Object r4 = r3.get(r2)
            androidx.lifecycle.p$b r4 = (androidx.lifecycle.p.b) r4
            if (r4 == 0) goto L_0x00e5
            r2.l(r4)
            goto L_0x00cd
        L_0x00e5:
            r2.m()
            goto L_0x00cd
        L_0x00e9:
            java.util.Deque<androidx.navigation.i> r0 = r10.f1050h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.i r0 = (androidx.navigation.i) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$b> r2 = r10.f1054l
            java.util.Iterator r2 = r2.iterator()
        L_0x00f7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x010f
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavController$b r3 = (androidx.navigation.NavController.b) r3
            androidx.navigation.o r4 = r0.e()
            android.os.Bundle r5 = r0.b()
            r3.a(r10, r4, r5)
            goto L_0x00f7
        L_0x010f:
            return r1
        L_0x0110:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.b():boolean");
    }

    private String e(int[] iArr) {
        q qVar;
        q qVar2 = this.f1046d;
        int i2 = 0;
        while (true) {
            o oVar = null;
            if (i2 >= iArr.length) {
                return null;
            }
            int i3 = iArr[i2];
            if (i2 != 0) {
                oVar = qVar2.F(i3);
            } else if (this.f1046d.m() == i3) {
                oVar = this.f1046d;
            }
            if (oVar == null) {
                return o.l(this.a, i3);
            }
            if (i2 != iArr.length - 1) {
                while (true) {
                    qVar = (q) oVar;
                    if (!(qVar.F(qVar.K()) instanceof q)) {
                        break;
                    }
                    oVar = qVar.F(qVar.K());
                }
                qVar2 = qVar;
            }
            i2++;
        }
    }

    private int i() {
        int i2 = 0;
        for (i e2 : this.f1050h) {
            if (!(e2.e() instanceof q)) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031 A[LOOP:0: B:10:0x0031->B:15:0x005d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(androidx.navigation.o r11, android.os.Bundle r12, androidx.navigation.u r13, androidx.navigation.x.a r14) {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0017
            int r1 = r13.e()
            r2 = -1
            if (r1 == r2) goto L_0x0017
            int r1 = r13.e()
            boolean r2 = r13.f()
            boolean r1 = r10.x(r1, r2)
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            androidx.navigation.y r2 = r10.f1053k
            java.lang.String r3 = r11.n()
            androidx.navigation.x r2 = r2.d(r3)
            android.os.Bundle r9 = r11.e(r12)
            androidx.navigation.o r11 = r2.b(r11, r9, r13, r14)
            r14 = 1
            if (r11 == 0) goto L_0x00c2
            boolean r12 = r11 instanceof androidx.navigation.c
            if (r12 != 0) goto L_0x0060
        L_0x0031:
            java.util.Deque<androidx.navigation.i> r12 = r10.f1050h
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x0060
            java.util.Deque<androidx.navigation.i> r12 = r10.f1050h
            java.lang.Object r12 = r12.peekLast()
            androidx.navigation.i r12 = (androidx.navigation.i) r12
            androidx.navigation.o r12 = r12.e()
            boolean r12 = r12 instanceof androidx.navigation.c
            if (r12 == 0) goto L_0x0060
            java.util.Deque<androidx.navigation.i> r12 = r10.f1050h
            java.lang.Object r12 = r12.peekLast()
            androidx.navigation.i r12 = (androidx.navigation.i) r12
            androidx.navigation.o r12 = r12.e()
            int r12 = r12.m()
            boolean r12 = r10.x(r12, r14)
            if (r12 == 0) goto L_0x0060
            goto L_0x0031
        L_0x0060:
            java.util.Deque<androidx.navigation.i> r12 = r10.f1050h
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x007c
            androidx.navigation.i r12 = new androidx.navigation.i
            android.content.Context r4 = r10.a
            androidx.navigation.q r5 = r10.f1046d
            androidx.lifecycle.v r7 = r10.f1051i
            androidx.navigation.k r8 = r10.f1052j
            r3 = r12
            r6 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<androidx.navigation.i> r13 = r10.f1050h
            r13.add(r12)
        L_0x007c:
            java.util.ArrayDeque r12 = new java.util.ArrayDeque
            r12.<init>()
            r13 = r11
        L_0x0082:
            if (r13 == 0) goto L_0x00a6
            int r14 = r13.m()
            androidx.navigation.o r14 = r10.d(r14)
            if (r14 != 0) goto L_0x00a6
            androidx.navigation.q r13 = r13.o()
            if (r13 == 0) goto L_0x0082
            androidx.navigation.i r14 = new androidx.navigation.i
            android.content.Context r4 = r10.a
            androidx.lifecycle.v r7 = r10.f1051i
            androidx.navigation.k r8 = r10.f1052j
            r3 = r14
            r5 = r13
            r6 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r12.addFirst(r14)
            goto L_0x0082
        L_0x00a6:
            java.util.Deque<androidx.navigation.i> r13 = r10.f1050h
            r13.addAll(r12)
            androidx.navigation.i r12 = new androidx.navigation.i
            android.content.Context r4 = r10.a
            android.os.Bundle r6 = r11.e(r9)
            androidx.lifecycle.v r7 = r10.f1051i
            androidx.navigation.k r8 = r10.f1052j
            r3 = r12
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<androidx.navigation.i> r13 = r10.f1050h
            r13.add(r12)
            goto L_0x00d8
        L_0x00c2:
            if (r13 == 0) goto L_0x00d8
            boolean r13 = r13.g()
            if (r13 == 0) goto L_0x00d8
            java.util.Deque<androidx.navigation.i> r13 = r10.f1050h
            java.lang.Object r13 = r13.peekLast()
            androidx.navigation.i r13 = (androidx.navigation.i) r13
            if (r13 == 0) goto L_0x00d7
            r13.j(r12)
        L_0x00d7:
            r0 = 1
        L_0x00d8:
            r10.H()
            if (r1 != 0) goto L_0x00e1
            if (r11 != 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00e4
        L_0x00e1:
            r10.b()
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.r(androidx.navigation.o, android.os.Bundle, androidx.navigation.u, androidx.navigation.x$a):void");
    }

    private void u(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f1047e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                x d2 = this.f1053k.d(next);
                Bundle bundle3 = this.f1047e.getBundle(next);
                if (bundle3 != null) {
                    d2.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f1048f;
        boolean z = false;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i2 = 0;
            while (i2 < length) {
                j jVar = (j) parcelableArr[i2];
                o d3 = d(jVar.b());
                if (d3 != null) {
                    Bundle a2 = jVar.a();
                    if (a2 != null) {
                        a2.setClassLoader(this.a.getClassLoader());
                    }
                    this.f1050h.add(new i(this.a, d3, a2, this.f1051i, this.f1052j, jVar.d(), jVar.c()));
                    i2++;
                } else {
                    String l2 = o.l(this.a, jVar.b());
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + l2 + " cannot be found from the current destination " + h());
                }
            }
            H();
            this.f1048f = null;
        }
        if (this.f1046d == null || !this.f1050h.isEmpty()) {
            b();
            return;
        }
        if (!this.f1049g && (activity = this.b) != null && m(activity.getIntent())) {
            z = true;
        }
        if (!z) {
            r(this.f1046d, bundle, (u) null, (x.a) null);
        }
    }

    public Bundle A() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f1053k.e().entrySet()) {
            String str = (String) next.getKey();
            Bundle d2 = ((x) next.getValue()).d();
            if (d2 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, d2);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f1050h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f1050h.size()];
            int i2 = 0;
            for (i jVar : this.f1050h) {
                parcelableArr[i2] = new j(jVar);
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f1049g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f1049g);
        }
        return bundle;
    }

    public void B(int i2) {
        C(i2, (Bundle) null);
    }

    public void C(int i2, Bundle bundle) {
        D(k().c(i2), bundle);
    }

    public void D(q qVar, Bundle bundle) {
        q qVar2 = this.f1046d;
        if (qVar2 != null) {
            x(qVar2.m(), true);
        }
        this.f1046d = qVar;
        u(bundle);
    }

    /* access modifiers changed from: package-private */
    public void E(v vVar) {
        this.f1051i = vVar;
        vVar.a().a(this.f1055m);
    }

    /* access modifiers changed from: package-private */
    public void F(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f1051i != null) {
            this.f1056n.d();
            onBackPressedDispatcher.a(this.f1051i, this.f1056n);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    /* access modifiers changed from: package-private */
    public void G(r0 r0Var) {
        if (this.f1050h.isEmpty()) {
            this.f1052j = k.s(r0Var);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }

    public void a(b bVar) {
        if (!this.f1050h.isEmpty()) {
            i peekLast = this.f1050h.peekLast();
            bVar.a(this, peekLast.e(), peekLast.b());
        }
        this.f1054l.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        this.o = z;
        H();
    }

    /* access modifiers changed from: package-private */
    public o d(int i2) {
        o oVar;
        q qVar;
        q qVar2 = this.f1046d;
        if (qVar2 == null) {
            return null;
        }
        if (qVar2.m() == i2) {
            return this.f1046d;
        }
        if (this.f1050h.isEmpty()) {
            oVar = this.f1046d;
        } else {
            oVar = this.f1050h.getLast().e();
        }
        if (oVar instanceof q) {
            qVar = (q) oVar;
        } else {
            qVar = oVar.o();
        }
        return qVar.F(i2);
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.a;
    }

    public i g() {
        if (this.f1050h.isEmpty()) {
            return null;
        }
        return this.f1050h.getLast();
    }

    public o h() {
        i g2 = g();
        if (g2 != null) {
            return g2.e();
        }
        return null;
    }

    public q j() {
        q qVar = this.f1046d;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public t k() {
        if (this.c == null) {
            this.c = new t(this.a, this.f1053k);
        }
        return this.c;
    }

    public y l() {
        return this.f1053k;
    }

    public boolean m(Intent intent) {
        q qVar;
        o.a q;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (!((intArray != null && intArray.length != 0) || intent.getData() == null || (q = this.f1046d.q(new n(intent))) == null)) {
            intArray = q.f().g();
            bundle.putAll(q.h());
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String e2 = e(intArray);
        if (e2 != null) {
            Log.i("NavController", "Could not find destination " + e2 + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i2 = 268435456 & flags;
        if (i2 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            androidx.core.app.p i3 = androidx.core.app.p.i(this.a);
            i3.d(intent);
            i3.n();
            Activity activity = this.b;
            if (activity != null) {
                activity.finish();
                this.b.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i2 != 0) {
            if (!this.f1050h.isEmpty()) {
                x(this.f1046d.m(), true);
            }
            int i4 = 0;
            while (i4 < intArray.length) {
                int i5 = i4 + 1;
                int i6 = intArray[i4];
                o d2 = d(i6);
                if (d2 != null) {
                    u.a aVar = new u.a();
                    aVar.b(0);
                    aVar.c(0);
                    r(d2, bundle, aVar.a(), (x.a) null);
                    i4 = i5;
                } else {
                    String l2 = o.l(this.a, i6);
                    throw new IllegalStateException("Deep Linking failed: destination " + l2 + " cannot be found from the current destination " + h());
                }
            }
            return true;
        } else {
            q qVar2 = this.f1046d;
            int i7 = 0;
            while (i7 < intArray.length) {
                int i8 = intArray[i7];
                o F = i7 == 0 ? this.f1046d : qVar2.F(i8);
                if (F != null) {
                    if (i7 != intArray.length - 1) {
                        while (true) {
                            qVar = (q) F;
                            if (!(qVar.F(qVar.K()) instanceof q)) {
                                break;
                            }
                            F = qVar.F(qVar.K());
                        }
                        qVar2 = qVar;
                    } else {
                        Bundle e3 = F.e(bundle);
                        u.a aVar2 = new u.a();
                        aVar2.g(this.f1046d.m(), true);
                        aVar2.b(0);
                        aVar2.c(0);
                        r(F, e3, aVar2.a(), (x.a) null);
                    }
                    i7++;
                } else {
                    String l3 = o.l(this.a, i8);
                    throw new IllegalStateException("Deep Linking failed: destination " + l3 + " cannot be found in graph " + qVar2);
                }
            }
            this.f1049g = true;
            return true;
        }
    }

    public void n(int i2) {
        o(i2, (Bundle) null);
    }

    public void o(int i2, Bundle bundle) {
        p(i2, bundle, (u) null);
    }

    public void p(int i2, Bundle bundle, u uVar) {
        q(i2, bundle, uVar, (x.a) null);
    }

    public void q(int i2, Bundle bundle, u uVar, x.a aVar) {
        o oVar;
        int i3;
        if (this.f1050h.isEmpty()) {
            oVar = this.f1046d;
        } else {
            oVar = this.f1050h.getLast().e();
        }
        if (oVar != null) {
            d i4 = oVar.i(i2);
            Bundle bundle2 = null;
            if (i4 != null) {
                if (uVar == null) {
                    uVar = i4.c();
                }
                i3 = i4.b();
                Bundle a2 = i4.a();
                if (a2 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a2);
                }
            } else {
                i3 = i2;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i3 == 0 && uVar != null && uVar.e() != -1) {
                w(uVar.e(), uVar.f());
            } else if (i3 != 0) {
                o d2 = d(i3);
                if (d2 == null) {
                    String l2 = o.l(this.a, i3);
                    if (i4 != null) {
                        throw new IllegalArgumentException("Navigation destination " + l2 + " referenced from action " + o.l(this.a, i2) + " cannot be found from the current destination " + oVar);
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + l2 + " cannot be found from the current destination " + oVar);
                }
                r(d2, bundle2, uVar, aVar);
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    public void s(p pVar) {
        o(pVar.b(), pVar.a());
    }

    public boolean t() {
        if (i() != 1) {
            return v();
        }
        o h2 = h();
        int m2 = h2.m();
        for (q o2 = h2.o(); o2 != null; o2 = o2.o()) {
            if (o2.K() != m2) {
                Bundle bundle = new Bundle();
                Activity activity = this.b;
                if (!(activity == null || activity.getIntent() == null || this.b.getIntent().getData() == null)) {
                    bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.b.getIntent());
                    o.a q = this.f1046d.q(new n(this.b.getIntent()));
                    if (q != null) {
                        bundle.putAll(q.h());
                    }
                }
                m mVar = new m(this);
                mVar.e(o2.m());
                mVar.d(bundle);
                mVar.b().n();
                Activity activity2 = this.b;
                if (activity2 != null) {
                    activity2.finish();
                }
                return true;
            }
            m2 = o2.m();
        }
        return false;
    }

    public boolean v() {
        if (this.f1050h.isEmpty()) {
            return false;
        }
        return w(h().m(), true);
    }

    public boolean w(int i2, boolean z) {
        return x(i2, z) && b();
    }

    /* access modifiers changed from: package-private */
    public boolean x(int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f1050h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<i> descendingIterator = this.f1050h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            o e2 = descendingIterator.next().e();
            x d2 = this.f1053k.d(e2.n());
            if (z || e2.m() != i2) {
                arrayList.add(d2);
            }
            if (e2.m() == i2) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            String l2 = o.l(this.a, i2);
            Log.i("NavController", "Ignoring popBackStack to destination " + l2 + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((x) it.next()).e()) {
            i removeLast = this.f1050h.removeLast();
            removeLast.l(p.b.DESTROYED);
            k kVar = this.f1052j;
            if (kVar != null) {
                kVar.r(removeLast.f1070l);
            }
            z3 = true;
        }
        H();
        return z3;
    }

    public void y(b bVar) {
        this.f1054l.remove(bVar);
    }

    public void z(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.a.getClassLoader());
            this.f1047e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f1048f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f1049g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }
}
