package e.h.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelfDestructiveThread */
public class c {
    private final Object a = new Object();
    private HandlerThread b;
    private Handler c;

    /* renamed from: d  reason: collision with root package name */
    private int f8640d;

    /* renamed from: e  reason: collision with root package name */
    private Handler.Callback f8641e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final int f8642f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8643g;

    /* renamed from: h  reason: collision with root package name */
    private final String f8644h;

    /* compiled from: SelfDestructiveThread */
    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c.this.a();
                return true;
            } else if (i2 != 1) {
                return true;
            } else {
                c.this.b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* compiled from: SelfDestructiveThread */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Callable f8645g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Handler f8646h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f8647i;

        /* compiled from: SelfDestructiveThread */
        class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Object f8648g;

            a(Object obj) {
                this.f8648g = obj;
            }

            public void run() {
                b.this.f8647i.a(this.f8648g);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f8645g = callable;
            this.f8646h = handler;
            this.f8647i = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f8645g.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f8646h.post(new a(obj));
        }
    }

    /* renamed from: e.h.h.c$c  reason: collision with other inner class name */
    /* compiled from: SelfDestructiveThread */
    class C0558c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AtomicReference f8650g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Callable f8651h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ReentrantLock f8652i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f8653j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Condition f8654k;

        C0558c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f8650g = atomicReference;
            this.f8651h = callable;
            this.f8652i = reentrantLock;
            this.f8653j = atomicBoolean;
            this.f8654k = condition;
        }

        public void run() {
            try {
                this.f8650g.set(this.f8651h.call());
            } catch (Exception unused) {
            }
            this.f8652i.lock();
            try {
                this.f8653j.set(false);
                this.f8654k.signal();
            } finally {
                this.f8652i.unlock();
            }
        }
    }

    /* compiled from: SelfDestructiveThread */
    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i2, int i3) {
        this.f8644h = str;
        this.f8643g = i2;
        this.f8642f = i3;
        this.f8640d = 0;
    }

    private void c(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f8644h, this.f8643g);
                this.b = handlerThread;
                handlerThread.start();
                this.c = new Handler(this.b.getLooper(), this.f8641e);
                this.f8640d++;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.a) {
            if (!this.c.hasMessages(1)) {
                this.b.quit();
                this.b = null;
                this.c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            this.c.sendMessageDelayed(this.c.obtainMessage(0), (long) this.f8642f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T e(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            e.h.h.c$c r11 = new e.h.h.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.c(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.h.c.e(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
