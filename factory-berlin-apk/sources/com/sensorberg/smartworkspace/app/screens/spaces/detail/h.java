package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.q.d;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.q.e;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.q.f;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.q.g;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.q.i;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.q.j;
import g.e.d.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: SpaceDetailAdapter.kt */
public final class h extends q<p, c> implements a, p.d.b.a, p.e.c, p.a.b, p.e.d.a, p.e.b.a, p.f.a, p.d.a.C0526a {
    private static final h.d<p> s = new a();

    /* renamed from: k  reason: collision with root package name */
    private final ValueAnimator f7830k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ p.d.b.a f7831l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ p.e.c f7832m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ p.a.b f7833n;
    private final /* synthetic */ p.e.d.a o;
    private final /* synthetic */ p.e.b.a p;
    private final /* synthetic */ p.f.a q;
    private final /* synthetic */ p.d.a.C0526a r;

    /* compiled from: SpaceDetailAdapter.kt */
    public static final class a extends h.d<p> {
        a() {
        }

        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(p pVar, p pVar2) {
            k.e(pVar, "oldItem");
            k.e(pVar2, "newItem");
            return k.a(pVar, pVar2);
        }

        /* renamed from: e */
        public boolean b(p pVar, p pVar2) {
            k.e(pVar, "oldItem");
            k.e(pVar2, "newItem");
            return k.a(pVar.a(), pVar2.a());
        }
    }

    /* compiled from: SpaceDetailAdapter.kt */
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ValueAnimator valueAnimator, p.d.b.a aVar, p.e.c cVar, p.a.b bVar, p.e.d.a aVar2, p.e.b.a aVar3, p.f.a aVar4, p.d.a.C0526a aVar5) {
        super(s);
        k.e(valueAnimator, "animator");
        k.e(aVar, "moreClickListener");
        k.e(cVar, "iconRowClickListener");
        k.e(bVar, "detailsClickListener");
        k.e(aVar2, "switchCheckedChangeListener");
        k.e(aVar3, "buttonClickListener");
        k.e(aVar4, "seekBarProgressChangeListener");
        k.e(aVar5, "miniIconClickListener");
        this.f7831l = aVar;
        this.f7832m = cVar;
        this.f7833n = bVar;
        this.o = aVar2;
        this.p = aVar3;
        this.q = aVar4;
        this.r = aVar5;
        this.f7830k = valueAnimator;
    }

    /* renamed from: L */
    public void x(c cVar, int i2) {
        k.e(cVar, "viewHolder");
        if (cVar instanceof g) {
            g gVar = (g) cVar;
            Object I = I(i2);
            if (I != null) {
                gVar.N((p.d.a) I);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.Mini.MiniIcon");
        } else if (cVar instanceof f) {
            f fVar = (f) cVar;
            Object I2 = I(i2);
            if (I2 != null) {
                fVar.O((p.e.a) I2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.Row.IconRow");
        } else if (cVar instanceof com.sensorberg.smartworkspace.app.screens.spaces.detail.q.c) {
            com.sensorberg.smartworkspace.app.screens.spaces.detail.q.c cVar2 = (com.sensorberg.smartworkspace.app.screens.spaces.detail.q.c) cVar;
            Object I3 = I(i2);
            if (I3 != null) {
                cVar2.M((p.c) I3);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.Header");
        } else if (cVar instanceof e) {
            e eVar = (e) cVar;
            Object I4 = I(i2);
            if (I4 != null) {
                eVar.N((p.e.d) I4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.Row.IconRowSwitch");
        } else if (cVar instanceof d) {
            d dVar = (d) cVar;
            Object I5 = I(i2);
            if (I5 != null) {
                dVar.N((p.e.b) I5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.Row.IconRowButton");
        } else if (cVar instanceof i) {
            i iVar = (i) cVar;
            Object I6 = I(i2);
            if (I6 != null) {
                iVar.N((p.f) I6);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.SeekBarRow");
        } else if (cVar instanceof com.sensorberg.smartworkspace.app.screens.spaces.detail.q.a) {
            com.sensorberg.smartworkspace.app.screens.spaces.detail.q.a aVar = (com.sensorberg.smartworkspace.app.screens.spaces.detail.q.a) cVar;
            Object I7 = I(i2);
            if (I7 != null) {
                aVar.O((p.a) I7);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.DetailsButtonRow");
        } else if (cVar instanceof com.sensorberg.smartworkspace.app.screens.spaces.detail.q.h) {
            com.sensorberg.smartworkspace.app.screens.spaces.detail.q.h hVar = (com.sensorberg.smartworkspace.app.screens.spaces.detail.q.h) cVar;
            Object I8 = I(i2);
            if (I8 != null) {
                hVar.M((p.d.b) I8);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.spaces.detail.Widget.Mini.MoreButton");
        }
    }

    /* renamed from: M */
    public c z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        switch (i2) {
            case 0:
                return new com.sensorberg.smartworkspace.app.screens.spaces.detail.q.c(viewGroup, this.f7830k);
            case 1:
                return new g(viewGroup, this);
            case 2:
                return new f(viewGroup, this);
            case 3:
                return new e(viewGroup, this.f7830k, this, this);
            case 4:
                return new d(viewGroup, this.f7830k, this, this);
            case 5:
                return new i(viewGroup, this.f7830k, this);
            case 6:
                return new com.sensorberg.smartworkspace.app.screens.spaces.detail.q.a(viewGroup, this);
            case 7:
                return new j(viewGroup);
            case 8:
                return new com.sensorberg.smartworkspace.app.screens.spaces.detail.q.b(viewGroup);
            case 9:
                return new com.sensorberg.smartworkspace.app.screens.spaces.detail.q.h(viewGroup, this);
            default:
                throw new IllegalStateException("Unknown viewType: " + i2);
        }
    }

    public void b(p.e eVar) {
        k.e(eVar, "row");
        this.f7832m.b(eVar);
    }

    public void e(p.e.d dVar, boolean z) {
        k.e(dVar, "iconRowSwitch");
        this.o.e(dVar, z);
    }

    public void f(p.d.a aVar) {
        k.e(aVar, "miniIcon");
        this.r.f(aVar);
    }

    public void g(p.a aVar) {
        k.e(aVar, "item");
        this.f7833n.g(aVar);
    }

    public int getItemViewType(int i2) {
        p pVar = (p) I(i2);
        if (pVar instanceof p.c) {
            return 0;
        }
        if (pVar instanceof p.d.a) {
            return 1;
        }
        if (pVar instanceof p.e.a) {
            return 2;
        }
        if (pVar instanceof p.e.d) {
            return 3;
        }
        if (pVar instanceof p.e.b) {
            return 4;
        }
        if (pVar instanceof p.f) {
            return 5;
        }
        if (pVar instanceof p.a) {
            return 6;
        }
        if (pVar instanceof p.g) {
            return 7;
        }
        if (pVar instanceof p.b) {
            return 8;
        }
        if (pVar instanceof p.d.b) {
            return 9;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void m() {
        this.f7831l.m();
    }

    public void p(p.e.b bVar) {
        k.e(bVar, "iconRowButton");
        this.p.p(bVar);
    }

    public void q(p.f fVar, int i2) {
        k.e(fVar, "seekBarRow");
        this.q.q(fVar, i2);
    }
}
