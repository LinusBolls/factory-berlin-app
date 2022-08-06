package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class x3 extends SQLiteOpenHelper {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ y3 f3210g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x3(y3 y3Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f3210g = y3Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e2) {
            throw e2;
        } catch (SQLiteException unused) {
            this.f3210g.i().E().a("Opening the local database failed, dropping and recreating it");
            if (!this.f3210g.j().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f3210g.i().E().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                this.f3210g.i().E().b("Failed to open local database. Events will bypass local storage", e3);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        h.b(this.f3210g.i(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        h.c(this.f3210g.i(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
