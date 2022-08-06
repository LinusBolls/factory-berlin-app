package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.content.res.Resources;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import com.sensorberg.smartworkspace.app.screens.spaces.b;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.d;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import com.sensorberg.smartworkspace.app.screens.spaces.l;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.j;
import kotlin.jvm.internal.k;

/* compiled from: RowWidgetFactory.kt */
public final class g {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7826d;

    /* renamed from: e  reason: collision with root package name */
    private final f f7827e;

    /* renamed from: f  reason: collision with root package name */
    private final o f7828f;

    /* renamed from: g  reason: collision with root package name */
    private final l f7829g;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((IotDevice) t).getId(), ((IotDevice) t2).getId());
        }
    }

    public g(f fVar, o oVar, l lVar, Resources resources) {
        k.e(fVar, "quickActionFactory");
        k.e(oVar, "statusFactory");
        k.e(lVar, "iotDeviceIconFactory");
        k.e(resources, "resources");
        this.f7827e = fVar;
        this.f7828f = oVar;
        this.f7829g = lVar;
        String string = resources.getString(R.string.label_iotdevice_angle);
        k.d(string, "resources.getString(R.st…ng.label_iotdevice_angle)");
        this.a = string;
        String string2 = resources.getString(R.string.label_iotdevice_intensity);
        k.d(string2, "resources.getString(R.st…abel_iotdevice_intensity)");
        this.b = string2;
        String string3 = resources.getString(R.string.label_iotdevice_position);
        k.d(string3, "resources.getString(R.st…label_iotdevice_position)");
        this.c = string3;
        String string4 = resources.getString(R.string.label_iotdevice_temperature);
        k.d(string4, "resources.getString(R.st…el_iotdevice_temperature)");
        this.f7826d = string4;
    }

    private final p.e a(IotDevice iotDevice, String str, String str2, String str3, boolean z, IotDeviceIdentifier iotDeviceIdentifier) {
        IotDevice iotDevice2 = iotDevice;
        b a2 = this.f7829g.a(iotDevice2);
        d a3 = this.f7827e.a(iotDevice2);
        if (a3 instanceof d.b) {
            return new p.e.d(iotDevice, ((d.b) a3).a(), str, str2, a2, str3, z, iotDeviceIdentifier, false, 256, (DefaultConstructorMarker) null);
        } else if (!(a3 instanceof d.a)) {
            return new p.e.a(str, str2, a2, str3, z, iotDeviceIdentifier);
        } else {
            d.a aVar = (d.a) a3;
            return new p.e.b(iotDevice, aVar.a(), str, str2, a2, str3, aVar.b(), z, iotDeviceIdentifier, false, 512, (DefaultConstructorMarker) null);
        }
    }

    private final List<p> b(IotDevice iotDevice) {
        List<Property> properties = iotDevice.getProperties();
        ArrayList arrayList = new ArrayList();
        for (Property f2 : properties) {
            p f3 = f(f2, iotDevice);
            if (f3 != null) {
                arrayList.add(f3);
            }
        }
        return arrayList;
    }

    private final List<p> c(IotDevice iotDevice, String str) {
        ArrayList arrayList = new ArrayList();
        String id = iotDevice.getId();
        String name = iotDevice.getName();
        String b2 = this.f7828f.b(iotDevice);
        List<p> b3 = b(iotDevice);
        boolean z = !b3.isEmpty();
        IotDeviceIdentifier a2 = IotDeviceIdentifier.Companion.a(iotDevice);
        arrayList.add(a(iotDevice, id, name, b2, z, a2));
        if (!k.a(str, id)) {
            arrayList.add(new p.g());
            return arrayList;
        }
        if (z) {
            arrayList.add(p.b.b.a(id));
            arrayList.addAll(b3);
            arrayList.add(p.a.f7865e.a(id, name, a2));
        }
        arrayList.add(new p.g());
        return arrayList;
    }

    private final p e(Property property, IotDevice iotDevice) {
        j jVar;
        Property.Numeric numeric = (Property.Numeric) (!(property instanceof Property.Numeric) ? null : property);
        if (numeric == null || !numeric.getReadable() || !numeric.getWritable()) {
            return null;
        }
        o a2 = o.f7957d.a(numeric);
        if (a2 instanceof o.b) {
            jVar = new j(this.a, "°");
        } else if (a2 instanceof o.d) {
            jVar = new j(this.b, "%");
        } else if (a2 instanceof o.f) {
            jVar = new j(this.c, "%");
        } else if (a2 instanceof o.h) {
            jVar = new j(this.f7826d, "°C");
        } else {
            jVar = new j(property.getKind(), "");
        }
        String str = (String) jVar.a();
        com.sensorberg.smartworkspace.app.utils.k kVar = new com.sensorberg.smartworkspace.app.utils.k(numeric.getMinValue(), numeric.getMaxValue());
        return new p.f(iotDevice, numeric, iotDevice.getId() + '_' + str, str, false, kVar, (String) jVar.b());
    }

    private final p f(Property property, IotDevice iotDevice) {
        return e(property, iotDevice);
    }

    public final List<p> d(List<IotDevice> list, String str) {
        k.e(list, "iotDevices");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!c.f7823e.d((IotDevice) next)) {
                arrayList.add(next);
            }
        }
        List<IotDevice> N = v.N(arrayList, new a());
        ArrayList arrayList2 = new ArrayList();
        for (IotDevice c2 : N) {
            boolean unused = s.s(arrayList2, c(c2, str));
        }
        return arrayList2;
    }
}
