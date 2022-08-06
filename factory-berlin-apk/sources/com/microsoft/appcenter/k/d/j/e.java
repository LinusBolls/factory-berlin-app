package com.microsoft.appcenter.k.d.j;

import com.microsoft.appcenter.k.d.f;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: Extensions */
public class e implements f {
    private g a;
    private k b;
    private m c;

    /* renamed from: d  reason: collision with root package name */
    private d f4581d;

    /* renamed from: e  reason: collision with root package name */
    private i f4582e;

    /* renamed from: f  reason: collision with root package name */
    private a f4583f;

    /* renamed from: g  reason: collision with root package name */
    private h f4584g;

    /* renamed from: h  reason: collision with root package name */
    private l f4585h;

    /* renamed from: i  reason: collision with root package name */
    private f f4586i;

    public void A(l lVar) {
        this.f4585h = lVar;
    }

    public void B(m mVar) {
        this.c = mVar;
    }

    public void a(JSONStringer jSONStringer) {
        if (n() != null) {
            jSONStringer.key("metadata").object();
            n().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (q() != null) {
            jSONStringer.key("protocol").object();
            q().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (s() != null) {
            jSONStringer.key("user").object();
            s().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (l() != null) {
            jSONStringer.key("device").object();
            l().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (p() != null) {
            jSONStringer.key("os").object();
            p().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (k() != null) {
            jSONStringer.key("app").object();
            k().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (o() != null) {
            jSONStringer.key("net").object();
            o().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (r() != null) {
            jSONStringer.key("sdk").object();
            r().a(jSONStringer);
            jSONStringer.endObject();
        }
        if (m() != null) {
            jSONStringer.key("loc").object();
            m().a(jSONStringer);
            jSONStringer.endObject();
        }
    }

    public void d(JSONObject jSONObject) {
        if (jSONObject.has("metadata")) {
            g gVar = new g();
            gVar.d(jSONObject.getJSONObject("metadata"));
            w(gVar);
        }
        if (jSONObject.has("protocol")) {
            k kVar = new k();
            kVar.d(jSONObject.getJSONObject("protocol"));
            z(kVar);
        }
        if (jSONObject.has("user")) {
            m mVar = new m();
            mVar.d(jSONObject.getJSONObject("user"));
            B(mVar);
        }
        if (jSONObject.has("device")) {
            d dVar = new d();
            dVar.d(jSONObject.getJSONObject("device"));
            u(dVar);
        }
        if (jSONObject.has("os")) {
            i iVar = new i();
            iVar.d(jSONObject.getJSONObject("os"));
            y(iVar);
        }
        if (jSONObject.has("app")) {
            a aVar = new a();
            aVar.d(jSONObject.getJSONObject("app"));
            t(aVar);
        }
        if (jSONObject.has("net")) {
            h hVar = new h();
            hVar.d(jSONObject.getJSONObject("net"));
            x(hVar);
        }
        if (jSONObject.has("sdk")) {
            l lVar = new l();
            lVar.d(jSONObject.getJSONObject("sdk"));
            A(lVar);
        }
        if (jSONObject.has("loc")) {
            f fVar = new f();
            fVar.d(jSONObject.getJSONObject("loc"));
            v(fVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        g gVar = this.a;
        if (gVar == null ? eVar.a != null : !gVar.equals(eVar.a)) {
            return false;
        }
        k kVar = this.b;
        if (kVar == null ? eVar.b != null : !kVar.equals(eVar.b)) {
            return false;
        }
        m mVar = this.c;
        if (mVar == null ? eVar.c != null : !mVar.equals(eVar.c)) {
            return false;
        }
        d dVar = this.f4581d;
        if (dVar == null ? eVar.f4581d != null : !dVar.equals(eVar.f4581d)) {
            return false;
        }
        i iVar = this.f4582e;
        if (iVar == null ? eVar.f4582e != null : !iVar.equals(eVar.f4582e)) {
            return false;
        }
        a aVar = this.f4583f;
        if (aVar == null ? eVar.f4583f != null : !aVar.equals(eVar.f4583f)) {
            return false;
        }
        h hVar = this.f4584g;
        if (hVar == null ? eVar.f4584g != null : !hVar.equals(eVar.f4584g)) {
            return false;
        }
        l lVar = this.f4585h;
        if (lVar == null ? eVar.f4585h != null : !lVar.equals(eVar.f4585h)) {
            return false;
        }
        f fVar = this.f4586i;
        f fVar2 = eVar.f4586i;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        g gVar = this.a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        k kVar = this.b;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        m mVar = this.c;
        int hashCode3 = (hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        d dVar = this.f4581d;
        int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        i iVar = this.f4582e;
        int hashCode5 = (hashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        a aVar = this.f4583f;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        h hVar = this.f4584g;
        int hashCode7 = (hashCode6 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        l lVar = this.f4585h;
        int hashCode8 = (hashCode7 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        f fVar = this.f4586i;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode8 + i2;
    }

    public a k() {
        return this.f4583f;
    }

    public d l() {
        return this.f4581d;
    }

    public f m() {
        return this.f4586i;
    }

    public g n() {
        return this.a;
    }

    public h o() {
        return this.f4584g;
    }

    public i p() {
        return this.f4582e;
    }

    public k q() {
        return this.b;
    }

    public l r() {
        return this.f4585h;
    }

    public m s() {
        return this.c;
    }

    public void t(a aVar) {
        this.f4583f = aVar;
    }

    public void u(d dVar) {
        this.f4581d = dVar;
    }

    public void v(f fVar) {
        this.f4586i = fVar;
    }

    public void w(g gVar) {
        this.a = gVar;
    }

    public void x(h hVar) {
        this.f4584g = hVar;
    }

    public void y(i iVar) {
        this.f4582e = iVar;
    }

    public void z(k kVar) {
        this.b = kVar;
    }
}
