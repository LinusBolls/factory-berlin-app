package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.m.a.a;

/* compiled from: FragChangePasswordBindingImpl */
public class l extends k implements a.C0477a {
    private static final ViewDataBinding.g J = null;
    private static final SparseIntArray K;
    private final View.OnClickListener E;
    private g F;
    private g G;
    private g H;
    private long I;

    /* compiled from: FragChangePasswordBindingImpl */
    class a implements g {
        a() {
        }

        public void a() {
            String a2 = androidx.databinding.j.b.a(l.this.y);
            com.sensorberg.smartworkspace.app.screens.password.a aVar = l.this.D;
            boolean z = true;
            if (aVar != null) {
                e0<String> w = aVar.w();
                if (w == null) {
                    z = false;
                }
                if (z) {
                    w.u(a2);
                }
            }
        }
    }

    /* compiled from: FragChangePasswordBindingImpl */
    class b implements g {
        b() {
        }

        public void a() {
            String a2 = androidx.databinding.j.b.a(l.this.z);
            com.sensorberg.smartworkspace.app.screens.password.a aVar = l.this.D;
            boolean z = true;
            if (aVar != null) {
                e0<String> y = aVar.y();
                if (y == null) {
                    z = false;
                }
                if (z) {
                    y.u(a2);
                }
            }
        }
    }

    /* compiled from: FragChangePasswordBindingImpl */
    class c implements g {
        c() {
        }

        public void a() {
            String a2 = androidx.databinding.j.b.a(l.this.A);
            com.sensorberg.smartworkspace.app.screens.password.a aVar = l.this.D;
            boolean z = true;
            if (aVar != null) {
                e0<String> z2 = aVar.z();
                if (z2 == null) {
                    z = false;
                }
                if (z) {
                    z2.u(a2);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 6);
        K.put(R.id.toolbar, 7);
        K.put(R.id.changePasswordError, 8);
        K.put(R.id.input_1, 9);
        K.put(R.id.input_2, 10);
        K.put(R.id.input_3, 11);
    }

    public l(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 12, J, K));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    private boolean O(e0<String> e0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    private boolean P(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 4;
        }
        return true;
    }

    private boolean Q(e0<String> e0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 8;
        }
        return true;
    }

