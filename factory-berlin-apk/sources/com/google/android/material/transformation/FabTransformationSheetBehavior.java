package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import e.h.k.u;
import g.b.a.c.a;
import g.b.a.c.m.h;
import g.b.a.c.m.j;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    private Map<View, Integer> f3696i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f3696i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f3696i;
                        if (map != null && map.containsKey(childAt)) {
                            u.o0(childAt, this.f3696i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f3696i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        u.o0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f3696i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean H(View view, View view2, boolean z, boolean z2) {
        g0(view2, z);
        return super.H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    public FabTransformationBehavior.e e0(Context context, boolean z) {
        int i2;
        if (z) {
            i2 = a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i2 = a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.a = h.c(context, i2);
        eVar.b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
