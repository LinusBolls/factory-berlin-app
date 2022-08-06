package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class f<T> {
    private final T a;
    private final c<T> b;

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    private static class b implements c<Context> {
        private final Class<? extends Service> a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.a = cls;
        }
    }

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    interface c<T> {
        List<String> a(T t);
    }

    f(T t, c<T> cVar) {
        this.a = t;
        this.b = cVar;
    }

    public static f<Context> b(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls));
    }

    private static List<h> c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            try {
                Class<?> cls = Class.forName(next);
                if (!h.class.isAssignableFrom(cls)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", new Object[]{next, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add((h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e2) {
                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{next}), e2);
            } catch (IllegalAccessException e3) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", new Object[]{next}), e3);
            } catch (InstantiationException e4) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", new Object[]{next}), e4);
            } catch (NoSuchMethodException e5) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", new Object[]{next}), e5);
            } catch (InvocationTargetException e6) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", new Object[]{next}), e6);
            }
        }
        return arrayList;
    }

    public List<h> a() {
        return c(this.b.a(this.a));
    }
}
