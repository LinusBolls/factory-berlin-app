package com.google.firebase.crashlytics.d.o.d;

import com.google.firebase.crashlytics.d.h.a;
import com.google.firebase.crashlytics.d.h.d0;
import com.google.firebase.crashlytics.d.h.m;
import com.google.firebase.crashlytics.d.l.b;
import com.google.firebase.crashlytics.d.l.c;
import java.io.File;
import java.io.IOException;

/* compiled from: NativeCreateReportSpiCall */
public class d extends a implements b {

    /* renamed from: f  reason: collision with root package name */
    private final String f4115f;

    public d(String str, String str2, c cVar, String str3) {
        super(str, str2, cVar, com.google.firebase.crashlytics.d.l.a.POST);
        this.f4115f = str3;
    }

    private b g(b bVar, String str) {
        bVar.d("User-Agent", "Crashlytics Android SDK/" + m.i());
        bVar.d("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f4115f);
        bVar.d("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        return bVar;
    }

    private b h(b bVar, String str, com.google.firebase.crashlytics.d.o.c.c cVar) {
        if (str != null) {
            bVar.g("org_id", str);
        }
        bVar.g("report_id", cVar.d());
        for (File file : cVar.b()) {
            if (file.getName().equals("minidump")) {
                bVar.h("minidump_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("metadata")) {
                bVar.h("crash_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("binaryImages")) {
                bVar.h("binary_images_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("session")) {
                bVar.h("session_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("app")) {
                bVar.h("app_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("device")) {
                bVar.h("device_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("os")) {
                bVar.h("os_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("user")) {
                bVar.h("user_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("logs")) {
                bVar.h("logs_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("keys")) {
                bVar.h("keys_file", file.getName(), "application/octet-stream", file);
            }
        }
        return bVar;
    }

    public boolean b(com.google.firebase.crashlytics.d.o.c.a aVar, boolean z) {
        if (z) {
            b c = c();
            g(c, aVar.b);
            h(c, aVar.a, aVar.c);
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.b("Sending report to: " + e());
            try {
                int b = c.b().b();
                com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
                f3.b("Result was: " + b);
                return d0.a(b) == 0;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
