package de.baimos.blueid.sdk.api.exceptions;

import java.io.IOException;

public class RemoteException extends IOException {
    public RemoteException() {
    }

    public RemoteException(String str) {
        super(str);
    }

    public RemoteException(String str, Throwable th) {
        super(str, th);
    }

    public RemoteException(Throwable th) {
        super(th);
    }
}
