package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import e.c.a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    private final int f579g = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_min_padding);

    /* renamed from: h  reason: collision with root package name */
    private final int f580h = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f579g * 2), this.f580h), 1073741824), i3);
    }
}
