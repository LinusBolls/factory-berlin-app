package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends a {
    static int p = 0;
    private static final int q = 8;
    private static final boolean r;
    private static final f s = new b();
    /* access modifiers changed from: private */
    public static final ReferenceQueue<ViewDataBinding> t = new ReferenceQueue<>();
    /* access modifiers changed from: private */
    public static final View.OnAttachStateChangeListener u;
    /* access modifiers changed from: private */
    public final Runnable b;
    /* access modifiers changed from: private */
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f756d;

    /* renamed from: e  reason: collision with root package name */
    private j[] f757e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final View f758f;

    /* renamed from: g  reason: collision with root package name */
    private b<Object, ViewDataBinding, Void> f759g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f760h;

    /* renamed from: i  reason: collision with root package name */
    private Choreographer f761i;

    /* renamed from: j  reason: collision with root package name */
    private final Choreographer.FrameCallback f762j;

    /* renamed from: k  reason: collision with root package name */
    private Handler f763k;

    /* renamed from: l  reason: collision with root package name */
    private ViewDataBinding f764l;

    /* renamed from: m  reason: collision with root package name */
    private v f765m;

    /* renamed from: n  reason: collision with root package name */
    private OnStartListener f766n;
    private boolean o;

    static class OnStartListener implements u {

        /* renamed from: g  reason: collision with root package name */
        final WeakReference<ViewDataBinding> f767g;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @g0(p.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f767g.get();
            if (viewDataBinding != null) {
                viewDataBinding.n();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f767g = new WeakReference<>(viewDataBinding);
        }
    }

    static class a implements f {
    }

    static class b implements f {
        b() {
        }

        public j a(ViewDataBinding viewDataBinding, int i2) {
            return new h(viewDataBinding, i2).e();
        }
    }

    static class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.q(view).b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.c = false;
            }
            ViewDataBinding.B();
            if (Build.VERSION.SDK_INT < 19 || ViewDataBinding.this.f758f.isAttachedToWindow()) {
                ViewDataBinding.this.n();
                return;
            }
            ViewDataBinding.this.f758f.removeOnAttachStateChangeListener(ViewDataBinding.u);
            ViewDataBinding.this.f758f.addOnAttachStateChangeListener(ViewDataBinding.u);
        }
    }

    class e implements Choreographer.FrameCallback {
        e() {
        }

        public void doFrame(long j2) {
            ViewDataBinding.this.b.run();
        }
    }

    private interface f {
        j a(ViewDataBinding viewDataBinding, int i2);
    }

    protected static class g {
        public final String[][] a;
        public final int[][] b;
        public final int[][] c;

        public g(int i2) {
            this.a = new String[i2][];
            this.b = new int[i2][];
            this.c = new int[i2][];
        }

        public void a(int i2, String[] strArr, int[] iArr, int[] iArr2) {
            this.a[i2] = strArr;
            this.b[i2] = iArr;
            this.c[i2] = iArr2;
        }
    }

    private static class h implements f0, i<LiveData<?>> {

        /* renamed from: g  reason: collision with root package name */
        final j<LiveData<?>> f769g;

        /* renamed from: h  reason: collision with root package name */
        v f770h;

        public h(ViewDataBinding viewDataBinding, int i2) {
            this.f769g = new j<>(viewDataBinding, i2, this);
        }

        public void c(v vVar) {
            LiveData b = this.f769g.b();
            if (b != null) {
                if (this.f770h != null) {
                    b.t(this);
                }
                if (vVar != null) {
                    b.o(vVar, this);
                }
            }
            this.f770h = vVar;
        }

        /* renamed from: d */
        public void b(LiveData<?> liveData) {
            v vVar = this.f770h;
            if (vVar != null) {
                liveData.o(vVar, this);
            }
        }

        public j<LiveData<?>> e() {
            return this.f769g;
        }

        /* renamed from: f */
        public void a(LiveData<?> liveData) {
            liveData.t(this);
        }

        public void k(Object obj) {
            ViewDataBinding a = this.f769g.a();
            if (a != null) {
                j<LiveData<?>> jVar = this.f769g;
                a.t(jVar.b, jVar.b(), 0);
            }
        }
    }

    private interface i<T> {
        void a(T t);

        void b(T t);

        void c(v vVar);
    }

    private static class j<T> extends WeakReference<ViewDataBinding> {
        private final i<T> a;
        protected final int b;
        private T c;

        public j(ViewDataBinding viewDataBinding, int i2, i<T> iVar) {
            super(viewDataBinding, ViewDataBinding.t);
            this.b = i2;
            this.a = iVar;
        }

        /* access modifiers changed from: protected */
        public ViewDataBinding a() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                e();
            }
            return viewDataBinding;
        }

        public T b() {
            return this.c;
        }

        public void c(v vVar) {
            this.a.c(vVar);
        }

        public void d(T t) {
            e();
            this.c = t;
            if (t != null) {
                this.a.b(t);
            }
        }

        public boolean e() {
            boolean z;
            T t = this.c;
            if (t != null) {
                this.a.a(t);
                z = true;
            } else {
                z = false;
            }
            this.c = null;
            return z;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        p = i2;
        r = i2 >= 16;
        if (Build.VERSION.SDK_INT < 19) {
            u = null;
        } else {
            u = new c();
        }
    }

    protected ViewDataBinding(e eVar, View view, int i2) {
        this.b = new d();
        this.c = false;
        this.f756d = false;
        this.f757e = new j[i2];
        this.f758f = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (r) {
            this.f761i = Choreographer.getInstance();
            this.f762j = new e();
        } else {
            this.f762j = null;
            this.f763k = new Handler(Looper.myLooper());
        }
    }

    private static int A(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        while (i2 < length) {
            i3 = (i3 * 10) + (str.charAt(i2) - '0');
            i2++;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static void B() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = t.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof j) {
                ((j) poll).e();
            }
        }
    }

    protected static int E(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static boolean F(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private boolean L(int i2, Object obj, f fVar) {
        if (obj == null) {
            return J(i2);
        }
        j jVar = this.f757e[i2];
        if (jVar == null) {
            C(i2, obj, fVar);
            return true;
        } else if (jVar.b() == obj) {
            return false;
        } else {
            J(i2);
            C(i2, obj, fVar);
            return true;
        }
    }

    private static e j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof e) {
            return (e) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void l() {
        if (this.f760h) {
            D();
        } else if (u()) {
            this.f760h = true;
            this.f756d = false;
            b<Object, ViewDataBinding, Void> bVar = this.f759g;
            if (bVar != null) {
                bVar.c(this, 1, null);
                if (this.f756d) {
                    this.f759g.c(this, 2, null);
                }
            }
            if (!this.f756d) {
                k();
                b<Object, ViewDataBinding, Void> bVar2 = this.f759g;
                if (bVar2 != null) {
                    bVar2.c(this, 3, null);
                }
            }
            this.f760h = false;
        }
    }

    protected static void m(ViewDataBinding viewDataBinding) {
        viewDataBinding.l();
    }

    private static int o(String str, int i2, g gVar, int i3) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = gVar.a[i3];
        int length = strArr.length;
        while (i2 < length) {
            if (TextUtils.equals(subSequence, strArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static int p(ViewGroup viewGroup, int i2) {
        String str = (String) viewGroup.getChildAt(i2).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i3 = i2 + 1; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i2;
                }
                if (w(str2, length)) {
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    static ViewDataBinding q(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(androidx.databinding.k.a.dataBinding);
        }
        return null;
    }

    public static int r() {
        return p;
    }

    /* access modifiers changed from: private */
    public void t(int i2, Object obj, int i3) {
        if (!this.o && z(i2, obj, i3)) {
            D();
        }
    }

    private static boolean w(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return false;
        }
        while (i2 < length) {
            if (!Character.isDigit(str.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void x(androidx.databinding.e r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.g r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            r6 = r16
            r0 = r17
            r7 = r19
            r8 = r20
            androidx.databinding.ViewDataBinding r1 = q(r17)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r17.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r9 = "layout"
            r2 = -1
            r11 = 1
            if (r21 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            boolean r3 = r1.startsWith(r9)
            if (r3 == 0) goto L_0x004b
            r3 = 95
            int r3 = r1.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0047
            int r3 = r3 + r11
            boolean r4 = w(r1, r3)
            if (r4 == 0) goto L_0x0047
            int r1 = A(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0042
            r18[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            r1 = -1
        L_0x0045:
            r3 = 1
            goto L_0x0049
        L_0x0047:
            r1 = -1
            r3 = 0
        L_0x0049:
            r12 = r1
            goto L_0x0069
        L_0x004b:
            if (r1 == 0) goto L_0x0067
            java.lang.String r3 = "binding_"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0067
            int r3 = q
            int r1 = A(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0061
            r18[r1] = r0
        L_0x0061:
            if (r7 != 0) goto L_0x0064
            r1 = -1
        L_0x0064:
            r12 = r1
            r3 = 1
            goto L_0x0069
        L_0x0067:
            r3 = 0
            r12 = -1
        L_0x0069:
            if (r3 != 0) goto L_0x007f
            int r1 = r17.getId()
            if (r1 <= 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            int r1 = r8.get(r1, r2)
            if (r1 < 0) goto L_0x007f
            r2 = r18[r1]
            if (r2 != 0) goto L_0x007f
            r18[r1] = r0
        L_0x007f:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0113
            r13 = r0
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L_0x008c:
            if (r0 >= r14) goto L_0x0113
            android.view.View r2 = r13.getChildAt(r0)
            if (r12 < 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00f9
            boolean r4 = r3.startsWith(r9)
            if (r4 == 0) goto L_0x00f9
            r4 = 47
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00f9
            int r3 = o(r3, r1, r7, r12)
            if (r3 < 0) goto L_0x00f9
            int r1 = r3 + 1
            int[][] r4 = r7.b
            r4 = r4[r12]
            r4 = r4[r3]
            int[][] r5 = r7.c
            r5 = r5[r12]
            r3 = r5[r3]
            int r5 = p(r13, r0)
            if (r5 != r0) goto L_0x00dc
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.f.c(r6, r2, r3)
            r18[r4] = r3
        L_0x00d8:
            r10 = r0
            r11 = r1
            r0 = 1
            goto L_0x00fc
        L_0x00dc:
            int r5 = r5 - r0
            int r5 = r5 + r11
            android.view.View[] r15 = new android.view.View[r5]
            r10 = 0
        L_0x00e1:
            if (r10 >= r5) goto L_0x00ef
            int r11 = r0 + r10
            android.view.View r11 = r13.getChildAt(r11)
            r15[r10] = r11
            int r10 = r10 + 1
            r11 = 1
            goto L_0x00e1
        L_0x00ef:
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.f.d(r6, r15, r3)
            r18[r4] = r3
            int r5 = r5 + -1
            int r0 = r0 + r5
            goto L_0x00d8
        L_0x00f9:
            r10 = r0
            r11 = r1
            r0 = 0
        L_0x00fc:
            if (r0 != 0) goto L_0x010b
            r5 = 0
            r0 = r16
            r1 = r2
            r2 = r18
            r3 = r19
            r4 = r20
            x(r0, r1, r2, r3, r4, r5)
        L_0x010b:
            r0 = 1
            int r1 = r10 + 1
            r0 = r1
            r1 = r11
            r11 = 1
            goto L_0x008c
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.x(androidx.databinding.e, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$g, android.util.SparseIntArray, boolean):void");
    }

    protected static Object[] y(e eVar, View view, int i2, g gVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i2];
        x(eVar, view, objArr, gVar, sparseIntArray, true);
        return objArr;
    }

    /* access modifiers changed from: protected */
    public void C(int i2, Object obj, f fVar) {
        if (obj != null) {
            j jVar = this.f757e[i2];
            if (jVar == null) {
                jVar = fVar.a(this, i2);
                this.f757e[i2] = jVar;
                v vVar = this.f765m;
                if (vVar != null) {
                    jVar.c(vVar);
                }
            }
            jVar.d(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f761i.postFrameCallback(r2.f762j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.f763k.post(r2.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.f764l
            if (r0 == 0) goto L_0x0008
            r0.D()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.v r0 = r2.f765m
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.p r0 = r0.a()
            androidx.lifecycle.p$b r0 = r0.b()
            androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.STARTED
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.c     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.c = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = r
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f761i
            android.view.Choreographer$FrameCallback r1 = r2.f762j
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.f763k
            java.lang.Runnable r1 = r2.b
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.D():void");
    }

    /* access modifiers changed from: protected */
    public void G(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f764l = this;
        }
    }

    public void H(v vVar) {
        v vVar2 = this.f765m;
        if (vVar2 != vVar) {
            if (vVar2 != null) {
                vVar2.a().c(this.f766n);
            }
            this.f765m = vVar;
            if (vVar != null) {
                if (this.f766n == null) {
                    this.f766n = new OnStartListener(this, (a) null);
                }
                vVar.a().a(this.f766n);
            }
            for (j jVar : this.f757e) {
                if (jVar != null) {
                    jVar.c(vVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void I(View view) {
        view.setTag(androidx.databinding.k.a.dataBinding, this);
    }

    /* access modifiers changed from: protected */
    public boolean J(int i2) {
        j jVar = this.f757e[i2];
        if (jVar != null) {
            return jVar.e();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean K(int i2, LiveData<?> liveData) {
        this.o = true;
        try {
            return L(i2, liveData, s);
        } finally {
            this.o = false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    public void n() {
        ViewDataBinding viewDataBinding = this.f764l;
        if (viewDataBinding == null) {
            l();
        } else {
            viewDataBinding.n();
        }
    }

    public View s() {
        return this.f758f;
    }

    public abstract boolean u();

    public abstract void v();

    /* access modifiers changed from: protected */
    public abstract boolean z(int i2, Object obj, int i3);

    protected ViewDataBinding(Object obj, View view, int i2) {
        this(j(obj), view, i2);
    }
}
