package e.s.a.g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import e.s.a.c;

/* compiled from: FrameworkSQLiteOpenHelper */
class b implements c {
    private final a a;

    /* compiled from: FrameworkSQLiteOpenHelper */
    static class a extends SQLiteOpenHelper {

        /* renamed from: g  reason: collision with root package name */
        final a[] f8885g;

        /* renamed from: h  reason: collision with root package name */
        final c.a f8886h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f8887i;

        /* renamed from: e.s.a.g.b$a$a  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C0586a implements DatabaseErrorHandler {
            final /* synthetic */ c.a a;
            final /* synthetic */ a[] b;

            C0586a(c.a aVar, a[] aVarArr) {
                this.a = aVar;
                this.b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.b(this.b, sQLiteDatabase));
            }
        }

        a(Context context, String str, a[] aVarArr, c.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.a, new C0586a(aVar, aVarArr));
            this.f8886h = aVar;
            this.f8885g = aVarArr;
        }

        static a b(a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        /* access modifiers changed from: package-private */
        public a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.f8885g, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f8885g[0] = null;
        }

        /* access modifiers changed from: package-private */
        public synchronized e.s.a.b h() {
            this.f8887i = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f8887i) {
                close();
                return h();
            }
            return a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f8886h.b(a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f8886h.d(a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f8887i = true;
            this.f8886h.e(a(sQLiteDatabase), i2, i3);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f8887i) {
                this.f8886h.f(a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f8887i = true;
            this.f8886h.g(a(sQLiteDatabase), i2, i3);
        }
    }

    b(Context context, String str, c.a aVar) {
        this.a = d(context, str, aVar);
    }

    private a d(Context context, String str, c.a aVar) {
        return new a(context, str, new a[1], aVar);
    }

    public void a(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }

    public e.s.a.b b() {
        return this.a.h();
    }

    public String c() {
        return this.a.getDatabaseName();
    }

    public void close() {
        this.a.close();
    }
}
