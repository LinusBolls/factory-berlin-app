package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.core.app.a;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import e.e.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity */
public class d extends ComponentActivity implements a.b, a.d {

    /* renamed from: n  reason: collision with root package name */
    final h f807n = h.b(new a());
    final w o = new w(this);
    boolean p;
    boolean q;
    boolean r = true;
    boolean s;
    boolean t;
    boolean u;
    int v;
    h<String> w;

    /* compiled from: FragmentActivity */
    class a extends j<d> implements s0, c {
        public a() {
            super(d.this);
        }

        public p a() {
            return d.this.o;
        }

        public OnBackPressedDispatcher c() {
            return d.this.c();
        }

        public View e(int i2) {
            return d.this.findViewById(i2);
        }

        public boolean f() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public void j(Fragment fragment) {
            d.this.v(fragment);
        }

        public LayoutInflater l() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        public void m(Fragment fragment, String[] strArr, int i2) {
            d.this.y(fragment, strArr, i2);
        }

        public boolean n(Fragment fragment) {
            return !d.this.isFinishing();
        }

        public r0 o() {
            return d.this.o();
        }

        public boolean p(String str) {
            return androidx.core.app.a.q(d.this, str);
        }

        public void q(Fragment fragment, Intent intent, int i2, Bundle bundle) {
            d.this.z(fragment, intent, i2, bundle);
        }

        public void r() {
            d.this.A();
        }

        /* renamed from: s */
        public d k() {
            return d.this;
        }
    }

    private int p(Fragment fragment) {
        if (this.w.v() < 65534) {
            while (this.w.m(this.v) >= 0) {
                this.v = (this.v + 1) % 65534;
            }
            int i2 = this.v;
            this.w.s(i2, fragment.f779k);
            this.v = (this.v + 1) % 65534;
            return i2;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void q(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void t() {
        do {
        } while (u(s(), p.b.CREATED));
    }

    private static boolean u(m mVar, p.b bVar) {
        boolean z = false;
        for (Fragment next : mVar.f0()) {
            if (next != null) {
                if (next.I() != null) {
                    z |= u(next.B(), bVar);
                }
                y yVar = next.X;
                if (yVar != null && yVar.a().b().a(p.b.STARTED)) {
                    next.X.g(bVar);
                    z = true;
                }
                if (next.W.b().a(p.b.STARTED)) {
                    next.W.p(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    public void A() {
        invalidateOptionsMenu();
    }

    public final void b(int i2) {
        if (!this.s && i2 != -1) {
            q(i2);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.p);
        printWriter.print(" mResumed=");
        printWriter.print(this.q);
        printWriter.print(" mStopped=");
        printWriter.print(this.r);
        if (getApplication() != null) {
            e.o.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f807n.u().M(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f807n.v();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String g2 = this.w.g(i5);
            this.w.t(i5);
            if (g2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t2 = this.f807n.t(g2);
            if (t2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + g2);
                return;
            }
            t2.r0(i2 & 65535, i3, intent);
            return;
        }
        a.c n2 = androidx.core.app.a.n();
        if (n2 == null || !n2.a(this, i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f807n.v();
        this.f807n.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f807n.a((Fragment) null);
        if (bundle != null) {
            this.f807n.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.v = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.w = new h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.w.s(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.w == null) {
            this.w = new h<>();
            this.v = 0;
        }
        super.onCreate(bundle);
        this.o.i(p.a.ON_CREATE);
        this.f807n.f();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            return super.onCreatePanelMenu(i2, menu) | this.f807n.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View r2 = r(view, str, context, attributeSet);
        return r2 == null ? super.onCreateView(view, str, context, attributeSet) : r2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f807n.h();
        this.o.i(p.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f807n.i();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f807n.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f807n.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f807n.j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f807n.v();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f807n.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.q = false;
        this.f807n.m();
        this.o.i(p.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f807n.n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        x();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return w(view, menu) | this.f807n.o(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f807n.v();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String g2 = this.w.g(i4);
            this.w.t(i4);
            if (g2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t2 = this.f807n.t(g2);
            if (t2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + g2);
                return;
            }
            t2.Q0(i2 & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.q = true;
        this.f807n.v();
        this.f807n.s();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        t();
        this.o.i(p.a.ON_STOP);
        Parcelable y = this.f807n.y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.w.v() > 0) {
            bundle.putInt("android:support:next_request_index", this.v);
            int[] iArr = new int[this.w.v()];
            String[] strArr = new String[this.w.v()];
            for (int i2 = 0; i2 < this.w.v(); i2++) {
                iArr[i2] = this.w.r(i2);
                strArr[i2] = this.w.w(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.r = false;
        if (!this.p) {
            this.p = true;
            this.f807n.c();
        }
        this.f807n.v();
        this.f807n.s();
        this.o.i(p.a.ON_START);
        this.f807n.q();
    }

    public void onStateNotSaved() {
        this.f807n.v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.r = true;
        t();
        this.f807n.r();
        this.o.i(p.a.ON_STOP);
    }

    /* access modifiers changed from: package-private */
    public final View r(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f807n.w(view, str, context, attributeSet);
    }

    public m s() {
        return this.f807n.u();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.u && i2 != -1) {
            q(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.t && i2 != -1) {
            q(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public void v(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean w(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    public void x() {
        this.o.i(p.a.ON_RESUME);
        this.f807n.p();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void y(Fragment fragment, String[] strArr, int i2) {
        if (i2 == -1) {
            androidx.core.app.a.p(this, strArr, i2);
            return;
        }
        q(i2);
        try {
            this.s = true;
            androidx.core.app.a.p(this, strArr, ((p(fragment) + 1) << 16) + (i2 & 65535));
            this.s = false;
        } catch (Throwable th) {
            this.s = false;
            throw th;
        }
    }

    public void z(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        this.u = true;
        if (i2 == -1) {
            try {
                androidx.core.app.a.r(this, intent, -1, bundle);
            } finally {
                this.u = false;
            }
        } else {
            q(i2);
            androidx.core.app.a.r(this, intent, ((p(fragment) + 1) << 16) + (i2 & 65535), bundle);
            this.u = false;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View r2 = r((View) null, str, context, attributeSet);
        return r2 == null ? super.onCreateView(str, context, attributeSet) : r2;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.u && i2 != -1) {
            q(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (!this.t && i2 != -1) {
            q(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
