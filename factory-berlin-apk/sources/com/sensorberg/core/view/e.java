package com.sensorberg.core.view;

import android.content.Context;
import g.e.d.j;
import kotlin.jvm.internal.k;

/* compiled from: IotUnitImageView.kt */
public final class e extends c {
    private String a;
    private String b;
    private float c = 41.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f5063d = 41.0f;

    public e(Context context) {
        k.e(context, "context");
        String string = context.getString(j.iotUnitGatewaySmallPath);
        k.d(string, "context.getString(R.stri….iotUnitGatewaySmallPath)");
        this.a = string;
        String string2 = context.getString(j.iotUnitCylinderSmallPath);
        k.d(string2, "context.getString(R.stri…iotUnitCylinderSmallPath)");
        this.b = string2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public float c() {
        return this.f5063d;
    }

    public float e() {
        return this.c;
    }
}
