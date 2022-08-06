package de.baimos.blueid.sdk.api.exceptions;

public class ChannelNotAllowedException extends IllegalArgumentException {
    public ChannelNotAllowedException() {
    }

    public ChannelNotAllowedException(String str) {
        super(str);
    }

    public ChannelNotAllowedException(String str, Throwable th) {
        super(str, th);
    }

    public ChannelNotAllowedException(Throwable th) {
        super(th);
    }
}
