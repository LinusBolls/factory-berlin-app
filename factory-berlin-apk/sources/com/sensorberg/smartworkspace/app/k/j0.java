package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.locker.selection.b;
import com.sensorberg.smartworkspace.app.utils.a;

/* compiled from: FragLockerGroupSelectionBindingImpl */
public class j0 extends i0 {
    private static final ViewDataBinding.g B;
    private static final SparseIntArray C;
    private long A;
    private final LinearLayout z;

    static {
        ViewDataBinding.g gVar = new ViewDataBinding.g(4);
        B = gVar;
        gVar.a(0, new String[]{"frag_locker_error"}, new int[]{2}, new int[]{R.layout.frag_locker_error});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.recycler, 3);
    }

    public j0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 4, B, C));
    }

    private boolean N(g0 g0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 2;
        }
        return true;
    }

    private boolean O(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 1;
        }
        return true;
    }

    public void H(v vVar) {
        super.H(vVar);
        this.v.H(vVar);
    }

    public void M(b bVar) {
        this.y = bVar;
        synchronized (this) {
            this.A |= 4;
        }
        b(4);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        synchronized (this) {
            j2 = this.A;
            this.A = 0;
        }
        b bVar = this.y;
        boolean z2 = false;
        int i2 = ((j2 & 13) > 0 ? 1 : ((j2 & 13) == 0 ? 0 : -1));
        if (i2 != 0) {
            Boolean bool = null;
            LiveData<Boolean> u = bVar != null ? bVar.u() : null;
            K(0, u);
            if (u != null) {
                bool = u.l();
            }
            z2 = ViewDataBinding.F(bool);
        }
        if (i2 != 0) {
            a.e(this.w, z2);
        }
        ViewDataBinding.m(this.v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
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
            long r0 = r6.A     // Catch:{ all -> 0x0018 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            com.sensorberg.smartworkspace.app.k.g0 r0 = r6.v
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.j0.u():boolean");
    }

    public void v() {
        synchronized (this) {
            this.A = 8;
        }
        this.v.v();
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 == 0) {
            return O((LiveData) obj, i3);
        }
        if (i2 != 1) {
            return false;
        }
        return N((g0) obj, i3);
    }

    private j0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, objArr[2], objArr[1], objArr[3]);
        this.A = -1;
        this.w.setTag((Object) null);
        LinearLayout linearLayout = objArr[0];
        this.z = linearLayout;
        linearLayout.setTag((Object) null);
        I(view);
        v();
    }
}
