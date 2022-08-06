package com.google.firebase.crashlytics.d.m;

import java.io.File;
import java.io.FileFilter;

/* compiled from: CrashlyticsReportPersistence */
final /* synthetic */ class b implements FileFilter {
    private final String a;

    private b(String str) {
        this.a = str;
    }

    public static FileFilter a(String str) {
        return new b(str);
    }

    public boolean accept(File file) {
        return g.t(this.a, file);
    }
}
