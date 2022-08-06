package com.sensorberg.smartspaces.backend.storage;

import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import androidx.room.x.c;
import androidx.room.x.f;
import e.s.a.b;
import e.s.a.c;
import java.util.HashMap;
import java.util.HashSet;

public final class BackupDatabase_Impl extends BackupDatabase {

    /* renamed from: n  reason: collision with root package name */
    private volatile a f6155n;
    private volatile c o;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `actuator_requests` (`id` TEXT, `requestId` TEXT NOT NULL, `unitId` TEXT, `connectorId` TEXT, `actuatorId` TEXT, `action` TEXT, `connectorType` TEXT, `actuatorType` TEXT, `createdAt` TEXT, `userDeviceId` TEXT, `state` TEXT, `errorDetails` TEXT, `finished` INTEGER, `timestamp` INTEGER, PRIMARY KEY(`requestId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `statistics` (`id` TEXT, `finished` INTEGER NOT NULL, `started` INTEGER NOT NULL, `requestId` TEXT NOT NULL, `triggerStart` TEXT NOT NULL, `connectionType` TEXT, `triggerFound` TEXT, `retryNumber` INTEGER NOT NULL, `timeSearching` INTEGER, `timeConnecting` INTEGER NOT NULL, `timeWriting` INTEGER, `timeWaiting` INTEGER NOT NULL, `calibratedThreshold` REAL, PRIMARY KEY(`requestId`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f02c806408052460a99104c029dc5c3f')");
        }

        public void b(b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `actuator_requests`");
            bVar.execSQL("DROP TABLE IF EXISTS `statistics`");
            if (BackupDatabase_Impl.this.f1409h != null) {
                int size = BackupDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) BackupDatabase_Impl.this.f1409h.get(i2)).b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(b bVar) {
            if (BackupDatabase_Impl.this.f1409h != null) {
                int size = BackupDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) BackupDatabase_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = BackupDatabase_Impl.this.a = bVar;
            BackupDatabase_Impl.this.r(bVar);
            if (BackupDatabase_Impl.this.f1409h != null) {
                int size = BackupDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) BackupDatabase_Impl.this.f1409h.get(i2)).c(bVar);
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
            HashMap hashMap = new HashMap(14);
            hashMap.put("id", new f.a("id", "TEXT", false, 0, (String) null, 1));
            hashMap.put("requestId", new f.a("requestId", "TEXT", true, 1, (String) null, 1));
            hashMap.put("unitId", new f.a("unitId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("connectorId", new f.a("connectorId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("actuatorId", new f.a("actuatorId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("action", new f.a("action", "TEXT", false, 0, (String) null, 1));
            hashMap.put("connectorType", new f.a("connectorType", "TEXT", false, 0, (String) null, 1));
            hashMap.put("actuatorType", new f.a("actuatorType", "TEXT", false, 0, (String) null, 1));
            hashMap.put("createdAt", new f.a("createdAt", "TEXT", false, 0, (String) null, 1));
            hashMap.put("userDeviceId", new f.a("userDeviceId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("state", new f.a("state", "TEXT", false, 0, (String) null, 1));
            hashMap.put("errorDetails", new f.a("errorDetails", "TEXT", false, 0, (String) null, 1));
            hashMap.put("finished", new f.a("finished", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("timestamp", new f.a("timestamp", "INTEGER", false, 0, (String) null, 1));
            f fVar = new f("actuator_requests", hashMap, new HashSet(0), new HashSet(0));
            f a = f.a(bVar2, "actuator_requests");
            if (!fVar.equals(a)) {
                return new n.b(false, "actuator_requests(com.sensorberg.smartspaces.backend.model.ActuatorRequest).\n Expected:\n" + fVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(13);
            hashMap2.put("id", new f.a("id", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("finished", new f.a("finished", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("started", new f.a("started", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requestId", new f.a("requestId", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("triggerStart", new f.a("triggerStart", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("connectionType", new f.a("connectionType", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("triggerFound", new f.a("triggerFound", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("retryNumber", new f.a("retryNumber", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("timeSearching", new f.a("timeSearching", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("timeConnecting", new f.a("timeConnecting", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("timeWriting", new f.a("timeWriting", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("timeWaiting", new f.a("timeWaiting", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("calibratedThreshold", new f.a("calibratedThreshold", "REAL", false, 0, (String) null, 1));
            f fVar2 = new f("statistics", hashMap2, new HashSet(0), new HashSet(0));
            f a2 = f.a(bVar2, "statistics");
            if (fVar2.equals(a2)) {
                return new n.b(true, (String) null);
            }
            return new n.b(false, "statistics(com.sensorberg.smartspaces.backend.model.Statistics).\n Expected:\n" + fVar2 + "\n Found:\n" + a2);
        }
    }

    public c A() {
        c cVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new d(this);
            }
            cVar = this.o;
        }
        return cVar;
    }

    public void d() {
        super.a();
        b b = super.m().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `actuator_requests`");
            b.execSQL("DELETE FROM `statistics`");
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
        return new i(this, new HashMap(0), new HashMap(0), "actuator_requests", "statistics");
    }

    /* access modifiers changed from: protected */
    public e.s.a.c h(androidx.room.c cVar) {
        n nVar = new n(cVar, new a(2), "f02c806408052460a99104c029dc5c3f", "5d105f55ddefcdbc7ca24e0dc3484ece");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public a z() {
        a aVar;
        if (this.f6155n != null) {
            return this.f6155n;
        }
        synchronized (this) {
            if (this.f6155n == null) {
                this.f6155n = new b(this);
            }
            aVar = this.f6155n;
        }
        return aVar;
    }
}
