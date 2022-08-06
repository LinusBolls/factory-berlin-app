package com.google.firebase.crashlytics.d.q;

import com.google.firebase.crashlytics.d.h.r;
import com.google.firebase.crashlytics.d.q.i.b;
import com.google.firebase.crashlytics.d.q.i.c;
import com.google.firebase.crashlytics.d.q.i.d;
import com.google.firebase.crashlytics.d.q.i.f;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: SettingsV3JsonTransform */
class h implements g {
    h() {
    }

    private static b b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String string = jSONObject2.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        return new b(string, str, String.format(Locale.US, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(Locale.US, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static c c(JSONObject jSONObject) {
        return new c(jSONObject.optBoolean("collect_reports", true));
    }

    private static d d() {
        return new d(8, 4);
    }

    private static long e(r rVar, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return rVar.a() + (j2 * 1000);
    }

    public f a(r rVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new f(e(rVar, (long) optInt2, jSONObject), b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), d(), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
