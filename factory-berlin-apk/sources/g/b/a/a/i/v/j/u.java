package g.b.a.a.i.v.j;

import android.database.Cursor;
import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class u implements b0.b {
    private static final u a = new u();

    private u() {
    }

    public static b0.b b() {
        return a;
    }

    public Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
