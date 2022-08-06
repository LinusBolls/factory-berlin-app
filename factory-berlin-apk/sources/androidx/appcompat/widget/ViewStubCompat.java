package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.a.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: g  reason: collision with root package name */
    private int f366g;

    /* renamed from: h  reason: collision with root package name */
    private int f367h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<View> f368i;

    /* renamed from: j  reason: collision with root package name */
    private LayoutInflater f369j;

    /* renamed from: k  reason: collision with root package name */
    private a f370k;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f366g != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f369j;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f366g, viewGroup, false);
            int i2 = this.f367h;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f368i = new WeakReference<>(inflate);
            a aVar = this.f370k;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f367h;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f369j;
    }

    public int getLayoutResource() {
        return this.f366g;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f367h = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f369j = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f366g = i2;
    }

    public void setOnInflateListener(a aVar) {
        this.f370k = aVar;
    }

    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f368i;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f366g = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ViewStubCompat, i2, 0);
        this.f367h = obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_inflatedId, -1);
        this.f366g = obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
