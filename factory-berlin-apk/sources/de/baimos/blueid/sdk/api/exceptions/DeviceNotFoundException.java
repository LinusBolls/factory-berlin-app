package de.baimos.blueid.sdk.api.exceptions;

public class DeviceNotFoundException extends RemoteException {
    public DeviceNotFoundException() {
    }

    public DeviceNotFoundException(String str) {
        super(str);
    }

    public DeviceNotFoundException(Throwable th) {
        super(th);
    }
}
