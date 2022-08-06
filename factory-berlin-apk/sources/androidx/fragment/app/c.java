package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/* compiled from: DialogFragment */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler d0;
    private Runnable e0 = new a();
    private DialogInterface.OnCancelListener f0 = new b();
    /* access modifiers changed from: private */
    public DialogInterface.OnDismissListener g0 = new C0020c();
    private int h0 = 0;
    private int i0 = 0;
    private boolean j0 = true;
    private boolean k0 = true;
    private int l0 = -1;
    private boolean m0;
    /* access modifiers changed from: private */
    public Dialog n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;

    /* compiled from: DialogFragment */
    class a implements Runnable {
        a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            c.this.g0.onDismiss(c.this.n0);
        }
    }

    /* compiled from: DialogFragment */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (c.this.n0 != null) {
                c cVar = c.this;
                cVar.onCancel(cVar.n0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* compiled from: DialogFragment */
    class C0020c implements DialogInterface.OnDismissListener {
        C0020c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (c.this.n0 != null) {
                c cVar = c.this;
                cVar.onDismiss(cVar.n0);
            }
        }
    }

    private void U1(boolean z, boolean z2) {
        if (!this.p0) {
            this.p0 = true;
            this.q0 = false;
            Dialog dialog = this.n0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.n0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.d0.getLooper()) {
                        onDismiss(this.n0);
                    } else {
                        this.d0.post(this.e0);
                    }
                }
            }
            this.o0 = true;
            if (this.l0 >= 0) {
                P().F0(this.l0, 1);
                this.l0 = -1;
                return;
            }
            u i2 = P().i();
            i2.q(this);
            if (z) {
                i2.k();
            } else {
                i2.j();
            }
        }
    }

    public void D0() {
        super.D0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.n0.dismiss();
            if (!this.p0) {
                onDismiss(this.n0);
            }
            this.n0 = null;
        }
    }

    public void E0() {
        super.E0();
        if (!this.q0 && !this.p0) {
            this.p0 = true;
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater F0(Bundle bundle) {
        LayoutInflater F0 = super.F0(bundle);
        if (!this.k0 || this.m0) {
            return F0;
        }
        try {
            this.m0 = true;
            Dialog X1 = X1(bundle);
            this.n0 = X1;
            c2(X1, this.h0);
            this.m0 = false;
            return F0.cloneInContext(Y1().getContext());
        } catch (Throwable th) {
            this.m0 = false;
            throw th;
        }
    }

    public void S0(Bundle bundle) {
        super.S0(bundle);
        Dialog dialog = this.n0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i2 = this.h0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.i0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.j0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.k0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.l0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void S1() {
        U1(false, false);
    }

    public void T0() {
        super.T0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = false;
            dialog.show();
        }
    }

    public void T1() {
        U1(true, false);
    }

    public void U0() {
        super.U0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog V1() {
        return this.n0;
    }

    public int W1() {
        return this.i0;
    }

    public Dialog X1(Bundle bundle) {
        return new Dialog(x1(), W1());
    }

    public final Dialog Y1() {
        Dialog V1 = V1();
        if (V1 != null) {
            return V1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void Z1(boolean z) {
        this.j0 = z;
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void a2(boolean z) {
        this.k0 = z;
    }

    public void b2(int i2, int i3) {
        this.h0 = i2;
        if (i2 == 2 || i2 == 3) {
            this.i0 = 16973913;
        }
        if (i3 != 0) {
            this.i0 = i3;
        }
    }

    public void c2(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void d2(m mVar, String str) {
        this.p0 = false;
        this.q0 = true;
        u i2 = mVar.i();
        i2.e(this, str);
        i2.j();
    }

    public void e2(m mVar, String str) {
        this.p0 = false;
        this.q0 = true;
        u i2 = mVar.i();
        i2.e(this, str);
        i2.l();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.o0) {
            U1(true, true);
        }
    }

    public void q0(Bundle bundle) {
        Bundle bundle2;
        super.q0(bundle);
        if (this.k0) {
            View Z = Z();
            if (this.n0 != null) {
                if (Z != null) {
                    if (Z.getParent() == null) {
                        this.n0.setContentView(Z);
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
                d v = v();
                if (v != null) {
                    this.n0.setOwnerActivity(v);
                }
                this.n0.setCancelable(this.j0);
                this.n0.setOnCancelListener(this.f0);
                this.n0.setOnDismissListener(this.g0);
                if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                    this.n0.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void t0(Context context) {
        super.t0(context);
        if (!this.q0) {
            this.p0 = false;
        }
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        this.d0 = new Handler();
        this.k0 = this.C == 0;
        if (bundle != null) {
            this.h0 = bundle.getInt("android:style", 0);
            this.i0 = bundle.getInt("android:theme", 0);
            this.j0 = bundle.getBoolean("android:cancelable", true);
            this.k0 = bundle.getBoolean("android:showsDialog", this.k0);
            this.l0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
