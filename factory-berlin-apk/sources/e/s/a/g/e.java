package e.s.a.g;

import android.database.sqlite.SQLiteStatement;
import e.s.a.f;

/* compiled from: FrameworkSQLiteStatement */
class e extends d implements f {

    /* renamed from: h  reason: collision with root package name */
    private final SQLiteStatement f8889h;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f8889h = sQLiteStatement;
    }

    public long executeInsert() {
        return this.f8889h.executeInsert();
    }

    public int executeUpdateDelete() {
        return this.f8889h.executeUpdateDelete();
    }
}
