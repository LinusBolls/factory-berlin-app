package com.sensorberg.smartworkspace.app.screens.locker.opening;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerOpeningFragmentArgs.kt */
public final class c implements e {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final IotUnit a;
    private final boolean b;

    /* compiled from: LockerOpeningFragmentArgs.kt */
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
                if (iotUnit == null) {
                    throw new IllegalArgumentException("Argument \"iotUnit\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("endUsage")) {
                    return new c(iotUnit, bundle.getBoolean("endUsage"));
                } else {
                    throw new IllegalArgumentException("Required argument \"endUsage\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new UnsupportedOperationException(IotUnit.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(IotUnit iotUnit, boolean z) {
        k.e(iotUnit, "iotUnit");
        this.a = iotUnit;
        this.b = z;
    }

    public static final c fromBundle(Bundle bundle) {
        return c.a(bundle);
    }

    public final boolean a() {
        return this.b;
    }

    public final IotUnit b() {
        return this.a;
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
        return "LockerOpeningFragmentArgs(iotUnit=" + this.a + ", endUsage=" + this.b + ")";
    }
}
