package de.baimos.blueid.sdk.api.response;

import java.util.Collections;
import java.util.List;

public final class UserAccessLog implements ResponseObject {
    private List<Entry> entries;

    public static class Entry {
        private int authorizationStatusCode;
        private String channel;
        private String commandId;
        long logEntryId;
        private String mobileDeviceId;
        private long timestamp;

        Entry(long j2, long j3, String str, String str2, String str3, int i2) {
            this.logEntryId = j2;
            this.timestamp = j3;
            this.mobileDeviceId = str;
            this.channel = str2;
            this.commandId = str3;
            this.authorizationStatusCode = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && Entry.class == obj.getClass() && this.logEntryId == ((Entry) obj).logEntryId;
        }

        public AuthorizationStatus getAuthorizationStatus() {
            return AuthorizationStatus.convertToStatus(this.authorizationStatusCode);
        }

        public int getAuthorizationStatusCode() {
            return this.authorizationStatusCode;
        }

        public String getChannel() {
            return this.channel;
        }

        public String getCommandId() {
            return this.commandId;
        }

        public String getMobileDeviceId() {
            return this.mobileDeviceId;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long j2 = this.logEntryId;
            return (int) (j2 ^ (j2 >>> 32));
        }

        public String toString() {
            return "Entry{logEntryId='" + this.logEntryId + '\'' + ", timestamp=" + this.timestamp + ", mobileDeviceId='" + this.mobileDeviceId + '\'' + ", channel='" + this.channel + '\'' + ", commandId='" + this.commandId + '\'' + ", authorizationStatusCode=" + this.authorizationStatusCode + '}';
        }
    }

    UserAccessLog(List<Entry> list) {
        this.entries = list;
    }

    public List<Entry> getEntries() {
        return Collections.unmodifiableList(this.entries);
    }

    public String toString() {
        return "UserAccessLog{entries=" + this.entries + '}';
    }
}
