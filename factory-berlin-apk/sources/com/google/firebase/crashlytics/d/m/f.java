package com.google.firebase.crashlytics.d.m;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsReportPersistence */
final /* synthetic */ class f implements FilenameFilter {
    private static final f a = new f();

    private f() {
    }

    public static FilenameFilter a() {
        return a;
    }

    public boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
