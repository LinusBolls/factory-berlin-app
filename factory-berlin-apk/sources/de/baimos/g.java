package de.baimos;

import android.content.Context;
import android.os.Build;
import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.util.BtLeHelper;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class g implements Channel {
    private static final dr a = ds.a(g.class);
    private Context b;

    public g(Context context) {
        this.b = context;
        m.a().a(context);
    }

    public Context a() {
        return this.b;
    }

    public String getActionToEnableChannel() {
        BtLeHelper btLeHelper = new BtLeHelper(this.b);
        if (!btLeHelper.isBluetoothActivated()) {
            return "android.bluetooth.adapter.action.REQUEST_ENABLE";
        }
        if (!btLeHelper.isLocationActivated()) {
            return "android.settings.LOCATION_SOURCE_SETTINGS";
        }
        return null;
    }

    public Channel.ChannelStatus getChannelStatus() {
        BtLeHelper btLeHelper = new BtLeHelper(this.b);
        if (!btLeHelper.isBluetoothSupported()) {
            a.a("Bluetooth LE is not supported on this smartphone. At least Android 4.3 and support by hardware is needed to use this channel.");
            return Channel.ChannelStatus.NOT_SUPPORTED;
        } else if (!btLeHelper.hasBluetoothPermissions() || !btLeHelper.hasLocationPermission()) {
            a.a("To use Bluetooth, your app must request these permissions: android.permission.BLUETOOTH, android.permission.BLUETOOTH_ADMIN");
            a.a("In addition, either android.permission.ACCESS_FINE_LOCATION or android.permission.ACCESS_COARSE_LOCATION is needed for Android M and above. Starting with Android Q, android.permission.ACCESS_FINE_LOCATION must be granted.");
            return Channel.ChannelStatus.NOT_AUTHORIZED;
        } else if (!btLeHelper.isBluetoothActivated()) {
            a.a("Bluetooth is currently deactivated and needs to get activated.");
            return Channel.ChannelStatus.NOT_ENABLED;
        } else if (btLeHelper.isLocationActivated()) {
            return Channel.ChannelStatus.ENABLED;
        } else {
            a.a("Location is currently deactivated and needs to get activated.");
            return Channel.ChannelStatus.NOT_ENABLED;
        }
    }

    public String getId() {
        return Channel.BLUETOOTH_SMART_CHANNEL_ID;
    }

    public List<String> getRequiredPermissions() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 23 ? Arrays.asList(new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"}) : i2 < 29 ? Arrays.asList(new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_COARSE_LOCATION"}) : Arrays.asList(new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_FINE_LOCATION"});
    }

    public List<String> getUserDeactivatedPermissions() {
        return new BtLeHelper(this.b).isLocationActivationRequired() ? Build.VERSION.SDK_INT < 29 ? Arrays.asList(new String[]{"android.permission.ACCESS_COARSE_LOCATION"}) : Arrays.asList(new String[]{"android.permission.ACCESS_FINE_LOCATION"}) : Collections.emptyList();
    }
}
