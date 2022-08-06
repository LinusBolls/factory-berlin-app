package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.smartworkspace.app.screens.door.e.b;

/* compiled from: FragNearbyUnitBindingImpl */
public class x0 extends w0 {
    private static final ViewDataBinding.g E = null;
    private static final SparseIntArray F = null;
    private final TextView C;
    private long D;

    public x0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 7, E, F));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    private boolean O(LiveData<IotUnitImageView.b> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 8;
        }
        return true;
    }

    private boolean P(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 32;
        }
        return true;
    }

    private boolean Q(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 64;
        }
        return true;
    }

    private boolean R(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 2;
        }
        return true;
    }

    private boolean S(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 4;
        }
        return true;
    }

    private boolean T(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 16;
        }
        return true;
    }

    public void M(b bVar) {
        this.B = bVar;
        synchronized (this) {
            this.D |= 128;
        }
        b(2);
        super.D();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r36 = this;
            r1 = r36
            monitor-enter(r36)
            long r2 = r1.D     // Catch:{ all -> 0x019d }
            r4 = 0
            r1.D = r4     // Catch:{ all -> 0x019d }
            monitor-exit(r36)     // Catch:{ all -> 0x019d }
            com.sensorberg.smartworkspace.app.screens.door.e.b r0 = r1.B
            r6 = 511(0x1ff, double:2.525E-321)
            long r6 = r6 & r2
            r10 = 400(0x190, double:1.976E-321)
            r12 = 392(0x188, double:1.937E-321)
            r14 = 388(0x184, double:1.917E-321)
            r16 = 386(0x182, double:1.907E-321)
            r18 = 384(0x180, double:1.897E-321)
            r20 = 448(0x1c0, double:2.213E-321)
            r22 = 385(0x181, double:1.9E-321)
            r8 = 0
            int r26 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x012d
            long r6 = r2 & r22
            int r26 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x0042
            if (r0 == 0) goto L_0x002f
            androidx.lifecycle.LiveData r6 = r0.D()
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            r1.K(r8, r6)
            if (r6 == 0) goto L_0x003c
            java.lang.Object r6 = r6.l()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            boolean r6 = androidx.databinding.ViewDataBinding.F(r6)
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            long r26 = r2 & r18
            int r7 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            kotlin.e0.c.a r7 = r0.J()
            kotlin.e0.c.a r26 = r0.K()
            goto L_0x0057
        L_0x0054:
            r7 = 0
            r26 = 0
        L_0x0057:
            long r27 = r2 & r16
            int r29 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r29 == 0) goto L_0x007a
            if (r0 == 0) goto L_0x0066
            androidx.lifecycle.LiveData r27 = r0.L()
            r8 = r27
            goto L_0x0067
        L_0x0066:
            r8 = 0
        L_0x0067:
            r9 = 1
            r1.K(r9, r8)
            if (r8 == 0) goto L_0x0074
            java.lang.Object r8 = r8.l()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L_0x0075
        L_0x0074:
            r8 = 0
        L_0x0075:
            boolean r8 = androidx.databinding.ViewDataBinding.F(r8)
            goto L_0x007b
        L_0x007a:
            r8 = 0
        L_0x007b:
            long r29 = r2 & r14
            int r9 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x009c
            if (r0 == 0) goto L_0x0088
            androidx.lifecycle.LiveData r9 = r0.N()
            goto L_0x0089
        L_0x0088:
            r9 = 0
        L_0x0089:
            r14 = 2
            r1.K(r14, r9)
            if (r9 == 0) goto L_0x0096
            java.lang.Object r9 = r9.l()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L_0x0097
        L_0x0096:
            r9 = 0
        L_0x0097:
            boolean r9 = androidx.databinding.ViewDataBinding.F(r9)
            goto L_0x009d
        L_0x009c:
            r9 = 0
        L_0x009d:
            long r14 = r2 & r12
            int r31 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r31 == 0) goto L_0x00b8
            if (r0 == 0) goto L_0x00aa
            androidx.lifecycle.LiveData r14 = r0.F()
            goto L_0x00ab
        L_0x00aa:
            r14 = 0
        L_0x00ab:
            r15 = 3
            r1.K(r15, r14)
            if (r14 == 0) goto L_0x00b8
            java.lang.Object r14 = r14.l()
            com.sensorberg.core.view.IotUnitImageView$b r14 = (com.sensorberg.core.view.IotUnitImageView.b) r14
            goto L_0x00b9
        L_0x00b8:
            r14 = 0
        L_0x00b9:
            long r31 = r2 & r10
            int r15 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00da
            if (r0 == 0) goto L_0x00c6
            androidx.lifecycle.LiveData r15 = r0.O()
            goto L_0x00c7
        L_0x00c6:
            r15 = 0
        L_0x00c7:
            r10 = 4
            r1.K(r10, r15)
            if (r15 == 0) goto L_0x00d4
            java.lang.Object r10 = r15.l()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L_0x00d5
        L_0x00d4:
            r10 = 0
        L_0x00d5:
            boolean r10 = androidx.databinding.ViewDataBinding.F(r10)
            goto L_0x00db
        L_0x00da:
            r10 = 0
        L_0x00db:
            r24 = 416(0x1a0, double:2.055E-321)
            long r33 = r2 & r24
            int r11 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x00fe
            if (r0 == 0) goto L_0x00ea
            androidx.lifecycle.LiveData r11 = r0.H()
            goto L_0x00eb
        L_0x00ea:
            r11 = 0
        L_0x00eb:
            r15 = 5
            r1.K(r15, r11)
            if (r11 == 0) goto L_0x00f8
            java.lang.Object r11 = r11.l()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            boolean r11 = androidx.databinding.ViewDataBinding.F(r11)
            goto L_0x00ff
        L_0x00fe:
            r11 = 0
        L_0x00ff:
            long r33 = r2 & r20
            int r15 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0123
            if (r0 == 0) goto L_0x010c
            androidx.lifecycle.LiveData r0 = r0.I()
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            r15 = 6
            r1.K(r15, r0)
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r0.l()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x011b
        L_0x011a:
            r0 = 0
        L_0x011b:
            boolean r0 = androidx.databinding.ViewDataBinding.F(r0)
            r15 = r14
            r14 = r26
            goto L_0x0127
        L_0x0123:
            r15 = r14
            r14 = r26
            r0 = 0
        L_0x0127:
            r35 = r8
            r8 = r6
            r6 = r35
            goto L_0x0136
        L_0x012d:
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
        L_0x0136:
            long r22 = r2 & r22
            int r26 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x0141
            android.widget.TextView r12 = r1.C
            com.sensorberg.smartworkspace.app.utils.a.e(r12, r8)
        L_0x0141:
            long r12 = r2 & r20
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x014c
            android.widget.TextView r8 = r1.w
            com.sensorberg.smartworkspace.app.utils.a.e(r8, r0)
        L_0x014c:
            long r12 = r2 & r18
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x015c
            android.widget.TextView r0 = r1.w
            com.sensorberg.smartworkspace.app.utils.a.b(r0, r7)
            com.sensorberg.core.view.IotUnitImageView r0 = r1.x
            com.sensorberg.smartworkspace.app.utils.a.b(r0, r14)
        L_0x015c:
            r7 = 388(0x184, double:1.917E-321)
            long r7 = r7 & r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0168
            com.sensorberg.core.view.IotUnitImageView r0 = r1.x
            com.sensorberg.smartworkspace.app.utils.a.e(r0, r9)
        L_0x0168:
            r7 = 392(0x188, double:1.937E-321)
            long r7 = r7 & r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0174
            com.sensorberg.core.view.IotUnitImageView r0 = r1.x
            r0.setState(r15)
        L_0x0174:
            r7 = 400(0x190, double:1.976E-321)
            long r7 = r7 & r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0180
            android.widget.TextView r0 = r1.y
            com.sensorberg.smartworkspace.app.utils.a.e(r0, r10)
        L_0x0180:
            r7 = 416(0x1a0, double:2.055E-321)
            long r7 = r7 & r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x018c
            android.widget.TextView r0 = r1.z
            com.sensorberg.smartworkspace.app.utils.a.e(r0, r11)
        L_0x018c:
            long r2 = r2 & r16
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x019c
            android.widget.ImageView r0 = r1.A
            com.sensorberg.smartworkspace.app.utils.a.a(r0, r6)
            android.widget.ImageView r0 = r1.A
            com.sensorberg.smartworkspace.app.utils.a.e(r0, r6)
        L_0x019c:
            return
        L_0x019d:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x019d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.x0.k():void");
    }

    public boolean u() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.D = 256;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        switch (i2) {
            case 0:
                return N((LiveData) obj, i3);
            case 1:
                return R((LiveData) obj, i3);
            case 2:
                return S((LiveData) obj, i3);
            case 3:
                return O((LiveData) obj, i3);
            case 4:
                return T((LiveData) obj, i3);
            case 5:
                return P((LiveData) obj, i3);
            case 6:
                return Q((LiveData) obj, i3);
            default:
                return false;
        }
    }

    private x0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 7, objArr[0], objArr[6], objArr[3], objArr[4], objArr[5], objArr[2]);
        this.D = -1;
        this.v.setTag((Object) null);
        TextView textView = objArr[1];
        this.C = textView;
        textView.setTag((Object) null);
        this.w.setTag((Object) null);
        this.x.setTag((Object) null);
        this.y.setTag((Object) null);
        this.z.setTag((Object) null);
        this.A.setTag((Object) null);
        I(view);
        v();
    }
}
