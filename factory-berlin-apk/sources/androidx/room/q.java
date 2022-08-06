package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.x.a;
import androidx.room.x.d;
import e.s.a.b;
import e.s.a.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper */
class q implements c {
    private final Context a;
    private final String b;
    private final File c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1440d;

    /* renamed from: e  reason: collision with root package name */
    private final c f1441e;

    /* renamed from: f  reason: collision with root package name */
    private c f1442f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1443g;

    q(Context context, String str, File file, int i2, c cVar) {
        this.a = context;
        this.b = str;
        this.c = file;
        this.f1440d = i2;
        this.f1441e = cVar;
    }

    private void d(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.b != null) {
            readableByteChannel = Channels.newChannel(this.a.getAssets().open(this.b));
        } else if (this.c != null) {
            readableByteChannel = new FileInputStream(this.c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.a.getCacheDir());
        createTempFile.deleteOnExit();
        d.a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    private void f() {
        String c2 = c();
        File databasePath = this.a.getDatabasePath(c2);
        c cVar = this.f1442f;
        a aVar = new a(c2, this.a.getFilesDir(), cVar == null || cVar.f1372j);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                d(databasePath);
                aVar.c();
            } else if (this.f1442f == null) {
                aVar.c();
            } else {
                try {
                    int d2 = androidx.room.x.c.d(databasePath);
                    if (d2 == this.f1440d) {
                        aVar.c();
                    } else if (this.f1442f.a(d2, this.f1440d)) {
                        aVar.c();
                    } else {
                        if (this.a.deleteDatabase(c2)) {
                            try {
                                d(databasePath);
                            } catch (IOException e2) {
                                Log.w("ROOM", "Unable to copy database file.", e2);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + c2 + ") for a copy destructive migration.");
                        }
                        aVar.c();
                    }
                } catch (IOException e3) {
                    Log.w("ROOM", "Unable to read database version.", e3);
                    aVar.c();
                }
            }
        } catch (IOException e4) {
            throw new RuntimeException("Unable to copy database file.", e4);
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
    }

    public void a(boolean z) {
        this.f1441e.a(z);
    }

    public synchronized b b() {
        if (!this.f1443g) {
            f();
            this.f1443g = true;
        }
        return this.f1441e.b();
    }

    public String c() {
        return this.f1441e.c();
    }

    public synchronized void close() {
        this.f1441e.close();
        this.f1443g = false;
    }

    /* access modifiers changed from: package-private */
    public void e(c cVar) {
        this.f1442f = cVar;
    }
}
