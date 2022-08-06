package com.sensorberg.smartworkspace.app.widgets;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.SeekBar;
import androidx.appcompat.widget.u;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00017\u0018\u0000 G2\u00020\u0001:\u0003GHIB\u0019\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b.\u0010,J\u000f\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u0010\bR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006J"}, d2 = {"Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar;", "Landroidx/appcompat/widget/u;", "", "endValue", "", "animateTextAlpha", "(I)V", "getTextAlpha", "()I", "", "getTextPadding", "()F", "getTextSize", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "initChangeListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "refreshPadding", "()V", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$SeekbarFormatter;", "formatter", "setFormatter", "(Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$SeekbarFormatter;)V", "l", "setOnSeekBarChangeListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "left", "top", "right", "bottom", "setPadding", "(IIII)V", "start", "end", "setPaddingRelative", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$ProgressChangedListener;", "listener", "setProgressChangedListener", "(Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$ProgressChangedListener;)V", "textPadding", "setTextPadding", "(F)V", "size", "setTextSize", "textHeight", "Landroid/animation/ObjectAnimator;", "animator", "Landroid/animation/ObjectAnimator;", "progressChangeListener", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$ProgressChangedListener;", "requestedTopPadding", "I", "com/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$textAlphaProperty$1", "textAlphaProperty", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$textAlphaProperty$1;", "textBottomPadding", "F", "textFormatter", "Lcom/sensorberg/smartworkspace/app/widgets/CaptionedSeekBar$SeekbarFormatter;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "ProgressChangedListener", "SeekbarFormatter", "widgets_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: CaptionedSeekBar.kt */
public final class CaptionedSeekBar extends u {
    private static final a o = new a();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final TextPaint f8022h = new TextPaint();

    /* renamed from: i  reason: collision with root package name */
    private int f8023i = getPaddingTop();

    /* renamed from: j  reason: collision with root package name */
    private float f8024j;

    /* renamed from: k  reason: collision with root package name */
    private d f8025k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public c f8026l;

    /* renamed from: m  reason: collision with root package name */
    private ObjectAnimator f8027m;

    /* renamed from: n  reason: collision with root package name */
    private final f f8028n;

    /* compiled from: CaptionedSeekBar.kt */
    public static final class a implements d {
        a() {
        }

        public String a(int i2) {
            return String.valueOf(i2);
        }
    }

    /* compiled from: CaptionedSeekBar.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CaptionedSeekBar.kt */
    public interface c {
        void a(int i2);
    }

    /* compiled from: CaptionedSeekBar.kt */
    public interface d {
        String a(int i2);
    }

    /* compiled from: CaptionedSeekBar.kt */
    public static final class e implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ CaptionedSeekBar a;
        final /* synthetic */ kotlin.jvm.internal.u b;

        e(CaptionedSeekBar captionedSeekBar, kotlin.jvm.internal.u uVar) {
            this.a = captionedSeekBar;
            this.b = uVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                this.b.f10686g = Integer.valueOf(i2);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.b.f10686g = null;
            this.a.d(255);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.a.d(0);
            Integer num = (Integer) this.b.f10686g;
            if (num != null) {
                int intValue = num.intValue();
                c b2 = this.a.f8026l;
                if (b2 != null) {
                    b2.a(intValue);
                }
                this.b.f10686g = null;
            }
        }
    }

    /* compiled from: CaptionedSeekBar.kt */
    public static final class f extends Property<CaptionedSeekBar, Integer> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Integer get(CaptionedSeekBar captionedSeekBar) {
            k.e(captionedSeekBar, "instance");
            return Integer.valueOf(captionedSeekBar.getTextAlpha());
        }

        public void b(CaptionedSeekBar captionedSeekBar, int i2) {
            k.e(captionedSeekBar, "instance");
            if (i2 < 0 || i2 > 255) {
                throw new IllegalArgumentException("TextAlpha must be between 0~255");
            } else if (i2 != captionedSeekBar.getTextAlpha()) {
                captionedSeekBar.f8022h.setAlpha(i2);
                captionedSeekBar.postInvalidateOnAnimation();
            }
        }

        public boolean isReadOnly() {
            return false;
        }

        public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
            b((CaptionedSeekBar) obj, ((Number) obj2).intValue());
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptionedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        Resources resources = context.getResources();
        k.d(resources, "context.resources");
        this.f8024j = resources.getDisplayMetrics().density * 4.0f;
        this.f8025k = o;
        this.f8022h.setColor(androidx.core.content.a.c(context, g.primary));
        this.f8022h.setAlpha(0);
        TextPaint textPaint = this.f8022h;
        Resources resources2 = context.getResources();
        k.d(resources2, "context.resources");
        textPaint.setTextSize(resources2.getDisplayMetrics().density * 12.0f);
        this.f8022h.setTextAlign(Paint.Align.CENTER);
        this.f8022h.setFlags(1);
        f();
        super.setOnSeekBarChangeListener(e());
        this.f8028n = new f(Integer.TYPE, "textAlpha");
    }

    /* access modifiers changed from: private */
    public final void d(int i2) {
        ObjectAnimator objectAnimator = this.f8027m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.f8028n, new int[]{i2});
        ofInt.setDuration(600);
        ofInt.setInterpolator(f.f8059f.b());
        x xVar = x.a;
        this.f8027m = ofInt;
        if (ofInt != null) {
            ofInt.start();
        }
    }

    private final SeekBar.OnSeekBarChangeListener e() {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f10686g = null;
        return new e(this, uVar);
    }

    private final void f() {
        setPadding(getPaddingLeft(), this.f8023i, getPaddingRight(), getPaddingBottom());
    }

    private final int g() {
        return (int) (getTextSize() + this.f8024j);
    }

    public final int getTextAlpha() {
        return this.f8022h.getAlpha();
    }

    public final float getTextPadding() {
        return this.f8024j;
    }

    public final float getTextSize() {
        return this.f8022h.getTextSize();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        k.e(canvas, "canvas");
        super.onDraw(canvas);
        if (getTextAlpha() != 0) {
            String a2 = this.f8025k.a(getProgress());
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            canvas.drawText(a2, ((float) getPaddingLeft()) + ((((float) getProgress()) / ((float) getMax())) * ((float) width)), ((float) this.f8023i) - this.f8022h.ascent(), this.f8022h);
        }
    }

    public final void setFormatter(d dVar) {
        k.e(dVar, "formatter");
        this.f8025k = dVar;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        throw new IllegalArgumentException("setOnSeekBarChangeListener have been captured by CaptionedSeekBar. Use `setProgressChangedListener` instead");
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f8023i = i3;
        super.setPadding(i2, i3 + g(), i4, i5);
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        this.f8023i = i3;
        super.setPaddingRelative(i2, i3 + g(), i4, i5);
    }

    public final void setProgressChangedListener(c cVar) {
        this.f8026l = cVar;
    }

    public final void setTextPadding(float f2) {
        this.f8024j = f2;
        f();
    }

    public final void setTextSize(float f2) {
        this.f8022h.setTextSize(f2);
        invalidate();
    }
}
