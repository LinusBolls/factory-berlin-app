package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import e.h.k.d0.c;
import e.h.k.d0.d;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class u extends e.h.k.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f1351d;

    /* renamed from: e  reason: collision with root package name */
    private final a f1352e;

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends e.h.k.a {

        /* renamed from: d  reason: collision with root package name */
        final u f1353d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, e.h.k.a> f1354e = new WeakHashMap();

        public a(u uVar) {
            this.f1353d = uVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        public d b(View view) {
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, c cVar) {
            if (this.f1353d.o() || this.f1353d.f1351d.getLayoutManager() == null) {
                super.g(view, cVar);
                return;
            }
            this.f1353d.f1351d.getLayoutManager().P0(view, cVar);
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                aVar.g(view, cVar);
            } else {
                super.g(view, cVar);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            e.h.k.a aVar = this.f1354e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i2, Bundle bundle) {
            if (this.f1353d.o() || this.f1353d.f1351d.getLayoutManager() == null) {
                return super.j(view, i2, bundle);
            }
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i2, bundle)) {
                    return true;
                }
            } else if (super.j(view, i2, bundle)) {
                return true;
            }
            return this.f1353d.f1351d.getLayoutManager().j1(view, i2, bundle);
        }

        public void l(View view, int i2) {
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                aVar.l(view, i2);
            } else {
                super.l(view, i2);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            e.h.k.a aVar = this.f1354e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public e.h.k.a n(View view) {
            return this.f1354e.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void o(View view) {
            e.h.k.a i2 = e.h.k.u.i(view);
            if (i2 != null && i2 != this) {
                this.f1354e.put(view, i2);
            }
        }
    }

    public u(RecyclerView recyclerView) {
        this.f1351d = recyclerView;
        e.h.k.a n2 = n();
        if (n2 == null || !(n2 instanceof a)) {
            this.f1352e = new a(this);
        } else {
            this.f1352e = (a) n2;
        }
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().L0(accessibilityEvent);
            }
        }
    }

    public void g(View view, c cVar) {
        super.g(view, cVar);
        if (!o() && this.f1351d.getLayoutManager() != null) {
            this.f1351d.getLayoutManager().N0(cVar);
        }
    }

    public boolean j(View view, int i2, Bundle bundle) {
        if (super.j(view, i2, bundle)) {
            return true;
        }
        if (o() || this.f1351d.getLayoutManager() == null) {
            return false;
        }
        return this.f1351d.getLayoutManager().h1(i2, bundle);
    }

    public e.h.k.a n() {
        return this.f1352e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f1351d.hasPendingAdapterUpdates();
    }
}
