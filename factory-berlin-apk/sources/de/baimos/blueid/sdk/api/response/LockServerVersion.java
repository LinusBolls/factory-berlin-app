package de.baimos.blueid.sdk.api.response;

public class LockServerVersion implements ResponseObject {
    private final String version;

    LockServerVersion(String str) {
        this.version = str;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "LockServerVersion{version='" + this.version + '\'' + '}';
    }
}
