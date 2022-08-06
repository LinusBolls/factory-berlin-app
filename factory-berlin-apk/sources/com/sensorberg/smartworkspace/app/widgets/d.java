package com.sensorberg.smartworkspace.app.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: IotDeviceDetailSwitch.kt */
public final class d extends RelativeLayout {

    /* renamed from: g  reason: collision with root package name */
    private f f8052g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f8053h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f8054i;

    /* renamed from: j  reason: collision with root package name */
    private final Switch f8055j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public l<? super Boolean, x> f8056k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f8057l;

    /* compiled from: IotDeviceDetailSwitch.kt */
    static final class a implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            l a2;
            if (!this.a.f8057l && (a2 = this.a.f8056k) != null) {
                x xVar = (x) a2.o(Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        e.a.a(this);
        LayoutInflater.from(context).inflate(j.iotdevice_detail_switch, this, true);
        View findViewById = findViewById(i.iotdevice_switch_title);
        k.d(findViewById, "findViewById(R.id.iotdevice_switch_title)");
        this.f8053h = (TextView) findViewById;
        View findViewById2 = findViewById(i.iotdevice_switch_subtitle);
        k.d(findViewById2, "findViewById(R.id.iotdevice_switch_subtitle)");
        this.f8054i = (TextView) findViewById2;
        View findViewById3 = findViewById(i.iotdevice_switch_switch);
        k.d(findViewById3, "findViewById(R.id.iotdevice_switch_switch)");
        Switch switchR = (Switch) findViewById3;
        this.f8055j = switchR;
        switchR.setOnCheckedChangeListener(c());
        if (attributeSet != null) {
            Context context2 = getContext();
            k.d(context2, "getContext()");
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, k.IotDeviceDetailSwitch, 0, 0);
            try {
                setTitle(obtainStyledAttributes.getString(k.IotDeviceDetailSwitch_switch_title));
                setSubTitle(obtainStyledAttributes.getString(k.IotDeviceDetailSwitch_switch_subtitle));
                setChecked(obtainStyledAttributes.getBoolean(k.IotDeviceDetailSwitch_switch_state, false));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private final CompoundButton.OnCheckedChangeListener c() {
        return new a(this);
    }

    public final boolean getChecked() {
        return this.f8055j.isChecked();
    }

    public final void setChecked(boolean z) {
        this.f8057l = true;
        this.f8055j.setChecked(z);
        this.f8057l = false;
    }

    public void setIsLoading(boolean z) {
        f fVar = this.f8052g;
        if (fVar != null) {
            fVar.c(z);
        }
    }

    public final void setOnCheckedChangeListener(l<? super Boolean, x> lVar) {
        this.f8056k = lVar;
    }

    public final void setSubTitle(String str) {
        this.f8054i.setText(str);
    }

    public final void setTitle(String str) {
        this.f8053h.setText(str);
    }

    public void setValueAnimator(ValueAnimator valueAnimator) {
        k.e(valueAnimator, "animator");
        this.f8052g = new f(n.i(this.f8055j, this.f8054i), valueAnimator);
    }
}
