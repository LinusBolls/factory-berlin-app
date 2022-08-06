package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import java.util.Iterator;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: MetadataExtension */
public class g implements f {
    private JSONObject a = new JSONObject();

    public void a(JSONStringer jSONStringer) {
        Iterator<String> keys = this.a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONStringer.key(next).value(this.a.get(next));
        }
    }

    public void d(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return this.a.toString().equals(((g) obj).a.toString());
    }

    public int hashCode() {
        return this.a.toString().hashCode();
    }
}
