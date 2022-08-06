package com.sensorberg.encryptor;

import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import androidx.room.x.f;
import e.s.a.b;
import e.s.a.c;
import java.util.HashMap;
import java.util.HashSet;

public final class EncryptorDb_Impl extends EncryptorDb {

    /* renamed from: l  reason: collision with root package name */
    private volatile e f5070l;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `encrypted_messages` (`alias` TEXT NOT NULL, `data` TEXT NOT NULL, `iv` TEXT NOT NULL, PRIMARY KEY(`alias`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b01e7bba825d093da6300ef1b3e91e77\")");
        }

        public void b(b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `encrypted_messages`");
        }

        /* access modifiers changed from: protected */
        public void c(b bVar) {
            if (EncryptorDb_Impl.this.f1409h != null) {
                int size = EncryptorDb_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) EncryptorDb_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = EncryptorDb_Impl.this.a = bVar;
            EncryptorDb_Impl.this.r(bVar);
            if (EncryptorDb_Impl.this.f1409h != null) {
                int size = EncryptorDb_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) EncryptorDb_Impl.this.f1409h.get(i2)).c(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(b bVar) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("alias", new f.a("alias", "TEXT", true, 1));
            hashMap.put("data", new f.a("data", "TEXT", true, 0));
            hashMap.put("iv", new f.a("iv", "TEXT", true, 0));
            f fVar = new f("encrypted_messages", hashMap, new HashSet(0), new HashSet(0));
            f a = f.a(bVar, "encrypted_messages");
            if (!fVar.equals(a)) {
                throw new IllegalStateException("Migration didn't properly handle encrypted_messages(com.sensorberg.encryptor.EncryptedMessage).\n Expected:\n" + fVar + "\n Found:\n" + a);
            }
        }
    }

    public void d() {
        super.a();
        b b = super.m().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `encrypted_messages`");
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
        return new i(this, "encrypted_messages");
    }

    /* access modifiers changed from: protected */
    public c h(androidx.room.c cVar) {
        n nVar = new n(cVar, new a(1), "b01e7bba825d093da6300ef1b3e91e77", "152061157df774f6cb613ab564399650");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public e y() {
        e eVar;
        if (this.f5070l != null) {
            return this.f5070l;
        }
        synchronized (this) {
            if (this.f5070l == null) {
                this.f5070l = new f(this);
            }
            eVar = this.f5070l;
        }
        return eVar;
    }
}
