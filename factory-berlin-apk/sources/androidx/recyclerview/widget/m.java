package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import e.h.k.u;
import e.q.c;

/* compiled from: ItemTouchUIUtilImpl */
class m implements l {
    static final l a = new m();

    m() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != view) {
                float s = u.s(childAt);
                if (s > f2) {
                    f2 = s;
                }
            }
        }
        return f2;
    }

    public void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(c.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                u.l0(view, ((Float) tag).floatValue());
            }
            view.setTag(c.item_touch_helper_previous_elevation, (Object) null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void b(View view) {
    }

    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z) {
    }

    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(c.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(u.s(view));
            u.l0(view, e(recyclerView, view) + 1.0f);
            view.setTag(c.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
