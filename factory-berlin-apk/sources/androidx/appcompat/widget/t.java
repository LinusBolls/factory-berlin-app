package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import e.a.a;

/* compiled from: AppCompatRatingBar */
public class t extends RatingBar {

    /* renamed from: g  reason: collision with root package name */
    private final r f510g;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.ratingBarStyle);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap b = this.f510g.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }

    public t(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r rVar = new r(this);
        this.f510g = rVar;
        rVar.c(attributeSet, i2);
    }
}
