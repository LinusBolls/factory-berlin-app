package e.u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import e.e.g;
import e.h.k.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Transition */
public abstract class m implements Cloneable {
    private static final int[] M = {2, 1, 3, 4};
    private static final g N = new a();
    private static ThreadLocal<e.e.a<Animator, d>> O = new ThreadLocal<>();
    private ArrayList<s> A;
    boolean B = false;
    ArrayList<Animator> C = new ArrayList<>();
    private int D = 0;
    private boolean E = false;
    private boolean F = false;
    private ArrayList<f> G = null;
    private ArrayList<Animator> H = new ArrayList<>();
    p I;
    private e J;
    private e.e.a<String, String> K;
    private g L = N;

    /* renamed from: g  reason: collision with root package name */
    private String f8919g = getClass().getName();

    /* renamed from: h  reason: collision with root package name */
    private long f8920h = -1;

    /* renamed from: i  reason: collision with root package name */
    long f8921i = -1;

    /* renamed from: j  reason: collision with root package name */
    private TimeInterpolator f8922j = null;

    /* renamed from: k  reason: collision with root package name */
    ArrayList<Integer> f8923k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<View> f8924l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<String> f8925m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<Class<?>> f8926n = null;
    private ArrayList<Integer> o = null;
    private ArrayList<View> p = null;
    private ArrayList<Class<?>> q = null;
    private ArrayList<String> r = null;
    private ArrayList<Integer> s = null;
    private ArrayList<View> t = null;
    private ArrayList<Class<?>> u = null;
    private t v = new t();
    private t w = new t();
    q x = null;
    private int[] y = M;
    private ArrayList<s> z;

    /* compiled from: Transition */
    static class a extends g {
        a() {
        }

        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* compiled from: Transition */
    class b extends AnimatorListenerAdapter {
        final /* synthetic */ e.e.a a;

        b(e.e.a aVar) {
            this.a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            m.this.C.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            m.this.C.add(animator);
        }
    }

    /* compiled from: Transition */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            m.this.x();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition */
    private static class d {
        View a;
        String b;
        s c;

        /* renamed from: d  reason: collision with root package name */
        m0 f8927d;

        /* renamed from: e  reason: collision with root package name */
        m f8928e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.a = view;
            this.b = str;
            this.c = sVar;
            this.f8927d = m0Var;
            this.f8928e = mVar;
        }
    }

    /* compiled from: Transition */
    public static abstract class e {
    }

    /* compiled from: Transition */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static e.e.a<Animator, d> F() {
        e.e.a<Animator, d> aVar = O.get();
        if (aVar != null) {
            return aVar;
        }
        e.e.a<Animator, d> aVar2 = new e.e.a<>();
        O.set(aVar2);
        return aVar2;
    }

