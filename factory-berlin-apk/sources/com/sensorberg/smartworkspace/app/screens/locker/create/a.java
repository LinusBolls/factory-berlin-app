package com.sensorberg.smartworkspace.app.screens.locker.create;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: LockerCreateBookingFragmentArgs.kt */
public final class a implements e {
    public static final C0499a c = new C0499a((DefaultConstructorMarker) null);
    private final LockerGroupSelection a;
    private final IotUnit b;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.create.a$a  reason: collision with other inner class name */
    /* compiled from: LockerCreateBookingFragmentArgs.kt */
    public static final class C0499a {
        private C0499a() {
        }

        public final a a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (!bundle.containsKey("groupSelection")) {
                throw new IllegalArgumentException("Required argument \"groupSelection\" is missing and does not have an android:defaultValue");
            } else if (Parcelable.class.isAssignableFrom(LockerGroupSelection.class) || Serializable.class.isAssignableFrom(LockerGroupSelection.class)) {
                LockerGroupSelection lockerGroupSelection = (LockerGroupSelection) bundle.get("groupSelection");
                if (!bundle.containsKey("iotUnit")) {
                    throw new IllegalArgumentException("Required argument \"iotUnit\" is missing and does not have an android:defaultValue");
                } else if (Parcelable.class.isAssignableFrom(IotUnit.class) || Serializable.class.isAssignableFrom(IotUnit.class)) {
                    return new a(lockerGroupSelection, (IotUnit) bundle.get("iotUnit"));
                } else {
                    throw new UnsupportedOperationException(IotUnit.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new UnsupportedOperationException(LockerGroupSelection.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
        }

        public /* synthetic */ C0499a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(LockerGroupSelection lockerGroupSelection, IotUnit iotUnit) {
        this.a = lockerGroupSelection;
        this.b = iotUnit;
    }

    public static final a fromBundle(Bundle bundle) {
        return c.a(bundle);
    }

    public final LockerGroupSelection a() {
        return this.a;
    }

    public final IotUnit b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.a, aVar.a) && k.a(this.b, aVar.b);
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
        return "LockerCreateBookingFragmentArgs(groupSelection=" + this.a + ", iotUnit=" + this.b + ")";
    }
}
