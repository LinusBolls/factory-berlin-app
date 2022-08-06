package com.sensorberg.smartworkspace.app.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.k;

/* compiled from: UniqueIdMap.kt */
public final class r {
    private final Map<String, Long> a = new LinkedHashMap();
    private final AtomicLong b = new AtomicLong();

    public final long a(String str) {
        k.e(str, "key");
        Long l2 = this.a.get(str);
        if (l2 != null) {
            return l2.longValue();
        }
        long addAndGet = this.b.addAndGet(1);
        this.a.put(str, Long.valueOf(addAndGet));
        return addAndGet;
    }
}
