package com.sensorberg.aliolihttp.storage;

import android.content.Context;
import kotlin.jvm.internal.k;

/* compiled from: AlioliHttpDatabaseProvider.kt */
public final class c {
    private static AlioliHttpDatabase a;
    public static final c b = new c();

    private c() {
    }

    public final synchronized AlioliHttpDatabase a(Context context) {
        AlioliHttpDatabase alioliHttpDatabase;
        k.f(context, "context");
        if (a == null) {
            a = androidx.room.k.a(context, AlioliHttpDatabase.class, "alioli_http_database").d();
        }
        alioliHttpDatabase = a;
        if (alioliHttpDatabase == null) {
            k.m();
            throw null;
        }
        return alioliHttpDatabase;
    }
}
