package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.c;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.d;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.e;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceDetailsAdapter.kt */
public final class a extends q<e, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.a> {

    /* renamed from: m  reason: collision with root package name */
    private static final C0529a f7916m = new C0529a();

    /* renamed from: k  reason: collision with root package name */
    private final d f7917k;

    /* renamed from: l  reason: collision with root package name */
    private final ValueAnimator f7918l;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.a$a  reason: collision with other inner class name */
    /* compiled from: IotDeviceDetailsAdapter.kt */
    public static final class C0529a extends h.d<e> {
        C0529a() {
        }

        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(e eVar, e eVar2) {
            k.e(eVar, "oldItem");
            k.e(eVar2, "newItem");
            return k.a(eVar, eVar2);
        }

        /* renamed from: e */
        public boolean b(e eVar, e eVar2) {
            k.e(eVar, "oldItem");
            k.e(eVar2, "newItem");
            return eVar.a() == eVar2.a();
        }
    }

    /* compiled from: IotDeviceDetailsAdapter.kt */
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
    public a(d dVar, ValueAnimator valueAnimator) {
        super(f7916m);
        k.e(dVar, "viewModel");
        k.e(valueAnimator, "animator");
        this.f7917k = dVar;
        this.f7918l = valueAnimator;
        G(true);
    }

    /* renamed from: L */
    public void x(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.a aVar, int i2) {
        k.e(aVar, "holder");
        Object I = I(i2);
        k.d(I, "getItem(position)");
        aVar.M((e) I);
    }

    /* renamed from: M */
    public com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.a z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        if (i2 == 1) {
            return c.w.a(viewGroup, this.f7917k);
        }
        if (i2 == 2) {
            return f.w.a(viewGroup, this.f7917k, this.f7918l);
        }
        if (i2 == 3) {
            return e.x.a(viewGroup, this.f7917k, this.f7918l);
        }
        if (i2 == 4) {
            return d.u.a(viewGroup);
        }
        if (i2 == 5) {
            return com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.b.y.a(viewGroup, this.f7917k, this.f7918l);
        }
        throw new IllegalArgumentException("Unknown viewType :" + i2);
    }

    public int getItemViewType(int i2) {
        e eVar = (e) I(i2);
        if (eVar instanceof e.b) {
            return 1;
        }
        if (eVar instanceof e.C0532e) {
            return 2;
        }
        if (eVar instanceof e.d) {
            return 3;
        }
        if (eVar instanceof e.c) {
            return 4;
        }
        if (eVar instanceof e.a) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    public long i(int i2) {
        return ((e) I(i2)).a();
    }
}
