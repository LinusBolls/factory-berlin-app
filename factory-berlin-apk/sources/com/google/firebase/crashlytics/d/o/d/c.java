package com.google.firebase.crashlytics.d.o.d;

import com.google.firebase.crashlytics.d.h.a;
import com.google.firebase.crashlytics.d.h.d0;
import com.google.firebase.crashlytics.d.l.b;
import com.google.firebase.crashlytics.d.l.d;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: DefaultCreateReportSpiCall */
public class c extends a implements b {

    /* renamed from: f  reason: collision with root package name */
    private final String f4114f;

    public c(String str, String str2, com.google.firebase.crashlytics.d.l.c cVar, String str3) {
        this(str, str2, cVar, com.google.firebase.crashlytics.d.l.a.POST, str3);
    }

    private b g(b bVar, com.google.firebase.crashlytics.d.o.c.a aVar) {
        bVar.d("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.b);
        bVar.d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f4114f);
        for (Map.Entry<String, String> e2 : aVar.c.a().entrySet()) {
            bVar.e(e2);
        }
        return bVar;
    }

    private b h(b bVar, com.google.firebase.crashlytics.d.o.c.c cVar) {
        bVar.g("report[identifier]", cVar.d());
        if (cVar.b().length == 1) {
            com.google.firebase.crashlytics.d.b.f().b("Adding single file " + cVar.c() + " to report " + cVar.d());
            bVar.h("report[file]", cVar.c(), "application/octet-stream", cVar.e());
            return bVar;
        }
        int i2 = 0;
        for (File file : cVar.b()) {
            com.google.firebase.crashlytics.d.b.f().b("Adding file " + file.getName() + " to report " + cVar.d());
            StringBuilder sb = new StringBuilder();
            sb.append("report[file");
            sb.append(i2);
            sb.append("]");
            bVar.h(sb.toString(), file.getName(), "application/octet-stream", file);
            i2++;
        }
        return bVar;
    }

    public boolean b(com.google.firebase.crashlytics.d.o.c.a aVar, boolean z) {
        if (z) {
            b c = c();
            g(c, aVar);
            h(c, aVar.c);
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.b("Sending report to: " + e());
            try {
                d b = c.b();
                int b2 = b.b();
                com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
                f3.b("Create report request ID: " + b.d("X-REQUEST-ID"));
                com.google.firebase.crashlytics.d.b f4 = com.google.firebase.crashlytics.d.b.f();
                f4.b("Result was: " + b2);
                return d0.a(b2) == 0;
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e("Create report HTTP request failed.", e2);
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    c(String str, String str2, com.google.firebase.crashlytics.d.l.c cVar, com.google.firebase.crashlytics.d.l.a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f4114f = str3;
    }
}
