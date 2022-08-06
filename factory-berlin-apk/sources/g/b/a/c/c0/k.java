package g.b.a.c.c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import g.b.a.c.l;

/* compiled from: ShapeAppearanceModel */
public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final c f9477m = new i(0.5f);
    d a;
    d b;
    d c;

    /* renamed from: d  reason: collision with root package name */
    d f9478d;

    /* renamed from: e  reason: collision with root package name */
    c f9479e;

    /* renamed from: f  reason: collision with root package name */
    c f9480f;

    /* renamed from: g  reason: collision with root package name */
    c f9481g;

    /* renamed from: h  reason: collision with root package name */
    c f9482h;

    /* renamed from: i  reason: collision with root package name */
    f f9483i;

    /* renamed from: j  reason: collision with root package name */
    f f9484j;

    /* renamed from: k  reason: collision with root package name */
    f f9485k;

    /* renamed from: l  reason: collision with root package name */
    f f9486l;

    /* compiled from: ShapeAppearanceModel */
    public interface c {
        c a(c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i2, int i3) {
        return c(context, i2, i3, 0);
    }

    private static b c(Context context, int i2, int i3, int i4) {
        return d(context, i2, i3, new a((float) i4));
    }

    private static b d(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, l.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyBottomLeft, i4);
            c m2 = m(obtainStyledAttributes, l.ShapeAppearance_cornerSize, cVar);
            c m3 = m(obtainStyledAttributes, l.ShapeAppearance_cornerSizeTopLeft, m2);
            c m4 = m(obtainStyledAttributes, l.ShapeAppearance_cornerSizeTopRight, m2);
            c m5 = m(obtainStyledAttributes, l.ShapeAppearance_cornerSizeBottomRight, m2);
            c m6 = m(obtainStyledAttributes, l.ShapeAppearance_cornerSizeBottomLeft, m2);
            b bVar = new b();
            bVar.x(i5, m3);
            bVar.B(i6, m4);
            bVar.t(i7, m5);
            bVar.p(i8, m6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f(context, attributeSet, i2, i3, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return g(context, attributeSet, i2, i3, new a((float) i4));
    }

    public static b g(Context context, AttributeSet attributeSet, int i2, int i3, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static c m(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i3 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f9485k;
    }

    public d i() {
        return this.f9478d;
    }

    public c j() {
        return this.f9482h;
    }

    public d k() {
        return this.c;
    }

    public c l() {
        return this.f9481g;
    }

    public f n() {
        return this.f9486l;
    }

    public f o() {
        return this.f9484j;
    }

    public f p() {
        return this.f9483i;
    }

    public d q() {
        return this.a;
    }

    public c r() {
        return this.f9479e;
    }

    public d s() {
        return this.b;
    }

    public c t() {
        return this.f9480f;
    }

    public boolean u(RectF rectF) {
        Class<f> cls = f.class;
        boolean z = this.f9486l.getClass().equals(cls) && this.f9484j.getClass().equals(cls) && this.f9483i.getClass().equals(cls) && this.f9485k.getClass().equals(cls);
        float a2 = this.f9479e.a(rectF);
        boolean z2 = this.f9480f.a(rectF) == a2 && this.f9482h.a(rectF) == a2 && this.f9481g.a(rectF) == a2;
        boolean z3 = (this.b instanceof j) && (this.a instanceof j) && (this.c instanceof j) && (this.f9478d instanceof j);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    public b v() {
        return new b(this);
    }

    public k w(float f2) {
        b v = v();
        v.o(f2);
        return v.m();
    }

    public k x(c cVar) {
        b v = v();
        v.A(cVar.a(r()));
        v.E(cVar.a(t()));
        v.s(cVar.a(j()));
        v.w(cVar.a(l()));
        return v.m();
    }

    private k(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.f9478d = bVar.f9487d;
        this.f9479e = bVar.f9488e;
        this.f9480f = bVar.f9489f;
        this.f9481g = bVar.f9490g;
        this.f9482h = bVar.f9491h;
        this.f9483i = bVar.f9492i;
        this.f9484j = bVar.f9493j;
        this.f9485k = bVar.f9494k;
        this.f9486l = bVar.f9495l;
    }

    /* compiled from: ShapeAppearanceModel */
    public static final class b {
        /* access modifiers changed from: private */
        public d a = h.b();
        /* access modifiers changed from: private */
        public d b = h.b();
        /* access modifiers changed from: private */
        public d c = h.b();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public d f9487d = h.b();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f9488e = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f9489f = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public c f9490g = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public c f9491h = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public f f9492i = h.c();
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public f f9493j = h.c();
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public f f9494k = h.c();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public f f9495l = h.c();

        public b() {
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).a;
            }
            return -1.0f;
        }

        public b A(c cVar) {
            this.f9488e = cVar;
            return this;
        }

        public b B(int i2, c cVar) {
            C(h.a(i2));
            E(cVar);
            return this;
        }

        public b C(d dVar) {
            this.b = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                D(n2);
            }
            return this;
        }

        public b D(float f2) {
            this.f9489f = new a(f2);
            return this;
        }

        public b E(c cVar) {
            this.f9489f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f2) {
            z(f2);
            D(f2);
            v(f2);
            r(f2);
            return this;
        }

        public b p(int i2, c cVar) {
            q(h.a(i2));
            s(cVar);
            return this;
        }

        public b q(d dVar) {
            this.f9487d = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                r(n2);
            }
            return this;
        }

        public b r(float f2) {
            this.f9491h = new a(f2);
            return this;
        }

        public b s(c cVar) {
            this.f9491h = cVar;
            return this;
        }

        public b t(int i2, c cVar) {
            u(h.a(i2));
            w(cVar);
            return this;
        }

        public b u(d dVar) {
            this.c = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                v(n2);
            }
            return this;
        }

        public b v(float f2) {
            this.f9490g = new a(f2);
            return this;
        }

        public b w(c cVar) {
            this.f9490g = cVar;
            return this;
        }

        public b x(int i2, c cVar) {
            y(h.a(i2));
            A(cVar);
            return this;
        }

        public b y(d dVar) {
            this.a = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                z(n2);
            }
            return this;
        }

        public b z(float f2) {
            this.f9488e = new a(f2);
            return this;
        }

        public b(k kVar) {
            this.a = kVar.a;
            this.b = kVar.b;
            this.c = kVar.c;
            this.f9487d = kVar.f9478d;
            this.f9488e = kVar.f9479e;
            this.f9489f = kVar.f9480f;
            this.f9490g = kVar.f9481g;
            this.f9491h = kVar.f9482h;
            this.f9492i = kVar.f9483i;
            this.f9493j = kVar.f9484j;
            this.f9494k = kVar.f9485k;
            this.f9495l = kVar.f9486l;
        }
    }

    public k() {
        this.a = h.b();
        this.b = h.b();
        this.c = h.b();
        this.f9478d = h.b();
        this.f9479e = new a(0.0f);
        this.f9480f = new a(0.0f);
        this.f9481g = new a(0.0f);
        this.f9482h = new a(0.0f);
        this.f9483i = h.c();
        this.f9484j = h.c();
        this.f9485k = h.c();
        this.f9486l = h.c();
    }
}
