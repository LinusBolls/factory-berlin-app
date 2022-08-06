package com.microsoft.appcenter.distribute.l;

import android.content.Context;
import com.microsoft.appcenter.distribute.h;
import com.microsoft.appcenter.distribute.l.b;

/* compiled from: AbstractReleaseDownloader */
public abstract class a implements b {
    protected final Context a;
    protected final h b;
    protected final b.a c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4477d;

    protected a(Context context, h hVar, b.a aVar) {
        this.a = context;
        this.b = hVar;
        this.c = aVar;
    }

    public h c() {
        return this.b;
    }

    public void cancel() {
        this.f4477d = true;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.f4477d;
    }
}
