package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.m.h;
import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker */
class n {
    private final String a;
    private final h b;

    public n(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }

    private File b() {
        return new File(this.b.b(), this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e2) {
            b f2 = b.f();
            f2.e("Error creating marker: " + this.a, e2);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
