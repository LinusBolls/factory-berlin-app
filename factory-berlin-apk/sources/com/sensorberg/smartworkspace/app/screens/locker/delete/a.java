package com.sensorberg.smartworkspace.app.screens.locker.delete;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerDeleteBookingFragmentDirections.kt */
public final class a {
    public static final C0503a a = new C0503a((DefaultConstructorMarker) null);

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.delete.a$a  reason: collision with other inner class name */
    /* compiled from: LockerDeleteBookingFragmentDirections.kt */
    public static final class C0503a {
        private C0503a() {
        }

        public final p a(IotUnit iotUnit) {
            k.e(iotUnit, "iotUnit");
            return new b(iotUnit);
        }

        public /* synthetic */ C0503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerDeleteBookingFragmentDirections.kt */
    private static final class b implements p {
        private final IotUnit a;

        public b(IotUnit iotUnit) {
            k.e(iotUnit, "iotUnit");
            this.a = iotUnit;
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
            return bundle;
        }

        public int b() {
            return R.id.to_lockerEndedFragment;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && k.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            IotUnit iotUnit = this.a;
            if (iotUnit != null) {
                return iotUnit.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "ToLockerEndedFragment(iotUnit=" + this.a + ")";
        }
    }
}
