package com.sensorberg.smartworkspace.app.screens.info;

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

public final class InfoDatabase_Impl extends InfoDatabase {

    /* renamed from: l  reason: collision with root package name */
    private volatile c f7489l;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `Info` (`instance` TEXT NOT NULL, `action` TEXT NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `uri` TEXT NOT NULL, `payload` TEXT NOT NULL, `ts` INTEGER NOT NULL, `read` INTEGER NOT NULL, PRIMARY KEY(`instance`))");
            bVar.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Info_action` ON `Info` (`action`)");
            bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Info_ts` ON `Info` (`ts`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4d6f4007a4cc953e6a4a1504445aac87')");
        }

        public void b(b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `Info`");
            if (InfoDatabase_Impl.this.f1409h != null) {
                int size = InfoDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) InfoDatabase_Impl.this.f1409h.get(i2)).b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(b bVar) {
            if (InfoDatabase_Impl.this.f1409h != null) {
                int size = InfoDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) InfoDatabase_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = InfoDatabase_Impl.this.a = bVar;
            InfoDatabase_Impl.this.r(bVar);
            if (InfoDatabase_Impl.this.f1409h != null) {
                int size = InfoDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) InfoDatabase_Impl.this.f1409h.get(i2)).c(bVar);
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
            HashMap hashMap = new HashMap(8);
            hashMap.put("instance", new f.a("instance", "TEXT", true, 1, (String) null, 1));
            hashMap.put("action", new f.a("action", "TEXT", true, 0, (String) null, 1));
            hashMap.put("title", new f.a("title", "TEXT", true, 0, (String) null, 1));
            hashMap.put("body", new f.a("body", "TEXT", true, 0, (String) null, 1));
            hashMap.put("uri", new f.a("uri", "TEXT", true, 0, (String) null, 1));
            hashMap.put("payload", new f.a("payload", "TEXT", true, 0, (String) null, 1));
            hashMap.put("ts", new f.a("ts", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("read", new f.a("read", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Info_action", true, Arrays.asList(new String[]{"action"})));
            hashSet2.add(new f.d("index_Info_ts", false, Arrays.asList(new String[]{"ts"})));
            f fVar = new f("Info", hashMap, hashSet, hashSet2);
            f a = f.a(bVar, "Info");
            if (fVar.equals(a)) {
                return new n.b(true, (String) null);
            }
            return new n.b(false, "Info(com.sensorberg.smartworkspace.app.screens.info.Info).\n Expected:\n" + fVar + "\n Found:\n" + a);
        }
    }

    public void d() {
        super.a();
        b b = super.m().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `Info`");
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
        return new i(this, new HashMap(0), new HashMap(0), "Info");
    }

    /* access modifiers changed from: protected */
    public e.s.a.c h(androidx.room.c cVar) {
        n nVar = new n(cVar, new a(1), "4d6f4007a4cc953e6a4a1504445aac87", "c21f8fcb9430a3cd75f675f814253679");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public c y() {
        c cVar;
        if (this.f7489l != null) {
            return this.f7489l;
        }
        synchronized (this) {
            if (this.f7489l == null) {
                this.f7489l = new d(this);
            }
            cVar = this.f7489l;
        }
        return cVar;
    }
}
