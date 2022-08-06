package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import g.b.a.c.j;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: YearGridAdapter */
class s extends RecyclerView.g<b> {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final h<?> f3546i;

    /* compiled from: YearGridAdapter */
    class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f3547g;

        a(int i2) {
            this.f3547g = i2;
        }

        public void onClick(View view) {
            s.this.f3546i.j2(l.f(this.f3547g, s.this.f3546i.d2().f3530i));
            s.this.f3546i.k2(h.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter */
    public static class b extends RecyclerView.d0 {
        final TextView t;

        b(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    s(h<?> hVar) {
        this.f3546i = hVar;
    }

    private View.OnClickListener J(int i2) {
        return new a(i2);
    }

    /* access modifiers changed from: package-private */
    public int K(int i2) {
        return i2 - this.f3546i.b2().i().f3531j;
    }

    /* access modifiers changed from: package-private */
    public int L(int i2) {
        return this.f3546i.b2().i().f3531j + i2;
    }

    /* renamed from: M */
    public void x(b bVar, int i2) {
        int L = L(i2);
        String string = bVar.t.getContext().getString(j.mtrl_picker_navigate_to_year_description);
        bVar.t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(L)}));
        bVar.t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(L)}));
        c c2 = this.f3546i.c2();
        Calendar i3 = r.i();
        b bVar2 = i3.get(1) == L ? c2.f3506f : c2.f3504d;
        for (Long longValue : this.f3546i.e2().U()) {
            i3.setTimeInMillis(longValue.longValue());
            if (i3.get(1) == L) {
                bVar2 = c2.f3505e;
            }
        }
        bVar2.d(bVar.t);
        bVar.t.setOnClickListener(J(L));
    }

    /* renamed from: N */
    public b z(ViewGroup viewGroup, int i2) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(g.b.a.c.h.mtrl_calendar_year, viewGroup, false));
    }

    public int d() {
        return this.f3546i.b2().j();
    }
}
