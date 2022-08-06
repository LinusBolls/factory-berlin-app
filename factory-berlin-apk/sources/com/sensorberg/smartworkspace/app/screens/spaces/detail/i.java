package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.os.Bundle;
import androidx.navigation.e;
import kotlin.jvm.internal.k;

/* compiled from: SpaceDetailFragmentArgs.kt */
public final class i implements e {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;

    /* compiled from: SpaceDetailFragmentArgs.kt */
    public static final class a {
        private a() {
        }

        public final i a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(i.class.getClassLoader());
            if (bundle.containsKey("id")) {
                String string = bundle.getString("id");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("name")) {
                    return new i(string, bundle.getString("name"));
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

    public i(String str, String str2) {
        k.e(str, "id");
        this.a = str;
        this.b = str2;
    }

    public static final i fromBundle(Bundle bundle) {
        return c.a(bundle);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k.a(this.a, iVar.a) && k.a(this.b, iVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SpaceDetailFragmentArgs(id=" + this.a + ", name=" + this.b + ")";
    }
}
