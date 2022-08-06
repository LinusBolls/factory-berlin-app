package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.widgets.c;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceDetailsHolderInfo.kt */
public final class d extends a {
    public static final a u = new a((DefaultConstructorMarker) null);
    private final c t;

    /* compiled from: IotDeviceDetailsHolderInfo.kt */
    public static final class a {
        private a() {
        }

        public final a a(ViewGroup viewGroup) {
            k.e(viewGroup, "parent");
            Context context = viewGroup.getContext();
            k.c(context);
            return new d(new c(context, (AttributeSet) null));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(cVar);
        k.e(cVar, "info");
        this.t = cVar;
    }

    public void M(e eVar) {
        k.e(eVar, "baseData");
        if (eVar instanceof e.c) {
            e.c cVar = (e.c) eVar;
            this.t.a(cVar.b(), cVar.c());
            return;
        }
        throw new IllegalStateException("Data cannot be " + eVar.getClass() + " for " + getClass());
    }
}
