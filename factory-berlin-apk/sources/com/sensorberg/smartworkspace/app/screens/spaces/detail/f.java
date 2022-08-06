package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.content.res.Resources;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.d;
import com.sensorberg.smartworkspace.app.screens.spaces.n;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: QuickActionFactory.kt */
public final class f {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7825d;

    public f(Resources resources) {
        k.e(resources, "resources");
        String string = resources.getString(R.string.label_open);
        k.d(string, "resources.getString(R.string.label_open)");
        this.a = string;
        String string2 = resources.getString(R.string.label_spaces_close);
        k.d(string2, "resources.getString(R.string.label_spaces_close)");
        this.b = string2;
        String string3 = resources.getString(R.string.label_spaces_allup);
        k.d(string3, "resources.getString(R.string.label_spaces_allup)");
        this.c = string3;
        String string4 = resources.getString(R.string.label_spaces_alldown);
        k.d(string4, "resources.getString(R.string.label_spaces_alldown)");
        this.f7825d = string4;
    }

    private final d b(List<? extends Property> list, IotDeviceIdentifier iotDeviceIdentifier) {
        T t;
        d.a aVar;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t instanceof Property.Binary) {
                break;
            }
        }
        if (!(t instanceof Property.Binary)) {
            t = null;
        }
        Property.Binary binary = (Property.Binary) t;
        if (binary == null || !binary.getWritable()) {
            return null;
        }
        if (!n.d(binary, o.e.f7961e)) {
            return new d.b(binary);
        }
        int i2 = e.a[iotDeviceIdentifier.ordinal()];
        if (i2 == 1) {
            aVar = new d.a(binary.getValue() ? this.b : this.a, binary);
        } else if (i2 != 2) {
            return new d.a(this.a, binary);
        } else {
            aVar = new d.a(binary.getValue() ? this.f7825d : this.c, binary);
        }
        return aVar;
    }

    public final d a(IotDevice iotDevice) {
        k.e(iotDevice, "iotDevice");
        return b(iotDevice.getProperties(), IotDeviceIdentifier.Companion.a(iotDevice));
    }
}
