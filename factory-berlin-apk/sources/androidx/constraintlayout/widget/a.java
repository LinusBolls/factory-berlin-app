package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import e.f.a.j.j;
import java.util.Arrays;

/* compiled from: ConstraintHelper */
public abstract class a extends View {

    /* renamed from: g  reason: collision with root package name */
    protected int[] f602g = new int[32];

    /* renamed from: h  reason: collision with root package name */
    protected int f603h;

    /* renamed from: i  reason: collision with root package name */
    protected Context f604i;

    /* renamed from: j  reason: collision with root package name */
    protected j f605j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f606k = false;

    /* renamed from: l  reason: collision with root package name */
    private String f607l;

    public a(Context context) {
        super(context);
        this.f604i = context;
        b((AttributeSet) null);
    }

    private void a(String str) {
        int i2;
        Object c;
        if (str != null && this.f604i != null) {
            String trim = str.trim();
            try {
                i2 = e.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = this.f604i.getResources().getIdentifier(trim, "id", this.f604i.getPackageName());
            }
            if (i2 == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (c = ((ConstraintLayout) getParent()).c(0, trim)) != null && (c instanceof Integer)) {
                i2 = ((Integer) c).intValue();
            }
            if (i2 != 0) {
                setTag(i2, (Object) null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i2 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == f.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f607l = string;
                    setIds(string);
                }
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f607l);
        }
        j jVar = this.f605j;
        if (jVar != null) {
            jVar.J0();
            for (int i2 = 0; i2 < this.f603h; i2++) {
                View e2 = constraintLayout.e(this.f602g[i2]);
                if (e2 != null) {
                    this.f605j.I0(constraintLayout.f(e2));
                }
            }
        }
    }

    public void f() {
        if (this.f605j != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).k0 = this.f605j;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f602g, this.f603h);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f606k) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f603h = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i2, Object obj) {
        int i3 = this.f603h + 1;
        int[] iArr = this.f602g;
        if (i3 > iArr.length) {
            this.f602g = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f602g;
        int i4 = this.f603h;
        iArr2[i4] = i2;
        this.f603h = i4 + 1;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f604i = context;
        b(attributeSet);
    }
}
