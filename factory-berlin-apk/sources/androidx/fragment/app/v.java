package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.o;
import e.h.k.r;
import e.h.k.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition */
class v {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    private static final x b = (Build.VERSION.SDK_INT >= 21 ? new w() : null);
    private static final x c = x();

    /* compiled from: FragmentTransition */
    static class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f876g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f877h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f878i;

        a(g gVar, Fragment fragment, androidx.core.os.a aVar) {
            this.f876g = gVar;
            this.f877h = fragment;
            this.f878i = aVar;
        }

        public void run() {
            this.f876g.a(this.f877h, this.f878i);
        }
    }

    /* compiled from: FragmentTransition */
    static class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f879g;

        b(ArrayList arrayList) {
            this.f879g = arrayList;
        }

        public void run() {
            v.B(this.f879g, 4);
        }
    }

    /* compiled from: FragmentTransition */
    static class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f880g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f881h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f882i;

        c(g gVar, Fragment fragment, androidx.core.os.a aVar) {
            this.f880g = gVar;
            this.f881h = fragment;
            this.f882i = aVar;
        }

        public void run() {
            this.f880g.a(this.f881h, this.f882i);
        }
    }

    /* compiled from: FragmentTransition */
    static class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f883g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ x f884h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ View f885i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Fragment f886j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f887k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ArrayList f888l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f889m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Object f890n;

        d(Object obj, x xVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f883g = obj;
            this.f884h = xVar;
            this.f885i = view;
            this.f886j = fragment;
            this.f887k = arrayList;
            this.f888l = arrayList2;
            this.f889m = arrayList3;
            this.f890n = obj2;
        }

        public void run() {
            Object obj = this.f883g;
            if (obj != null) {
                this.f884h.p(obj, this.f885i);
                this.f888l.addAll(v.k(this.f884h, this.f883g, this.f886j, this.f887k, this.f885i));
            }
            if (this.f889m != null) {
                if (this.f890n != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f885i);
                    this.f884h.q(this.f890n, this.f889m, arrayList);
                }
                this.f889m.clear();
                this.f889m.add(this.f885i);
            }
        }
    }

    /* compiled from: FragmentTransition */
    static class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Fragment f891g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f892h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f893i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e.e.a f894j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ View f895k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ x f896l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Rect f897m;

        e(Fragment fragment, Fragment fragment2, boolean z, e.e.a aVar, View view, x xVar, Rect rect) {
            this.f891g = fragment;
            this.f892h = fragment2;
            this.f893i = z;
            this.f894j = aVar;
            this.f895k = view;
            this.f896l = xVar;
            this.f897m = rect;
        }

        public void run() {
            v.f(this.f891g, this.f892h, this.f893i, this.f894j, false);
            View view = this.f895k;
            if (view != null) {
                this.f896l.k(view, this.f897m);
            }
        }
    }

    /* compiled from: FragmentTransition */
    static class f implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ x f898g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.e.a f899h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f900i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h f901j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f902k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ View f903l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Fragment f904m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Fragment f905n;
        final /* synthetic */ boolean o;
        final /* synthetic */ ArrayList p;
        final /* synthetic */ Object q;
        final /* synthetic */ Rect r;

        f(x xVar, e.e.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f898g = xVar;
            this.f899h = aVar;
            this.f900i = obj;
            this.f901j = hVar;
            this.f902k = arrayList;
            this.f903l = view;
            this.f904m = fragment;
            this.f905n = fragment2;
            this.o = z;
            this.p = arrayList2;
            this.q = obj2;
            this.r = rect;
        }

        public void run() {
            e.e.a<String, View> h2 = v.h(this.f898g, this.f899h, this.f900i, this.f901j);
            if (h2 != null) {
                this.f902k.addAll(h2.values());
                this.f902k.add(this.f903l);
            }
            v.f(this.f904m, this.f905n, this.o, h2, false);
            Object obj = this.f900i;
            if (obj != null) {
                this.f898g.A(obj, this.p, this.f902k);
                View t = v.t(h2, this.f901j, this.q, this.o);
                if (t != null) {
                    this.f898g.k(t, this.r);
                }
            }
        }
    }

    /* compiled from: FragmentTransition */
    interface g {
        void a(Fragment fragment, androidx.core.os.a aVar);

        void b(Fragment fragment, androidx.core.os.a aVar);
    }

    /* compiled from: FragmentTransition */
    static class h {
        public Fragment a;
        public boolean b;
        public a c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f906d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f907e;

        /* renamed from: f  reason: collision with root package name */
        public a f908f;

        h() {
        }
    }

    private static void A(x xVar, Object obj, Object obj2, e.e.a<String, View> aVar, boolean z, a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f870n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.o.get(0);
            } else {
                str = aVar2.f870n.get(0);
            }
            View view = aVar.get(str);
            xVar.v(obj, view);
            if (obj2 != null) {
                xVar.v(obj2, view);
            }
        }
    }

    static void B(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    static void C(m mVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar) {
        m mVar2 = mVar;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i3;
        boolean z2 = z;
        if (mVar2.f836n >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i5 = i2; i5 < i4; i5++) {
                a aVar = arrayList3.get(i5);
                if (arrayList4.get(i5).booleanValue()) {
                    e(aVar, sparseArray, z2);
                } else {
                    c(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(mVar2.o.h());
                int size = sparseArray.size();
                for (int i6 = 0; i6 < size; i6++) {
                    int keyAt = sparseArray.keyAt(i6);
                    e.e.a<String, String> d2 = d(keyAt, arrayList3, arrayList4, i2, i4);
                    h hVar = (h) sparseArray.valueAt(i6);
                    if (z2) {
                        o(mVar, keyAt, hVar, view, d2, gVar);
                    } else {
                        n(mVar, keyAt, hVar, view, d2, gVar);
                    }
                }
            }
        }
    }

    static boolean D() {
        return (b == null && c == null) ? false : true;
    }

    private static void a(ArrayList<View> arrayList, e.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m2 = aVar.m(size);
            if (collection.contains(u.D(m2))) {
                arrayList.add(m2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.q != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.E == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.u.a r9, android.util.SparseArray<androidx.fragment.app.v.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.C
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = a
            int r9 = r9.a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.R
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.E
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.q
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.E
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.R
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.E
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.E
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.q
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.M
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.S
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.E
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.Q
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.q
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.E
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0092:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.v$h r6 = (androidx.fragment.app.v.h) r6
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.v$h r6 = p(r6, r10, r1)
            r6.a = r0
            r6.b = r11
            r6.c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r9 == 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r9 = r6.f906d
            if (r9 != r0) goto L_0x00b1
            r6.f906d = r2
        L_0x00b1:
            androidx.fragment.app.m r9 = r8.r
            int r7 = r0.f775g
            if (r7 >= r3) goto L_0x00c5
            int r7 = r9.f836n
            if (r7 < r3) goto L_0x00c5
            boolean r7 = r8.p
            if (r7 != 0) goto L_0x00c5
            r9.v0(r0)
            r9.B0(r0, r3)
        L_0x00c5:
            if (r5 == 0) goto L_0x00d7
            if (r6 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r9 = r6.f906d
            if (r9 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.v$h r6 = p(r6, r10, r1)
            r6.f906d = r0
            r6.f907e = r11
            r6.f908f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r4 == 0) goto L_0x00e3
            if (r6 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r6.a
            if (r8 != r0) goto L_0x00e3
            r6.a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.b(androidx.fragment.app.a, androidx.fragment.app.u$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.a.get(i2), sparseArray, false, z);
        }
    }

    private static e.e.a<String, String> d(int i2, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        e.e.a<String, String> aVar = new e.e.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            a aVar2 = arrayList.get(i5);
            if (aVar2.F(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f870n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f870n;
                        arrayList4 = aVar2.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f870n;
                        arrayList3 = aVar2.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.r.p.f()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, e.e.a<String, View> aVar, boolean z2) {
        o oVar;
        int i2;
        if (z) {
            oVar = fragment2.E();
        } else {
            oVar = fragment.E();
        }
        if (oVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i2 = 0;
            } else {
                i2 = aVar.size();
            }
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList2.add(aVar.i(i3));
                arrayList.add(aVar.m(i3));
            }
            if (z2) {
                oVar.c(arrayList2, arrayList, (List<View>) null);
            } else {
                oVar.b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    private static boolean g(x xVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!xVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static e.e.a<String, View> h(x xVar, e.e.a<String, String> aVar, Object obj, h hVar) {
        o oVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.a;
        View Z = fragment.Z();
        if (aVar.isEmpty() || obj == null || Z == null) {
            aVar.clear();
            return null;
        }
        e.e.a<String, View> aVar2 = new e.e.a<>();
        xVar.j(aVar2, Z);
        a aVar3 = hVar.c;
        if (hVar.b) {
            oVar = fragment.G();
            arrayList = aVar3.f870n;
        } else {
            oVar = fragment.E();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        if (oVar != null) {
            oVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(u.D(view)) && (q = q(aVar, str)) != null) {
                    aVar.put(q, u.D(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static e.e.a<String, View> i(x xVar, e.e.a<String, String> aVar, Object obj, h hVar) {
        o oVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f906d;
        e.e.a<String, View> aVar2 = new e.e.a<>();
        xVar.j(aVar2, fragment.y1());
        a aVar3 = hVar.f908f;
        if (hVar.f907e) {
            oVar = fragment.E();
            arrayList = aVar3.o;
        } else {
            oVar = fragment.G();
            arrayList = aVar3.f870n;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        if (oVar != null) {
            oVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(u.D(view))) {
                    aVar.put(u.D(view), aVar.remove(str));
                }
            }
        } else {
            aVar.o(aVar2.keySet());
        }
        return aVar2;
    }

    private static x j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object F = fragment.F();
            if (F != null) {
                arrayList.add(F);
            }
            Object T = fragment.T();
            if (T != null) {
                arrayList.add(T);
            }
            Object V = fragment.V();
            if (V != null) {
                arrayList.add(V);
            }
        }
        if (fragment2 != null) {
            Object D = fragment2.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object Q = fragment2.Q();
            if (Q != null) {
                arrayList.add(Q);
            }
            Object U = fragment2.U();
            if (U != null) {
                arrayList.add(U);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        x xVar = b;
        if (xVar != null && g(xVar, arrayList)) {
            return b;
        }
        x xVar2 = c;
        if (xVar2 != null && g(xVar2, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View Z = fragment.Z();
        if (Z != null) {
            xVar.f(arrayList2, Z);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        xVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(x xVar, ViewGroup viewGroup, View view, e.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        e.e.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        x xVar2 = xVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.f906d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(xVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        e.e.a<String, View> i2 = i(xVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i2.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj4 != null) {
            rect = new Rect();
            xVar2.z(obj4, view, arrayList3);
            A(xVar, obj4, obj2, i2, hVar2.f907e, hVar2.f908f);
            if (obj5 != null) {
                xVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(xVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        r.a(viewGroup, fVar);
        return obj4;
    }

    private static Object m(x xVar, ViewGroup viewGroup, View view, e.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        x xVar2 = xVar;
        View view3 = view;
        e.e.a<String, String> aVar2 = aVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.f906d;
        if (fragment != null) {
            fragment.y1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = u(xVar, fragment, fragment2, z);
        }
        e.e.a<String, View> i2 = i(xVar, aVar2, obj3, hVar2);
        e.e.a<String, View> h2 = h(xVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i2 != null) {
                i2.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj4 = null;
        } else {
            a(arrayList3, i2, aVar.keySet());
            a(arrayList4, h2, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            xVar.z(obj4, view3, arrayList3);
            A(xVar, obj4, obj2, i2, hVar2.f907e, hVar2.f908f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar2, obj5, z);
            if (t != null) {
                xVar.u(obj5, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        r.a(viewGroup, new e(fragment, fragment2, z, h2, view2, xVar, rect));
        return obj4;
    }

    private static void n(m mVar, int i2, h hVar, View view, e.e.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        x j2;
        Object obj;
        m mVar2 = mVar;
        h hVar2 = hVar;
        View view2 = view;
        e.e.a<String, String> aVar2 = aVar;
        g gVar2 = gVar;
        ViewGroup viewGroup = mVar2.p.f() ? (ViewGroup) mVar2.p.e(i2) : null;
        if (viewGroup != null && (j2 = j(fragment2, fragment)) != null) {
            boolean z = hVar2.b;
            boolean z2 = hVar2.f907e;
            Object r = r(j2, (fragment = hVar2.a), z);
            Object s = s(j2, (fragment2 = hVar2.f906d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            Object obj3 = r;
            x xVar = j2;
            Fragment fragment3 = fragment2;
            Object l2 = l(j2, viewGroup, view, aVar, hVar, arrayList3, arrayList2, obj3, obj2);
            Object obj4 = obj3;
            if (obj4 == null && l2 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k2 = k(xVar, obj, fragment3, arrayList4, view2);
            Object obj5 = (k2 == null || k2.isEmpty()) ? null : obj;
            xVar.a(obj4, view2);
            Object v = v(xVar, obj4, obj5, l2, fragment, hVar2.b);
            if (!(fragment3 == null || k2 == null || (k2.size() <= 0 && arrayList4.size() <= 0))) {
                androidx.core.os.a aVar3 = new androidx.core.os.a();
                gVar2.b(fragment3, aVar3);
                xVar.w(fragment3, v, aVar3, new c(gVar2, fragment3, aVar3));
            }
            if (v != null) {
                ArrayList arrayList5 = new ArrayList();
                x xVar2 = xVar;
                xVar2.t(v, obj4, arrayList5, obj5, k2, l2, arrayList2);
                z(xVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, k2);
                ArrayList arrayList6 = arrayList2;
                e.e.a<String, String> aVar4 = aVar;
                xVar.x(viewGroup, arrayList6, aVar4);
                xVar.c(viewGroup, v);
                xVar.s(viewGroup, arrayList6, aVar4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r12 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o(androidx.fragment.app.m r17, int r18, androidx.fragment.app.v.h r19, android.view.View r20, e.e.a<java.lang.String, java.lang.String> r21, androidx.fragment.app.v.g r22) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            r10 = r22
            androidx.fragment.app.f r1 = r0.p
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x001b
            androidx.fragment.app.f r0 = r0.p
            r1 = r18
            android.view.View r0 = r0.e(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r11 = r0
            if (r11 != 0) goto L_0x0020
            return
        L_0x0020:
            androidx.fragment.app.Fragment r12 = r4.a
            androidx.fragment.app.Fragment r13 = r4.f906d
            androidx.fragment.app.x r14 = j(r13, r12)
            if (r14 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r15 = r4.b
            boolean r0 = r4.f907e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r6 = r(r14, r12, r15)
            java.lang.Object r5 = s(r14, r13, r0)
            r0 = r14
            r1 = r11
            r2 = r20
            r3 = r21
            r4 = r19
            r17 = r5
            r5 = r7
            r18 = r6
            r6 = r8
            r16 = r11
            r11 = r7
            r7 = r18
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0066
            if (r8 != 0) goto L_0x0066
            r7 = r17
            if (r7 != 0) goto L_0x0068
            return
        L_0x0066:
            r7 = r17
        L_0x0068:
            java.util.ArrayList r5 = k(r14, r7, r13, r11, r9)
            java.util.ArrayList r9 = k(r14, r6, r12, r10, r9)
            r0 = 4
            B(r9, r0)
            r0 = r14
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r12
            r12 = r5
            r5 = r15
            java.lang.Object r15 = v(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x00a1
            if (r12 == 0) goto L_0x00a1
            int r0 = r12.size()
            if (r0 > 0) goto L_0x008f
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00a1
        L_0x008f:
            androidx.core.os.a r0 = new androidx.core.os.a
            r0.<init>()
            r1 = r22
            r1.b(r13, r0)
            androidx.fragment.app.v$a r2 = new androidx.fragment.app.v$a
            r2.<init>(r1, r13, r0)
            r14.w(r13, r15, r0, r2)
        L_0x00a1:
            if (r15 == 0) goto L_0x00cb
            w(r14, r7, r13, r12)
            java.util.ArrayList r13 = r14.o(r10)
            r0 = r14
            r1 = r15
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r12
            r6 = r8
            r7 = r10
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r14.c(r0, r15)
            r1 = r14
            r2 = r0
            r3 = r11
            r4 = r10
            r5 = r13
            r6 = r21
            r1.y(r2, r3, r4, r5, r6)
            r0 = 0
            B(r9, r0)
            r14.A(r8, r11, r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.o(androidx.fragment.app.m, int, androidx.fragment.app.v$h, android.view.View, e.e.a, androidx.fragment.app.v$g):void");
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    private static String q(e.e.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(aVar.m(i2))) {
                return aVar.i(i2);
            }
        }
        return null;
    }

    private static Object r(x xVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.Q();
        } else {
            obj = fragment.D();
        }
        return xVar.g(obj);
    }

    private static Object s(x xVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.T();
        } else {
            obj = fragment.F();
        }
        return xVar.g(obj);
    }

    static View t(e.e.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a aVar2 = hVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.f870n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.f870n.get(0);
        } else {
            str = aVar2.o.get(0);
        }
        return aVar.get(str);
    }

    private static Object u(x xVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.V();
        } else {
            obj = fragment.U();
        }
        return xVar.B(xVar.g(obj));
    }

    private static Object v(x xVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.x() : fragment.w();
        }
        if (z2) {
            return xVar.n(obj2, obj, obj3);
        }
        return xVar.m(obj2, obj, obj3);
    }

    private static void w(x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.q && fragment.E && fragment.R) {
            fragment.E1(true);
            xVar.r(obj, fragment.Z(), arrayList);
            r.a(fragment.L, new b(arrayList));
        }
    }

    private static x x() {
        try {
            return (x) Class.forName("e.u.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(e.e.a<String, String> aVar, e.e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void z(x xVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        r.a(viewGroup, new d(obj, xVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
