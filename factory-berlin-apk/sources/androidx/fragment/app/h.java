package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.s0;

/* compiled from: FragmentController */
public class h {
    private final j<?> a;

    private h(j<?> jVar) {
        this.a = jVar;
    }

    public static h b(j<?> jVar) {
        e.h.j.h.d(jVar, "callbacks == null");
        return new h(jVar);
    }

    public void a(Fragment fragment) {
        j<?> jVar = this.a;
        jVar.f824j.g(jVar, jVar, fragment);
    }

    public void c() {
        this.a.f824j.r();
    }

    public void d(Configuration configuration) {
        this.a.f824j.s(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.f824j.t(menuItem);
    }

    public void f() {
        this.a.f824j.u();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.f824j.v(menu, menuInflater);
    }

    public void h() {
        this.a.f824j.w();
    }

    public void i() {
        this.a.f824j.y();
    }

    public void j(boolean z) {
        this.a.f824j.z(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.f824j.A(menuItem);
    }

    public void l(Menu menu) {
        this.a.f824j.B(menu);
    }

    public void m() {
        this.a.f824j.D();
    }

    public void n(boolean z) {
        this.a.f824j.E(z);
    }

    public boolean o(Menu menu) {
        return this.a.f824j.F(menu);
    }

    public void p() {
        this.a.f824j.H();
    }

    public void q() {
        this.a.f824j.I();
    }

    public void r() {
        this.a.f824j.K();
    }

    public boolean s() {
        return this.a.f824j.Q(true);
    }

    public Fragment t(String str) {
        return this.a.f824j.Y(str);
    }

    public m u() {
        return this.a.f824j;
    }

    public void v() {
        this.a.f824j.C0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.f824j.g0().onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        j<?> jVar = this.a;
        if (jVar instanceof s0) {
            jVar.f824j.R0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable y() {
        return this.a.f824j.T0();
    }
}
