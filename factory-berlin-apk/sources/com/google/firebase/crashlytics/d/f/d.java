package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;
import com.google.firebase.crashlytics.d.g.a;
import com.google.firebase.crashlytics.d.g.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver */
public class d implements b, b {
    private a a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void a(a aVar) {
        this.a = aVar;
        com.google.firebase.crashlytics.d.b.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    public void n(String str, Bundle bundle) {
        a aVar = this.a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                com.google.firebase.crashlytics.d.b.f().i("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
