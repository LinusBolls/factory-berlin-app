package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.a.a;

/* compiled from: AppCompatSeekBar */
public class u extends SeekBar {

    /* renamed from: g  reason: collision with root package name */
    private final v f512g;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.seekBarStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f512g.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f512g.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f512g.g(canvas);
    }

    public u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        v vVar = new v(this);
        this.f512g = vVar;
        vVar.c(attributeSet, i2);
    }
}
