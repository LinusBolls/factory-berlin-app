package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import g.b.a.b.c.e.a0;
import java.util.ArrayList;
import java.util.List;

public class f {
    private final int a;
    private final int b;
    private final List<b> c;

    private f(int i2, int i3, List<b> list, Location location) {
        this.a = i2;
        this.b = i3;
        this.c = list;
    }

    public static f a(Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i2 = -1;
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i2 = intExtra2;
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                arrayList.add(a0.l((byte[]) obj));
            }
        }
        return new f(intExtra, i2, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public List<b> d() {
        return this.c;
    }

    public boolean e() {
        return this.a != -1;
    }
}
