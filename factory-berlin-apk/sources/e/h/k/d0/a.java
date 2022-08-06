package e.h.k.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: g  reason: collision with root package name */
    private final int f8686g;

    /* renamed from: h  reason: collision with root package name */
    private final c f8687h;

    /* renamed from: i  reason: collision with root package name */
    private final int f8688i;

    public a(int i2, c cVar, int i3) {
        this.f8686g = i2;
        this.f8687h = cVar;
        this.f8688i = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f8686g);
        this.f8687h.N(this.f8688i, bundle);
    }
}
