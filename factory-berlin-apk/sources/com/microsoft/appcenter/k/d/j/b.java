package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.a;
import com.microsoft.appcenter.k.d.i.d;
import com.microsoft.appcenter.k.d.i.e;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: CommonSchemaLog */
public abstract class b extends a {

    /* renamed from: h  reason: collision with root package name */
    private String f4574h;

    /* renamed from: i  reason: collision with root package name */
    private String f4575i;

    /* renamed from: j  reason: collision with root package name */
    private Double f4576j;

    /* renamed from: k  reason: collision with root package name */
    private String f4577k;

    /* renamed from: l  reason: collision with root package name */
    private Long f4578l;

    /* renamed from: m  reason: collision with root package name */
    private String f4579m;

    /* renamed from: n  reason: collision with root package name */
    private e f4580n;
    private c o;

    public void A(String str) {
        this.f4577k = str;
    }

    public void B(String str) {
        this.f4575i = str;
    }

    public void C(Double d2) {
        this.f4576j = d2;
    }

    public void D(String str) {
        this.f4574h = str;
    }

    public void a(JSONStringer jSONStringer) {
        jSONStringer.key("ver").value(v());
        jSONStringer.key("name").value(t());
        jSONStringer.key("time").value(d.c(j()));
        e.d(jSONStringer, "popSample", u());
        e.d(jSONStringer, "iKey", s());
        e.d(jSONStringer, "flags", r());
        e.d(jSONStringer, "cV", o());
        if (q() != null) {
            jSONStringer.key("ext").object();
            q().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (p() != null) {
            jSONStringer.key("data").object();
            p().a(jSONStringer);
            jSONStringer.endObject();
        }
    }

    public void d(JSONObject jSONObject) {
        D(jSONObject.getString("ver"));
        B(jSONObject.getString("name"));
        h(d.b(jSONObject.getString("time")));
        if (jSONObject.has("popSample")) {
            C(Double.valueOf(jSONObject.getDouble("popSample")));
        }
        A(jSONObject.optString("iKey", (String) null));
        z(e.b(jSONObject, "flags"));
        w(jSONObject.optString("cV", (String) null));
        if (jSONObject.has("ext")) {
            e eVar = new e();
            eVar.d(jSONObject.getJSONObject("ext"));
            y(eVar);
        }
        if (jSONObject.has("data")) {
            c cVar = new c();
            cVar.d(jSONObject.getJSONObject("data"));
            x(cVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f4574h;
        if (str == null ? bVar.f4574h != null : !str.equals(bVar.f4574h)) {
            return false;
        }
        String str2 = this.f4575i;
        if (str2 == null ? bVar.f4575i != null : !str2.equals(bVar.f4575i)) {
            return false;
        }
        Double d2 = this.f4576j;
        if (d2 == null ? bVar.f4576j != null : !d2.equals(bVar.f4576j)) {
            return false;
        }
        String str3 = this.f4577k;
        if (str3 == null ? bVar.f4577k != null : !str3.equals(bVar.f4577k)) {
            return false;
        }
        Long l2 = this.f4578l;
        if (l2 == null ? bVar.f4578l != null : !l2.equals(bVar.f4578l)) {
            return false;
        }
        String str4 = this.f4579m;
        if (str4 == null ? bVar.f4579m != null : !str4.equals(bVar.f4579m)) {
            return false;
        }
        e eVar = this.f4580n;
        if (eVar == null ? bVar.f4580n != null : !eVar.equals(bVar.f4580n)) {
            return false;
        }
        c cVar = this.o;
        c cVar2 = bVar.o;
        if (cVar != null) {
            return cVar.equals(cVar2);
        }
        if (cVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f4574h;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4575i;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Double d2 = this.f4576j;
        int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
        String str3 = this.f4577k;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l2 = this.f4578l;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str4 = this.f4579m;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        e eVar = this.f4580n;
        int hashCode8 = (hashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        c cVar = this.o;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode8 + i2;
    }

    public String o() {
        return this.f4579m;
    }

    public c p() {
        return this.o;
    }

    public e q() {
        return this.f4580n;
    }

    public Long r() {
        return this.f4578l;
    }

    public String s() {
        return this.f4577k;
    }

    public String t() {
        return this.f4575i;
    }

    public Double u() {
        return this.f4576j;
    }

    public String v() {
        return this.f4574h;
    }

    public void w(String str) {
        this.f4579m = str;
    }

    public void x(c cVar) {
        this.o = cVar;
    }

    public void y(e eVar) {
        this.f4580n = eVar;
    }

    public void z(Long l2) {
        this.f4578l = l2;
    }
}
