package com.sensorberg.smartworkspace.app.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceDetailInfo.kt */
public final class c extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    private final TextView f8050g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f8051h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        e.a.a(this);
        setOrientation(1);
        LayoutInflater.from(context).inflate(j.iotdevice_detail_info, this, true);
        View findViewById = findViewById(i.iotdevice_info_line1);
        k.d(findViewById, "findViewById(R.id.iotdevice_info_line1)");
        this.f8050g = (TextView) findViewById;
        View findViewById2 = findViewById(i.iotdevice_info_line2);
        k.d(findViewById2, "findViewById(R.id.iotdevice_info_line2)");
        this.f8051h = (TextView) findViewById2;
    }

    public final void a(String str, String str2) {
        this.f8050g.setText(str);
        this.f8051h.setText(str2);
    }
}
