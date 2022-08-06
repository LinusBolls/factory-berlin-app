package com.sensorberg.encryptor;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: NoBackUpContext.kt */
public final class l extends ContextWrapper {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        k.f(context, "base");
    }

    public File getDatabasePath(String str) {
        k.f(str, "name");
        return new File(getNoBackupFilesDir(), str);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
        k.f(str, "name");
        return openOrCreateDatabase(str, i2, cursorFactory, (DatabaseErrorHandler) null);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        k.f(str, "name");
        String absolutePath = getDatabasePath(str).getAbsolutePath();
        a.a("Opening encrypted database on no-backup folder: " + absolutePath, new Object[0]);
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(absolutePath, cursorFactory, databaseErrorHandler);
        k.b(openOrCreateDatabase, "SQLiteDatabase.openOrCre…h, factory, errorHandler)");
        return openOrCreateDatabase;
    }
}
