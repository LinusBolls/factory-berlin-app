package com.sensorberg.smartworkspace.app.screens.door.opening;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import com.sensorberg.smartspaces.sdk.model.Openable;
import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: OpenDoorFragmentArgs.kt */
public final class d implements e {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final Openable a;
    private final String b;

    /* compiled from: OpenDoorFragmentArgs.kt */
    public static final class a {
        private a() {
        }

        public final d a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(d.class.getClassLoader());
            if (!bundle.containsKey("openable")) {
                throw new IllegalArgumentException("Required argument \"openable\" is missing and does not have an android:defaultValue");
            } else if (Parcelable.class.isAssignableFrom(Openable.class) || Serializable.class.isAssignableFrom(Openable.class)) {
                Openable openable = (Openable) bundle.get("openable");
                if (bundle.containsKey("unitId")) {
                    return new d(openable, bundle.getString("unitId"));
                }
                throw new IllegalArgumentException("Required argument \"unitId\" is missing and does not have an android:defaultValue");
            } else {
                throw new UnsupportedOperationException(Openable.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(Openable openable, String str) {
        this.a = openable;
        this.b = str;
    }

    public static final d fromBundle(Bundle bundle) {
        return c.a(bundle);
    }

    public final Openable a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.a, dVar.a) && k.a(this.b, dVar.b);
    }

    public int hashCode() {
        Openable openable = this.a;
        int i2 = 0;
        int hashCode = (openable != null ? openable.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "OpenDoorFragmentArgs(openable=" + this.a + ", unitId=" + this.b + ")";
    }
}
