package com.sensorberg.smartworkspace.app.screens.info;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.q;
import com.sensorberg.smartworkspace.app.k.s;
import com.sensorberg.smartworkspace.app.utils.p;
import g.e.d.f;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;
import org.threeten.bp.d;
import org.threeten.bp.e;
import org.threeten.bp.format.c;
import org.threeten.bp.o;

/* compiled from: InfoAdapter.kt */
public final class b extends RecyclerView.g<e> implements f0<List<? extends a>> {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final c f7504l = c.j("H:mm", Locale.getDefault());
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final c f7505m = c.j("d. MMMM H:mm", Locale.getDefault());

    /* renamed from: n  reason: collision with root package name */
    public static final a f7506n = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private LayoutInflater f7507i;

    /* renamed from: j  reason: collision with root package name */
    private List<a> f7508j = n.g();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final c f7509k;

    /* compiled from: InfoAdapter.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String b(Resources resources, long j2) {
            e r0 = d.S(j2).C(o.C()).S();
            LocalDate x0 = LocalDate.x0();
            LocalDate E0 = r0.U();
            if (k.a(E0, x0)) {
                String string = resources.getString(R.string.label_time_today, new Object[]{r0.G(b.f7504l)});
                k.d(string, "res.getString(R.string.l…day, time.format(recent))");
                return string;
            } else if (k.a(E0, x0.u0(1))) {
                String string2 = resources.getString(R.string.label_time_yesterday, new Object[]{r0.G(b.f7504l)});
                k.d(string2, "res.getString(R.string.l…day, time.format(recent))");
                return string2;
            } else {
                String G = r0.G(b.f7505m);
                k.d(G, "time.format(past)");
                return G;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.info.b$b  reason: collision with other inner class name */
    /* compiled from: InfoAdapter.kt */
    static final class C0493b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7510g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f7511h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f7512i;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.info.b$b$a */
        /* compiled from: InfoAdapter.kt */
        static final class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C0493b f7513g;

            a(C0493b bVar) {
                this.f7513g = bVar;
            }

            public final void run() {
                this.f7513g.f7510g.f7509k.c(this.f7513g.f7511h);
            }
        }

        C0493b(b bVar, a aVar, e eVar) {
            this.f7510g = bVar;
            this.f7511h = aVar;
            this.f7512i = eVar;
        }

        public final void onClick(View view) {
            this.f7511h.j(true);
            if (this.f7511h.d() != null) {
                Intent intent = new Intent();
                View view2 = this.f7512i.a;
                k.d(view2, "holder.itemView");
                Context context = view2.getContext();
                k.d(context, "holder.itemView.context");
                f.e(intent, context, this.f7511h.d());
            }
            p.f8017d.b().post(new a(this));
        }
    }

    public b(c cVar) {
        k.e(cVar, "dao");
        this.f7509k = cVar;
    }

    /* renamed from: L */
    public void x(e eVar, int i2) {
        k.e(eVar, "holder");
        a aVar = this.f7508j.get(i2);
        int l2 = eVar.l();
        int i3 = 8;
        if (l2 == 0) {
            ViewDataBinding M = ((f) eVar).M();
            if (M != null) {
                q qVar = (q) M;
                TextView textView = qVar.y;
                k.d(textView, "bind.readTitle");
                textView.setText(aVar.g());
                TextView textView2 = qVar.v;
                k.d(textView2, "bind.readBody");
                textView2.setText(aVar.b());
                TextView textView3 = qVar.x;
                k.d(textView3, "bind.readTime");
                a aVar2 = f7506n;
                View s = qVar.s();
                k.d(s, "bind.root");
                Resources resources = s.getResources();
                k.d(resources, "bind.root.resources");
                textView3.setText(aVar2.b(resources, aVar.h()));
                ImageView imageView = qVar.w;
                k.d(imageView, "bind.readChevron");
                if (aVar.d() != null) {
                    i3 = 0;
                }
                imageView.setVisibility(i3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.databinding.FragInfoItemReadBinding");
            }
        } else if (l2 == 1) {
            ViewDataBinding M2 = ((g) eVar).M();
            if (M2 != null) {
                s sVar = (s) M2;
                TextView textView4 = sVar.y;
                k.d(textView4, "bind.unreadTitle");
                textView4.setText(aVar.g());
                TextView textView5 = sVar.v;
                k.d(textView5, "bind.unreadBody");
                textView5.setText(aVar.b());
                TextView textView6 = sVar.x;
                k.d(textView6, "bind.unreadTime");
                a aVar3 = f7506n;
                View s2 = sVar.s();
                k.d(s2, "bind.root");
                Resources resources2 = s2.getResources();
                k.d(resources2, "bind.root.resources");
                textView6.setText(aVar3.b(resources2, aVar.h()));
                ImageView imageView2 = sVar.w;
                k.d(imageView2, "bind.unreadChevron");
                if (aVar.d() != null) {
                    i3 = 0;
                }
                imageView2.setVisibility(i3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.databinding.FragInfoItemUnreadBinding");
            }
        } else {
            throw new IllegalStateException("never gonna happen");
        }
        eVar.M().s().setOnClickListener(new C0493b(this, aVar, eVar));
    }

    /* renamed from: M */
    public void k(List<a> list) {
        if (list == null) {
            list = n.g();
        }
        this.f7508j = list;
        r();
    }

    /* renamed from: N */
    public e z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        if (this.f7507i == null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            k.d(from, "LayoutInflater.from(parent.context)");
            this.f7507i = from;
        }
        if (i2 == 0) {
            LayoutInflater layoutInflater = this.f7507i;
            if (layoutInflater != null) {
                ViewDataBinding g2 = androidx.databinding.f.g(layoutInflater, R.layout.frag_info_item_read, viewGroup, false);
                k.d(g2, "DataBindingUtil.inflate(…item_read, parent, false)");
                return new f((q) g2);
            }
            k.q("inflater");
            throw null;
        } else if (i2 == 1) {
            LayoutInflater layoutInflater2 = this.f7507i;
            if (layoutInflater2 != null) {
                ViewDataBinding g3 = androidx.databinding.f.g(layoutInflater2, R.layout.frag_info_item_unread, viewGroup, false);
                k.d(g3, "DataBindingUtil.inflate(…em_unread, parent, false)");
                return new g((s) g3);
            }
            k.q("inflater");
            throw null;
        } else {
            throw new IllegalArgumentException("Unexpected view type");
        }
    }

    public int d() {
        return this.f7508j.size();
    }

    public int getItemViewType(int i2) {
        return this.f7508j.get(i2).f() ^ true ? 1 : 0;
    }
}
