package com.sensorberg.notifications.sdk.internal.storage;

import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import androidx.room.x.c;
import androidx.room.x.f;
import e.s.a.b;
import e.s.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class SdkDatabase_Impl extends SdkDatabase {

    /* renamed from: m  reason: collision with root package name */
    private volatile j f5375m;

    /* renamed from: n  reason: collision with root package name */
    private volatile a f5376n;
    private volatile l o;
    private volatile c p;
    private volatile e q;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_action` (`id` TEXT NOT NULL, `backendMeta` TEXT, `subject` TEXT, `body` TEXT, `url` TEXT, `payload` TEXT, `reportImmediately` INTEGER NOT NULL, `delay` INTEGER NOT NULL, `deliverAt` INTEGER NOT NULL, `suppressionTime` INTEGER NOT NULL, `maxCount` INTEGER NOT NULL, `silent` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_action_history` (`actionId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `instanceId` TEXT NOT NULL, `trigger` INTEGER NOT NULL, `latitude` REAL, `longitude` REAL, `radius` REAL, `locationTimeStamp` INTEGER, `actionBackendMeta` TEXT, `triggerBackendMeta` TEXT, PRIMARY KEY(`instanceId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_action_conversion` (`instanceId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `value` INTEGER NOT NULL, `latitude` REAL, `longitude` REAL, `radius` REAL, `locationTimeStamp` INTEGER, PRIMARY KEY(`instanceId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_trigger_action_map` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `triggerId` TEXT NOT NULL, `type` INTEGER NOT NULL, `actionId` TEXT NOT NULL, `triggerBackendMeta` TEXT)");
            bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_table_trigger_action_map_triggerId` ON `table_trigger_action_map` (`triggerId`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_geofence` (`id` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `radius` REAL NOT NULL, `type` INTEGER NOT NULL, `sin_lat_rad` REAL NOT NULL, `sin_lon_rad` REAL NOT NULL, `cos_lat_rad` REAL NOT NULL, `cos_lon_rad` REAL NOT NULL, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_statistics` (`actionId` TEXT NOT NULL, `count` INTEGER NOT NULL, `lastExecuted` INTEGER NOT NULL, PRIMARY KEY(`actionId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_time_period` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `actionId` TEXT NOT NULL, `startsAt` INTEGER NOT NULL, `endsAt` INTEGER NOT NULL)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_registered_geofences` (`id` TEXT NOT NULL, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_beacon_events` (`beaconKey` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `proximityUuid` TEXT NOT NULL, `major` INTEGER NOT NULL, `minor` INTEGER NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`beaconKey`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_visible_beacons` (`id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_beacons_registration` (`id` TEXT NOT NULL, `proximityUuid` TEXT NOT NULL, `major` INTEGER NOT NULL, `minor` INTEGER NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_delayed_actions` (`actionId` TEXT NOT NULL, `instanceId` TEXT NOT NULL, `subject` TEXT, `body` TEXT, `url` TEXT, `payload` TEXT, `backendMeta` TEXT, `triggerBackendMeta` TEXT, PRIMARY KEY(`instanceId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b4f50e5f5be19fa2180f099bf69e9de6')");
        }

        public void b(b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `table_action`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_action_history`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_action_conversion`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_trigger_action_map`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_geofence`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_statistics`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_time_period`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_registered_geofences`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_beacon_events`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_visible_beacons`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_beacons_registration`");
            bVar.execSQL("DROP TABLE IF EXISTS `table_delayed_actions`");
            if (SdkDatabase_Impl.this.f1409h != null) {
                int size = SdkDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) SdkDatabase_Impl.this.f1409h.get(i2)).b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(b bVar) {
            if (SdkDatabase_Impl.this.f1409h != null) {
                int size = SdkDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) SdkDatabase_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = SdkDatabase_Impl.this.a = bVar;
            SdkDatabase_Impl.this.r(bVar);
            if (SdkDatabase_Impl.this.f1409h != null) {
                int size = SdkDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) SdkDatabase_Impl.this.f1409h.get(i2)).c(bVar);
                }
            }
        }

        public void e(b bVar) {
        }

        public void f(b bVar) {
            c.a(bVar);
        }

        /* access modifiers changed from: protected */
        public n.b g(b bVar) {
            b bVar2 = bVar;
            HashMap hashMap = new HashMap(12);
            hashMap.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("backendMeta", new f.a("backendMeta", "TEXT", false, 0, (String) null, 1));
            hashMap.put("subject", new f.a("subject", "TEXT", false, 0, (String) null, 1));
            hashMap.put("body", new f.a("body", "TEXT", false, 0, (String) null, 1));
            hashMap.put("url", new f.a("url", "TEXT", false, 0, (String) null, 1));
            hashMap.put("payload", new f.a("payload", "TEXT", false, 0, (String) null, 1));
            hashMap.put("reportImmediately", new f.a("reportImmediately", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("delay", new f.a("delay", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("deliverAt", new f.a("deliverAt", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("suppressionTime", new f.a("suppressionTime", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("maxCount", new f.a("maxCount", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("silent", new f.a("silent", "INTEGER", true, 0, (String) null, 1));
            f fVar = new f("table_action", hashMap, new HashSet(0), new HashSet(0));
            f a = f.a(bVar2, "table_action");
            if (!fVar.equals(a)) {
                return new n.b(false, "table_action(com.sensorberg.notifications.sdk.internal.model.ActionModel).\n Expected:\n" + fVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(10);
            hashMap2.put("actionId", new f.a("actionId", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("timestamp", new f.a("timestamp", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("instanceId", new f.a("instanceId", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("trigger", new f.a("trigger", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("latitude", new f.a("latitude", "REAL", false, 0, (String) null, 1));
            hashMap2.put("longitude", new f.a("longitude", "REAL", false, 0, (String) null, 1));
            hashMap2.put("radius", new f.a("radius", "REAL", false, 0, (String) null, 1));
            Object obj = "backendMeta";
            hashMap2.put("locationTimeStamp", new f.a("locationTimeStamp", "INTEGER", false, 0, (String) null, 1));
            Object obj2 = "payload";
            hashMap2.put("actionBackendMeta", new f.a("actionBackendMeta", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("triggerBackendMeta", new f.a("triggerBackendMeta", "TEXT", false, 0, (String) null, 1));
            Object obj3 = "url";
            Object obj4 = "body";
            Object obj5 = "subject";
            f fVar2 = new f("table_action_history", hashMap2, new HashSet(0), new HashSet(0));
            f a2 = f.a(bVar2, "table_action_history");
            if (!fVar2.equals(a2)) {
                return new n.b(false, "table_action_history(com.sensorberg.notifications.sdk.internal.model.ActionHistory).\n Expected:\n" + fVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(7);
            hashMap3.put("instanceId", new f.a("instanceId", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("timestamp", new f.a("timestamp", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("value", new f.a("value", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("latitude", new f.a("latitude", "REAL", false, 0, (String) null, 1));
            hashMap3.put("longitude", new f.a("longitude", "REAL", false, 0, (String) null, 1));
            hashMap3.put("radius", new f.a("radius", "REAL", false, 0, (String) null, 1));
            hashMap3.put("locationTimeStamp", new f.a("locationTimeStamp", "INTEGER", false, 0, (String) null, 1));
            f fVar3 = new f("table_action_conversion", hashMap3, new HashSet(0), new HashSet(0));
            f a3 = f.a(bVar2, "table_action_conversion");
            if (!fVar3.equals(a3)) {
                return new n.b(false, "table_action_conversion(com.sensorberg.notifications.sdk.internal.model.ActionConversion).\n Expected:\n" + fVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(5);
            hashMap4.put("id", new f.a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap4.put("triggerId", new f.a("triggerId", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("type", new f.a("type", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("actionId", new f.a("actionId", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("triggerBackendMeta", new f.a("triggerBackendMeta", "TEXT", false, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            Object obj6 = "triggerBackendMeta";
            Object obj7 = "instanceId";
            hashSet2.add(new f.d("index_table_trigger_action_map_triggerId", false, Arrays.asList(new String[]{"triggerId"})));
            f fVar4 = new f("table_trigger_action_map", hashMap4, hashSet, hashSet2);
            f a4 = f.a(bVar2, "table_trigger_action_map");
            if (!fVar4.equals(a4)) {
                return new n.b(false, "table_trigger_action_map(com.sensorberg.notifications.sdk.internal.model.TriggerActionMap).\n Expected:\n" + fVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(9);
            hashMap5.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("latitude", new f.a("latitude", "REAL", true, 0, (String) null, 1));
            hashMap5.put("longitude", new f.a("longitude", "REAL", true, 0, (String) null, 1));
            hashMap5.put("radius", new f.a("radius", "REAL", true, 0, (String) null, 1));
            hashMap5.put("type", new f.a("type", "INTEGER", true, 0, (String) null, 1));
            hashMap5.put("sin_lat_rad", new f.a("sin_lat_rad", "REAL", true, 0, (String) null, 1));
            hashMap5.put("sin_lon_rad", new f.a("sin_lon_rad", "REAL", true, 0, (String) null, 1));
            hashMap5.put("cos_lat_rad", new f.a("cos_lat_rad", "REAL", true, 0, (String) null, 1));
            hashMap5.put("cos_lon_rad", new f.a("cos_lon_rad", "REAL", true, 0, (String) null, 1));
            f fVar5 = new f("table_geofence", hashMap5, new HashSet(0), new HashSet(0));
            f a5 = f.a(bVar2, "table_geofence");
            if (!fVar5.equals(a5)) {
                return new n.b(false, "table_geofence(com.sensorberg.notifications.sdk.internal.model.GeofenceQuery).\n Expected:\n" + fVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(3);
            hashMap6.put("actionId", new f.a("actionId", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("count", new f.a("count", "INTEGER", true, 0, (String) null, 1));
            hashMap6.put("lastExecuted", new f.a("lastExecuted", "INTEGER", true, 0, (String) null, 1));
            f fVar6 = new f("table_statistics", hashMap6, new HashSet(0), new HashSet(0));
            f a6 = f.a(bVar2, "table_statistics");
            if (!fVar6.equals(a6)) {
                return new n.b(false, "table_statistics(com.sensorberg.notifications.sdk.internal.model.Statistics).\n Expected:\n" + fVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(4);
            hashMap7.put("id", new f.a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap7.put("actionId", new f.a("actionId", "TEXT", true, 0, (String) null, 1));
            hashMap7.put("startsAt", new f.a("startsAt", "INTEGER", true, 0, (String) null, 1));
            hashMap7.put("endsAt", new f.a("endsAt", "INTEGER", true, 0, (String) null, 1));
            f fVar7 = new f("table_time_period", hashMap7, new HashSet(0), new HashSet(0));
            f a7 = f.a(bVar2, "table_time_period");
            if (!fVar7.equals(a7)) {
                return new n.b(false, "table_time_period(com.sensorberg.notifications.sdk.internal.model.TimePeriod).\n Expected:\n" + fVar7 + "\n Found:\n" + a7);
            }
            HashMap hashMap8 = new HashMap(1);
            hashMap8.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            f fVar8 = new f("table_registered_geofences", hashMap8, new HashSet(0), new HashSet(0));
            f a8 = f.a(bVar2, "table_registered_geofences");
            if (!fVar8.equals(a8)) {
                return new n.b(false, "table_registered_geofences(com.sensorberg.notifications.sdk.internal.model.RegisteredGeoFence).\n Expected:\n" + fVar8 + "\n Found:\n" + a8);
            }
            HashMap hashMap9 = new HashMap(6);
            hashMap9.put("beaconKey", new f.a("beaconKey", "TEXT", true, 1, (String) null, 1));
            hashMap9.put("timestamp", new f.a("timestamp", "INTEGER", true, 0, (String) null, 1));
            hashMap9.put("proximityUuid", new f.a("proximityUuid", "TEXT", true, 0, (String) null, 1));
            hashMap9.put("major", new f.a("major", "INTEGER", true, 0, (String) null, 1));
            hashMap9.put("minor", new f.a("minor", "INTEGER", true, 0, (String) null, 1));
            hashMap9.put("type", new f.a("type", "INTEGER", true, 0, (String) null, 1));
            f fVar9 = new f("table_beacon_events", hashMap9, new HashSet(0), new HashSet(0));
            f a9 = f.a(bVar2, "table_beacon_events");
            if (!fVar9.equals(a9)) {
                return new n.b(false, "table_beacon_events(com.sensorberg.notifications.sdk.internal.model.BeaconEvent).\n Expected:\n" + fVar9 + "\n Found:\n" + a9);
            }
            HashMap hashMap10 = new HashMap(2);
            hashMap10.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap10.put("timestamp", new f.a("timestamp", "INTEGER", true, 0, (String) null, 1));
            f fVar10 = new f("table_visible_beacons", hashMap10, new HashSet(0), new HashSet(0));
            f a10 = f.a(bVar2, "table_visible_beacons");
            if (!fVar10.equals(a10)) {
                return new n.b(false, "table_visible_beacons(com.sensorberg.notifications.sdk.internal.model.VisibleBeacons).\n Expected:\n" + fVar10 + "\n Found:\n" + a10);
            }
            HashMap hashMap11 = new HashMap(5);
            hashMap11.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap11.put("proximityUuid", new f.a("proximityUuid", "TEXT", true, 0, (String) null, 1));
            hashMap11.put("major", new f.a("major", "INTEGER", true, 0, (String) null, 1));
            hashMap11.put("minor", new f.a("minor", "INTEGER", true, 0, (String) null, 1));
            hashMap11.put("type", new f.a("type", "INTEGER", true, 0, (String) null, 1));
            f fVar11 = new f("table_beacons_registration", hashMap11, new HashSet(0), new HashSet(0));
            f a11 = f.a(bVar2, "table_beacons_registration");
            if (!fVar11.equals(a11)) {
                return new n.b(false, "table_beacons_registration(com.sensorberg.notifications.sdk.internal.model.BeaconStorage).\n Expected:\n" + fVar11 + "\n Found:\n" + a11);
            }
            HashMap hashMap12 = new HashMap(8);
            hashMap12.put("actionId", new f.a("actionId", "TEXT", true, 0, (String) null, 1));
            hashMap12.put(obj7, new f.a("instanceId", "TEXT", true, 1, (String) null, 1));
            hashMap12.put(obj5, new f.a("subject", "TEXT", false, 0, (String) null, 1));
            hashMap12.put(obj4, new f.a("body", "TEXT", false, 0, (String) null, 1));
            hashMap12.put(obj3, new f.a("url", "TEXT", false, 0, (String) null, 1));
            hashMap12.put(obj2, new f.a("payload", "TEXT", false, 0, (String) null, 1));
            hashMap12.put(obj, new f.a("backendMeta", "TEXT", false, 0, (String) null, 1));
            hashMap12.put(obj6, new f.a("triggerBackendMeta", "TEXT", false, 0, (String) null, 1));
            f fVar12 = new f("table_delayed_actions", hashMap12, new HashSet(0), new HashSet(0));
            f a12 = f.a(bVar2, "table_delayed_actions");
            if (fVar12.equals(a12)) {
                return new n.b(true, (String) null);
            }
            return new n.b(false, "table_delayed_actions(com.sensorberg.notifications.sdk.internal.model.DelayedActionModel).\n Expected:\n" + fVar12 + "\n Found:\n" + a12);
        }
    }

    public e A() {
        e eVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new f(this);
            }
            eVar = this.q;
        }
        return eVar;
    }

    public j B() {
        j jVar;
        if (this.f5375m != null) {
            return this.f5375m;
        }
        synchronized (this) {
            if (this.f5375m == null) {
                this.f5375m = new k(this);
            }
            jVar = this.f5375m;
        }
        return jVar;
    }

    public l C() {
        l lVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new m(this);
            }
            lVar = this.o;
        }
        return lVar;
    }

    public void d() {
        super.a();
        b b = super.m().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `table_action`");
            b.execSQL("DELETE FROM `table_action_history`");
            b.execSQL("DELETE FROM `table_action_conversion`");
            b.execSQL("DELETE FROM `table_trigger_action_map`");
            b.execSQL("DELETE FROM `table_geofence`");
            b.execSQL("DELETE FROM `table_statistics`");
            b.execSQL("DELETE FROM `table_time_period`");
            b.execSQL("DELETE FROM `table_registered_geofences`");
            b.execSQL("DELETE FROM `table_beacon_events`");
            b.execSQL("DELETE FROM `table_visible_beacons`");
            b.execSQL("DELETE FROM `table_beacons_registration`");
            b.execSQL("DELETE FROM `table_delayed_actions`");
            super.x();
        } finally {
            super.i();
            b.x0("PRAGMA wal_checkpoint(FULL)").close();
            if (!b.inTransaction()) {
                b.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public i g() {
        return new i(this, new HashMap(0), new HashMap(0), "table_action", "table_action_history", "table_action_conversion", "table_trigger_action_map", "table_geofence", "table_statistics", "table_time_period", "table_registered_geofences", "table_beacon_events", "table_visible_beacons", "table_beacons_registration", "table_delayed_actions");
    }

    /* access modifiers changed from: protected */
    public e.s.a.c h(androidx.room.c cVar) {
        n nVar = new n(cVar, new a(2), "b4f50e5f5be19fa2180f099bf69e9de6", "9e8eb1639f4a866f7270a5293fc70d2c");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public a y() {
        a aVar;
        if (this.f5376n != null) {
            return this.f5376n;
        }
        synchronized (this) {
            if (this.f5376n == null) {
                this.f5376n = new b(this);
            }
            aVar = this.f5376n;
        }
        return aVar;
    }

    public c z() {
        c cVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new d(this);
            }
            cVar = this.p;
        }
        return cVar;
    }
}
