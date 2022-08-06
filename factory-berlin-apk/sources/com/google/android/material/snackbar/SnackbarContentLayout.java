package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.h.k.u;
import g.b.a.c.f;
import g.b.a.c.l;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    private TextView f3617g;

    /* renamed from: h  reason: collision with root package name */
    private Button f3618h;

    /* renamed from: i  reason: collision with root package name */
    private int f3619i;

    /* renamed from: j  reason: collision with root package name */
    private int f3620j;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.SnackbarLayout);
        this.f3619i = obtainStyledAttributes.getDimensionPixelSize(l.SnackbarLayout_android_maxWidth, -1);
        this.f3620j = obtainStyledAttributes.getDimensionPixelSize(l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i2, int i3) {
        if (u.N(view)) {
            u.r0(view, u.C(view), i2, u.B(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    private boolean b(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f3617g.getPaddingTop() == i3 && this.f3617g.getPaddingBottom() == i4) {
            return z;
        }
        a(this.f3617g, i3, i4);
        return true;
    }

    public Button getActionView() {
        return this.f3618h;
    }

    public TextView getMessageView() {
        return this.f3617g;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3617g = (TextView) findViewById(f.snackbar_text);
        this.f3618h = (Button) findViewById(f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (b(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (b(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f3619i
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f3619i
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = g.b.a.c.d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = g.b.a.c.d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f3617g
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f3620j
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f3618h
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3620j
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.b(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.b(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
