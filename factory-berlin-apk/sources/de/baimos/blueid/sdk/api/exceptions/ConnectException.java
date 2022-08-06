package de.baimos.blueid.sdk.api.exceptions;

public class ConnectException extends RemoteException {
    public ConnectException() {
    }

    public ConnectException(String str) {
        super(str);
    }

    public ConnectException(String str, Throwable th) {
        super(str, th);
    }

    public ConnectException(Throwable th) {
        super(th);
    }
}
