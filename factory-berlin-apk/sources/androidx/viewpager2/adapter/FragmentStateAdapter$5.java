package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.v;

class FragmentStateAdapter$5 implements t {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Handler f1544g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Runnable f1545h;

    public void d(v vVar, p.a aVar) {
        if (aVar == p.a.ON_DESTROY) {
            this.f1544g.removeCallbacks(this.f1545h);
            vVar.a().c(this);
        }
    }
}
