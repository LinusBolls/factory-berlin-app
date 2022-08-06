package com.sensorberg.qrcode;

import android.content.ComponentCallbacks;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import g.e.d.g;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010\u000fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/sensorberg/qrcode/QrCodeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroy", "()V", "onDestroyView", "", "brightness", "setBrightness", "(F)V", "Lcom/sensorberg/qrcode/databinding/FragmentQrcodeBinding;", "binding", "Lcom/sensorberg/qrcode/databinding/FragmentQrcodeBinding;", "Lcom/sensorberg/core/Navigator;", "navigator$delegate", "Lkotlin/Lazy;", "getNavigator", "()Lcom/sensorberg/core/Navigator;", "navigator", "Lcom/sensorberg/qrcode/QrCodeViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/qrcode/QrCodeViewModel;", "viewModel", "<init>", "feature-qrcode_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: QrCodeFragment.kt */
public final class QrCodeFragment extends Fragment {
    private final kotlin.e d0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e e0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap f0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f5534h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5535i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5536j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f5534h = componentCallbacks;
            this.f5535i = aVar;
            this.f5536j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, g.e.d.g] */
        public final g d() {
            ComponentCallbacks componentCallbacks = this.f5534h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(g.class), this.f5535i, this.f5536j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f5537h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5538i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5539j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f5537h = vVar;
            this.f5538i = aVar;
            this.f5539j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.qrcode.a] */
        /* renamed from: a */
        public final a d() {
            return m.a.b.a.d.a.b.b(this.f5537h, v.b(a.class), this.f5538i, this.f5539j);
        }
    }

    /* compiled from: QrCodeFragment.kt */
    static final class c<T> implements f0<Bitmap> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.qrcode.d.a f5540g;

        c(com.sensorberg.qrcode.d.a aVar) {
            this.f5540g = aVar;
        }

        /* renamed from: a */
        public final void k(Bitmap bitmap) {
            this.f5540g.b.setImageBitmap(bitmap);
            ImageView imageView = this.f5540g.b;
            k.d(imageView, "binding.qrcodeImageView");
            Drawable background = imageView.getBackground();
            if (!(background instanceof Animatable)) {
                background = null;
            }
            Animatable animatable = (Animatable) background;
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* compiled from: QrCodeFragment.kt */
    static final class d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ QrCodeFragment f5541g;

        d(QrCodeFragment qrCodeFragment) {
            this.f5541g = qrCodeFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f5541g).t();
        }
    }

    /* compiled from: QrCodeFragment.kt */
    static final class e implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ QrCodeFragment f5542g;

        e(QrCodeFragment qrCodeFragment) {
            this.f5542g = qrCodeFragment;
        }

        public final void onClick(View view) {
            this.f5542g.S1().b(androidx.navigation.fragment.a.a(this.f5542g));
        }
    }

    /* access modifiers changed from: private */
    public final g S1() {
        return (g) this.e0.getValue();
    }

    private final a T1() {
        return (a) this.d0.getValue();
    }

    private final void U1(float f2) {
        androidx.fragment.app.d v1 = v1();
        k.d(v1, "requireActivity()");
        Window window = v1.getWindow();
        k.d(window, "requireActivity().window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        k.d(attributes, "window.attributes");
        attributes.screenBrightness = f2;
        window.setAttributes(attributes);
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        com.sensorberg.qrcode.d.a c2 = com.sensorberg.qrcode.d.a.c(layoutInflater, viewGroup, false);
        k.d(c2, "FragmentQrcodeBinding.in…flater, container, false)");
        T1().r().o(a0(), new c(c2));
        c2.f5545d.setNavigationOnClickListener(new d(this));
        c2.c.setOnClickListener(new e(this));
        return c2.b();
    }

    public void B0() {
        super.B0();
        U1(-1.0f);
    }

    public void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        U1(1.0f);
    }
}
