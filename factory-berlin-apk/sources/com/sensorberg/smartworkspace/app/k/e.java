package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.sensorberg.factory.R;

/* compiled from: ActivityLoginUsernameBindingImpl */
public class e extends d {
    private static final ViewDataBinding.g F = null;
    private static final SparseIntArray G;
    private g C;
    private g D;
    private long E;

    /* compiled from: ActivityLoginUsernameBindingImpl */
    class a implements g {
        a() {
        }

        public void a() {
            String a2 = androidx.databinding.j.b.a(e.this.y);
            com.sensorberg.smartworkspace.app.activities.login.internal.a aVar = e.this.B;
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

    /* compiled from: ActivityLoginUsernameBindingImpl */
    class b implements g {
        b() {
        }

        public void a() {
            String a2 = androidx.databinding.j.b.a(e.this.A);
            com.sensorberg.smartworkspace.app.activities.login.internal.a aVar = e.this.B;
            boolean z = true;
            if (aVar != null) {
                e0<String> C = aVar.C();
                if (C == null) {
                    z = false;
                }
                if (z) {
                    C.u(a2);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.loginError, 5);
        G.put(R.id.guideCenterHorizontal, 6);
        G.put(R.id.image, 7);
        G.put(R.id.username, 8);
        G.put(R.id.password, 9);
    }

    public e(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 10, F, G));
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

    private boolean O(e0<String> e0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 8;
        }
        return true;
    }

    private boolean P(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    private boolean Q(e0<String> e0Var, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 4;
        }
        return true;
    }

    public void M(com.sensorberg.smartworkspace.app.activities.login.internal.a aVar) {
        this.B = aVar;
        synchronized (this) {
            this.E |= 16;
        }
        b(4);
        super.D();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r27 = this;
            r1 = r27
            monitor-enter(r27)
            long r2 = r1.E     // Catch:{ all -> 0x010f }
            r4 = 0
            r1.E = r4     // Catch:{ all -> 0x010f }
            monitor-exit(r27)     // Catch:{ all -> 0x010f }
            com.sensorberg.smartworkspace.app.activities.login.internal.a r0 = r1.B
            r6 = 63
            long r6 = r6 & r2
            r8 = 52
            r12 = 48
            r14 = 50
            r16 = 49
            r10 = 0
            int r20 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x00b5
            long r6 = r2 & r16
            int r20 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x0029
            androidx.lifecycle.LiveData r6 = r0.A()
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            r1.K(r10, r6)
            if (r6 == 0) goto L_0x0036
            java.lang.Object r6 = r6.l()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            boolean r6 = androidx.databinding.ViewDataBinding.F(r6)
            goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            long r20 = r2 & r12
            int r7 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x004e
            if (r0 == 0) goto L_0x004e
            kotlin.e0.c.a r7 = r0.x()
            kotlin.e0.c.a r20 = r0.y()
            goto L_0x0051
        L_0x004e:
            r7 = 0
            r20 = 0
        L_0x0051:
            long r21 = r2 & r14
            int r23 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r23 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            androidx.lifecycle.LiveData r10 = r0.G()
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r11 = 1
            r1.K(r11, r10)
            if (r10 == 0) goto L_0x006c
            java.lang.Object r10 = r10.l()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L_0x006d
        L_0x006c:
            r10 = 0
        L_0x006d:
            boolean r10 = androidx.databinding.ViewDataBinding.F(r10)
        L_0x0071:
            long r22 = r2 & r8
            int r11 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x008c
            if (r0 == 0) goto L_0x007e
            androidx.lifecycle.e0 r11 = r0.C()
            goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            r8 = 2
            r1.K(r8, r11)
            if (r11 == 0) goto L_0x008c
            java.lang.Object r8 = r11.l()
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            r18 = 56
            long r24 = r2 & r18
            int r9 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00ac
            if (r0 == 0) goto L_0x009c
            androidx.lifecycle.e0 r0 = r0.z()
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            r9 = 3
            r1.K(r9, r0)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r0.l()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r20
            goto L_0x00af
        L_0x00ac:
            r9 = r20
            r0 = 0
        L_0x00af:
            r26 = r10
            r10 = r6
            r6 = r26
            goto L_0x00ba
        L_0x00b5:
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x00ba:
            long r16 = r2 & r16
            int r11 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x00c5
            com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar r11 = r1.v
            com.sensorberg.smartworkspace.app.utils.a.e(r11, r10)
        L_0x00c5:
            long r10 = r2 & r14
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x00d0
            android.widget.Button r10 = r1.w
            r10.setEnabled(r6)
        L_0x00d0:
            long r10 = r2 & r12
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00e0
            android.widget.Button r6 = r1.w
            com.sensorberg.smartworkspace.app.utils.a.b(r6, r7)
            com.google.android.material.textfield.TextInputEditText r6 = r1.y
            com.sensorberg.smartworkspace.app.utils.a.c(r6, r9)
        L_0x00e0:
            r6 = 56
            long r6 = r6 & r2
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00ec
            com.google.android.material.textfield.TextInputEditText r6 = r1.y
            androidx.databinding.j.b.c(r6, r0)
        L_0x00ec:
            r6 = 32
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0102
            com.google.android.material.textfield.TextInputEditText r0 = r1.y
            androidx.databinding.g r6 = r1.C
            r7 = 0
            androidx.databinding.j.b.d(r0, r7, r7, r7, r6)
            com.google.android.material.textfield.TextInputEditText r0 = r1.A
            androidx.databinding.g r6 = r1.D
            androidx.databinding.j.b.d(r0, r7, r7, r7, r6)
        L_0x0102:
            r6 = 52
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
            com.google.android.material.textfield.TextInputEditText r0 = r1.A
            androidx.databinding.j.b.c(r0, r8)
        L_0x010e:
            return
        L_0x010f:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x010f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.k.e.k():void");
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
            this.E = 32;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 == 0) {
            return P((LiveData) obj, i3);
        }
        if (i2 == 1) {
            return N((LiveData) obj, i3);
        }
        if (i2 == 2) {
            return Q((e0) obj, i3);
        }
        if (i2 != 3) {
            return false;
        }
        return O((e0) obj, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 4, objArr[4], objArr[6], objArr[7], objArr[3], objArr[5], objArr[9], objArr[2], objArr[0], objArr[8], objArr[1]);
        this.C = new a();
        this.D = new b();
        this.E = -1;
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        this.y.setTag((Object) null);
        this.z.setTag((Object) null);
        this.A.setTag((Object) null);
        I(view);
        v();
    }
}
