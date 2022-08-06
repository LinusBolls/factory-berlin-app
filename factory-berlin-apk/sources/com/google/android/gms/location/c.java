package com.google.android.gms.location;

import com.google.android.gms.common.api.b;

public final class c extends b {
    public static String a(int i2) {
        switch (i2) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            default:
                return b.a(i2);
        }
    }
}
