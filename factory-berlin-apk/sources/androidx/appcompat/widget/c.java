package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import e.h.k.b;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter */
class c extends androidx.appcompat.view.menu.b implements b.a {
    private boolean A;
    private int B;
    private final SparseBooleanArray C = new SparseBooleanArray();
    e D;
    a E;
    C0007c F;
    private b G;
    final f H = new f();
    int I;
    d p;
    private Drawable q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* compiled from: ActionMenuPresenter */
    private class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, e.a.a.actionOverflowMenuStyle);
            if (!((i) rVar.getItem()).l()) {
                View view2 = c.this.p;
                f(view2 == null ? (View) c.this.f211n : view2);
            }
            j(c.this.H);
        }

        /* access modifiers changed from: protected */
        public void e() {
            c cVar = c.this;
            cVar.E = null;
            cVar.I = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        public p a() {
            a aVar = c.this.E;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* compiled from: ActionMenuPresenter */
    private class C0007c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private e f395g;

        public C0007c(e eVar) {
            this.f395g = eVar;
        }

        public void run() {
            if (c.this.f206i != null) {
                c.this.f206i.d();
            }
            View view = (View) c.this.f211n;
            if (!(view == null || view.getWindowToken() == null || !this.f395g.m())) {
                c.this.D = this.f395g;
            }
            c.this.F = null;
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class d extends o implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter */
        class a extends h0 {
            a(View view, c cVar) {
                super(view);
            }

            public p b() {
                e eVar = c.this.D;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                c.this.L();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.F != null) {
                    return false;
                }
                cVar.C();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, e.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.L();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class e extends l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, e.a.a.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.H);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (c.this.f206i != null) {
                c.this.f206i.close();
            }
            c.this.D = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter */
    private class f implements m.a {
        f() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.F().e(false);
            }
            m.a o = c.this.o();
            if (o != null) {
                o.a(gVar, z);
            }
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            if (gVar == null) {
                return false;
            }
            c.this.I = ((r) gVar).getItem().getItemId();
            m.a o = c.this.o();
            if (o != null) {
                return o.b(gVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* compiled from: ActionMenuPresenter */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public int f400g;

        /* compiled from: ActionMenuPresenter */
        static class a implements Parcelable.Creator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            /* renamed from: b */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        g() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f400g);
        }

        g(Parcel parcel) {
            this.f400g = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context, e.a.g.abc_action_menu_layout, e.a.g.abc_action_menu_item_layout);
    }

    private View A(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f211n;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable B() {
        d dVar = this.p;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.r) {
            return this.q;
        }
        return null;
    }

    public boolean C() {
        n nVar;
        C0007c cVar = this.F;
        if (cVar == null || (nVar = this.f211n) == null) {
            e eVar = this.D;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.F = null;
        return true;
    }

    public boolean D() {
        a aVar = this.E;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean E() {
        return this.F != null || F();
    }

    public boolean F() {
        e eVar = this.D;
        return eVar != null && eVar.d();
    }

    public void G(Configuration configuration) {
        if (!this.x) {
            this.w = e.a.n.a.b(this.f205h).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f206i;
        if (gVar != null) {
            gVar.M(true);
        }
    }

    public void H(boolean z2) {
        this.A = z2;
    }

    public void I(ActionMenuView actionMenuView) {
        this.f211n = actionMenuView;
        actionMenuView.b(this.f206i);
    }

    public void J(Drawable drawable) {
        d dVar = this.p;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.r = true;
        this.q = drawable;
    }

    public void K(boolean z2) {
        this.s = z2;
        this.t = true;
    }

    public boolean L() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.s || F() || (gVar = this.f206i) == null || this.f211n == null || this.F != null || gVar.B().isEmpty()) {
            return false;
        }
        C0007c cVar = new C0007c(new e(this.f205h, this.f206i, this.p, true));
        this.F = cVar;
        ((View) this.f211n).post(cVar);
        super.f((r) null);
        return true;
    }

    public void a(androidx.appcompat.view.menu.g gVar, boolean z2) {
        z();
        super.a(gVar, z2);
    }

    public void b(Context context, androidx.appcompat.view.menu.g gVar) {
        super.b(context, gVar);
        Resources resources = context.getResources();
        e.a.n.a b2 = e.a.n.a.b(context);
        if (!this.t) {
            this.s = b2.h();
        }
        if (!this.z) {
            this.u = b2.c();
        }
        if (!this.x) {
            this.w = b2.d();
        }
        int i2 = this.u;
        if (this.s) {
            if (this.p == null) {
                d dVar = new d(this.f204g);
                this.p = dVar;
                if (this.r) {
                    dVar.setImageDrawable(this.q);
                    this.q = null;
                    this.r = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.p.getMeasuredWidth();
        } else {
            this.p = null;
        }
        this.v = i2;
        this.B = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void d(Parcelable parcelable) {
        int i2;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i2 = ((g) parcelable).f400g) > 0 && (findItem = this.f206i.findItem(i2)) != null) {
            f((r) findItem.getSubMenu());
        }
    }

    public void e(i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f211n);
        if (this.G == null) {
            this.G = new b();
        }
        actionMenuItemView.setPopupCallback(this.G);
    }

    public boolean f(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.i0() != this.f206i) {
            rVar2 = (r) rVar2.i0();
        }
        View A2 = A(rVar2.getItem());
        if (A2 == null) {
            return false;
        }
        this.I = rVar.getItem().getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f205h, rVar, A2);
        this.E = aVar;
        aVar.g(z2);
        this.E.k();
        super.f(rVar);
        return true;
    }

    public void g(boolean z2) {
        n nVar;
        super.g(z2);
        ((View) this.f211n).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f206i;
        boolean z3 = false;
        if (gVar != null) {
            ArrayList<i> u2 = gVar.u();
            int size = u2.size();
            for (int i2 = 0; i2 < size; i2++) {
                e.h.k.b b2 = u2.get(i2).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f206i;
        ArrayList<i> B2 = gVar2 != null ? gVar2.B() : null;
        if (this.s && B2 != null) {
            int size2 = B2.size();
            if (size2 == 1) {
                z3 = !B2.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.p == null) {
                this.p = new d(this.f204g);
            }
            ViewGroup viewGroup = (ViewGroup) this.p.getParent();
            if (viewGroup != this.f211n) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f211n;
                actionMenuView.addView(this.p, actionMenuView.F());
            }
        } else {
            d dVar = this.p;
            if (dVar != null && dVar.getParent() == (nVar = this.f211n)) {
                ((ViewGroup) nVar).removeView(this.p);
            }
        }
        ((ActionMenuView) this.f211n).setOverflowReserved(this.s);
    }

    public boolean i() {
        int i2;
        ArrayList<i> arrayList;
        int i3;
        int i4;
        int i5;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f206i;
        View view = null;
        int i6 = 0;
        if (gVar != null) {
            arrayList = gVar.G();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i7 = cVar.w;
        int i8 = cVar.v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f211n;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i iVar = arrayList.get(i11);
            if (iVar.o()) {
                i9++;
            } else if (iVar.n()) {
                i10++;
            } else {
                z2 = true;
            }
            if (cVar.A && iVar.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (cVar.s && (z2 || i10 + i9 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.C;
        sparseBooleanArray.clear();
        if (cVar.y) {
            int i13 = cVar.B;
            i3 = i8 / i13;
            i4 = i13 + ((i8 % i13) / i3);
        } else {
            i4 = 0;
            i3 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i2) {
            i iVar2 = arrayList.get(i14);
            if (iVar2.o()) {
                View p2 = cVar.p(iVar2, view, viewGroup);
                if (cVar.y) {
                    i3 -= ActionMenuView.L(p2, i4, i3, makeMeasureSpec, i6);
                } else {
                    p2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = p2.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i5 = i2;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i8 > 0 && (!cVar.y || i3 > 0);
                boolean z5 = z4;
                i5 = i2;
                if (z4) {
                    View p3 = cVar.p(iVar2, (View) null, viewGroup);
                    if (cVar.y) {
                        int L = ActionMenuView.L(p3, i4, i3, makeMeasureSpec, 0);
                        i3 -= L;
                        if (L == 0) {
                            z5 = false;
                        }
                    } else {
                        p3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = p3.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z4 = z6 & (!cVar.y ? i8 + i15 > 0 : i8 >= 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i14) {
                        i iVar3 = arrayList.get(i16);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i12++;
                            }
                            iVar3.u(false);
                        }
                        i16++;
                    }
                }
                if (z4) {
                    i12--;
                }
                iVar2.u(z4);
            } else {
                i5 = i2;
                iVar2.u(false);
                i14++;
                view = null;
                cVar = this;
                i2 = i5;
                i6 = 0;
            }
            i14++;
            view = null;
            cVar = this;
            i2 = i5;
            i6 = 0;
        }
        return true;
    }

    public Parcelable j() {
        g gVar = new g();
        gVar.f400g = this.I;
        return gVar;
    }

    public boolean n(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.p) {
            return false;
        }
        return super.n(viewGroup, i2);
    }

    public View p(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.p(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public n q(ViewGroup viewGroup) {
        n nVar = this.f211n;
        n q2 = super.q(viewGroup);
        if (nVar != q2) {
            ((ActionMenuView) q2).setPresenter(this);
        }
        return q2;
    }

    public boolean s(int i2, i iVar) {
        return iVar.l();
    }

    public boolean z() {
        return C() | D();
    }
}
