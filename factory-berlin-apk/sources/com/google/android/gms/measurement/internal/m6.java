package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.f;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class m6 {
    final Context a;
    String b;
    String c;

    /* renamed from: d  reason: collision with root package name */
    String f2973d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f2974e;

    /* renamed from: f  reason: collision with root package name */
    long f2975f;

    /* renamed from: g  reason: collision with root package name */
    f f2976g;

    /* renamed from: h  reason: collision with root package name */
    boolean f2977h = true;

    /* renamed from: i  reason: collision with root package name */
    Long f2978i;

    public m6(Context context, f fVar, Long l2) {
        r.k(context);
        Context applicationContext = context.getApplicationContext();
        r.k(applicationContext);
        this.a = applicationContext;
        this.f2978i = l2;
        if (fVar != null) {
            this.f2976g = fVar;
            this.b = fVar.f2289l;
            this.c = fVar.f2288k;
            this.f2973d = fVar.f2287j;
            this.f2977h = fVar.f2286i;
            this.f2975f = fVar.f2285h;
            Bundle bundle = fVar.f2290m;
            if (bundle != null) {
                this.f2974e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
