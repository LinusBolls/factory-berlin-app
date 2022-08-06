package de.baimos;

import de.baimos.blueid.sdk.api.Channel;
import java.util.Collections;
import java.util.List;

public class d implements Channel {
    private String a;

    public d(String str) {
        this.a = str;
    }

    public String getActionToEnableChannel() {
        return null;
    }

    public Channel.ChannelStatus getChannelStatus() {
        return Channel.ChannelStatus.NOT_SUPPORTED;
    }

    public String getId() {
        return this.a;
    }

    public List<String> getRequiredPermissions() {
        return Collections.emptyList();
    }

    public List<String> getUserDeactivatedPermissions() {
        return Collections.emptyList();
    }
}
