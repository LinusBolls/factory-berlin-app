package g.e.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.Field;
import kotlin.jvm.internal.k;

/* compiled from: Device.kt */
public final class d {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: Device.kt */
    public static final class a {
        private a() {
        }

        public final String a(Context context) {
            k.f(context, "context");
            Field field = Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT];
            k.b(field, "Build.VERSION_CODES::cla…ds[Build.VERSION.SDK_INT]");
            String name = field.getName();
            CharSequence applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return "Android " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + " - " + name + ")\n" + "Device " + Build.MANUFACTURER + " - " + Build.BRAND + " - " + Build.MODEL + 10 + "App '" + applicationLabel + "' " + packageInfo.versionName + " (" + packageInfo.versionCode + ')';
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
