package com.sensorberg.smartworkspace.app.screens.spaces;

import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: PropertyHelper.kt */
public final class n {
    public static final Property.Binary a(List<? extends Property> list, o oVar) {
        Property.Binary binary;
        Object obj;
        k.e(list, "$this$findBinaryPropertyOfKind");
        k.e(oVar, "propertyKind");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (k.a(((Property) next).getKind(), oVar.a())) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            binary = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof Property.Binary) {
                break;
            }
        }
        if (obj instanceof Property.Binary) {
            binary = obj;
        }
        return binary;
    }

    public static final Property b(IotDevice iotDevice) {
        o oVar;
        k.e(iotDevice, "$this$findMainProperty");
        T t = null;
        switch (m.a[IotDeviceIdentifier.Companion.a(iotDevice).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                oVar = o.g.f7963e;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                oVar = o.e.f7961e;
                break;
            case 9:
                oVar = o.f.f7962e;
                break;
            case 10:
            case 11:
                oVar = null;
                break;
            case 12:
                oVar = o.a.f7958e;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (oVar == null) {
            return null;
        }
        Iterator<T> it = iotDevice.getProperties().iterator();
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                if (d((Property) next, oVar)) {
                    t = next;
                }
            }
        }
        return (Property) t;
    }

    public static final Property.Numeric c(List<? extends Property> list, o oVar) {
        Property.Numeric numeric;
        Object obj;
        k.e(list, "$this$findNumericPropertyOfKind");
        k.e(oVar, "propertyKind");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (k.a(((Property) next).getKind(), oVar.a())) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            numeric = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof Property.Numeric) {
                break;
            }
        }
        if (obj instanceof Property.Numeric) {
            numeric = obj;
        }
        return numeric;
    }

    public static final boolean d(Property property, o oVar) {
        k.e(property, "$this$isKindOf");
        k.e(oVar, "propertyKind");
        return k.a(property.getKind(), oVar.a());
    }
}
