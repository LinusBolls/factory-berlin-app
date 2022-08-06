package g.b.a.a.i.v.j;

import android.database.sqlite.SQLiteDatabase;
import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class q implements b0.d {
    private final SQLiteDatabase a;

    private q(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public static b0.d b(SQLiteDatabase sQLiteDatabase) {
        return new q(sQLiteDatabase);
    }

    public Object a() {
        return this.a.beginTransaction();
    }
}
