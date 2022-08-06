package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ActivityCompat */
public class a extends androidx.core.content.a {
    private static c c;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    class C0011a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String[] f649g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Activity f650h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f651i;

        C0011a(String[] strArr, Activity activity, int i2) {
            this.f649g = strArr;
            this.f650h = activity;
            this.f651i = i2;
        }

        public void run() {
            int[] iArr = new int[this.f649g.length];
            PackageManager packageManager = this.f650h.getPackageManager();
            String packageName = this.f650h.getPackageName();
            int length = this.f649g.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f649g[i2], packageName);
            }
            ((b) this.f650h).onRequestPermissionsResult(this.f651i, this.f649g, iArr);
        }
    }

    /* compiled from: ActivityCompat */
    public interface b {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    public interface c {
        boolean a(Activity activity, int i2, int i3, Intent intent);

        boolean b(Activity activity, String[] strArr, int i2);
    }

    /* compiled from: ActivityCompat */
    public interface d {
        void b(int i2);
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c n() {
        return c;
    }

    public static void o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!c.i(activity)) {
            activity.recreate();
        }
    }

    public static void p(Activity activity, String[] strArr, int i2) {
        c cVar = c;
        if (cVar != null && cVar.b(activity, strArr, i2)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).b(i2);
            }
            activity.requestPermissions(strArr, i2);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new C0011a(strArr, activity, i2));
        }
    }

    public static boolean q(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void r(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }
}
