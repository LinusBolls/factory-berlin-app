package com.microsoft.appcenter.k.d.i;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: JSONUtils */
public class e {
    public static Integer a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static Long b(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    public static List<String> c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            arrayList.add(optJSONArray.getString(i2));
        }
        return arrayList;
    }

    public static void d(JSONStringer jSONStringer, String str, Object obj) {
        if (obj != null) {
            jSONStringer.key(str).value(obj);
        }
    }

    public static void e(JSONStringer jSONStringer, String str, List<String> list) {
        if (list != null) {
            jSONStringer.key(str).array();
            for (String value : list) {
                jSONStringer.value(value);
            }
            jSONStringer.endArray();
        }
    }
}
