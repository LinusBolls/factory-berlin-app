package de.baimos.blueid.sdk.conn.channels.socket;

import android.content.Context;
import android.provider.Settings;
import de.baimos.blueid.sdk.api.Channel;
import java.util.Collections;
import java.util.List;

public class SocketCommunicationChannel implements Channel {
    private Context a = null;

    public SocketCommunicationChannel() {
    }

    public SocketCommunicationChannel(Context context) {
        this.a = context;
    }

    public boolean a() {
        return Settings.Global.getInt(this.a.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public String getActionToEnableChannel() {
        return null;
    }

    public Channel.ChannelStatus getChannelStatus() {
        return (this.a == null || !a()) ? Channel.ChannelStatus.ENABLED : Channel.ChannelStatus.NOT_ENABLED;
    }

    public String getId() {
        return Channel.SOCKET_CHANNEL_ID;
    }

    public List<String> getRequiredPermissions() {
        return Collections.emptyList();
    }

    public List<String> getUserDeactivatedPermissions() {
        return Collections.emptyList();
    }
}
