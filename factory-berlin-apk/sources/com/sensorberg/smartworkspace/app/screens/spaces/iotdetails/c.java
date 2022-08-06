package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.a;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: IotDeviceDetailsLineSeparator.kt */
public final class c extends RecyclerView.n {
    private final float a;
    private final Paint b;

    public c(Context context) {
        k.e(context, "context");
        this.a = context.getResources().getDimension(R.dimen.iotdevice_details_line_separator_margin);
        Paint paint = new Paint();
        paint.setColor(a.a.a(context, R.color.secondary));
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.iotdevice_details_line_separator_height));
        paint.setFlags(1);
        x xVar = x.a;
        this.b = paint;
    }

    private final void n(Canvas canvas, View view, View view2) {
        int bottom = view.getBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            float f2 = (float) (bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            canvas.drawLine(((float) view2.getLeft()) + this.a, f2, ((float) view2.getRight()) - this.a, f2, this.b);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public void j(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        k.e(canvas, "c");
        k.e(recyclerView, "parent");
        k.e(a0Var, "state");
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (!(recyclerView.getChildViewHolder(childAt) instanceof com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.c)) {
                k.d(childAt, "child");
                n(canvas, childAt, recyclerView);
            }
        }
    }
}
