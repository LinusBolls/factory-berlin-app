package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: SpaceDetailFragmentDirections.kt */
public final class j {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: SpaceDetailFragmentDirections.kt */
    public static final class a {
        private a() {
        }

        public final p a(String str, String str2, IotDeviceIdentifier iotDeviceIdentifier) {
            k.e(str, "id");
            k.e(iotDeviceIdentifier, "type");
            return new b(str, str2, iotDeviceIdentifier);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SpaceDetailFragmentDirections.kt */
    private static final class b implements p {
        private final String a;
        private final String b;
        private final IotDeviceIdentifier c;

        public b(String str, String str2, IotDeviceIdentifier iotDeviceIdentifier) {
            k.e(str, "id");
            k.e(iotDeviceIdentifier, "type");
            this.a = str;
            this.b = str2;
            this.c = iotDeviceIdentifier;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("id", this.a);
            bundle.putString("name", this.b);
            if (Parcelable.class.isAssignableFrom(IotDeviceIdentifier.class)) {
                IotDeviceIdentifier iotDeviceIdentifier = this.c;
                if (iotDeviceIdentifier != null) {
                    bundle.putParcelable("type", (Parcelable) iotDeviceIdentifier);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
                }
            } else if (Serializable.class.isAssignableFrom(IotDeviceIdentifier.class)) {
                IotDeviceIdentifier iotDeviceIdentifier2 = this.c;
                if (iotDeviceIdentifier2 != null) {
                    bundle.putSerializable("type", iotDeviceIdentifier2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.io.Serializable");
                }
            } else {
                throw new UnsupportedOperationException(IotDeviceIdentifier.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int b() {
            return R.id.toIotDeviceDetailsFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(this.a, bVar.a) && k.a(this.b, bVar.b) && k.a(this.c, bVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            IotDeviceIdentifier iotDeviceIdentifier = this.c;
            if (iotDeviceIdentifier != null) {
                i2 = iotDeviceIdentifier.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "ToIotDeviceDetailsFragment(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ")";
        }
    }
}
