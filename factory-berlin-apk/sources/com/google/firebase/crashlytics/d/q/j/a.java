package com.google.firebase.crashlytics.d.q.j;

import com.google.firebase.crashlytics.d.h.d0;
import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.l.b;
import com.google.firebase.crashlytics.d.l.c;
import com.google.firebase.crashlytics.d.l.d;
import java.io.IOException;

/* compiled from: AbstractAppSpiCall */
abstract class a extends com.google.firebase.crashlytics.d.h.a {

    /* renamed from: f  reason: collision with root package name */
    private final String f4147f;

    public a(String str, String str2, c cVar, com.google.firebase.crashlytics.d.l.a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f4147f = str3;
    }

    private b g(b bVar, com.google.firebase.crashlytics.d.q.i.a aVar) {
        bVar.d("X-CRASHLYTICS-ORG-ID", aVar.a);
        bVar.d("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.b);
        bVar.d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f4147f);
        return bVar;
    }

    private b h(b bVar, com.google.firebase.crashlytics.d.q.i.a aVar) {
        bVar.g("org_id", aVar.a);
        bVar.g("app[identifier]", aVar.c);
        bVar.g("app[name]", aVar.f4131g);
        bVar.g("app[display_version]", aVar.f4128d);
        bVar.g("app[build_version]", aVar.f4129e);
        bVar.g("app[source]", Integer.toString(aVar.f4132h));
        bVar.g("app[minimum_sdk_version]", aVar.f4133i);
        bVar.g("app[built_sdk_version]", aVar.f4134j);
        if (!h.C(aVar.f4130f)) {
            bVar.g("app[instance_identifier]", aVar.f4130f);
        }
        return bVar;
    }

    public boolean i(com.google.firebase.crashlytics.d.q.i.a aVar, boolean z) {
        if (z) {
            b c = c();
            g(c, aVar);
            h(c, aVar);
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.b("Sending app info to " + e());
            try {
                d b = c.b();
                int b2 = b.b();
                String str = "POST".equalsIgnoreCase(c.f()) ? "Create" : "Update";
                com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
                f3.b(str + " app request ID: " + b.d("X-REQUEST-ID"));
                com.google.firebase.crashlytics.d.b f4 = com.google.firebase.crashlytics.d.b.f();
                f4.b("Result was " + b2);
                return d0.a(b2) == 0;
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e("HTTP request failed.", e2);
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
