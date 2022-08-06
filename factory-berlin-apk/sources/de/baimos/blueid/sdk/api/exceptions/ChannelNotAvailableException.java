package de.baimos.blueid.sdk.api.exceptions;

import de.baimos.blueid.sdk.api.Channel;

public class ChannelNotAvailableException extends RemoteException {
    public ChannelNotAvailableException(Channel channel) {
        super(channel.getId());
    }
}
