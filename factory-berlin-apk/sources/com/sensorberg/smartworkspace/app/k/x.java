package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.locker.e.b;

/* compiled from: FragLockerBookedBindingImpl */
public class x extends w {
    private static final ViewDataBinding.g C = null;
    private static final SparseIntArray D;
    private long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.locker, 5);
        D.put(R.id.lockerBadge, 6);
        D.put(R.id.guideCenterVertical, 7);
        D.put(R.id.guideCenterHorizontal, 8);
    }

    public x(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 9, C, D));
    }

    private boolean N(LiveData<String> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }

    private boolean O(LiveData<String> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 2;
        }
        return true;
    }

    public void M(b bVar) {
        this.A = bVar;
        synchronized (this) {
            this.B |= 4;
        }
        b(4);
        super.D();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.B     // Catch:{ all -> 0x008d }
            r4 = 0
            r1.B = r4     // Catch:{ all -> 0x008d }
            monitor-exit(r19)     // Catch:{ all -> 0x008d }
            com.sensorberg.smartworkspace.app.screens.locker.e.b r0 = r1.A
            r6 = 15
            long r6 = r6 & r2
            r8 = 14
            r10 = 12
            r12 = 13
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0065
            long r6 = r2 & r10
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x002a
            kotlin.e0.c.a r6 = r0.v()
            kotlin.e0.c.a r7 = r0.w()
            goto L_0x002c
        L_0x002a:
            r6 = 0
            r7 = 0
        L_0x002c:
            long r15 = r2 & r12
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0047
            if (r0 == 0) goto L_0x0039
            androidx.lifecycle.LiveData r15 = r0.t()
            goto L_0x003a
        L_0x0039:
            r15 = 0
        L_0x003a:
            r14 = 0
            r1.K(r14, r15)
            if (r15 == 0) goto L_0x0047
            java.lang.Object r14 = r15.l()
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0048
        L_0x0047:
            r14 = 0
        L_0x0048:
            long r17 = r2 & r8
            int r15 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0055
            androidx.lifecycle.LiveData r0 = r0.x()
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            r15 = 1
            r1.K(r15, r0)
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r0.l()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0069
        L_0x0063:
            r0 = 0
            goto L_0x0069
        L_0x0065:
            r0 = 0
            r6 = 0
            r7 = 0
            r14 = 0
        L_0x0069:
            long r12 = r12 & r2
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0073
            android.widget.TextView r12 = r1.v
            androidx.databinding.j.b.c(r12, r14)
        L_0x0073:
            long r10 = r10 & r2
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0082
            android.widget.Button r10 = r1.w
            com.sensorberg.smartworkspace.app.utils.a.b(r10, r6)
            android.widget.Button r6 = r1.x
            com.sensorberg.smartworkspace.app.utils.a.b(r6, r7)
        L_0x0082:
            long r2 = r2 & r8
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x008c
            android.widget.TextView r2 = r1.z
            androidx.databinding.j.b.c(r2, r0)
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.x.k():void");
    }

    public boolean u() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.B = 8;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 == 0) {
            return N((LiveData) obj, i3);
        }
        if (i2 != 1) {
            return false;
        }
        return O((LiveData) obj, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private x(e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, objArr[8], objArr[7], objArr[5], objArr[6], objArr[4], objArr[1], objArr[2], objArr[0], objArr[3]);
        this.B = -1;
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        this.x.setTag((Object) null);
        this.y.setTag((Object) null);
        this.z.setTag((Object) null);
        I(view);
        v();
    }
}
