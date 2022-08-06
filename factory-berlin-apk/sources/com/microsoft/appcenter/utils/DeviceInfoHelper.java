package com.microsoft.appcenter.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.microsoft.appcenter.k.d.c;
import com.microsoft.appcenter.k.d.h;
import java.util.Locale;
import java.util.TimeZone;

public class DeviceInfoHelper {
    private static h a;

    public static class DeviceInfoException extends Exception {
        public DeviceInfoException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (DeviceInfoHelper.class) {
            cVar = new c();
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                cVar.O(packageInfo.versionName);
                cVar.M(String.valueOf(c(packageInfo)));
                cVar.N(context.getPackageName());
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    cVar.P(networkCountryIso);
                }
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    cVar.Q(networkOperatorName);
                }
            } catch (Exception e2) {
                a.c("AppCenter", "Cannot retrieve package info", e2);
                throw new DeviceInfoException("Cannot retrieve package info", e2);
            } catch (Exception e3) {
                a.c("AppCenter", "Cannot retrieve carrier info", e3);
            }
            cVar.R(Locale.getDefault().toString());
            cVar.S(Build.MODEL);
            cVar.T(Build.MANUFACTURER);
            cVar.U(Integer.valueOf(Build.VERSION.SDK_INT));
            cVar.W("Android");
            cVar.X(Build.VERSION.RELEASE);
            cVar.V(Build.ID);
            try {
                cVar.Y(b(context));
            } catch (Exception e4) {
                a.c("AppCenter", "Cannot retrieve screen size", e4);
            }
            cVar.Z("appcenter.android");
            cVar.a0("3.3.0");
            cVar.b0(Integer.valueOf((TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 60) / 1000));
            if (a != null) {
                cVar.v(a.p());
                cVar.u(a.o());
                cVar.t(a.n());
                cVar.s(a.m());
                cVar.q(a.k());
                cVar.r(a.l());
            }
        }
        return cVar;
    }

    @SuppressLint({"SwitchIntDef"})
    private static String b(Context context) {
        Display display;
        int i2;
        int i3;
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        } else {
            display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            display.getSize(point);
        }
        int rotation = display.getRotation();
        if (rotation == 1 || rotation == 3) {
            int i4 = point.x;
            int i5 = point.y;
            i3 = i4;
            i2 = i5;
        } else {
            i2 = point.x;
            i3 = point.y;
        }
        return i2 + "x" + i3;
    }

    public static int c(PackageInfo packageInfo) {
        return packageInfo.versionCode;
    }
}
