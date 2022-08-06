package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import e.s.a.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl */
public final class c implements b {
    private final l a;
    private final e b;

    /* compiled from: DependencyDao_Impl */
    class a extends e<a> {
        a(c cVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, a aVar) {
            String str = aVar.a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = aVar.b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }
    }

    public c(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
    }

    public void a(a aVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(aVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public boolean b(String str) {
        boolean z = true;
        o h2 = o.h("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        boolean z2 = false;
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public boolean c(String str) {
        boolean z = true;
        o h2 = o.h("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        boolean z2 = false;
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public List<String> d(String str) {
        o h2 = o.h("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.n();
        }
    }
}
