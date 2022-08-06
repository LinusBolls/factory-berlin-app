package com.sensorberg.smartworkspace.app.utils;

import android.content.Context;
import com.microsoft.appcenter.b;
import java.io.File;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: Log.kt */
public final class h {
    private static final c a = new c();
    public static final h b = new h();

    private h() {
    }

    public final void a(Context context) {
        k.e(context, "context");
        if (a.G()) {
            a.h(new g.e.o.b.a(a.m()));
            b.u(3);
        }
        StringBuilder sb = new StringBuilder();
        File filesDir = context.getFilesDir();
        k.d(filesDir, "context.filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append("/logs");
        a.h(new g.e.o.b.b(sb.toString(), 1, 3));
        if (a.D() && a.a()) {
            a.h(new q());
        }
    }
}
