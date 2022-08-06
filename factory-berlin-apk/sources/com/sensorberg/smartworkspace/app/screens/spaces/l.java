package com.sensorberg.smartworkspace.app.screens.spaces;

import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.b;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceIconFactory.kt */
public final class l {
    private final b.a b(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.g.f7963e);
        boolean z = true;
        if (a == null || !a.getValue()) {
            z = false;
        }
        return new b.a(z ? b.a.C0522a.ON : b.a.C0522a.OFF, k(iotDevice));
    }

    private final b.C0523b c(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.e.f7961e);
        boolean z = true;
        if (a == null || !a.getValue()) {
            z = false;
        }
        return new b.C0523b(z ? b.C0523b.a.OPEN : b.C0523b.a.CLOSED, k(iotDevice));
    }

    private final b.c d(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.g.f7963e);
        boolean z = true;
        if (a == null || !a.getValue()) {
            z = false;
        }
        return new b.c(z ? b.c.a.ON : b.c.a.OFF, k(iotDevice));
    }

    private final b.d e(IotDevice iotDevice) {
        b.d.a aVar;
        Property.Numeric c = n.c(iotDevice.getProperties(), o.f.f7962e);
        if (c == null) {
            aVar = b.d.a.HALF;
        } else if (c.getMaxValue() == c.getValue()) {
            aVar = b.d.a.OPEN;
        } else if (c.getMinValue() == c.getValue()) {
            aVar = b.d.a.CLOSED;
        } else {
            aVar = b.d.a.HALF;
        }
        return new b.d(aVar, k(iotDevice));
    }

    private final b.e f(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.g.f7963e);
        boolean z = true;
        if (a == null || !a.getValue()) {
            z = false;
        }
        return new b.e(z ? b.e.a.ON : b.e.a.OFF, k(iotDevice));
    }

    private final b.g g(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.g.f7963e);
        boolean z = true;
        if (a == null || !a.getValue()) {
            z = false;
        }
        return new b.g(z ? b.g.a.ON : b.g.a.OFF, k(iotDevice));
    }

    private final b.h h(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.a.f7958e);
        boolean z = true;
        if (a == null || !a.getValue()) {
            z = false;
        }
        return new b.h(z ? b.h.a.ALARM : b.h.a.OFF, k(iotDevice));
    }

    private final b.i i(IotDevice iotDevice) {
        return new b.i(k(iotDevice));
    }

    private final b.j j(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.e.f7961e);
        boolean z = true;
        if (a == null || !a.getValue()) {
            z = false;
        }
        return new b.j(z ? b.j.a.OPEN : b.j.a.CLOSED, k(iotDevice));
    }

    private final boolean k(IotDevice iotDevice) {
        Property.Binary a = n.a(iotDevice.getProperties(), o.i.f7965e);
        return a != null && a.getValue();
    }

    public final b a(IotDevice iotDevice) {
        k.e(iotDevice, "iotDevice");
        switch (k.a[IotDeviceIdentifier.Companion.a(iotDevice).ordinal()]) {
            case 1:
                return b(iotDevice);
            case 2:
                return c(iotDevice);
            case 3:
                return d(iotDevice);
            case 4:
                return e(iotDevice);
            case 5:
                return f(iotDevice);
            case 6:
                return g(iotDevice);
            case 7:
                return h(iotDevice);
            case 8:
                return i(iotDevice);
            case 9:
                return j(iotDevice);
            default:
                return new b.f(k(iotDevice));
        }
    }
}
