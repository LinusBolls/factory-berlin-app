package g.b.a.a.i.v.j;

import android.database.sqlite.SQLiteDatabase;
import g.b.a.a.i.m;
import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class j implements b0.b {
    private final long a;
    private final m b;

    private j(long j2, m mVar) {
        this.a = j2;
        this.b = mVar;
    }

    public static b0.b b(long j2, m mVar) {
        return new j(j2, mVar);
    }

    public Object a(Object obj) {
        return b0.w0(this.a, this.b, (SQLiteDatabase) obj);
    }
}
