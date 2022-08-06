package de.baimos;

public class am extends RuntimeException {
    public am() {
        super("Call BlueIDMobileDeviceImpl.initialize() before usage!");
    }
}
