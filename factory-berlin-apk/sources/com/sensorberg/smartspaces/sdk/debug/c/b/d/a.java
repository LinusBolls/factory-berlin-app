package com.sensorberg.smartspaces.sdk.debug.c.b.d;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import g.e.n.g.g;
import g.e.n.g.n;
import g.e.n.g.o;
import g.e.n.g.q;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: IotDeviceRequestInputFragment.kt */
public final class a extends androidx.fragment.app.c implements com.sensorberg.smartspaces.sdk.internal.s.d {
    public static final b x0 = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final i0 r0 = j0.b();
    /* access modifiers changed from: private */
    public final c0<Boolean> s0;
    private final kotlin.e t0;
    private final kotlin.e u0;
    private final kotlin.e v0;
    private HashMap w0;

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.d.a$a  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0368a extends l implements kotlin.e0.c.a<g.e.n.g.g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6248h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6249i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6250j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0368a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6248h = aVar;
            this.f6249i = aVar2;
            this.f6250j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.g.g, java.lang.Object] */
        public final g.e.n.g.g d() {
            return this.f6248h.e(v.b(g.e.n.g.g.class), this.f6249i, this.f6250j);
        }
    }

    /* compiled from: IotDeviceRequestInputFragment.kt */
    public static final class b {
        private b() {
        }

        public final void a(Fragment fragment, IotDevice iotDevice, Property property) {
            k.e(fragment, "parent");
            k.e(iotDevice, "iotDevice");
            k.e(property, "property");
            Bundle bundle = new Bundle();
            bundle.putParcelable("device", iotDevice);
            bundle.putParcelable("property", property);
            a aVar = new a();
            aVar.D1(bundle);
            aVar.e2(fragment.B(), "IotDeviceRequestInputFragment");
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: IotDeviceRequestInputFragment.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6251g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Button f6252h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Property.Binary f6253i;

        @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.debug.screens.iotdevices.request.IotDeviceRequestInputFragment$configureBinary$clickListener$1$1", f = "IotDeviceRequestInputFragment.kt", l = {89, 98}, m = "invokeSuspend")
        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.d.a$c$a  reason: collision with other inner class name */
        /* compiled from: IotDeviceRequestInputFragment.kt */
        static final class C0369a extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f6254k;

            /* renamed from: l  reason: collision with root package name */
            Object f6255l;

            /* renamed from: m  reason: collision with root package name */
            Object f6256m;

            /* renamed from: n  reason: collision with root package name */
            boolean f6257n;
            int o;
            final /* synthetic */ c p;
            final /* synthetic */ View q;

            /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.d.a$c$a$a  reason: collision with other inner class name */
            /* compiled from: IotDeviceRequestInputFragment.kt */
            static final class C0370a extends l implements kotlin.e0.c.l<x, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C0369a f6258h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0370a(C0369a aVar) {
                    super(1);
                    this.f6258h = aVar;
                }

                public final void a(x xVar) {
                    k.e(xVar, "it");
                    Toast.makeText(this.f6258h.p.f6251g.C(), "Success", 1).show();
                    this.f6258h.p.f6251g.s0.u(Boolean.TRUE);
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((x) obj);
                    return x.a;
                }
            }

            /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.d.a$c$a$b */
            /* compiled from: IotDeviceRequestInputFragment.kt */
            static final class b extends l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C0369a f6259h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C0369a aVar) {
                    super(1);
                    this.f6259h = aVar;
                }

                public final void a(List<? extends Throwable> list) {
                    k.e(list, "throwables");
                    Context C = this.f6259h.p.f6251g.C();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Fail: ");
                    Throwable th = (Throwable) v.A(list);
                    sb.append(th != null ? th.getMessage() : null);
                    Toast.makeText(C, sb.toString(), 1).show();
                    this.f6259h.p.f6251g.s0.u(null);
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((List) obj);
                    return x.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0369a(c cVar, View view, kotlin.c0.d dVar) {
                super(2, dVar);
                this.p = cVar;
                this.q = view;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                k.e(dVar, "completion");
                C0369a aVar = new C0369a(this.p, this.q, dVar);
                aVar.f6254k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                i0 i0Var;
                Object c = d.c();
                int i2 = this.o;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0Var = this.f6254k;
                    kotlinx.coroutines.e3.c<g.b> a = this.p.f6251g.n2().a();
                    this.f6255l = i0Var;
                    this.o = 1;
                    obj = kotlinx.coroutines.e3.e.h(a, this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0Var = (i0) this.f6255l;
                    kotlin.l.b(obj);
                } else if (i2 == 2) {
                    StateChangeRequest stateChangeRequest = (StateChangeRequest) this.f6256m;
                    i0 i0Var2 = (i0) this.f6255l;
                    kotlin.l.b(obj);
                    g.e.m.c cVar = (g.e.m.c) obj;
                    cVar.e(new C0370a(this));
                    cVar.d(new b(this));
                    return x.a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (k.a((g.b) obj, g.b.a.a)) {
                    boolean a2 = k.a(this.q, this.p.f6252h);
                    StateChangeRequest.Builder newRequest = this.p.f6251g.m2().newRequest();
                    newRequest.addState(this.p.f6253i, a2);
                    StateChangeRequest build = newRequest.build();
                    this.p.f6251g.s0.u(kotlin.c0.j.a.b.a(false));
                    g.e.n.g.g i22 = this.p.f6251g.n2();
                    this.f6255l = i0Var;
                    this.f6257n = a2;
                    this.f6256m = build;
                    this.o = 2;
                    obj = i22.v(build, this);
                    if (obj == c) {
                        return c;
                    }
                    g.e.m.c cVar2 = (g.e.m.c) obj;
                    cVar2.e(new C0370a(this));
                    cVar2.d(new b(this));
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((C0369a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        c(a aVar, Button button, Property.Binary binary) {
            this.f6251g = aVar;
            this.f6252h = button;
            this.f6253i = binary;
        }

        public final void onClick(View view) {
            x1 unused = e.b(this.f6251g.r0, (kotlin.c0.g) null, (l0) null, new C0369a(this, view, (kotlin.c0.d) null), 3, (Object) null);
        }
    }

    /* compiled from: IotDeviceRequestInputFragment.kt */
    static final class d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6260g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Property.Numeric f6261h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r f6262i;

        @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.debug.screens.iotdevices.request.IotDeviceRequestInputFragment$configureNumeric$1$1", f = "IotDeviceRequestInputFragment.kt", l = {130, 137}, m = "invokeSuspend")
        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.d.a$d$a  reason: collision with other inner class name */
        /* compiled from: IotDeviceRequestInputFragment.kt */
        static final class C0371a extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f6263k;

            /* renamed from: l  reason: collision with root package name */
            Object f6264l;

            /* renamed from: m  reason: collision with root package name */
            Object f6265m;

            /* renamed from: n  reason: collision with root package name */
            int f6266n;
            final /* synthetic */ d o;

            /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.d.a$d$a$a  reason: collision with other inner class name */
            /* compiled from: IotDeviceRequestInputFragment.kt */
            static final class C0372a extends l implements kotlin.e0.c.l<x, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C0371a f6267h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0372a(C0371a aVar) {
                    super(1);
                    this.f6267h = aVar;
                }

                public final void a(x xVar) {
                    k.e(xVar, "it");
                    Toast.makeText(this.f6267h.o.f6260g.C(), "Success", 1).show();
                    this.f6267h.o.f6260g.s0.u(Boolean.TRUE);
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((x) obj);
                    return x.a;
                }
            }

            /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.d.a$d$a$b */
            /* compiled from: IotDeviceRequestInputFragment.kt */
            static final class b extends l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C0371a f6268h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C0371a aVar) {
                    super(1);
                    this.f6268h = aVar;
                }

                public final void a(List<? extends Throwable> list) {
                    k.e(list, "throwables");
                    Context C = this.f6268h.o.f6260g.C();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Fail: ");
                    Throwable th = (Throwable) v.A(list);
                    sb.append(th != null ? th.getMessage() : null);
                    Toast.makeText(C, sb.toString(), 1).show();
                    this.f6268h.o.f6260g.s0.u(null);
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((List) obj);
                    return x.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0371a(d dVar, kotlin.c0.d dVar2) {
                super(2, dVar2);
                this.o = dVar;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                k.e(dVar, "completion");
                C0371a aVar = new C0371a(this.o, dVar);
                aVar.f6263k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                i0 i0Var;
                Object c = d.c();
                int i2 = this.f6266n;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0Var = this.f6263k;
                    kotlinx.coroutines.e3.c<g.b> a = this.o.f6260g.n2().a();
                    this.f6264l = i0Var;
                    this.f6266n = 1;
                    obj = kotlinx.coroutines.e3.e.h(a, this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0Var = (i0) this.f6264l;
                    kotlin.l.b(obj);
                } else if (i2 == 2) {
                    StateChangeRequest stateChangeRequest = (StateChangeRequest) this.f6265m;
                    i0 i0Var2 = (i0) this.f6264l;
                    kotlin.l.b(obj);
                    g.e.m.c cVar = (g.e.m.c) obj;
                    cVar.e(new C0372a(this));
                    cVar.d(new b(this));
                    return x.a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (k.a((g.b) obj, g.b.a.a)) {
                    StateChangeRequest.Builder newRequest = this.o.f6260g.m2().newRequest();
                    d dVar = this.o;
                    newRequest.addState(dVar.f6261h, dVar.f6262i.f10683g);
                    StateChangeRequest build = newRequest.build();
                    this.o.f6260g.s0.u(kotlin.c0.j.a.b.a(false));
                    g.e.n.g.g i22 = this.o.f6260g.n2();
                    this.f6264l = i0Var;
                    this.f6265m = build;
                    this.f6266n = 2;
                    obj = i22.v(build, this);
                    if (obj == c) {
                        return c;
                    }
                    g.e.m.c cVar2 = (g.e.m.c) obj;
                    cVar2.e(new C0372a(this));
                    cVar2.d(new b(this));
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((C0371a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        d(a aVar, Property.Numeric numeric, r rVar) {
            this.f6260g = aVar;
            this.f6261h = numeric;
            this.f6262i = rVar;
        }

        public final void onClick(View view) {
            x1 unused = e.b(this.f6260g.r0, (kotlin.c0.g) null, (l0) null, new C0371a(this, (kotlin.c0.d) null), 3, (Object) null);
        }
    }

    /* compiled from: IotDeviceRequestInputFragment.kt */
    public static final class e implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ r a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Button f6269d;

        e(r rVar, float f2, float f3, Button button) {
            this.a = rVar;
            this.b = f2;
            this.c = f3;
            this.f6269d = button;
        }

        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            k.e(seekBar, "seekBar");
            r rVar = this.a;
            float f2 = (this.b * ((float) i2)) + this.c;
            rVar.f10683g = f2;
            this.f6269d.setText(String.valueOf(f2));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* compiled from: IotDeviceRequestInputFragment.kt */
    static final class f extends l implements kotlin.e0.c.a<IotDevice> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6270h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.f6270h = aVar;
        }

        /* renamed from: a */
        public final IotDevice d() {
            Bundle A = this.f6270h.A();
            IotDevice iotDevice = A != null ? (IotDevice) A.getParcelable("device") : null;
            k.c(iotDevice);
            return iotDevice;
        }
    }

    /* compiled from: IotDeviceRequestInputFragment.kt */
    static final class g<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6271g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f6272h;

        g(a aVar, View view) {
            this.f6271g = aVar;
            this.f6272h = view;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            if (k.a(bool, Boolean.TRUE)) {
                this.f6271g.S1();
            } else if (k.a(bool, Boolean.FALSE)) {
                View view = this.f6272h;
                k.d(view, "root");
                view.setEnabled(false);
            } else if (bool == null) {
                View view2 = this.f6272h;
                k.d(view2, "root");
                view2.setEnabled(true);
            }
        }
    }

    /* compiled from: IotDeviceRequestInputFragment.kt */
    static final class h extends l implements kotlin.e0.c.a<Property> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6273h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.f6273h = aVar;
        }

        /* renamed from: a */
        public final Property d() {
            Bundle A = this.f6273h.A();
            Property property = A != null ? (Property) A.getParcelable("property") : null;
            k.c(property);
            return property;
        }
    }

    public a() {
        b2(1, q.SmartSpacesThemeDialog);
        this.s0 = new c0<>();
        this.t0 = g.a(new C0368a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
        this.u0 = g.a(new f(this));
        this.v0 = g.a(new h(this));
    }

    private final void k2(SeekBar seekBar, Button button, Button button2, Button button3, Property.Binary binary) {
        seekBar.setVisibility(8);
        button.setVisibility(8);
        c cVar = new c(this, button2, binary);
        button3.setOnClickListener(cVar);
        button2.setOnClickListener(cVar);
    }

    private final void l2(View view, SeekBar seekBar, Button button, Property.Numeric numeric) {
        float maxValue = (numeric.getMaxValue() - numeric.getMinValue()) / 100.0f;
        float maxValue2 = numeric.getMaxValue() - (100.0f * maxValue);
        r rVar = new r();
        float value = numeric.getValue();
        rVar.f10683g = value;
        seekBar.setProgress((int) ((value - maxValue2) / maxValue));
        button.setText(String.valueOf(rVar.f10683g));
        view.setVisibility(8);
        button.setOnClickListener(new d(this, numeric, rVar));
        seekBar.setOnSeekBarChangeListener(new e(rVar, maxValue, maxValue2, button));
    }

    /* access modifiers changed from: private */
    public final IotDevice m2() {
        return (IotDevice) this.u0.getValue();
    }

    /* access modifiers changed from: private */
    public final g.e.n.g.g n2() {
        return (g.e.n.g.g) this.t0.getValue();
    }

    private final Property o2() {
        return (Property) this.v0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(o.smartspaces_debug_iotdevices_request_screen, viewGroup, false);
        View findViewById = inflate.findViewById(n.smartspacesTitle);
        k.d(findViewById, "root.findViewById(R.id.smartspacesTitle)");
        View findViewById2 = inflate.findViewById(n.smartspacesSubtitle);
        k.d(findViewById2, "root.findViewById(R.id.smartspacesSubtitle)");
        View findViewById3 = inflate.findViewById(n.smartspacesButtonRow);
        k.d(findViewById3, "root.findViewById(R.id.smartspacesButtonRow)");
        View findViewById4 = inflate.findViewById(n.smartspacesButtonFalse);
        k.d(findViewById4, "root.findViewById(R.id.smartspacesButtonFalse)");
        Button button = (Button) findViewById4;
        View findViewById5 = inflate.findViewById(n.smartspacesButtonTrue);
        k.d(findViewById5, "root.findViewById(R.id.smartspacesButtonTrue)");
        Button button2 = (Button) findViewById5;
        View findViewById6 = inflate.findViewById(n.smartspacesSeekBar);
        k.d(findViewById6, "root.findViewById(R.id.smartspacesSeekBar)");
        SeekBar seekBar = (SeekBar) findViewById6;
        View findViewById7 = inflate.findViewById(n.smartspacesButtonOk);
        k.d(findViewById7, "root.findViewById(R.id.smartspacesButtonOk)");
        Button button3 = (Button) findViewById7;
        this.s0.o(a0(), new g(this, inflate));
        ((TextView) findViewById).setText(m2().getName());
        ((TextView) findViewById2).setText("Type: " + o2().getKind());
        Property o2 = o2();
        if (o2 instanceof Property.Binary) {
            Property o22 = o2();
            if (o22 != null) {
                k2(seekBar, button3, button2, button, (Property.Binary) o22);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.sdk.model.Property.Binary");
            }
        } else if (o2 instanceof Property.Numeric) {
            Property o23 = o2();
            if (o23 != null) {
                l2(findViewById3, seekBar, button3, (Property.Numeric) o23);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.sdk.model.Property.Numeric");
            }
        }
        return inflate;
    }

    public void B0() {
        super.B0();
        j0.d(this.r0, (CancellationException) null, 1, (Object) null);
    }

    public /* synthetic */ void D0() {
        super.D0();
        f2();
    }

    public void f2() {
        HashMap hashMap = this.w0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }
}
