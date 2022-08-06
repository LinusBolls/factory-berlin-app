package com.sensorberg.smartworkspace.app.screens.locker.opening;

import android.graphics.Matrix;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.sensorberg.factory.R;
import e.k.a.b;
import e.k.a.d;
import e.k.a.e;
import e.k.a.f;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: LockerOpeningAnimation.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.opening.a$a  reason: collision with other inner class name */
    /* compiled from: LockerOpeningAnimation.kt */
    public static final class C0513a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ImageView f7631g;

        C0513a(ImageView imageView) {
            this.f7631g = imageView;
        }

        public boolean onPreDraw() {
            this.f7631g.getViewTreeObserver().removeOnPreDrawListener(this);
            a.a.i(this.f7631g);
            return true;
        }
    }

    /* compiled from: LockerOpeningAnimation.kt */
    static final class b implements b.d {
        final /* synthetic */ boolean a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f7632d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float[] f7633e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f7634f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ImageView f7635g;

        b(boolean z, float f2, float f3, Matrix matrix, float[] fArr, float f4, ImageView imageView) {
            this.a = z;
            this.b = f2;
            this.c = f3;
            this.f7632d = matrix;
            this.f7633e = fArr;
            this.f7634f = f4;
            this.f7635g = imageView;
        }

        public final void a(e.k.a.b<e.k.a.b<?>> bVar, float f2, float f3) {
            float[] fArr;
            float f4 = f2 / this.f7634f;
            if (this.a) {
                fArr = a.a.f(this.b, this.c, f4);
            } else {
                fArr = a.a.e(this.b, this.c, f4);
            }
            this.f7632d.setPolyToPoly(this.f7633e, 0, fArr, 0, 4);
            this.f7635g.setImageMatrix(this.f7632d);
        }
    }

    private a() {
    }

    private final float[] d(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        return new float[]{fArr[0], fArr[1], fArr2[0], fArr2[1], fArr3[0], fArr3[1], fArr4[0], fArr4[1]};
    }

    /* access modifiers changed from: private */
    public final float[] e(float f2, float f3, float f4) {
        float f5 = 0.15f * f2 * f4;
        float f6 = -(-0.4f * f3 * f4);
        return d(new float[]{f6, -f5}, new float[]{f6, f5 + f2}, new float[]{f3, 0.0f}, new float[]{f3, f2});
    }

    /* access modifiers changed from: private */
    public final float[] f(float f2, float f3, float f4) {
        float f5 = 0.15f * f2 * f4;
        float f6 = f3 + (-0.4f * f3 * f4);
        return d(new float[]{0.0f, 0.0f}, new float[]{0.0f, f2}, new float[]{f6, -f5}, new float[]{f6, f2 + f5});
    }

    private final float[] g(float f2, float f3) {
        return d(new float[]{0.0f, 0.0f}, new float[]{0.0f, f2}, new float[]{f3, 0.0f}, new float[]{f3, f2});
    }

    /* access modifiers changed from: private */
    public final void i(ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        e eVar = new e(new d(0.0f));
        f fVar = new f(100.0f);
        fVar.f(500.0f);
        fVar.d(0.4f);
        x xVar = x.a;
        eVar.n(fVar);
        float width = (float) imageView.getWidth();
        float height = (float) imageView.getHeight();
        eVar.b(new b(imageView.getResources().getBoolean(R.bool.locker_open_right_to_left), height, width, new Matrix(), a.g(height, width), 100.0f, imageView));
        eVar.i();
    }

    public final void h(ImageView imageView) {
        k.e(imageView, "imageView");
        imageView.getViewTreeObserver().addOnPreDrawListener(new C0513a(imageView));
    }
}
