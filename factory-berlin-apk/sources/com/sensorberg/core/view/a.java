package com.sensorberg.core.view;

import android.content.Context;
import g.e.d.j;
import kotlin.jvm.internal.k;

/* compiled from: IotUnitImageView.kt */
public final class a extends c {
    private String a;
    private String b;
    private float c = 240.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f5062d = 240.0f;

    public a(Context context) {
        k.e(context, "context");
        String string = context.getString(j.iotUnitGatewayDefaultPath);
        k.d(string, "context.getString(R.stri…otUnitGatewayDefaultPath)");
        this.a = string;
        String string2 = context.getString(j.iotUnitCylinderDefaultPath);
        k.d(string2, "context.getString(R.stri…tUnitCylinderDefaultPath)");
        this.b = string2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public float c() {
        return this.f5062d;
    }

    public float e() {
        return this.c;
    }
}
