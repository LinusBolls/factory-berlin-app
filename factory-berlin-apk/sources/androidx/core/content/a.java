package androidx.core.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import com.sensorberg.smartspaces.backend.model.Statistics;
import java.io.File;
import java.util.HashMap;

/* compiled from: ContextCompat */
public class a {
    private static final Object a = new Object();
    private static TypedValue b;

    /* renamed from: androidx.core.content.a$a  reason: collision with other inner class name */
    /* compiled from: ContextCompat */
    private static final class C0013a {
        static final HashMap<Class<?>, String> a = new HashMap<>();

        static {
            if (Build.VERSION.SDK_INT >= 22) {
                a.put(SubscriptionManager.class, "telephony_subscription_service");
                a.put(UsageStatsManager.class, "usagestats");
            }
            if (Build.VERSION.SDK_INT >= 21) {
                a.put(AppWidgetManager.class, "appwidget");
                a.put(BatteryManager.class, "batterymanager");
                a.put(CameraManager.class, "camera");
                a.put(JobScheduler.class, "jobscheduler");
                a.put(LauncherApps.class, "launcherapps");
                a.put(MediaProjectionManager.class, "media_projection");
                a.put(MediaSessionManager.class, "media_session");
                a.put(RestrictionsManager.class, "restrictions");
                a.put(TelecomManager.class, "telecom");
                a.put(TvInputManager.class, "tv_input");
            }
            if (Build.VERSION.SDK_INT >= 19) {
                a.put(AppOpsManager.class, "appops");
                a.put(CaptioningManager.class, "captioning");
                a.put(ConsumerIrManager.class, "consumer_ir");
                a.put(PrintManager.class, "print");
            }
            if (Build.VERSION.SDK_INT >= 18) {
                a.put(BluetoothManager.class, "bluetooth");
            }
            if (Build.VERSION.SDK_INT >= 17) {
                a.put(DisplayManager.class, "display");
                a.put(UserManager.class, "user");
            }
            if (Build.VERSION.SDK_INT >= 16) {
                a.put(InputManager.class, "input");
                a.put(MediaRouter.class, "media_router");
                a.put(NsdManager.class, "servicediscovery");
            }
            a.put(AccessibilityManager.class, "accessibility");
            a.put(AccountManager.class, "account");
            a.put(ActivityManager.class, "activity");
            a.put(AlarmManager.class, "alarm");
            a.put(AudioManager.class, "audio");
            a.put(ClipboardManager.class, "clipboard");
            a.put(ConnectivityManager.class, "connectivity");
            a.put(DevicePolicyManager.class, "device_policy");
            a.put(DownloadManager.class, "download");
            a.put(DropBoxManager.class, "dropbox");
            a.put(InputMethodManager.class, "input_method");
            a.put(KeyguardManager.class, "keyguard");
            a.put(LayoutInflater.class, "layout_inflater");
            a.put(LocationManager.class, "location");
            a.put(NfcManager.class, Statistics.TRIGGER_NFC);
            a.put(NotificationManager.class, "notification");
            a.put(PowerManager.class, "power");
            a.put(SearchManager.class, "search");
            a.put(SensorManager.class, "sensor");
            a.put(StorageManager.class, "storage");
            a.put(TelephonyManager.class, "phone");
            a.put(TextServicesManager.class, "textservices");
            a.put(UiModeManager.class, "uimode");
            a.put(UsbManager.class, "usb");
            a.put(Vibrator.class, "vibrator");
            a.put(WallpaperManager.class, "wallpaper");
            a.put(WifiP2pManager.class, "wifip2p");
            a.put(WifiManager.class, "wifi");
            a.put(WindowManager.class, "window");
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    public static int c(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i2);
        }
        return context.getResources().getColor(i2);
    }

    public static ColorStateList d(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        return context.getResources().getColorStateList(i2);
    }

    public static File e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Drawable f(Context context, int i2) {
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            return context.getDrawable(i2);
        }
        if (i4 >= 16) {
            return context.getResources().getDrawable(i2);
        }
        synchronized (a) {
            if (b == null) {
                b = new TypedValue();
            }
            context.getResources().getValue(i2, b, true);
            i3 = b.resourceId;
        }
        return context.getResources().getDrawable(i3);
    }

    public static File[] g(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] h(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static <T> T i(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getSystemService(cls);
        }
        String j2 = j(context, cls);
        if (j2 != null) {
            return context.getSystemService(j2);
        }
        return null;
    }

    public static String j(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getSystemServiceName(cls);
        }
        return C0013a.a.get(cls);
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void l(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
