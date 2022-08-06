package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceDetailsFragmentArgs.kt */
public final class b implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f7919d = new a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;
    private final IotDeviceIdentifier c;

    /* compiled from: IotDeviceDetailsFragmentArgs.kt */
    public static final class a {
        private a() {
        }

        public final b a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            if (bundle.containsKey("id")) {
                String string = bundle.getString("id");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("name")) {
                    String string2 = bundle.getString("name");
                    if (!bundle.containsKey("type")) {
                        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
                    } else if (Parcelable.class.isAssignableFrom(IotDeviceIdentifier.class) || Serializable.class.isAssignableFrom(IotDeviceIdentifier.class)) {
                        IotDeviceIdentifier iotDeviceIdentifier = (IotDeviceIdentifier) bundle.get("type");
                        if (iotDeviceIdentifier != null) {
                            return new b(string, string2, iotDeviceIdentifier);
                        }
                        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
                    } else {
                        throw new UnsupportedOperationException(IotDeviceIdentifier.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                } else {
                    throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(String str, String str2, IotDeviceIdentifier iotDeviceIdentifier) {
        k.e(str, "id");
        k.e(iotDeviceIdentifier, "type");
        this.a = str;
        this.b = str2;
        this.c = iotDeviceIdentifier;
    }

    public static final b fromBundle(Bundle bundle) {
        return f7919d.a(bundle);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final IotDeviceIdentifier c() {
        return this.c;
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
        return "IotDeviceDetailsFragmentArgs(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ")";
    }
}
