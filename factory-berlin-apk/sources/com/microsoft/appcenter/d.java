package com.microsoft.appcenter;

import android.app.Application;
import android.content.Context;
import com.microsoft.appcenter.j.b;
import com.microsoft.appcenter.k.d.i.f;
import com.microsoft.appcenter.utils.c;
import java.util.Map;

/* compiled from: AppCenterService */
public interface d extends Application.ActivityLifecycleCallbacks, c.b {
    void a(boolean z);

    String b();

    void c(String str, String str2);

    boolean d();

    boolean e();

    Map<String, f> f();

    void h(c cVar);

    void j(Context context, b bVar, String str, String str2, boolean z);
}
