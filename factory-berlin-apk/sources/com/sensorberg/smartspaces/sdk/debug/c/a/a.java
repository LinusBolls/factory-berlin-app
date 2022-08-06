package com.sensorberg.smartspaces.sdk.debug.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.u;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import g.e.n.g.n;
import g.e.n.g.o;
import g.e.n.g.q;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: HomeFragment.kt */
public final class a extends Fragment {
    private HashMap d0;

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.a.a$a  reason: collision with other inner class name */
    /* compiled from: HomeFragment.kt */
    static final class C0359a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6178g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Class f6179h;

        C0359a(a aVar, String str, Class cls) {
            this.f6178g = aVar;
            this.f6179h = cls;
        }

        public final void onClick(View view) {
            u i2;
            Fragment fragment = (Fragment) this.f6179h.newInstance();
            m H = this.f6178g.H();
            if (H != null && (i2 = H.i()) != null) {
                i2.v(fragment);
                if (i2 != null) {
                    i2.r(16908290, fragment);
                    if (i2 != null) {
                        i2.h((String) null);
                        if (i2 != null) {
                            i2.j();
                        }
                    }
                }
            }
        }
    }

    /* compiled from: HomeFragment.kt */
    static final class b<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f6180g;

        b(View view) {
            this.f6180g = view;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = (TextView) this.f6180g.findViewById(n.smartspacesTextUserManager);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    /* compiled from: HomeFragment.kt */
    static final class c<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f6181g;

        c(View view) {
            this.f6181g = view;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = (TextView) this.f6181g.findViewById(n.smartspacesTextUser);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    /* compiled from: HomeFragment.kt */
    static final class d<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f6182g;

        d(View view) {
            this.f6182g = view;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = (TextView) this.f6182g.findViewById(n.smartspacesTextUnitController);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    /* compiled from: HomeFragment.kt */
    static final class e<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f6183g;

        e(View view) {
            this.f6183g = view;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = (TextView) this.f6183g.findViewById(n.smartspacesTextScanStatus);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    /* compiled from: HomeFragment.kt */
    static final class f<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f6184g;

        f(View view) {
            this.f6184g = view;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = (TextView) this.f6184g.findViewById(n.smartspacesTextUnitCount);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    private final void R1(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        k.d(context, "viewGroup.context");
        Resources resources = context.getResources();
        k.d(resources, "viewGroup.context.resources");
        int i2 = (int) (resources.getDisplayMetrics().density * 16.0f);
        View view = new View(viewGroup.getContext());
        view.setBackgroundColor(Color.argb(128, 255, 255, 255));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(i2);
        x xVar = x.a;
        view.setLayoutParams(layoutParams);
        x xVar2 = x.a;
        viewGroup.addView(view);
    }

    private final void S1(ViewGroup viewGroup, String str, Class<? extends Fragment> cls) {
        TextView textView = new TextView(new e.a.n.d(viewGroup.getContext(), q.SmartSpacesInfoText_Clickable));
        textView.setText(str);
        textView.setOnClickListener(new C0359a(this, str, cls));
        x xVar = x.a;
        viewGroup.addView(textView);
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(o.smartspaces_debug_home_screen, viewGroup, false);
        n0 a = q0.a(this).a(b.class);
        k.d(a, "ViewModelProviders.of(th…omeViewModel::class.java)");
        b bVar = (b) a;
        TextView textView = (TextView) inflate.findViewById(n.smartspacesTextBaseUrl);
        if (textView != null) {
            textView.setText(bVar.u());
        }
        bVar.A().o(a0(), new b(inflate));
        bVar.y().o(a0(), new c(inflate));
        bVar.w().o(a0(), new d(inflate));
        bVar.t().o(a0(), new e(inflate));
        bVar.x().o(a0(), new f(inflate));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(n.smartspacesContent);
        if (linearLayout != null) {
            R1(linearLayout);
            S1(linearLayout, "Units Scan Overview", com.sensorberg.smartspaces.sdk.debug.c.d.b.class);
            S1(linearLayout, "IotDevices OverView", com.sensorberg.smartspaces.sdk.debug.c.b.b.class);
        }
        return inflate;
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.d0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
