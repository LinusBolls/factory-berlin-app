package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import e.h.k.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator */
public class g extends w {
    private static TimeInterpolator s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f1257h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f1258i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f1259j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<i> f1260k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.d0>> f1261l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ArrayList<j>> f1262m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<ArrayList<i>> f1263n = new ArrayList<>();
    ArrayList<RecyclerView.d0> o = new ArrayList<>();
    ArrayList<RecyclerView.d0> p = new ArrayList<>();
    ArrayList<RecyclerView.d0> q = new ArrayList<>();
    ArrayList<RecyclerView.d0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f1264g;

        a(ArrayList arrayList) {
            this.f1264g = arrayList;
        }

        public void run() {
            Iterator it = this.f1264g.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.U(jVar.a, jVar.b, jVar.c, jVar.f1280d, jVar.f1281e);
            }
            this.f1264g.clear();
            g.this.f1262m.remove(this.f1264g);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f1266g;

        b(ArrayList arrayList) {
            this.f1266g = arrayList;
        }

        public void run() {
            Iterator it = this.f1266g.iterator();
            while (it.hasNext()) {
                g.this.T((i) it.next());
            }
            this.f1266g.clear();
            g.this.f1263n.remove(this.f1266g);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f1268g;

        c(ArrayList arrayList) {
            this.f1268g = arrayList;
        }

        public void run() {
            Iterator it = this.f1268g.iterator();
            while (it.hasNext()) {
                g.this.S((RecyclerView.d0) it.next());
            }
            this.f1268g.clear();
            g.this.f1261l.remove(this.f1268g);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class d extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.d0 a;
        final /* synthetic */ ViewPropertyAnimator b;
        final /* synthetic */ View c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = d0Var;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            g.this.H(this.a);
            g.this.q.remove(this.a);
            g.this.X();
        }

        public void onAnimationStart(Animator animator) {
            g.this.I(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class e extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.d0 a;
        final /* synthetic */ View b;
        final /* synthetic */ ViewPropertyAnimator c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = d0Var;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.c.setListener((Animator.AnimatorListener) null);
            g.this.B(this.a);
            g.this.o.remove(this.a);
            g.this.X();
        }

        public void onAnimationStart(Animator animator) {
            g.this.C(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class f extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.d0 a;
        final /* synthetic */ int b;
        final /* synthetic */ View c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1272d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1273e;

        f(RecyclerView.d0 d0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = d0Var;
            this.b = i2;
            this.c = view;
            this.f1272d = i3;
            this.f1273e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.f1272d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f1273e.setListener((Animator.AnimatorListener) null);
            g.this.F(this.a);
            g.this.p.remove(this.a);
            g.this.X();
        }

        public void onAnimationStart(Animator animator) {
            g.this.G(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    class C0030g extends AnimatorListenerAdapter {
        final /* synthetic */ i a;
        final /* synthetic */ ViewPropertyAnimator b;
        final /* synthetic */ View c;

        C0030g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            g.this.D(this.a.a, true);
            g.this.r.remove(this.a.a);
            g.this.X();
        }

        public void onAnimationStart(Animator animator) {
            g.this.E(this.a.a, true);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class h extends AnimatorListenerAdapter {
        final /* synthetic */ i a;
        final /* synthetic */ ViewPropertyAnimator b;
        final /* synthetic */ View c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            g.this.D(this.a.b, false);
            g.this.r.remove(this.a.b);
            g.this.X();
        }

        public void onAnimationStart(Animator animator) {
            g.this.E(this.a.b, false);
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class j {
        public RecyclerView.d0 a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1280d;

        /* renamed from: e  reason: collision with root package name */
        public int f1281e;

        j(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
            this.a = d0Var;
            this.b = i2;
            this.c = i3;
            this.f1280d = i4;
            this.f1281e = i5;
        }
    }

    private void V(RecyclerView.d0 d0Var) {
        View view = d0Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(d0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void Y(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (a0(iVar, d0Var) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    private void Z(i iVar) {
        RecyclerView.d0 d0Var = iVar.a;
        if (d0Var != null) {
            a0(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.b;
        if (d0Var2 != null) {
            a0(iVar, d0Var2);
        }
    }

    private boolean a0(i iVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (iVar.b == d0Var) {
            iVar.b = null;
        } else if (iVar.a != d0Var) {
            return false;
        } else {
            iVar.a = null;
            z = true;
        }
        d0Var.a.setAlpha(1.0f);
        d0Var.a.setTranslationX(0.0f);
        d0Var.a.setTranslationY(0.0f);
        D(d0Var, z);
        return true;
    }

    private void b0(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.a.animate().setInterpolator(s);
        j(d0Var);
    }

    public boolean A(RecyclerView.d0 d0Var) {
        b0(d0Var);
        this.f1257h.add(d0Var);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void S(RecyclerView.d0 d0Var) {
        View view = d0Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(d0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void T(i iVar) {
        View view;
        RecyclerView.d0 d0Var = iVar.a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.a;
        }
        RecyclerView.d0 d0Var2 = iVar.b;
        if (d0Var2 != null) {
            view2 = d0Var2.a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.r.add(iVar.a);
            duration.translationX((float) (iVar.f1278e - iVar.c));
            duration.translationY((float) (iVar.f1279f - iVar.f1277d));
            duration.alpha(0.0f).setListener(new C0030g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.r.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void U(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(d0Var);
        animate.setDuration(n()).setListener(new f(d0Var, i6, view, i7, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void W(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void X() {
        if (!p()) {
            i();
        }
    }

    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.a;
        view.animate().cancel();
        int size = this.f1259j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f1259j.get(size).a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(d0Var);
                this.f1259j.remove(size);
            }
        }
        Y(this.f1260k, d0Var);
        if (this.f1257h.remove(d0Var)) {
            view.setAlpha(1.0f);
            H(d0Var);
        }
        if (this.f1258i.remove(d0Var)) {
            view.setAlpha(1.0f);
            B(d0Var);
        }
        for (int size2 = this.f1263n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f1263n.get(size2);
            Y(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f1263n.remove(size2);
            }
        }
        for (int size3 = this.f1262m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f1262m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f1262m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f1261l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f1261l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                B(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f1261l.remove(size5);
                }
            }
        }
        this.q.remove(d0Var);
        this.o.remove(d0Var);
        this.r.remove(d0Var);
        this.p.remove(d0Var);
        X();
    }

    public void k() {
        int size = this.f1259j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f1259j.get(size);
            View view = jVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.a);
            this.f1259j.remove(size);
        }
        for (int size2 = this.f1257h.size() - 1; size2 >= 0; size2--) {
            H(this.f1257h.get(size2));
            this.f1257h.remove(size2);
        }
        int size3 = this.f1258i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f1258i.get(size3);
            d0Var.a.setAlpha(1.0f);
            B(d0Var);
            this.f1258i.remove(size3);
        }
        for (int size4 = this.f1260k.size() - 1; size4 >= 0; size4--) {
            Z(this.f1260k.get(size4));
        }
        this.f1260k.clear();
        if (p()) {
            for (int size5 = this.f1262m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f1262m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f1262m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f1261l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f1261l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = (RecyclerView.d0) arrayList2.get(size8);
                    d0Var2.a.setAlpha(1.0f);
                    B(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f1261l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f1263n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f1263n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Z((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f1263n.remove(arrayList3);
                    }
                }
            }
            W(this.q);
            W(this.p);
            W(this.o);
            W(this.r);
            i();
        }
    }

    public boolean p() {
        return !this.f1258i.isEmpty() || !this.f1260k.isEmpty() || !this.f1259j.isEmpty() || !this.f1257h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.f1262m.isEmpty() || !this.f1261l.isEmpty() || !this.f1263n.isEmpty();
    }

    public void v() {
        boolean z = !this.f1257h.isEmpty();
        boolean z2 = !this.f1259j.isEmpty();
        boolean z3 = !this.f1260k.isEmpty();
        boolean z4 = !this.f1258i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.d0> it = this.f1257h.iterator();
            while (it.hasNext()) {
                V(it.next());
            }
            this.f1257h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f1259j);
                this.f1262m.add(arrayList);
                this.f1259j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    u.Y(((j) arrayList.get(0)).a.a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f1260k);
                this.f1263n.add(arrayList2);
                this.f1260k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    u.Y(((i) arrayList2.get(0)).a.a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f1258i);
                this.f1261l.add(arrayList3);
                this.f1258i.clear();
                c cVar = new c(arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long o2 = z ? o() : 0;
                    long n2 = z2 ? n() : 0;
                    if (z3) {
                        j2 = m();
                    }
                    u.Y(((RecyclerView.d0) arrayList3.get(0)).a, cVar, o2 + Math.max(n2, j2));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean x(RecyclerView.d0 d0Var) {
        b0(d0Var);
        d0Var.a.setAlpha(0.0f);
        this.f1258i.add(d0Var);
        return true;
    }

    public boolean y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return z(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.a.getTranslationX();
        float translationY = d0Var.a.getTranslationY();
        float alpha = d0Var.a.getAlpha();
        b0(d0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        d0Var.a.setTranslationX(translationX);
        d0Var.a.setTranslationY(translationY);
        d0Var.a.setAlpha(alpha);
        if (d0Var2 != null) {
            b0(d0Var2);
            d0Var2.a.setTranslationX((float) (-i6));
            d0Var2.a.setTranslationY((float) (-i7));
            d0Var2.a.setAlpha(0.0f);
        }
        this.f1260k.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    public boolean z(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.a.getTranslationY());
        b0(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            F(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.f1259j.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    /* compiled from: DefaultItemAnimator */
    private static class i {
        public RecyclerView.d0 a;
        public RecyclerView.d0 b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1277d;

        /* renamed from: e  reason: collision with root package name */
        public int f1278e;

        /* renamed from: f  reason: collision with root package name */
        public int f1279f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.a = d0Var;
            this.b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.f1277d + ", toX=" + this.f1278e + ", toY=" + this.f1279f + '}';
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
            this(d0Var, d0Var2);
            this.c = i2;
            this.f1277d = i3;
            this.f1278e = i4;
            this.f1279f = i5;
        }
    }
}
