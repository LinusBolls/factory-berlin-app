package com.microsoft.appcenter.distribute;

import org.json.JSONObject;

/* compiled from: ErrorDetails */
class d {
    private String a;

    d() {
    }

    static d b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        d dVar = new d();
        dVar.a = jSONObject.getString("code");
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }
}
