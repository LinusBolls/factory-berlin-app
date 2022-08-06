package com.sensorberg.booking.mybookings;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import e.p.i;
import kotlin.jvm.internal.k;

/* compiled from: BookingAdapter.kt */
public final class a extends i<d, RecyclerView.d0> implements b {

    /* renamed from: l  reason: collision with root package name */
    private static final h.d<d> f4853l = new C0143a();

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ b f4854k;

    /* renamed from: com.sensorberg.booking.mybookings.a$a  reason: collision with other inner class name */
    /* compiled from: BookingAdapter.kt */
    public static final class C0143a extends h.d<d> {
        C0143a() {
        }

        /* renamed from: d */
        public boolean a(d dVar, d dVar2) {
            k.e(dVar, "oldItem");
            k.e(dVar2, "newItem");
            return k.a(dVar, dVar2);
        }

        /* renamed from: e */
        public boolean b(d dVar, d dVar2) {
            k.e(dVar, "oldItem");
            k.e(dVar2, "newItem");
            return k.a(dVar.b(), dVar2.b());
        }
    }

    /* compiled from: BookingAdapter.kt */
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
    public a(b bVar) {
        super(f4853l);
        k.e(bVar, "bookingItemClickListener");
        this.f4854k = bVar;
    }

    public final d M(int i2) {
        if (i2 < 0) {
            return null;
        }
        return (d) I(i2);
    }

    public int getItemViewType(int i2) {
        return 1;
    }

    public void l(String str, String str2) {
        k.e(str, "unitId");
        k.e(str2, "unitName");
        this.f4854k.l(str, str2);
    }

    public void x(RecyclerView.d0 d0Var, int i2) {
        k.e(d0Var, "holder");
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 1) {
            d dVar = (d) I(i2);
            if (dVar != null) {
                k.d(dVar, "it");
                ((c) d0Var).N(dVar);
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
