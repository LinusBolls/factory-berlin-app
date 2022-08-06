package com.google.firebase.crashlytics.d.q.j;

import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.h.a;
import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.h.m;
import com.google.firebase.crashlytics.d.l.d;
import com.google.firebase.crashlytics.d.q.i.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall */
public class c extends a implements d {

    /* renamed from: f  reason: collision with root package name */
    private b f4148f;

    public c(String str, String str2, com.google.firebase.crashlytics.d.l.c cVar) {
        this(str, str2, cVar, com.google.firebase.crashlytics.d.l.a.GET, b.f());
    }

    private com.google.firebase.crashlytics.d.l.b g(com.google.firebase.crashlytics.d.l.b bVar, g gVar) {
        h(bVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.a);
        h(bVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        h(bVar, "X-CRASHLYTICS-API-CLIENT-VERSION", m.i());
        h(bVar, "Accept", "application/json");
        h(bVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.b);
        h(bVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.c);
        h(bVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f4141d);
        h(bVar, "X-CRASHLYTICS-INSTALLATION-ID", gVar.f4142e.a());
        return bVar;
    }

    private void h(com.google.firebase.crashlytics.d.l.b bVar, String str, String str2) {
        if (str2 != null) {
            bVar.d(str, str2);
        }
    }

    private JSONObject i(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            b bVar = this.f4148f;
            bVar.c("Failed to parse settings JSON from " + e(), e2);
            b bVar2 = this.f4148f;
            bVar2.b("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> j(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f4145h);
        hashMap.put("display_version", gVar.f4144g);
        hashMap.put("source", Integer.toString(gVar.f4146i));
        String str = gVar.f4143f;
        if (!h.C(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject a(g gVar, boolean z) {
        if (z) {
            try {
                Map<String, String> j2 = j(gVar);
                com.google.firebase.crashlytics.d.l.b d2 = d(j2);
                g(d2, gVar);
                b bVar = this.f4148f;
                bVar.b("Requesting settings from " + e());
                b bVar2 = this.f4148f;
                bVar2.b("Settings query params were: " + j2);
                d b = d2.b();
                b bVar3 = this.f4148f;
                bVar3.b("Settings request ID: " + b.d("X-REQUEST-ID"));
                return k(b);
            } catch (IOException e2) {
                this.f4148f.e("Settings request failed.", e2);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject k(d dVar) {
        int b = dVar.b();
        b bVar = this.f4148f;
        bVar.b("Settings result was: " + b);
        if (l(b)) {
            return i(dVar.a());
        }
        b bVar2 = this.f4148f;
        bVar2.d("Failed to retrieve settings from " + e());
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    c(String str, String str2, com.google.firebase.crashlytics.d.l.c cVar, com.google.firebase.crashlytics.d.l.a aVar, b bVar) {
        super(str, str2, cVar, aVar);
        this.f4148f = bVar;
    }
}
