package com.sensorberg.smartspaces.myrenz.storage;

import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import androidx.room.x.c;
import androidx.room.x.f;
import e.s.a.b;
import e.s.a.c;
import java.util.HashMap;
import java.util.HashSet;

public final class MyRenzDatabase_Impl extends MyRenzDatabase {

    /* renamed from: l  reason: collision with root package name */
    private volatile a f6156l;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `pka_table` (`macAddress` TEXT NOT NULL, `pkaId` TEXT NOT NULL, PRIMARY KEY(`macAddress`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a39c51dfb7a453427b003a9105200f69')");
        }

        public void b(b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `pka_table`");
            if (MyRenzDatabase_Impl.this.f1409h != null) {
                int size = MyRenzDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) MyRenzDatabase_Impl.this.f1409h.get(i2)).b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(b bVar) {
            if (MyRenzDatabase_Impl.this.f1409h != null) {
                int size = MyRenzDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) MyRenzDatabase_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = MyRenzDatabase_Impl.this.a = bVar;
            MyRenzDatabase_Impl.this.r(bVar);
            if (MyRenzDatabase_Impl.this.f1409h != null) {
                int size = MyRenzDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) MyRenzDatabase_Impl.this.f1409h.get(i2)).c(bVar);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("macAddress", new f.a("macAddress", "TEXT", true, 1, (String) null, 1));
            hashMap.put("pkaId", new f.a("pkaId", "TEXT", true, 0, (String) null, 1));
            f fVar = new f("pka_table", hashMap, new HashSet(0), new HashSet(0));
            f a = f.a(bVar, "pka_table");
            if (fVar.equals(a)) {
                return new n.b(true, (String) null);
            }
            return new n.b(false, "pka_table(com.sensorberg.smartspaces.myrenz.storage.PkaEntity).\n Expected:\n" + fVar + "\n Found:\n" + a);
        }
    }

    public void d() {
        super.a();
        b b = super.m().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `pka_table`");
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
        return new i(this, new HashMap(0), new HashMap(0), "pka_table");
    }

    /* access modifiers changed from: protected */
    public e.s.a.c h(androidx.room.c cVar) {
        n nVar = new n(cVar, new a(1), "a39c51dfb7a453427b003a9105200f69", "43c79dd0b83ddeb3cc0401cbea6aa0f0");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public a y() {
        a aVar;
        if (this.f6156l != null) {
            return this.f6156l;
        }
        synchronized (this) {
            if (this.f6156l == null) {
                this.f6156l = new b(this);
            }
            aVar = this.f6156l;
        }
        return aVar;
    }
}
