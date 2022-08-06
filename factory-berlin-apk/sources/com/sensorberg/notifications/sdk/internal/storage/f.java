package com.sensorberg.notifications.sdk.internal.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import androidx.room.x.c;
import com.sensorberg.notifications.sdk.internal.model.g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BeaconRegistrationDao_Impl */
public final class f extends e {
    private final l a;
    private final e<g> b;
    /* access modifiers changed from: private */
    public final h c = new h();

    /* renamed from: d  reason: collision with root package name */
    private final s f5394d;

    /* compiled from: BeaconRegistrationDao_Impl */
    class a extends e<g> {
        a(l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_beacons_registration` (`id`,`proximityUuid`,`major`,`minor`,`type`) VALUES (?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, g gVar) {
            if (gVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, gVar.a());
            }
            String c = f.this.c.c(gVar.d());
            if (c == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, c);
            }
            fVar.bindLong(3, (long) gVar.b());
            fVar.bindLong(4, (long) gVar.c());
            fVar.bindLong(5, (long) f.this.c.b(gVar.e()));
        }
    }

    /* compiled from: BeaconRegistrationDao_Impl */
    class b extends s {
        b(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM table_beacons_registration";
        }
    }

    public f(l lVar) {
        this.a = lVar;
        this.b = new a(lVar);
        this.f5394d = new b(this, lVar);
    }

    public void a() {
        this.a.b();
        e.s.a.f a2 = this.f5394d.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f5394d.f(a2);
        }
    }

    public List<g> b() {
        o h2 = o.h("SELECT * FROM table_beacons_registration", 0);
        this.a.b();
        Cursor c2 = c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "id");
            int b3 = androidx.room.x.b.b(c2, "proximityUuid");
            int b4 = androidx.room.x.b.b(c2, "major");
            int b5 = androidx.room.x.b.b(c2, "minor");
            int b6 = androidx.room.x.b.b(c2, "type");
            ArrayList arrayList = new ArrayList(c2.getCount());
            while (c2.moveToNext()) {
                arrayList.add(new g(c2.getString(b2), this.c.f(c2.getString(b3)), c2.getShort(b4), c2.getShort(b5), this.c.e(c2.getInt(b6))));
            }
            return arrayList;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public void c(List<g> list) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(list);
            this.a.x();
        } finally {
            this.a.i();
        }
    }
}
