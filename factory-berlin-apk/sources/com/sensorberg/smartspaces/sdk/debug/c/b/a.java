package com.sensorberg.smartspaces.sdk.debug.c.b;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.smartspaces.sdk.debug.c.b.c;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import g.e.n.g.n;
import g.e.n.g.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: IotDevicesAdapter.kt */
public final class a extends q<c.C0367c, d<? extends c.C0367c>> {

    /* renamed from: m  reason: collision with root package name */
    private static final C0361a f6207m = new C0361a();

    /* renamed from: k  reason: collision with root package name */
    private final l<String, x> f6208k;

    /* renamed from: l  reason: collision with root package name */
    private final p<IotDevice, Property, x> f6209l;

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.a$a  reason: collision with other inner class name */
    /* compiled from: IotDevicesAdapter.kt */
    public static final class C0361a extends h.d<c.C0367c> {
        C0361a() {
        }

        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(c.C0367c cVar, c.C0367c cVar2) {
            k.e(cVar, "oldItem");
            k.e(cVar2, "newItem");
            return k.a(cVar, cVar2);
        }

        /* renamed from: e */
        public boolean b(c.C0367c cVar, c.C0367c cVar2) {
            k.e(cVar, "oldItem");
            k.e(cVar2, "newItem");
            return cVar.a() == cVar2.a();
        }
    }

    /* compiled from: IotDevicesAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: IotDevicesAdapter.kt */
    public static final class c extends d<c.C0367c.a> {
        private final TextView t;
        private final TextView u;
        private final TextView v;
        private final TextView w;
        private final TextView x;
        private String y;

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.a$c$a  reason: collision with other inner class name */
        /* compiled from: IotDevicesAdapter.kt */
        static final class C0362a implements View.OnClickListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f6210g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l f6211h;

            C0362a(c cVar, l lVar) {
                this.f6210g = cVar;
                this.f6211h = lVar;
            }

            public final void onClick(View view) {
                this.f6211h.o(c.O(this.f6210g));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view, l<? super String, x> lVar) {
            super(view);
            k.e(view, "itemView");
            k.e(lVar, "onClickListener");
            View findViewById = view.findViewById(n.smartspacesIotDeviceName);
            k.d(findViewById, "itemView.findViewById(R.…smartspacesIotDeviceName)");
            this.t = (TextView) findViewById;
            View findViewById2 = view.findViewById(n.smartspacesIotDeviceTypeName);
            k.d(findViewById2, "itemView.findViewById(R.…tspacesIotDeviceTypeName)");
            this.u = (TextView) findViewById2;
            View findViewById3 = view.findViewById(n.smartspacesIotDeviceTypeExternalId);
            k.d(findViewById3, "itemView.findViewById(R.…sIotDeviceTypeExternalId)");
            this.v = (TextView) findViewById3;
            View findViewById4 = view.findViewById(n.smartspacesIotDeviceContainedUnit);
            k.d(findViewById4, "itemView.findViewById(R.…esIotDeviceContainedUnit)");
            this.w = (TextView) findViewById4;
            View findViewById5 = view.findViewById(n.smartspacesIotDeviceProperties);
            k.d(findViewById5, "itemView.findViewById(R.…pacesIotDeviceProperties)");
            this.x = (TextView) findViewById5;
            view.setOnClickListener(new C0362a(this, lVar));
        }

        public static final /* synthetic */ String O(c cVar) {
            String str = cVar.y;
            if (str != null) {
                return str;
            }
            k.q("iotDeviceId");
            throw null;
        }

        /* renamed from: P */
        public void M(c.C0367c.a aVar) {
            k.e(aVar, "data");
            this.y = aVar.c();
            this.t.setText(aVar.d());
            this.u.setText(aVar.g());
            this.v.setText(aVar.f());
            this.w.setText(aVar.b());
            this.x.setText(aVar.e());
        }
    }

