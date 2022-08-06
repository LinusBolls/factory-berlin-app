package com.sensorberg.smartworkspace.app.activities.pin;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.activities.pin.c;
import com.sensorberg.smartworkspace.app.k.h;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;
import com.sensorberg.smartworkspace.app.widgets.PinView;
import java.io.Serializable;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\f8F@\u0006X\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/sensorberg/smartworkspace/app/activities/pin/PinActivity;", "Landroidx/appcompat/app/c;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "shakePin", "()V", "Lcom/sensorberg/smartworkspace/app/databinding/ActivityPinBinding;", "binding", "Lcom/sensorberg/smartworkspace/app/databinding/ActivityPinBinding;", "Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig$delegate", "Lkotlin/Lazy;", "getBuildConfig", "()Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig", "Lcom/sensorberg/smartworkspace/app/activities/pin/PinViewModel;", "pinViewModel$delegate", "getPinViewModel", "()Lcom/sensorberg/smartworkspace/app/activities/pin/PinViewModel;", "pinViewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: PinActivity.kt */
public final class PinActivity extends androidx.appcompat.app.c {
    public static final c C = new c((DefaultConstructorMarker) null);
    private final kotlin.e A = g.a(new b(this, (m.a.c.j.a) null, new g(this)));
    private h B;
    private final kotlin.e z = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7031h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7032i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7033j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7031h = componentCallbacks;
            this.f7032i = aVar;
            this.f7033j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.c] */
        public final com.sensorberg.smartworkspace.app.utils.c d() {
            ComponentCallbacks componentCallbacks = this.f7031h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(com.sensorberg.smartworkspace.app.utils.c.class), this.f7032i, this.f7033j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7034h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7035i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7036j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7034h = vVar;
            this.f7035i = aVar;
            this.f7036j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartworkspace.app.activities.pin.c, androidx.lifecycle.n0] */
        /* renamed from: a */
        public final c d() {
            return m.a.b.a.d.a.b.b(this.f7034h, v.b(c.class), this.f7035i, this.f7036j);
        }
    }

    /* compiled from: PinActivity.kt */
    public static final class c {
        private c() {
        }

        private final void d(Activity activity, c.a aVar, int i2) {
            activity.startActivityForResult(a(activity, aVar), i2);
        }

        public final Intent a(Context context, c.a aVar) {
            k.e(context, "context");
            k.e(aVar, "mode");
            Intent intent = new Intent(context, PinActivity.class);
            intent.putExtra("mode", aVar);
            return intent;
        }

        public final b b(int i2) {
            if (i2 == 0) {
                return b.FAILED;
            }
            if (i2 != -1) {
                n.a.a.c("unknown result code: " + i2, new Object[0]);
            }
            return b.SUCCESSFUL;
        }

        public final void c(Activity activity) {
            k.e(activity, "activity");
            d(activity, c.a.CHANGE, 5);
        }

        public final void e(Activity activity) {
            k.e(activity, "activity");
            d(activity, c.a.REGISTER, 4);
        }

        public final void f(Activity activity) {
            k.e(activity, "activity");
            d(activity, c.a.UNLOCK, 3);
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PinActivity.kt */
    static final class d implements PinView.a {
        final /* synthetic */ PinActivity a;

        d(PinActivity pinActivity) {
            this.a = pinActivity;
        }

        public final void a(PinView pinView, CharSequence charSequence) {
            k.e(pinView, "<anonymous parameter 0>");
            k.e(charSequence, "chars");
            this.a.O().z(charSequence);
        }
    }

    /* compiled from: PinActivity.kt */
    static final class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f7037g;

        e(h hVar) {
            this.f7037g = hVar;
        }

        public final void run() {
            PinView pinView = this.f7037g.f7161d;
            k.d(pinView, "bind.pinInputView");
            g.e.c.e.c(pinView);
        }
    }

    /* compiled from: PinActivity.kt */
    static final class f extends l implements kotlin.e0.c.l<c.b, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ PinActivity f7038h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f7039i;

        /* compiled from: PinActivity.kt */
        static final class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ f f7040g;

            a(f fVar) {
                this.f7040g = fVar;
            }

            public final void run() {
                this.f7040g.f7039i.c.setImageResource(R.drawable.fingerprint);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PinActivity pinActivity, h hVar) {
            super(1);
            this.f7038h = pinActivity;
            this.f7039i = hVar;
        }

        public final void a(c.b bVar) {
            BlockingProgressBar blockingProgressBar = this.f7039i.b;
            k.d(blockingProgressBar, "bind.block");
            blockingProgressBar.setVisibility(8);
            n.a.a.f("PinActivity state: " + bVar, new Object[0]);
            if (bVar != null) {
                switch (a.a[bVar.ordinal()]) {
                    case 1:
                        this.f7039i.c.setImageResource(R.drawable.fingerprint_error);
                        this.f7039i.c.postDelayed(new a(this), 1333);
                        return;
                    case 2:
                        PinView pinView = this.f7039i.f7161d;
                        k.d(pinView, "bind.pinInputView");
                        pinView.setPin((CharSequence) null);
                        this.f7039i.f7162e.setText(R.string.label_pin_unlock);
                        return;
                    case 3:
                        PinView pinView2 = this.f7039i.f7161d;
                        k.d(pinView2, "bind.pinInputView");
                        pinView2.setPin((CharSequence) null);
                        this.f7039i.f7162e.setText(R.string.label_pin_create_1st);
                        return;
                    case 4:
                        PinView pinView3 = this.f7039i.f7161d;
                        k.d(pinView3, "bind.pinInputView");
                        pinView3.setPin((CharSequence) null);
                        this.f7039i.f7162e.setText(R.string.label_pin_create_2nd);
                        return;
                    case 5:
                        PinView pinView4 = this.f7039i.f7161d;
                        k.d(pinView4, "bind.pinInputView");
                        pinView4.setPin((CharSequence) null);
                        this.f7039i.f7162e.setText(R.string.label_pin_change_1st);
                        return;
                    case 6:
                        PinView pinView5 = this.f7039i.f7161d;
                        k.d(pinView5, "bind.pinInputView");
                        pinView5.setPin((CharSequence) null);
                        this.f7039i.f7162e.setText(R.string.label_pin_change_2nd);
                        return;
                    case 7:
                        BlockingProgressBar blockingProgressBar2 = this.f7039i.b;
                        k.d(blockingProgressBar2, "bind.block");
                        blockingProgressBar2.setVisibility(0);
                        return;
                    case 8:
                        this.f7038h.P();
                        this.f7039i.f7161d.d();
                        this.f7039i.f7162e.setText(R.string.label_pin_no_match);
                        return;
                    case 9:
                        this.f7038h.P();
                        this.f7039i.f7161d.d();
                        this.f7039i.f7162e.setText(R.string.label_pin_wrong);
                        return;
                    case 10:
                        this.f7038h.setResult(-1);
                        this.f7038h.finishAfterTransition();
                        return;
                    case 11:
                        this.f7038h.finish();
                        return;
                    default:
                        return;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((c.b) obj);
            return x.a;
        }
    }

    /* compiled from: PinActivity.kt */
    static final class g extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ PinActivity f7041h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PinActivity pinActivity) {
            super(0);
            this.f7041h = pinActivity;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            Object[] objArr = new Object[1];
            Serializable serializableExtra = this.f7041h.getIntent().getSerializableExtra("mode");
            if (serializableExtra != null) {
                objArr[0] = (c.a) serializableExtra;
                return m.a.c.i.b.b(objArr);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.activities.pin.PinViewModel.Modes");
        }
    }

    /* access modifiers changed from: private */
    public final c O() {
        return (c) this.A.getValue();
    }

    /* access modifiers changed from: private */
    public final void P() {
        h hVar = this.B;
        if (hVar != null) {
            ObjectAnimator.ofFloat(hVar.f7161d, "translationX", new float[]{0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f}).setDuration(444).start();
        } else {
            k.q("binding");
            throw null;
        }
    }

    public final com.sensorberg.smartworkspace.app.utils.c N() {
        return (com.sensorberg.smartworkspace.app.utils.c) this.z.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = 0;
        setResult(0);
        h c2 = h.c(getLayoutInflater());
        k.d(c2, "it");
        this.B = c2;
        k.d(c2, "ActivityPinBinding.infla…Activity.binding = it\n\t\t}");
        setContentView((View) c2.b());
        c2.f7161d.setPinListener(new d(this));
        ImageView imageView = c2.c;
        k.d(imageView, "bind.fingerprint");
        if (!O().F()) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        c2.f7161d.setPinLength(N().L());
        if (N().D() || !O().F()) {
            c2.f7161d.requestFocus();
            c2.f7161d.postDelayed(new e(c2), 333);
        }
        O().G().o(this, new g.e.c.h(new f(this, c2)));
    }
}
