package de.baimos;

import java.security.Key;
import org.json.JSONException;
import org.json.JSONObject;

public class al extends ak<al> {
    public al(String str, String str2, Key key) {
        super(str, str2, "settings", "key", key);
    }

    public void a(String str, String str2) {
        c();
        try {
            JSONObject jSONObject = this.b.get(str);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                jSONObject.put("key", str);
            }
            jSONObject.put("value", str2);
            this.b.put(str, jSONObject);
            e();
        } catch (Exception e2) {
            throw new RuntimeException("failed to set data", e2);
        }
    }

    public String b(String str) {
        c();
        try {
            JSONObject jSONObject = this.b.get(str);
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.getString("value");
        } catch (JSONException e2) {
            throw new RuntimeException("failed to set data", e2);
        }
    }
}
