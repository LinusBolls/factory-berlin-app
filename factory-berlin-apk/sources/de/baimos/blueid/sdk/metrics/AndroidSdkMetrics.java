package de.baimos.blueid.sdk.metrics;

import de.baimos.dr;
import de.baimos.ds;
import java.util.Map;

public abstract class AndroidSdkMetrics {
    public static final String CACHE_USED_TAB_TITLE_TAG = "CacheUsed";
    public static final String COMMAND_EXECUTION_TIME_TAB_TITLE_TAG = "CommandExecutionMs";
    public static final String CONNECTION_SUCCESS_TAB_TITLE_TAG = "ConnectionSuccess";
    public static final String DEVICE_DISCOVERY_TIME_TAB_TITLE_TAG = "DeviceDiscoveredMs";
    public static final String DISCONNECTION_TIME_TAB_TITLE_TAG = "DisconnectMs";
    public static final String GATT_CONNECTION_TIME_TAB_TITLE_TAG = "GattConnectionMs";
    public static final long METRICS_INVALID_LONG_VALUE = -1;
    public static final String NOTIFICATION_ENABLED_TIME_TAB_TITLE_TAG = "NotificationEnabledMs";
    public static final String SCAN_TIME_TAB_TITLE_TAG = "ScanMs";
    public static final String SDK_EXCEPTION_TAB_TITLE_TAG = "SDKExceptions";
    public static final String SDK_MESSAGE_TAB_TITLE_TAG = "SDKMessages";
    public static final String SEPARATOR = ",";
    public static final String SERVICE_DISCOVER_TIME_TAB_TITLE_TAG = "ServicesDiscoveredMs";
    public static final String TOTAL_TIME_TAB_TITLE_TAG = "TotalSdkMs";
    private static final dr log = ds.a(AndroidSdkMetrics.class);

    public abstract void addMessage(Exception exc);

    public abstract void addMessage(String str);

    public abstract void addMessage(String str, Exception exc);

    public abstract void clearMetrics();

    public abstract void connectionClosed();

    public abstract void connectionEstablished();

    public abstract void deviceFound();

    public abstract void fillMapWithMetrics(Map<String, Object> map);

    public abstract void finishedExecution();

    public abstract void gattConnected();

    public void getCsvFormattedStringBuilder(StringBuilder sb) {
        writeResultsInCSVFormat(sb);
        dr drVar = log;
        drVar.d("[METRICS] " + toString());
    }

    public abstract void servicesDiscovered();

    public abstract void setConnectedByCache(boolean z);

    public abstract void setScanDuration(long j2);

    public abstract void startConnectionAttempt();

    public abstract void startExecution();

    public abstract void writeResultsInCSVFormat(StringBuilder sb);
}
