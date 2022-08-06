package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import e.h.k.u;
import g.b.a.c.f;

/* compiled from: MonthsPagerAdapter */
class n extends RecyclerView.g<b> {

    /* renamed from: i  reason: collision with root package name */
    private final a f3540i;

    /* renamed from: j  reason: collision with root package name */
    private final d<?> f3541j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final h.l f3542k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3543l;

    /* compiled from: MonthsPagerAdapter */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f3544g;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f3544g = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (this.f3544g.getAdapter().j(i2)) {
                n.this.f3542k.a(this.f3544g.getAdapter().getItem(i2).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter */
    public static class b extends RecyclerView.d0 {
        final TextView t;
        final MaterialCalendarGridView u;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(f.month_title);
            this.t = textView;
            u.f0(textView, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(f.month_grid);
            if (!z) {
                this.t.setVisibility(8);
            }
        }
    }

    n(Context context, d<?> dVar, a aVar, h.l lVar) {
        l i2 = aVar.i();
        l f2 = aVar.f();
        l h2 = aVar.h();
        if (i2.compareTo(h2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (h2.compareTo(f2) <= 0) {
            this.f3543l = (m.f3535k * h.f2(context)) + (i.u2(context) ? h.f2(context) : 0);
            this.f3540i = aVar;
            this.f3541j = dVar;
            this.f3542k = lVar;
            G(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public l J(int i2) {
        return this.f3540i.i().n(i2);
    }

    /* access modifiers changed from: package-private */
    public CharSequence K(int i2) {
        return J(i2).k();
    }

    /* access modifiers changed from: package-private */
    public int L(l lVar) {
        return this.f3540i.i().o(lVar);
    }

    /* renamed from: M */
    public void x(b bVar, int i2) {
        l n2 = this.f3540i.i().n(i2);
        bVar.t.setText(n2.k());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !n2.equals(materialCalendarGridView.getAdapter().f3536g)) {
            m mVar = new m(n2, this.f3541j, this.f3540i);
            materialCalendarGridView.setNumColumns(n2.f3532k);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: N */
    public b z(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(g.b.a.c.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!i.u2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f3543l));
        return new b(linearLayout, true);
    }

    public int d() {
        return this.f3540i.g();
    }

    public long i(int i2) {
        return this.f3540i.i().n(i2).l();
    }
}
