package com.google.firebase.crashlytics.d.o.c;

import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.o.c.c;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SessionReport */
public class d implements c {
    private final File a;
    private final File[] b;
    private final Map<String, String> c;

    public d(File file) {
        this(file, Collections.emptyMap());
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.c);
    }

    public File[] b() {
        return this.b;
    }

    public String c() {
        return e().getName();
    }

    public String d() {
        String c2 = c();
        return c2.substring(0, c2.lastIndexOf(46));
    }

    public File e() {
        return this.a;
    }

    public c.a getType() {
        return c.a.JAVA;
    }

    public void remove() {
        b f2 = b.f();
        f2.b("Removing report at " + this.a.getPath());
        this.a.delete();
    }

    public d(File file, Map<String, String> map) {
        this.a = file;
        this.b = new File[]{file};
        this.c = new HashMap(map);
    }
}
