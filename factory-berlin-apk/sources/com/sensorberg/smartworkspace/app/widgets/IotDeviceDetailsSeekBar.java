package com.sensorberg.smartworkspace.app.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sensorberg.smartworkspace.app.widgets.CaptionedSeekBar;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006,"}, d2 = {"Lcom/sensorberg/smartworkspace/app/widgets/IotDeviceDetailsSeekBar;", "Landroid/widget/LinearLayout;", "", "getProgress", "()I", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$ProgressChangedListener;", "listener", "", "onProgressChanged", "(Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$ProgressChangedListener;)V", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$SeekbarFormatter;", "formatter", "setFormatter", "(Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$SeekbarFormatter;)V", "", "isLoading", "setIsLoading", "(Z)V", "progress", "setProgress", "(I)V", "", "text", "setTitle", "(Ljava/lang/String;)V", "Landroid/animation/ValueAnimator;", "animator", "setValueAnimator", "(Landroid/animation/ValueAnimator;)V", "Lcom/sensorberg/smartworkspace/app/widgets/LoadingAnimation;", "loadingAnimation", "Lcom/sensorberg/smartworkspace/app/widgets/LoadingAnimation;", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar;", "seekbar", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar;", "Landroid/widget/TextView;", "title", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "widgets_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotDeviceDetailsSeekBar.kt */
public final class IotDeviceDetailsSeekBar extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    private f f8029g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f8030h;

    /* renamed from: i  reason: collision with root package name */
    private final CaptionedSeekBar f8031i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IotDeviceDetailsSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        e.a.a(this);
        setOrientation(1);
        LayoutInflater.from(context).inflate(j.iotdevice_detail_seekbar, this, true);
        View findViewById = findViewById(i.iotdevice_seekbar_title);
        k.d(findViewById, "findViewById(R.id.iotdevice_seekbar_title)");
        this.f8030h = (TextView) findViewById;
        View findViewById2 = findViewById(i.iotdevice_seekbar_seekbar);
        k.d(findViewById2, "findViewById(R.id.iotdevice_seekbar_seekbar)");
        this.f8031i = (CaptionedSeekBar) findViewById2;
        if (attributeSet != null) {
            Context context2 = getContext();
            k.d(context2, "getContext()");
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, k.IotDeviceDetailsSeekBar, 0, 0);
            try {
                setTitle(obtainStyledAttributes.getString(k.IotDeviceDetailsSeekBar_seekbar_title));
                this.f8031i.setTextSize(obtainStyledAttributes.getDimension(k.IotDeviceDetailsSeekBar_seekbar_textSize, this.f8031i.getTextSize()));
                this.f8031i.setTextPadding(obtainStyledAttributes.getDimension(k.IotDeviceDetailsSeekBar_seekbar_textPadding, this.f8031i.getTextPadding()));
                this.f8031i.setMax(obtainStyledAttributes.getInt(k.IotDeviceDetailsSeekBar_seekbar_max, 100));
                this.f8031i.setProgress(obtainStyledAttributes.getInt(k.IotDeviceDetailsSeekBar_seekbar_progress, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void a(CaptionedSeekBar.c cVar) {
        k.e(cVar, "listener");
        this.f8031i.setProgressChangedListener(cVar);
    }

    public final int getProgress() {
        return this.f8031i.getProgress();
    }

    public final void setFormatter(CaptionedSeekBar.d dVar) {
        k.e(dVar, "formatter");
        this.f8031i.setFormatter(dVar);
    }

    public void setIsLoading(boolean z) {
        f fVar = this.f8029g;
        if (fVar != null) {
            fVar.c(z);
        }
    }

    public final void setProgress(int i2) {
        this.f8031i.setProgress(i2);
    }

    public final void setTitle(String str) {
        this.f8030h.setText(str);
    }

    public void setValueAnimator(ValueAnimator valueAnimator) {
        k.e(valueAnimator, "animator");
        this.f8029g = new f(m.b(this.f8031i), valueAnimator);
    }
}
