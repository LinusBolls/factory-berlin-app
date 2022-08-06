package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class c0 extends a0 {

    /* renamed from: e  reason: collision with root package name */
    private final Callable<String> f2105e;

    private c0(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.f2105e = callable;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return this.f2105e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
