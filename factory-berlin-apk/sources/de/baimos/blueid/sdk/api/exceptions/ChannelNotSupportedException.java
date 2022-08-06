package de.baimos.blueid.sdk.api.exceptions;

import de.baimos.blueid.sdk.api.Channel;

public class ChannelNotSupportedException extends RemoteException {
    public ChannelNotSupportedException(Channel channel) {
        super(channel.getId());
    }
}
