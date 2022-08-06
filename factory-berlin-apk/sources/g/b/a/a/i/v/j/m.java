package g.b.a.a.i.v.j;

import android.database.sqlite.SQLiteDatabase;
import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class m implements b0.b {
    private final long a;

    private m(long j2) {
        this.a = j2;
    }

    public static b0.b b(long j2) {
        return new m(j2);
    }

    public Object a(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.a)}));
    }
}
