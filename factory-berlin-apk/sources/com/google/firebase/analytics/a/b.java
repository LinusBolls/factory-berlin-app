package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.h;
import com.google.firebase.analytics.a.a;
import com.google.firebase.c;
import com.google.firebase.e.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
public class b implements a {
    private static volatile a c;
    private final com.google.android.gms.measurement.a.a a;
    final Map<String, Object> b = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
    class a implements a.C0086a {
        a(b bVar, String str) {
        }
    }

    private b(com.google.android.gms.measurement.a.a aVar) {
        r.k(aVar);
        this.a = aVar;
    }

    public static a c(c cVar, Context context, d dVar) {
        r.k(cVar);
        r.k(context);
        r.k(dVar);
        r.k(context.getApplicationContext());
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.q()) {
                        dVar.a(com.google.firebase.a.class, d.f3861g, c.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.p());
                    }
                    c = new b(h.b(context, (String) null, (String) null, (String) null, bundle).e());
                }
            }
        }
        return c;
    }

    static final /* synthetic */ void d(com.google.firebase.e.a aVar) {
        boolean z = ((com.google.firebase.a) aVar.a()).a;
        synchronized (b.class) {
            ((b) c).a.c(z);
        }
    }

    private final boolean e(String str) {
        return !str.isEmpty() && this.b.containsKey(str) && this.b.get(str) != null;
    }

    public a.C0086a a(String str, a.b bVar) {
        Object obj;
        r.k(bVar);
        if (!com.google.firebase.analytics.connector.internal.c.a(str) || e(str)) {
            return null;
        }
        com.google.android.gms.measurement.a.a aVar = this.a;
        if ("fiam".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.b(aVar, bVar);
        } else if ("crash".equals(str) || "clx".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.d(aVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.b.put(str, obj);
        return new a(this, str);
    }

    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.c.a(str) && com.google.firebase.analytics.connector.internal.c.b(str2, bundle) && com.google.firebase.analytics.connector.internal.c.c(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.c.d(str, str2, bundle);
            this.a.a(str, str2, bundle);
        }
    }
}
