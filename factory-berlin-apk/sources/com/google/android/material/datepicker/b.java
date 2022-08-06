package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import e.h.j.h;
import e.h.k.u;
import g.b.a.c.c0.g;
import g.b.a.c.c0.k;
import g.b.a.c.l;
import g.b.a.c.z.c;

/* compiled from: CalendarItemStyle */
final class b {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f3501d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3502e;

    /* renamed from: f  reason: collision with root package name */
    private final k f3503f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, k kVar, Rect rect) {
        h.b(rect.left);
        h.b(rect.top);
        h.b(rect.right);
        h.b(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.f3501d = colorStateList3;
        this.f3502e = i2;
        this.f3503f = kVar;
    }

    static b a(Context context, int i2) {
        h.a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a2 = c.a(context, obtainStyledAttributes, l.MaterialCalendarItem_itemFillColor);
        ColorStateList a3 = c.a(context, obtainStyledAttributes, l.MaterialCalendarItem_itemTextColor);
        ColorStateList a4 = c.a(context, obtainStyledAttributes, l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(l.MaterialCalendarItem_itemStrokeWidth, 0);
        k m2 = k.b(context, obtainStyledAttributes.getResourceId(l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a2, a3, a4, dimensionPixelSize, m2, rect);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.a.bottom;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.a.top;
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView) {
        g gVar = new g();
        g gVar2 = new g();
        gVar.setShapeAppearanceModel(this.f3503f);
        gVar2.setShapeAppearanceModel(this.f3503f);
        gVar.U(this.c);
        gVar.b0((float) this.f3502e, this.f3501d);
        textView.setTextColor(this.b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.a;
        u.h0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
