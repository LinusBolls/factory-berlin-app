package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: DeviceExtension */
public class d implements f {
    private String a;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "localId", k());
    }

    public void d(JSONObject jSONObject) {
        l(jSONObject.optString("localId", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        String str = this.a;
        String str2 = ((d) obj).a;
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
