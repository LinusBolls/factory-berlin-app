package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* compiled from: MonthAdapter */
class m extends BaseAdapter {

    /* renamed from: k  reason: collision with root package name */
    static final int f3535k = r.k().getMaximum(4);

    /* renamed from: g  reason: collision with root package name */
    final l f3536g;

    /* renamed from: h  reason: collision with root package name */
    final d<?> f3537h;

    /* renamed from: i  reason: collision with root package name */
    c f3538i;

    /* renamed from: j  reason: collision with root package name */
    final a f3539j;

    m(l lVar, d<?> dVar, a aVar) {
        this.f3536g = lVar;
        this.f3537h = dVar;
        this.f3539j = aVar;
    }

    private void e(Context context) {
        if (this.f3538i == null) {
            this.f3538i = new c(context);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        return b() + (i2 - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f3536g.i();
    }

    /* renamed from: c */
    public Long getItem(int i2) {
        if (i2 < this.f3536g.i() || i2 > h()) {
            return null;
        }
        return Long.valueOf(this.f3536g.j(i(i2)));
    }

    /* JADX WARNING: type inference failed for: r7v19, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = g.b.a.c.h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x0061
            com.google.android.material.datepicker.l r2 = r5.f3536g
            int r3 = r2.f3533l
            if (r7 < r3) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f3536g
            long r2 = r2.j(r7)
            com.google.android.material.datepicker.l r7 = r5.f3536g
            int r7 = r7.f3531j
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.p()
            int r4 = r4.f3531j
            if (r7 != r4) goto L_0x0053
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r2)
            r0.setContentDescription(r7)
            goto L_0x005a
        L_0x0053:
            java.lang.String r7 = com.google.android.material.datepicker.e.c(r2)
            r0.setContentDescription(r7)
        L_0x005a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0069
        L_0x0061:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0069:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0070
            return r0
        L_0x0070:
            com.google.android.material.datepicker.a r7 = r5.f3539j
            com.google.android.material.datepicker.a$c r7 = r7.e()
            long r2 = r6.longValue()
            boolean r7 = r7.F(r2)
            if (r7 == 0) goto L_0x00d5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f3537h
            java.util.Collection r7 = r7.U()
            java.util.Iterator r7 = r7.iterator()
        L_0x008d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.r.a(r3)
            long r1 = com.google.android.material.datepicker.r.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            com.google.android.material.datepicker.c r6 = r5.f3538i
            com.google.android.material.datepicker.b r6 = r6.b
            r6.d(r0)
            return r0
        L_0x00b5:
            java.util.Calendar r7 = com.google.android.material.datepicker.r.i()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
            com.google.android.material.datepicker.c r6 = r5.f3538i
            com.google.android.material.datepicker.b r6 = r6.c
            r6.d(r0)
            return r0
        L_0x00cd:
            com.google.android.material.datepicker.c r6 = r5.f3538i
            com.google.android.material.datepicker.b r6 = r6.a
            r6.d(r0)
            return r0
        L_0x00d5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f3538i
            com.google.android.material.datepicker.b r6 = r6.f3507g
            r6.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    public boolean f(int i2) {
        return i2 % this.f3536g.f3532k == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i2) {
        return (i2 + 1) % this.f3536g.f3532k == 0;
    }

    public int getCount() {
        return this.f3536g.f3533l + b();
    }

    public long getItemId(int i2) {
        return (long) (i2 / this.f3536g.f3532k);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return (this.f3536g.i() + this.f3536g.f3533l) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int i(int i2) {
        return (i2 - this.f3536g.i()) + 1;
    }

    /* access modifiers changed from: package-private */
    public boolean j(int i2) {
        return i2 >= b() && i2 <= h();
    }
}
