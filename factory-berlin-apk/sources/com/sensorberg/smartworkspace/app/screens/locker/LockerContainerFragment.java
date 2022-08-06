package com.sensorberg.smartworkspace.app.screens.locker;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.a0;
import com.sensorberg.smartworkspace.app.screens.locker.c;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import com.sensorberg.smartworkspace.app.screens.locker.selection.d;
import java.util.HashMap;
import java.util.Map;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.n;

@i(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u00020\u00108\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/LockerContainerFragment;", "Lcom/sensorberg/smartworkspace/app/screens/locker/d;", "Lcom/sensorberg/smartworkspace/app/ui/a;", "", "executeRetry", "()V", "Landroidx/lifecycle/LiveData;", "Lcom/sensorberg/smartworkspace/app/screens/locker/LockerContainerViewModel$State;", "getSource", "()Landroidx/lifecycle/LiveData;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "layoutId", "I", "getLayoutId", "()I", "Lcom/sensorberg/smartworkspace/app/screens/locker/LockerContainerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/locker/LockerContainerViewModel;", "viewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockerContainerFragment.kt */
public final class LockerContainerFragment extends com.sensorberg.smartworkspace.app.ui.a<c.b> implements d {
    private static final Map<c.b, Class<? extends com.sensorberg.smartworkspace.app.a>> i0 = e0.f(n.a(c.b.SHOW_NONE_NEARBY, com.sensorberg.smartworkspace.app.screens.locker.g.a.class), n.a(c.b.SHOW_SELECTION, d.class), n.a(c.b.SHOW_CURRENT_BOOKED, com.sensorberg.smartworkspace.app.screens.locker.e.a.class), n.a(c.b.SHOW_ERROR, LockerErrorFragment.class), n.a(c.b.SHOW_LOADING, com.sensorberg.smartworkspace.app.screens.locker.f.a.class));
    private final e f0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final int g0 = R.layout.frag_locker_container;
    private HashMap h0;

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f7529h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7530i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7531j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7529h = vVar;
            this.f7530i = aVar;
            this.f7531j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.locker.c] */
        /* renamed from: a */
        public final c d() {
            return m.a.b.a.d.a.b.b(this.f7529h, kotlin.jvm.internal.v.b(c.class), this.f7530i, this.f7531j);
        }
    }

    /* compiled from: LockerContainerFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public LockerContainerFragment() {
        super(i0);
    }

    private final c Y1() {
        return (c) this.f0.getValue();
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.h0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void V0(View view, Bundle bundle) {
        k.e(view, "view");
        super.V0(view, bundle);
        a0 a0Var = (a0) f.a(view);
        if (a0Var != null) {
            k.d(a0Var, "bind");
            a0Var.M(Y1());
            a0Var.H(a0());
        }
    }

    public int W1() {
        return this.g0;
    }

    public LiveData<c.b> X1() {
        return Y1().x();
    }

    public void k() {
        Y1().y();
    }
}
