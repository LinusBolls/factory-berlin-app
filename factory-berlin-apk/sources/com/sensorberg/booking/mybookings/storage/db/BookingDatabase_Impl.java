package com.sensorberg.booking.mybookings.storage.db;

import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import androidx.room.x.c;
import androidx.room.x.f;
import e.s.a.b;
import e.s.a.c;
import java.util.HashMap;
import java.util.HashSet;

public final class BookingDatabase_Impl extends BookingDatabase {

    /* renamed from: l  reason: collision with root package name */
    private volatile c f4893l;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `bookings` (`id` TEXT NOT NULL, `room` TEXT NOT NULL, `displayTime` TEXT NOT NULL, `startTimeInMillis` INTEGER NOT NULL, `unitId` TEXT NOT NULL, `nextPageKey` TEXT, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a244630c9ea3f9b05718c92f1ce2362f')");
        }

        public void b(b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `bookings`");
            if (BookingDatabase_Impl.this.f1409h != null) {
                int size = BookingDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) BookingDatabase_Impl.this.f1409h.get(i2)).b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(b bVar) {
            if (BookingDatabase_Impl.this.f1409h != null) {
                int size = BookingDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) BookingDatabase_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = BookingDatabase_Impl.this.a = bVar;
            BookingDatabase_Impl.this.r(bVar);
            if (BookingDatabase_Impl.this.f1409h != null) {
                int size = BookingDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) BookingDatabase_Impl.this.f1409h.get(i2)).c(bVar);
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
            HashMap hashMap = new HashMap(6);
            hashMap.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("room", new f.a("room", "TEXT", true, 0, (String) null, 1));
            hashMap.put("displayTime", new f.a("displayTime", "TEXT", true, 0, (String) null, 1));
            hashMap.put("startTimeInMillis", new f.a("startTimeInMillis", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("unitId", new f.a("unitId", "TEXT", true, 0, (String) null, 1));
            hashMap.put("nextPageKey", new f.a("nextPageKey", "TEXT", false, 0, (String) null, 1));
            f fVar = new f("bookings", hashMap, new HashSet(0), new HashSet(0));
            f a = f.a(bVar, "bookings");
            if (fVar.equals(a)) {
                return new n.b(true, (String) null);
            }
            return new n.b(false, "bookings(com.sensorberg.booking.mybookings.BookingViewItem).\n Expected:\n" + fVar + "\n Found:\n" + a);
        }
    }

    public void d() {
        super.a();
        b b = super.m().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `bookings`");
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
        return new i(this, new HashMap(0), new HashMap(0), "bookings");
    }

    /* access modifiers changed from: protected */
    public e.s.a.c h(androidx.room.c cVar) {
        n nVar = new n(cVar, new a(1), "a244630c9ea3f9b05718c92f1ce2362f", "222a2ed37187e25264b91164b4173d0c");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public c y() {
        c cVar;
        if (this.f4893l != null) {
            return this.f4893l;
        }
        synchronized (this) {
            if (this.f4893l == null) {
                this.f4893l = new d(this);
            }
            cVar = this.f4893l;
        }
        return cVar;
    }
}
