package com.sensorberg.smartworkspace.app.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import k.h0.d.d;

public class PinView extends View implements View.OnKeyListener {
    private static final int[] o = {16842912};
    private static final int[] p = {16842914};
    private static final int[] q = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private a f8032g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f8033h;

    /* renamed from: i  reason: collision with root package name */
    private int f8034i;

    /* renamed from: j  reason: collision with root package name */
    private int f8035j;

    /* renamed from: k  reason: collision with root package name */
    private final StringBuilder f8036k = new StringBuilder();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f8037l = false;

    /* renamed from: m  reason: collision with root package name */
    private int f8038m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f8039n;

    public interface a {
        void a(PinView pinView, CharSequence charSequence);
    }

    public PinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private void b(AttributeSet attributeSet) {
        setSaveEnabled(true);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, k.PinView, 0, 0);
        try {
            setDrawable(obtainStyledAttributes.getDrawable(k.PinView_pin_drawable));
            setPinLength(obtainStyledAttributes.getInteger(k.PinView_pin_length, 4));
            setPinPadding(obtainStyledAttributes.getDimensionPixelSize(k.PinView_pin_padding, 0));
            obtainStyledAttributes.recycle();
            setFocusable(true);
            setFocusableInTouchMode(true);
            setOnKeyListener(this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void c(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            if (z) {
                inputMethodManager.showSoftInput(this, 1);
            } else {
                inputMethodManager.hideSoftInputFromInputMethod(getWindowToken(), 2);
            }
        }
    }

    public void d() {
        if (!this.f8037l) {
            this.f8037l = true;
            invalidate();
        }
    }

    public CharSequence getPin() {
        return this.f8036k.toString();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (hasFocus() && isEnabled()) {
            c(true);
        }
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.inputType = 18;
        editorInfo.imeOptions = 6;
        return new BaseInputConnection(this, false);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (hasFocus()) {
            c(false);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f8033h != null) {
            for (int i2 = 0; i2 < this.f8034i; i2++) {
                if (this.f8036k.length() <= i2) {
                    this.f8033h.setState(q);
                } else if (this.f8037l) {
                    this.f8033h.setState(o);
                } else {
                    this.f8033h.setState(p);
                }
                canvas.save();
                canvas.translate((float) this.f8039n[i2], (float) this.f8038m);
                this.f8033h.draw(canvas);
                canvas.restore();
            }
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i2 == 67) {
            if (this.f8036k.length() <= 0) {
                return false;
            }
            StringBuilder sb = this.f8036k;
            sb.setLength(sb.length() - 1);
            this.f8037l = false;
            invalidate();
            return true;
        } else if (this.f8036k.length() >= this.f8034i) {
            return false;
        } else {
            switch (i2) {
                case 7:
                    this.f8036k.append("0");
                    break;
                case 8:
                    this.f8036k.append(d.F);
                    break;
                case 9:
                    this.f8036k.append("2");
                    break;
                case 10:
                    this.f8036k.append("3");
                    break;
                case 11:
                    this.f8036k.append("4");
                    break;
                case 12:
                    this.f8036k.append("5");
                    break;
                case 13:
                    this.f8036k.append("6");
                    break;
                case 14:
                    this.f8036k.append("7");
                    break;
                case 15:
                    this.f8036k.append("8");
                    break;
                case 16:
                    this.f8036k.append("9");
                    break;
                default:
                    return false;
            }
            this.f8037l = false;
            if (this.f8032g != null && this.f8036k.length() == this.f8034i) {
                this.f8032g.a(this, this.f8036k.toString());
            }
            invalidate();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int intrinsicWidth = this.f8033h.getIntrinsicWidth();
        int i4 = this.f8034i;
        int i5 = (intrinsicWidth * i4) + (this.f8035j * (i4 - 1));
        int intrinsicHeight = this.f8033h.getIntrinsicHeight();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            i5 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i5 = Math.min(i5, size);
        }
        if (mode2 == 1073741824) {
            intrinsicHeight = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            intrinsicHeight = Math.min(intrinsicHeight, size2);
        }
        setMeasuredDimension(i5, intrinsicHeight);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        setPin(bVar.f8040g);
        super.onRestoreInstanceState(bVar.getSuperState());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new b(super.onSaveInstanceState(), this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        Drawable drawable;
        int i6;
        int i7;
        if (i2 != 0 && i3 != 0 && (drawable = this.f8033h) != null) {
            int i8 = this.f8035j * (this.f8034i - 1);
            if (drawable.getIntrinsicWidth() > 0) {
                int intrinsicWidth = this.f8033h.getIntrinsicWidth();
                int i9 = this.f8034i;
                if ((intrinsicWidth * i9) + i8 > i2) {
                    i6 = (i2 - i8) / i9;
                } else {
                    i6 = this.f8033h.getIntrinsicWidth();
                }
            } else {
                i6 = i2 / 4;
            }
            int min = this.f8033h.getIntrinsicHeight() > 0 ? Math.min(this.f8033h.getIntrinsicHeight(), i3) : i3;
            this.f8033h.setBounds(0, 0, i6, min);
            int i10 = i2 / 2;
            this.f8038m = (i3 / 2) - (min / 2);
            int i11 = this.f8034i;
            if (i11 % 2 == 0) {
                int i12 = i10 - ((i11 / 2) * i6);
                int i13 = this.f8035j;
                i7 = (i12 - (((i11 - 2) / 2) * i13)) - (i13 / 2);
            } else {
                i7 = ((i10 - ((i11 / 2) * i6)) - (i6 / 2)) - (((i11 - 1) / 2) * this.f8035j);
            }
            for (int i14 = 0; i14 < this.f8034i; i14++) {
                this.f8039n[i14] = ((this.f8035j + i6) * i14) + i7;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            c(true);
        }
        return true;
    }

    public void setDrawable(Drawable drawable) {
        this.f8033h = drawable;
    }

    public void setEnabled(boolean z) {
        if (hasFocus()) {
            c(z);
        }
        super.setEnabled(z);
    }

    public void setPin(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.f8036k.setLength(0);
        } else if (charSequence.length() <= this.f8034i) {
            int i2 = 0;
            while (i2 < charSequence.length()) {
                String valueOf = String.valueOf(charSequence.charAt(i2));
                if ("0123456789".contains(valueOf)) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Only numbers allowed on PIN input. Received " + valueOf);
                }
            }
            this.f8036k.setLength(0);
            this.f8036k.append(charSequence);
        } else {
            throw new IllegalArgumentException("Max pin length is " + this.f8034i);
        }
        invalidate();
    }

    public void setPinLength(int i2) {
        this.f8034i = i2;
        this.f8039n = new int[i2];
        if (this.f8036k.length() > i2) {
            this.f8036k.setLength(0);
        }
    }

    public void setPinListener(a aVar) {
        this.f8032g = aVar;
    }

    public void setPinPadding(int i2) {
        this.f8035j = i2;
    }

    private static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        final String f8040g;

        /* renamed from: h  reason: collision with root package name */
        final boolean f8041h;

        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f8041h = parcel.readInt() != 1 ? false : true;
            this.f8040g = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f8041h ? 1 : 0);
            parcel.writeString(this.f8040g);
        }

        public b(Parcelable parcelable, PinView pinView) {
            super(parcelable);
            this.f8040g = pinView.getPin().toString();
            this.f8041h = pinView.f8037l;
        }
    }
}
