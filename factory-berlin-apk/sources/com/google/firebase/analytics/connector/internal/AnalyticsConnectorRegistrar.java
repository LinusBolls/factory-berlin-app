package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.analytics.a.a;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.i.g;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
public class AnalyticsConnectorRegistrar implements h {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<d<?>> getComponents() {
        d.b<a> a = d.a(a.class);
        a.b(n.f(c.class));
        a.b(n.f(Context.class));
        a.b(n.f(com.google.firebase.e.d.class));
        a.e(a.a);
        a.d();
        return Arrays.asList(new d[]{a.c(), g.a("fire-analytics", "17.5.0")});
    }
}
