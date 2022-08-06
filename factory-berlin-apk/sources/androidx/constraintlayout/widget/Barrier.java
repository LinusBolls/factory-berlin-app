package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import e.f.a.j.b;

public class Barrier extends a {

    /* renamed from: m  reason: collision with root package name */
    private int f581m;

    /* renamed from: n  reason: collision with root package name */
    private int f582n;
    private b o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void b(AttributeSet attributeSet) {
        super.b(attributeSet);
        this.o = new b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == f.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.o.K0(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f605j = this.o;
        f();
    }

    public int getType() {
        return this.f581m;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.K0(z);
    }

    public void setType(int i2) {
        this.f581m = i2;
        this.f582n = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.f581m;
                if (i3 == 5) {
                    this.f582n = 1;
                } else if (i3 == 6) {
                    this.f582n = 0;
                }
            } else {
                int i4 = this.f581m;
                if (i4 == 5) {
                    this.f582n = 0;
                } else if (i4 == 6) {
                    this.f582n = 1;
                }
            }
        } else if (i2 == 5) {
            this.f582n = 0;
        } else if (i2 == 6) {
            this.f582n = 1;
        }
        this.o.L0(this.f582n);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
