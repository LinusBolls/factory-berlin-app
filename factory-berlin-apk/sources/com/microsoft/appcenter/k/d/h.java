package com.microsoft.appcenter.k.d;

import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: WrapperSdk */
public class h implements f {
    private String a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f4569d;

    /* renamed from: e  reason: collision with root package name */
    private String f4570e;

    /* renamed from: f  reason: collision with root package name */
    private String f4571f;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "wrapperSdkVersion", p());
        e.d(jSONStringer, "wrapperSdkName", o());
        e.d(jSONStringer, "wrapperRuntimeVersion", n());
        e.d(jSONStringer, "liveUpdateReleaseLabel", m());
        e.d(jSONStringer, "liveUpdateDeploymentKey", k());
        e.d(jSONStringer, "liveUpdatePackageHash", l());
    }

    public void d(JSONObject jSONObject) {
        v(jSONObject.optString("wrapperSdkVersion", (String) null));
        u(jSONObject.optString("wrapperSdkName", (String) null));
        t(jSONObject.optString("wrapperRuntimeVersion", (String) null));
        s(jSONObject.optString("liveUpdateReleaseLabel", (String) null));
        q(jSONObject.optString("liveUpdateDeploymentKey", (String) null));
        r(jSONObject.optString("liveUpdatePackageHash", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.a;
        if (str == null ? hVar.a != null : !str.equals(hVar.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? hVar.b != null : !str2.equals(hVar.b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null ? hVar.c != null : !str3.equals(hVar.c)) {
            return false;
        }
        String str4 = this.f4569d;
        if (str4 == null ? hVar.f4569d != null : !str4.equals(hVar.f4569d)) {
            return false;
        }
        String str5 = this.f4570e;
        if (str5 == null ? hVar.f4570e != null : !str5.equals(hVar.f4570e)) {
            return false;
        }
        String str6 = this.f4571f;
        String str7 = hVar.f4571f;
        if (str6 != null) {
            return str6.equals(str7);
        }
        if (str7 == null) {
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
        String str4 = this.f4569d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f4570e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f4571f;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    public String k() {
        return this.f4570e;
    }

    public String l() {
        return this.f4571f;
    }

    public String m() {
        return this.f4569d;
    }

    public String n() {
        return this.c;
    }

    public String o() {
        return this.b;
    }

    public String p() {
        return this.a;
    }

    public void q(String str) {
        this.f4570e = str;
    }

    public void r(String str) {
        this.f4571f = str;
    }

    public void s(String str) {
        this.f4569d = str;
    }

    public void t(String str) {
        this.c = str;
    }

    public void u(String str) {
        this.b = str;
    }

    public void v(String str) {
        this.a = str;
    }
}
