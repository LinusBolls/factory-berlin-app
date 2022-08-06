package com.microsoft.appcenter.utils.o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import java.io.Closeable;
import java.util.Arrays;

/* compiled from: DatabaseManager */
public class a implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f4614m = {"oid"};

    /* renamed from: g  reason: collision with root package name */
    private final Context f4615g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4616h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4617i;

    /* renamed from: j  reason: collision with root package name */
    private final ContentValues f4618j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final b f4619k;

    /* renamed from: l  reason: collision with root package name */
    private SQLiteOpenHelper f4620l;

    /* renamed from: com.microsoft.appcenter.utils.o.a$a  reason: collision with other inner class name */
    /* compiled from: DatabaseManager */
    class C0133a extends SQLiteOpenHelper {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f4621g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0133a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2, String str2) {
            super(context, str, cursorFactory, i2);
            this.f4621g = str2;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(this.f4621g);
            a.this.f4619k.b(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            a.this.f4619k.a(sQLiteDatabase, i2, i3);
        }
    }

    /* compiled from: DatabaseManager */
    public interface b {
        void a(SQLiteDatabase sQLiteDatabase, int i2, int i3);

        void b(SQLiteDatabase sQLiteDatabase);
    }

    public a(Context context, String str, String str2, int i2, ContentValues contentValues, String str3, b bVar) {
        this.f4615g = context;
        this.f4616h = str;
        this.f4617i = str2;
        this.f4618j = contentValues;
        this.f4619k = bVar;
        this.f4620l = new C0133a(context, str, (SQLiteDatabase.CursorFactory) null, i2, str3);
    }

    private static ContentValues h(Cursor cursor, ContentValues contentValues) {
        ContentValues contentValues2 = new ContentValues();
        for (int i2 = 0; i2 < cursor.getColumnCount(); i2++) {
            if (!cursor.isNull(i2)) {
                String columnName = cursor.getColumnName(i2);
                if (columnName.equals("oid")) {
                    contentValues2.put(columnName, Long.valueOf(cursor.getLong(i2)));
                } else {
                    Object obj = contentValues.get(columnName);
                    if (obj instanceof byte[]) {
                        contentValues2.put(columnName, cursor.getBlob(i2));
                    } else if (obj instanceof Double) {
                        contentValues2.put(columnName, Double.valueOf(cursor.getDouble(i2)));
                    } else if (obj instanceof Float) {
                        contentValues2.put(columnName, Float.valueOf(cursor.getFloat(i2)));
                    } else if (obj instanceof Integer) {
                        contentValues2.put(columnName, Integer.valueOf(cursor.getInt(i2)));
                    } else if (obj instanceof Long) {
                        contentValues2.put(columnName, Long.valueOf(cursor.getLong(i2)));
                    } else if (obj instanceof Short) {
                        contentValues2.put(columnName, Short.valueOf(cursor.getShort(i2)));
                    } else if (obj instanceof Boolean) {
                        boolean z = true;
                        if (cursor.getInt(i2) != 1) {
                            z = false;
                        }
                        contentValues2.put(columnName, Boolean.valueOf(z));
                    } else {
                        contentValues2.put(columnName, cursor.getString(i2));
                    }
                }
            }
        }
        return contentValues2;
    }

    private int j(String str, String str2, Object obj) {
        String[] strArr = {String.valueOf(obj)};
        try {
            SQLiteDatabase o = o();
            return o.delete(str, str2 + " = ?", strArr);
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", String.format("Failed to delete values that match condition=\"%s\" and values=\"%s\" from database %s.", new Object[]{str2 + " = ?", Arrays.toString(strArr), this.f4616h}), e2);
            return 0;
        }
    }

    public boolean D(long j2) {
        try {
            SQLiteDatabase o = o();
            long maximumSize = o.setMaximumSize(j2);
            long pageSize = o.getPageSize();
            long j3 = j2 / pageSize;
            if (j2 % pageSize != 0) {
                j3++;
            }
            if (maximumSize != j3 * pageSize) {
                com.microsoft.appcenter.utils.a.b("AppCenter", "Could not change maximum database size to " + j2 + " bytes, current maximum size is " + maximumSize + " bytes.");
                return false;
            } else if (j2 == maximumSize) {
                com.microsoft.appcenter.utils.a.e("AppCenter", "Changed maximum database size to " + maximumSize + " bytes.");
                return true;
            } else {
                com.microsoft.appcenter.utils.a.e("AppCenter", "Changed maximum database size to " + maximumSize + " bytes (next multiple of page size).");
                return true;
            }
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Could not change maximum database size.", e2);
            return false;
        }
    }

    public ContentValues b(Cursor cursor) {
        return h(cursor, this.f4618j);
    }

    public void close() {
        try {
            this.f4620l.close();
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Failed to close the database.", e2);
        }
    }

    public int i(String str, Object obj) {
        return j(this.f4617i, str, obj);
    }

    public void k(long j2) {
        j(this.f4617i, "oid", Long.valueOf(j2));
    }

    public Cursor l(SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr, String[] strArr2, String str) {
        return n(this.f4617i, sQLiteQueryBuilder, strArr, strArr2, str);
    }

    /* access modifiers changed from: package-private */
    public Cursor n(String str, SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr, String[] strArr2, String str2) {
        if (sQLiteQueryBuilder == null) {
            sQLiteQueryBuilder = c.a();
        }
        SQLiteQueryBuilder sQLiteQueryBuilder2 = sQLiteQueryBuilder;
        sQLiteQueryBuilder2.setTables(str);
        return sQLiteQueryBuilder2.query(o(), strArr, (String) null, strArr2, (String) null, (String) null, str2);
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase o() {
        try {
            return this.f4620l.getWritableDatabase();
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.j("AppCenter", "Failed to open database. Trying to delete database (may be corrupted).", e2);
            if (this.f4615g.deleteDatabase(this.f4616h)) {
                com.microsoft.appcenter.utils.a.e("AppCenter", "The database was successfully deleted.");
            } else {
                com.microsoft.appcenter.utils.a.i("AppCenter", "Failed to delete database.");
            }
            return this.f4620l.getWritableDatabase();
        }
    }

    public long q() {
        try {
            return o().getMaximumSize();
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Could not get maximum database size.", e2);
            return -1;
        }
    }

    public ContentValues y(Cursor cursor) {
        try {
            if (cursor.moveToNext()) {
                return b(cursor);
            }
            return null;
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Failed to get next cursor value: ", e2);
            return null;
        }
    }

    public long z(ContentValues contentValues, String str) {
        Long l2 = null;
        Cursor cursor = null;
        while (l2 == null) {
            try {
                l2 = Long.valueOf(o().insertOrThrow(this.f4617i, (String) null, contentValues));
            } catch (SQLiteFullException e2) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "Storage is full, trying to delete the oldest log that has the lowest priority which is lower or equal priority than the new log");
                if (cursor == null) {
                    String asString = contentValues.getAsString(str);
                    SQLiteQueryBuilder a = c.a();
                    a.appendWhere(str + " <= ?");
                    cursor = l(a, f4614m, new String[]{asString}, str + " , " + "oid");
                }
                if (cursor.moveToNext()) {
                    long j2 = cursor.getLong(0);
                    k(j2);
                    com.microsoft.appcenter.utils.a.a("AppCenter", "Deleted log id=" + j2);
                } else {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                l2 = -1L;
                com.microsoft.appcenter.utils.a.c("AppCenter", String.format("Failed to insert values (%s) to database %s.", new Object[]{contentValues.toString(), this.f4616h}), e3);
            }
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException unused) {
            }
        }
        return l2.longValue();
    }
}
