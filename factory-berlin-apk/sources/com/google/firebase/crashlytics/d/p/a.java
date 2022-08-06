package com.google.firebase.crashlytics.d.p;

import com.google.firebase.crashlytics.d.h.p;
import g.b.a.a.h;

/* compiled from: DataTransportCrashlyticsReportSender */
final /* synthetic */ class a implements h {
    private final com.google.android.gms.tasks.h a;
    private final p b;

    private a(com.google.android.gms.tasks.h hVar, p pVar) {
        this.a = hVar;
        this.b = pVar;
    }

    public static h b(com.google.android.gms.tasks.h hVar, p pVar) {
        return new a(hVar, pVar);
    }

    public void a(Exception exc) {
        c.b(this.a, this.b, exc);
    }
}
