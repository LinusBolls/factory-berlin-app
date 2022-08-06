package de.baimos.blueid.sdk.api.exceptions;

public class ConnectionIOException extends RemoteException {
    public ConnectionIOException() {
    }

    public ConnectionIOException(String str) {
        super(str);
    }

    public ConnectionIOException(String str, Throwable th) {
        super(str, th);
    }

    public ConnectionIOException(Throwable th) {
        super(th);
    }
}
