package com.sensorberg.notifications.sdk.internal.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: ActionDao_Impl */
public final class b extends a {
    private final l a;
    private final androidx.room.e<com.sensorberg.notifications.sdk.internal.model.d> b;
    private final androidx.room.e<m> c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final h f5377d = new h();

    /* renamed from: e  reason: collision with root package name */
    private final androidx.room.e<com.sensorberg.notifications.sdk.internal.model.l> f5378e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.room.e<com.sensorberg.notifications.sdk.internal.model.k> f5379f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.room.e<com.sensorberg.notifications.sdk.internal.model.b> f5380g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.room.e<com.sensorberg.notifications.sdk.internal.model.a> f5381h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.room.d<com.sensorberg.notifications.sdk.internal.model.b> f5382i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.room.d<com.sensorberg.notifications.sdk.internal.model.a> f5383j;

    /* renamed from: k  reason: collision with root package name */
    private final s f5384k;

    /* renamed from: l  reason: collision with root package name */
    private final s f5385l;

    /* renamed from: m  reason: collision with root package name */
    private final s f5386m;

    /* compiled from: ActionDao_Impl */
    class a extends s {
        a(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM table_trigger_action_map";
        }
    }

    /* renamed from: com.sensorberg.notifications.sdk.internal.storage.b$b  reason: collision with other inner class name */
    /* compiled from: ActionDao_Impl */
    class C0173b extends s {
        C0173b(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM table_time_period";
        }
    }

