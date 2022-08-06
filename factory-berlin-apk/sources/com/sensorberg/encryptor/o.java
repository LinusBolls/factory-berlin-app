package com.sensorberg.encryptor;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.k;

/* compiled from: VersionUpdate.kt */
public final class o {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final boolean a;
    private final boolean b;

    /* compiled from: VersionUpdate.kt */
    public static final class a {
        private a() {
        }

        public final o a(SharedPreferences sharedPreferences, String str, Context context, String str2) {
            k.f(sharedPreferences, "prefs");
            k.f(str, "currentVersion");
            k.f(context, "context");
            k.f(str2, "alias");
            boolean b = b.a.b(sharedPreferences, context, str2);
            String string = sharedPreferences.getString("com.sensorberg.encryptor.pref_encryptor_version", (String) null);
            boolean z = false;
            n.a.a.j("Current version " + str + ". Saved version " + string, new Object[0]);
            sharedPreferences.edit().putString("com.sensorberg.encryptor.pref_encryptor_version", str).apply();
            if (string == null) {
                z = true;
            }
            return new o(z, b, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ o(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    private o(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
