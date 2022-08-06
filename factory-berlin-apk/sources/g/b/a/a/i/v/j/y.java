package g.b.a.a.i.v.j;

import android.database.sqlite.SQLiteDatabase;
import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class y implements b0.b {
    private final String a;

    private y(String str) {
        this.a = str;
    }

    public static b0.b b(String str) {
        return new y(str);
    }

    public Object a(Object obj) {
        return b0.t0(this.a, (SQLiteDatabase) obj);
    }
}
