package com.microsoft.appcenter.k.d;

import com.microsoft.appcenter.k.d.i.d;
import com.microsoft.appcenter.k.d.i.e;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: CustomPropertiesLog */
public class b extends a {

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Object> f4559h;

    private static Map<String, Object> p(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("properties");
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            hashMap.put(jSONObject2.getString("name"), q(jSONObject2));
        }
        return hashMap;
    }

    private static Object q(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        if (string.equals("clear")) {
            return null;
        }
        if (string.equals("boolean")) {
            return Boolean.valueOf(jSONObject.getBoolean("value"));
        }
        if (string.equals("number")) {
            Object obj = jSONObject.get("value");
            if (obj instanceof Number) {
                return obj;
            }
            throw new JSONException("Invalid value type");
        } else if (string.equals("dateTime")) {
            return d.b(jSONObject.getString("value"));
        } else {
            if (string.equals("string")) {
                return jSONObject.getString("value");
            }
            throw new JSONException("Invalid value type");
        }
    }

    private static void s(JSONStringer jSONStringer, Map<String, Object> map) {
        if (map != null) {
            jSONStringer.key("properties").array();
            for (Map.Entry next : map.entrySet()) {
                jSONStringer.object();
                e.d(jSONStringer, "name", next.getKey());
                t(jSONStringer, next.getValue());
                jSONStringer.endObject();
            }
            jSONStringer.endArray();
            return;
        }
        throw new JSONException("Properties cannot be null");
    }

    private static void t(JSONStringer jSONStringer, Object obj) {
        if (obj == null) {
            e.d(jSONStringer, "type", "clear");
        } else if (obj instanceof Boolean) {
            e.d(jSONStringer, "type", "boolean");
            e.d(jSONStringer, "value", obj);
        } else if (obj instanceof Number) {
            e.d(jSONStringer, "type", "number");
            e.d(jSONStringer, "value", obj);
        } else if (obj instanceof Date) {
            e.d(jSONStringer, "type", "dateTime");
            e.d(jSONStringer, "value", d.c((Date) obj));
        } else if (obj instanceof String) {
            e.d(jSONStringer, "type", "string");
            e.d(jSONStringer, "value", obj);
        } else {
            throw new JSONException("Invalid value type");
        }
    }

    public void a(JSONStringer jSONStringer) {
        super.a(jSONStringer);
        s(jSONStringer, o());
    }

    public void d(JSONObject jSONObject) {
        super.d(jSONObject);
        r(p(jSONObject));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Map<String, Object> map = this.f4559h;
        Map<String, Object> map2 = ((b) obj).f4559h;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public String getType() {
        return "customProperties";
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Map<String, Object> map = this.f4559h;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public Map<String, Object> o() {
        return this.f4559h;
    }

    public void r(Map<String, Object> map) {
        this.f4559h = map;
    }
}
