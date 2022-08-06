package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: NetExtension */
public class h implements f {
    private String a;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "provider", k());
    }

    public void d(JSONObject jSONObject) {
        l(jSONObject.optString("provider", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        String str = this.a;
        String str2 = ((h) obj).a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String k() {
        return this.a;
    }

    public void l(String str) {
        this.a = str;
    }
}
