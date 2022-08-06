package com.sensorberg.notifications.sdk.internal.storage;

import android.database.Cursor;
import android.location.Location;
import android.os.CancellationSignal;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import com.sensorberg.notifications.sdk.internal.model.i;
import com.sensorberg.notifications.sdk.internal.model.j;
import e.s.a.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GeofenceDao_Impl */
public final class m extends l {
    private final l a;
    private final e<i> b;
    /* access modifiers changed from: private */
    public final h c = new h();

    /* renamed from: d  reason: collision with root package name */
    private final e<j> f5399d;

    /* renamed from: e  reason: collision with root package name */
    private final s f5400e;

    /* renamed from: f  reason: collision with root package name */
    private final s f5401f;

    /* compiled from: GeofenceDao_Impl */
    class a extends e<i> {
        a(l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_geofence` (`id`,`latitude`,`longitude`,`radius`,`type`,`sin_lat_rad`,`sin_lon_rad`,`cos_lat_rad`,`cos_lon_rad`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, i iVar) {
            if (iVar.c() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, iVar.c());
            }
            fVar.bindDouble(2, iVar.d());
            fVar.bindDouble(3, iVar.e());
            fVar.bindDouble(4, (double) iVar.f());
            fVar.bindLong(5, (long) m.this.c.b(iVar.i()));
            fVar.bindDouble(6, iVar.g());
            fVar.bindDouble(7, iVar.h());
            fVar.bindDouble(8, iVar.a());
            fVar.bindDouble(9, iVar.b());
        }
    }

    /* compiled from: GeofenceDao_Impl */
    class b extends e<j> {
        b(m mVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_registered_geofences` (`id`) VALUES (?)";
        }

        /* renamed from: l */
        public void g(f fVar, j jVar) {
            if (jVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, jVar.a());
            }
        }
    }

    /* compiled from: GeofenceDao_Impl */
    class c extends s {
        c(m mVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM table_geofence";
        }
    }

    /* compiled from: GeofenceDao_Impl */
    class d extends s {
        d(m mVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM table_registered_geofences";
        }
    }

    public m(l lVar) {
        this.a = lVar;
        this.b = new a(lVar);
        this.f5399d = new b(this, lVar);
        this.f5400e = new c(this, lVar);
        this.f5401f = new d(this, lVar);
    }

    public void a(List<j> list) {
        this.a.c();
        try {
            super.a(list);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void b() {
        this.a.b();
        f a2 = this.f5401f.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f5401f.f(a2);
        }
    }

    public void c() {
        this.a.b();
        f a2 = this.f5400e.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f5400e.f(a2);
        }
    }

    public List<i> e(double d2, double d3, double d4, double d5) {
        o h2 = o.h("SELECT *, (? * sin_lat_rad + ? * cos_lat_rad * (? * sin_lon_rad + ? * cos_lon_rad)) AS \"distance_acos\" FROM table_geofence ORDER BY \"distance_acos\" DESC LIMIT 99", 4);
        h2.bindDouble(1, d2);
        h2.bindDouble(2, d3);
        h2.bindDouble(3, d4);
        h2.bindDouble(4, d5);
        this.a.b();
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "id");
            int b3 = androidx.room.x.b.b(c2, "latitude");
            int b4 = androidx.room.x.b.b(c2, "longitude");
            int b5 = androidx.room.x.b.b(c2, "radius");
            int b6 = androidx.room.x.b.b(c2, "type");
            int b7 = androidx.room.x.b.b(c2, "sin_lat_rad");
            int b8 = androidx.room.x.b.b(c2, "sin_lon_rad");
            int b9 = androidx.room.x.b.b(c2, "cos_lat_rad");
            int b10 = androidx.room.x.b.b(c2, "cos_lon_rad");
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(new i(c2.getString(b2), c2.getDouble(b3), c2.getDouble(b4), c2.getFloat(b5), this.c.e(c2.getInt(b6)), c2.getDouble(b7), c2.getDouble(b8), c2.getDouble(b9), c2.getDouble(b10)));
            }
            return arrayList;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public p f(Location location) {
        this.a.c();
        try {
            p l2 = super.f(location);
            this.a.x();
            return l2;
        } finally {
            this.a.i();
        }
    }

    public List<j> g(List<String> list) {
        StringBuilder b2 = androidx.room.x.e.b();
        b2.append("SELECT ");
        b2.append("*");
        b2.append(" FROM table_registered_geofences WHERE id NOT IN (");
        int size = list.size();
        androidx.room.x.e.a(b2, size);
        b2.append(")");
        o h2 = o.h(b2.toString(), size + 0);
        int i2 = 1;
        for (String next : list) {
            if (next == null) {
                h2.bindNull(i2);
            } else {
                h2.bindString(i2, next);
            }
            i2++;
        }
        this.a.b();
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b3 = androidx.room.x.b.b(c2, "id");
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(new j(c2.getString(b3)));
            }
            return arrayList;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public void h(List<i> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(list);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void i(List<j> list) {
        this.a.b();
        this.a.c();
        try {
            this.f5399d.h(list);
            this.a.x();
        } finally {
            this.a.i();
        }
    }
}
