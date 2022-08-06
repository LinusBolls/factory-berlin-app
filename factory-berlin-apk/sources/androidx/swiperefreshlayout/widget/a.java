package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import e.h.k.u;

/* compiled from: CircleImageView */
class a extends ImageView {

    /* renamed from: g  reason: collision with root package name */
    private Animation.AnimationListener f1490g;

    /* renamed from: h  reason: collision with root package name */
    private int f1491h;

    /* renamed from: i  reason: collision with root package name */
    private int f1492i;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    /* compiled from: CircleImageView */
    private static class C0037a extends OvalShape {

        /* renamed from: g  reason: collision with root package name */
        private Paint f1493g = new Paint();

        /* renamed from: h  reason: collision with root package name */
        private int f1494h;

        /* renamed from: i  reason: collision with root package name */
        private a f1495i;

        C0037a(a aVar, int i2) {
            this.f1495i = aVar;
            this.f1494h = i2;
            c((int) rect().width());
        }

        private void c(int i2) {
            float f2 = (float) (i2 / 2);
            this.f1493g.setShader(new RadialGradient(f2, f2, (float) this.f1494h, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f1495i.getWidth() / 2;
            float f2 = (float) width;
            float height = (float) (this.f1495i.getHeight() / 2);
            canvas.drawCircle(f2, height, f2, this.f1493g);
            canvas.drawCircle(f2, height, (float) (width - this.f1494h), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            c((int) f2);
        }
    }

    a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f2);
        int i3 = (int) (0.0f * f2);
        this.f1491h = (int) (3.5f * f2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(e.t.a.SwipeRefreshLayout);
        this.f1492i = obtainStyledAttributes.getColor(e.t.a.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            u.l0(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0037a(this, this.f1491h));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1491h, (float) i3, (float) i2, 503316480);
            int i4 = this.f1491h;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f1492i);
        u.h0(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f1490g = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1490g;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1490g;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1491h * 2), getMeasuredHeight() + (this.f1491h * 2));
        }
    }

    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
            this.f1492i = i2;
        }
    }
}
