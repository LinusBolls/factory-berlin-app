package com.sensorberg.core.view;

import android.view.ViewOutlineProvider;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.q.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: IotUnitImageView.kt */
public abstract class c {

    /* compiled from: IotUnitImageView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public abstract String a();

    public abstract String b();

    public abstract float c();

    public final ViewOutlineProvider d(IotUnit.HardwareType hardwareType) {
        k.e(hardwareType, "hardwareType");
        int i2 = d.a[hardwareType.ordinal()];
        if (i2 == 1) {
            ViewOutlineProvider a2 = b.a(b(), e(), c());
            k.d(a2, "VectorPathOutlineProvide…lineWidth, outlineHeight)");
            return a2;
        } else if (i2 == 2) {
            ViewOutlineProvider a3 = b.a(a(), e(), c());
            k.d(a3, "VectorPathOutlineProvide…lineWidth, outlineHeight)");
            return a3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public abstract float e();
}
