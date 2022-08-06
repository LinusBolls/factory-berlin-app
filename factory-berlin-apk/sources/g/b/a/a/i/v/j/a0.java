package g.b.a.a.i.v.j;

import android.database.sqlite.SQLiteDatabase;
import g.b.a.a.i.m;
import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class a0 implements b0.b {
    private final b0 a;
    private final m b;

    private a0(b0 b0Var, m mVar) {
        this.a = b0Var;
        this.b = mVar;
    }

    public static b0.b b(b0 b0Var, m mVar) {
        return new a0(b0Var, mVar);
    }

    public Object a(Object obj) {
        return b0.M(this.a, this.b, (SQLiteDatabase) obj);
    }
}
