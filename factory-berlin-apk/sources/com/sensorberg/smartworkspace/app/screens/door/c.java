package com.sensorberg.smartworkspace.app.screens.door;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.n0;
import com.sensorberg.smartworkspace.app.utils.b;
import g.e.n.g.x;
import kotlin.jvm.internal.k;

/* compiled from: NearbyContainerViewModel.kt */
public final class c extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<Boolean> f7356i;

    public c(x xVar) {
        k.e(xVar, "unitController");
        this.f7356i = b.a.a(xVar);
    }

    public final LiveData<Boolean> r() {
        return this.f7356i;
    }
}
