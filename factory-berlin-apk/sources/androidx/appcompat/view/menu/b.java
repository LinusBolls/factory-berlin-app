package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class b implements m {

    /* renamed from: g  reason: collision with root package name */
    protected Context f204g;

    /* renamed from: h  reason: collision with root package name */
    protected Context f205h;

    /* renamed from: i  reason: collision with root package name */
    protected g f206i;

    /* renamed from: j  reason: collision with root package name */
    protected LayoutInflater f207j;

    /* renamed from: k  reason: collision with root package name */
    private m.a f208k;

    /* renamed from: l  reason: collision with root package name */
    private int f209l;

    /* renamed from: m  reason: collision with root package name */
    private int f210m;

    /* renamed from: n  reason: collision with root package name */
    protected n f211n;
    private int o;

    public b(Context context, int i2, int i3) {
        this.f204g = context;
        this.f207j = LayoutInflater.from(context);
        this.f209l = i2;
        this.f210m = i3;
    }

    public void a(g gVar, boolean z) {
        m.a aVar = this.f208k;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public void b(Context context, g gVar) {
        this.f205h = context;
        LayoutInflater.from(context);
        this.f206i = gVar;
    }

    /* access modifiers changed from: protected */
    public void c(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f211n).addView(view, i2);
    }

    public abstract void e(i iVar, n.a aVar);

    public boolean f(r rVar) {
        m.a aVar = this.f208k;
        if (aVar != null) {
            return aVar.b(rVar);
        }
        return false;
    }

    public void g(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f211n;
        if (viewGroup != null) {
            g gVar = this.f206i;
            int i2 = 0;
            if (gVar != null) {
                gVar.t();
                ArrayList<i> G = this.f206i.G();
                int size = G.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i iVar = G.get(i4);
                    if (s(i3, iVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View p = p(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            p.setPressed(false);
                            p.jumpDrawablesToCurrentState();
                        }
                        if (p != childAt) {
                            c(p, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!n(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public int getId() {
        return this.o;
    }

    public n.a h(ViewGroup viewGroup) {
        return (n.a) this.f207j.inflate(this.f210m, viewGroup, false);
    }

    public boolean k(g gVar, i iVar) {
        return false;
    }

    public boolean l(g gVar, i iVar) {
        return false;
    }

    public void m(m.a aVar) {
        this.f208k = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean n(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public m.a o() {
        return this.f208k;
    }

    public View p(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        if (view instanceof n.a) {
            aVar = (n.a) view;
        } else {
            aVar = h(viewGroup);
        }
        e(iVar, aVar);
        return (View) aVar;
    }

    public n q(ViewGroup viewGroup) {
        if (this.f211n == null) {
            n nVar = (n) this.f207j.inflate(this.f209l, viewGroup, false);
            this.f211n = nVar;
            nVar.b(this.f206i);
            g(true);
        }
        return this.f211n;
    }

    public void r(int i2) {
        this.o = i2;
    }

    public abstract boolean s(int i2, i iVar);
}
