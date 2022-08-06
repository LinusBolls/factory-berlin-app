package e.b.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor */
public class b extends c {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new a(this));
    private volatile Handler c;

    /* compiled from: DefaultTaskExecutor */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);

        a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
            return thread;
        }
    }

    private static Handler e(Looper looper) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return Handler.createAsync(looper);
        }
        if (i2 >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void d(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = e(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }
}
