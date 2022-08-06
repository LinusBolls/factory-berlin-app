package androidx.work.impl.utils.k;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.f;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor */
public class b implements a {
    private final f a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Executor c = new a();

    /* compiled from: WorkManagerTaskExecutor */
    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.a = new f(executor);
    }

    public Executor a() {
        return this.c;
    }

    public void b(Runnable runnable) {
        this.a.execute(runnable);
    }

    public f c() {
        return this.a;
    }

    public void d(Runnable runnable) {
        this.b.post(runnable);
    }
}
