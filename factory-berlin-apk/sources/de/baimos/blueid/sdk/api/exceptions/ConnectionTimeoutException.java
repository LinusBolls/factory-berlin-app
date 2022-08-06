package de.baimos.blueid.sdk.api.exceptions;

public class ConnectionTimeoutException extends RemoteException {
    public ConnectionTimeoutException() {
    }

    public ConnectionTimeoutException(String str) {
        super(str);
    }

    public ConnectionTimeoutException(String str, Throwable th) {
        super(str, th);
    }

    public ConnectionTimeoutException(Throwable th) {
        super(th);
    }
}
