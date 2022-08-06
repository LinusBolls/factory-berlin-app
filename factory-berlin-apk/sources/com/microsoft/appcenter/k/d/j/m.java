package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: UserExtension */
public class m implements f {
    private String a;
    private String b;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "localId", k());
        e.d(jSONStringer, "locale", l());
    }

    public void d(JSONObject jSONObject) {
        m(jSONObject.optString("localId", (String) null));
        n(jSONObject.optString("locale", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.a;
        if (str == null ? mVar.a != null : !str.equals(mVar.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = mVar.b;
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
