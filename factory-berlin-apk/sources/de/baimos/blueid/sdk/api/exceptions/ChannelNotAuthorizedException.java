package de.baimos.blueid.sdk.api.exceptions;

import de.baimos.blueid.sdk.api.Channel;

public class ChannelNotAuthorizedException extends RemoteException {
    public ChannelNotAuthorizedException(Channel channel) {
        super(channel.getId());
    }
}
