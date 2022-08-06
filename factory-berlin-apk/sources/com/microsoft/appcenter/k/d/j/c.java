package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: Data */
public class c implements f {
    private final JSONObject a = new JSONObject();

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "baseType", this.a.optString("baseType", (String) null));
        e.d(jSONStringer, "baseData", this.a.optJSONObject("baseData"));
        JSONArray names = this.a.names();
        if (names != null) {
            for (int i2 = 0; i2 < names.length(); i2++) {
                String string = names.getString(i2);
                if (!string.equals("baseType") && !string.equals("baseData")) {
                    jSONStringer.key(string).value(this.a.get(string));
                }
            }
        }
    }

    public void d(JSONObject jSONObject) {
        JSONArray names = jSONObject.names();
        if (names != null) {
            for (int i2 = 0; i2 < names.length(); i2++) {
                String string = names.getString(i2);
                this.a.put(string, jSONObject.get(string));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.a.toString().equals(((c) obj).a.toString());
    }

    public int hashCode() {
        return this.a.toString().hashCode();
    }
}
