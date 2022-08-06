package com.sensorberg.smartworkspace.app.screens.info;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.utils.i;
import com.sensorberg.smartworkspace.app.utils.p;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.x;
import m.a.c.c;

/* compiled from: InfoViewModel.kt */
public final class h extends n0 implements c {

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<List<a>> f7516i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Resources f7517j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final i f7518k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final c f7519l;

    /* compiled from: InfoViewModel.kt */
    static final class a<T> implements f0<List<? extends a>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c0 f7520g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f7521h;

        a(c0 c0Var, h hVar) {
            this.f7520g = c0Var;
            this.f7521h = hVar;
        }

        /* renamed from: a */
        public final void k(List<a> list) {
            c0 c0Var = this.f7520g;
            if (list == null || list.isEmpty()) {
                String string = this.f7521h.f7517j.getString(R.string.label_info_empty_title, new Object[]{this.f7521h.f7517j.getString(R.string.app_name)});
                k.d(string, "resources.getString(R.st…tring(R.string.app_name))");
                String string2 = this.f7521h.f7517j.getString(R.string.label_info_empty_body);
                k.d(string2, "resources.getString(R.st…ng.label_info_empty_body)");
                list = m.b(new a("instance", "action", string, string2, "", "", this.f7521h.f7518k.b(), false));
            }
            c0Var.u(list);
        }
    }

    /* compiled from: InfoViewModel.kt */
    static final class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f7522g;

        b(h hVar) {
            this.f7522g = hVar;
        }

        public final void run() {
            this.f7522g.f7519l.d();
        }
    }

    public h(Resources resources, i iVar, c cVar) {
        k.e(resources, "resources");
        k.e(iVar, "loginTracker");
        k.e(cVar, "infoDao");
        this.f7517j = resources;
        this.f7518k = iVar;
        this.f7519l = cVar;
        c0 c0Var = new c0();
        c0Var.v(this.f7519l.getAll(), new a(c0Var, this));
        x xVar = x.a;
        this.f7516i = c0Var;
    }

    public m.a.c.a n() {
        return c.a.a(this);
    }

    public final LiveData<List<a>> u() {
        return this.f7516i;
    }

    public final void v() {
        p.f8017d.b().post(new b(this));
    }
}
