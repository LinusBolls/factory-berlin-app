package androidx.room.x;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Lock> f1456e = new HashMap();
    private final File a;
    private final Lock b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f1457d;

    public a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.a = file2;
        this.b = a(file2.getAbsolutePath());
        this.c = z;
    }

    private static Lock a(String str) {
        Lock lock;
        synchronized (f1456e) {
            lock = f1456e.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f1456e.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.b.lock();
        if (this.c) {
            try {
                FileChannel channel = new FileOutputStream(this.a).getChannel();
                this.f1457d = channel;
                channel.lock();
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to grab copy lock.", e2);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f1457d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.b.unlock();
    }
}
