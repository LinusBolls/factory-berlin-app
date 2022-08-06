package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.j.c;

public abstract class Worker extends ListenableWorker {

    /* renamed from: j  reason: collision with root package name */
    c<ListenableWorker.a> f1558j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.f1558j.p(Worker.this.o());
            } catch (Throwable th) {
                Worker.this.f1558j.q(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final g.b.b.a.a.a<ListenableWorker.a> l() {
        this.f1558j = c.t();
        b().execute(new a());
        return this.f1558j;
    }

    public abstract ListenableWorker.a o();
}
