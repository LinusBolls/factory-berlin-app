package com.google.firebase.crashlytics.d.m;

import android.content.Context;
import com.google.firebase.crashlytics.d.b;
import java.io.File;

/* compiled from: FileStoreImpl */
public class i implements h {
    private final Context a;

    public i(Context context) {
        this.a = context;
    }

    public String a() {
        return new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    public File b() {
        return c(new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }

    /* access modifiers changed from: package-private */
    public File c(File file) {
        if (file == null) {
            b.f().b("Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            b.f().i("Couldn't create file");
            return null;
        }
    }
}
