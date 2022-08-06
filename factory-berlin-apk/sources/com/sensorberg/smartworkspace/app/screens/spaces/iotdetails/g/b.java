package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.widgets.a;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: IotDeviceDetailsHolderButtonRow.kt */
public final class b extends a {
    public static final C0533b y = new C0533b((DefaultConstructorMarker) null);
    private final int t;
    private final int u;
    private e.a v;
    private final com.sensorberg.smartworkspace.app.widgets.a w;
    /* access modifiers changed from: private */
    public final d x;

    /* compiled from: IotDeviceDetailsHolderButtonRow.kt */
    public static final class a implements a.C0540a {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        public void a(int i2) {
            this.a.x.z(b.N(this.a).a(), i2);
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g.b$b  reason: collision with other inner class name */
    /* compiled from: IotDeviceDetailsHolderButtonRow.kt */
    public static final class C0533b {
        private C0533b() {
        }

        public final a a(ViewGroup viewGroup, d dVar, ValueAnimator valueAnimator) {
            k.e(viewGroup, "parent");
            k.e(dVar, "viewModel");
            k.e(valueAnimator, "animator");
            Context context = viewGroup.getContext();
            k.c(context);
            com.sensorberg.smartworkspace.app.widgets.a aVar = new com.sensorberg.smartworkspace.app.widgets.a(context, (AttributeSet) null);
            aVar.setValueAnimator(valueAnimator);
            x xVar = x.a;
            return new b(aVar, dVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C0533b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ b(com.sensorberg.smartworkspace.app.widgets.a aVar, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, dVar);
    }

    public static final /* synthetic */ e.a N(b bVar) {
        e.a aVar = bVar.v;
        if (aVar != null) {
            return aVar;
        }
        k.q("data");
        throw null;
    }

    public void M(e eVar) {
        k.e(eVar, "baseData");
        if (eVar instanceof e.a) {
            this.v = (e.a) eVar;
            View view = this.a;
            k.d(view, "itemView");
            Context context = view.getContext();
            k.d(context, "itemView.context");
            Resources resources = context.getResources();
            k.d(resources, "itemView.context.resources");
            com.sensorberg.smartworkspace.app.widgets.a aVar = this.w;
            int i2 = (int) (((float) this.t) * resources.getDisplayMetrics().density);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.text_style_h5);
            int i3 = (int) (((float) this.u) * resources.getDisplayMetrics().density);
            View view2 = this.a;
            k.d(view2, "itemView");
            int c = androidx.core.content.a.c(view2.getContext(), R.color.colorButtonPrimaryText);
            e.a aVar2 = this.v;
            if (aVar2 != null) {
                List<String> c2 = aVar2.c();
                View view3 = this.a;
                k.d(view3, "itemView");
                aVar.e(i2, dimensionPixelSize, i3, c, c2, androidx.core.content.a.f(view3.getContext(), R.drawable.button_selectable_background));
                com.sensorberg.smartworkspace.app.widgets.a aVar3 = this.w;
                e.a aVar4 = this.v;
                if (aVar4 != null) {
                    aVar3.d(aVar4.b());
                    com.sensorberg.smartworkspace.app.widgets.a aVar5 = this.w;
                    e.a aVar6 = this.v;
                    if (aVar6 != null) {
                        aVar5.setIsLoading(aVar6.d());
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

    private b(com.sensorberg.smartworkspace.app.widgets.a aVar, d dVar) {
        super(aVar);
        this.w = aVar;
        this.x = dVar;
        View view = this.a;
        k.d(view, "itemView");
        Context context = view.getContext();
        k.d(context, "itemView.context");
        this.t = context.getResources().getDimensionPixelSize(R.dimen.iotdevice_details_button_row_min_height);
        View view2 = this.a;
        k.d(view2, "itemView");
        Context context2 = view2.getContext();
        k.d(context2, "itemView.context");
        this.u = context2.getResources().getDimensionPixelSize(R.dimen.iotdevice_details_button_row_internal_margin);
        this.w.setOnItemSelectedListener(new a(this));
    }
}
