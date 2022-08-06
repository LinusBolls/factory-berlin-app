package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.content.res.Resources;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import com.sensorberg.smartworkspace.app.screens.spaces.l;
import com.sensorberg.smartworkspace.app.screens.spaces.n;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: StatusFactory.kt */
public final class o {
    private final Resources a;
    private final l b;

    public o(Resources resources, l lVar) {
        k.e(resources, "resources");
        k.e(lVar, "iotDeviceIconFactory");
        this.a = resources;
        this.b = lVar;
    }

    private final String a(IotDevice iotDevice) {
        Property.Binary a2 = n.a(iotDevice.getProperties(), o.g.f7963e);
        boolean value = a2 != null ? a2.getValue() : false;
        Property.Numeric c = n.c(iotDevice.getProperties(), o.d.f7960e);
        String d2 = c != null ? d(c, "%") : null;
        if (value) {
            return d2;
        }
        return null;
    }

    private final String c(IotDevice iotDevice) {
        Property.Numeric c = n.c(iotDevice.getProperties(), o.h.f7964e);
        if (c != null) {
            return d(c, "°C");
        }
        return null;
    }

    private final String d(Property.Numeric numeric, String str) {
        return ((int) numeric.getValue()) + ' ' + str;
    }

    public final String b(IotDevice iotDevice) {
        k.e(iotDevice, "iotDevice");
        switch (n.a[IotDeviceIdentifier.Companion.a(iotDevice).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Integer b2 = this.b.a(iotDevice).b();
                if (b2 == null) {
                    return null;
                }
                return this.a.getString(b2.intValue());
            case 6:
            case 7:
            case 8:
                return c(iotDevice);
            case 9:
                return a(iotDevice);
            case 10:
            case 11:
            case 12:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
