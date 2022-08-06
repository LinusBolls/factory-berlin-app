package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.material.button.MaterialButton;
import e.h.k.u;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar */
public final class h<S> extends p<S> {
    static final Object o0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object p0 = "NAVIGATION_PREV_TAG";
    static final Object q0 = "NAVIGATION_NEXT_TAG";
    static final Object r0 = "SELECTOR_TOGGLE_TAG";
    private int e0;
    /* access modifiers changed from: private */
    public d<S> f0;
    /* access modifiers changed from: private */
    public a g0;
    /* access modifiers changed from: private */
    public l h0;
    private k i0;
    /* access modifiers changed from: private */
    public c j0;
    /* access modifiers changed from: private */
    public RecyclerView k0;
    /* access modifiers changed from: private */
    public RecyclerView l0;
    private View m0;
    /* access modifiers changed from: private */
    public View n0;

    /* compiled from: MaterialCalendar */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f3514g;

        a(int i2) {
            this.f3514g = i2;
        }

        public void run() {
            h.this.l0.smoothScrollToPosition(this.f3514g);
        }
    }

    /* compiled from: MaterialCalendar */
    class b extends e.h.k.a {
        b(h hVar) {
        }

        public void g(View view, e.h.k.d0.c cVar) {
            super.g(view, cVar);
            cVar.Y((Object) null);
        }
    }

    /* compiled from: MaterialCalendar */
    class c extends q {
        final /* synthetic */ int I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.I = i3;
        }

        /* access modifiers changed from: protected */
        public void N1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = h.this.l0.getWidth();
                iArr[1] = h.this.l0.getWidth();
                return;
            }
            iArr[0] = h.this.l0.getHeight();
            iArr[1] = h.this.l0.getHeight();
        }
    }

    /* compiled from: MaterialCalendar */
    class d implements l {
        d() {
        }

        public void a(long j2) {
            if (h.this.g0.e().F(j2)) {
                h.this.f0.r0(j2);
                Iterator it = h.this.d0.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(h.this.f0.b0());
                }
                h.this.l0.getAdapter().r();
                if (h.this.k0 != null) {
                    h.this.k0.getAdapter().r();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar */
    class e extends RecyclerView.n {
        private final Calendar a = r.k();
        private final Calendar b = r.k();

        e() {
        }

        public void j(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i2;
            if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                s sVar = (s) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (e.h.j.d next : h.this.f0.D()) {
                    F f2 = next.a;
                    if (!(f2 == null || next.b == null)) {
                        this.a.setTimeInMillis(((Long) f2).longValue());
                        this.b.setTimeInMillis(((Long) next.b).longValue());
                        int K = sVar.K(this.a.get(1));
                        int K2 = sVar.K(this.b.get(1));
                        View D = gridLayoutManager.D(K);
                        View D2 = gridLayoutManager.D(K2);
                        int Z2 = K / gridLayoutManager.Z2();
                        int Z22 = K2 / gridLayoutManager.Z2();
                        int i3 = Z2;
                        while (i3 <= Z22) {
                            View D3 = gridLayoutManager.D(gridLayoutManager.Z2() * i3);
                            if (D3 != null) {
                                int top = D3.getTop() + h.this.j0.f3504d.c();
                                int bottom = D3.getBottom() - h.this.j0.f3504d.b();
                                int left = i3 == Z2 ? D.getLeft() + (D.getWidth() / 2) : 0;
                                if (i3 == Z22) {
                                    i2 = D2.getLeft() + (D2.getWidth() / 2);
                                } else {
                                    i2 = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i2, (float) bottom, h.this.j0.f3508h);
                            }
                            i3++;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar */
    class f extends e.h.k.a {
        f() {
        }

        public void g(View view, e.h.k.d0.c cVar) {
            String str;
            super.g(view, cVar);
            if (h.this.n0.getVisibility() == 0) {
                str = h.this.X(g.b.a.c.j.mtrl_picker_toggle_to_year_selection);
            } else {
                str = h.this.X(g.b.a.c.j.mtrl_picker_toggle_to_day_selection);
            }
            cVar.h0(str);
        }
    }

    /* compiled from: MaterialCalendar */
    class g extends RecyclerView.t {
        final /* synthetic */ n a;
        final /* synthetic */ MaterialButton b;

        g(n nVar, MaterialButton materialButton) {
            this.a = nVar;
            this.b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                CharSequence text = this.b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
            int i4;
            if (i2 < 0) {
                i4 = h.this.g2().a2();
            } else {
                i4 = h.this.g2().d2();
            }
            l unused = h.this.h0 = this.a.J(i4);
            this.b.setText(this.a.K(i4));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h  reason: collision with other inner class name */
    /* compiled from: MaterialCalendar */
    class C0075h implements View.OnClickListener {
        C0075h() {
        }

        public void onClick(View view) {
            h.this.l2();
        }
    }

    /* compiled from: MaterialCalendar */
    class i implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f3518g;

        i(n nVar) {
            this.f3518g = nVar;
        }

        public void onClick(View view) {
            int a2 = h.this.g2().a2() + 1;
            if (a2 < h.this.l0.getAdapter().d()) {
                h.this.j2(this.f3518g.J(a2));
            }
        }
    }

    /* compiled from: MaterialCalendar */
    class j implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f3520g;

        j(n nVar) {
            this.f3520g = nVar;
        }

        public void onClick(View view) {
            int d2 = h.this.g2().d2() - 1;
            if (d2 >= 0) {
                h.this.j2(this.f3520g.J(d2));
            }
        }
    }

    /* compiled from: MaterialCalendar */
    enum k {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar */
    interface l {
        void a(long j2);
    }

    private void Z1(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(g.b.a.c.f.month_navigation_fragment_toggle);
        materialButton.setTag(r0);
        u.e0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(g.b.a.c.f.month_navigation_previous);
        materialButton2.setTag(p0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(g.b.a.c.f.month_navigation_next);
        materialButton3.setTag(q0);
        this.m0 = view.findViewById(g.b.a.c.f.mtrl_calendar_year_selector_frame);
        this.n0 = view.findViewById(g.b.a.c.f.mtrl_calendar_day_selector_frame);
        k2(k.DAY);
        materialButton.setText(this.h0.k());
        this.l0.addOnScrollListener(new g(nVar, materialButton));
        materialButton.setOnClickListener(new C0075h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.n a2() {
        return new e();
    }

    static int f2(Context context) {
        return context.getResources().getDimensionPixelSize(g.b.a.c.d.mtrl_calendar_day_height);
    }

    static <T> h<T> h2(d<T> dVar, int i2, a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.h());
        hVar.D1(bundle);
        return hVar;
    }

    private void i2(int i2) {
        this.l0.post(new a(i2));
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C(), this.e0);
        this.j0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        l i4 = this.g0.i();
        if (i.u2(contextThemeWrapper)) {
            i3 = g.b.a.c.h.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = g.b.a.c.h.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(g.b.a.c.f.mtrl_calendar_days_of_week);
        u.e0(gridView, new b(this));
        gridView.setAdapter(new g());
        gridView.setNumColumns(i4.f3532k);
        gridView.setEnabled(false);
        this.l0 = (RecyclerView) inflate.findViewById(g.b.a.c.f.mtrl_calendar_months);
        this.l0.setLayoutManager(new c(C(), i2, false, i2));
        this.l0.setTag(o0);
        n nVar = new n(contextThemeWrapper, this.f0, this.g0, new d());
        this.l0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(g.b.a.c.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(g.b.a.c.f.mtrl_calendar_year_selector_frame);
        this.k0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.k0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.k0.setAdapter(new s(this));
            this.k0.addItemDecoration(a2());
        }
        if (inflate.findViewById(g.b.a.c.f.month_navigation_fragment_toggle) != null) {
            Z1(inflate, nVar);
        }
        if (!i.u2(contextThemeWrapper)) {
            new p().b(this.l0);
        }
        this.l0.scrollToPosition(nVar.L(this.h0));
        return inflate;
    }

    public void S0(Bundle bundle) {
        super.S0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.g0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.h0);
    }

    /* access modifiers changed from: package-private */
    public a b2() {
        return this.g0;
    }

    /* access modifiers changed from: package-private */
    public c c2() {
        return this.j0;
    }

    /* access modifiers changed from: package-private */
    public l d2() {
        return this.h0;
    }

    public d<S> e2() {
        return this.f0;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager g2() {
        return (LinearLayoutManager) this.l0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void j2(l lVar) {
        n nVar = (n) this.l0.getAdapter();
        int L = nVar.L(lVar);
        int L2 = L - nVar.L(this.h0);
        boolean z = true;
        boolean z2 = Math.abs(L2) > 3;
        if (L2 <= 0) {
            z = false;
        }
        this.h0 = lVar;
        if (z2 && z) {
            this.l0.scrollToPosition(L - 3);
            i2(L);
        } else if (z2) {
            this.l0.scrollToPosition(L + 3);
            i2(L);
        } else {
            i2(L);
        }
    }

    /* access modifiers changed from: package-private */
    public void k2(k kVar) {
        this.i0 = kVar;
        if (kVar == k.YEAR) {
            this.k0.getLayoutManager().y1(((s) this.k0.getAdapter()).K(this.h0.f3531j));
            this.m0.setVisibility(0);
            this.n0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.m0.setVisibility(8);
            this.n0.setVisibility(0);
            j2(this.h0);
        }
    }

    /* access modifiers changed from: package-private */
    public void l2() {
        k kVar = this.i0;
        if (kVar == k.YEAR) {
            k2(k.DAY);
        } else if (kVar == k.DAY) {
            k2(k.YEAR);
        }
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = A();
        }
        this.e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.g0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.h0 = (l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
