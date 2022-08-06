package com.sensorberg.smartworkspace.app.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.a0.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: IotDeviceDetailButtonRow.kt */
public final class a extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    private List<? extends View> f8042g;

    /* renamed from: h  reason: collision with root package name */
    private ValueAnimator f8043h;

    /* renamed from: i  reason: collision with root package name */
    private f f8044i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C0540a f8045j;

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f8046k = new b(this);

    /* renamed from: com.sensorberg.smartworkspace.app.widgets.a$a  reason: collision with other inner class name */
    /* compiled from: IotDeviceDetailButtonRow.kt */
    public interface C0540a {
        void a(int i2);
    }

    /* compiled from: IotDeviceDetailButtonRow.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f8047g;

        b(a aVar) {
            this.f8047g = aVar;
        }

        public final void onClick(View view) {
            int childCount = this.f8047g.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f8047g.getChildAt(i2);
                if (k.a(childAt, view)) {
                    k.d(childAt, "current");
                    childAt.setSelected(true);
                    C0540a a = this.f8047g.f8045j;
                    if (a != null) {
                        a.a(i2);
                    }
                } else {
                    k.d(childAt, "current");
                    childAt.setSelected(false);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        e.a.a(this);
        setOrientation(0);
    }

    private final void b(String str, int i2, int i3, int i4, int i5, Drawable drawable) {
        Drawable.ConstantState constantState;
        Drawable mutate;
        f fVar = new f(getContext());
        fVar.setText(str);
        if (!(drawable == null || (constantState = drawable.getConstantState()) == null)) {
            Context context = getContext();
            k.d(context, "context");
            Drawable newDrawable = constantState.newDrawable(context.getResources());
            if (!(newDrawable == null || (mutate = newDrawable.mutate()) == null)) {
                drawable = mutate;
            }
        }
        fVar.setBackground(drawable);
        fVar.setMinHeight(i2);
        fVar.setTextSize(0, (float) i3);
        fVar.setTextColor(i5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginEnd(i4);
        x xVar = x.a;
        fVar.setLayoutParams(layoutParams);
        fVar.setOnClickListener(this.f8046k);
        addView(fVar);
    }

    private final void c() {
        ValueAnimator valueAnimator;
        List<? extends View> list = this.f8042g;
        if (list != null && (valueAnimator = this.f8043h) != null) {
            this.f8044i = new f(list, valueAnimator);
        }
    }

    public final void d(int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            k.d(childAt, "getChildAt(i)");
            childAt.setSelected(i2 == i3);
            i3++;
        }
    }

    public final void e(int i2, int i3, int i4, int i5, List<String> list, Drawable drawable) {
        k.e(list, "texts");
        f fVar = this.f8044i;
        if (fVar != null) {
            fVar.c(false);
        }
        removeAllViews();
        int i6 = 0;
        for (T next : list) {
            int i7 = i6 + 1;
            if (i6 >= 0) {
                b((String) next, i2, i3, i6 == list.size() + -1 ? 0 : i4, i5, drawable);
                i6 = i7;
            } else {
                l.o();
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            arrayList.add(getChildAt(i8));
        }
        this.f8042g = v.R(arrayList);
        c();
    }

    public void setIsLoading(boolean z) {
        f fVar = this.f8044i;
        if (fVar != null) {
            fVar.c(z);
        }
    }

    public final void setOnItemSelectedListener(C0540a aVar) {
        k.e(aVar, "listener");
        this.f8045j = aVar;
    }

    public void setValueAnimator(ValueAnimator valueAnimator) {
        k.e(valueAnimator, "animator");
        this.f8043h = valueAnimator;
        c();
    }
}
