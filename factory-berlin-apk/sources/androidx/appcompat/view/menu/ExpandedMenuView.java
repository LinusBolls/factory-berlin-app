package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f182i = {16842964, 16843049};

    /* renamed from: g  reason: collision with root package name */
    private g f183g;

    /* renamed from: h  reason: collision with root package name */
    private int f184h;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public boolean a(i iVar) {
        return this.f183g.N(iVar, 0);
    }

    public void b(g gVar) {
        this.f183g = gVar;
    }

    public int getWindowAnimations() {
        return this.f184h;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((i) getAdapter().getItem(i2));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 u = w0.u(context, attributeSet, f182i, i2, 0);
        if (u.r(0)) {
            setBackgroundDrawable(u.g(0));
        }
        if (u.r(1)) {
            setDivider(u.g(1));
        }
        u.v();
    }
}
