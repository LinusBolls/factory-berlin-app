package com.microsoft.appcenter.k.d;

import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: Device */
public class c extends h {

    /* renamed from: g  reason: collision with root package name */
    private String f4560g;

    /* renamed from: h  reason: collision with root package name */
    private String f4561h;

    /* renamed from: i  reason: collision with root package name */
    private String f4562i;

    /* renamed from: j  reason: collision with root package name */
    private String f4563j;

    /* renamed from: k  reason: collision with root package name */
    private String f4564k;

    /* renamed from: l  reason: collision with root package name */
    private String f4565l;

    /* renamed from: m  reason: collision with root package name */
    private String f4566m;

    /* renamed from: n  reason: collision with root package name */
    private Integer f4567n;
    private String o;
    private Integer p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;

    public String A() {
        return this.s;
    }

    public String B() {
        return this.o;
    }

    public String C() {
        return this.f4562i;
    }

    public String D() {
        return this.f4563j;
    }

    public Integer E() {
        return this.f4567n;
    }

    public String F() {
        return this.f4566m;
    }

    public String G() {
        return this.f4564k;
    }

    public String H() {
        return this.f4565l;
    }

    public String I() {
        return this.q;
    }

    public String J() {
        return this.f4560g;
    }

    public String K() {
        return this.f4561h;
    }

    public Integer L() {
        return this.p;
    }

    public void M(String str) {
        this.u = str;
    }

    public void N(String str) {
        this.v = str;
    }

    public void O(String str) {
        this.r = str;
    }

    public void P(String str) {
        this.t = str;
    }

    public void Q(String str) {
        this.s = str;
    }

    public void R(String str) {
        this.o = str;
    }

    public void S(String str) {
        this.f4562i = str;
    }

    public void T(String str) {
        this.f4563j = str;
    }

    public void U(Integer num) {
        this.f4567n = num;
    }

    public void V(String str) {
        this.f4566m = str;
    }

    public void W(String str) {
        this.f4564k = str;
    }

    public void X(String str) {
        this.f4565l = str;
    }

    public void Y(String str) {
        this.q = str;
    }

    public void Z(String str) {
        this.f4560g = str;
    }

    public void a(JSONStringer jSONStringer) {
        super.a(jSONStringer);
        jSONStringer.key("sdkName").value(J());
        jSONStringer.key("sdkVersion").value(K());
        jSONStringer.key("model").value(C());
        jSONStringer.key("oemName").value(D());
        jSONStringer.key("osName").value(G());
        jSONStringer.key("osVersion").value(H());
        e.d(jSONStringer, "osBuild", F());
        e.d(jSONStringer, "osApiLevel", E());
        jSONStringer.key("locale").value(B());
        jSONStringer.key("timeZoneOffset").value(L());
        jSONStringer.key("screenSize").value(I());
        jSONStringer.key("appVersion").value(y());
        e.d(jSONStringer, "carrierName", A());
        e.d(jSONStringer, "carrierCountry", z());
        jSONStringer.key("appBuild").value(w());
        e.d(jSONStringer, "appNamespace", x());
    }

    public void a0(String str) {
        this.f4561h = str;
    }

    public void b0(Integer num) {
        this.p = num;
    }

    public void d(JSONObject jSONObject) {
        super.d(jSONObject);
        Z(jSONObject.getString("sdkName"));
        a0(jSONObject.getString("sdkVersion"));
        S(jSONObject.getString("model"));
        T(jSONObject.getString("oemName"));
        W(jSONObject.getString("osName"));
        X(jSONObject.getString("osVersion"));
        V(jSONObject.optString("osBuild", (String) null));
        U(e.a(jSONObject, "osApiLevel"));
        R(jSONObject.getString("locale"));
        b0(Integer.valueOf(jSONObject.getInt("timeZoneOffset")));
        Y(jSONObject.getString("screenSize"));
        O(jSONObject.getString("appVersion"));
        Q(jSONObject.optString("carrierName", (String) null));
        P(jSONObject.optString("carrierCountry", (String) null));
        M(jSONObject.getString("appBuild"));
        N(jSONObject.optString("appNamespace", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f4560g;
        if (str == null ? cVar.f4560g != null : !str.equals(cVar.f4560g)) {
            return false;
        }
        String str2 = this.f4561h;
        if (str2 == null ? cVar.f4561h != null : !str2.equals(cVar.f4561h)) {
            return false;
        }
        String str3 = this.f4562i;
        if (str3 == null ? cVar.f4562i != null : !str3.equals(cVar.f4562i)) {
            return false;
        }
        String str4 = this.f4563j;
        if (str4 == null ? cVar.f4563j != null : !str4.equals(cVar.f4563j)) {
            return false;
        }
        String str5 = this.f4564k;
        if (str5 == null ? cVar.f4564k != null : !str5.equals(cVar.f4564k)) {
            return false;
        }
        String str6 = this.f4565l;
        if (str6 == null ? cVar.f4565l != null : !str6.equals(cVar.f4565l)) {
            return false;
        }
        String str7 = this.f4566m;
        if (str7 == null ? cVar.f4566m != null : !str7.equals(cVar.f4566m)) {
            return false;
        }
        Integer num = this.f4567n;
        if (num == null ? cVar.f4567n != null : !num.equals(cVar.f4567n)) {
            return false;
        }
        String str8 = this.o;
        if (str8 == null ? cVar.o != null : !str8.equals(cVar.o)) {
            return false;
        }
        Integer num2 = this.p;
        if (num2 == null ? cVar.p != null : !num2.equals(cVar.p)) {
            return false;
        }
        String str9 = this.q;
        if (str9 == null ? cVar.q != null : !str9.equals(cVar.q)) {
            return false;
        }
        String str10 = this.r;
        if (str10 == null ? cVar.r != null : !str10.equals(cVar.r)) {
            return false;
        }
        String str11 = this.s;
        if (str11 == null ? cVar.s != null : !str11.equals(cVar.s)) {
            return false;
        }
        String str12 = this.t;
        if (str12 == null ? cVar.t != null : !str12.equals(cVar.t)) {
            return false;
        }
        String str13 = this.u;
        if (str13 == null ? cVar.u != null : !str13.equals(cVar.u)) {
            return false;
        }
        String str14 = this.v;
        String str15 = cVar.v;
        if (str14 != null) {
            return str14.equals(str15);
        }
        if (str15 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f4560g;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4561h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4562i;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f4563j;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f4564k;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f4565l;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f4566m;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num = this.f4567n;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        String str8 = this.o;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num2 = this.p;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str9 = this.q;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.r;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.s;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.t;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.u;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.v;
        if (str14 != null) {
            i2 = str14.hashCode();
        }
        return hashCode16 + i2;
    }

    public String w() {
        return this.u;
    }

    public String x() {
        return this.v;
    }

    public String y() {
        return this.r;
    }

    public String z() {
        return this.t;
    }
}
