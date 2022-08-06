package com.microsoft.appcenter;

import android.os.Handler;
import com.microsoft.appcenter.j.b;
import com.microsoft.appcenter.utils.j;
import java.lang.Thread;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: UncaughtExceptionHandler */
class i implements Thread.UncaughtExceptionHandler {
    private final Handler a;
    /* access modifiers changed from: private */
    public final b b;
    private Thread.UncaughtExceptionHandler c;

    /* compiled from: UncaughtExceptionHandler */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Semaphore f4515g;

        a(Semaphore semaphore) {
            this.f4515g = semaphore;
        }

        public void run() {
            i.this.b.i();
            com.microsoft.appcenter.utils.a.a("AppCenter", "Channel completed shutdown.");
            this.f4515g.release();
        }
    }

    i(Handler handler, b bVar) {
        this.a = handler;
        this.b = bVar;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.c = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (b.o().r()) {
            Semaphore semaphore = new Semaphore(0);
            this.a.post(new a(semaphore));
            try {
                if (!semaphore.tryAcquire(5000, TimeUnit.MILLISECONDS)) {
                    com.microsoft.appcenter.utils.a.b("AppCenter", "Timeout waiting for looper tasks to complete.");
                }
            } catch (InterruptedException e2) {
                com.microsoft.appcenter.utils.a.j("AppCenter", "Interrupted while waiting looper to flush.", e2);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            j.a(10);
        }
    }
}
