package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f;

import android.content.res.Resources;
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

/* compiled from: JalousieIotDeviceDetailsMapper.kt */
public final class e implements d {
    private final String a;
    private final l b;
    private final Resources c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7954d;

    public e(l lVar, Resources resources, c cVar) {
        k.e(lVar, "iotDeviceIconFactory");
        k.e(resources, "resources");
        k.e(cVar, "genericMapper");
        this.b = lVar;
        this.c = resources;
        this.f7954d = cVar;
        String string = resources.getString(R.string.label_iotdevice_status);
        k.d(string, "resources.getString(R.st…g.label_iotdevice_status)");
        this.a = string;
    }

    public int a() {
        return new b.d(b.d.a.HALF, false).a();
    }

    public List<com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e> b(IotDevice iotDevice) {
        e.d c2;
        e.d c3;
        k.e(iotDevice, "iotDevice");
        List<T> T = v.T(iotDevice.getProperties());
        b a2 = this.b.a(iotDevice);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e.b(-1, iotDevice.getName(), false, false, a2.a()));
        Integer b2 = a2.b();
        Property b3 = n.b(iotDevice);
        if (!(b2 == null || b3 == null)) {
            T.remove(b3);
            String str = this.a;
            String string = this.c.getString(b2.intValue());
            k.d(string, "resources.getString(stringResId)");
            arrayList.add(new e.c(-2, str, string));
        }
        Property.Numeric c4 = n.c(iotDevice.getProperties(), o.f.f7962e);
        if (!(c4 == null || (c3 = this.f7954d.c(R.string.label_iotdevice_position, o.f.f7962e, c4)) == null)) {
            T.remove(c4);
            arrayList.add(c3);
        }
        Property.Numeric c5 = n.c(iotDevice.getProperties(), o.b.f7959e);
        if (!(c5 == null || (c2 = this.f7954d.c(R.string.label_iotdevice_angle, o.b.f7959e, c5)) == null)) {
            T.remove(c5);
            arrayList.add(c2);
        }
        arrayList.addAll(this.f7954d.b(T));
        return arrayList;
    }
}
