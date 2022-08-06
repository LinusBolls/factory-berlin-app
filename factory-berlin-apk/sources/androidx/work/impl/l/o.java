package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.e;
import androidx.room.l;
import androidx.room.x.c;
import e.s.a.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl */
public final class o implements n {
    private final l a;
    private final e b;

    /* compiled from: WorkTagDao_Impl */
    class a extends e<m> {
        a(o oVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, m mVar) {
            String str = mVar.a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = mVar.b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }
    }

    public o(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
    }

    public void a(m mVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(mVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public List<String> b(String str) {
        androidx.room.o h2 = androidx.room.o.h("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = c.b(this.a, h2, false);
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
