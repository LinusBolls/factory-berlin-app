package com.sensorberg.booking.roomselection;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sensorberg.booking.roomselection.g;
import e.p.i;
import kotlin.jvm.internal.k;

/* compiled from: BookableUnitPagedListAdapter.kt */
public final class b extends i<g.a, RecyclerView.d0> implements e, h {

    /* renamed from: l  reason: collision with root package name */
    private static final h.d<g.a> f5015l = new a();

    /* renamed from: k  reason: collision with root package name */
    private final h f5016k;

    /* compiled from: BookableUnitPagedListAdapter.kt */
    public static final class a extends h.d<g.a> {
        a() {
        }

        /* renamed from: d */
        public boolean a(g.a aVar, g.a aVar2) {
            k.e(aVar, "oldItem");
            k.e(aVar2, "newItem");
            return k.a(aVar, aVar2);
        }

        /* renamed from: e */
        public boolean b(g.a aVar, g.a aVar2) {
            k.e(aVar, "oldItem");
            k.e(aVar2, "newItem");
            return aVar == aVar2;
        }
    }

    /* renamed from: com.sensorberg.booking.roomselection.b$b  reason: collision with other inner class name */
    /* compiled from: BookableUnitPagedListAdapter.kt */
    public static final class C0153b {
        private C0153b() {
        }

        public /* synthetic */ C0153b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0153b((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(h hVar) {
        super(f5015l);
        k.e(hVar, "roomSelectionListener");
        this.f5016k = hVar;
    }

    public int getItemViewType(int i2) {
        return 1;
    }

    public void j(g.a aVar) {
        k.e(aVar, "roomSelectionItem");
        this.f5016k.j(aVar);
    }

    public void x(RecyclerView.d0 d0Var, int i2) {
        k.e(d0Var, "holder");
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 1) {
            g.a aVar = (g.a) I(i2);
            if (aVar != null) {
                k.d(aVar, "it");
                ((c) d0Var).N(aVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("unknown viewType: " + itemViewType);
    }

    public RecyclerView.d0 z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        if (i2 == 1) {
            return new c(viewGroup, this);
        }
        throw new IllegalStateException("unknown viewType: " + i2);
    }
}
