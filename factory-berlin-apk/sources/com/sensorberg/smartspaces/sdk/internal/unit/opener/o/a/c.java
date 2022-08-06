package com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a;

import android.content.res.Resources;
import g.e.n.g.p;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: GatewayBleResponseErrorReason.kt */
public enum c {
    INVALID_ACTUATOR_ACTING_REQUEST,
    INVALID_ACTUATOR_ACTING_REQUEST_FORMAT,
    INVALID_CHECKSUM,
    SERVER_RESPONDED_WITH_ERROR,
    INVALID_SERVER_RESPONSE,
    NO_ACTUATOR_FROM_SERVER,
    NO_ACTUATOR_BY_THAT_INDEX_LOCALLY_FOUND,
    JSON,
    OTHER,
    UNKNOWN;
    
    public static final a r = null;

    /* compiled from: GatewayBleResponseErrorReason.kt */
    public static final class a {
        private a() {
        }

        public final c a(String str) {
            if (str != null) {
                return c.valueOf(str);
            }
            return c.UNKNOWN;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        r = new a((DefaultConstructorMarker) null);
    }

    public final String a(Resources resources, String str) {
        k.e(resources, "resources");
        switch (d.a[ordinal()]) {
            case 1:
                String string = resources.getString(p.GATEWAY_BLE_ERROR_INVALID_ACTUATOR_ACTING_REQUEST);
                k.d(string, "resources.getString(R.st…_ACTUATOR_ACTING_REQUEST)");
                return string;
            case 2:
                String string2 = resources.getString(p.GATEWAY_BLE_ERROR_INVALID_ACTUATOR_ACTING_REQUEST_FORMAT);
                k.d(string2, "resources.getString(R.st…OR_ACTING_REQUEST_FORMAT)");
                return string2;
            case 3:
                String string3 = resources.getString(p.GATEWAY_BLE_ERROR_INVALID_CHECKSUM);
                k.d(string3, "resources.getString(R.st…E_ERROR_INVALID_CHECKSUM)");
                return string3;
            case 4:
                String string4 = resources.getString(p.GATEWAY_BLE_ERROR_SERVER_RESPONDED_WITH_ERROR);
                k.d(string4, "resources.getString(R.st…VER_RESPONDED_WITH_ERROR)");
                String format = String.format(string4, Arrays.copyOf(new Object[]{str}, 1));
                k.d(format, "java.lang.String.format(this, *args)");
                return format;
            case 5:
                String string5 = resources.getString(p.GATEWAY_BLE_ERROR_INVALID_SERVER_RESPONSE);
                k.d(string5, "resources.getString(R.st…_INVALID_SERVER_RESPONSE)");
                return string5;
            case 6:
                String string6 = resources.getString(p.GATEWAY_BLE_ERROR_NO_ACTUATOR_FROM_SERVER);
                k.d(string6, "resources.getString(R.st…_NO_ACTUATOR_FROM_SERVER)");
                return string6;
            case 7:
                String string7 = resources.getString(p.GATEWAY_BLE_ERROR_NO_ACTUATOR_BY_THAT_INDEX_LOCALLY_FOUND);
                k.d(string7, "resources.getString(R.st…THAT_INDEX_LOCALLY_FOUND)");
                return string7;
            case 8:
                String string8 = resources.getString(p.GATEWAY_BLE_ERROR_JSON);
                k.d(string8, "resources.getString(R.st…g.GATEWAY_BLE_ERROR_JSON)");
                return string8;
            case 9:
                String string9 = resources.getString(p.GATEWAY_BLE_ERROR_OTHER);
                k.d(string9, "resources.getString(R.st….GATEWAY_BLE_ERROR_OTHER)");
                String format2 = String.format(string9, Arrays.copyOf(new Object[]{str}, 1));
                k.d(format2, "java.lang.String.format(this, *args)");
                return format2;
            case 10:
                String string10 = resources.getString(p.UNKNOWN_ERROR);
                k.d(string10, "resources.getString(R.string.UNKNOWN_ERROR)");
                return string10;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