    /* compiled from: ActionDao_Impl */
    class c extends androidx.room.e<com.sensorberg.notifications.sdk.internal.model.d> {
        c(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_action` (`id`,`backendMeta`,`subject`,`body`,`url`,`payload`,`reportImmediately`,`delay`,`deliverAt`,`suppressionTime`,`maxCount`,`silent`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, com.sensorberg.notifications.sdk.internal.model.d dVar) {
            if (dVar.e() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, dVar.e());
            }
            if (dVar.a() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, dVar.a());
            }
            if (dVar.j() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, dVar.j());
            }
            if (dVar.b() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, dVar.b());
            }
            if (dVar.l() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, dVar.l());
            }
            if (dVar.g() == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, dVar.g());
            }
            fVar.bindLong(7, dVar.h() ? 1 : 0);
            fVar.bindLong(8, dVar.c());
            fVar.bindLong(9, dVar.d());
            fVar.bindLong(10, dVar.k());
            fVar.bindLong(11, (long) dVar.f());
            fVar.bindLong(12, dVar.i() ? 1 : 0);
        }
    }

    /* compiled from: ActionDao_Impl */
    class d extends androidx.room.e<m> {
        d(l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_trigger_action_map` (`id`,`triggerId`,`type`,`actionId`,`triggerBackendMeta`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, m mVar) {
            fVar.bindLong(1, mVar.b());
            if (mVar.d() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, mVar.d());
            }
            fVar.bindLong(3, (long) b.this.f5377d.b(mVar.e()));
            if (mVar.a() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, mVar.a());
            }
            if (mVar.c() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, mVar.c());
            }
        }
    }

    /* compiled from: ActionDao_Impl */
    class e extends androidx.room.e<com.sensorberg.notifications.sdk.internal.model.l> {
        e(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_time_period` (`id`,`actionId`,`startsAt`,`endsAt`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, com.sensorberg.notifications.sdk.internal.model.l lVar) {
            fVar.bindLong(1, lVar.c());
            if (lVar.a() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, lVar.a());
            }
            fVar.bindLong(3, lVar.d());
            fVar.bindLong(4, lVar.b());
        }
    }

    /* compiled from: ActionDao_Impl */
    class f extends androidx.room.e<com.sensorberg.notifications.sdk.internal.model.k> {
        f(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_statistics` (`actionId`,`count`,`lastExecuted`) VALUES (?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, com.sensorberg.notifications.sdk.internal.model.k kVar) {
            if (kVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, kVar.a());
            }
            fVar.bindLong(2, (long) kVar.b());
            fVar.bindLong(3, kVar.c());
        }
    }

    /* compiled from: ActionDao_Impl */
    class g extends androidx.room.e<com.sensorberg.notifications.sdk.internal.model.b> {
        g(l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR ABORT INTO `table_action_history` (`actionId`,`timestamp`,`instanceId`,`trigger`,`latitude`,`longitude`,`radius`,`locationTimeStamp`,`actionBackendMeta`,`triggerBackendMeta`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, com.sensorberg.notifications.sdk.internal.model.b bVar) {
            if (bVar.b() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, bVar.b());
            }
            fVar.bindLong(2, bVar.h());
            if (bVar.c() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, bVar.c());
            }
            fVar.bindLong(4, (long) b.this.f5377d.b(bVar.i()));
            if (bVar.d() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindDouble(5, bVar.d().doubleValue());
            }
            if (bVar.f() == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindDouble(6, bVar.f().doubleValue());
            }
            if (bVar.g() == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindDouble(7, (double) bVar.g().floatValue());
            }
            if (bVar.e() == null) {
                fVar.bindNull(8);
            } else {
                fVar.bindLong(8, bVar.e().longValue());
            }
            if (bVar.a() == null) {
                fVar.bindNull(9);
            } else {
                fVar.bindString(9, bVar.a());
            }
            if (bVar.j() == null) {
                fVar.bindNull(10);
            } else {
                fVar.bindString(10, bVar.j());
            }
        }
    }

    /* compiled from: ActionDao_Impl */
    class h extends androidx.room.e<com.sensorberg.notifications.sdk.internal.model.a> {
        h(l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_action_conversion` (`instanceId`,`timestamp`,`value`,`latitude`,`longitude`,`radius`,`locationTimeStamp`) VALUES (?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, com.sensorberg.notifications.sdk.internal.model.a aVar) {
            if (aVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, aVar.a());
            }
            fVar.bindLong(2, aVar.f());
            fVar.bindLong(3, (long) b.this.f5377d.a(aVar.g()));
            if (aVar.b() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindDouble(4, aVar.b().doubleValue());
            }
            if (aVar.d() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindDouble(5, aVar.d().doubleValue());
            }
            if (aVar.e() == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindDouble(6, (double) aVar.e().floatValue());
            }
            if (aVar.c() == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindLong(7, aVar.c().longValue());
            }
        }
    }

    /* compiled from: ActionDao_Impl */
    class i extends androidx.room.d<com.sensorberg.notifications.sdk.internal.model.b> {
        i(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM `table_action_history` WHERE `instanceId` = ?";
        }

        /* renamed from: k */
        public void g(e.s.a.f fVar, com.sensorberg.notifications.sdk.internal.model.b bVar) {
            if (bVar.c() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, bVar.c());
            }
        }
    }

    /* compiled from: ActionDao_Impl */
    class j extends androidx.room.d<com.sensorberg.notifications.sdk.internal.model.a> {
        j(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM `table_action_conversion` WHERE `instanceId` = ?";
        }

        /* renamed from: k */
        public void g(e.s.a.f fVar, com.sensorberg.notifications.sdk.internal.model.a aVar) {
            if (aVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, aVar.a());
            }
        }
    }

    /* compiled from: ActionDao_Impl */
    class k extends s {
        k(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM table_action";
        }
    }

    public b(l lVar) {
        this.a = lVar;
        this.b = new c(this, lVar);
        this.c = new d(lVar);
        this.f5378e = new e(this, lVar);
        this.f5379f = new f(this, lVar);
        this.f5380g = new g(lVar);
        this.f5381h = new h(lVar);
        this.f5382i = new i(this, lVar);
        this.f5383j = new j(this, lVar);
        this.f5384k = new k(this, lVar);
        this.f5385l = new a(this, lVar);
        this.f5386m = new C0173b(this, lVar);
    }

    public void a(List<com.sensorberg.notifications.sdk.internal.model.a> list) {
        this.a.b();
        this.a.c();
        try {
            this.f5383j.i(list);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void b(List<com.sensorberg.notifications.sdk.internal.model.b> list) {
        this.a.b();
        this.a.c();
        try {
            this.f5382i.i(list);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void c() {
        this.a.b();
        e.s.a.f a2 = this.f5384k.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f5384k.f(a2);
        }
    }

    public void d() {
        this.a.b();
        e.s.a.f a2 = this.f5385l.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f5385l.f(a2);
        }
    }

    public void e() {
        this.a.b();
        e.s.a.f a2 = this.f5386m.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f5386m.f(a2);
        }
    }

    public List<com.sensorberg.notifications.sdk.internal.model.a> f() {
        Double d2;
        Double d3;
        Float f2;
        Long l2;
        o h2 = o.h("SELECT * FROM table_action_conversion", 0);
        this.a.b();
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "instanceId");
            int b3 = androidx.room.x.b.b(c2, "timestamp");
            int b4 = androidx.room.x.b.b(c2, "value");
            int b5 = androidx.room.x.b.b(c2, "latitude");
            int b6 = androidx.room.x.b.b(c2, "longitude");
            int b7 = androidx.room.x.b.b(c2, "radius");
            int b8 = androidx.room.x.b.b(c2, "locationTimeStamp");
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string = c2.getString(b2);
                long j2 = c2.getLong(b3);
                g.e.j.a.c d4 = this.f5377d.d(c2.getInt(b4));
                if (c2.isNull(b5)) {
                    d2 = null;
                } else {
                    d2 = Double.valueOf(c2.getDouble(b5));
                }
                if (c2.isNull(b6)) {
                    d3 = null;
                } else {
                    d3 = Double.valueOf(c2.getDouble(b6));
                }
                if (c2.isNull(b7)) {
                    f2 = null;
                } else {
                    f2 = Float.valueOf(c2.getFloat(b7));
                }
                if (c2.isNull(b8)) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(c2.getLong(b8));
                }
                arrayList.add(new com.sensorberg.notifications.sdk.internal.model.a(string, j2, d4, d2, d3, f2, l2));
            }
            return arrayList;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public List<com.sensorberg.notifications.sdk.internal.model.b> g() {
        Double d2;
        Double d3;
        Float f2;
        Long l2;
        o h2 = o.h("SELECT * FROM table_action_history", 0);
        this.a.b();
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "actionId");
            int b3 = androidx.room.x.b.b(c2, "timestamp");
            int b4 = androidx.room.x.b.b(c2, "instanceId");
            int b5 = androidx.room.x.b.b(c2, "trigger");
            int b6 = androidx.room.x.b.b(c2, "latitude");
            int b7 = androidx.room.x.b.b(c2, "longitude");
            int b8 = androidx.room.x.b.b(c2, "radius");
            int b9 = androidx.room.x.b.b(c2, "locationTimeStamp");
            int b10 = androidx.room.x.b.b(c2, "actionBackendMeta");
            int b11 = androidx.room.x.b.b(c2, "triggerBackendMeta");
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                String string = c2.getString(b2);
                long j2 = c2.getLong(b3);
                String string2 = c2.getString(b4);
                Trigger.b e2 = this.f5377d.e(c2.getInt(b5));
                if (c2.isNull(b6)) {
                    d2 = null;
                } else {
                    d2 = Double.valueOf(c2.getDouble(b6));
                }
                if (c2.isNull(b7)) {
                    d3 = null;
                } else {
                    d3 = Double.valueOf(c2.getDouble(b7));
                }
                if (c2.isNull(b8)) {
                    f2 = null;
                } else {
                    f2 = Float.valueOf(c2.getFloat(b8));
                }
                if (c2.isNull(b9)) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(c2.getLong(b9));
                }
                arrayList.add(new com.sensorberg.notifications.sdk.internal.model.b(string, j2, string2, e2, d2, d3, f2, l2, c2.getString(b10), c2.getString(b11)));
            }
            return arrayList;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public List<com.sensorberg.notifications.sdk.internal.model.e> h(String str, long j2, Trigger.b... bVarArr) {
        o oVar;
        String str2 = str;
        Trigger.b[] bVarArr2 = bVarArr;
        StringBuilder b2 = androidx.room.x.e.b();
        b2.append("SELECT ");
        b2.append("table_action.*");
        b2.append(", table_trigger_action_map.triggerBackendMeta FROM table_action INNER JOIN table_trigger_action_map ON table_trigger_action_map.actionId = table_action.id WHERE (table_trigger_action_map.triggerId = ");
        b2.append("?");
        b2.append(") AND (table_trigger_action_map.type IN (");
        int length = bVarArr2.length;
        androidx.room.x.e.a(b2, length);
        b2.append(")) AND (table_action.deliverAt = 0 OR table_action.deliverAt > ");
        b2.append("?");
        b2.append(")");
        int i2 = 2;
        int i3 = length + 2;
        o h2 = o.h(b2.toString(), i3);
        if (str2 == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str2);
        }
        for (Trigger.b b3 : bVarArr2) {
            h2.bindLong(i2, (long) this.f5377d.b(b3));
            i2++;
        }
        h2.bindLong(i3, j2);
        this.a.b();
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b4 = androidx.room.x.b.b(c2, "id");
            int b5 = androidx.room.x.b.b(c2, "backendMeta");
            int b6 = androidx.room.x.b.b(c2, "subject");
            int b7 = androidx.room.x.b.b(c2, "body");
            int b8 = androidx.room.x.b.b(c2, "url");
            int b9 = androidx.room.x.b.b(c2, "payload");
            int b10 = androidx.room.x.b.b(c2, "reportImmediately");
            int b11 = androidx.room.x.b.b(c2, "delay");
            int b12 = androidx.room.x.b.b(c2, "deliverAt");
            int b13 = androidx.room.x.b.b(c2, "suppressionTime");
            int b14 = androidx.room.x.b.b(c2, "maxCount");
            int b15 = androidx.room.x.b.b(c2, "silent");
            int b16 = androidx.room.x.b.b(c2, "triggerBackendMeta");
            oVar = h2;
            try {
                ArrayList arrayList = new ArrayList(c2.getCount());
                while (c2.moveToNext()) {
                    arrayList.add(new com.sensorberg.notifications.sdk.internal.model.e(c2.getString(b4), c2.getString(b5), c2.getString(b6), c2.getString(b7), c2.getString(b8), c2.getString(b9), c2.getInt(b10) != 0, c2.getLong(b11), c2.getLong(b12), c2.getLong(b13), c2.getInt(b14), c2.getString(b16), c2.getInt(b15) != 0));
                }
                c2.close();
                oVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c2.close();
                oVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            c2.close();
            oVar.n();
            throw th;
        }
    }

    public com.sensorberg.notifications.sdk.internal.model.k i(String str) {
        o h2 = o.h("SELECT * FROM table_statistics WHERE actionId = ?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        com.sensorberg.notifications.sdk.internal.model.k kVar = null;
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "actionId");
            int b3 = androidx.room.x.b.b(c2, "count");
            int b4 = androidx.room.x.b.b(c2, "lastExecuted");
            if (c2.moveToFirst()) {
                kVar = new com.sensorberg.notifications.sdk.internal.model.k(c2.getString(b2), c2.getInt(b3), c2.getLong(b4));
            }
            return kVar;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public long j(String str, long j2) {
        o h2 = o.h("SELECT COUNT(*) FROM table_time_period WHERE actionId = ? AND startsAt < ?  AND endsAt > ?", 3);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        h2.bindLong(2, j2);
        h2.bindLong(3, j2);
        this.a.b();
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            return c2.moveToFirst() ? c2.getLong(0) : 0;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public void k(com.sensorberg.notifications.sdk.internal.model.a... aVarArr) {
        this.a.b();
        this.a.c();
        try {
            this.f5381h.j(aVarArr);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void l(com.sensorberg.notifications.sdk.internal.model.b... bVarArr) {
        this.a.b();
        this.a.c();
        try {
            this.f5380g.j(bVarArr);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void m(Collection<com.sensorberg.notifications.sdk.internal.model.d> collection) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(collection);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void n(Collection<m> collection) {
        this.a.b();
        this.a.c();
        try {
            this.c.h(collection);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void o(com.sensorberg.notifications.sdk.internal.model.k... kVarArr) {
        this.a.b();
        this.a.c();
        try {
            this.f5379f.j(kVarArr);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void p(Collection<com.sensorberg.notifications.sdk.internal.model.l> collection) {
        this.a.b();
        this.a.c();
        try {
            this.f5378e.h(collection);
            this.a.x();
        } finally {
            this.a.i();
        }
    }
}
