package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.v;
import com.sensorberg.factory.R;

/* compiled from: FragLockerSelectionBindingImpl */
public class t0 extends s0 {
    private static final SparseIntArray A = null;
    private static final ViewDataBinding.g z;
    private final FrameLayout x;
    private long y;

    static {
        ViewDataBinding.g gVar = new ViewDataBinding.g(3);
        z = gVar;
        gVar.a(0, new String[]{"frag_locker_selection_available", "frag_no_locker_available"}, new int[]{1, 2}, new int[]{R.layout.frag_locker_selection_available, R.layout.frag_no_locker_available});
    }

    public t0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 3, z, A));
    }

    private boolean M(q0 q0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.y |= 2;
        }
        return true;
    }

    private boolean N(y0 y0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.y |= 1;
        }
        return true;
    }

    public void H(v vVar) {
        super.H(vVar);
        this.v.H(vVar);
        this.w.H(vVar);
    }

    /* access modifiers changed from: protected */
    public void k() {
        synchronized (this) {
            this.y = 0;
        }
        ViewDataBinding.m(this.v);
        ViewDataBinding.m(this.w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.w.u() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.v.u() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.y     // Catch:{ all -> 0x0021 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            com.sensorberg.smartworkspace.app.k.q0 r0 = r6.v
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            com.sensorberg.smartworkspace.app.k.y0 r0 = r6.w
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.t0.u():boolean");
    }

    public void v() {
        synchronized (this) {
            this.y = 4;
        }
        this.v.v();
        this.w.v();
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 == 0) {
            return N((y0) obj, i3);
        }
        if (i2 != 1) {
            return false;
        }
        return M((q0) obj, i3);
    }

    private t0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, objArr[1], objArr[2]);
        this.y = -1;
        FrameLayout frameLayout = objArr[0];
        this.x = frameLayout;
        frameLayout.setTag((Object) null);
        I(view);
        v();
    }
}
