package com.google.firebase.crashlytics.d.h;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: UserMetadata */
public class i0 {
    private String a = null;
    private final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    private static String c(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.b);
    }

    public String b() {
        return this.a;
    }

    public void d(String str) {
        this.a = c(str);
    }
}
