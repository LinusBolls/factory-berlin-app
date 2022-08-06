package e.u;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.h.k.u;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14 */
class z implements b0 {
    protected a a;

    /* compiled from: ViewOverlayApi14 */
    static class a extends ViewGroup {

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f8934g;

        /* renamed from: h  reason: collision with root package name */
        View f8935h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList<Drawable> f8936i = null;

        /* renamed from: j  reason: collision with root package name */
        z f8937j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f8938k;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f8934g = viewGroup;
            this.f8935h = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f8937j = zVar;
        }

        private void c() {
            if (this.f8938k) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f8936i;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f8938k = true;
                    this.f8934g.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f8934g.getLocationOnScreen(iArr2);
            this.f8935h.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f8936i == null) {
                this.f8936i = new ArrayList<>();
            }
            if (!this.f8936i.contains(drawable)) {
                this.f8936i.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f8934g || viewGroup.getParent() == null || !u.K(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f8934g.getLocationOnScreen(iArr2);
                    u.Q(view, iArr[0] - iArr2[0]);
                    u.R(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f8934g.getLocationOnScreen(iArr);
            this.f8935h.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f8935h.getWidth(), this.f8935h.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f8936i;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f8936i.get(i2).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f8936i;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f8934g == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f8934g instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f8936i;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f8936i
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: e.u.z.a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    z(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    static z e(View view) {
        ViewGroup f2 = f(view);
        if (f2 == null) {
            return null;
        }
        int childCount = f2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = f2.getChildAt(i2);
            if (childAt instanceof a) {
                return ((a) childAt).f8937j;
            }
        }
        return new u(f2.getContext(), f2, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    public void b(Drawable drawable) {
        this.a.a(drawable);
    }

    public void d(Drawable drawable) {
        this.a.f(drawable);
    }
}
