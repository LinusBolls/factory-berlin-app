package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.widgets.CaptionedSeekBar;
import com.sensorberg.smartworkspace.app.widgets.IotDeviceDetailsSeekBar;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: IotDeviceDetailsHolderSeekBar.kt */
public final class e extends a {
    public static final b x = new b((DefaultConstructorMarker) null);
    private e.d t;
    private final CaptionedSeekBar.d u;
    private final IotDeviceDetailsSeekBar v;
    /* access modifiers changed from: private */
    public final d w;

    /* compiled from: IotDeviceDetailsHolderSeekBar.kt */
    public static final class a implements CaptionedSeekBar.c {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        public void a(int i2) {
            this.a.w.B(e.N(this.a).a(), e.N(this.a).d(), i2);
        }
    }

    /* compiled from: IotDeviceDetailsHolderSeekBar.kt */
    public static final class b {
        private b() {
        }

        public final a a(ViewGroup viewGroup, d dVar, ValueAnimator valueAnimator) {
            k.e(viewGroup, "parent");
            k.e(dVar, "viewModel");
            k.e(valueAnimator, "animator");
            Context context = viewGroup.getContext();
            k.c(context);
            IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar = new IotDeviceDetailsSeekBar(context, (AttributeSet) null);
            iotDeviceDetailsSeekBar.setValueAnimator(valueAnimator);
            x xVar = x.a;
            return new e(iotDeviceDetailsSeekBar, dVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: IotDeviceDetailsHolderSeekBar.kt */
    public static final class c implements CaptionedSeekBar.d {
        final /* synthetic */ e a;

        c(e eVar) {
            this.a = eVar;
        }

        public String a(int i2) {
            return e.N(this.a).e().b(i2) + e.N(this.a).g();
        }
    }

    public /* synthetic */ e(IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iotDeviceDetailsSeekBar, dVar);
    }

    public static final /* synthetic */ e.d N(e eVar) {
        e.d dVar = eVar.t;
        if (dVar != null) {
            return dVar;
        }
        k.q("data");
        throw null;
    }

    public void M(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e eVar) {
        k.e(eVar, "baseData");
        if (eVar instanceof e.d) {
            e.d dVar = (e.d) eVar;
            this.t = dVar;
            IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar = this.v;
            if (dVar != null) {
                iotDeviceDetailsSeekBar.setTitle(dVar.f());
                IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar2 = this.v;
                e.d dVar2 = this.t;
                if (dVar2 != null) {
                    iotDeviceDetailsSeekBar2.setProgress(dVar2.h());
                    IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar3 = this.v;
                    e.d dVar3 = this.t;
                    if (dVar3 != null) {
                        iotDeviceDetailsSeekBar3.setIsLoading(dVar3.i());
                        this.v.setFormatter(this.u);
                        return;
                    }
                    k.q("data");
                    throw null;
                }
                k.q("data");
                throw null;
            }
            k.q("data");
            throw null;
        }
        throw new IllegalStateException("Data cannot be " + eVar.getClass() + " for " + getClass());
    }

    private e(IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar, d dVar) {
        super(iotDeviceDetailsSeekBar);
        this.v = iotDeviceDetailsSeekBar;
        this.w = dVar;
        iotDeviceDetailsSeekBar.a(new a(this));
        this.u = new c(this);
    }
}
