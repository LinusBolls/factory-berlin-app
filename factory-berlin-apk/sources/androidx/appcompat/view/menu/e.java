package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import e.a.g;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: g  reason: collision with root package name */
    Context f226g;

    /* renamed from: h  reason: collision with root package name */
    LayoutInflater f227h;

    /* renamed from: i  reason: collision with root package name */
    g f228i;

    /* renamed from: j  reason: collision with root package name */
    ExpandedMenuView f229j;

    /* renamed from: k  reason: collision with root package name */
    int f230k;

    /* renamed from: l  reason: collision with root package name */
    int f231l;

    /* renamed from: m  reason: collision with root package name */
    int f232m;

    /* renamed from: n  reason: collision with root package name */
    private m.a f233n;
    a o;
    private int p;

    /* compiled from: ListMenuPresenter */
    private class a extends BaseAdapter {

        /* renamed from: g  reason: collision with root package name */
        private int f234g = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i x = e.this.f228i.x();
            if (x != null) {
                ArrayList<i> B = e.this.f228i.B();
                int size = B.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (B.get(i2) == x) {
                        this.f234g = i2;
                        return;
                    }
                }
            }
            this.f234g = -1;
        }

        /* renamed from: b */
        public i getItem(int i2) {
            ArrayList<i> B = e.this.f228i.B();
            int i3 = i2 + e.this.f230k;
            int i4 = this.f234g;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return B.get(i3);
        }

        public int getCount() {
            int size = e.this.f228i.B().size() - e.this.f230k;
            return this.f234g < 0 ? size : size - 1;
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f227h.inflate(eVar.f232m, viewGroup, false);
            }
            ((n.a) view).e(getItem(i2), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.f226g = context;
        this.f227h = LayoutInflater.from(context);
    }

    public void a(g gVar, boolean z) {
        m.a aVar = this.f233n;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public void b(Context context, g gVar) {
        if (this.f231l != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f231l);
            this.f226g = contextThemeWrapper;
            this.f227h = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f226g != null) {
            this.f226g = context;
            if (this.f227h == null) {
                this.f227h = LayoutInflater.from(context);
            }
        }
        this.f228i = gVar;
        a aVar = this.o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public ListAdapter c() {
        if (this.o == null) {
            this.o = new a();
        }
        return this.o;
    }

    public void d(Parcelable parcelable) {
        h((Bundle) parcelable);
    }

    public n e(ViewGroup viewGroup) {
        if (this.f229j == null) {
            this.f229j = (ExpandedMenuView) this.f227h.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.o == null) {
                this.o = new a();
            }
            this.f229j.setAdapter(this.o);
            this.f229j.setOnItemClickListener(this);
        }
        return this.f229j;
    }

    public boolean f(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d((IBinder) null);
        m.a aVar = this.f233n;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    public void g(boolean z) {
        a aVar = this.o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public int getId() {
        return this.p;
    }

    public void h(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f229j.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public boolean i() {
        return false;
    }

    public Parcelable j() {
        if (this.f229j == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    public boolean k(g gVar, i iVar) {
        return false;
    }

    public boolean l(g gVar, i iVar) {
        return false;
    }

    public void m(m.a aVar) {
        this.f233n = aVar;
    }

    public void n(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f229j;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f228i.O(this.o.getItem(i2), this, 0);
    }

    public e(int i2, int i3) {
        this.f232m = i2;
        this.f231l = i3;
    }
}
