package e.s.a;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase */
public interface b extends Closeable {
    f G(String str);

    Cursor J(e eVar);

    Cursor T(e eVar, CancellationSignal cancellationSignal);

    void beginTransaction();

    void endTransaction();

    void execSQL(String str);

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isOpen();

    void setTransactionSuccessful();

    Cursor x0(String str);
}
