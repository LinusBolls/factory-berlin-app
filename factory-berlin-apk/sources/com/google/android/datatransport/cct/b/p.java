package com.google.android.datatransport.cct.b;

import android.util.SparseArray;

public enum p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: m  reason: collision with root package name */
    private static final SparseArray<p> f1976m = null;

    static {
        DEFAULT = new p("DEFAULT", 0, 0);
        UNMETERED_ONLY = new p("UNMETERED_ONLY", 1, 1);
        UNMETERED_OR_DAILY = new p("UNMETERED_OR_DAILY", 2, 2);
        FAST_IF_RADIO_AWAKE = new p("FAST_IF_RADIO_AWAKE", 3, 3);
        NEVER = new p("NEVER", 4, 4);
        UNRECOGNIZED = new p("UNRECOGNIZED", 5, -1);
        SparseArray<p> sparseArray = new SparseArray<>();
        f1976m = sparseArray;
        sparseArray.put(0, DEFAULT);
        f1976m.put(1, UNMETERED_ONLY);
        f1976m.put(2, UNMETERED_OR_DAILY);
        f1976m.put(3, FAST_IF_RADIO_AWAKE);
        f1976m.put(4, NEVER);
        f1976m.put(-1, UNRECOGNIZED);
    }

    private p(int i2) {
    }
}
