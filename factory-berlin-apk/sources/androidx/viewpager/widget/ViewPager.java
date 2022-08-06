package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import e.h.k.c0;
import e.h.k.q;
import e.h.k.u;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] l0 = {16842931};
    private static final Comparator<f> m0 = new a();
    private static final Interpolator n0 = new b();
    private static final n o0 = new n();
    private boolean A;
    private boolean B;
    private int C = 1;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private float I;
    private float J;
    private float K;
    private float L;
    private int M = -1;
    private VelocityTracker N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private EdgeEffect T;
    private EdgeEffect U;
    private boolean V = true;
    private boolean W;
    private int a0;
    private List<j> b0;
    private j c0;
    private j d0;
    private List<i> e0;
    private k f0;

    /* renamed from: g  reason: collision with root package name */
    private int f1524g;
    private int g0;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<f> f1525h = new ArrayList<>();
    private int h0;

    /* renamed from: i  reason: collision with root package name */
    private final f f1526i = new f();
    private ArrayList<View> i0;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f1527j = new Rect();
    private final Runnable j0 = new c();

    /* renamed from: k  reason: collision with root package name */
    a f1528k;
    private int k0 = 0;

    /* renamed from: l  reason: collision with root package name */
    int f1529l;

    /* renamed from: m  reason: collision with root package name */
    private int f1530m = -1;

    /* renamed from: n  reason: collision with root package name */
    private Parcelable f1531n = null;
    private ClassLoader o = null;
    private Scroller p;
    private boolean q;
    private l r;
    private int s;
    private Drawable t;
    private int u;
    private int v;
    private float w = -3.4028235E38f;
    private float x = Float.MAX_VALUE;
    private int y;
    private boolean z;

    static class a implements Comparator<f> {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    class d implements q {
        private final Rect a = new Rect();

        d() {
        }

        public c0 a(View view, c0 c0Var) {
            c0 S = u.S(view, c0Var);
            if (S.i()) {
                return S;
            }
            Rect rect = this.a;
            rect.left = S.e();
            rect.top = S.g();
            rect.right = S.f();
            rect.bottom = S.d();
            int childCount = ViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                c0 f2 = u.f(ViewPager.this.getChildAt(i2), S);
                rect.left = Math.min(f2.e(), rect.left);
                rect.top = Math.min(f2.g(), rect.top);
                rect.right = Math.min(f2.f(), rect.right);
                rect.bottom = Math.min(f2.d(), rect.bottom);
            }
            return S.j(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {
        Object a;
        int b;
        boolean c;

        /* renamed from: d  reason: collision with root package name */
        float f1533d;

        /* renamed from: e  reason: collision with root package name */
        float f1534e;

        f() {
        }
    }

    class h extends e.h.k.a {
        h() {
        }

        private boolean n() {
            a aVar = ViewPager.this.f1528k;
            return aVar != null && aVar.c() > 1;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f1528k) != null) {
                accessibilityEvent.setItemCount(aVar.c());
                accessibilityEvent.setFromIndex(ViewPager.this.f1529l);
                accessibilityEvent.setToIndex(ViewPager.this.f1529l);
            }
        }

        public void g(View view, e.h.k.d0.c cVar) {
            super.g(view, cVar);
            cVar.W(ViewPager.class.getName());
            cVar.n0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f1529l - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f1529l + 1);
                return true;
            }
        }
    }

    public interface i {
        void a(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface j {
        void a(int i2, float f2, int i3);

        void b(int i2);

        void c(int i2);
    }

    public interface k {
        void a(View view, float f2);
    }

    private class l extends DataSetObserver {
        l() {
        }

        public void onChanged() {
            ViewPager.this.g();
        }

        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    public static class m extends e.j.a.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        int f1539i;

        /* renamed from: j  reason: collision with root package name */
        Parcelable f1540j;

        /* renamed from: k  reason: collision with root package name */
        ClassLoader f1541k;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            /* renamed from: c */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1539i + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1539i);
            parcel.writeParcelable(this.f1540j, i2);
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.f1539i = parcel.readInt();
            this.f1540j = parcel.readParcelable(classLoader);
            this.f1541k = classLoader;
        }
    }

    static class n implements Comparator<View> {
        n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            if (z != gVar2.a) {
                return z ? 1 : -1;
            }
            return gVar.f1536e - gVar2.f1536e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u();
    }

    private boolean B(int i2) {
        if (this.f1525h.size() != 0) {
            f s2 = s();
            int clientWidth = getClientWidth();
            int i3 = this.s;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = s2.b;
            float f3 = ((((float) i2) / f2) - s2.f1534e) / (s2.f1533d + (((float) i3) / f2));
            this.W = false;
            x(i5, f3, (int) (((float) i4) * f3));
            if (this.W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.V) {
            return false;
        } else {
            this.W = false;
            x(0, 0.0f, 0);
            if (this.W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean C(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.I - f2;
        this.I = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.w * clientWidth;
        float f5 = this.x * clientWidth;
        boolean z4 = false;
        f fVar = this.f1525h.get(0);
        ArrayList<f> arrayList = this.f1525h;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.f1534e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.b != this.f1528k.c() - 1) {
            f5 = fVar2.f1534e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.T.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.U.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.I += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        B(i2);
        return z4;
    }

    private void F(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.f1525h.isEmpty()) {
            f t2 = t(this.f1529l);
            int min = (int) ((t2 != null ? Math.min(t2.f1534e, this.x) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                f(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.p.isFinished()) {
            this.p.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    private void G() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void H(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean I() {
        this.M = -1;
        n();
        this.T.onRelease();
        this.U.onRelease();
        return this.T.isFinished() || this.U.isFinished();
    }

    private void J(int i2, boolean z2, int i3, boolean z3) {
        f t2 = t(i2);
        int clientWidth = t2 != null ? (int) (((float) getClientWidth()) * Math.max(this.w, Math.min(t2.f1534e, this.x))) : 0;
        if (z2) {
            N(clientWidth, 0, i3);
            if (z3) {
                j(i2);
                return;
            }
            return;
        }
        if (z3) {
            j(i2);
        }
        f(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    private void O() {
        if (this.h0 != 0) {
            ArrayList<View> arrayList = this.i0;
            if (arrayList == null) {
                this.i0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.i0.add(getChildAt(i2));
            }
            Collections.sort(this.i0, o0);
        }
    }

    private void d(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int c2 = this.f1528k.c();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.s) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                int i7 = 0;
                float f3 = fVar2.f1534e + fVar2.f1533d + f2;
                while (true) {
                    i5++;
                    if (i5 > fVar.b || i7 >= this.f1525h.size()) {
                        break;
                    }
                    Object obj = this.f1525h.get(i7);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i5 > fVar4.b && i7 < this.f1525h.size() - 1) {
                            i7++;
                            obj = this.f1525h.get(i7);
                        }
                    }
                    while (i5 < fVar4.b) {
                        f3 += this.f1528k.f(i5) + f2;
                        i5++;
                    }
                    fVar4.f1534e = f3;
                    f3 += fVar4.f1533d + f2;
                }
            } else if (i5 > i6) {
                int size = this.f1525h.size() - 1;
                float f4 = fVar2.f1534e;
                while (true) {
                    int i8 = i5 - 1;
                    if (i8 < fVar.b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f1525h.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i8 < fVar3.b && size > 0) {
                            size--;
                            obj2 = this.f1525h.get(size);
                        }
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.f1528k.f(i5) + f2;
                        i8 = i5 - 1;
                    }
                    f4 -= fVar3.f1533d + f2;
                    fVar3.f1534e = f4;
                }
            }
        }
        int size2 = this.f1525h.size();
        float f5 = fVar.f1534e;
        int i9 = fVar.b;
        int i10 = i9 - 1;
        this.w = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = c2 - 1;
        this.x = fVar.b == i11 ? (fVar.f1534e + fVar.f1533d) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = this.f1525h.get(i12);
            while (true) {
                i4 = fVar5.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.f1528k.f(i10) + f2;
                i10--;
            }
            f5 -= fVar5.f1533d + f2;
            fVar5.f1534e = f5;
            if (i4 == 0) {
                this.w = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.f1534e + fVar.f1533d + f2;
        int i13 = fVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = this.f1525h.get(i14);
            while (true) {
                i3 = fVar6.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.f1528k.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.x = (fVar6.f1533d + f6) - 1.0f;
            }
            fVar6.f1534e = f6;
            f6 += fVar6.f1533d + f2;
            i14++;
            i13++;
        }
    }

    private void f(boolean z2) {
        boolean z3 = this.k0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.p.isFinished()) {
                this.p.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.p.getCurrX();
                int currY = this.p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.B = false;
        for (int i2 = 0; i2 < this.f1525h.size(); i2++) {
            f fVar = this.f1525h.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            u.X(this, this.j0);
        } else {
            this.j0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int h(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.Q || Math.abs(i3) <= this.O) {
            i2 += (int) (f2 + (i2 >= this.f1529l ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f1525h.size() <= 0) {
            return i2;
        }
        ArrayList<f> arrayList = this.f1525h;
        return Math.max(this.f1525h.get(0).b, Math.min(i2, arrayList.get(arrayList.size() - 1).b));
    }

    private void i(int i2, float f2, int i3) {
        j jVar = this.c0;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.b0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.b0.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.d0;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void j(int i2) {
        j jVar = this.c0;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.b0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.b0.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.d0;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void k(int i2) {
        j jVar = this.c0;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.b0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.b0.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.d0;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void m(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.g0 : 0, (Paint) null);
        }
    }

    private void n() {
        this.D = false;
        this.E = false;
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.N = null;
        }
    }

    private Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f s() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.s) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f1525h.size()) {
            f fVar2 = this.f1525h.get(i4);
            if (!z2 && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.f1526i;
                fVar2.f1534e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.f1533d = this.f1528k.f(i2);
                i4--;
            }
            f2 = fVar2.f1534e;
            float f5 = fVar2.f1533d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f1525h.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.b;
            f4 = fVar2.f1533d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.A != z2) {
            this.A = z2;
        }
    }

    private static boolean v(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean w(float f2, float f3) {
        return (f2 < ((float) this.G) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.G)) && f3 < 0.0f);
    }

    private void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.I = motionEvent.getX(i2);
            this.M = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        a aVar = this.f1528k;
        if (aVar == null || this.f1529l >= aVar.c() - 1) {
            return false;
        }
        K(this.f1529l + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void D() {
        E(this.f1529l);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f1529l
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.t(r2)
            r0.f1529l = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f1528k
            if (r1 != 0) goto L_0x0018
            r17.O()
            return
        L_0x0018:
            boolean r1 = r0.B
            if (r1 == 0) goto L_0x0020
            r17.O()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f1528k
            r1.m(r0)
            int r1 = r0.C
            int r4 = r0.f1529l
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f1528k
            int r6 = r6.c()
            int r7 = r6 + -1
            int r8 = r0.f1529l
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f1524g
            if (r6 != r7) goto L_0x020e
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f1525h
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f1525h
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            int r9 = r8.b
            int r10 = r0.f1529l
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f1529l
            androidx.viewpager.widget.ViewPager$f r8 = r0.a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019b
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f1525h
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f1533d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f1529l
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f1528k
            java.lang.Object r11 = r11.a
            r5.a(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f1533d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r3, r5)
            float r5 = r5.f1533d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f1533d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = 0
            goto L_0x0123
        L_0x011b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f1529l
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018f
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 != 0) goto L_0x0132
            goto L_0x018f
        L_0x0132:
            int r12 = r5.b
            if (r11 != r12) goto L_0x018e
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f1525h
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f1528k
            java.lang.Object r5 = r5.a
            r12.a(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x018e
        L_0x0157:
            r5 = 0
            goto L_0x018e
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.b
            if (r11 != r12) goto L_0x0175
            float r5 = r5.f1533d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x018e
        L_0x0175:
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f1533d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f1525h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
        L_0x018e:
            goto L_0x0125
        L_0x018f:
            r0.d(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f1528k
            int r2 = r0.f1529l
            java.lang.Object r3 = r8.a
            r1.k(r0, r2, r3)
        L_0x019b:
            androidx.viewpager.widget.a r1 = r0.f1528k
            r1.b(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a5:
            if (r2 >= r1) goto L_0x01ce
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.g) r4
            r4.f1537f = r2
            boolean r5 = r4.a
            if (r5 != 0) goto L_0x01cb
            float r5 = r4.c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cb
            androidx.viewpager.widget.ViewPager$f r3 = r0.r(r3)
            if (r3 == 0) goto L_0x01cb
            float r5 = r3.f1533d
            r4.c = r5
            int r3 = r3.b
            r4.f1536e = r3
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01a5
        L_0x01ce:
            r17.O()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e2
            androidx.viewpager.widget.ViewPager$f r3 = r0.q(r1)
            goto L_0x01e3
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.b
            int r2 = r0.f1529l
            if (r1 == r2) goto L_0x020d
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020d
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.r(r1)
            if (r2 == 0) goto L_0x020a
            int r2 = r2.b
            int r3 = r0.f1529l
            if (r2 != r3) goto L_0x020a
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x020d:
            return
        L_0x020e:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021b }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021b }
            goto L_0x0223
        L_0x021b:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0223:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f1524g
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f1528k
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.E(int):void");
    }

    public void K(int i2, boolean z2) {
        this.B = false;
        L(i2, z2, false);
    }

    /* access modifiers changed from: package-private */
    public void L(int i2, boolean z2, boolean z3) {
        M(i2, z2, z3, 0);
    }

    /* access modifiers changed from: package-private */
    public void M(int i2, boolean z2, boolean z3, int i3) {
        a aVar = this.f1528k;
        boolean z4 = false;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f1529l != i2 || this.f1525h.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f1528k.c()) {
                i2 = this.f1528k.c() - 1;
            }
            int i4 = this.C;
            int i5 = this.f1529l;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f1525h.size(); i6++) {
                    this.f1525h.get(i6).c = true;
                }
            }
            if (this.f1529l != i2) {
                z4 = true;
            }
            if (this.V) {
                this.f1529l = i2;
                if (z4) {
                    j(i2);
                }
                requestLayout();
                return;
            }
            E(i2);
            J(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.p;
        if (scroller != null && !scroller.isFinished()) {
            i5 = this.q ? this.p.getCurrX() : this.p.getStartX();
            this.p.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i5 = getScrollX();
        }
        int i7 = i5;
        int scrollY = getScrollY();
        int i8 = i2 - i7;
        int i9 = i3 - scrollY;
        if (i8 == 0 && i9 == 0) {
            f(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i10;
        float l2 = f3 + (l(Math.min(1.0f, (((float) Math.abs(i8)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        if (abs > 0) {
            i6 = Math.round(Math.abs(l2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i6 = (int) (((((float) Math.abs(i8)) / ((f2 * this.f1528k.f(this.f1529l)) + ((float) this.s))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i6, 600);
        this.q = false;
        this.p.startScroll(i7, scrollY, i8, i9, min);
        u.W(this);
    }

    /* access modifiers changed from: package-private */
    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.f1528k.g(this, i2);
        fVar.f1533d = this.f1528k.f(i2);
        if (i3 < 0 || i3 >= this.f1525h.size()) {
            this.f1525h.add(fVar);
        } else {
            this.f1525h.add(i3, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f r2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.b == this.f1529l) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        f r2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.b == this.f1529l) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean v2 = gVar.a | v(view);
        gVar.a = v2;
        if (!this.z) {
            super.addView(view, i2, layoutParams);
        } else if (gVar == null || !v2) {
            gVar.f1535d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(j jVar) {
        if (this.b0 == null) {
            this.b0 = new ArrayList();
        }
        this.b0.add(jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00ba
            if (r3 == r0) goto L_0x00ba
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f1527j
            android.graphics.Rect r1 = r6.p(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f1527j
            android.graphics.Rect r2 = r6.p(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.z()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00cd
        L_0x009a:
            if (r7 != r4) goto L_0x00cd
            android.graphics.Rect r1 = r6.f1527j
            android.graphics.Rect r1 = r6.p(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f1527j
            android.graphics.Rect r2 = r6.p(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b5
            if (r1 > r2) goto L_0x00b5
            boolean r0 = r6.A()
            goto L_0x0098
        L_0x00b5:
            boolean r0 = r3.requestFocus()
            goto L_0x0098
        L_0x00ba:
            if (r7 == r5) goto L_0x00c9
            if (r7 != r1) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            if (r7 == r4) goto L_0x00c4
            r0 = 2
            if (r7 != r0) goto L_0x00cd
        L_0x00c4:
            boolean r2 = r6.A()
            goto L_0x00cd
        L_0x00c9:
            boolean r2 = r6.z()
        L_0x00cd:
            if (r2 == 0) goto L_0x00d6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f1528k == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.w))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.x))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.q = true;
        if (this.p.isFinished() || !this.p.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.p.getCurrX();
        int currY = this.p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        u.W(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f r2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.b == this.f1529l && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f1528k) != null && aVar.c() > 1)) {
            if (!this.T.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.w * ((float) width));
                this.T.setSize(height, width);
                z2 = false | this.T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.x + 1.0f)) * ((float) width2));
                this.U.setSize(height2, width2);
                z2 |= this.U.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.T.finish();
            this.U.finish();
        }
        if (z2) {
            u.W(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public boolean e(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int c2 = this.f1528k.c();
        this.f1524g = c2;
        boolean z2 = this.f1525h.size() < (this.C * 2) + 1 && this.f1525h.size() < c2;
        int i2 = this.f1529l;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f1525h.size()) {
            f fVar = this.f1525h.get(i3);
            int d2 = this.f1528k.d(fVar.a);
            if (d2 != -1) {
                if (d2 == -2) {
                    this.f1525h.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f1528k.m(this);
                        z3 = true;
                    }
                    this.f1528k.a(this, fVar.b, fVar.a);
                    int i4 = this.f1529l;
                    if (i4 == fVar.b) {
                        i2 = Math.max(0, Math.min(i4, c2 - 1));
                    }
                } else {
                    int i5 = fVar.b;
                    if (i5 != d2) {
                        if (i5 == this.f1529l) {
                            i2 = d2;
                        }
                        fVar.b = d2;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f1528k.b(this);
        }
        Collections.sort(this.f1525h, m0);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            L(i2, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f1528k;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.h0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.i0.get(i3).getLayoutParams()).f1537f;
    }

    public int getCurrentItem() {
        return this.f1529l;
    }

    public int getOffscreenPageLimit() {
        return this.C;
    }

    public int getPageMargin() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public float l(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return A();
                } else {
                    return c(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return z();
            } else {
                return c(17);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.j0);
        Scroller scroller = this.p;
        if (scroller != null && !scroller.isFinished()) {
            this.p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.s > 0 && this.t != null && this.f1525h.size() > 0 && this.f1528k != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.s) / f4;
            int i2 = 0;
            f fVar = this.f1525h.get(0);
            float f6 = fVar.f1534e;
            int size = this.f1525h.size();
            int i3 = fVar.b;
            int i4 = this.f1525h.get(size - 1).b;
            while (i3 < i4) {
                while (i3 > fVar.b && i2 < size) {
                    i2++;
                    fVar = this.f1525h.get(i2);
                }
                if (i3 == fVar.b) {
                    float f7 = fVar.f1534e;
                    float f8 = fVar.f1533d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else {
                    float f9 = this.f1528k.f(i3);
                    f2 = (f6 + f9) * f4;
                    f6 += f9 + f5;
                }
                if (((float) this.s) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.t.setBounds(Math.round(f2), this.u, Math.round(((float) this.s) + f2), this.v);
                    this.t.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i3++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            I();
            return false;
        }
        if (action != 0) {
            if (this.D) {
                return true;
            }
            if (this.E) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.K = x2;
            this.I = x2;
            float y2 = motionEvent.getY();
            this.L = y2;
            this.J = y2;
            this.M = motionEvent2.getPointerId(0);
            this.E = false;
            this.q = true;
            this.p.computeScrollOffset();
            if (this.k0 != 2 || Math.abs(this.p.getFinalX() - this.p.getCurrX()) <= this.R) {
                f(false);
                this.D = false;
            } else {
                this.p.abortAnimation();
                this.B = false;
                D();
                this.D = true;
                H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.M;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.I;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.L);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0 && !w(this.I, f2)) {
                    if (e(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.I = x3;
                        this.J = y3;
                        this.E = true;
                        return false;
                    }
                }
                if (abs > ((float) this.H) && abs * 0.5f > abs2) {
                    this.D = true;
                    H(true);
                    setScrollState(1);
                    float f3 = this.K;
                    float f4 = (float) this.H;
                    this.I = i3 > 0 ? f3 + f4 : f3 - f4;
                    this.J = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.H)) {
                    this.E = true;
                }
                if (this.D && C(x3)) {
                    u.W(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent2);
        return this.D;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.g) r12
            boolean r14 = r12.a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.r(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f1534e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f1535d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f1535d = r14
            float r9 = r9.c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.u = r5
            int r3 = r3 - r7
            r0.v = r3
            r0.a0 = r11
            boolean r1 = r0.V
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f1529l
            r2 = 0
            r0.J(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.F
            int r15 = java.lang.Math.min(r15, r1)
            r13.G = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r3 = (androidx.viewpager.widget.ViewPager.g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.y = r15
            r13.z = r4
            r13.D()
            r13.z = r0
            int r15 = r13.getChildCount()
        L_0x00c6:
            if (r0 >= r15) goto L_0x00f0
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r2 = (androidx.viewpager.widget.ViewPager.g) r2
            if (r2 == 0) goto L_0x00de
            boolean r4 = r2.a
            if (r4 != 0) goto L_0x00ed
        L_0x00de:
            float r4 = (float) r14
            float r2 = r2.c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.y
            r1.measure(r2, r4)
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f r2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (r2 = r(childAt)) != null && r2.b == this.f1529l && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        a aVar = this.f1528k;
        if (aVar != null) {
            aVar.i(mVar.f1540j, mVar.f1541k);
            L(mVar.f1539i, false, true);
            return;
        }
        this.f1530m = mVar.f1539i;
        this.f1531n = mVar.f1540j;
        this.o = mVar.f1541k;
    }

    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f1539i = this.f1529l;
        a aVar = this.f1528k;
        if (aVar != null) {
            mVar.f1540j = aVar.j();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.s;
            F(i2, i4, i6, i6);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.S) {
            return true;
        }
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f1528k) == null || aVar.c() == 0) {
            return false;
        }
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.p.abortAnimation();
            this.B = false;
            D();
            float x2 = motionEvent.getX();
            this.K = x2;
            this.I = x2;
            float y2 = motionEvent.getY();
            this.L = y2;
            this.J = y2;
            this.M = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.D) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.M);
                    if (findPointerIndex == -1) {
                        z2 = I();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.I);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.J);
                        if (abs > ((float) this.H) && abs > abs2) {
                            this.D = true;
                            H(true);
                            float f2 = this.K;
                            this.I = x3 - f2 > 0.0f ? f2 + ((float) this.H) : f2 - ((float) this.H);
                            this.J = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.D) {
                    z2 = false | C(motionEvent.getX(motionEvent.findPointerIndex(this.M)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.I = motionEvent.getX(actionIndex);
                    this.M = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    y(motionEvent);
                    this.I = motionEvent.getX(motionEvent.findPointerIndex(this.M));
                }
            } else if (this.D) {
                J(this.f1529l, true, 0, false);
                z2 = I();
            }
        } else if (this.D) {
            VelocityTracker velocityTracker = this.N;
            velocityTracker.computeCurrentVelocity(1000, (float) this.P);
            int xVelocity = (int) velocityTracker.getXVelocity(this.M);
            this.B = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f s2 = s();
            float f3 = (float) clientWidth;
            M(h(s2.b, ((((float) scrollX) / f3) - s2.f1534e) / (s2.f1533d + (((float) this.s) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.M)) - this.K)), true, true, xVelocity);
            z2 = I();
        }
        if (z2) {
            u.W(this);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public f q(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public f r(View view) {
        for (int i2 = 0; i2 < this.f1525h.size(); i2++) {
            f fVar = this.f1525h.get(i2);
            if (this.f1528k.h(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        if (this.z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.f1528k;
        if (aVar2 != null) {
            aVar2.l((DataSetObserver) null);
            this.f1528k.m(this);
            for (int i2 = 0; i2 < this.f1525h.size(); i2++) {
                f fVar = this.f1525h.get(i2);
                this.f1528k.a(this, fVar.b, fVar.a);
            }
            this.f1528k.b(this);
            this.f1525h.clear();
            G();
            this.f1529l = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.f1528k;
        this.f1528k = aVar;
        this.f1524g = 0;
        if (aVar != null) {
            if (this.r == null) {
                this.r = new l();
            }
            this.f1528k.l(this.r);
            this.B = false;
            boolean z2 = this.V;
            this.V = true;
            this.f1524g = this.f1528k.c();
            if (this.f1530m >= 0) {
                this.f1528k.i(this.f1531n, this.o);
                L(this.f1530m, false, true);
                this.f1530m = -1;
                this.f1531n = null;
                this.o = null;
            } else if (!z2) {
                D();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.e0;
        if (list != null && !list.isEmpty()) {
            int size = this.e0.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.e0.get(i3).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.B = false;
        L(i2, !this.V, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.C) {
            this.C = i2;
            D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.c0 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.s;
        this.s = i2;
        int width = getWidth();
        F(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.t = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (this.k0 != i2) {
            this.k0 = i2;
            if (this.f0 != null) {
                m(i2 != 0);
            }
            k(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public f t(int i2) {
        for (int i3 = 0; i3 < this.f1525h.size(); i3++) {
            f fVar = this.f1525h.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.p = new Scroller(context, n0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.H = viewConfiguration.getScaledPagingTouchSlop();
        this.O = (int) (400.0f * f2);
        this.P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.T = new EdgeEffect(context);
        this.U = new EdgeEffect(context);
        this.Q = (int) (25.0f * f2);
        this.R = (int) (2.0f * f2);
        this.F = (int) (f2 * 16.0f);
        u.e0(this, new h());
        if (u.v(this) == 0) {
            u.o0(this, 1);
        }
        u.q0(this, new d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.a0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.i(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f0
            r3.a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.x(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        int i2 = this.f1529l;
        if (i2 <= 0) {
            return false;
        }
        K(i2 - 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f1535d;

        /* renamed from: e  reason: collision with root package name */
        int f1536e;

        /* renamed from: f  reason: collision with root package name */
        int f1537f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.l0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.a.f(getContext(), i2));
    }
}
