package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import e.h.k.r;
import e.h.k.u;
import e.h.k.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* compiled from: FragmentTransitionImpl */
public abstract class x {

    /* compiled from: FragmentTransitionImpl */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f913g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f914h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f915i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f916j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f917k;

        a(x xVar, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f913g = i2;
            this.f914h = arrayList;
            this.f915i = arrayList2;
            this.f916j = arrayList3;
            this.f917k = arrayList4;
        }

        public void run() {
            for (int i2 = 0; i2 < this.f913g; i2++) {
                u.u0((View) this.f914h.get(i2), (String) this.f915i.get(i2));
                u.u0((View) this.f916j.get(i2), (String) this.f917k.get(i2));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f918g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Map f919h;

        b(x xVar, ArrayList arrayList, Map map) {
            this.f918g = arrayList;
            this.f919h = map;
        }

        public void run() {
            int size = this.f918g.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f918g.get(i2);
                String D = u.D(view);
                if (D != null) {
                    u.u0(view, x.i(this.f919h, D));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f920g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Map f921h;

        c(x xVar, ArrayList arrayList, Map map) {
            this.f920g = arrayList;
            this.f921h = map;
        }

        public void run() {
            int size = this.f920g.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f920g.get(i2);
                u.u0(view, (String) this.f921h.get(u.D(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            list.add(view);
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (!h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (w.a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                f(arrayList, viewGroup.getChildAt(i2));
            }
            return;
        }
        arrayList.add(view);
    }

    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String D = u.D(view);
            if (D != null) {
                map.put(D, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(u.D(view));
            u.u0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        r.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, androidx.core.os.a aVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        r.a(view, new b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String D = u.D(view2);
            arrayList4.add(D);
            if (D != null) {
                u.u0(view2, (String) null);
                String str = map.get(D);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i3))) {
                        u.u0(arrayList2.get(i3), D);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        r.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
