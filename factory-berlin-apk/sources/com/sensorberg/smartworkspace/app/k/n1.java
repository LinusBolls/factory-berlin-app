package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.smartworkspace.app.screens.door.d.i;

/* compiled from: ItemFavoriteUnitBindingImpl */
public class n1 extends m1 {
    private static final ViewDataBinding.g B = null;
    private static final SparseIntArray C = null;
    private long A;
    private final RelativeLayout z;

    public n1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 4, B, C));
    }

    public void M(i iVar) {
        this.y = iVar;
        synchronized (this) {
            this.A |= 1;
        }
        b(4);
        super.D();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.A     // Catch:{ all -> 0x0053 }
            r2 = 0
            r10.A = r2     // Catch:{ all -> 0x0053 }
            monitor-exit(r10)     // Catch:{ all -> 0x0053 }
            r4 = 0
            com.sensorberg.smartworkspace.app.screens.door.d.i r5 = r10.y
            r6 = 0
            r7 = 3
            long r0 = r0 & r7
            r7 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0023
            int r4 = r5.c()
            com.sensorberg.smartspaces.sdk.model.IotUnit r0 = r5.d()
            float r6 = r5.b()
            goto L_0x0024
        L_0x0023:
            r0 = r7
        L_0x0024:
            if (r0 == 0) goto L_0x002a
            java.lang.String r7 = r0.getDisplayName()
        L_0x002a:
            r9 = r7
            r7 = r0
            r0 = r9
            goto L_0x002f
        L_0x002e:
            r0 = r7
        L_0x002f:
            if (r8 == 0) goto L_0x0052
            android.widget.ImageView r1 = r10.v
            com.sensorberg.smartworkspace.app.utils.a.g(r1, r4)
            com.sensorberg.core.view.IotUnitImageView r1 = r10.w
            r1.setIotUnit(r7)
            android.widget.TextView r1 = r10.x
            androidx.databinding.j.b.c(r1, r0)
            int r0 = androidx.databinding.ViewDataBinding.r()
            r1 = 11
            if (r0 < r1) goto L_0x0052
            com.sensorberg.core.view.IotUnitImageView r0 = r10.w
            r0.setAlpha(r6)
            android.widget.TextView r0 = r10.x
            r0.setAlpha(r6)
        L_0x0052:
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0053 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.n1.k():void");
    }

    public boolean u() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.A = 2;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private n1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[3], objArr[1], objArr[2]);
        this.A = -1;
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        RelativeLayout relativeLayout = objArr[0];
        this.z = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.x.setTag((Object) null);
        I(view);
        v();
    }
}
