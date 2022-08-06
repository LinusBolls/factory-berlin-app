package com.google.firebase.crashlytics.d.m;

import java.io.File;
import java.util.Comparator;

/* compiled from: CrashlyticsReportPersistence */
final /* synthetic */ class e implements Comparator {

    /* renamed from: g  reason: collision with root package name */
    private static final e f4085g = new e();

    private e() {
    }

    public static Comparator a() {
        return f4085g;
    }

    public int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
