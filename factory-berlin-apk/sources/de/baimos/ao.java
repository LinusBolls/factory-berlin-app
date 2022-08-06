package de.baimos;

import java.io.IOException;
import java.security.Key;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class ao extends ak<ao> {
    public ao(String str, String str2, Key key) {
        super(str, str2, "revocations", "key", key);
    }

    public synchronized void a(String str, String str2) {
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

    public synchronized String b(String str) {
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

    public synchronized void c(String str) {
        this.b.remove(str);
        try {
            e();
        } catch (IOException e2) {
            throw new RuntimeException("failed to remove data", e2);
        }
    }

    public synchronized Set<String> f() {
        c();
        return new HashSet(this.b.keySet());
    }
}
