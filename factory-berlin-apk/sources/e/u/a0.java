package e.u;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18 */
class a0 implements b0 {
    private final ViewOverlay a;

    a0(View view) {
        this.a = view.getOverlay();
    }

    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
