package de.baimos.blueid.sdk.api.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class BtLeHelper {
    private static final String TAG = "BLUEID";
    private Context context;

    public enum BtLeRequirements {
        BTLE_NOT_SUPPORTED,
        BTLE_DEACTIVATED,
        MISSING_BLUETOOTH_PERMISSIONS,
        MISSING_LOCATION_PERMISSIONS,
        LOCATION_DEACTIVATED
    }

    public BtLeHelper(Context context2) {
        this.context = context2;
    }

    public static List<BtLeRequirements> getMissingRequirements(Context context2) {
        BtLeRequirements btLeRequirements;
        BtLeHelper btLeHelper = new BtLeHelper(context2);
        ArrayList arrayList = new ArrayList();
        if (!btLeHelper.isBluetoothSupported()) {
            btLeRequirements = BtLeRequirements.BTLE_NOT_SUPPORTED;
        } else {
            if (!btLeHelper.isBluetoothActivated()) {
                arrayList.add(BtLeRequirements.BTLE_DEACTIVATED);
            }
            if (!btLeHelper.hasBluetoothPermissions()) {
                arrayList.add(BtLeRequirements.MISSING_BLUETOOTH_PERMISSIONS);
            }
            if (!btLeHelper.hasLocationPermission()) {
                arrayList.add(BtLeRequirements.MISSING_LOCATION_PERMISSIONS);
            }
            if (btLeHelper.isLocationActivationRequired() && !btLeHelper.isLocationActivated()) {
                btLeRequirements = BtLeRequirements.LOCATION_DEACTIVATED;
            }
            return arrayList;
        }
        arrayList.add(btLeRequirements);
        return arrayList;
    }

    public boolean hasBluetoothPermissions() {
        return this.context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0 && this.context.checkCallingOrSelfPermission("android.permission.BLUETOOTH_ADMIN") == 0;
    }

    public boolean hasLocationPermission() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            return true;
        }
        return i2 < 29 ? this.context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || this.context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 : this.context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean isBluetoothActivated() {
        BluetoothAdapter adapter = ((BluetoothManager) this.context.getSystemService("bluetooth")).getAdapter();
        return this.context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && adapter != null && adapter.isEnabled();
    }

    public boolean isBluetoothSupported() {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        try {
            Class.forName("android.bluetooth.BluetoothManager");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public boolean isLocationActivated() {
        if (!isLocationActivationRequired()) {
            return true;
        }
        LocationManager locationManager = (LocationManager) this.context.getSystemService("location");
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    public boolean isLocationActivationRequired() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getApplicationContext().getPackageName(), 0).applicationInfo.targetSdkVersion >= 23;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(TAG, "Failed to get package info", e2);
            return true;
        }
    }
}
