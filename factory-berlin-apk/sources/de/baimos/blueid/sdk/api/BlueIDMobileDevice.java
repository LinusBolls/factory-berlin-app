package de.baimos.blueid.sdk.api;

import de.baimos.blueid.sdk.internal.DeviceInitializer;
import java.util.Date;
import java.util.List;

public interface BlueIDMobileDevice {

    public static class InitParametersBuilder {
        private static final String DEFAULT_INTEGRATION_TRUSTCENTER_HOSTNAME = "deviceapi-int.blueid.net";
        private static final String DEFAULT_PRODUCTION_TRUSTCENTER_HOSTNAME = "deviceapi-prod.blueid.net";
        String apiKey;
        private DeviceInitializer deviceInitializer;
        String trustCenterHostName;

        InitParametersBuilder(DeviceInitializer deviceInitializer2) {
            this.deviceInitializer = deviceInitializer2;
        }

        public String now() {
            return this.deviceInitializer.initialize(this);
        }

        public InitParametersBuilder onDefaultIntegrationTrustCenter() {
            this.trustCenterHostName = DEFAULT_INTEGRATION_TRUSTCENTER_HOSTNAME;
            return this;
        }

        public InitParametersBuilder onDefaultProductionTrustCenter() {
            this.trustCenterHostName = DEFAULT_PRODUCTION_TRUSTCENTER_HOSTNAME;
            return this;
        }

        public InitParametersBuilder onTrustCenter(String str) {
            this.trustCenterHostName = str;
            return this;
        }

        public InitParametersBuilder withApiKey(String str) {
            this.apiKey = str;
            return this;
        }
    }

    void destroy();

    CommandExecutionResponse executeCommand(SecuredObject securedObject, Channel channel, Command command);

    CommandExecutionResponse executeCommand(SecuredObject securedObject, Channel channel, Command command, byte[] bArr);

    String getDeviceId();

    Date getLastSynchronizationDate();

    String getLogs();

    SecuredObject getSecuredObjectById(String str);

    List<SecuredObject> getSecuredObjects();

    void initLogs();

    InitParametersBuilder initialize();

    boolean isInitialized();

    void synchronize();
}