    private boolean R(e0<String> e0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 16;
        }
        return true;
    }

    public void M(com.sensorberg.smartworkspace.app.screens.password.a aVar) {
        this.D = aVar;
        synchronized (this) {
            this.I |= 32;
        }
        b(4);
        super.D();
    }

    public final void a(int i2, View view) {
        com.sensorberg.smartworkspace.app.screens.password.a aVar = this.D;
        if (aVar != null) {
            aVar.J();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r26 = this;
            r1 = r26
            monitor-enter(r26)
            long r2 = r1.I     // Catch:{ all -> 0x011e }
            r4 = 0
            r1.I = r4     // Catch:{ all -> 0x011e }
            monitor-exit(r26)     // Catch:{ all -> 0x011e }
            com.sensorberg.smartworkspace.app.screens.password.a r0 = r1.D
            r6 = 127(0x7f, double:6.27E-322)
            long r6 = r6 & r2
            r10 = 104(0x68, double:5.14E-322)
            r12 = 98
            r14 = 100
            r16 = 97
            r8 = 0
            r9 = 0
            int r20 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x00bc
            long r6 = r2 & r16
            int r20 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x002a
            androidx.lifecycle.LiveData r6 = r0.v()
            goto L_0x002b
        L_0x002a:
            r6 = r9
        L_0x002b:
            r1.K(r8, r6)
            if (r6 == 0) goto L_0x0037
            java.lang.Object r6 = r6.l()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L_0x0038
        L_0x0037:
            r6 = r9
        L_0x0038:
            boolean r6 = androidx.databinding.ViewDataBinding.F(r6)
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            long r20 = r2 & r12
            int r7 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x004b
            androidx.lifecycle.e0 r7 = r0.w()
            goto L_0x004c
        L_0x004b:
            r7 = r9
        L_0x004c:
            r8 = 1
            r1.K(r8, r7)
            if (r7 == 0) goto L_0x0059
            java.lang.Object r7 = r7.l()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x005a
        L_0x0059:
            r7 = r9
        L_0x005a:
            long r21 = r2 & r14
            int r8 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x0067
            androidx.lifecycle.LiveData r8 = r0.F()
            goto L_0x0068
        L_0x0067:
            r8 = r9
        L_0x0068:
            r12 = 2
            r1.K(r12, r8)
            if (r8 == 0) goto L_0x0075
            java.lang.Object r8 = r8.l()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L_0x0076
        L_0x0075:
            r8 = r9
        L_0x0076:
            boolean r8 = androidx.databinding.ViewDataBinding.F(r8)
            goto L_0x007c
        L_0x007b:
            r8 = 0
        L_0x007c:
            long r12 = r2 & r10
            int r20 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x0097
            if (r0 == 0) goto L_0x0089
            androidx.lifecycle.e0 r12 = r0.y()
            goto L_0x008a
        L_0x0089:
            r12 = r9
        L_0x008a:
            r13 = 3
            r1.K(r13, r12)
            if (r12 == 0) goto L_0x0097
            java.lang.Object r12 = r12.l()
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0098
        L_0x0097:
            r12 = r9
        L_0x0098:
            r18 = 112(0x70, double:5.53E-322)
            long r23 = r2 & r18
            int r13 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00a7
            androidx.lifecycle.e0 r0 = r0.z()
            goto L_0x00a8
        L_0x00a7:
            r0 = r9
        L_0x00a8:
            r13 = 4
            r1.K(r13, r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r0.l()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00b6
        L_0x00b5:
            r0 = r9
        L_0x00b6:
            r25 = r8
            r8 = r6
            r6 = r25
            goto L_0x00c1
        L_0x00bc:
            r0 = r9
            r7 = r0
            r12 = r7
            r6 = 0
            r8 = 0
        L_0x00c1:
            long r16 = r2 & r16
            int r13 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00cc
            com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar r13 = r1.v
            com.sensorberg.smartworkspace.app.utils.a.e(r13, r8)
        L_0x00cc:
            long r13 = r2 & r14
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00d7
            android.widget.Button r8 = r1.w
            r8.setEnabled(r6)
        L_0x00d7:
            r13 = 64
            long r13 = r13 & r2
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00fa
            android.widget.Button r6 = r1.w
            android.view.View$OnClickListener r8 = r1.E
            r6.setOnClickListener(r8)
            com.google.android.material.textfield.TextInputEditText r6 = r1.y
            androidx.databinding.g r8 = r1.F
            androidx.databinding.j.b.d(r6, r9, r9, r9, r8)
            com.google.android.material.textfield.TextInputEditText r6 = r1.z
            androidx.databinding.g r8 = r1.G
            androidx.databinding.j.b.d(r6, r9, r9, r9, r8)
            com.google.android.material.textfield.TextInputEditText r6 = r1.A
            androidx.databinding.g r8 = r1.H
            androidx.databinding.j.b.d(r6, r9, r9, r9, r8)
        L_0x00fa:
            r8 = 98
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0106
            com.google.android.material.textfield.TextInputEditText r6 = r1.y
            androidx.databinding.j.b.c(r6, r7)
        L_0x0106:
            long r6 = r2 & r10
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0111
            com.google.android.material.textfield.TextInputEditText r6 = r1.z
            androidx.databinding.j.b.c(r6, r12)
        L_0x0111:
            r6 = 112(0x70, double:5.53E-322)
            long r2 = r2 & r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x011d
            com.google.android.material.textfield.TextInputEditText r2 = r1.A
            androidx.databinding.j.b.c(r2, r0)
        L_0x011d:
            return
        L_0x011e:
            r0 = move-exception
            monitor-exit(r26)     // Catch:{ all -> 0x011e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.l.k():void");
    }

    public boolean u() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.I = 64;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 == 0) {
            return N((LiveData) obj, i3);
        }
        if (i2 == 1) {
            return O((e0) obj, i3);
        }
        if (i2 == 2) {
            return P((LiveData) obj, i3);
        }
        if (i2 == 3) {
            return Q((e0) obj, i3);
        }
        if (i2 != 4) {
            return false;
        }
        return R((e0) obj, i3);
    }

    private l(e eVar, View view, Object[] objArr) {
        super(eVar, view, 5, objArr[6], objArr[5], objArr[4], objArr[8], objArr[1], objArr[9], objArr[10], objArr[11], objArr[2], objArr[3], objArr[0], objArr[7]);
        this.F = new a();
        this.G = new b();
        this.H = new c();
        this.I = -1;
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        this.y.setTag((Object) null);
        this.z.setTag((Object) null);
        this.A.setTag((Object) null);
        this.B.setTag((Object) null);
        I(view);
        this.E = new com.sensorberg.smartworkspace.app.m.a.a(this, 1);
        v();
    }
}
