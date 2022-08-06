package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class e0 extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ Bundle f2275k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ Activity f2276l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ h.b f2277m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e0(h.b bVar, Bundle bundle, Activity activity) {
        super(h.this);
        this.f2277m = bVar;
        this.f2275k = bundle;
        this.f2276l = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Bundle bundle;
        if (this.f2275k != null) {
            bundle = new Bundle();
            if (this.f2275k.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f2275k.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        h.this.f2311h.onActivityCreated(b.S0(this.f2276l), bundle, this.f2313h);
    }
}
