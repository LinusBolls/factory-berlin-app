package g.b.a.a.i.v.j;

import android.database.sqlite.SQLiteDatabase;
import g.b.a.a.i.h;
import g.b.a.a.i.m;
import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class w implements b0.b {
    private final b0 a;
    private final m b;
    private final h c;

    private w(b0 b0Var, m mVar, h hVar) {
        this.a = b0Var;
        this.b = mVar;
        this.c = hVar;
    }

    public static b0.b b(b0 b0Var, m mVar, h hVar) {
        return new w(b0Var, mVar, hVar);
    }

    public Object a(Object obj) {
        return b0.n0(this.a, this.b, this.c, (SQLiteDatabase) obj);
    }
}
