package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import androidx.room.x.c;

/* compiled from: SystemIdInfoDao_Impl */
public final class f implements e {
    private final l a;
    private final e b;
    private final s c;

    /* compiled from: SystemIdInfoDao_Impl */
    class a extends e<d> {
        a(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, d dVar) {
            String str = dVar.a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            fVar.bindLong(2, (long) dVar.b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    class b extends s {
        b(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public f(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
    }

    public void a(d dVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(dVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public d b(String str) {
        o h2 = o.h("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = c.b(this.a, h2, false);
        try {
            return b2.moveToFirst() ? new d(b2.getString(androidx.room.x.b.b(b2, "work_spec_id")), b2.getInt(androidx.room.x.b.b(b2, "system_id"))) : null;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public void c(String str) {
        this.a.b();
        e.s.a.f a2 = this.c.a();
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.c.f(a2);
        }
    }
}
