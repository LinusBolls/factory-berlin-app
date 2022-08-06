package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class f extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    g f236g;

    /* renamed from: h  reason: collision with root package name */
    private int f237h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f238i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f239j;

    /* renamed from: k  reason: collision with root package name */
    private final LayoutInflater f240k;

    /* renamed from: l  reason: collision with root package name */
    private final int f241l;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f239j = z;
        this.f240k = layoutInflater;
        this.f236g = gVar;
        this.f241l = i2;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i x = this.f236g.x();
        if (x != null) {
            ArrayList<i> B = this.f236g.B();
            int size = B.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (B.get(i2) == x) {
                    this.f237h = i2;
                    return;
                }
            }
        }
        this.f237h = -1;
    }

    public g b() {
        return this.f236g;
    }

    /* renamed from: c */
    public i getItem(int i2) {
        ArrayList<i> B = this.f239j ? this.f236g.B() : this.f236g.G();
        int i3 = this.f237h;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return B.get(i2);
    }

    public void d(boolean z) {
        this.f238i = z;
    }

    public int getCount() {
        ArrayList<i> B = this.f239j ? this.f236g.B() : this.f236g.G();
        if (this.f237h < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f240k.inflate(this.f241l, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f236g.H() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f238i) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
