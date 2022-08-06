package com.microsoft.appcenter.k.d;

import com.microsoft.appcenter.k.d.i.e;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: StartServiceLog */
public class g extends a {

    /* renamed from: h  reason: collision with root package name */
    private List<String> f4568h;

    public void a(JSONStringer jSONStringer) {
        super.a(jSONStringer);
        e.e(jSONStringer, "services", o());
    }

    public void d(JSONObject jSONObject) {
        super.d(jSONObject);
        p(e.c(jSONObject, "services"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        List<String> list = this.f4568h;
        List<String> list2 = ((g) obj).f4568h;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public String getType() {
        return "startService";
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        List<String> list = this.f4568h;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public List<String> o() {
        return this.f4568h;
    }

    public void p(List<String> list) {
        this.f4568h = list;
    }
}
