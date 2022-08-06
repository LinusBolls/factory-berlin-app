package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import com.sensorberg.smartworkspace.app.screens.spaces.l;
import com.sensorberg.smartworkspace.app.screens.spaces.n;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: MiniIconWidgetFactory.kt */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7823e = new a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;
    private final Resources c;

    /* renamed from: d  reason: collision with root package name */
    private final l f7824d;

    /* compiled from: MiniIconWidgetFactory.kt */
    public static final class a {
        private a() {
        }

        private final boolean e(Property property, IotDeviceIdentifier iotDeviceIdentifier) {
            return f(property, iotDeviceIdentifier) || g(property, iotDeviceIdentifier) || h(property, iotDeviceIdentifier);
        }

        /* access modifiers changed from: private */
        public final boolean f(Property property, IotDeviceIdentifier iotDeviceIdentifier) {
            return property.getReadable() && !property.getWritable() && iotDeviceIdentifier == IotDeviceIdentifier.SMOKE_DETECTOR && n.d(property, o.a.f7958e);
        }

        /* access modifiers changed from: private */
        public final boolean g(Property property, IotDeviceIdentifier iotDeviceIdentifier) {
            return property.getReadable() && !property.getWritable() && iotDeviceIdentifier == IotDeviceIdentifier.TEMPERATURE && n.d(property, o.h.f7964e);
        }

        /* access modifiers changed from: private */
        public final boolean h(Property property, IotDeviceIdentifier iotDeviceIdentifier) {
            return property.getReadable() && !property.getWritable() && iotDeviceIdentifier == IotDeviceIdentifier.WINDOW && n.d(property, o.e.f7961e);
        }

        public final boolean d(IotDevice iotDevice) {
            k.e(iotDevice, "iotDevice");
            IotDeviceIdentifier a = IotDeviceIdentifier.Companion.a(iotDevice);
            List<Property> properties = iotDevice.getProperties();
            if ((properties instanceof Collection) && properties.isEmpty()) {
                return false;
            }
            for (Property e2 : properties) {
                if (c.f7823e.e(e2, a)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((IotDevice) t).getId(), ((IotDevice) t2).getId());
        }
    }

    public c(Resources resources, l lVar) {
        k.e(resources, "resources");
        k.e(lVar, "iotDeviceIconFactory");
        this.c = resources;
        this.f7824d = lVar;
        String string = resources.getString(R.string.label_spaces_less);
        k.d(string, "resources.getString(R.string.label_spaces_less)");
        this.a = string;
        String string2 = this.c.getString(R.string.label_spaces_more);
        k.d(string2, "resources.getString(R.string.label_spaces_more)");
        this.b = string2;
    }

    private final p.d.a b(IotDevice iotDevice) {
        String str;
        com.sensorberg.smartworkspace.app.screens.spaces.b a2 = this.f7824d.a(iotDevice);
        Integer b2 = a2.b();
        if (b2 == null || (str = this.c.getString(b2.intValue())) == null) {
            str = "";
        }
        String id = iotDevice.getId();
        Drawable drawable = this.c.getDrawable(a2.a(), (Resources.Theme) null);
        k.d(drawable, "resources.getDrawable(io…n.getDrawableRes(), null)");
        return new p.d.a(id, drawable, str, IotDeviceIdentifier.SMOKE_DETECTOR);
    }

    private final p.d.a c(IotDevice iotDevice) {
        com.sensorberg.smartworkspace.app.screens.spaces.b a2 = this.f7824d.a(iotDevice);
        Property.Numeric c2 = n.c(iotDevice.getProperties(), o.h.f7964e);
        String id = iotDevice.getId();
        Float f2 = null;
        Drawable drawable = this.c.getDrawable(a2.a(), (Resources.Theme) null);
        k.d(drawable, "resources.getDrawable(io…n.getDrawableRes(), null)");
        StringBuilder sb = new StringBuilder();
        if (c2 != null) {
            f2 = Float.valueOf(c2.getValue());
        }
        sb.append(f2);
        sb.append(' ');
        sb.append(o.h.f7964e.c());
        return new p.d.a(id, drawable, sb.toString(), IotDeviceIdentifier.TEMPERATURE);
    }

    private final p.d.a d(IotDevice iotDevice) {
        String str;
        com.sensorberg.smartworkspace.app.screens.spaces.b a2 = this.f7824d.a(iotDevice);
        Integer b2 = a2.b();
        if (b2 == null || (str = this.c.getString(b2.intValue())) == null) {
            str = "";
        }
        String id = iotDevice.getId();
        Drawable drawable = this.c.getDrawable(a2.a(), (Resources.Theme) null);
        k.d(drawable, "resources.getDrawable(io…n.getDrawableRes(), null)");
        return new p.d.a(id, drawable, str, IotDeviceIdentifier.WINDOW);
    }

    private final boolean e(IotDevice iotDevice) {
        IotDeviceIdentifier a2 = IotDeviceIdentifier.Companion.a(iotDevice);
        List<Property> properties = iotDevice.getProperties();
        if ((properties instanceof Collection) && properties.isEmpty()) {
            return false;
        }
        for (Property a3 : properties) {
            if (f7823e.f(a3, a2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(IotDevice iotDevice) {
        IotDeviceIdentifier a2 = IotDeviceIdentifier.Companion.a(iotDevice);
        List<Property> properties = iotDevice.getProperties();
        if ((properties instanceof Collection) && properties.isEmpty()) {
            return false;
        }
        for (Property b2 : properties) {
            if (f7823e.g(b2, a2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean g(IotDevice iotDevice) {
        IotDeviceIdentifier a2 = IotDeviceIdentifier.Companion.a(iotDevice);
        List<Property> properties = iotDevice.getProperties();
        if ((properties instanceof Collection) && properties.isEmpty()) {
            return false;
        }
        for (Property c2 : properties) {
            if (f7823e.h(c2, a2)) {
                return true;
            }
        }
        return false;
    }

    public final List<p.d> a(List<IotDevice> list, int i2, Boolean bool) {
        p.d.b bVar;
        p.d.a aVar;
        k.e(list, "iotDevices");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (f7823e.d((IotDevice) next)) {
                arrayList.add(next);
            }
        }
        List<IotDevice> N = v.N(arrayList, new b());
        if (N.isEmpty()) {
            return n.g();
        }
        if (!(N.size() > i2)) {
            bVar = null;
        } else if (k.a(bool, Boolean.TRUE)) {
            bVar = new p.d.b(this.a);
        } else {
            N = v.P(N, i2 - 1);
            bVar = new p.d.b(this.b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (IotDevice iotDevice : N) {
            if (e(iotDevice)) {
                aVar = b(iotDevice);
            } else if (f(iotDevice)) {
                aVar = c(iotDevice);
            } else {
                aVar = g(iotDevice) ? d(iotDevice) : null;
            }
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        if (bVar != null) {
            arrayList2.add(bVar);
        }
        return arrayList2;
    }
}
