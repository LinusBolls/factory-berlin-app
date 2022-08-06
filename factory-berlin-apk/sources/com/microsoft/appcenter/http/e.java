package com.microsoft.appcenter.http;

import com.microsoft.appcenter.http.d;
import java.util.Map;

/* compiled from: HttpClientCallDecorator */
abstract class e implements Runnable, k, l {

    /* renamed from: g  reason: collision with root package name */
    private final d f4499g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4500h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4501i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, String> f4502j;

    /* renamed from: k  reason: collision with root package name */
    private final d.a f4503k;

    /* renamed from: l  reason: collision with root package name */
    final l f4504l;

    /* renamed from: m  reason: collision with root package name */
    k f4505m;

    e(d dVar, String str, String str2, Map<String, String> map, d.a aVar, l lVar) {
        this.f4499g = dVar;
        this.f4500h = str;
        this.f4501i = str2;
        this.f4502j = map;
        this.f4503k = aVar;
        this.f4504l = lVar;
    }

    public void a(i iVar) {
        this.f4504l.a(iVar);
    }

    public void b(Exception exc) {
        this.f4504l.b(exc);
    }

    public synchronized void cancel() {
        this.f4505m.cancel();
    }

    public synchronized void run() {
        this.f4505m = this.f4499g.p0(this.f4500h, this.f4501i, this.f4502j, this.f4503k, this);
    }
}
