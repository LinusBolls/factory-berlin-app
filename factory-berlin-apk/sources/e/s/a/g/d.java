package e.s.a.g;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram */
class d implements e.s.a.d {

    /* renamed from: g  reason: collision with root package name */
    private final SQLiteProgram f8888g;

    d(SQLiteProgram sQLiteProgram) {
        this.f8888g = sQLiteProgram;
    }

    public void bindBlob(int i2, byte[] bArr) {
        this.f8888g.bindBlob(i2, bArr);
    }

    public void bindDouble(int i2, double d2) {
        this.f8888g.bindDouble(i2, d2);
    }

    public void bindLong(int i2, long j2) {
        this.f8888g.bindLong(i2, j2);
    }

    public void bindNull(int i2) {
        this.f8888g.bindNull(i2);
    }

    public void bindString(int i2, String str) {
        this.f8888g.bindString(i2, str);
    }

    public void close() {
        this.f8888g.close();
    }
}
