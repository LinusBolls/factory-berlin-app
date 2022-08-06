package com.sensorberg.booking.mybookings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.sensorberg.booking.mybookings.g;
import g.e.n.c.i.b;
import kotlin.x;
import org.threeten.bp.e;

/* compiled from: SwipeToDeleteCallback.kt */
public abstract class k extends k.i {

    /* renamed from: f  reason: collision with root package name */
    private final g.b f4888f;

    /* renamed from: g  reason: collision with root package name */
    private final g.a f4889g;

    /* renamed from: h  reason: collision with root package name */
    private final ColorDrawable f4890h = new ColorDrawable();

    /* renamed from: i  reason: collision with root package name */
    private final Paint f4891i;

    /* renamed from: j  reason: collision with root package name */
    private final a f4892j;

    /* compiled from: SwipeToDeleteCallback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, a aVar) {
        super(0, 4);
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(aVar, "adapter");
        this.f4892j = aVar;
        this.f4888f = new g.b(context);
        this.f4889g = new g.a(context);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        x xVar = x.a;
        this.f4891i = paint;
    }

    private final void E(Canvas canvas, float f2, float f3, float f4, float f5) {
        if (canvas != null) {
            canvas.drawRect(f2, f3, f4, f5, this.f4891i);
        }
    }

    public float m(RecyclerView.d0 d0Var) {
        kotlin.jvm.internal.k.e(d0Var, "viewHolder");
        return 0.5f;
    }

    public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f2, float f3, int i2, boolean z) {
        g gVar;
        kotlin.jvm.internal.k.e(canvas, "canvas");
        kotlin.jvm.internal.k.e(recyclerView, "recyclerView");
        kotlin.jvm.internal.k.e(d0Var, "viewHolder");
        View view = d0Var.a;
        kotlin.jvm.internal.k.d(view, "viewHolder.itemView");
        d M = this.f4892j.M(d0Var.j());
        if (M != null) {
            long e2 = M.e();
            e m0 = e.m0();
            kotlin.jvm.internal.k.d(m0, "LocalDateTime.now()");
            if (e2 < b.e(m0)) {
                gVar = this.f4889g;
            } else {
                gVar = this.f4888f;
            }
            if (f2 == 0.0f && !z) {
                E(canvas, ((float) view.getRight()) + f2, (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
                super.u(canvas, recyclerView, d0Var, f2, f3, i2, z);
                return;
            }
            int bottom = view.getBottom() - view.getTop();
            this.f4890h.setColor(gVar.a());
            this.f4890h.setBounds(view.getRight() + ((int) f2), view.getTop(), view.getRight(), view.getBottom());
            this.f4890h.draw(canvas);
            int c = gVar.c();
            int d2 = gVar.d();
            Drawable b = gVar.b();
            int i3 = (bottom - c) / 2;
            int top = view.getTop() + i3;
            b.setBounds((view.getRight() - i3) - d2, top, view.getRight() - i3, c + top);
            b.draw(canvas);
            super.u(canvas, recyclerView, d0Var, f2, f3, i2, z);
        }
    }

    public boolean y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        kotlin.jvm.internal.k.e(recyclerView, "recyclerView");
        kotlin.jvm.internal.k.e(d0Var, "viewHolder");
        kotlin.jvm.internal.k.e(d0Var2, "target");
        return false;
    }
}
