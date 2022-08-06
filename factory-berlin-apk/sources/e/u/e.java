package e.u;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import e.u.m;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* compiled from: FragmentTransitionSupport */
public class e extends x {

    /* compiled from: FragmentTransitionSupport */
    class a extends m.e {
        a(e eVar, Rect rect) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class b implements m.f {
        final /* synthetic */ View a;
        final /* synthetic */ ArrayList b;

        b(e eVar, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        public void a(m mVar) {
            mVar.a0(this);
            mVar.c(this);
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
            mVar.a0(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.b.get(i2)).setVisibility(0);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class c extends n {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ Object c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f8900d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f8901e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f8902f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.f8900d = arrayList2;
            this.f8901e = obj3;
            this.f8902f = arrayList3;
        }

        public void a(m mVar) {
            Object obj = this.a;
            if (obj != null) {
                e.this.q(obj, this.b, (ArrayList<View>) null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                e.this.q(obj2, this.f8900d, (ArrayList<View>) null);
            }
            Object obj3 = this.f8901e;
            if (obj3 != null) {
                e.this.q(obj3, this.f8902f, (ArrayList<View>) null);
            }
        }

        public void e(m mVar) {
            mVar.a0(this);
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class d implements a.C0016a {
        final /* synthetic */ m a;

        d(e eVar, m mVar) {
            this.a = mVar;
        }

        public void a() {
            this.a.cancel();
        }
    }

    /* renamed from: e.u.e$e  reason: collision with other inner class name */
    /* compiled from: FragmentTransitionSupport */
    class C0589e implements m.f {
        final /* synthetic */ Runnable a;

        C0589e(e eVar, Runnable runnable) {
            this.a = runnable;
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
            this.a.run();
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class f extends m.e {
        f(e eVar, Rect rect) {
        }
    }

    private static boolean C(m mVar) {
        return !x.l(mVar.H()) || !x.l(mVar.I()) || !x.l(mVar.J());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.M().clear();
            qVar.M().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.s0((m) obj);
        return qVar;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).d(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i2 = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int w0 = qVar.w0();
                while (i2 < w0) {
                    b(qVar.v0(i2), arrayList);
                    i2++;
                }
            } else if (!C(mVar) && x.l(mVar.M())) {
                int size = arrayList.size();
                while (i2 < size) {
                    mVar.d(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof m;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            q qVar = new q();
            qVar.s0(mVar);
            qVar.s0(mVar2);
            qVar.B0(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar2 = new q();
        if (mVar != null) {
            qVar2.s0(mVar);
        }
        qVar2.s0(mVar3);
        return qVar2;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.s0((m) obj);
        }
        if (obj2 != null) {
            qVar.s0((m) obj2);
        }
        if (obj3 != null) {
            qVar.s0((m) obj3);
        }
        return qVar;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b0(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i2;
        m mVar = (m) obj;
        int i3 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int w0 = qVar.w0();
            while (i3 < w0) {
                q(qVar.v0(i3), arrayList, arrayList2);
                i3++;
            }
        } else if (!C(mVar)) {
            List<View> M = mVar.M();
            if (M.size() == arrayList.size() && M.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i2 = 0;
                } else {
                    i2 = arrayList2.size();
                }
                while (i3 < i2) {
                    mVar.d(arrayList2.get(i3));
                    i3++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.b0(arrayList.get(size));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).c(new b(this, view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).g0(new f(this, rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).g0(new a(this, rect));
        }
    }

    public void w(Fragment fragment, Object obj, androidx.core.os.a aVar, Runnable runnable) {
        m mVar = (m) obj;
        aVar.c(new d(this, mVar));
        mVar.c(new C0589e(this, runnable));
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> M = qVar.M();
        M.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            x.d(M, arrayList.get(i2));
        }
        M.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
