package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceSpanSizeLookup.kt */
public final class b extends GridLayoutManager.c {

    /* renamed from: e  reason: collision with root package name */
    private final a f7821e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7822f;

    public b(a aVar, int i2) {
        k.e(aVar, "getItemViewType");
        this.f7821e = aVar;
        this.f7822f = i2;
    }

    public int f(int i2) {
        int itemViewType = this.f7821e.getItemViewType(i2);
        if (itemViewType == 1 || itemViewType == 9) {
            return 1;
        }
        return this.f7822f;
    }
}
