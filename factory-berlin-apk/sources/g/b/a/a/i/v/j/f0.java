package g.b.a.a.i.v.j;

import android.database.sqlite.SQLiteDatabase;
import g.b.a.a.i.v.j.h0;

/* compiled from: SchemaManager */
final /* synthetic */ class f0 implements h0.a {
    private static final f0 a = new f0();

    private f0() {
    }

    public static h0.a b() {
        return a;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
