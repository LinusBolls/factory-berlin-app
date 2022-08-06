package com.microsoft.appcenter.k.d.i;

import com.microsoft.appcenter.k.d.d;
import com.microsoft.appcenter.k.d.e;
import com.microsoft.appcenter.k.d.j.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: DefaultLogSerializer */
public class c implements g {
    private final Map<String, f> a = new HashMap();

    private d f(JSONObject jSONObject, String str) {
        if (str == null) {
            str = jSONObject.getString("type");
        }
        f fVar = this.a.get(str);
        if (fVar != null) {
            d b = fVar.b();
            b.d(jSONObject);
            return b;
        }
        throw new JSONException("Unknown log type: " + str);
    }

    private JSONStringer g(JSONStringer jSONStringer, d dVar) {
        jSONStringer.object();
        dVar.a(jSONStringer);
        jSONStringer.endObject();
        return jSONStringer;
    }

    public Collection<b> a(d dVar) {
        return this.a.get(dVar.getType()).a(dVar);
    }

    public void b(String str, f fVar) {
        this.a.put(str, fVar);
    }

    public d c(String str, String str2) {
        return f(new JSONObject(str), str2);
    }

    public String d(d dVar) {
        JSONStringer jSONStringer = new JSONStringer();
        g(jSONStringer, dVar);
        return jSONStringer.toString();
    }

    public String e(e eVar) {
        JSONStringer jSONStringer = new JSONStringer();
        jSONStringer.object();
        jSONStringer.key("logs").array();
        for (d g2 : eVar.a()) {
            g(jSONStringer, g2);
        }
        jSONStringer.endArray();
        jSONStringer.endObject();
        return jSONStringer.toString();
    }
}
