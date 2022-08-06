package g.b.a.a.i.v.j;

import android.database.Cursor;
import g.b.a.a.i.m;
import g.b.a.a.i.v.j.b0;
import java.util.List;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class n implements b0.b {
    private final b0 a;
    private final List b;
    private final m c;

    private n(b0 b0Var, List list, m mVar) {
        this.a = b0Var;
        this.b = list;
        this.c = mVar;
    }

    public static b0.b b(b0 b0Var, List list, m mVar) {
        return new n(b0Var, list, mVar);
    }

    public Object a(Object obj) {
        return b0.i0(this.a, this.b, this.c, (Cursor) obj);
    }
}
