package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class x extends g {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Intent f2174g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Activity f2175h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ int f2176i;

    x(Intent intent, Activity activity, int i2) {
        this.f2174g = intent;
        this.f2175h = activity;
        this.f2176i = i2;
    }

    public final void b() {
        Intent intent = this.f2174g;
        if (intent != null) {
            this.f2175h.startActivityForResult(intent, this.f2176i);
        }
    }
}
