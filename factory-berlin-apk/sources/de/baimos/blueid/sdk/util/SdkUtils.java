package de.baimos.blueid.sdk.util;

import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import de.baimos.blueid.sdk.api.BlueIDMobileDevice;
import de.baimos.blueid.sdk.api.BlueIDMobileDeviceImpl;
import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.api.CommandExecutionResponse;
import de.baimos.blueid.sdk.api.SecuredObject;
import de.baimos.blueid.sdk.api.log.BlueIDLog;
import de.baimos.blueid.sdk.data.b;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.core.util.filter.ConnectionFilter;
import de.baimos.m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class SdkUtils {
    public static void addFoundBluetoothDevice(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null && bluetoothDevice.getName() != null) {
            m.a().a(bluetoothDevice.getName(), bluetoothDevice);
        }
    }

    public static void addFoundBluetoothDevice(String str, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null && str != null) {
            m.a().a(str, bluetoothDevice);
        }
    }

    public static void clearBluetoothCache() {
        m.a().a();
    }

    public static void disableScanningBySDK(boolean z) {
        System.setProperty("net.blueid.sdk.DISABLE_SCANNING", Boolean.toString(z));
    }

    public static void enableDebugLogging(boolean z) {
        BlueIDLog.setMaxLogLevel(z ? 3 : 4);
    }

    public static CommandExecutionResponse executeCommandWithFilter(BlueIDMobileDevice blueIDMobileDevice, SecuredObject securedObject, Channel channel, Command command, byte[] bArr, List<ConnectionFilter> list) {
        return ((BlueIDMobileDeviceImpl) blueIDMobileDevice).a(securedObject, channel, command, bArr, list);
    }

    @Deprecated
    public static CommandExecutionResponse executeCommandWithMetrics(BlueIDMobileDevice blueIDMobileDevice, SecuredObject securedObject, Channel channel, Command command, StringBuilder sb) {
        AndroidSdkMetrics sdkMetrics = ((BlueIDMobileDeviceImpl) blueIDMobileDevice).getSdkMetrics();
        try {
            return blueIDMobileDevice.executeCommand(securedObject, channel, command);
        } finally {
            sdkMetrics.getCsvFormattedStringBuilder(sb);
        }
    }

    public static CommandExecutionResponse executeCommandWithMetrics(BlueIDMobileDevice blueIDMobileDevice, SecuredObject securedObject, Channel channel, Command command, Map<String, Object> map) {
        AndroidSdkMetrics sdkMetrics = ((BlueIDMobileDeviceImpl) blueIDMobileDevice).getSdkMetrics();
        try {
            return blueIDMobileDevice.executeCommand(securedObject, channel, command);
        } finally {
            sdkMetrics.fillMapWithMetrics(map);
        }
    }

    public static String getCurrentTimeISO8601() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    public static String getIdentityOauthToken(BlueIDMobileDevice blueIDMobileDevice) {
        return ((BlueIDMobileDeviceImpl) blueIDMobileDevice).a();
    }

    public static String getLocalNameForSecuredObject(BlueIDMobileDevice blueIDMobileDevice, String str) {
        try {
            return Uri.parse(((b) ((BlueIDMobileDeviceImpl) blueIDMobileDevice).getSecuredObjectById(str)).a(Channel.BLUETOOTH_SMART_CHANNEL_ID)).getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, Object> getMetricsAsMap(BlueIDMobileDevice blueIDMobileDevice) {
        AndroidSdkMetrics sdkMetrics = ((BlueIDMobileDeviceImpl) blueIDMobileDevice).getSdkMetrics();
        HashMap hashMap = new HashMap();
        sdkMetrics.fillMapWithMetrics(hashMap);
        return hashMap;
    }

    public static String getMetricsAsString(BlueIDMobileDevice blueIDMobileDevice) {
        AndroidSdkMetrics sdkMetrics = ((BlueIDMobileDeviceImpl) blueIDMobileDevice).getSdkMetrics();
        StringBuilder sb = new StringBuilder();
        sdkMetrics.getCsvFormattedStringBuilder(sb);
        return sb.toString();
    }
}
