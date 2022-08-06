package com.sensorberg.notifications.sdk.internal.storage;

import android.location.Location;
import com.sensorberg.notifications.sdk.internal.model.i;
import com.sensorberg.notifications.sdk.internal.model.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: GeofenceDao.kt */
public abstract class l {
    public void a(List<j> list) {
        b();
        if (list != null) {
            i(list);
        }
    }

    public abstract void b();

    public abstract void c();

    public final List<i> d(Location location) {
        k.f(location, "location");
        double d2 = (double) 180;
        return e(Math.sin((location.getLatitude() * 3.141592653589793d) / d2), Math.cos((location.getLatitude() * 3.141592653589793d) / d2), Math.sin((location.getLongitude() * 3.141592653589793d) / d2), Math.cos((location.getLongitude() * 3.141592653589793d) / d2));
    }

    public abstract List<i> e(double d2, double d3, double d4, double d5);

    public p f(Location location) {
        k.f(location, "location");
        List<i> d2 = d(location);
        float f2 = 300.0f;
        for (i iVar : d2) {
            Location location2 = new Location("");
            location2.setLatitude(iVar.d());
            location2.setLongitude(iVar.e());
            f2 = Math.max(f2, location.distanceTo(location2));
        }
        ArrayList arrayList = new ArrayList(o.p(d2, 10));
        for (i c : d2) {
            arrayList.add(c.c());
        }
        List<j> g2 = g(arrayList);
        ArrayList arrayList2 = new ArrayList(o.p(g2, 10));
        for (j a : g2) {
            arrayList2.add(a.a());
        }
        ArrayList arrayList3 = new ArrayList(o.p(d2, 10));
        for (i b : d2) {
            arrayList3.add(o.a.b(b));
        }
        return new p(arrayList3, f2, arrayList2);
    }

    public abstract List<j> g(List<String> list);

    public abstract void h(List<i> list);

    public abstract void i(List<j> list);
}
