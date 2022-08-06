package g.e.c;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: LocationUtils.kt */
public final class g {
    public static final boolean a(Context context) {
        k.f(context, "context");
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            return Build.VERSION.SDK_INT < 23 || locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
    }
}