    private static boolean R(s sVar, s sVar2, String str) {
        Object obj = sVar.a.get(str);
        Object obj2 = sVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void S(e.e.a<View, s> aVar, e.e.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && Q(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && Q(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.z.add(sVar);
                    this.A.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void T(e.e.a<View, s> aVar, e.e.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i2 = aVar.i(size);
            if (i2 != null && Q(i2) && (remove = aVar2.remove(i2)) != null && Q(remove.b)) {
                this.z.add(aVar.k(size));
                this.A.add(remove);
            }
        }
    }

    private void U(e.e.a<View, s> aVar, e.e.a<View, s> aVar2, e.e.d<View> dVar, e.e.d<View> dVar2) {
        View h2;
        int v2 = dVar.v();
        for (int i2 = 0; i2 < v2; i2++) {
            View w2 = dVar.w(i2);
            if (w2 != null && Q(w2) && (h2 = dVar2.h(dVar.r(i2))) != null && Q(h2)) {
                s sVar = aVar.get(w2);
                s sVar2 = aVar2.get(h2);
                if (!(sVar == null || sVar2 == null)) {
                    this.z.add(sVar);
                    this.A.add(sVar2);
                    aVar.remove(w2);
                    aVar2.remove(h2);
                }
            }
        }
    }

    private void V(e.e.a<View, s> aVar, e.e.a<View, s> aVar2, e.e.a<String, View> aVar3, e.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View m2 = aVar3.m(i2);
            if (m2 != null && Q(m2) && (view = aVar4.get(aVar3.i(i2))) != null && Q(view)) {
                s sVar = aVar.get(m2);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.z.add(sVar);
                    this.A.add(sVar2);
                    aVar.remove(m2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void W(t tVar, t tVar2) {
        e.e.a aVar = new e.e.a((g) tVar.a);
        e.e.a aVar2 = new e.e.a((g) tVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.y;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    T(aVar, aVar2);
                } else if (i3 == 2) {
                    V(aVar, aVar2, tVar.f8931d, tVar2.f8931d);
                } else if (i3 == 3) {
                    S(aVar, aVar2, tVar.b, tVar2.b);
                } else if (i3 == 4) {
                    U(aVar, aVar2, tVar.c, tVar2.c);
                }
                i2++;
            } else {
                e(aVar, aVar2);
                return;
            }
        }
    }

    private void d0(Animator animator, e.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            g(animator);
        }
    }

    private void e(e.e.a<View, s> aVar, e.e.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s m2 = aVar.m(i2);
            if (Q(m2.b)) {
                this.z.add(m2);
                this.A.add((Object) null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s m3 = aVar2.m(i3);
            if (Q(m3.b)) {
                this.A.add(m3);
                this.z.add((Object) null);
            }
        }
    }

    private static void f(t tVar, View view, s sVar) {
        tVar.a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.b.indexOfKey(id) >= 0) {
                tVar.b.put(id, (Object) null);
            } else {
                tVar.b.put(id, view);
            }
        }
        String D2 = u.D(view);
        if (D2 != null) {
            if (tVar.f8931d.containsKey(D2)) {
                tVar.f8931d.put(D2, null);
            } else {
                tVar.f8931d.put(D2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.c.p(itemIdAtPosition) >= 0) {
                    View h2 = tVar.c.h(itemIdAtPosition);
                    if (h2 != null) {
                        u.n0(h2, false);
                        tVar.c.s(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                u.n0(view, true);
                tVar.c.s(itemIdAtPosition, view);
            }
        }
    }

    private void m(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.o;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.p;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.q;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (!this.q.get(i2).isInstance(view)) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s(view);
                        if (z2) {
                            r(sVar);
                        } else {
                            h(sVar);
                        }
                        sVar.c.add(this);
                        p(sVar);
                        if (z2) {
                            f(this.v, view, sVar);
                        } else {
                            f(this.w, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.s;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.t;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.u;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        if (!this.u.get(i3).isInstance(view)) {
                                            i3++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    m(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public TimeInterpolator A() {
        return this.f8922j;
    }

    /* access modifiers changed from: package-private */
    public s B(View view, boolean z2) {
        q qVar = this.x;
        if (qVar != null) {
            return qVar.B(view, z2);
        }
        ArrayList<s> arrayList = z2 ? this.z : this.A;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s sVar = arrayList.get(i3);
            if (sVar == null) {
                return null;
            }
            if (sVar.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.A : this.z).get(i2);
    }

    public String C() {
        return this.f8919g;
    }

    public g D() {
        return this.L;
    }

    public p E() {
        return this.I;
    }

    public long G() {
        return this.f8920h;
    }

    public List<Integer> H() {
        return this.f8923k;
    }

    public List<String> I() {
        return this.f8925m;
    }

    public List<Class<?>> J() {
        return this.f8926n;
    }

    public List<View> M() {
        return this.f8924l;
    }

    public String[] N() {
        return null;
    }

    public s O(View view, boolean z2) {
        q qVar = this.x;
        if (qVar != null) {
            return qVar.O(view, z2);
        }
        return (z2 ? this.v : this.w).a.get(view);
    }

    public boolean P(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] N2 = N();
        if (N2 != null) {
            int length = N2.length;
            int i2 = 0;
            while (i2 < length) {
                if (!R(sVar, sVar2, N2[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String R : sVar.a.keySet()) {
            if (R(sVar, sVar2, R)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean Q(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.o;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.p;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.q;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.q.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.r != null && u.D(view) != null && this.r.contains(u.D(view))) {
            return false;
        }
        if ((this.f8923k.size() == 0 && this.f8924l.size() == 0 && (((arrayList = this.f8926n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f8925m) == null || arrayList2.isEmpty()))) || this.f8923k.contains(Integer.valueOf(id)) || this.f8924l.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f8925m;
        if (arrayList6 != null && arrayList6.contains(u.D(view))) {
            return true;
        }
        if (this.f8926n != null) {
            for (int i3 = 0; i3 < this.f8926n.size(); i3++) {
                if (this.f8926n.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void X(View view) {
        if (!this.F) {
            e.e.a<Animator, d> F2 = F();
            int size = F2.size();
            m0 d2 = c0.d(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d m2 = F2.m(i2);
                if (m2.a != null && d2.equals(m2.f8927d)) {
                    a.b(F2.i(i2));
                }
            }
            ArrayList<f> arrayList = this.G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.G.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            this.E = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void Y(ViewGroup viewGroup) {
        d dVar;
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        W(this.v, this.w);
        e.e.a<Animator, d> F2 = F();
        int size = F2.size();
        m0 d2 = c0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator i3 = F2.i(i2);
            if (!(i3 == null || (dVar = F2.get(i3)) == null || dVar.a == null || !d2.equals(dVar.f8927d))) {
                s sVar = dVar.c;
                View view = dVar.a;
                s O2 = O(view, true);
                s B2 = B(view, true);
                if (O2 == null && B2 == null) {
                    B2 = this.w.a.get(view);
                }
                if (!(O2 == null && B2 == null) && dVar.f8928e.P(sVar, B2)) {
                    if (i3.isRunning() || i3.isStarted()) {
                        i3.cancel();
                    } else {
                        F2.remove(i3);
                    }
                }
            }
        }
        w(viewGroup, this.v, this.w, this.z, this.A);
        e0();
    }

    public m a0(f fVar) {
        ArrayList<f> arrayList = this.G;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.G.size() == 0) {
            this.G = null;
        }
        return this;
    }

    public m b0(View view) {
        this.f8924l.remove(view);
        return this;
    }

    public m c(f fVar) {
        if (this.G == null) {
            this.G = new ArrayList<>();
        }
        this.G.add(fVar);
        return this;
    }

    public void c0(View view) {
        if (this.E) {
            if (!this.F) {
                e.e.a<Animator, d> F2 = F();
                int size = F2.size();
                m0 d2 = c0.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d m2 = F2.m(i2);
                    if (m2.a != null && d2.equals(m2.f8927d)) {
                        a.c(F2.i(i2));
                    }
                }
                ArrayList<f> arrayList = this.G;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.G.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).d(this);
                    }
                }
            }
            this.E = false;
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.C.get(size).cancel();
        }
        ArrayList<f> arrayList = this.G;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.G.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).b(this);
            }
        }
    }

    public m d(View view) {
        this.f8924l.add(view);
        return this;
    }

    /* access modifiers changed from: protected */
    public void e0() {
        o0();
        e.e.a<Animator, d> F2 = F();
        Iterator<Animator> it = this.H.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (F2.containsKey(next)) {
                o0();
                d0(next, F2);
            }
        }
        this.H.clear();
        x();
    }

    public m f0(long j2) {
        this.f8921i = j2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void g(Animator animator) {
        if (animator == null) {
            x();
            return;
        }
        if (y() >= 0) {
            animator.setDuration(y());
        }
        if (G() >= 0) {
            animator.setStartDelay(G() + animator.getStartDelay());
        }
        if (A() != null) {
            animator.setInterpolator(A());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void g0(e eVar) {
        this.J = eVar;
    }

    public abstract void h(s sVar);

    public m h0(TimeInterpolator timeInterpolator) {
        this.f8922j = timeInterpolator;
        return this;
    }

    public void j0(g gVar) {
        if (gVar == null) {
            this.L = N;
        } else {
            this.L = gVar;
        }
    }

    public void k0(p pVar) {
        this.I = pVar;
    }

    public m m0(long j2) {
        this.f8920h = j2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void o0() {
        if (this.D == 0) {
            ArrayList<f> arrayList = this.G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.G.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.F = false;
        }
        this.D++;
    }

    /* access modifiers changed from: package-private */
    public void p(s sVar) {
        String[] b2;
        if (this.I != null && !sVar.a.isEmpty() && (b2 = this.I.b()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= b2.length) {
                    z2 = true;
                    break;
                } else if (!sVar.a.containsKey(b2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.I.a(sVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String p0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f8921i != -1) {
            str2 = str2 + "dur(" + this.f8921i + ") ";
        }
        if (this.f8920h != -1) {
            str2 = str2 + "dly(" + this.f8920h + ") ";
        }
        if (this.f8922j != null) {
            str2 = str2 + "interp(" + this.f8922j + ") ";
        }
        if (this.f8923k.size() <= 0 && this.f8924l.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f8923k.size() > 0) {
            for (int i2 = 0; i2 < this.f8923k.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f8923k.get(i2);
            }
        }
        if (this.f8924l.size() > 0) {
            for (int i3 = 0; i3 < this.f8924l.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f8924l.get(i3);
            }
        }
        return str3 + ")";
    }

    public abstract void r(s sVar);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, boolean z2) {
        e.e.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        t(z2);
        if ((this.f8923k.size() > 0 || this.f8924l.size() > 0) && (((arrayList = this.f8925m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f8926n) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f8923k.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f8923k.get(i2).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z2) {
                        r(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.c.add(this);
                    p(sVar);
                    if (z2) {
                        f(this.v, findViewById, sVar);
                    } else {
                        f(this.w, findViewById, sVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f8924l.size(); i3++) {
                View view = this.f8924l.get(i3);
                s sVar2 = new s(view);
                if (z2) {
                    r(sVar2);
                } else {
                    h(sVar2);
                }
                sVar2.c.add(this);
                p(sVar2);
                if (z2) {
                    f(this.v, view, sVar2);
                } else {
                    f(this.w, view, sVar2);
                }
            }
        } else {
            m(viewGroup, z2);
        }
        if (!z2 && (aVar = this.K) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.v.f8931d.remove(this.K.i(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.v.f8931d.put(this.K.m(i5), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(boolean z2) {
        if (z2) {
            this.v.a.clear();
            this.v.b.clear();
            this.v.c.d();
            return;
        }
        this.w.a.clear();
        this.w.b.clear();
        this.w.c.d();
    }

    public String toString() {
        return p0("");
    }

    /* renamed from: u */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.H = new ArrayList<>();
            mVar.v = new t();
            mVar.w = new t();
            mVar.z = null;
            mVar.A = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator v(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void w(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i2;
        int i3;
        Animator v2;
        View view;
        Animator animator;
        s sVar;
        s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        e.e.a<Animator, d> F2 = F();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            s sVar3 = arrayList.get(i4);
            s sVar4 = arrayList2.get(i4);
            if (sVar3 != null && !sVar3.c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || P(sVar3, sVar4)) && (v2 = v(viewGroup2, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.b;
                        String[] N2 = N();
                        if (N2 != null && N2.length > 0) {
                            sVar2 = new s(view);
                            Animator animator3 = v2;
                            i3 = size;
                            s sVar5 = tVar2.a.get(view);
                            if (sVar5 != null) {
                                int i5 = 0;
                                while (i5 < N2.length) {
                                    sVar2.a.put(N2[i5], sVar5.a.get(N2[i5]));
                                    i5++;
                                    ArrayList<s> arrayList3 = arrayList2;
                                    i4 = i4;
                                    sVar5 = sVar5;
                                }
                            }
                            i2 = i4;
                            int size2 = F2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = F2.get(F2.i(i6));
                                if (dVar.c != null && dVar.a == view && dVar.b.equals(C()) && dVar.c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i3 = size;
                            i2 = i4;
                            animator2 = v2;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = sVar3.b;
                        animator = v2;
                        sVar = null;
                    }
                    if (animator != null) {
                        p pVar = this.I;
                        if (pVar != null) {
                            long c2 = pVar.c(viewGroup2, this, sVar3, sVar4);
                            sparseIntArray.put(this.H.size(), (int) c2);
                            j2 = Math.min(c2, j2);
                        }
                        F2.put(animator, new d(view, C(), this, c0.d(viewGroup), sVar));
                        this.H.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.H.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j2) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        int i2 = this.D - 1;
        this.D = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.G.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).e(this);
                }
            }
            for (int i4 = 0; i4 < this.v.c.v(); i4++) {
                View w2 = this.v.c.w(i4);
                if (w2 != null) {
                    u.n0(w2, false);
                }
            }
            for (int i5 = 0; i5 < this.w.c.v(); i5++) {
                View w3 = this.w.c.w(i5);
                if (w3 != null) {
                    u.n0(w3, false);
                }
            }
            this.F = true;
        }
    }

    public long y() {
        return this.f8921i;
    }

    public e z() {
        return this.J;
    }
}
