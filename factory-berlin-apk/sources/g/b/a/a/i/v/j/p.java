package g.b.a.a.i.v.j;

import android.database.Cursor;
import g.b.a.a.i.v.j.b0;
import java.util.Map;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class p implements b0.b {
    private final Map a;

    private p(Map map) {
        this.a = map;
    }

    public static b0.b b(Map map) {
        return new p(map);
    }

    public Object a(Object obj) {
        return b0.l0(this.a, (Cursor) obj);
    }
}
