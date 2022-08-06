package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: MenuPopup */
abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* renamed from: g  reason: collision with root package name */
    private Rect f272g;

    k() {
    }

    protected static f A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (f) listAdapter;
    }

    protected static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    protected static boolean z(g gVar) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public void b(Context context, g gVar) {
    }

    public int getId() {
        return 0;
    }

    public boolean k(g gVar, i iVar) {
        return false;
    }

    public boolean l(g gVar, i iVar) {
        return false;
    }

    public abstract void n(g gVar);

    /* access modifiers changed from: protected */
    public boolean o() {
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        A(listAdapter).f236g.O((MenuItem) listAdapter.getItem(i2), this, o() ? 0 : 4);
    }

    public Rect p() {
        return this.f272g;
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.f272g = rect;
    }

    public abstract void t(boolean z);

    public abstract void u(int i2);

    public abstract void v(int i2);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z);

    public abstract void y(int i2);
}
