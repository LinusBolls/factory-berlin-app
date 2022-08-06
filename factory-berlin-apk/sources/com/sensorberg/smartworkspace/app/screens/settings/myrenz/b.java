package com.sensorberg.smartworkspace.app.screens.settings.myrenz;

import android.content.SharedPreferences;
import com.sensorberg.smartworkspace.app.utils.l;
import kotlin.jvm.internal.k;

/* compiled from: MyRenzCredentialsRepositoryImpl.kt */
public final class b implements a {
    private final SharedPreferences a;

    /* compiled from: MyRenzCredentialsRepositoryImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public b(l lVar) {
        k.e(lVar, "sharedPreferenceProvider");
        this.a = lVar.a("myrenz", true);
    }

    public String a() {
        String string = this.a.getString("key_myrenz_password", (String) null);
        return string != null ? string : "";
    }

    public String b() {
        String string = this.a.getString("key_myrenz_username", (String) null);
        return string != null ? string : "";
    }

    public void c(String str, String str2) {
        k.e(str, "username");
        k.e(str2, "password");
        this.a.edit().putString("key_myrenz_username", str).putString("key_myrenz_password", str2).apply();
    }
}
