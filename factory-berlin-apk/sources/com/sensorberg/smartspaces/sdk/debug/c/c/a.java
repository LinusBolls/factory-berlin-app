package com.sensorberg.smartspaces.sdk.debug.c.c;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.v;
import com.sensorberg.smartspaces.sdk.debug.c.c.b;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.n.g.n;
import g.e.n.g.o;
import java.util.HashMap;
import kotlin.jvm.internal.l;

/* compiled from: IotUnitFragment.kt */
public final class a extends Fragment {
    public static final C0373a f0 = new C0373a((DefaultConstructorMarker) null);
    private final p0.b d0 = com.sensorberg.smartspaces.sdk.debug.a.a(new b(this));
    private HashMap e0;

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.c.a$a  reason: collision with other inner class name */
    /* compiled from: IotUnitFragment.kt */
    public static final class C0373a {
        private C0373a() {
        }

        public final Fragment a(IotUnit iotUnit) {
            kotlin.jvm.internal.k.e(iotUnit, "iotUnit");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("key.values", iotUnit.getId());
            aVar.D1(bundle);
            return aVar;
        }

        public /* synthetic */ C0373a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class b extends l implements kotlin.e0.c.a<n0> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6274h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f6274h = aVar;
        }

        /* renamed from: a */
        public final n0 d() {
            Bundle A = this.f6274h.A();
            kotlin.jvm.internal.k.c(A);
            String string = A.getString("key.values");
            kotlin.jvm.internal.k.c(string);
            kotlin.jvm.internal.k.d(string, "arguments!!.getString(KEY_IOTUNIT)!!");
            return new b(string);
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class c<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ TextView f6275g;

        c(TextView textView) {
            this.f6275g = textView;
        }

        /* renamed from: a */
        public final void k(String str) {
            this.f6275g.setText(str);
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class d implements View.OnTouchListener {

        /* renamed from: g  reason: collision with root package name */
        public static final d f6276g = new d();

        d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            view.performClick();
            return true;
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class e implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6277g;

        e(a aVar) {
            this.f6277g = aVar;
        }

        public final void onClick(View view) {
            m H = this.f6277g.H();
            if (H != null) {
                H.E0();
            }
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class f implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f6278g;

        f(b bVar) {
            this.f6278g = bVar;
        }

        public final void onClick(View view) {
            this.f6278g.G();
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class g implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f6279g;

        g(b bVar) {
            this.f6279g = bVar;
        }

        public final void onClick(View view) {
            this.f6279g.v();
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class h<T> implements f0<b.m> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6280g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f6281h;

        h(a aVar, View view) {
            this.f6280g = aVar;
            this.f6281h = view;
        }

        /* renamed from: a */
        public final void k(b.m mVar) {
            if (mVar != null) {
                a aVar = this.f6280g;
                View view = this.f6281h;
                kotlin.jvm.internal.k.d(view, "root");
                aVar.X1(view, mVar);
            }
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class i<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6282g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f6283h;

        i(a aVar, View view) {
            this.f6282g = aVar;
            this.f6283h = view;
        }

        /* renamed from: a */
        public final void k(String str) {
            a aVar = this.f6282g;
            View view = this.f6283h;
            kotlin.jvm.internal.k.d(view, "root");
            aVar.W1(view, str);
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class j<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f6284g;

        j(View view) {
            this.f6284g = view;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            int i2 = kotlin.jvm.internal.k.a(bool, Boolean.TRUE) ? 0 : 8;
            View view = this.f6284g;
            kotlin.jvm.internal.k.d(view, "view");
            view.setVisibility(i2);
        }
    }

    /* compiled from: IotUnitFragment.kt */
    static final class k<T> implements f0<b.l> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Toolbar f6285g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ImageView f6286h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ TextView f6287i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ TextView f6288j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ TextView f6289k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ TextView f6290l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ TextView f6291m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ TextView f6292n;

        k(Toolbar toolbar, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
            this.f6285g = toolbar;
            this.f6286h = imageView;
            this.f6287i = textView;
            this.f6288j = textView2;
            this.f6289k = textView3;
            this.f6290l = textView4;
            this.f6291m = textView5;
            this.f6292n = textView6;
        }

        /* renamed from: a */
        public final void k(b.l lVar) {
            Toolbar toolbar = this.f6285g;
            if (toolbar != null) {
                toolbar.setTitle((CharSequence) lVar.g());
            }
            Toolbar toolbar2 = this.f6285g;
            if (toolbar2 != null) {
                toolbar2.setSubtitle((CharSequence) lVar.f());
            }
            ImageView imageView = this.f6286h;
            if (imageView != null) {
                imageView.setImageResource(lVar.e());
            }
            TextView textView = this.f6287i;
            kotlin.jvm.internal.k.d(textView, "types");
            textView.setText(lVar.h());
            TextView textView2 = this.f6288j;
            kotlin.jvm.internal.k.d(textView2, "backendUnit");
            textView2.setText(lVar.c());
            TextView textView3 = this.f6289k;
            kotlin.jvm.internal.k.d(textView3, "actuator");
            textView3.setText(lVar.a());
            TextView textView4 = this.f6290l;
            kotlin.jvm.internal.k.d(textView4, "actuatorId");
            textView4.setText(lVar.b());
            TextView textView5 = this.f6291m;
            kotlin.jvm.internal.k.d(textView5, "connection");
            textView5.setText(lVar.d());
            TextView textView6 = this.f6292n;
            kotlin.jvm.internal.k.d(textView6, "unitId");
            textView6.setText(lVar.i());
        }
    }

    private final void T1(TextView textView, v vVar, LiveData<String> liveData) {
        liveData.o(vVar, new c(textView));
    }

    private final void U1(View view, v vVar, int i2, LiveData<Boolean> liveData) {
        liveData.o(vVar, new j(view.findViewById(i2)));
    }

    private final void V1(View view, v vVar, LiveData<b.l> liveData) {
        liveData.o(vVar, new k((Toolbar) view.findViewById(n.smartspacesToolbar), (ImageView) view.findViewById(n.smartspacesHardwareIcon), (TextView) view.findViewById(n.smartspacesTypes), (TextView) view.findViewById(n.smartspacesBackendUnit), (TextView) view.findViewById(n.smartspacesActuator), (TextView) view.findViewById(n.smartspacesActuatorId), (TextView) view.findViewById(n.smartspacesConnection), (TextView) view.findViewById(n.smartspacesUnitId)));
    }

    /* access modifiers changed from: private */
    public final void W1(View view, String str) {
        TextView textView = (TextView) view.findViewById(n.smartspacesMessage);
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* access modifiers changed from: private */
    public final void X1(View view, b.m mVar) {
        TextView textView = (TextView) view.findViewById(n.smartspacesRssiValue);
        if (textView != null) {
            textView.setText(mVar.b());
        }
        View findViewById = view.findViewById(n.smartspacesRssiLevel);
        kotlin.jvm.internal.k.d(findViewById, "root.findViewById<ImageV….id.smartspacesRssiLevel)");
        Drawable drawable = ((ImageView) findViewById).getDrawable();
        kotlin.jvm.internal.k.d(drawable, "root.findViewById<ImageV…spacesRssiLevel).drawable");
        drawable.setLevel(mVar.a());
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.k.e(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(C()).inflate(o.smartspaces_debug_iotunit, viewGroup, false);
        inflate.setOnTouchListener(d.f6276g);
        n0 a = q0.b(this, this.d0).a(b.class);
        kotlin.jvm.internal.k.d(a, "ViewModelProviders.of(th…nitViewModel::class.java)");
        b bVar = (b) a;
        Toolbar toolbar = (Toolbar) inflate.findViewById(n.smartspacesToolbar);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new e(this));
        }
        View findViewById = inflate.findViewById(n.smartspacesRssiLevel);
        if (findViewById != null) {
            findViewById.setOnClickListener(new f(bVar));
        }
        View findViewById2 = inflate.findViewById(n.smartSpacesBlueIdDetailsButton);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new g(bVar));
        }
        kotlin.jvm.internal.k.d(inflate, "root");
        v a0 = a0();
        kotlin.jvm.internal.k.d(a0, "viewLifecycleOwner");
        V1(inflate, a0, bVar.E());
        v a02 = a0();
        kotlin.jvm.internal.k.d(a02, "viewLifecycleOwner");
        U1(inflate, a02, n.smartspacesIotUnitBlueIdContainer, bVar.F());
        v a03 = a0();
        kotlin.jvm.internal.k.d(a03, "viewLifecycleOwner");
        U1(inflate, a03, n.smartspacesRssiLevel, bVar.C());
        v a04 = a0();
        kotlin.jvm.internal.k.d(a04, "viewLifecycleOwner");
        U1(inflate, a04, n.smartspacesProgress, bVar.B());
        v a05 = a0();
        kotlin.jvm.internal.k.d(a05, "viewLifecycleOwner");
        U1(inflate, a05, n.smartSpacesBlueIdDetailsButton, bVar.A());
        TextView textView = (TextView) inflate.findViewById(n.smartspacesHardwareVersion);
        if (textView != null) {
            v a06 = a0();
            kotlin.jvm.internal.k.d(a06, "viewLifecycleOwner");
            T1(textView, a06, bVar.x());
        }
        TextView textView2 = (TextView) inflate.findViewById(n.smartspacesFirmwareRevision);
        if (textView2 != null) {
            v a07 = a0();
            kotlin.jvm.internal.k.d(a07, "viewLifecycleOwner");
            T1(textView2, a07, bVar.w());
        }
        TextView textView3 = (TextView) inflate.findViewById(n.smartspacesBatteryStatus);
        if (textView3 != null) {
            v a08 = a0();
            kotlin.jvm.internal.k.d(a08, "viewLifecycleOwner");
            T1(textView3, a08, bVar.u());
        }
        bVar.z().o(a0(), new h(this, inflate));
        bVar.y().o(a0(), new i(this, inflate));
        return inflate;
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
