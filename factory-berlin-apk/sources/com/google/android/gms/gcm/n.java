package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.os.Trace;
import com.google.android.gms.common.util.l;
import com.google.android.gms.iid.e;
import com.google.android.gms.iid.f;
import java.io.Closeable;

public final class n implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final f<Boolean> f2221h = e.b().a("nts.enable_tracing", true);

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2222g;

    @TargetApi(18)
    public n(String str) {
        boolean z = l.d() && f2221h.get().booleanValue();
        this.f2222g = z;
        if (z) {
            Trace.beginSection(str.length() > 127 ? str.substring(0, 127) : str);
        }
    }

    @TargetApi(18)
    public final void close() {
        if (this.f2222g) {
            Trace.endSection();
        }
    }
}
