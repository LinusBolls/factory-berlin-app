package com.google.firebase.crashlytics.d.q;

import com.google.firebase.crashlytics.d.h.r;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser */
public class f {
    private final r a;

    f(r rVar) {
        this.a = rVar;
    }

    private static g a(int i2) {
        if (i2 != 3) {
            return new b();
        }
        return new h();
    }

    public com.google.firebase.crashlytics.d.q.i.f b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
