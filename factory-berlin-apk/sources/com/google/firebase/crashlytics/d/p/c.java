package com.google.firebase.crashlytics.d.p;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.android.gms.tasks.g;
import com.google.firebase.crashlytics.d.h.p;
import com.google.firebase.crashlytics.d.j.v;
import com.google.firebase.crashlytics.d.j.x.h;
import g.b.a.a.b;
import g.b.a.a.e;
import g.b.a.a.f;
import g.b.a.a.i.q;

/* compiled from: DataTransportCrashlyticsReportSender */
public class c {
    private static final h b = new h();
    private static final String c = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    private static final String f4116d = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    private static final e<v, byte[]> f4117e = b.b();
    private final f<v> a;

    c(f<v> fVar, e<v, byte[]> eVar) {
        this.a = fVar;
    }

    public static c a(Context context) {
        q.f(context);
        return new c(q.c().g(new a(c, f4116d)).a("FIREBASE_CRASHLYTICS_REPORT", v.class, b.b("json"), f4117e), f4117e);
    }

    static /* synthetic */ void b(com.google.android.gms.tasks.h hVar, p pVar, Exception exc) {
        if (exc != null) {
            hVar.d(exc);
        } else {
            hVar.e(pVar);
        }
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public g<p> e(p pVar) {
        v b2 = pVar.b();
        com.google.android.gms.tasks.h hVar = new com.google.android.gms.tasks.h();
        this.a.a(g.b.a.a.c.d(b2), a.b(hVar, pVar));
        return hVar.a();
    }
}
