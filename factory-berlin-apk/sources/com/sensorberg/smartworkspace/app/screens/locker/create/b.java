package com.sensorberg.smartworkspace.app.screens.locker.create;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerCreateBookingFragmentDirections.kt */
public final class b {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: LockerCreateBookingFragmentDirections.kt */
    public static final class a {
        private a() {
        }

        public final p a(IotUnit iotUnit, boolean z) {
            k.e(iotUnit, "iotUnit");
            return new C0500b(iotUnit, z);
        }

        public final p b() {
            return new androidx.navigation.a(R.id.to_noLockerAvailableFragment);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.create.b$b  reason: collision with other inner class name */
    /* compiled from: LockerCreateBookingFragmentDirections.kt */
    private static final class C0500b implements p {
        private final IotUnit a;
        private final boolean b;

        public C0500b(IotUnit iotUnit, boolean z) {
            k.e(iotUnit, "iotUnit");
            this.a = iotUnit;
            this.b = z;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(IotUnit.class)) {
                IotUnit iotUnit = this.a;
                if (iotUnit != null) {
                    bundle.putParcelable("iotUnit", iotUnit);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
                }
            } else if (Serializable.class.isAssignableFrom(IotUnit.class)) {
                IotUnit iotUnit2 = this.a;
                if (iotUnit2 != null) {
                    bundle.putSerializable("iotUnit", (Serializable) iotUnit2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.io.Serializable");
                }
            } else {
                throw new UnsupportedOperationException(IotUnit.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putBoolean("endUsage", this.b);
            return bundle;
        }

        public int b() {
            return R.id.to_lockerOpeningFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0500b)) {
                return false;
            }
            C0500b bVar = (C0500b) obj;
            return k.a(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            IotUnit iotUnit = this.a;
            int hashCode = (iotUnit != null ? iotUnit.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "ToLockerOpeningFragment(iotUnit=" + this.a + ", endUsage=" + this.b + ")";
        }
    }
}
