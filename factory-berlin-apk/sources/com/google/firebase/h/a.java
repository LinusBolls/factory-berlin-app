package com.google.firebase.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.e.c;

/* compiled from: DataCollectionConfigStorage */
public class a {
    private final Context a;
    private final SharedPreferences b;
    private boolean c = c();

    public a(Context context, String str, c cVar) {
        Context a2 = a(context);
        this.a = a2;
        this.b = a2.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return androidx.core.content.a.b(context);
    }

    private boolean c() {
        if (this.b.contains("firebase_data_collection_default_enabled")) {
            return this.b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.c;
    }
}
