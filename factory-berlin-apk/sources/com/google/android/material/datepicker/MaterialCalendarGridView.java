package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import e.h.j.d;
import e.h.k.d0.c;
import e.h.k.u;
import g.b.a.c.f;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: g  reason: collision with root package name */
    private final Calendar f3491g;

    class a extends e.h.k.a {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.Y((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2, Rect rect) {
        if (i2 == 33) {
            setSelection(getAdapter().h());
        } else if (i2 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l2, Long l3, Long l4, Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    /* renamed from: b */
    public m getAdapter() {
        return (m) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m b = getAdapter();
        d<?> dVar = b.f3537h;
        c cVar = b.f3538i;
        Long c = b.getItem(b.b());
        Long c2 = b.getItem(b.h());
        for (d next : dVar.D()) {
            F f2 = next.a;
            if (f2 != null) {
                if (next.b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f2).longValue();
                    long longValue2 = ((Long) next.b).longValue();
                    if (!d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < c.longValue()) {
                            i3 = b.b();
                            if (b.f(i3)) {
                                i2 = 0;
                            } else {
                                i2 = materialCalendarGridView.getChildAt(i3 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.f3491g.setTimeInMillis(longValue);
                            i3 = b.a(materialCalendarGridView.f3491g.get(5));
                            i2 = c(materialCalendarGridView.getChildAt(i3));
                        }
                        if (longValue2 > c2.longValue()) {
                            i5 = b.h();
                            if (b.g(i5)) {
                                i4 = getWidth();
                            } else {
                                i4 = materialCalendarGridView.getChildAt(i5).getRight();
                            }
                        } else {
                            materialCalendarGridView.f3491g.setTimeInMillis(longValue2);
                            i5 = b.a(materialCalendarGridView.f3491g.get(5));
                            i4 = c(materialCalendarGridView.getChildAt(i5));
                        }
                        int itemId = (int) b.getItemId(i3);
                        int itemId2 = (int) b.getItemId(i5);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i3 ? 0 : i2), (float) (childAt.getTop() + cVar.a.c()), (float) (i5 > numColumns2 ? getWidth() : i4), (float) (childAt.getBottom() - cVar.a.b()), cVar.f3508h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            a(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void setSelection(int i2) {
        if (i2 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i2);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3491g = r.k();
        if (i.u2(getContext())) {
            setNextFocusLeftId(f.cancel_button);
            setNextFocusRightId(f.confirm_button);
        }
        u.e0(this, new a(this));
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof m) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()}));
        }
    }
}
