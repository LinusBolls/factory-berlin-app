package androidx.room.x;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.l;
import e.s.a.b;
import e.s.a.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: DBUtil */
public class c {
    /* JADX INFO: finally extract failed */
    public static void a(b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor x0 = bVar.x0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (x0.moveToNext()) {
            try {
                arrayList.add(x0.getString(0));
            } catch (Throwable th) {
                x0.close();
                throw th;
            }
        }
        x0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @Deprecated
    public static Cursor b(l lVar, e eVar, boolean z) {
        return c(lVar, eVar, z, (CancellationSignal) null);
    }

    public static Cursor c(l lVar, e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor v = lVar.v(eVar, cancellationSignal);
        if (!z || !(v instanceof AbstractWindowedCursor)) {
            return v;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) v;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : v;
    }

    public static int d(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                return allocate.getInt();
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }
}
