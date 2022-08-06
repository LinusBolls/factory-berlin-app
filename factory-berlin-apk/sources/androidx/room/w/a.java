package androidx.room.w;

import android.database.Cursor;
import androidx.room.i;
import androidx.room.o;
import e.p.l;
import java.util.List;
import java.util.Set;

/* compiled from: LimitOffsetDataSource */
public abstract class a<T> extends l<T> {
    private final o c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1451d = ("SELECT COUNT(*) FROM ( " + this.c.a() + " )");

    /* renamed from: e  reason: collision with root package name */
    private final String f1452e = ("SELECT * FROM ( " + this.c.a() + " ) LIMIT ? OFFSET ?");

    /* renamed from: f  reason: collision with root package name */
    private final androidx.room.l f1453f;

    /* renamed from: g  reason: collision with root package name */
    private final i.c f1454g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1455h;

    /* renamed from: androidx.room.w.a$a  reason: collision with other inner class name */
    /* compiled from: LimitOffsetDataSource */
    class C0036a extends i.c {
        C0036a(String[] strArr) {
            super(strArr);
        }

        public void b(Set<String> set) {
            a.this.c();
        }
    }

    protected a(androidx.room.l lVar, o oVar, boolean z, String... strArr) {
        this.f1453f = lVar;
        this.c = oVar;
        this.f1455h = z;
        this.f1454g = new C0036a(strArr);
        lVar.l().b(this.f1454g);
    }

    private o p(int i2, int i3) {
        o h2 = o.h(this.f1452e, this.c.j() + 2);
        h2.i(this.c);
        h2.bindLong(h2.j() - 1, (long) i3);
        h2.bindLong(h2.j(), (long) i2);
        return h2;
    }

    public boolean e() {
        this.f1453f.l().i();
        return super.e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(e.p.l.d r7, e.p.l.b<T> r8) {
        /*
            r6 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            androidx.room.l r1 = r6.f1453f
            r1.c()
            r1 = 0
            int r2 = r6.o()     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0032
            int r0 = e.p.l.g(r7, r2)     // Catch:{ all -> 0x0047 }
            int r7 = e.p.l.h(r7, r0, r2)     // Catch:{ all -> 0x0047 }
            androidx.room.o r7 = r6.p(r0, r7)     // Catch:{ all -> 0x0047 }
            androidx.room.l r3 = r6.f1453f     // Catch:{ all -> 0x0030 }
            android.database.Cursor r1 = r3.u(r7)     // Catch:{ all -> 0x0030 }
            java.util.List r3 = r6.n(r1)     // Catch:{ all -> 0x0030 }
            androidx.room.l r4 = r6.f1453f     // Catch:{ all -> 0x0030 }
            r4.x()     // Catch:{ all -> 0x0030 }
            r5 = r3
            r3 = r7
            r7 = r0
            r0 = r5
            goto L_0x0034
        L_0x0030:
            r8 = move-exception
            goto L_0x0049
        L_0x0032:
            r7 = 0
            r3 = r1
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()
        L_0x0039:
            androidx.room.l r1 = r6.f1453f
            r1.i()
            if (r3 == 0) goto L_0x0043
            r3.n()
        L_0x0043:
            r8.a(r0, r7, r2)
            return
        L_0x0047:
            r8 = move-exception
            r7 = r1
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            androidx.room.l r0 = r6.f1453f
            r0.i()
            if (r7 == 0) goto L_0x0058
            r7.n()
        L_0x0058:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.w.a.k(e.p.l$d, e.p.l$b):void");
    }

    public void l(l.g gVar, l.e<T> eVar) {
        eVar.a(q(gVar.a, gVar.b));
    }

    /* access modifiers changed from: protected */
    public abstract List<T> n(Cursor cursor);

    public int o() {
        o h2 = o.h(this.f1451d, this.c.j());
        h2.i(this.c);
        Cursor u = this.f1453f.u(h2);
        try {
            if (u.moveToFirst()) {
                return u.getInt(0);
            }
            u.close();
            h2.n();
            return 0;
        } finally {
            u.close();
            h2.n();
        }
    }

    public List<T> q(int i2, int i3) {
        o p = p(i2, i3);
        if (this.f1455h) {
            this.f1453f.c();
            Cursor cursor = null;
            try {
                cursor = this.f1453f.u(p);
                List<T> n2 = n(cursor);
                this.f1453f.x();
                return n2;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.f1453f.i();
                p.n();
            }
        } else {
            Cursor u = this.f1453f.u(p);
            try {
                return n(u);
            } finally {
                u.close();
                p.n();
            }
        }
    }
}
