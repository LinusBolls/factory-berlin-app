package e.s.a.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import e.s.a.e;
import e.s.a.f;
import java.util.List;

/* compiled from: FrameworkSQLiteDatabase */
class a implements e.s.a.b {

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f8883h = new String[0];

    /* renamed from: g  reason: collision with root package name */
    private final SQLiteDatabase f8884g;

    /* renamed from: e.s.a.g.a$a  reason: collision with other inner class name */
    /* compiled from: FrameworkSQLiteDatabase */
    class C0585a implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ e a;

        C0585a(a aVar, e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase */
    class b implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ e a;

        b(a aVar, e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f8884g = sQLiteDatabase;
    }

    public f G(String str) {
        return new e(this.f8884g.compileStatement(str));
    }

    public Cursor J(e eVar) {
        return this.f8884g.rawQueryWithFactory(new C0585a(this, eVar), eVar.a(), f8883h, (String) null);
    }

    public Cursor T(e eVar, CancellationSignal cancellationSignal) {
        return this.f8884g.rawQueryWithFactory(new b(this, eVar), eVar.a(), f8883h, (String) null, cancellationSignal);
    }

    /* access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f8884g == sQLiteDatabase;
    }

    public void beginTransaction() {
        this.f8884g.beginTransaction();
    }

    public void close() {
        this.f8884g.close();
    }

    public void endTransaction() {
        this.f8884g.endTransaction();
    }

    public void execSQL(String str) {
        this.f8884g.execSQL(str);
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return this.f8884g.getAttachedDbs();
    }

    public String getPath() {
        return this.f8884g.getPath();
    }

    public boolean inTransaction() {
        return this.f8884g.inTransaction();
    }

    public boolean isOpen() {
        return this.f8884g.isOpen();
    }

    public void setTransactionSuccessful() {
        this.f8884g.setTransactionSuccessful();
    }

    public Cursor x0(String str) {
        return J(new e.s.a.a(str));
    }
}
