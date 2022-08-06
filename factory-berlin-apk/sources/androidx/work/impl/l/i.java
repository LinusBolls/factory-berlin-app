package androidx.work.impl.l;

import androidx.room.e;
import androidx.room.l;
import e.s.a.f;

/* compiled from: WorkNameDao_Impl */
public final class i implements h {
    private final l a;
    private final e b;

    /* compiled from: WorkNameDao_Impl */
    class a extends e<g> {
        a(i iVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, g gVar) {
            String str = gVar.a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = gVar.b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }
    }

    public i(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
    }

    public void a(g gVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(gVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }
}
