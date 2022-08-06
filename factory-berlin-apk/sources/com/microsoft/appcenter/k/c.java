package com.microsoft.appcenter.k;

import com.microsoft.appcenter.http.d;
import com.microsoft.appcenter.http.j;
import com.microsoft.appcenter.http.k;
import com.microsoft.appcenter.http.l;
import com.microsoft.appcenter.k.d.e;
import com.microsoft.appcenter.k.d.i.g;
import com.microsoft.appcenter.k.d.j.b;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneCollectorIngestion */
public class c implements b {

    /* renamed from: g  reason: collision with root package name */
    private final g f4552g;

    /* renamed from: h  reason: collision with root package name */
    private final d f4553h;

    /* renamed from: i  reason: collision with root package name */
    private String f4554i = "https://mobile.events.data.microsoft.com/OneCollector/1.0";

    /* compiled from: OneCollectorIngestion */
    private static class a implements d.a {
        private final g a;
        private final e b;

        a(g gVar, e eVar) {
            this.a = gVar;
            this.b = eVar;
        }

        public void a(URL url, Map<String, String> map) {
            if (com.microsoft.appcenter.utils.a.d() <= 2) {
                com.microsoft.appcenter.utils.a.g("AppCenter", "Calling " + url + "...");
                HashMap hashMap = new HashMap(map);
                String str = (String) hashMap.get("apikey");
                if (str != null) {
                    hashMap.put("apikey", j.e(str));
                }
                String str2 = (String) hashMap.get("Tickets");
                if (str2 != null) {
                    hashMap.put("Tickets", j.g(str2));
                }
                com.microsoft.appcenter.utils.a.g("AppCenter", "Headers: " + hashMap);
            }
        }

        public String b() {
            StringBuilder sb = new StringBuilder();
            for (com.microsoft.appcenter.k.d.d d2 : this.b.a()) {
                sb.append(this.a.d(d2));
                sb.append(10);
            }
            return sb.toString();
        }
    }

    public c(d dVar, g gVar) {
        this.f4552g = gVar;
        this.f4553h = dVar;
    }

    public k E(String str, UUID uuid, e eVar, l lVar) {
        HashMap hashMap = new HashMap();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (com.microsoft.appcenter.k.d.d f2 : eVar.a()) {
            linkedHashSet.addAll(f2.f());
        }
        StringBuilder sb = new StringBuilder();
        for (String append : linkedHashSet) {
            sb.append(append);
            sb.append(AndroidSdkMetrics.SEPARATOR);
        }
        if (!linkedHashSet.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        hashMap.put("apikey", sb.toString());
        JSONObject jSONObject = new JSONObject();
        Iterator<com.microsoft.appcenter.k.d.d> it = eVar.a().iterator();
        while (it.hasNext()) {
            List<String> m2 = ((b) it.next()).q().q().m();
            if (m2 != null) {
                for (String next : m2) {
                    String a2 = com.microsoft.appcenter.utils.k.a(next);
                    if (a2 != null) {
                        try {
                            jSONObject.put(next, a2);
                        } catch (JSONException e2) {
                            com.microsoft.appcenter.utils.a.c("AppCenter", "Cannot serialize tickets, sending log anonymously", e2);
                        }
                    }
                }
            }
        }
        if (jSONObject.length() > 0) {
            hashMap.put("Tickets", jSONObject.toString());
            if (com.microsoft.appcenter.e.b) {
                hashMap.put("Strict", Boolean.TRUE.toString());
            }
        }
        hashMap.put("Content-Type", "application/x-json-stream; charset=utf-8");
        hashMap.put("Client-Version", String.format("ACS-Android-Java-no-%s-no", new Object[]{"3.3.0"}));
        hashMap.put("Upload-Time", String.valueOf(System.currentTimeMillis()));
        return this.f4553h.p0(this.f4554i, "POST", hashMap, new a(this.f4552g, eVar), lVar);
    }

    public void c() {
        this.f4553h.c();
    }

    public void close() {
        this.f4553h.close();
    }

    public void f(String str) {
        this.f4554i = str;
    }
}
