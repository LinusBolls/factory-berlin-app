package com.google.firebase.crashlytics.d.h;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils */
public final class v {

    /* compiled from: ExecutorUtils */
    class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        /* renamed from: com.google.firebase.crashlytics.d.h.v$a$a  reason: collision with other inner class name */
        /* compiled from: ExecutorUtils */
        class C0090a extends d {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Runnable f3980g;

            C0090a(a aVar, Runnable runnable) {
                this.f3980g = runnable;
            }

            public void a() {
                this.f3980g.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0090a(this, runnable));
            newThread.setName(this.a + this.b.getAndIncrement());
            return newThread;
        }
    }

    /* compiled from: ExecutorUtils */
    class b extends d {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f3981g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ExecutorService f3982h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f3983i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ TimeUnit f3984j;

        b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            this.f3981g = str;
            this.f3982h = executorService;
            this.f3983i = j2;
            this.f3984j = timeUnit;
        }

        public void a() {
            try {
                com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
                f2.b("Executing shutdown hook for " + this.f3981g);
                this.f3982h.shutdown();
                if (!this.f3982h.awaitTermination(this.f3983i, this.f3984j)) {
                    com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
                    f3.b(this.f3981g + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f3982h.shutdownNow();
                }
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f3981g}));
                this.f3982h.shutdownNow();
            }
        }
    }

    private static final void a(String str, ExecutorService executorService) {
        b(str, executorService, 2, TimeUnit.SECONDS);
    }

    public static final void b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j2, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(d(str));
        a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    public static final ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1));
    }
}
