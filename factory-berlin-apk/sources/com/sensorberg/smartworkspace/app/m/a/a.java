package com.sensorberg.smartworkspace.app.m.a;

import android.view.View;

/* compiled from: OnClickListener */
public final class a implements View.OnClickListener {

    /* renamed from: g  reason: collision with root package name */
    final C0477a f7250g;

    /* renamed from: h  reason: collision with root package name */
    final int f7251h;

    /* renamed from: com.sensorberg.smartworkspace.app.m.a.a$a  reason: collision with other inner class name */
    /* compiled from: OnClickListener */
    public interface C0477a {
        void a(int i2, View view);
    }

    public a(C0477a aVar, int i2) {
        this.f7250g = aVar;
        this.f7251h = i2;
    }

    public void onClick(View view) {
        this.f7250g.a(this.f7251h, view);
    }
}
