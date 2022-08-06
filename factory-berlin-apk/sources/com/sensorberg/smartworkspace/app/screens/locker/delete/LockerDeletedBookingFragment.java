package com.sensorberg.smartworkspace.app.screens.locker.delete;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.y;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/delete/LockerDeletedBookingFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/sensorberg/smartworkspace/app/screens/locker/delete/LockerDeletedBookingFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getArgs", "()Lcom/sensorberg/smartworkspace/app/screens/locker/delete/LockerDeletedBookingFragmentArgs;", "args", "Landroid/os/Handler;", "lifecycleHandler$delegate", "Lkotlin/Lazy;", "getLifecycleHandler", "()Landroid/os/Handler;", "lifecycleHandler", "<init>", "()V", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockerDeletedBookingFragment.kt */
public final class LockerDeletedBookingFragment extends com.sensorberg.smartworkspace.app.a {
    private static final long h0 = TimeUnit.SECONDS.toMillis(10);
    private final androidx.navigation.f e0 = new androidx.navigation.f(v.b(c.class), new b(this));
    private final kotlin.e f0 = g.a(new a(this, (m.a.c.j.a) null, new d(this)));
    private HashMap g0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7575h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7576i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7577j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7575h = componentCallbacks;
            this.f7576i = aVar;
            this.f7577j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
        public final Handler d() {
            ComponentCallbacks componentCallbacks = this.f7575h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(Handler.class), this.f7576i, this.f7577j);
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class b extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7578h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f7578h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7578h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7578h + " has null arguments");
        }
    }

    /* compiled from: LockerDeletedBookingFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerDeletedBookingFragment.kt */
    static final class d extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerDeletedBookingFragment f7579h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LockerDeletedBookingFragment lockerDeletedBookingFragment) {
            super(0);
            this.f7579h = lockerDeletedBookingFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7579h.a0());
        }
    }

    /* compiled from: LockerDeletedBookingFragment.kt */
    static final class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerDeletedBookingFragment f7580g;

        e(LockerDeletedBookingFragment lockerDeletedBookingFragment) {
            this.f7580g = lockerDeletedBookingFragment;
        }

        public final void run() {
            androidx.navigation.fragment.a.a(this.f7580g).s(com.sensorberg.smartworkspace.app.d.a.d());
        }
    }

    /* compiled from: LockerDeletedBookingFragment.kt */
    static final class f implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerDeletedBookingFragment f7581g;

        f(LockerDeletedBookingFragment lockerDeletedBookingFragment) {
            this.f7581g = lockerDeletedBookingFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7581g).s(d.a.a((LockerGroupSelection) null, this.f7581g.U1().a()));
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final c U1() {
        return (c) this.e0.getValue();
    }

    private final Handler V1() {
        return (Handler) this.f0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        y yVar = (y) R1(R.layout.frag_locker_booking_deleted, viewGroup);
        ConstraintLayout constraintLayout = yVar.x;
        k.d(constraintLayout, "bind.root");
        com.sensorberg.smartworkspace.app.screens.locker.a.a(this, constraintLayout);
        ImageView imageView = yVar.w;
        k.d(imageView, "bind.lockerBadge");
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        V1().postDelayed(new e(this), h0);
        yVar.v.setOnClickListener(new f(this));
        return yVar.x;
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
