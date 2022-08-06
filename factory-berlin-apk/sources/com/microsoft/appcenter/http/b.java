package com.microsoft.appcenter.http;

import android.os.AsyncTask;
import com.microsoft.appcenter.http.c;
import com.microsoft.appcenter.http.d;
import com.microsoft.appcenter.utils.e;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: DefaultHttpClient */
public class b implements d, c.a {

    /* renamed from: g  reason: collision with root package name */
    private final Set<c> f4487g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4488h;

    /* compiled from: DefaultHttpClient */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l f4489g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ RejectedExecutionException f4490h;

        a(b bVar, l lVar, RejectedExecutionException rejectedExecutionException) {
            this.f4489g = lVar;
            this.f4490h = rejectedExecutionException;
        }

        public void run() {
            this.f4489g.b(this.f4490h);
        }
    }

    /* renamed from: com.microsoft.appcenter.http.b$b  reason: collision with other inner class name */
    /* compiled from: DefaultHttpClient */
    class C0124b implements k {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f4491g;

        C0124b(b bVar, c cVar) {
            this.f4491g = cVar;
        }

        public void cancel() {
            this.f4491g.cancel(true);
        }
    }

    public b(boolean z) {
        this.f4488h = z;
    }

    public synchronized void a(c cVar) {
        this.f4487g.add(cVar);
    }

    public synchronized void b(c cVar) {
        this.f4487g.remove(cVar);
    }

    public void c() {
    }

    public synchronized void close() {
        if (this.f4487g.size() > 0) {
            com.microsoft.appcenter.utils.a.a("AppCenter", "Cancelling " + this.f4487g.size() + " network call(s).");
            for (c cancel : this.f4487g) {
                cancel.cancel(true);
            }
            this.f4487g.clear();
        }
    }

    public k p0(String str, String str2, Map<String, String> map, d.a aVar, l lVar) {
        c cVar = new c(str, str2, map, aVar, lVar, this, this.f4488h);
        try {
            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (RejectedExecutionException e2) {
            e.b(new a(this, lVar, e2));
        }
        return new C0124b(this, cVar);
    }
}
