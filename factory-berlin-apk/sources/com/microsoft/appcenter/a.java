package com.microsoft.appcenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.microsoft.appcenter.j.b;
import com.microsoft.appcenter.utils.o.d;

/* compiled from: AbstractAppCenterService */
public abstract class a implements d {

    /* renamed from: g  reason: collision with root package name */
    protected b f4411g;

    /* renamed from: h  reason: collision with root package name */
    private c f4412h;

    /* renamed from: com.microsoft.appcenter.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractAppCenterService */
    class C0121a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Runnable f4413g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Runnable f4414h;

        C0121a(Runnable runnable, Runnable runnable2) {
            this.f4413g = runnable;
            this.f4414h = runnable2;
        }

        public void run() {
            if (a.this.d()) {
                this.f4413g.run();
                return;
            }
            Runnable runnable = this.f4414h;
            if (runnable != null) {
                runnable.run();
                return;
            }
            com.microsoft.appcenter.utils.a.e("AppCenter", a.this.b() + " service disabled, discarding calls.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(boolean r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.d()     // Catch:{ all -> 0x0085 }
            r1 = 1
            r2 = 0
            r3 = 2
            if (r13 != r0) goto L_0x002a
            java.lang.String r0 = r12.o()     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "%s service has already been %s."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = r12.b()     // Catch:{ all -> 0x0085 }
            r3[r2] = r5     // Catch:{ all -> 0x0085 }
            if (r13 == 0) goto L_0x001d
            java.lang.String r13 = "enabled"
            goto L_0x001f
        L_0x001d:
            java.lang.String r13 = "disabled"
        L_0x001f:
            r3[r1] = r13     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0085 }
            com.microsoft.appcenter.utils.a.e(r0, r13)     // Catch:{ all -> 0x0085 }
            monitor-exit(r12)
            return
        L_0x002a:
            java.lang.String r5 = r12.n()     // Catch:{ all -> 0x0085 }
            com.microsoft.appcenter.j.b r0 = r12.f4411g     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0057
            if (r13 == 0) goto L_0x004d
            com.microsoft.appcenter.j.b r4 = r12.f4411g     // Catch:{ all -> 0x0085 }
            int r6 = r12.p()     // Catch:{ all -> 0x0085 }
            long r7 = r12.q()     // Catch:{ all -> 0x0085 }
            int r9 = r12.r()     // Catch:{ all -> 0x0085 }
            r10 = 0
            com.microsoft.appcenter.j.b$a r11 = r12.l()     // Catch:{ all -> 0x0085 }
            r4.l(r5, r6, r7, r9, r10, r11)     // Catch:{ all -> 0x0085 }
            goto L_0x0057
        L_0x004d:
            com.microsoft.appcenter.j.b r0 = r12.f4411g     // Catch:{ all -> 0x0085 }
            r0.j(r5)     // Catch:{ all -> 0x0085 }
            com.microsoft.appcenter.j.b r0 = r12.f4411g     // Catch:{ all -> 0x0085 }
            r0.h(r5)     // Catch:{ all -> 0x0085 }
        L_0x0057:
            java.lang.String r0 = r12.m()     // Catch:{ all -> 0x0085 }
            com.microsoft.appcenter.utils.o.d.k(r0, r13)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r12.o()     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "%s service has been %s."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = r12.b()     // Catch:{ all -> 0x0085 }
            r3[r2] = r5     // Catch:{ all -> 0x0085 }
            if (r13 == 0) goto L_0x0071
            java.lang.String r2 = "enabled"
            goto L_0x0073
        L_0x0071:
            java.lang.String r2 = "disabled"
        L_0x0073:
            r3[r1] = r2     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0085 }
            com.microsoft.appcenter.utils.a.e(r0, r1)     // Catch:{ all -> 0x0085 }
            com.microsoft.appcenter.j.b r0 = r12.f4411g     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0083
            r12.k(r13)     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r12)
            return
        L_0x0085:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.a.a(boolean):void");
    }

    public void c(String str, String str2) {
    }

    public synchronized boolean d() {
        return d.a(m(), true);
    }

    public boolean e() {
        return true;
    }

    public final synchronized void h(c cVar) {
        this.f4412h = cVar;
    }

    public void i() {
    }

    public synchronized void j(Context context, b bVar, String str, String str2, boolean z) {
        String n2 = n();
        boolean d2 = d();
        if (n2 != null) {
            bVar.h(n2);
            if (d2) {
                bVar.l(n2, p(), q(), r(), (com.microsoft.appcenter.k.b) null, l());
            } else {
                bVar.j(n2);
            }
        }
        this.f4411g = bVar;
        k(d2);
    }

    /* access modifiers changed from: protected */
    public synchronized void k(boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public b.a l() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String m() {
        return "enabled_" + b();
    }

    /* access modifiers changed from: protected */
    public abstract String n();

    /* access modifiers changed from: protected */
    public abstract String o();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* access modifiers changed from: protected */
    public abstract int p();

    /* access modifiers changed from: protected */
    public long q() {
        return 3000;
    }

    /* access modifiers changed from: protected */
    public int r() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public synchronized void s(Runnable runnable) {
        t(runnable, (Runnable) null, (Runnable) null);
    }

    /* access modifiers changed from: protected */
    public synchronized boolean t(Runnable runnable, Runnable runnable2, Runnable runnable3) {
        if (this.f4412h == null) {
            com.microsoft.appcenter.utils.a.b("AppCenter", b() + " needs to be started before it can be used.");
            return false;
        }
        this.f4412h.a(new C0121a(runnable, runnable3), runnable2);
        return true;
    }
}
