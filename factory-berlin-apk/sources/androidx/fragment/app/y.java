package androidx.fragment.app;

import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.w;

/* compiled from: FragmentViewLifecycleOwner */
class y implements v {

    /* renamed from: g  reason: collision with root package name */
    private w f922g = null;

    y() {
    }

    public p a() {
        e();
        return this.f922g;
    }

    /* access modifiers changed from: package-private */
    public void b(p.a aVar) {
        this.f922g.i(aVar);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f922g == null) {
            this.f922g = new w(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f922g != null;
    }

    /* access modifiers changed from: package-private */
    public void g(p.b bVar) {
        this.f922g.p(bVar);
    }
}
