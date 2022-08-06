package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: OsExtension */
public class i implements f {
    private String a;
    private String b;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "name", k());
        e.d(jSONStringer, "ver", l());
    }

    public void d(JSONObject jSONObject) {
        m(jSONObject.optString("name", (String) null));
        n(jSONObject.optString("ver", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.a;
        if (str == null ? iVar.a != null : !str.equals(iVar.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = iVar.b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String k() {
        return this.a;
    }

    public String l() {
        return this.b;
    }

    public void m(String str) {
        this.a = str;
    }

    public void n(String str) {
        this.b = str;
    }
}
