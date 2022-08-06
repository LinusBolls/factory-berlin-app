package com.microsoft.appcenter.k;

import com.microsoft.appcenter.http.d;
import com.microsoft.appcenter.http.k;
import com.microsoft.appcenter.http.l;
import com.microsoft.appcenter.k.d.e;
import com.microsoft.appcenter.k.d.i.g;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: AppCenterIngestion */
public class a implements b {

    /* renamed from: g  reason: collision with root package name */
    private final g f4549g;

    /* renamed from: h  reason: collision with root package name */
    private final d f4550h;

    /* renamed from: i  reason: collision with root package name */
    private String f4551i = "https://in.appcenter.ms";

    /* renamed from: com.microsoft.appcenter.k.a$a  reason: collision with other inner class name */
    /* compiled from: AppCenterIngestion */
    private static class C0128a extends com.microsoft.appcenter.http.a {
        private final g a;
        private final e b;

        C0128a(g gVar, e eVar) {
            this.a = gVar;
            this.b = eVar;
        }

        public String b() {
            return this.a.e(this.b);
        }
    }

    public a(d dVar, g gVar) {
        this.f4549g = gVar;
        this.f4550h = dVar;
    }

    public k E(String str, UUID uuid, e eVar, l lVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("Install-ID", uuid.toString());
        hashMap.put("App-Secret", str);
        C0128a aVar = new C0128a(this.f4549g, eVar);
        d dVar = this.f4550h;
        return dVar.p0(this.f4551i + "/logs?api-version=1.0.0", "POST", hashMap, aVar, lVar);
    }

    public void c() {
        this.f4550h.c();
    }

    public void close() {
        this.f4550h.close();
    }

    public void f(String str) {
        this.f4551i = str;
    }
}
