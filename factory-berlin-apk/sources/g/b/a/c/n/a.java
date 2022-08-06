package g.b.a.c.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.g;
import com.google.android.material.internal.i;
import e.h.k.u;
import g.b.a.c.d;
import g.b.a.c.j;
import g.b.a.c.k;
import java.lang.ref.WeakReference;

/* compiled from: BadgeDrawable */
public class a extends Drawable implements g.b {

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference<Context> f9518g;

    /* renamed from: h  reason: collision with root package name */
    private final g.b.a.c.c0.g f9519h = new g.b.a.c.c0.g();

    /* renamed from: i  reason: collision with root package name */
    private final g f9520i;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f9521j = new Rect();

    /* renamed from: k  reason: collision with root package name */
    private final float f9522k;

    /* renamed from: l  reason: collision with root package name */
    private final float f9523l;

    /* renamed from: m  reason: collision with root package name */
    private final float f9524m;

    /* renamed from: n  reason: collision with root package name */
    private final C0634a f9525n;
    private float o;
    private float p;
    private int q;
    private float r;
    private float s;
    private float t;
    private WeakReference<View> u;
    private WeakReference<ViewGroup> v;

    private a(Context context) {
        this.f9518g = new WeakReference<>(context);
        i.c(context);
        Resources resources = context.getResources();
        this.f9522k = (float) resources.getDimensionPixelSize(d.mtrl_badge_radius);
        this.f9524m = (float) resources.getDimensionPixelSize(d.mtrl_badge_long_text_horizontal_padding);
        this.f9523l = (float) resources.getDimensionPixelSize(d.mtrl_badge_with_text_radius);
        g gVar = new g(this);
        this.f9520i = gVar;
        gVar.e().setTextAlign(Paint.Align.CENTER);
        this.f9525n = new C0634a(context);
        r(k.TextAppearance_MaterialComponents_Badge);
    }

