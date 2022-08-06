package com.sensorberg.notifications.sdk.internal.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import com.sensorberg.notifications.sdk.internal.model.f;
import com.sensorberg.notifications.sdk.internal.model.n;

/* compiled from: BeaconDao_Impl */
public final class d extends c {
    private final l a;
    private final e<n> b;
    private final e<f> c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final h f5390d = new h();

    /* renamed from: e  reason: collision with root package name */
    private final androidx.room.d<n> f5391e;

    /* renamed from: f  reason: collision with root package name */
    private final s f5392f;

    /* compiled from: BeaconDao_Impl */
    class a extends e<n> {
        a(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_visible_beacons` (`id`,`timestamp`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, n nVar) {
            if (nVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, nVar.a());
            }
            fVar.bindLong(2, nVar.b());
        }
    }

    /* compiled from: BeaconDao_Impl */
    class b extends e<f> {
        b(l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_beacon_events` (`beaconKey`,`timestamp`,`proximityUuid`,`major`,`minor`,`type`) VALUES (?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, f fVar2) {
            if (fVar2.c() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, fVar2.c());
            }
            fVar.bindLong(2, fVar2.g());
            String c = d.this.f5390d.c(fVar2.f());
            if (c == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, c);
            }
            fVar.bindLong(4, (long) fVar2.d());
            fVar.bindLong(5, (long) fVar2.e());
            fVar.bindLong(6, (long) d.this.f5390d.b(fVar2.h()));
        }
    }

    /* compiled from: BeaconDao_Impl */
    class c extends androidx.room.d<n> {
        c(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM `table_visible_beacons` WHERE `id` = ?";
        }

        /* renamed from: k */
        public void g(e.s.a.f fVar, n nVar) {
            if (nVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, nVar.a());
            }
        }
    }

    /* renamed from: com.sensorberg.notifications.sdk.internal.storage.d$d  reason: collision with other inner class name */
    /* compiled from: BeaconDao_Impl */
    class C0174d extends s {
        C0174d(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM table_beacon_events WHERE beaconKey = ? AND timestamp = ?";
        }
    }

    public d(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(lVar);
        this.f5391e = new c(this, lVar);
        this.f5392f = new C0174d(this, lVar);
    }

    public void a(f fVar) {
        this.a.b();
        this.a.c();
        try {
            this.c.i(fVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void b(n nVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(nVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void c(String str, long j2) {
        this.a.b();
        e.s.a.f a2 = this.f5392f.a();
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        a2.bindLong(2, j2);
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f5392f.f(a2);
        }
    }

    public f d(String str) {
        String str2 = str;
        o h2 = o.h("SELECT * FROM table_beacon_events WHERE beaconKey = ?", 1);
        if (str2 == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str2);
        }
        this.a.b();
        f fVar = null;
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "beaconKey");
            int b3 = androidx.room.x.b.b(c2, "timestamp");
            int b4 = androidx.room.x.b.b(c2, "proximityUuid");
            int b5 = androidx.room.x.b.b(c2, "major");
            int b6 = androidx.room.x.b.b(c2, "minor");
            int b7 = androidx.room.x.b.b(c2, "type");
            if (c2.moveToFirst()) {
                fVar = new f(c2.getString(b2), c2.getLong(b3), this.f5390d.f(c2.getString(b4)), c2.getShort(b5), c2.getShort(b6), this.f5390d.e(c2.getInt(b7)));
            }
            return fVar;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public n e(String str) {
        o h2 = o.h("SELECT * FROM table_visible_beacons WHERE id = ?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        n nVar = null;
        Cursor c2 = androidx.room.x.c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "id");
            int b3 = androidx.room.x.b.b(c2, "timestamp");
            if (c2.moveToFirst()) {
                nVar = new n(c2.getString(b2), c2.getLong(b3));
            }
            return nVar;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public void f(n nVar) {
        this.a.b();
        this.a.c();
        try {
            this.f5391e.h(nVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }
}
