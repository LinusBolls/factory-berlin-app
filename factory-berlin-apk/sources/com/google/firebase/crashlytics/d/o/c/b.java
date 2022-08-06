package com.google.firebase.crashlytics.d.o.c;

import com.google.firebase.crashlytics.d.o.c.c;
import java.io.File;
import java.util.Map;

/* compiled from: NativeSessionReport */
public class b implements c {
    private final File a;

    public b(File file) {
        this.a = file;
    }

    public Map<String, String> a() {
        return null;
    }

    public File[] b() {
        return this.a.listFiles();
    }

    public String c() {
        return null;
    }

    public String d() {
        return this.a.getName();
    }

    public File e() {
        return null;
    }

    public c.a getType() {
        return c.a.NATIVE;
    }

    public void remove() {
        for (File file : b()) {
            com.google.firebase.crashlytics.d.b.f().b("Removing native report file at " + file.getPath());
            file.delete();
        }
        com.google.firebase.crashlytics.d.b.f().b("Removing native report directory at " + this.a);
        this.a.delete();
    }
}
