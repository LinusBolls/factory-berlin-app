package com.google.firebase.crashlytics.d.p;

import com.google.firebase.crashlytics.d.j.v;
import g.b.a.a.e;
import java.nio.charset.Charset;

/* compiled from: DataTransportCrashlyticsReportSender */
final /* synthetic */ class b implements e {
    private static final b a = new b();

    private b() {
    }

    public static e b() {
        return a;
    }

    public Object a(Object obj) {
        return c.b.E((v) obj).getBytes(Charset.forName("UTF-8"));
    }
}
