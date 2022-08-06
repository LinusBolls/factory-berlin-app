package com.google.firebase.crashlytics.d.m;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsReportPersistence */
final /* synthetic */ class a implements FilenameFilter {
    private final String a;

    private a(String str) {
        this.a = str;
    }

    public static FilenameFilter a(String str) {
        return new a(str);
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
