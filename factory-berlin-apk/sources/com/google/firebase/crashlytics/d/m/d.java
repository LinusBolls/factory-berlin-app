package com.google.firebase.crashlytics.d.m;

import java.io.File;
import java.util.Comparator;

/* compiled from: CrashlyticsReportPersistence */
final /* synthetic */ class d implements Comparator {

    /* renamed from: g  reason: collision with root package name */
    private static final d f4084g = new d();

    private d() {
    }

    public static Comparator a() {
        return f4084g;
    }

    public int compare(Object obj, Object obj2) {
        return g.z((File) obj, (File) obj2);
    }
}
