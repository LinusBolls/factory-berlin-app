package com.sensorberg.smartworkspace.app.screens.alarm;

import android.os.Bundle;
import kotlin.jvm.internal.k;

/* compiled from: AlarmFragmentArgs.kt */
public final class e implements androidx.navigation.e {
    public static final a b = new a((DefaultConstructorMarker) null);
    private final String a;

    /* compiled from: AlarmFragmentArgs.kt */
    public static final class a {
        private a() {
        }

        public final e a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(e.class.getClassLoader());
            if (bundle.containsKey("itemId")) {
                return new e(bundle.getString("itemId"));
            }
            throw new IllegalArgumentException("Required argument \"itemId\" is missing and does not have an android:defaultValue");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(String str) {
        this.a = str;
    }

    public static final e fromBundle(Bundle bundle) {
        return b.a(bundle);
    }

    public final String a() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("itemId", this.a);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && k.a(this.a, ((e) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AlarmFragmentArgs(itemId=" + this.a + ")";
    }
}
