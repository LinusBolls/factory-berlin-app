package com.sensorberg.smartworkspace.app.k;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.smartspaces.sdk.model.IotUnit;

/* compiled from: FragmentOpenDoorBindingImpl */
public class f1 extends e1 {
    private static final ViewDataBinding.g F = null;
    private static final SparseIntArray G = null;
    private final FrameLayout D;
    private long E;

    public f1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 8, F, G));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 2;
        }
        return true;
    }

    private boolean O(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 16;
        }
        return true;
    }

    private boolean P(LiveData<Drawable> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 8;
        }
        return true;
    }

    private boolean Q(LiveData<IotUnit> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 4;
        }
        return true;
    }

    private boolean R(LiveData<IotUnitImageView.b> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 64;
        }
        return true;
    }

    private boolean S(LiveData<Integer> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1024;
        }
        return true;
    }

    private boolean T(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 2048;
        }
        return true;
    }

    private boolean U(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    private boolean V(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 128;
        }
        return true;
    }

    private boolean W(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 32;
        }
        return true;
    }

    private boolean X(LiveData<String> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 256;
        }
        return true;
    }

    private boolean Y(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 512;
        }
        return true;
    }

    public void M(com.sensorberg.smartworkspace.app.screens.door.opening.e eVar) {
        this.C = eVar;
        synchronized (this) {
            this.E |= 4096;
        }
        b(2);
        super.D();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r47 = this;
            r1 = r47
            monitor-enter(r47)
            long r2 = r1.E     // Catch:{ all -> 0x0259 }
            r4 = 0
            r1.E = r4     // Catch:{ all -> 0x0259 }
            monitor-exit(r47)     // Catch:{ all -> 0x0259 }
            com.sensorberg.smartworkspace.app.screens.door.opening.e r0 = r1.C
            r6 = 16383(0x3fff, double:8.0943E-320)
            long r6 = r6 & r2
            r12 = 12416(0x3080, double:6.1343E-320)
            r16 = 12352(0x3040, double:6.1027E-320)
            r18 = 12304(0x3010, double:6.079E-320)
            r20 = 12320(0x3020, double:6.087E-320)
            r22 = 12292(0x3004, double:6.073E-320)
            r24 = 12290(0x3002, double:6.072E-320)
            r26 = 14336(0x3800, double:7.083E-320)
            r28 = 12289(0x3001, double:6.0716E-320)
            r30 = 12296(0x3008, double:6.075E-320)
            r14 = 0
            int r34 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x01bd
            long r6 = r2 & r28
            int r34 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r34 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x0033
            androidx.lifecycle.LiveData r6 = r0.H()
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            r1.K(r14, r6)
            if (r6 == 0) goto L_0x0040
            java.lang.Object r6 = r6.l()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            boolean r6 = androidx.databinding.ViewDataBinding.F(r6)
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            long r34 = r2 & r24
            int r7 = (r34 > r4 ? 1 : (r34 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0054
            androidx.lifecycle.LiveData r7 = r0.x()
            goto L_0x0055
        L_0x0054:
            r7 = 0
        L_0x0055:
            r14 = 1
            r1.K(r14, r7)
            if (r7 == 0) goto L_0x0062
            java.lang.Object r7 = r7.l()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            boolean r7 = androidx.databinding.ViewDataBinding.F(r7)
            goto L_0x0069
        L_0x0068:
            r7 = 0
        L_0x0069:
            long r35 = r2 & r22
            int r14 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0084
            if (r0 == 0) goto L_0x0076
            androidx.lifecycle.LiveData r14 = r0.B()
            goto L_0x0077
        L_0x0076:
            r14 = 0
        L_0x0077:
            r15 = 2
            r1.K(r15, r14)
            if (r14 == 0) goto L_0x0084
            java.lang.Object r14 = r14.l()
            com.sensorberg.smartspaces.sdk.model.IotUnit r14 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r14
            goto L_0x0085
        L_0x0084:
            r14 = 0
        L_0x0085:
            long r36 = r2 & r30
            int r15 = (r36 > r4 ? 1 : (r36 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00a0
            if (r0 == 0) goto L_0x0092
            androidx.lifecycle.LiveData r15 = r0.A()
            goto L_0x0093
        L_0x0092:
            r15 = 0
        L_0x0093:
            r8 = 3
            r1.K(r8, r15)
            if (r15 == 0) goto L_0x00a0
            java.lang.Object r8 = r15.l()
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            long r38 = r2 & r18
            int r9 = (r38 > r4 ? 1 : (r38 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00c2
            if (r0 == 0) goto L_0x00ae
            androidx.lifecycle.LiveData r9 = r0.y()
            goto L_0x00af
        L_0x00ae:
            r9 = 0
        L_0x00af:
            r15 = 4
            r1.K(r15, r9)
            if (r9 == 0) goto L_0x00bc
            java.lang.Object r9 = r9.l()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L_0x00bd
        L_0x00bc:
            r9 = 0
        L_0x00bd:
            boolean r9 = androidx.databinding.ViewDataBinding.F(r9)
            goto L_0x00c3
        L_0x00c2:
            r9 = 0
        L_0x00c3:
            long r38 = r2 & r20
            int r15 = (r38 > r4 ? 1 : (r38 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00e4
            if (r0 == 0) goto L_0x00d0
            androidx.lifecycle.LiveData r15 = r0.L()
            goto L_0x00d1
        L_0x00d0:
            r15 = 0
        L_0x00d1:
            r10 = 5
            r1.K(r10, r15)
            if (r15 == 0) goto L_0x00de
            java.lang.Object r10 = r15.l()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L_0x00df
        L_0x00de:
            r10 = 0
        L_0x00df:
            boolean r10 = androidx.databinding.ViewDataBinding.F(r10)
            goto L_0x00e5
        L_0x00e4:
            r10 = 0
        L_0x00e5:
            long r40 = r2 & r16
            int r11 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0100
            if (r0 == 0) goto L_0x00f2
            androidx.lifecycle.LiveData r11 = r0.C()
            goto L_0x00f3
        L_0x00f2:
            r11 = 0
        L_0x00f3:
            r15 = 6
            r1.K(r15, r11)
            if (r11 == 0) goto L_0x0100
            java.lang.Object r11 = r11.l()
            com.sensorberg.core.view.IotUnitImageView$b r11 = (com.sensorberg.core.view.IotUnitImageView.b) r11
            goto L_0x0101
        L_0x0100:
            r11 = 0
        L_0x0101:
            long r40 = r2 & r12
            int r15 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0122
            if (r0 == 0) goto L_0x010e
            androidx.lifecycle.LiveData r15 = r0.K()
            goto L_0x010f
        L_0x010e:
            r15 = 0
        L_0x010f:
            r12 = 7
            r1.K(r12, r15)
            if (r15 == 0) goto L_0x011c
            java.lang.Object r12 = r15.l()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            goto L_0x011d
        L_0x011c:
            r12 = 0
        L_0x011d:
            boolean r12 = androidx.databinding.ViewDataBinding.F(r12)
            goto L_0x0123
        L_0x0122:
            r12 = 0
        L_0x0123:
            r38 = 12544(0x3100, double:6.1976E-320)
            long r42 = r2 & r38
            int r13 = (r42 > r4 ? 1 : (r42 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0141
            if (r0 == 0) goto L_0x0132
            androidx.lifecycle.LiveData r13 = r0.M()
            goto L_0x0133
        L_0x0132:
            r13 = 0
        L_0x0133:
            r15 = 8
            r1.K(r15, r13)
            if (r13 == 0) goto L_0x0141
            java.lang.Object r13 = r13.l()
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0142
        L_0x0141:
            r13 = 0
        L_0x0142:
            r36 = 12800(0x3200, double:6.324E-320)
            long r42 = r2 & r36
            int r15 = (r42 > r4 ? 1 : (r42 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0166
            if (r0 == 0) goto L_0x0151
            androidx.lifecycle.LiveData r15 = r0.N()
            goto L_0x0152
        L_0x0151:
            r15 = 0
        L_0x0152:
            r4 = 9
            r1.K(r4, r15)
            if (r15 == 0) goto L_0x0160
            java.lang.Object r4 = r15.l()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L_0x0161
        L_0x0160:
            r4 = 0
        L_0x0161:
            boolean r4 = androidx.databinding.ViewDataBinding.F(r4)
            goto L_0x0167
        L_0x0166:
            r4 = 0
        L_0x0167:
            r32 = 13312(0x3400, double:6.577E-320)
            long r44 = r2 & r32
            r42 = 0
            int r5 = (r44 > r42 ? 1 : (r44 == r42 ? 0 : -1))
            if (r5 == 0) goto L_0x018d
            if (r0 == 0) goto L_0x0178
            androidx.lifecycle.LiveData r5 = r0.E()
            goto L_0x0179
        L_0x0178:
            r5 = 0
        L_0x0179:
            r15 = 10
            r1.K(r15, r5)
            if (r5 == 0) goto L_0x0187
            java.lang.Object r5 = r5.l()
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x0188
        L_0x0187:
            r5 = 0
        L_0x0188:
            int r5 = androidx.databinding.ViewDataBinding.E(r5)
            goto L_0x018e
        L_0x018d:
            r5 = 0
        L_0x018e:
            long r44 = r2 & r26
            r42 = 0
            int r15 = (r44 > r42 ? 1 : (r44 == r42 ? 0 : -1))
            if (r15 == 0) goto L_0x01b9
            if (r0 == 0) goto L_0x019d
            androidx.lifecycle.LiveData r0 = r0.F()
            goto L_0x019e
        L_0x019d:
            r0 = 0
        L_0x019e:
            r15 = 11
            r1.K(r15, r0)
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r0.l()
            r15 = r0
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            goto L_0x01ae
        L_0x01ad:
            r15 = 0
        L_0x01ae:
            boolean r0 = androidx.databinding.ViewDataBinding.F(r15)
            r15 = r8
            r46 = r14
            r14 = r0
            r0 = r46
            goto L_0x01c9
        L_0x01b9:
            r15 = r8
            r0 = r14
            r14 = 0
            goto L_0x01c9
        L_0x01bd:
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x01c9:
            long r30 = r2 & r30
            r34 = 0
            int r8 = (r30 > r34 ? 1 : (r30 == r34 ? 0 : -1))
            if (r8 == 0) goto L_0x01d6
            android.view.View r8 = r1.v
            androidx.databinding.j.c.a(r8, r15)
        L_0x01d6:
            long r26 = r2 & r26
            int r8 = (r26 > r34 ? 1 : (r26 == r34 ? 0 : -1))
            if (r8 == 0) goto L_0x01e1
            android.widget.TextView r8 = r1.w
            com.sensorberg.smartworkspace.app.utils.a.e(r8, r14)
        L_0x01e1:
            long r14 = r2 & r28
            int r8 = (r14 > r34 ? 1 : (r14 == r34 ? 0 : -1))
            if (r8 == 0) goto L_0x01ec
            android.widget.ProgressBar r8 = r1.x
            com.sensorberg.smartworkspace.app.utils.a.e(r8, r6)
        L_0x01ec:
            long r14 = r2 & r20
            int r6 = (r14 > r34 ? 1 : (r14 == r34 ? 0 : -1))
            if (r6 == 0) goto L_0x01f7
            com.sensorberg.core.view.IotUnitImageView r6 = r1.y
            com.sensorberg.smartworkspace.app.utils.a.e(r6, r10)
        L_0x01f7:
            long r14 = r2 & r22
            int r6 = (r14 > r34 ? 1 : (r14 == r34 ? 0 : -1))
            if (r6 == 0) goto L_0x0202
            com.sensorberg.core.view.IotUnitImageView r6 = r1.y
            r6.setIotUnit(r0)
        L_0x0202:
            long r14 = r2 & r16
            int r0 = (r14 > r34 ? 1 : (r14 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x020d
            com.sensorberg.core.view.IotUnitImageView r0 = r1.y
            r0.setState(r11)
        L_0x020d:
            r10 = 13312(0x3400, double:6.577E-320)
            long r10 = r10 & r2
            int r0 = (r10 > r34 ? 1 : (r10 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x0219
            android.widget.ImageView r0 = r1.z
            com.sensorberg.smartworkspace.app.utils.a.g(r0, r5)
        L_0x0219:
            long r5 = r2 & r24
            int r0 = (r5 > r34 ? 1 : (r5 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x0224
            android.widget.ImageView r0 = r1.z
            com.sensorberg.smartworkspace.app.utils.a.a(r0, r7)
        L_0x0224:
            r5 = 12416(0x3080, double:6.1343E-320)
            long r5 = r5 & r2
            int r0 = (r5 > r34 ? 1 : (r5 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x0230
            android.widget.ImageView r0 = r1.z
            com.sensorberg.smartworkspace.app.utils.a.e(r0, r12)
        L_0x0230:
            r5 = 12544(0x3100, double:6.1976E-320)
            long r5 = r5 & r2
            int r0 = (r5 > r34 ? 1 : (r5 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x023c
            android.widget.TextView r0 = r1.A
            androidx.databinding.j.b.c(r0, r13)
        L_0x023c:
            r5 = 12800(0x3200, double:6.324E-320)
            long r5 = r5 & r2
            int r0 = (r5 > r34 ? 1 : (r5 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x0248
            android.widget.TextView r0 = r1.A
            com.sensorberg.smartworkspace.app.utils.a.e(r0, r4)
        L_0x0248:
            long r2 = r2 & r18
            int r0 = (r2 > r34 ? 1 : (r2 == r34 ? 0 : -1))
            if (r0 == 0) goto L_0x0258
            android.widget.ImageView r0 = r1.B
            com.sensorberg.smartworkspace.app.utils.a.a(r0, r9)
            android.widget.ImageView r0 = r1.B
            com.sensorberg.smartworkspace.app.utils.a.e(r0, r9)
        L_0x0258:
            return
        L_0x0259:
            r0 = move-exception
            monitor-exit(r47)     // Catch:{ all -> 0x0259 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.f1.k():void");
    }

    public boolean u() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.E = 8192;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        switch (i2) {
            case 0:
                return U((LiveData) obj, i3);
            case 1:
                return N((LiveData) obj, i3);
            case 2:
                return Q((LiveData) obj, i3);
            case 3:
                return P((LiveData) obj, i3);
            case 4:
                return O((LiveData) obj, i3);
            case 5:
                return W((LiveData) obj, i3);
            case 6:
                return R((LiveData) obj, i3);
            case 7:
                return V((LiveData) obj, i3);
            case 8:
                return X((LiveData) obj, i3);
            case 9:
                return Y((LiveData) obj, i3);
            case 10:
                return S((LiveData) obj, i3);
            case 11:
                return T((LiveData) obj, i3);
            default:
                return false;
        }
    }

    private f1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 12, objArr[1], objArr[7], objArr[6], objArr[3], objArr[4], objArr[5], objArr[2]);
        this.E = -1;
        FrameLayout frameLayout = objArr[0];
        this.D = frameLayout;
        frameLayout.setTag((Object) null);
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        this.x.setTag((Object) null);
        this.y.setTag((Object) null);
        this.z.setTag((Object) null);
        this.A.setTag((Object) null);
        this.B.setTag((Object) null);
        I(view);
        v();
    }
}
