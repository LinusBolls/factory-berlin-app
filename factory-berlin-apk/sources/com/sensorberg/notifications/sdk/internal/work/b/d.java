package com.sensorberg.notifications.sdk.internal.work.b;

import androidx.work.ListenableWorker;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: RegistrationHelper.kt */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public final ListenableWorker.a a(String str, long j2, g<?> gVar) {
        k.f(str, "tag");
        k.f(gVar, "task");
        try {
            j.a(gVar, j2, TimeUnit.SECONDS);
            if (gVar.l()) {
                a.a(str + " registration SUCCESS", new Object[0]);
                ListenableWorker.a c = ListenableWorker.a.c();
                k.b(c, "ListenableWorker.Result.success()");
                return c;
            }
            a.c(str + " registration fail. RETRY. " + gVar.h(), new Object[0]);
            ListenableWorker.a b = ListenableWorker.a.b();
            k.b(b, "ListenableWorker.Result.retry()");
            return b;
        } catch (ExecutionException e2) {
            a.c(str + " registration fail. RETRY. " + e2.getMessage(), new Object[0]);
            ListenableWorker.a b2 = ListenableWorker.a.b();
            k.b(b2, "ListenableWorker.Result.retry()");
            return b2;
        } catch (InterruptedException e3) {
            a.e(e3, str + " registration interrupted. RETRY. " + e3.getMessage(), new Object[0]);
            ListenableWorker.a b3 = ListenableWorker.a.b();
            k.b(b3, "ListenableWorker.Result.retry()");
            return b3;
        } catch (TimeoutException e4) {
            a.c(str + " registration timeout. RETRY. " + e4.getMessage(), new Object[0]);
            ListenableWorker.a b4 = ListenableWorker.a.b();
            k.b(b4, "ListenableWorker.Result.retry()");
            return b4;
        } catch (Exception e5) {
            a.e(e5, str + " registration unknown error. RETRY. " + e5.getMessage(), new Object[0]);
            ListenableWorker.a b5 = ListenableWorker.a.b();
            k.b(b5, "ListenableWorker.Result.retry()");
            return b5;
        }
    }
}
