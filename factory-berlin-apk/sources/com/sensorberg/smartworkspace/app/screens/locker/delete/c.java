package com.sensorberg.smartworkspace.app.screens.locker.delete;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerDeletedBookingFragmentArgs.kt */
public final class c implements e {
    public static final a b = new a((DefaultConstructorMarker) null);
    private final IotUnit a;

    /* compiled from: LockerDeletedBookingFragmentArgs.kt */
    public static final class a {
        private a() {
        }

        public final c a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(c.class.getClassLoader());
            if (!bundle.containsKey("iotUnit")) {
                throw new IllegalArgumentException("Required argument \"iotUnit\" is missing and does not have an android:defaultValue");
            } else if (Parcelable.class.isAssignableFrom(IotUnit.class) || Serializable.class.isAssignableFrom(IotUnit.class)) {
                IotUnit iotUnit = (IotUnit) bundle.get("iotUnit");
                if (iotUnit != null) {
                    return new c(iotUnit);
                }
                throw new IllegalArgumentException("Argument \"iotUnit\" is marked as non-null but was passed a null value.");
            } else {
                throw new UnsupportedOperationException(IotUnit.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(IotUnit iotUnit) {
        k.e(iotUnit, "iotUnit");
        this.a = iotUnit;
    }

    public static final c fromBundle(Bundle bundle) {
        return b.a(bundle);
    }

    public final IotUnit a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && k.a(this.a, ((c) obj).a);
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
        return "LockerDeletedBookingFragmentArgs(iotUnit=" + this.a + ")";
    }
}
