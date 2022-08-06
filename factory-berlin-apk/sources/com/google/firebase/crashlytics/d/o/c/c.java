package com.google.firebase.crashlytics.d.o.c;

import java.io.File;
import java.util.Map;

/* compiled from: Report */
public interface c {

    /* compiled from: Report */
    public enum a {
        JAVA,
        NATIVE
    }

    Map<String, String> a();

    File[] b();

    String c();

    String d();

    File e();

    a getType();

    void remove();
}
