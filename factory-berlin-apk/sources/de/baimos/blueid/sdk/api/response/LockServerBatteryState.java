package de.baimos.blueid.sdk.api.response;

import de.baimos.blueid.sdk.api.exceptions.ResponseDataParseException;

public enum LockServerBatteryState implements ResponseObject {
    OK(0),
    GETTING_EMPTY(1),
    EMPTY(2),
    CRITICAL(3),
    PERMANENT_POWERED(100),
    UNKNOWN(255);
    
    private final int value;

    private LockServerBatteryState(int i2) {
        this.value = i2;
    }

    public static LockServerBatteryState getStateForRawValue(int i2) {
        LockServerBatteryState lockServerBatteryState;
        LockServerBatteryState[] values = values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                lockServerBatteryState = null;
                break;
            }
            lockServerBatteryState = values[i3];
            if (lockServerBatteryState.getValue() == i2) {
                break;
            }
            i3++;
        }
        if (lockServerBatteryState != null) {
            return lockServerBatteryState;
        }
        throw new ResponseDataParseException("unknown battery state " + i2);
    }

    public LockServerBatteryState getState() {
        return getStateForRawValue(this.value);
    }

    public int getValue() {
        return this.value;
    }
}
