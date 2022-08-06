package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.widgets.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: IotDeviceDetailsHolderSwitch.kt */
public final class f extends a {
    public static final b w = new b((DefaultConstructorMarker) null);
    private e.C0532e t;
    private final d u;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d v;

    /* compiled from: IotDeviceDetailsHolderSwitch.kt */
    static final class a extends l implements kotlin.e0.c.l<Boolean, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f7956h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(1);
            this.f7956h = fVar;
        }

        public final void a(boolean z) {
            this.f7956h.v.C(f.N(this.f7956h).a(), f.N(this.f7956h).d(), z);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(((Boolean) obj).booleanValue());
            return x.a;
        }
    }

    /* compiled from: IotDeviceDetailsHolderSwitch.kt */
    public static final class b {
        private b() {
        }

        public final a a(ViewGroup viewGroup, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d dVar, ValueAnimator valueAnimator) {
            k.e(viewGroup, "parent");
            k.e(dVar, "viewModel");
            k.e(valueAnimator, "animator");
            Context context = viewGroup.getContext();
            k.c(context);
            d dVar2 = new d(context, (AttributeSet) null);
            dVar2.setValueAnimator(valueAnimator);
            x xVar = x.a;
            return new f(dVar2, dVar);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d dVar2) {
        super(dVar);
        k.e(dVar, "switch");
        k.e(dVar2, "viewModel");
        this.u = dVar;
        this.v = dVar2;
        dVar.setOnCheckedChangeListener(new a(this));
    }

    public static final /* synthetic */ e.C0532e N(f fVar) {
        e.C0532e eVar = fVar.t;
        if (eVar != null) {
            return eVar;
        }
        k.q("data");
        throw null;
    }

    public void M(e eVar) {
        k.e(eVar, "baseData");
        if (eVar instanceof e.C0532e) {
            e.C0532e eVar2 = (e.C0532e) eVar;
            this.t = eVar2;
            d dVar = this.u;
            if (eVar2 != null) {
                dVar.setTitle(eVar2.g());
                d dVar2 = this.u;
                e.C0532e eVar3 = this.t;
                if (eVar3 != null) {
                    dVar2.setChecked(eVar3.e());
                    d dVar3 = this.u;
                    e.C0532e eVar4 = this.t;
                    if (eVar4 != null) {
                        dVar3.setIsLoading(eVar4.h());
                        d dVar4 = this.u;
                        e.C0532e eVar5 = this.t;
                        if (eVar5 != null) {
                            dVar4.setSubTitle(eVar5.f());
                        } else {
                            k.q("data");
                            throw null;
                        }
                    } else {
                        k.q("data");
                        throw null;
                    }
                } else {
                    k.q("data");
                    throw null;
                }
            } else {
                k.q("data");
                throw null;
            }
        } else {
            throw new IllegalStateException("Data cannot be " + eVar.getClass() + " for " + getClass());
        }
    }
}
