package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry */
class k implements e {
    private final a a;
    private final i b;
    private final Map<String, m> c;

    /* compiled from: MetadataBackendRegistry */
    static class a {
        private final Context a;
        private Map<String, String> b = null;

        a(Context context) {
            this.a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d2 = d(context);
            if (d2 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d2.keySet()) {
                Object obj = d2.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(AndroidSdkMetrics.SEPARATOR, -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (InstantiationException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e6);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    public synchronized m a(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        d b2 = this.a.b(str);
        if (b2 == null) {
            return null;
        }
        m create = b2.create(this.b.a(str));
        this.c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = iVar;
    }
}
