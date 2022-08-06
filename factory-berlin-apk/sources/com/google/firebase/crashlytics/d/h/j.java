package com.google.firebase.crashlytics.d.h;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsController */
final /* synthetic */ class j implements FilenameFilter {
    private static final j a = new j();

    private j() {
    }

    public static FilenameFilter a() {
        return a;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}
