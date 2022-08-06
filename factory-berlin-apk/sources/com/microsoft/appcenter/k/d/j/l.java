package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import com.microsoft.appcenter.k.d.i.e;
import java.util.UUID;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: SdkExtension */
public class l implements f {
    private String a;
    private String b;
    private Long c;

    /* renamed from: d  reason: collision with root package name */
    private UUID f4587d;

    public void a(JSONStringer jSONStringer) {
        e.d(jSONStringer, "libVer", m());
        e.d(jSONStringer, "epoch", k());
        e.d(jSONStringer, "seq", n());
        e.d(jSONStringer, "installId", l());
    }

    public void d(JSONObject jSONObject) {
        q(jSONObject.optString("libVer", (String) null));
        o(jSONObject.optString("epoch", (String) null));
        r(e.b(jSONObject, "seq"));
        if (jSONObject.has("installId")) {
            p(UUID.fromString(jSONObject.getString("installId")));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        String str = this.a;
        if (str == null ? lVar.a != null : !str.equals(lVar.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? lVar.b != null : !str2.equals(lVar.b)) {
            return false;
        }
        Long l2 = this.c;
        if (l2 == null ? lVar.c != null : !l2.equals(lVar.c)) {
            return false;
        }
        UUID uuid = this.f4587d;
        UUID uuid2 = lVar.f4587d;
        if (uuid != null) {
            return uuid.equals(uuid2);
        }
        if (uuid2 == null) {
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
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        UUID uuid = this.f4587d;
        if (uuid != null) {
            i2 = uuid.hashCode();
        }
        return hashCode3 + i2;
    }

    public String k() {
        return this.b;
    }

    public UUID l() {
        return this.f4587d;
    }

    public String m() {
        return this.a;
    }

    public Long n() {
        return this.c;
    }

    public void o(String str) {
        this.b = str;
    }

    public void p(UUID uuid) {
        this.f4587d = uuid;
    }

    public void q(String str) {
        this.a = str;
    }

    public void r(Long l2) {
        this.c = l2;
    }
}
