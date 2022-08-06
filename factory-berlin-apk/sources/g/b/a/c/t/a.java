package g.b.a.c.t;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener */
public class a implements View.OnTouchListener {

    /* renamed from: g  reason: collision with root package name */
    private final Dialog f9542g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9543h;

    /* renamed from: i  reason: collision with root package name */
    private final int f9544i;

    /* renamed from: j  reason: collision with root package name */
    private final int f9545j;

    public a(Dialog dialog, Rect rect) {
        this.f9542g = dialog;
        this.f9543h = rect.left;
        this.f9544i = rect.top;
        this.f9545j = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f9543h + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f9544i + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f9545j;
            obtain.setLocation((float) ((-i2) - 1), (float) ((-i2) - 1));
        }
        view.performClick();
        return this.f9542g.onTouchEvent(obtain);
    }
}
