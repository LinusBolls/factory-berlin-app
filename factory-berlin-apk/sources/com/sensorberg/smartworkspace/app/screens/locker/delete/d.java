package com.sensorberg.smartworkspace.app.screens.locker.delete;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerDeletedBookingFragmentDirections.kt */
public final class d {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: LockerDeletedBookingFragmentDirections.kt */
    public static final class a {
        private a() {
        }

        public final p a(LockerGroupSelection lockerGroupSelection, IotUnit iotUnit) {
            return new b(lockerGroupSelection, iotUnit);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerDeletedBookingFragmentDirections.kt */
    private static final class b implements p {
        private final LockerGroupSelection a;
        private final IotUnit b;

        public b(LockerGroupSelection lockerGroupSelection, IotUnit iotUnit) {
            this.a = lockerGroupSelection;
            this.b = iotUnit;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(LockerGroupSelection.class)) {
                bundle.putParcelable("groupSelection", this.a);
            } else if (Serializable.class.isAssignableFrom(LockerGroupSelection.class)) {
                bundle.putSerializable("groupSelection", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(LockerGroupSelection.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            if (Parcelable.class.isAssignableFrom(IotUnit.class)) {
                bundle.putParcelable("iotUnit", this.b);
            } else if (Serializable.class.isAssignableFrom(IotUnit.class)) {
                bundle.putSerializable("iotUnit", (Serializable) this.b);
            } else {
                throw new UnsupportedOperationException(IotUnit.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int b() {
            return R.id.to_lockerCreateBookingFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(this.a, bVar.a) && k.a(this.b, bVar.b);
        }

        public int hashCode() {
            LockerGroupSelection lockerGroupSelection = this.a;
            int i2 = 0;
            int hashCode = (lockerGroupSelection != null ? lockerGroupSelection.hashCode() : 0) * 31;
            IotUnit iotUnit = this.b;
            if (iotUnit != null) {
                i2 = iotUnit.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "ToLockerCreateBookingFragment(groupSelection=" + this.a + ", iotUnit=" + this.b + ")";
        }
    }
}
