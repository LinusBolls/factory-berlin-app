package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.m;
import e.h.k.d0.c;
import e.h.k.u;

public class CheckableImageButton extends m implements Checkable {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f3588l = {16842912};

    /* renamed from: i  reason: collision with root package name */
    private boolean f3589i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3590j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3591k;

    class a extends e.h.k.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.U(CheckableImageButton.this.a());
            cVar.V(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends e.j.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        boolean f3593i;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f3593i = z;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3593i ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.imageButtonStyle);
    }

    public boolean a() {
        return this.f3590j;
    }

    public boolean isChecked() {
        return this.f3589i;
    }

    public int[] onCreateDrawableState(int i2) {
        if (this.f3589i) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + f3588l.length), f3588l);
        }
        return super.onCreateDrawableState(i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f3593i);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3593i = this.f3589i;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f3590j != z) {
            this.f3590j = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f3590j && this.f3589i != z) {
            this.f3589i = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f3591k = z;
    }

    public void setPressed(boolean z) {
        if (this.f3591k) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f3589i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3590j = true;
        this.f3591k = true;
        u.e0(this, new a());
    }
}
