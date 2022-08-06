package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.q.e;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler */
class q implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final e b;
    private final Thread.UncaughtExceptionHandler c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f3965d = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    interface a {
        void a(e eVar, Thread thread, Throwable th);
    }

    public q(a aVar, e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.b = eVar;
        this.c = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f3965d.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f3965d.set(true);
        if (thread == null) {
            try {
                b.f().d("Could not handle uncaught exception; null thread");
            } catch (Exception e2) {
                b.f().e("An error occurred in the uncaught exception handler", e2);
            } catch (Throwable th2) {
                b.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
                this.f3965d.set(false);
                throw th2;
            }
        } else if (th == null) {
            b.f().d("Could not handle uncaught exception; null throwable");
        } else {
            this.a.a(this.b, thread, th);
        }
        b.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
        this.c.uncaughtException(thread, th);
        this.f3965d.set(false);
    }
}
