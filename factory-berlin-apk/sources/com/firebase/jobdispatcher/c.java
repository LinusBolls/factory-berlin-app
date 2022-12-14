package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.firebase.jobdispatcher.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: DefaultJobValidator */
public class c implements u {
    private final Context a;

    public c(Context context) {
        this.a = context;
    }

    private static List<String> b(List<String> list, String str) {
        if (str == null) {
            return list;
        }
        if (list == null) {
            return d(str);
        }
        Collections.addAll(list, new String[]{str});
        return list;
    }

    private static List<String> c(boolean z, List<String> list, String str) {
        return z ? b(list, str) : list;
    }

    private static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }

    private static int e(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        return dataSize;
    }

    private static List<String> f(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        list.addAll(list2);
        return list;
    }

    private static String i(Bundle bundle, String str) {
        Object obj = bundle.get(str);
        Class<?> cls = null;
        if (obj == null || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean)) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        if (obj != null) {
            cls = obj.getClass();
        }
        objArr[0] = cls;
        objArr[1] = str;
        return String.format(locale, "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean", objArr);
    }

    private static List<String> j(Bundle bundle) {
        List<String> list = null;
        if (bundle != null) {
            for (String i2 : bundle.keySet()) {
                list = b(list, i(bundle, i2));
            }
        }
        return list;
    }

    private static List<String> k(Bundle bundle) {
        int e2;
        if (bundle == null || (e2 = e(bundle)) <= 10240) {
            return null;
        }
        return d(String.format(Locale.US, "Extras too large: %d bytes is > the max (%d bytes)", new Object[]{Integer.valueOf(e2), 10240}));
    }

    private static List<String> m(String str) {
        if (str == null) {
            return d("Tag can't be null");
        }
        if (str.length() > 100) {
            return d("Tag must be shorter than 100");
        }
        return null;
    }

    public List<String> a(r rVar) {
        List<String> f2 = f(f((List<String>) null, g(rVar.d())), h(rVar.g()));
        if (rVar.h() && rVar.d() == x.a) {
            f2 = b(f2, "ImmediateTriggers can't be used with recurring jobs");
        }
        List<String> f3 = f(f2, k(rVar.b()));
        if (rVar.f() > 1) {
            f3 = f(f3, j(rVar.b()));
        }
        return f(f(f3, m(rVar.a())), l(rVar.c()));
    }

    public List<String> g(t tVar) {
        if (tVar == x.a || (tVar instanceof t.b) || (tVar instanceof t.a)) {
            return null;
        }
        return d("Unknown trigger provided");
    }

    public List<String> h(w wVar) {
        int c = wVar.c();
        int a2 = wVar.a();
        int b = wVar.b();
        boolean z = false;
        List<String> c2 = c(300 > b, c(b < a2, c((c == 1 || c == 2) ? false : true, (List<String>) null, "Unknown retry policy provided"), "Maximum backoff must be greater than or equal to initial backoff"), "Maximum backoff must be greater than 300s (5 minutes)");
        if (a2 < 30) {
            z = true;
        }
        return c(z, c2, "Initial backoff must be at least 30s");
    }

    /* access modifiers changed from: package-private */
    public List<String> l(String str) {
        if (str == null || str.isEmpty()) {
            return d("Service can't be empty");
        }
        Context context = this.a;
        if (context == null) {
            return d("Context is null, can't query PackageManager");
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return d("PackageManager is null, can't validate service");
        }
        Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
        intent.setClassName(this.a, str);
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            Log.e("FJD.GooglePlayReceiver", "Couldn't find a registered service with the name " + str + ". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.");
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && serviceInfo.enabled) {
                return null;
            }
        }
        return d(str + " is disabled.");
    }
}
