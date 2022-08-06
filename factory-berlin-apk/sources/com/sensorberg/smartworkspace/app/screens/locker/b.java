package com.sensorberg.smartworkspace.app.screens.locker;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerContainerFragmentDirections.kt */
public final class b {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: LockerContainerFragmentDirections.kt */
    public static final class a {
        private a() {
        }

        public final p a(LockerGroupSelection lockerGroupSelection, IotUnit iotUnit) {
            return new C0496b(lockerGroupSelection, iotUnit);
        }

        public final p b(IotUnit iotUnit, boolean z) {
            k.e(iotUnit, "iotUnit");
            return new c(iotUnit, z);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.b$b  reason: collision with other inner class name */
    /* compiled from: LockerContainerFragmentDirections.kt */
    private static final class C0496b implements p {
        private final LockerGroupSelection a;
        private final IotUnit b;

        public C0496b(LockerGroupSelection lockerGroupSelection, IotUnit iotUnit) {
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
            return R.id.toLockerCreateBookingFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0496b)) {
                return false;
            }
            C0496b bVar = (C0496b) obj;
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

    /* compiled from: LockerContainerFragmentDirections.kt */
    private static final class c implements p {
        private final IotUnit a;
        private final boolean b;

        public c(IotUnit iotUnit, boolean z) {
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
            return R.id.toLockerOpeningFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k.a(this.a, cVar.a) && this.b == cVar.b;
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
