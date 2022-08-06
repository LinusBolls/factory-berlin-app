package com.microsoft.appcenter.k.d;

import com.microsoft.appcenter.k.d.i.d;
import com.microsoft.appcenter.k.d.i.e;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: AbstractLog */
public abstract class a implements d {
    private final Set<String> a = new LinkedHashSet();
    private Date b;
    private UUID c;

    /* renamed from: d  reason: collision with root package name */
    private String f4555d;

    /* renamed from: e  reason: collision with root package name */
    private String f4556e;

    /* renamed from: f  reason: collision with root package name */
    private c f4557f;

    /* renamed from: g  reason: collision with root package name */
    private Object f4558g;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "type", getType());
        jSONStringer.key("timestamp").value(d.c(j()));
        e.d(jSONStringer, "sid", c());
        e.d(jSONStringer, "distributionGroupId", k());
        e.d(jSONStringer, "userId", l());
        if (i() != null) {
            jSONStringer.key("device").object();
            i().a(jSONStringer);
            jSONStringer.endObject();
        }
    }

    public void b(c cVar) {
        this.f4557f = cVar;
    }

    public UUID c() {
        return this.c;
    }

    public void d(JSONObject jSONObject) {
        if (jSONObject.getString("type").equals(getType())) {
            h(d.b(jSONObject.getString("timestamp")));
            if (jSONObject.has("sid")) {
                m(UUID.fromString(jSONObject.getString("sid")));
            }
            g(jSONObject.optString("distributionGroupId", (String) null));
            n(jSONObject.optString("userId", (String) null));
            if (jSONObject.has("device")) {
                c cVar = new c();
                cVar.d(jSONObject.getJSONObject("device"));
                b(cVar);
                return;
            }
            return;
        }
        throw new JSONException("Invalid type");
    }

    public synchronized void e(String str) {
        this.a.add(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a)) {
            return false;
        }
        Date date = this.b;
        if (date == null ? aVar.b != null : !date.equals(aVar.b)) {
            return false;
        }
        UUID uuid = this.c;
        if (uuid == null ? aVar.c != null : !uuid.equals(aVar.c)) {
            return false;
        }
        String str = this.f4555d;
        if (str == null ? aVar.f4555d != null : !str.equals(aVar.f4555d)) {
            return false;
        }
        String str2 = this.f4556e;
        if (str2 == null ? aVar.f4556e != null : !str2.equals(aVar.f4556e)) {
            return false;
        }
        c cVar = this.f4557f;
        if (cVar == null ? aVar.f4557f != null : !cVar.equals(aVar.f4557f)) {
            return false;
        }
        Object obj2 = this.f4558g;
        Object obj3 = aVar.f4558g;
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj3 == null) {
            return true;
        }
        return false;
    }

    public synchronized Set<String> f() {
        return Collections.unmodifiableSet(this.a);
    }

    public void g(String str) {
        this.f4555d = str;
    }

    public void h(Date date) {
        this.b = date;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        UUID uuid = this.c;
        int hashCode3 = (hashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 31;
        String str = this.f4555d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4556e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        c cVar = this.f4557f;
        int hashCode6 = (hashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Object obj = this.f4558g;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode6 + i2;
    }

    public c i() {
        return this.f4557f;
    }

    public Date j() {
        return this.b;
    }

    public String k() {
        return this.f4555d;
    }

    public String l() {
        return this.f4556e;
    }

    public void m(UUID uuid) {
        this.c = uuid;
    }

    public void n(String str) {
        this.f4556e = str;
    }
}
