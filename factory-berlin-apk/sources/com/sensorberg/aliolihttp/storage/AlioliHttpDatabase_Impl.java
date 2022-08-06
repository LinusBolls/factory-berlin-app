package com.sensorberg.aliolihttp.storage;

import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import androidx.room.x.f;
import e.s.a.b;
import e.s.a.c;
import java.util.HashMap;
import java.util.HashSet;

public final class AlioliHttpDatabase_Impl extends AlioliHttpDatabase {

    /* renamed from: l  reason: collision with root package name */
    private volatile a f4832l;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `alioli_http_request` (`method` TEXT NOT NULL, `url` TEXT NOT NULL, `alioliHttpHeaderList` TEXT NOT NULL, `validUntilMs` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `body` TEXT, `contentType` TEXT)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"aad754b47e46fe5e3c0fe1e2da821d28\")");
        }

        public void b(b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `alioli_http_request`");
        }

        /* access modifiers changed from: protected */
        public void c(b bVar) {
            if (AlioliHttpDatabase_Impl.this.f1409h != null) {
                int size = AlioliHttpDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) AlioliHttpDatabase_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = AlioliHttpDatabase_Impl.this.a = bVar;
            AlioliHttpDatabase_Impl.this.r(bVar);
            if (AlioliHttpDatabase_Impl.this.f1409h != null) {
                int size = AlioliHttpDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) AlioliHttpDatabase_Impl.this.f1409h.get(i2)).c(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(b bVar) {
            HashMap hashMap = new HashMap(7);
            hashMap.put("method", new f.a("method", "TEXT", true, 0));
            hashMap.put("url", new f.a("url", "TEXT", true, 0));
            hashMap.put("alioliHttpHeaderList", new f.a("alioliHttpHeaderList", "TEXT", true, 0));
            hashMap.put("validUntilMs", new f.a("validUntilMs", "INTEGER", true, 0));
            hashMap.put("id", new f.a("id", "INTEGER", true, 1));
            hashMap.put("body", new f.a("body", "TEXT", false, 0));
            hashMap.put("contentType", new f.a("contentType", "TEXT", false, 0));
            f fVar = new f("alioli_http_request", hashMap, new HashSet(0), new HashSet(0));
            f a = f.a(bVar, "alioli_http_request");
            if (!fVar.equals(a)) {
                throw new IllegalStateException("Migration didn't properly handle alioli_http_request(com.sensorberg.aliolihttp.storage.entity.AlioliHttpEntity).\n Expected:\n" + fVar + "\n Found:\n" + a);
            }
        }
    }

    public void d() {
        super.a();
        b b = super.m().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `alioli_http_request`");
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
        return new i(this, "alioli_http_request");
    }

    /* access modifiers changed from: protected */
    public c h(androidx.room.c cVar) {
        n nVar = new n(cVar, new a(1), "aad754b47e46fe5e3c0fe1e2da821d28", "53ce389b72d5bad44f4ce87a3efc4f49");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public a y() {
        a aVar;
        if (this.f4832l != null) {
            return this.f4832l;
        }
        synchronized (this) {
            if (this.f4832l == null) {
                this.f4832l = new b(this);
            }
            aVar = this.f4832l;
        }
        return aVar;
    }
}
