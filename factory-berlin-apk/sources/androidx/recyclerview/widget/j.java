package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
final class j implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    static final ThreadLocal<j> f1298k = new ThreadLocal<>();

    /* renamed from: l  reason: collision with root package name */
    static Comparator<c> f1299l = new a();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<RecyclerView> f1300g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    long f1301h;

    /* renamed from: i  reason: collision with root package name */
    long f1302i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<c> f1303j = new ArrayList<>();

    /* compiled from: GapWorker */
    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.f1305d == null) == (cVar2.f1305d == null)) {
                boolean z = cVar.a;
                if (z == cVar2.a) {
                    int i2 = cVar2.b - cVar.b;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = cVar.c - cVar2.c;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (cVar.f1305d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* compiled from: GapWorker */
    static class b implements RecyclerView.o.c {
        int a;
        int b;
        int[] c;

        /* renamed from: d  reason: collision with root package name */
        int f1304d;

        b() {
        }

        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i3 >= 0) {
                int i4 = this.f1304d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[(i4 * 2)];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i4] = i2;
                iArr4[i4 + 1] = i3;
                this.f1304d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1304d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z) {
            this.f1304d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.v0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.p()) {
                        oVar.q(recyclerView.mAdapter.d(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.p(this.a, this.b, recyclerView.mState, this);
                }
                int i2 = this.f1304d;
                if (i2 > oVar.f1191m) {
                    oVar.f1191m = i2;
                    oVar.f1192n = z;
                    recyclerView.mRecycler.K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i2) {
            if (this.c != null) {
                int i3 = this.f1304d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    /* compiled from: GapWorker */
    static class c {
        public boolean a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1305d;

        /* renamed from: e  reason: collision with root package name */
        public int f1306e;

        c() {
        }

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.f1305d = null;
            this.f1306e = 0;
        }
    }

    j() {
    }

    private void b() {
        c cVar;
        int size = this.f1300g.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f1300g.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i2 += recyclerView.mPrefetchRegistry.f1304d;
            }
        }
        this.f1303j.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f1300g.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i6 = 0; i6 < bVar.f1304d * 2; i6 += 2) {
                    if (i4 >= this.f1303j.size()) {
                        cVar = new c();
                        this.f1303j.add(cVar);
                    } else {
                        cVar = this.f1303j.get(i4);
                    }
                    int i7 = bVar.c[i6 + 1];
                    cVar.a = i7 <= abs;
                    cVar.b = abs;
                    cVar.c = i7;
                    cVar.f1305d = recyclerView2;
                    cVar.f1306e = bVar.c[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f1303j, f1299l);
    }

    private void c(c cVar, long j2) {
        RecyclerView.d0 i2 = i(cVar.f1305d, cVar.f1306e, cVar.a ? Long.MAX_VALUE : j2);
        if (i2 != null && i2.b != null && i2.s() && !i2.t()) {
            h((RecyclerView) i2.b.get(), j2);
        }
    }

    private void d(long j2) {
        int i2 = 0;
        while (i2 < this.f1303j.size()) {
            c cVar = this.f1303j.get(i2);
            if (cVar.f1305d != null) {
                c(cVar, j2);
                cVar.a();
                i2++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i2) {
        int j2 = recyclerView.mChildHelper.j();
        for (int i3 = 0; i3 < j2; i3++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i3));
            if (childViewHolderInt.c == i2 && !childViewHolderInt.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j2) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            b bVar = recyclerView.mPrefetchRegistry;
            bVar.c(recyclerView, true);
            if (bVar.f1304d != 0) {
                try {
                    androidx.core.os.b.a("RV Nested Prefetch");
                    recyclerView.mState.f(recyclerView.mAdapter);
                    for (int i2 = 0; i2 < bVar.f1304d * 2; i2 += 2) {
                        i(recyclerView, bVar.c[i2], j2);
                    }
                } finally {
                    androidx.core.os.b.b();
                }
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i2, long j2) {
        if (e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 I = vVar.I(i2, false, j2);
            if (I != null) {
                if (!I.s() || I.t()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.a);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f1300g.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f1301h == 0) {
            this.f1301h = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void g(long j2) {
        b();
        d(j2);
    }

    public void j(RecyclerView recyclerView) {
        this.f1300g.remove(recyclerView);
    }

    public void run() {
        try {
            androidx.core.os.b.a("RV Prefetch");
            if (!this.f1300g.isEmpty()) {
                int size = this.f1300g.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f1300g.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j2) + this.f1302i);
                    this.f1301h = 0;
                    androidx.core.os.b.b();
                }
            }
        } finally {
            this.f1301h = 0;
            androidx.core.os.b.b();
        }
    }
}