    /* compiled from: IotDevicesAdapter.kt */
    public static abstract class d<T extends c.C0367c> extends RecyclerView.d0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            k.e(view, "itemView");
        }

        public abstract void M(T t);

        public final void N(c.C0367c cVar) {
            k.e(cVar, "data");
            M(cVar);
        }
    }

    /* compiled from: IotDevicesAdapter.kt */
    public static final class e extends d<c.C0367c.b> {
        private final Drawable t;
        private final TextView u;
        private final TextView v;
        private final TextView w;
        private IotDevice x;
        private Property y;

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.a$e$a  reason: collision with other inner class name */
        /* compiled from: IotDevicesAdapter.kt */
        static final class C0363a implements View.OnClickListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ e f6212g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f6213h;

            C0363a(e eVar, p pVar) {
                this.f6212g = eVar;
                this.f6213h = pVar;
            }

            public final void onClick(View view) {
                if (e.P(this.f6212g).getWritable()) {
                    this.f6213h.l(e.O(this.f6212g), e.P(this.f6212g));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(View view, p<? super IotDevice, ? super Property, x> pVar) {
            super(view);
            k.e(view, "itemView");
            k.e(pVar, "onPropertyClick");
            Drawable background = view.getBackground();
            k.d(background, "itemView.background");
            this.t = background;
            View findViewById = view.findViewById(n.smartspacesIotDevicePropertyName);
            k.d(findViewById, "itemView.findViewById(R.…cesIotDevicePropertyName)");
            this.u = (TextView) findViewById;
            View findViewById2 = view.findViewById(n.smartspacesIotDevicePropertyAccess);
            k.d(findViewById2, "itemView.findViewById(R.…sIotDevicePropertyAccess)");
            this.v = (TextView) findViewById2;
            View findViewById3 = view.findViewById(n.smartspacesIotDevicePropertyValue);
            k.d(findViewById3, "itemView.findViewById(R.…esIotDevicePropertyValue)");
            this.w = (TextView) findViewById3;
            view.setOnClickListener(new C0363a(this, pVar));
        }

        public static final /* synthetic */ IotDevice O(e eVar) {
            IotDevice iotDevice = eVar.x;
            if (iotDevice != null) {
                return iotDevice;
            }
            k.q("iotDevice");
            throw null;
        }

        public static final /* synthetic */ Property P(e eVar) {
            Property property = eVar.y;
            if (property != null) {
                return property;
            }
            k.q("property");
            throw null;
        }

        /* renamed from: Q */
        public void M(c.C0367c.b bVar) {
            k.e(bVar, "data");
            this.x = bVar.b();
            this.y = bVar.d();
            this.u.setText(bVar.c());
            this.v.setText(bVar.e());
            this.w.setText(bVar.f());
            Property property = this.y;
            if (property == null) {
                k.q("property");
                throw null;
            } else if (property.getWritable()) {
                View view = this.a;
                k.d(view, "itemView");
                view.setBackground(this.t);
                View view2 = this.a;
                k.d(view2, "itemView");
                view2.setClickable(true);
            } else {
                View view3 = this.a;
                k.d(view3, "itemView");
                view3.setBackground((Drawable) null);
                View view4 = this.a;
                k.d(view4, "itemView");
                view4.setClickable(false);
            }
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l<? super String, x> lVar, p<? super IotDevice, ? super Property, x> pVar) {
        super(f6207m);
        k.e(lVar, "onDeviceClick");
        k.e(pVar, "onPropertyClick");
        this.f6208k = lVar;
        this.f6209l = pVar;
        G(true);
    }

    /* renamed from: L */
    public void x(d<? extends c.C0367c> dVar, int i2) {
        k.e(dVar, "holder");
        c.C0367c cVar = (c.C0367c) I(i2);
        k.d(cVar, "data");
        dVar.N(cVar);
    }

    /* renamed from: M */
    public d<? extends c.C0367c> z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        if (i2 == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(o.smartspaces_debug_iotdevices_item_device, viewGroup, false);
            k.d(inflate, "LayoutInflater.from(pare…em_device, parent, false)");
            return new c(inflate, this.f6208k);
        } else if (i2 == 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(o.smartspaces_debug_iotdevices_item_property, viewGroup, false);
            k.d(inflate2, "LayoutInflater.from(pare…_property, parent, false)");
            return new e(inflate2, this.f6209l);
        } else {
            throw new IllegalArgumentException("Bad view type " + i2);
        }
    }

    public int getItemViewType(int i2) {
        c.C0367c cVar = (c.C0367c) I(i2);
        if (cVar instanceof c.C0367c.a) {
            return 1;
        }
        if (cVar instanceof c.C0367c.b) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public long i(int i2) {
        return ((c.C0367c) I(i2)).a();
    }
}
