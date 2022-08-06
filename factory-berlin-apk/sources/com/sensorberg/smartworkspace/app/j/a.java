package com.sensorberg.smartworkspace.app.j;

import android.app.Application;
import com.microsoft.appcenter.b;
import com.microsoft.appcenter.distribute.Distribute;
import com.sensorberg.smartworkspace.app.utils.c;
import kotlin.jvm.internal.k;

/* compiled from: AppAutoUpdate.kt */
public final class a {
    public static final a a = new a();

    private a() {
    }

    public final void a(Application application, c cVar) {
        k.e(application, "app");
        k.e(cVar, "buildConfig");
        n.a.a.f("isAppCenterUpdate(" + cVar.C() + " - AppId(" + cVar.c() + "))", new Object[0]);
        if (cVar.C()) {
            Distribute.j0(true);
            b.v(application, cVar.c(), Distribute.class);
        }
    }
}
