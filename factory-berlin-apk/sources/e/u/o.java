package e.u;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import e.h.k.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager */
public class o {
    private static m a = new b();
    private static ThreadLocal<WeakReference<e.e.a<ViewGroup, ArrayList<m>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    /* compiled from: TransitionManager */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: g  reason: collision with root package name */
        m f8929g;

        /* renamed from: h  reason: collision with root package name */
        ViewGroup f8930h;

        /* renamed from: e.u.o$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        class C0590a extends n {
            final /* synthetic */ e.e.a a;

            C0590a(e.e.a aVar) {
                this.a = aVar;
            }

            public void e(m mVar) {
                ((ArrayList) this.a.get(a.this.f8930h)).remove(mVar);
                mVar.a0(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f8929g = mVar;
            this.f8930h = viewGroup;
        }

        private void a() {
            this.f8930h.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f8930h.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!o.c.remove(this.f8930h)) {
                return true;
            }
            e.e.a<ViewGroup, ArrayList<m>> b = o.b();
            ArrayList arrayList = b.get(this.f8930h);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f8930h, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f8929g);
            this.f8929g.c(new C0590a(b));
            this.f8929g.s(this.f8930h, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).c0(this.f8930h);
                }
            }
            this.f8929g.Y(this.f8930h);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            o.c.remove(this.f8930h);
            ArrayList arrayList = o.b().get(this.f8930h);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).c0(this.f8930h);
                }
            }
            this.f8929g.t(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!c.contains(viewGroup) && u.L(viewGroup)) {
            c.add(viewGroup);
            if (mVar == null) {
                mVar = a;
            }
            m u = mVar.clone();
            d(viewGroup, u);
            l.c(viewGroup, (l) null);
            c(viewGroup, u);
        }
    }

    static e.e.a<ViewGroup, ArrayList<m>> b() {
        e.e.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference weakReference = b.get();
        if (weakReference != null && (aVar = (e.e.a) weakReference.get()) != null) {
            return aVar;
        }
        e.e.a<ViewGroup, ArrayList<m>> aVar2 = new e.e.a<>();
        b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).X(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.s(viewGroup, true);
        }
        l b2 = l.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
