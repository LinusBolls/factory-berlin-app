package com.sensorberg.notifications.sdk.internal;

import android.content.SharedPreferences;
import kotlin.jvm.internal.k;

/* compiled from: VersionUpdate.kt */
public final class l {
    public static final a b = new a((DefaultConstructorMarker) null);
    private final boolean a;

    /* compiled from: VersionUpdate.kt */
    public static final class a {
        private a() {
        }

        public final l a(SharedPreferences sharedPreferences, String str) {
            k.f(sharedPreferences, "prefs");
            k.f(str, "currentVersion");
            String string = sharedPreferences.getString("com.sensorberg.notifications.sdk.pref_sdk_version", (String) null);
            boolean z = false;
            n.a.a.j("Current version " + str + ". Saved version " + string, new Object[0]);
            sharedPreferences.edit().putString("com.sensorberg.notifications.sdk.pref_sdk_version", str).apply();
            if (string == null) {
                z = true;
            }
            return new l(z, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ l(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    private l(boolean z) {
        this.a = z;
    }
}
