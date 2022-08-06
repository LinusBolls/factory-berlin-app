package com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a;

/* compiled from: GatewayBleResponseCode.kt */
public enum b {
    OK,
    ERROR,
    UNKNOWN;
    

    /* renamed from: k  reason: collision with root package name */
    public static final a f6776k = null;

    /* compiled from: GatewayBleResponseCode.kt */
    public static final class a {
        private a() {
        }

        public final b a(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 1437637669) {
                    if (hashCode == 1451407551 && str.equals("1301OK")) {
                        return b.OK;
                    }
                } else if (str.equals("1301ERROR")) {
                    return b.ERROR;
                }
            }
            return b.UNKNOWN;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f6776k = new a((DefaultConstructorMarker) null);
    }
}
