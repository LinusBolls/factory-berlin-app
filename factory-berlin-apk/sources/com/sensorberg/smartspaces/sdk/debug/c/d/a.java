package com.sensorberg.smartspaces.sdk.debug.c.d;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.smartspaces.sdk.debug.c.d.c;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.n.g.n;
import g.e.n.g.o;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: OverviewAdapter.kt */
public final class a extends q<c.i, c> {

    /* renamed from: m  reason: collision with root package name */
    private static final C0375a f6316m = new C0375a();

    /* renamed from: k  reason: collision with root package name */
    private final f0<List<c.i>> f6317k = new d(this);

    /* renamed from: l  reason: collision with root package name */
    public kotlin.e0.c.q<? super View, ? super Integer, ? super c.i, x> f6318l;

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.d.a$a  reason: collision with other inner class name */
    /* compiled from: OverviewAdapter.kt */
    public static final class C0375a extends h.d<c.i> {
        C0375a() {
        }

        /* renamed from: d */
        public boolean a(c.i iVar, c.i iVar2) {
            k.e(iVar, "oldItem");
            k.e(iVar2, "newItem");
            return k.a(iVar, iVar2);
        }

        /* renamed from: e */
        public boolean b(c.i iVar, c.i iVar2) {
            k.e(iVar, "oldItem");
            k.e(iVar2, "newItem");
            return k.a(iVar.g(), iVar2.g());
        }
    }

    /* compiled from: OverviewAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OverviewAdapter.kt */
    public static final class c extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        /* access modifiers changed from: private */
        public final kotlin.e0.c.q<View, Integer, c.i, x> D;
        private c.i t;
        private final ImageView u;
        private final ImageView v;
        private final Drawable w;
        private final TextView x;
        private final TextView y;
        private final TextView z;

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.d.a$c$a  reason: collision with other inner class name */
        /* compiled from: OverviewAdapter.kt */
        static final class C0376a implements View.OnClickListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f6319g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ View f6320h;

            C0376a(c cVar, View view) {
                this.f6319g = cVar;
                this.f6320h = view;
            }

            public final void onClick(View view) {
                kotlin.e0.c.q M = this.f6319g.D;
                View view2 = this.f6320h;
                Integer valueOf = Integer.valueOf(this.f6319g.j());
                c.i O = this.f6319g.O();
                k.c(O);
                M.k(view2, valueOf, O);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view, kotlin.e0.c.q<? super View, ? super Integer, ? super c.i, x> qVar) {
            super(view);
            k.e(view, "itemView");
            k.e(qVar, "onItemClickListener");
            this.D = qVar;
            View findViewById = view.findViewById(n.smartspacesHardwareIcon);
            k.d(findViewById, "itemView.findViewById(R.….smartspacesHardwareIcon)");
            this.u = (ImageView) findViewById;
            View findViewById2 = view.findViewById(n.smartspacesRssiLevel);
            k.d(findViewById2, "itemView.findViewById(R.id.smartspacesRssiLevel)");
            ImageView imageView = (ImageView) findViewById2;
            this.v = imageView;
            Drawable drawable = imageView.getDrawable();
            k.d(drawable, "rssiLevelIcon.drawable");
            this.w = drawable;
            View findViewById3 = view.findViewById(n.smartspacesRssiValue);
            k.d(findViewById3, "itemView.findViewById(R.id.smartspacesRssiValue)");
            this.x = (TextView) findViewById3;
            View findViewById4 = view.findViewById(n.smartspacesDisplayName);
            k.d(findViewById4, "itemView.findViewById(R.id.smartspacesDisplayName)");
            this.y = (TextView) findViewById4;
            View findViewById5 = view.findViewById(n.smartspacesDeviceId);
            k.d(findViewById5, "itemView.findViewById(R.id.smartspacesDeviceId)");
            this.z = (TextView) findViewById5;
            View findViewById6 = view.findViewById(n.smartspacesAvailable);
            k.d(findViewById6, "itemView.findViewById(R.id.smartspacesAvailable)");
            this.A = (TextView) findViewById6;
            View findViewById7 = view.findViewById(n.smartspacesBooked);
            k.d(findViewById7, "itemView.findViewById(R.id.smartspacesBooked)");
            this.B = (TextView) findViewById7;
            View findViewById8 = view.findViewById(n.smartspacesBlueid);
            k.d(findViewById8, "itemView.findViewById(R.id.smartspacesBlueid)");
            this.C = (TextView) findViewById8;
            view.setOnClickListener(new C0376a(this, view));
        }

        public final void N(c.i iVar) {
            k.e(iVar, "item");
            this.t = iVar;
            this.u.setImageResource(iVar.j());
            ImageView imageView = this.u;
            StringBuilder sb = new StringBuilder();
            sb.append("Icon of a ");
            IotUnit k2 = iVar.k();
            sb.append(k2 != null ? k2.getHardwareType() : null);
            imageView.setContentDescription(sb.toString());
            ImageView imageView2 = this.v;
            imageView2.setContentDescription("Rssi level is " + iVar.l() + ". 5 is strongest, 1 is lowest)");
            this.w.setLevel(iVar.l());
            this.x.setText(iVar.m());
            this.y.setText(iVar.h());
            this.z.setText(iVar.g());
            float f2 = 1.0f;
            this.A.setAlpha(iVar.c() ? 1.0f : 0.4f);
            this.B.setAlpha(iVar.f() ? 1.0f : 0.4f);
            TextView textView = this.C;
            if (!iVar.d()) {
                f2 = 0.4f;
            }
            textView.setAlpha(f2);
        }

        public final c.i O() {
            return this.t;
        }
    }

    /* compiled from: OverviewAdapter.kt */
    static final class d<T> implements f0<List<? extends c.i>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6321g;

        d(a aVar) {
            this.f6321g = aVar;
        }

        /* renamed from: a */
        public final void k(List<c.i> list) {
            this.f6321g.K(list);
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public a() {
        super(f6316m);
    }

    public final f0<List<c.i>> L() {
        return this.f6317k;
    }

    /* renamed from: M */
    public void x(c cVar, int i2) {
        k.e(cVar, "holder");
        Object I = I(i2);
        k.d(I, "getItem(position)");
        cVar.N((c.i) I);
    }

    /* renamed from: N */
    public c z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(o.smartspaces_debug_overview_item, viewGroup, false);
        k.d(inflate, "root");
        kotlin.e0.c.q<? super View, ? super Integer, ? super c.i, x> qVar = this.f6318l;
        if (qVar != null) {
            return new c(inflate, qVar);
        }
        k.q("onItemClickListener");
        throw null;
    }

    public final void O(kotlin.e0.c.q<? super View, ? super Integer, ? super c.i, x> qVar) {
        k.e(qVar, "<set-?>");
        this.f6318l = qVar;
    }
}
