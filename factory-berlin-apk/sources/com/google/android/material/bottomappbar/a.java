package com.google.android.material.bottomappbar;

import g.b.a.c.c0.f;
import g.b.a.c.c0.m;

/* compiled from: BottomAppBarTopEdgeTreatment */
public class a extends f implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    private float f3401g;

    /* renamed from: h  reason: collision with root package name */
    private float f3402h;

    /* renamed from: i  reason: collision with root package name */
    private float f3403i;

    /* renamed from: j  reason: collision with root package name */
    private float f3404j;

    /* renamed from: k  reason: collision with root package name */
    private float f3405k;

    public void c(float f2, float f3, float f4, m mVar) {
        float f5 = f2;
        m mVar2 = mVar;
        float f6 = this.f3403i;
        if (f6 == 0.0f) {
            mVar2.l(f5, 0.0f);
            return;
        }
        float f7 = ((this.f3402h * 2.0f) + f6) / 2.0f;
        float f8 = f4 * this.f3401g;
        float f9 = f3 + this.f3405k;
        float f10 = (this.f3404j * f4) + ((1.0f - f4) * f7);
        if (f10 / f7 >= 1.0f) {
            mVar2.l(f5, 0.0f);
            return;
        }
        float f11 = f7 + f8;
        float f12 = f10 + f8;
        float sqrt = (float) Math.sqrt((double) ((f11 * f11) - (f12 * f12)));
        float f13 = f9 - sqrt;
        float f14 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f12)));
        float f15 = 90.0f - degrees;
        mVar2.l(f13, 0.0f);
        float f16 = f8 * 2.0f;
        float f17 = degrees;
        mVar.a(f13 - f8, 0.0f, f13 + f8, f16, 270.0f, degrees);
        mVar.a(f9 - f7, (-f7) - f10, f9 + f7, f7 - f10, 180.0f - f15, (f15 * 2.0f) - 180.0f);
        mVar.a(f14 - f8, 0.0f, f14 + f8, f16, 270.0f - f17, f17);
        mVar2.l(f5, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f3404j;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f3402h;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f3401g;
    }

    public float g() {
        return this.f3403i;
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        this.f3404j = f2;
    }

    /* access modifiers changed from: package-private */
    public void m(float f2) {
        this.f3402h = f2;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        this.f3401g = f2;
    }

    public void r(float f2) {
        this.f3403i = f2;
    }

    /* access modifiers changed from: package-private */
    public void s(float f2) {
        this.f3405k = f2;
    }
}
