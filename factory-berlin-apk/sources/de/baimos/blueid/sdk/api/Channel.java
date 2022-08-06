package de.baimos.blueid.sdk.api;

import java.util.List;

public interface Channel {
    public static final String BLUETOOTH_CHANNEL_ID = "btspp";
    public static final String BLUETOOTH_SMART_CHANNEL_ID = "btlespp";
    public static final String SOCKET_CHANNEL_ID = "socket";

    public enum ChannelStatus {
        NOT_SUPPORTED,
        NOT_AUTHORIZED,
        NOT_ENABLED,
        ENABLED
    }

    String getActionToEnableChannel();

    ChannelStatus getChannelStatus();

    String getId();

    List<String> getRequiredPermissions();

    List<String> getUserDeactivatedPermissions();
}