    private void b(Context context, Rect rect, View view) {
        int i2 = this.f9525n.f9533n;
        if (i2 == 8388691 || i2 == 8388693) {
            this.p = (float) rect.bottom;
        } else {
            this.p = (float) rect.top;
        }
        if (h() <= 9) {
            float f2 = !j() ? this.f9522k : this.f9523l;
            this.r = f2;
            this.t = f2;
            this.s = f2;
        } else {
            float f3 = this.f9523l;
            this.r = f3;
            this.t = f3;
            this.s = (this.f9520i.f(e()) / 2.0f) + this.f9524m;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(j() ? d.mtrl_badge_text_horizontal_edge_offset : d.mtrl_badge_horizontal_edge_offset);
        int i3 = this.f9525n.f9533n;
        if (i3 == 8388659 || i3 == 8388691) {
            this.o = u.x(view) == 0 ? (((float) rect.left) - this.s) + ((float) dimensionPixelSize) : (((float) rect.right) + this.s) - ((float) dimensionPixelSize);
        } else {
            this.o = u.x(view) == 0 ? (((float) rect.right) + this.s) - ((float) dimensionPixelSize) : (((float) rect.left) - this.s) + ((float) dimensionPixelSize);
        }
    }

    static a c(Context context, C0634a aVar) {
        a aVar2 = new a(context);
        aVar2.k(aVar);
        return aVar2;
    }

    private void d(Canvas canvas) {
        Rect rect = new Rect();
        String e2 = e();
        this.f9520i.e().getTextBounds(e2, 0, e2.length(), rect);
        canvas.drawText(e2, this.o, this.p + ((float) (rect.height() / 2)), this.f9520i.e());
    }

    private String e() {
        if (h() <= this.q) {
            return Integer.toString(h());
        }
        Context context = (Context) this.f9518g.get();
        if (context == null) {
            return "";
        }
        return context.getString(j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.q), "+"});
    }

    private void k(C0634a aVar) {
        o(aVar.f9530k);
        if (aVar.f9529j != -1) {
            p(aVar.f9529j);
        }
        l(aVar.f9526g);
        n(aVar.f9527h);
        m(aVar.f9533n);
    }

    private void q(g.b.a.c.z.d dVar) {
        Context context;
        if (this.f9520i.d() != dVar && (context = (Context) this.f9518g.get()) != null) {
            this.f9520i.h(dVar, context);
            t();
        }
    }

    private void r(int i2) {
        Context context = (Context) this.f9518g.get();
        if (context != null) {
            q(new g.b.a.c.z.d(context, i2));
        }
    }

    private void t() {
        Context context = (Context) this.f9518g.get();
        WeakReference<View> weakReference = this.u;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f9521j);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.v;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || b.a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            b(context, rect2, view);
            b.f(this.f9521j, this.o, this.p, this.s, this.t);
            this.f9519h.S(this.r);
            if (!rect.equals(this.f9521j)) {
                this.f9519h.setBounds(this.f9521j);
            }
        }
    }

    private void u() {
        this.q = ((int) Math.pow(10.0d, ((double) g()) - 1.0d)) - 1;
    }

    public void a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f9519h.draw(canvas);
            if (j()) {
                d(canvas);
            }
        }
    }

    public CharSequence f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!j()) {
            return this.f9525n.f9531l;
        }
        if (this.f9525n.f9532m <= 0 || (context = (Context) this.f9518g.get()) == null) {
            return null;
        }
        return context.getResources().getQuantityString(this.f9525n.f9532m, h(), new Object[]{Integer.valueOf(h())});
    }

    public int g() {
        return this.f9525n.f9530k;
    }

    public int getAlpha() {
        return this.f9525n.f9528i;
    }

    public int getIntrinsicHeight() {
        return this.f9521j.height();
    }

    public int getIntrinsicWidth() {
        return this.f9521j.width();
    }

    public int getOpacity() {
        return -3;
    }

    public int h() {
        if (!j()) {
            return 0;
        }
        return this.f9525n.f9529j;
    }

    public C0634a i() {
        return this.f9525n;
    }

    public boolean isStateful() {
        return false;
    }

    public boolean j() {
        return this.f9525n.f9529j != -1;
    }

    public void l(int i2) {
        int unused = this.f9525n.f9526g = i2;
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        if (this.f9519h.w() != valueOf) {
            this.f9519h.U(valueOf);
            invalidateSelf();
        }
    }

    public void m(int i2) {
        if (this.f9525n.f9533n != i2) {
            int unused = this.f9525n.f9533n = i2;
            WeakReference<View> weakReference = this.u;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.u.get();
                WeakReference<ViewGroup> weakReference2 = this.v;
                s(view, weakReference2 != null ? (ViewGroup) weakReference2.get() : null);
            }
        }
    }

    public void n(int i2) {
        int unused = this.f9525n.f9527h = i2;
        if (this.f9520i.e().getColor() != i2) {
            this.f9520i.e().setColor(i2);
            invalidateSelf();
        }
    }

    public void o(int i2) {
        if (this.f9525n.f9530k != i2) {
            int unused = this.f9525n.f9530k = i2;
            u();
            this.f9520i.i(true);
            t();
            invalidateSelf();
        }
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i2) {
        int max = Math.max(0, i2);
        if (this.f9525n.f9529j != max) {
            int unused = this.f9525n.f9529j = max;
            this.f9520i.i(true);
            t();
            invalidateSelf();
        }
    }

    public void s(View view, ViewGroup viewGroup) {
        this.u = new WeakReference<>(view);
        this.v = new WeakReference<>(viewGroup);
        t();
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        int unused = this.f9525n.f9528i = i2;
        this.f9520i.e().setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: g.b.a.c.n.a$a  reason: collision with other inner class name */
    /* compiled from: BadgeDrawable */
    public static final class C0634a implements Parcelable {
        public static final Parcelable.Creator<C0634a> CREATOR = new C0635a();
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f9526g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f9527h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f9528i = 255;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f9529j = -1;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f9530k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f9531l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f9532m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public int f9533n;

        /* renamed from: g.b.a.c.n.a$a$a  reason: collision with other inner class name */
        /* compiled from: BadgeDrawable */
        static class C0635a implements Parcelable.Creator<C0634a> {
            C0635a() {
            }

            /* renamed from: a */
            public C0634a createFromParcel(Parcel parcel) {
                return new C0634a(parcel);
            }

            /* renamed from: b */
            public C0634a[] newArray(int i2) {
                return new C0634a[i2];
            }
        }

        public C0634a(Context context) {
            this.f9527h = new g.b.a.c.z.d(context, k.TextAppearance_MaterialComponents_Badge).b.getDefaultColor();
            this.f9531l = context.getString(j.mtrl_badge_numberless_content_description);
            this.f9532m = g.b.a.c.i.mtrl_badge_content_description;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f9526g);
            parcel.writeInt(this.f9527h);
            parcel.writeInt(this.f9528i);
            parcel.writeInt(this.f9529j);
            parcel.writeInt(this.f9530k);
            parcel.writeString(this.f9531l.toString());
            parcel.writeInt(this.f9532m);
            parcel.writeInt(this.f9533n);
        }

        protected C0634a(Parcel parcel) {
            this.f9526g = parcel.readInt();
            this.f9527h = parcel.readInt();
            this.f9528i = parcel.readInt();
            this.f9529j = parcel.readInt();
            this.f9530k = parcel.readInt();
            this.f9531l = parcel.readString();
            this.f9532m = parcel.readInt();
            this.f9533n = parcel.readInt();
        }
    }
}
