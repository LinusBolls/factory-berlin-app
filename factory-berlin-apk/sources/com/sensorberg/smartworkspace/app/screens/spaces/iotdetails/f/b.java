package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f;

import android.content.res.Resources;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.screens.spaces.l;
import com.sensorberg.smartworkspace.app.screens.spaces.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: GenericIotDeviceDetailsMapper.kt */
public final class b implements d {
    private final String a;
    private final l b;
    private final Resources c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7953d;

    public b(l lVar, Resources resources, c cVar) {
        k.e(lVar, "iotDeviceIconFactory");
        k.e(resources, "resources");
        k.e(cVar, "genericMapper");
        this.b = lVar;
        this.c = resources;
        this.f7953d = cVar;
        String string = resources.getString(R.string.label_iotdevice_status);
        k.d(string, "resources.getString(R.st…g.label_iotdevice_status)");
        this.a = string;
    }

    public int a() {
        return R.drawable.icn_misc_on;
    }

    public List<e> b(IotDevice iotDevice) {
        e d2;
        k.e(iotDevice, "iotDevice");
        com.sensorberg.smartworkspace.app.screens.spaces.b a2 = this.b.a(iotDevice);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e.b(-1, iotDevice.getName(), false, false, a2.a()));
        Property b2 = n.b(iotDevice);
        Integer b3 = a2.b();
        String string = b3 != null ? this.c.getString(b3.intValue()) : null;
        if (!(b2 == null || (d2 = this.f7953d.d(b2, this.a, string)) == null)) {
            arrayList.add(d2);
        }
        List<Property> properties = iotDevice.getProperties();
        ArrayList arrayList2 = new ArrayList();
        for (T next : properties) {
            if (!k.a(((Property) next).getKind(), b2 != null ? b2.getKind() : null)) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(this.f7953d.b(arrayList2));
        return arrayList;
    }
}
