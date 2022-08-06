package com.sensorberg.smartworkspace.app.widgets;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: IotDeviceDetailHeaderView.kt */
public final class b extends ConstraintLayout {
    /* access modifiers changed from: private */
    public l<? super String, x> A;
    private boolean B;
    private final ImageView w;
    private final TextView x;
    private final View y;
    private final View.OnClickListener z = new a(this);

    /* compiled from: IotDeviceDetailHeaderView.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f8048g;

        a(b bVar) {
            this.f8048g = bVar;
        }

        public final void onClick(View view) {
            this.f8048g.r();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.widgets.b$b  reason: collision with other inner class name */
    /* compiled from: IotDeviceDetailHeaderView.kt */
    static final class C0541b implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f8049g;

        C0541b(b bVar) {
            this.f8049g = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.e(dialogInterface, "dialog");
            dialogInterface.dismiss();
            l p = this.f8049g.A;
            if (p != null) {
                x xVar = (x) p.o("<<this is the new name>>");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        e.a.a(this);
        LayoutInflater.from(context).inflate(j.iotdevice_detail_header_view, this, true);
        View findViewById = findViewById(i.iotdevice_header_icon);
        k.d(findViewById, "findViewById(R.id.iotdevice_header_icon)");
        this.w = (ImageView) findViewById;
        View findViewById2 = findViewById(i.iotdevice_header_title);
        k.d(findViewById2, "findViewById(R.id.iotdevice_header_title)");
        this.x = (TextView) findViewById2;
        View findViewById3 = findViewById(i.iotdevice_header_underline);
        k.d(findViewById3, "findViewById(R.id.iotdevice_header_underline)");
        this.y = findViewById3;
        this.x.setOnClickListener(this.z);
        this.y.setOnClickListener(this.z);
        if (attributeSet != null) {
            Context context2 = getContext();
            k.d(context2, "getContext()");
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, k.IotDeviceDetailHeaderView, 0, 0);
            try {
                setTitle(obtainStyledAttributes.getString(k.IotDeviceDetailHeaderView_header_title));
                setIcon(obtainStyledAttributes.getDrawable(k.IotDeviceDetailHeaderView_header_icon));
                setEditable(obtainStyledAttributes.getBoolean(k.IotDeviceDetailHeaderView_header_editable, true));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void r() {
        if (this.B) {
            b.a aVar = new b.a(getContext());
            aVar.q("New name");
            aVar.n("Ok", new C0541b(this));
            aVar.r();
        }
    }

    public final void setEditable(boolean z2) {
        this.B = z2;
        this.y.setVisibility(z2 ? 0 : 8);
    }

    public final void setIcon(Drawable drawable) {
        this.w.setImageDrawable(drawable);
    }

    public final void setOnEditListener(l<? super String, x> lVar) {
        k.e(lVar, "listener");
        this.A = lVar;
    }

    public final void setTitle(String str) {
        this.x.setText(str);
    }

    public final void setIcon(int i2) {
        this.w.setImageResource(i2);
    }
}
