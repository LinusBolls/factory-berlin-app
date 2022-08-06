package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton */
public class b0 extends ToggleButton {

    /* renamed from: g  reason: collision with root package name */
    private final y f393g;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public b0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y yVar = new y(this);
        this.f393g = yVar;
        yVar.m(attributeSet, i2);
    }
}
