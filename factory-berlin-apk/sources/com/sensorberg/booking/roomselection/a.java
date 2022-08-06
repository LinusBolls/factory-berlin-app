package com.sensorberg.booking.roomselection;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.k;

/* compiled from: BookableRoomSpanSizeLookup.kt */
public final class a extends GridLayoutManager.c {

    /* renamed from: e  reason: collision with root package name */
    private final e f5013e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5014f;

    public a(e eVar, int i2) {
        k.e(eVar, "getItemViewType");
        this.f5013e = eVar;
        this.f5014f = i2;
    }

    public int f(int i2) {
        if (this.f5013e.getItemViewType(i2) != 1) {
            return this.f5014f;
        }
        return 1;
    }
}
