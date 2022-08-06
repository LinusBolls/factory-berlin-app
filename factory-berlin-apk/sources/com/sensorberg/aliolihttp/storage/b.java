package com.sensorberg.aliolihttp.storage;

import android.database.Cursor;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import com.sensorberg.aliolihttp.storage.d.c;
import com.sensorberg.aliolihttp.storage.d.d;
import e.s.a.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlioliHttpDao_Impl */
public final class b implements a {
    private final l a;
    private final e b;
    /* access modifiers changed from: private */
    public final d c = new d();

    /* renamed from: d  reason: collision with root package name */
    private final s f4833d;

    /* compiled from: AlioliHttpDao_Impl */
    class a extends e<com.sensorberg.aliolihttp.storage.d.b> {
        a(l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR ABORT INTO `alioli_http_request`(`method`,`url`,`alioliHttpHeaderList`,`validUntilMs`,`id`,`body`,`contentType`) VALUES (?,?,?,?,nullif(?, 0),?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, com.sensorberg.aliolihttp.storage.d.b bVar) {
            if (bVar.d() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, bVar.d());
            }
            if (bVar.e() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, bVar.e());
            }
            String a = b.this.c.a(bVar.b());
            if (a == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, a);
            }
            fVar.bindLong(4, bVar.f());
            fVar.bindLong(5, bVar.c());
            com.sensorberg.aliolihttp.storage.d.a a2 = bVar.a();
            if (a2 != null) {
                if (a2.a() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, a2.a());
                }
                if (a2.b() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, a2.b());
                }
            } else {
                fVar.bindNull(6);
                fVar.bindNull(7);
            }
        }
    }

    /* renamed from: com.sensorberg.aliolihttp.storage.b$b  reason: collision with other inner class name */
    /* compiled from: AlioliHttpDao_Impl */
    class C0142b extends s {
        C0142b(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM alioli_http_request WHERE ?=id";
        }
    }

    public b(l lVar) {
        this.a = lVar;
        this.b = new a(lVar);
        this.f4833d = new C0142b(this, lVar);
    }

    public void a(long j2) {
        f a2 = this.f4833d.a();
        this.a.c();
        try {
            a2.bindLong(1, j2);
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f4833d.f(a2);
        }
    }

    public long b(com.sensorberg.aliolihttp.storage.d.b bVar) {
        this.a.c();
        try {
            long k2 = this.b.k(bVar);
            this.a.x();
            return k2;
        } finally {
            this.a.i();
        }
    }

    public List<com.sensorberg.aliolihttp.storage.d.b> getAll() {
        com.sensorberg.aliolihttp.storage.d.a aVar;
        o h2 = o.h("SELECT * FROM alioli_http_request", 0);
        Cursor u = this.a.u(h2);
        try {
            int columnIndexOrThrow = u.getColumnIndexOrThrow("method");
            int columnIndexOrThrow2 = u.getColumnIndexOrThrow("url");
            int columnIndexOrThrow3 = u.getColumnIndexOrThrow("alioliHttpHeaderList");
            int columnIndexOrThrow4 = u.getColumnIndexOrThrow("validUntilMs");
            int columnIndexOrThrow5 = u.getColumnIndexOrThrow("id");
            int columnIndexOrThrow6 = u.getColumnIndexOrThrow("body");
            int columnIndexOrThrow7 = u.getColumnIndexOrThrow("contentType");
            ArrayList arrayList = new ArrayList(u.getCount());
            while (u.moveToNext()) {
                String string = u.getString(columnIndexOrThrow);
                String string2 = u.getString(columnIndexOrThrow2);
                ArrayList<c> b2 = this.c.b(u.getString(columnIndexOrThrow3));
                long j2 = u.getLong(columnIndexOrThrow4);
                long j3 = u.getLong(columnIndexOrThrow5);
                if (u.isNull(columnIndexOrThrow6)) {
                    if (u.isNull(columnIndexOrThrow7)) {
                        aVar = null;
                        arrayList.add(new com.sensorberg.aliolihttp.storage.d.b(string, string2, aVar, b2, j2, j3));
                    }
                }
                aVar = new com.sensorberg.aliolihttp.storage.d.a(u.getString(columnIndexOrThrow6), u.getString(columnIndexOrThrow7));
                arrayList.add(new com.sensorberg.aliolihttp.storage.d.b(string, string2, aVar, b2, j2, j3));
            }
            return arrayList;
        } finally {
            u.close();
            h2.n();
        }
    }

    public int size() {
        int i2 = 0;
        o h2 = o.h("SELECT count(*) FROM alioli_http_request", 0);
        Cursor u = this.a.u(h2);
        try {
            if (u.moveToFirst()) {
                i2 = u.getInt(0);
            }
            return i2;
        } finally {
            u.close();
            h2.n();
        }
    }
}
