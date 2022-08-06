package com.google.firebase.crashlytics.d.i;

import android.content.Context;
import com.google.firebase.crashlytics.d.h.h;
import java.io.File;
import java.util.Set;

/* compiled from: LogFileManager */
public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final c f3989d = new c();
    private final Context a;
    private final C0091b b;
    private a c;

    /* renamed from: com.google.firebase.crashlytics.d.i.b$b  reason: collision with other inner class name */
    /* compiled from: LogFileManager */
    public interface C0091b {
        File a();
    }

    /* compiled from: LogFileManager */
    private static final class c implements a {
        private c() {
        }

        public void a() {
        }

        public String b() {
            return null;
        }

        public byte[] c() {
            return null;
        }

        public void d() {
        }

        public void e(long j2, String str) {
        }
    }

    public b(Context context, C0091b bVar) {
        this(context, bVar, (String) null);
    }

    private String e(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }

    private File f(String str) {
        return new File(this.b.a(), "crashlytics-userlog-" + str + ".temp");
    }

    public void a() {
        this.c.d();
    }

    public void b(Set<String> set) {
        File[] listFiles = this.b.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(e(file))) {
                    file.delete();
                }
            }
        }
    }

    public byte[] c() {
        return this.c.c();
    }

    public String d() {
        return this.c.b();
    }

    public final void g(String str) {
        this.c.a();
        this.c = f3989d;
        if (str != null) {
            if (!h.l(this.a, "com.crashlytics.CollectCustomLogs", true)) {
                com.google.firebase.crashlytics.d.b.f().b("Preferences requested no custom logs. Aborting log file creation.");
            } else {
                h(f(str), 65536);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(File file, int i2) {
        this.c = new d(file, i2);
    }

    public void i(long j2, String str) {
        this.c.e(j2, str);
    }

    public b(Context context, C0091b bVar, String str) {
        this.a = context;
        this.b = bVar;
        this.c = f3989d;
        g(str);
    }
}
