package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: LocExtension */
public class f implements com.microsoft.appcenter.k.d.f {
    private String a;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "tz", k());
    }

    public void d(JSONObject jSONObject) {
        l(jSONObject.optString("tz", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        String str = this.a;
        String str2 = ((f) obj).a;
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
