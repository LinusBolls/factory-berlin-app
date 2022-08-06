package com.sensorberg.smartworkspace.app.screens.spaces.overview;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.factory.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: SpacesOverviewAdapter.kt */
public final class e extends q<a, RecyclerView.d0> implements g {

    /* renamed from: m  reason: collision with root package name */
    private static final h.d<a> f7978m = new a();

    /* renamed from: k  reason: collision with root package name */
    private final int[] f7979k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ g f7980l;

    /* compiled from: SpacesOverviewAdapter.kt */
    public static final class a extends h.d<a> {
        a() {
        }

        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(a aVar, a aVar2) {
            k.e(aVar, "oldItem");
            k.e(aVar2, "newItem");
            return k.a(aVar, aVar2);
        }

        /* renamed from: e */
        public boolean b(a aVar, a aVar2) {
            k.e(aVar, "oldItem");
            k.e(aVar2, "newItem");
            return aVar.a() == aVar2.a();
        }
    }

    /* compiled from: SpacesOverviewAdapter.kt */
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Resources resources, g gVar) {
        super(f7978m);
        k.e(resources, "resources");
        k.e(gVar, "spacesOverviewItemClickListener");
        this.f7980l = gVar;
        int[] intArray = resources.getIntArray(R.array.spacesOverlayAlpha);
        k.d(intArray, "resources.getIntArray(R.array.spacesOverlayAlpha)");
        this.f7979k = intArray;
        G(true);
    }

    public int getItemViewType(int i2) {
        a aVar = (a) I(i2);
        if (aVar instanceof b) {
            return 0;
        }
        if (aVar instanceof c) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void h(b bVar) {
        k.e(bVar, "spaceItem");
        this.f7980l.h(bVar);
    }

    public long i(int i2) {
        return ((a) I(i2)).a();
    }

    public void x(RecyclerView.d0 d0Var, int i2) {
        k.e(d0Var, "holder");
        if (d0Var instanceof com.sensorberg.smartworkspace.app.screens.spaces.overview.i.a) {
            int[] iArr = this.f7979k;
            int i3 = iArr[i2 % iArr.length];
            com.sensorberg.smartworkspace.app.screens.spaces.overview.i.a aVar = (com.sensorberg.smartworkspace.app.screens.spaces.overview.i.a) d0Var;
            Object I = I(i2);
            if (I != null) {
                aVar.O((b) I, i3);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.overview.SpaceItem");
        }
    }

    public RecyclerView.d0 z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        if (i2 == 0) {
            return new com.sensorberg.smartworkspace.app.screens.spaces.overview.i.a(viewGroup, this);
        }
        if (i2 == 1) {
            return new com.sensorberg.smartworkspace.app.screens.spaces.overview.i.b(viewGroup);
        }
        throw new IllegalStateException("unknown viewType: " + i2);
    }
}
