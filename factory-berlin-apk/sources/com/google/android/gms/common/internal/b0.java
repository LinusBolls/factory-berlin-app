package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.h;
import java.util.concurrent.TimeUnit;

final class b0 implements e.a {
    private final /* synthetic */ e a;
    private final /* synthetic */ h b;
    private final /* synthetic */ q.a c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q.b f2113d;

    b0(e eVar, h hVar, q.a aVar, q.b bVar) {
        this.a = eVar;
        this.b = hVar;
        this.c = aVar;
        this.f2113d = bVar;
    }

    public final void a(Status status) {
        if (status.q()) {
            this.b.c(this.c.a(this.a.d(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.b(this.f2113d.a(status));
    }
}
