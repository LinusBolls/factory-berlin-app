package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: AppExtension */
public class a implements f {
    private String a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f4572d;

    /* renamed from: e  reason: collision with root package name */
    private String f4573e;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "id", k());
        e.d(jSONStringer, "ver", o());
        e.d(jSONStringer, "name", m());
        e.d(jSONStringer, "locale", l());
        e.d(jSONStringer, "userId", n());
    }

    public void d(JSONObject jSONObject) {
        p(jSONObject.optString("id", (String) null));
        t(jSONObject.optString("ver", (String) null));
        r(jSONObject.optString("name", (String) null));
        q(jSONObject.optString("locale", (String) null));
        s(jSONObject.optString("userId", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? aVar.b != null : !str2.equals(aVar.b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null ? aVar.c != null : !str3.equals(aVar.c)) {
            return false;
        }
        String str4 = this.f4572d;
        if (str4 == null ? aVar.f4572d != null : !str4.equals(aVar.f4572d)) {
            return false;
        }
        String str5 = this.f4573e;
        String str6 = aVar.f4573e;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f4572d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f4573e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String k() {
        return this.a;
    }

    public String l() {
        return this.f4572d;
    }

    public String m() {
        return this.c;
    }

    public String n() {
        return this.f4573e;
    }

    public String o() {
        return this.b;
    }

    public void p(String str) {
        this.a = str;
    }

    public void q(String str) {
        this.f4572d = str;
    }

    public void r(String str) {
        this.c = str;
    }

    public void s(String str) {
        this.f4573e = str;
    }

    public void t(String str) {
        this.b = str;
    }
}
