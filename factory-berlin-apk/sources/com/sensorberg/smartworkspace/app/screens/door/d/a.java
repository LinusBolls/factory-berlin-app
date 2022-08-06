package com.sensorberg.smartworkspace.app.screens.door.d;

import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.utils.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: FavoriteListAdapter.kt */
public final class a extends q<c, d<c, ViewDataBinding>> {

    /* renamed from: n  reason: collision with root package name */
    private static final h.d<c> f7357n = new C0483a();

    /* renamed from: k  reason: collision with root package name */
    private final r f7358k = new r();

    /* renamed from: l  reason: collision with root package name */
    private l<? super IotUnit, x> f7359l;

    /* renamed from: m  reason: collision with root package name */
    private l<? super IotUnit, x> f7360m;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.door.d.a$a  reason: collision with other inner class name */
    /* compiled from: FavoriteListAdapter.kt */
    public static final class C0483a extends h.d<c> {
        C0483a() {
        }

        /* renamed from: d */
        public boolean a(c cVar, c cVar2) {
            k.e(cVar, "oldItem");
            k.e(cVar2, "newItem");
            return k.a(cVar, cVar2);
        }

        /* renamed from: e */
        public boolean b(c cVar, c cVar2) {
            k.e(cVar, "oldItem");
            k.e(cVar2, "newItem");
            if ((cVar instanceof i) && (cVar2 instanceof i)) {
                return k.a(((i) cVar).d().getId(), ((i) cVar2).d().getId());
            }
            if (!(cVar instanceof f) || !(cVar2 instanceof f)) {
                return false;
            }
            return k.a(((f) cVar).b(), ((f) cVar2).b());
        }
    }

    /* compiled from: FavoriteListAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public a() {
        super(f7357n);
        G(true);
    }

    /* renamed from: L */
    public void x(d<c, ViewDataBinding> dVar, int i2) {
        k.e(dVar, "itemHolder");
        Object I = I(dVar.j());
        k.d(I, "getItem(itemHolder.adapterPosition)");
        dVar.M((c) I);
    }

    /* renamed from: M */
    public d<c, ViewDataBinding> z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        return d.t.a(viewGroup, i2, this.f7360m, this.f7359l);
    }

    public final void N(l<? super IotUnit, x> lVar) {
        this.f7359l = lVar;
    }

    public final void O(l<? super IotUnit, x> lVar) {
        this.f7360m = lVar;
    }

    public int getItemViewType(int i2) {
        return ((c) I(i2)).a();
    }

    public long i(int i2) {
        c cVar = (c) I(i2);
        if (cVar instanceof i) {
            return this.f7358k.a(((i) cVar).d().getId());
        }
        if (cVar instanceof f) {
            return this.f7358k.a(((f) cVar).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
