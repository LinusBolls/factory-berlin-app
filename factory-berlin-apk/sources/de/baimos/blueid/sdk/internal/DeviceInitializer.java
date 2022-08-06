package de.baimos.blueid.sdk.internal;

import de.baimos.blueid.sdk.api.BlueIDMobileDevice;

public interface DeviceInitializer {
    String initialize(BlueIDMobileDevice.InitParametersBuilder initParametersBuilder);
}
