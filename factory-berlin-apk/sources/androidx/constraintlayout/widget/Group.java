package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends a {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void b(AttributeSet attributeSet) {
        super.b(attributeSet);
        this.f606k = false;
    }

    public void c(ConstraintLayout constraintLayout) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.k0.y0(0);
        aVar.k0.b0(0);
    }

    public void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f603h; i2++) {
            View e2 = constraintLayout.e(this.f602g[i2]);
            if (e2 != null) {
                e2.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    e2.setElevation(elevation);
                }
            }
        }
    }
}
