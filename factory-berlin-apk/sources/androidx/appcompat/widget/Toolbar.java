package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import e.a.j;
import e.h.k.h;
import e.h.k.u;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private CharSequence D;
    private CharSequence E;
    private ColorStateList F;
    private ColorStateList G;
    private boolean H;
    private boolean I;
    private final ArrayList<View> J;
    private final ArrayList<View> K;
    private final int[] L;
    f M;
    private final ActionMenuView.e N;
    private x0 O;
    private c P;
    private d Q;
    private m.a R;
    private g.a S;
    private boolean T;
    private final Runnable U;

    /* renamed from: g  reason: collision with root package name */
    private ActionMenuView f351g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f352h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f353i;

    /* renamed from: j  reason: collision with root package name */
    private ImageButton f354j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f355k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f356l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f357m;

    /* renamed from: n  reason: collision with root package name */
    ImageButton f358n;
    View o;
    private Context p;
    private int q;
    private int r;
    private int s;
    int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private o0 z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.M;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.N();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements m {

        /* renamed from: g  reason: collision with root package name */
        androidx.appcompat.view.menu.g f361g;

        /* renamed from: h  reason: collision with root package name */
        i f362h;

        d() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        public void b(Context context, androidx.appcompat.view.menu.g gVar) {
            i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f361g;
            if (!(gVar2 == null || (iVar = this.f362h) == null)) {
                gVar2.f(iVar);
            }
            this.f361g = gVar;
        }

        public void d(Parcelable parcelable) {
        }

        public boolean f(r rVar) {
            return false;
        }

        public void g(boolean z) {
            if (this.f362h != null) {
                androidx.appcompat.view.menu.g gVar = this.f361g;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f361g.getItem(i2) == this.f362h) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z2) {
                    k(this.f361g, this.f362h);
                }
            }
        }

        public int getId() {
            return 0;
        }

        public boolean i() {
            return false;
        }

        public Parcelable j() {
            return null;
        }

        public boolean k(androidx.appcompat.view.menu.g gVar, i iVar) {
            View view = Toolbar.this.o;
            if (view instanceof e.a.n.c) {
                ((e.a.n.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.o);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f358n);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.o = null;
            toolbar3.a();
            this.f362h = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        public boolean l(androidx.appcompat.view.menu.g gVar, i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f358n.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f358n);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f358n);
            }
            Toolbar.this.o = iVar.getActionView();
            this.f362h = iVar;
            ViewParent parent2 = Toolbar.this.o.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.o);
                }
                e m2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m2.a = 8388611 | (toolbar4.t & 112);
                m2.b = 2;
                toolbar4.o.setLayoutParams(m2);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.o);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.o;
            if (view instanceof e.a.n.c) {
                ((e.a.n.c) view).c();
            }
            return true;
        }

        public void m(m.a aVar) {
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.toolbarStyle);
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q2, max + measuredWidth, view.getMeasuredHeight() + q2);
        return max + measuredWidth + eVar.rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q2, max, view.getMeasuredHeight() + q2);
        return max - (measuredWidth + eVar.leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.U);
        post(this.U);
    }

    private boolean L() {
        if (!this.T) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z2 = u.x(this) == 1;
        int childCount = getChildCount();
        int b2 = e.h.k.e.b(i2, u.x(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && M(childAt) && p(eVar.a) == b2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && M(childAt2) && p(eVar2.a) == b2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.b = 1;
        if (!z2 || this.o == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.K.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new e.a.n.g(getContext());
    }

    private void h() {
        if (this.z == null) {
            this.z = new o0();
        }
    }

    private void i() {
        if (this.f355k == null) {
            this.f355k = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f351g.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f351g.getMenu();
            if (this.Q == null) {
                this.Q = new d();
            }
            this.f351g.setExpandedActionViewsExclusive(true);
            gVar.c(this.Q, this.p);
        }
    }

    private void k() {
        if (this.f351g == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f351g = actionMenuView;
            actionMenuView.setPopupTheme(this.q);
            this.f351g.setOnMenuItemClickListener(this.N);
            this.f351g.O(this.R, this.S);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388613 | (this.t & 112);
            this.f351g.setLayoutParams(m2);
            c(this.f351g, false);
        }
    }

    private void l() {
        if (this.f354j == null) {
            this.f354j = new m(getContext(), (AttributeSet) null, e.a.a.toolbarNavigationButtonStyle);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388611 | (this.t & 112);
            this.f354j.setLayoutParams(m2);
        }
    }

    private int p(int i2) {
        int x2 = u.x(this);
        int b2 = e.h.k.e.b(i2, x2) & 7;
        if (b2 == 1 || b2 == 3 || b2 == 5) {
            return b2;
        }
        return x2 == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r2 = r(eVar.a);
        if (r2 == 48) {
            return getPaddingTop() - i3;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = eVar.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = eVar.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.C & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.b(marginLayoutParams) + h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = eVar.leftMargin - i2;
            int i7 = eVar.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.K.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f351g;
        return actionMenuView != null && actionMenuView.J();
    }

    /* access modifiers changed from: package-private */
    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).b == 2 || childAt == this.f351g)) {
                removeViewAt(childCount);
                this.K.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.z.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.g gVar, c cVar) {
        if (gVar != null || this.f351g != null) {
            k();
            androidx.appcompat.view.menu.g N2 = this.f351g.N();
            if (N2 != gVar) {
                if (N2 != null) {
                    N2.Q(this.P);
                    N2.Q(this.Q);
                }
                if (this.Q == null) {
                    this.Q = new d();
                }
                cVar.H(true);
                if (gVar != null) {
                    gVar.c(cVar, this.p);
                    gVar.c(this.Q, this.p);
                } else {
                    cVar.b(this.p, (androidx.appcompat.view.menu.g) null);
                    this.Q.b(this.p, (androidx.appcompat.view.menu.g) null);
                    cVar.g(true);
                    this.Q.g(true);
                }
                this.f351g.setPopupTheme(this.q);
                this.f351g.setPresenter(cVar);
                this.P = cVar;
            }
        }
    }

    public void J(Context context, int i2) {
        this.s = i2;
        TextView textView = this.f353i;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void K(Context context, int i2) {
        this.r = i2;
        TextView textView = this.f352h;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f351g;
        return actionMenuView != null && actionMenuView.P();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.K.size() - 1; size >= 0; size--) {
            addView(this.K.get(size));
        }
        this.K.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f351g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f351g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        d dVar = this.Q;
        i iVar = dVar == null ? null : dVar.f362h;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f351g;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f358n == null) {
            m mVar = new m(getContext(), (AttributeSet) null, e.a.a.toolbarNavigationButtonStyle);
            this.f358n = mVar;
            mVar.setImageDrawable(this.f356l);
            this.f358n.setContentDescription(this.f357m);
            e m2 = generateDefaultLayoutParams();
            m2.a = 8388611 | (this.t & 112);
            m2.b = 2;
            this.f358n.setLayoutParams(m2);
            this.f358n.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f358n;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f358n;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.z;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.B;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.z;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.z;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.z;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.A;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f351g
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.B
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (u.x(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (u.x(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.A, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f355k;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f355k;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f351g.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f354j;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f354j;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f351g.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.p;
    }

    public int getPopupTheme() {
        return this.q;
    }

    public CharSequence getSubtitle() {
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f353i;
    }

    public CharSequence getTitle() {
        return this.D;
    }

    public int getTitleMarginBottom() {
        return this.y;
    }

    public int getTitleMarginEnd() {
        return this.w;
    }

    public int getTitleMarginStart() {
        return this.v;
    }

    public int getTitleMarginTop() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f352h;
    }

    public d0 getWrapper() {
        if (this.O == null) {
            this.O = new x0(this, true);
        }
        return this.O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0003a) {
            return new e((a.C0003a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.U);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a3 A[LOOP:0: B:101:0x02a1->B:102:0x02a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c5 A[LOOP:1: B:104:0x02c3->B:105:0x02c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fe A[LOOP:2: B:112:0x02fc->B:113:0x02fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = e.h.k.u.x(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.L
            r11[r2] = r3
            r11[r3] = r3
            int r12 = e.h.k.u.y(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f354j
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f354j
            int r13 = r0.C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f354j
            int r13 = r0.B(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f358n
            boolean r15 = r0.M(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f358n
            int r14 = r0.C(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f358n
            int r13 = r0.B(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f351g
            boolean r15 = r0.M(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f351g
            int r13 = r0.B(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f351g
            int r14 = r0.C(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.o
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.o
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.o
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f355k
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f355k
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f355k
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f352h
            boolean r13 = r0.M(r13)
            android.widget.TextView r14 = r0.f353i
            boolean r14 = r0.M(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f352h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f352h
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f353i
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f353i
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0294
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f352h
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f353i
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f353i
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f352h
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f352h
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f353i
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.C
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.x
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.y
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.y
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.x
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0229
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.v
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f352h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f352h
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f352h
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f352h
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.w
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021d
            android.widget.TextView r1 = r0.f353i
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f353i
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f353i
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f353i
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.w
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x021e
        L_0x021d:
            r3 = r10
        L_0x021e:
            if (r17 == 0) goto L_0x0225
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0225:
            r2 = r24
            goto L_0x0128
        L_0x0229:
            if (r17 == 0) goto L_0x022f
            int r7 = r0.v
            r1 = 0
            goto L_0x0231
        L_0x022f:
            r1 = 0
            r7 = 0
        L_0x0231:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0266
            android.widget.TextView r3 = r0.f352h
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.f352h
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f352h
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f352h
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.w
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0267
        L_0x0266:
            r4 = r2
        L_0x0267:
            if (r14 == 0) goto L_0x028d
            android.widget.TextView r3 = r0.f353i
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f353i
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.f353i
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f353i
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.w
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L_0x028e
        L_0x028d:
            r5 = r2
        L_0x028e:
            if (r17 == 0) goto L_0x0294
            int r2 = java.lang.Math.max(r4, r5)
        L_0x0294:
            java.util.ArrayList<android.view.View> r3 = r0.J
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.J
            int r3 = r3.size()
            r7 = 0
        L_0x02a1:
            if (r7 >= r3) goto L_0x02b4
            java.util.ArrayList<android.view.View> r4 = r0.J
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x02a1
        L_0x02b4:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.J
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.J
            int r3 = r3.size()
            r7 = 0
        L_0x02c3:
            if (r7 >= r3) goto L_0x02d4
            java.util.ArrayList<android.view.View> r4 = r0.J
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02c3
        L_0x02d4:
            java.util.ArrayList<android.view.View> r3 = r0.J
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.J
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02ef
            goto L_0x02f6
        L_0x02ef:
            if (r3 <= r10) goto L_0x02f5
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f6
        L_0x02f5:
            r2 = r6
        L_0x02f6:
            java.util.ArrayList<android.view.View> r3 = r0.J
            int r3 = r3.size()
        L_0x02fc:
            if (r1 >= r3) goto L_0x030d
            java.util.ArrayList<android.view.View> r4 = r0.J
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02fc
        L_0x030d:
            java.util.ArrayList<android.view.View> r1 = r0.J
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.L;
        int i11 = 0;
        if (c1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (M(this.f354j)) {
            E(this.f354j, i2, 0, i3, 0, this.u);
            i6 = this.f354j.getMeasuredWidth() + s(this.f354j);
            i5 = Math.max(0, this.f354j.getMeasuredHeight() + t(this.f354j));
            i4 = View.combineMeasuredStates(0, this.f354j.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (M(this.f358n)) {
            E(this.f358n, i2, 0, i3, 0, this.u);
            i6 = this.f358n.getMeasuredWidth() + s(this.f358n);
            i5 = Math.max(i5, this.f358n.getMeasuredHeight() + t(this.f358n));
            i4 = View.combineMeasuredStates(i4, this.f358n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (M(this.f351g)) {
            E(this.f351g, i2, max, i3, 0, this.u);
            i7 = this.f351g.getMeasuredWidth() + s(this.f351g);
            i5 = Math.max(i5, this.f351g.getMeasuredHeight() + t(this.f351g));
            i4 = View.combineMeasuredStates(i4, this.f351g.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (M(this.o)) {
            max2 += D(this.o, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.o.getMeasuredHeight() + t(this.o));
            i4 = View.combineMeasuredStates(i4, this.o.getMeasuredState());
        }
        if (M(this.f355k)) {
            max2 += D(this.f355k, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f355k.getMeasuredHeight() + t(this.f355k));
            i4 = View.combineMeasuredStates(i4, this.f355k.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && M(childAt)) {
                max2 += D(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.x + this.y;
        int i14 = this.v + this.w;
        if (M(this.f352h)) {
            D(this.f352h, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.f352h.getMeasuredWidth() + s(this.f352h);
            i8 = this.f352h.getMeasuredHeight() + t(this.f352h);
            i10 = View.combineMeasuredStates(i4, this.f352h.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (M(this.f353i)) {
            int i15 = i8 + i13;
            i9 = Math.max(i9, D(this.f353i, i2, max2 + i14, i3, i15, iArr));
            i8 += this.f353i.getMeasuredHeight() + t(this.f353i);
            i10 = View.combineMeasuredStates(i10, this.f353i.getMeasuredState());
        } else {
            int i16 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (!L()) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f351g;
        androidx.appcompat.view.menu.g N2 = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = gVar.f364i;
        if (!(i2 == 0 || this.Q == null || N2 == null || (findItem = N2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f365j) {
            F();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        o0 o0Var = this.z;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        o0Var.f(z2);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.Q;
        if (!(dVar == null || (iVar = dVar.f362h) == null)) {
            gVar.f364i = iVar.getItemId();
        }
        gVar.f365j = A();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(e.a.k.a.a.d(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.T = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i2 != this.B) {
            this.B = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i2 != this.A) {
            this.A = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(e.a.k.a.a.d(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(e.a.k.a.a.d(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f354j.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.M = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f351g.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.q != i2) {
            this.q = i2;
            if (i2 == 0) {
                this.p = getContext();
            } else {
                this.p = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.y = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.x = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public boolean v() {
        d dVar = this.Q;
        return (dVar == null || dVar.f362h == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f351g;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f351g;
        return actionMenuView != null && actionMenuView.I();
    }

    public static class e extends a.C0003a {
        int b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 8388627;
        }

        public e(e eVar) {
            super((a.C0003a) eVar);
            this.b = eVar.b;
        }

        public e(a.C0003a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.C = 8388627;
        this.J = new ArrayList<>();
        this.K = new ArrayList<>();
        this.L = new int[2];
        this.N = new a();
        this.U = new b();
        w0 u2 = w0.u(getContext(), attributeSet, j.Toolbar, i2, 0);
        this.r = u2.n(j.Toolbar_titleTextAppearance, 0);
        this.s = u2.n(j.Toolbar_subtitleTextAppearance, 0);
        this.C = u2.l(j.Toolbar_android_gravity, this.C);
        this.t = u2.l(j.Toolbar_buttonGravity, 48);
        int e2 = u2.e(j.Toolbar_titleMargin, 0);
        e2 = u2.r(j.Toolbar_titleMargins) ? u2.e(j.Toolbar_titleMargins, e2) : e2;
        this.y = e2;
        this.x = e2;
        this.w = e2;
        this.v = e2;
        int e3 = u2.e(j.Toolbar_titleMarginStart, -1);
        if (e3 >= 0) {
            this.v = e3;
        }
        int e4 = u2.e(j.Toolbar_titleMarginEnd, -1);
        if (e4 >= 0) {
            this.w = e4;
        }
        int e5 = u2.e(j.Toolbar_titleMarginTop, -1);
        if (e5 >= 0) {
            this.x = e5;
        }
        int e6 = u2.e(j.Toolbar_titleMarginBottom, -1);
        if (e6 >= 0) {
            this.y = e6;
        }
        this.u = u2.f(j.Toolbar_maxButtonHeight, -1);
        int e7 = u2.e(j.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int e8 = u2.e(j.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int f2 = u2.f(j.Toolbar_contentInsetLeft, 0);
        int f3 = u2.f(j.Toolbar_contentInsetRight, 0);
        h();
        this.z.e(f2, f3);
        if (!(e7 == Integer.MIN_VALUE && e8 == Integer.MIN_VALUE)) {
            this.z.g(e7, e8);
        }
        this.A = u2.e(j.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.B = u2.e(j.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.f356l = u2.g(j.Toolbar_collapseIcon);
        this.f357m = u2.p(j.Toolbar_collapseContentDescription);
        CharSequence p2 = u2.p(j.Toolbar_title);
        if (!TextUtils.isEmpty(p2)) {
            setTitle(p2);
        }
        CharSequence p3 = u2.p(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p3)) {
            setSubtitle(p3);
        }
        this.p = getContext();
        setPopupTheme(u2.n(j.Toolbar_popupTheme, 0));
        Drawable g2 = u2.g(j.Toolbar_navigationIcon);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence p4 = u2.p(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p4)) {
            setNavigationContentDescription(p4);
        }
        Drawable g3 = u2.g(j.Toolbar_logo);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence p5 = u2.p(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p5)) {
            setLogoDescription(p5);
        }
        if (u2.r(j.Toolbar_titleTextColor)) {
            setTitleTextColor(u2.c(j.Toolbar_titleTextColor));
        }
        if (u2.r(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(u2.c(j.Toolbar_subtitleTextColor));
        }
        if (u2.r(j.Toolbar_menu)) {
            x(u2.n(j.Toolbar_menu, 0));
        }
        u2.v();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f358n;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f358n.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f358n;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f356l);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f355k)) {
                c(this.f355k, true);
            }
        } else {
            ImageView imageView = this.f355k;
            if (imageView != null && y(imageView)) {
                removeView(this.f355k);
                this.K.remove(this.f355k);
            }
        }
        ImageView imageView2 = this.f355k;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f355k;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f354j;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f354j)) {
                c(this.f354j, true);
            }
        } else {
            ImageButton imageButton = this.f354j;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f354j);
                this.K.remove(this.f354j);
            }
        }
        ImageButton imageButton2 = this.f354j;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f353i == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f353i = zVar;
                zVar.setSingleLine();
                this.f353i.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.s;
                if (i2 != 0) {
                    this.f353i.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.f353i.setTextColor(colorStateList);
                }
            }
            if (!y(this.f353i)) {
                c(this.f353i, true);
            }
        } else {
            TextView textView = this.f353i;
            if (textView != null && y(textView)) {
                removeView(this.f353i);
                this.K.remove(this.f353i);
            }
        }
        TextView textView2 = this.f353i;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        TextView textView = this.f353i;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f352h == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f352h = zVar;
                zVar.setSingleLine();
                this.f352h.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.r;
                if (i2 != 0) {
                    this.f352h.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.f352h.setTextColor(colorStateList);
                }
            }
            if (!y(this.f352h)) {
                c(this.f352h, true);
            }
        } else {
            TextView textView = this.f352h;
            if (textView != null && y(textView)) {
                removeView(this.f352h);
                this.K.remove(this.f352h);
            }
        }
        TextView textView2 = this.f352h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        TextView textView = this.f352h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends e.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        int f364i;

        /* renamed from: j  reason: collision with root package name */
        boolean f365j;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f364i = parcel.readInt();
            this.f365j = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f364i);
            parcel.writeInt(this.f365j ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
