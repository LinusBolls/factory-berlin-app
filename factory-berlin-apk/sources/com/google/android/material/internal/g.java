package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import g.b.a.c.z.d;
import g.b.a.c.z.f;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper */
public class g {
    private final TextPaint a = new TextPaint(1);
    private final f b = new a();
    private float c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f3610d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f3611e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    private d f3612f;

    /* compiled from: TextDrawableHelper */
    class a extends f {
        a() {
        }

        public void a(int i2) {
            boolean unused = g.this.f3610d = true;
            b bVar = (b) g.this.f3611e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = g.this.f3610d = true;
                b bVar = (b) g.this.f3611e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public g(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public d d() {
        return this.f3612f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.f3610d) {
            return this.c;
        }
        float c2 = c(str);
        this.c = c2;
        this.f3610d = false;
        return c2;
    }

    public void g(b bVar) {
        this.f3611e = new WeakReference<>(bVar);
    }

    public void h(d dVar, Context context) {
        if (this.f3612f != dVar) {
            this.f3612f = dVar;
            if (dVar != null) {
                dVar.j(context, this.a, this.b);
                b bVar = (b) this.f3611e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                dVar.i(context, this.a, this.b);
                this.f3610d = true;
            }
            b bVar2 = (b) this.f3611e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.f3610d = z;
    }

    public void j(Context context) {
        this.f3612f.i(context, this.a, this.b);
    }
}
