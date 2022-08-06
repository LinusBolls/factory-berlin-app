package com.google.firebase.crashlytics.d.q;

import com.google.firebase.crashlytics.d.h.r;
import com.google.firebase.crashlytics.d.q.i.c;
import com.google.firebase.crashlytics.d.q.i.d;
import com.google.firebase.crashlytics.d.q.i.e;
import com.google.firebase.crashlytics.d.q.i.f;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform */
class b implements g {
    b() {
    }

    private static com.google.firebase.crashlytics.d.q.i.b b(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.d.q.i.b(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    private static c c(JSONObject jSONObject) {
        return new c(jSONObject.optBoolean("collect_reports", true));
    }

    private static d d(JSONObject jSONObject) {
        return new d(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    static e e(r rVar) {
        JSONObject jSONObject = new JSONObject();
        return new f(f(rVar, 3600, jSONObject), (com.google.firebase.crashlytics.d.q.i.b) null, d(jSONObject), c(jSONObject), 0, 3600);
    }

    private static long f(r rVar, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return rVar.a() + (j2 * 1000);
    }

    public f a(r rVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new f(f(rVar, (long) optInt2, jSONObject), b(jSONObject.getJSONObject("app")), d(jSONObject.getJSONObject("session")), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
