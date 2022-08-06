package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f;

import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.b;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.screens.spaces.l;
import com.sensorberg.smartworkspace.app.screens.spaces.n;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: AirConIotDeviceMapper.kt */
public final class a implements d {
    private final l a;
    private final c b;

    public a(l lVar, c cVar) {
        k.e(lVar, "iotDeviceIconFactory");
        k.e(cVar, "genericMapper");
        this.a = lVar;
        this.b = cVar;
    }

    public int a() {
        return new b.a(b.a.C0522a.OFF, false).a();
    }

    public List<e> b(IotDevice iotDevice) {
        e.d c;
        e.C0532e a2;
        k.e(iotDevice, "iotDevice");
        b a3 = this.a.a(iotDevice);
        List<T> T = v.T(iotDevice.getProperties());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e.b(-1, iotDevice.getName(), false, false, a3.a()));
        Property.Binary a4 = n.a(iotDevice.getProperties(), o.g.f7963e);
        if (!(a4 == null || (a2 = this.b.a(R.string.label_iotdevice_status, a3.b(), a4)) == null)) {
            T.remove(a4);
            arrayList.add(a2);
        }
        Property.Numeric c2 = n.c(iotDevice.getProperties(), o.h.f7964e);
        if (!(c2 == null || (c = this.b.c(R.string.label_iotdevice_temperature, o.h.f7964e, c2)) == null)) {
            T.remove(c2);
            arrayList.add(c);
        }
        arrayList.addAll(this.b.b(T));
        return arrayList;
    }
}
