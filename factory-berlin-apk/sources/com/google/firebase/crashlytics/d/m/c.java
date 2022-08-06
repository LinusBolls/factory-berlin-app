package com.google.firebase.crashlytics.d.m;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsReportPersistence */
final /* synthetic */ class c implements FilenameFilter {
    private static final c a = new c();

    private c() {
    }

    public static FilenameFilter a() {
        return a;
    }

    public boolean accept(File file, String str) {
        return g.s(file, str);
    }
}
