package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: ProtocolExtension */
public class k implements f {
    private List<String> a;
    private String b;
    private String c;

    public void a(JSONStringer jSONStringer) {
        e.e(jSONStringer, "ticketKeys", m());
        e.d(jSONStringer, "devMake", k());
        e.d(jSONStringer, "devModel", l());
    }

    public void d(JSONObject jSONObject) {
        p(e.c(jSONObject, "ticketKeys"));
        n(jSONObject.optString("devMake", (String) null));
        o(jSONObject.optString("devModel", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        List<String> list = this.a;
        if (list == null ? kVar.a != null : !list.equals(kVar.a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? kVar.b != null : !str.equals(kVar.b)) {
            return false;
        }
        String str2 = this.c;
        String str3 = kVar.c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String k() {
        return this.b;
    }

    public String l() {
        return this.c;
    }

    public List<String> m() {
        return this.a;
    }

    public void n(String str) {
        this.b = str;
    }

    public void o(String str) {
        this.c = str;
    }

    public void p(List<String> list) {
        this.a = list;
    }
}
