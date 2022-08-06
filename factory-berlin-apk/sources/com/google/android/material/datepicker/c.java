package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import g.b.a.c.l;
import g.b.a.c.z.b;

/* compiled from: CalendarStyle */
final class c {
    final b a;
    final b b;
    final b c;

    /* renamed from: d  reason: collision with root package name */
    final b f3504d;

    /* renamed from: e  reason: collision with root package name */
    final b f3505e;

    /* renamed from: f  reason: collision with root package name */
    final b f3506f;

    /* renamed from: g  reason: collision with root package name */
    final b f3507g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f3508h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.c(context, g.b.a.c.b.materialCalendarStyle, h.class.getCanonicalName()), l.MaterialCalendar);
        this.a = b.a(context, obtainStyledAttributes.getResourceId(l.MaterialCalendar_dayStyle, 0));
        this.f3507g = b.a(context, obtainStyledAttributes.getResourceId(l.MaterialCalendar_dayInvalidStyle, 0));
        this.b = b.a(context, obtainStyledAttributes.getResourceId(l.MaterialCalendar_daySelectedStyle, 0));
        this.c = b.a(context, obtainStyledAttributes.getResourceId(l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a2 = g.b.a.c.z.c.a(context, obtainStyledAttributes, l.MaterialCalendar_rangeFillColor);
        this.f3504d = b.a(context, obtainStyledAttributes.getResourceId(l.MaterialCalendar_yearStyle, 0));
        this.f3505e = b.a(context, obtainStyledAttributes.getResourceId(l.MaterialCalendar_yearSelectedStyle, 0));
        this.f3506f = b.a(context, obtainStyledAttributes.getResourceId(l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f3508h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
