package com.sensorberg.booking.roomselection;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.booking.roomselection.g;
import g.e.n.c.j.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import org.threeten.bp.LocalDate;

@i(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b,\u0010\u0019J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/sensorberg/booking/roomselection/RoomSelectionFragment;", "Lcom/sensorberg/booking/roomselection/h;", "Landroidx/fragment/app/Fragment;", "Landroid/content/res/Resources;", "r", "", "id", "", "getAndroidResource", "(Landroid/content/res/Resources;Ljava/lang/String;)I", "Landroid/view/View;", "popupParent", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "initToolbarClickListener", "(Landroid/view/View;)Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "()V", "Lcom/sensorberg/booking/roomselection/RoomSelectionItem$Unit;", "roomSelectionItem", "onRoomSelected", "(Lcom/sensorberg/booking/roomselection/RoomSelectionItem$Unit;)V", "Lcom/sensorberg/booking/databinding/FragRoomSelectionBinding;", "binding", "Lcom/sensorberg/booking/databinding/FragRoomSelectionBinding;", "Lcom/sensorberg/core/Navigator;", "navigator$delegate", "Lkotlin/Lazy;", "getNavigator", "()Lcom/sensorberg/core/Navigator;", "navigator", "Lcom/sensorberg/booking/roomselection/RoomSelectionViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/booking/roomselection/RoomSelectionViewModel;", "viewModel", "<init>", "Companion", "feature-booking_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: RoomSelectionFragment.kt */
public final class RoomSelectionFragment extends Fragment implements h {
    private final kotlin.e d0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e e0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap f0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<g.e.d.g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f4998h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f4999i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5000j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f4998h = componentCallbacks;
            this.f4999i = aVar;
            this.f5000j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, g.e.d.g] */
        public final g.e.d.g d() {
            ComponentCallbacks componentCallbacks = this.f4998h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(g.e.d.g.class), this.f4999i, this.f5000j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<i> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f5001h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5002i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5003j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f5001h = vVar;
            this.f5002i = aVar;
            this.f5003j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.booking.roomselection.i, androidx.lifecycle.n0] */
        /* renamed from: a */
        public final i d() {
            return m.a.b.a.d.a.b.b(this.f5001h, v.b(i.class), this.f5002i, this.f5003j);
        }
    }

    /* compiled from: RoomSelectionFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RoomSelectionFragment.kt */
    static final class d implements Toolbar.f {
        final /* synthetic */ RoomSelectionFragment a;
        final /* synthetic */ View b;

        /* compiled from: RoomSelectionFragment.kt */
        static final class a extends l implements kotlin.e0.c.a<Boolean> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ PopupWindow f5004h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(PopupWindow popupWindow) {
                super(0);
                this.f5004h = popupWindow;
            }

            public final boolean a() {
                this.f5004h.dismiss();
                return true;
            }

            public /* bridge */ /* synthetic */ Object d() {
                a();
                return Boolean.TRUE;
            }
        }

        /* compiled from: RoomSelectionFragment.kt */
        static final class b implements CalendarView.OnDateChangeListener {
            final /* synthetic */ d a;
            final /* synthetic */ PopupWindow b;

            b(d dVar, PopupWindow popupWindow) {
                this.a = dVar;
                this.b = popupWindow;
            }

            public final void onSelectedDayChange(CalendarView calendarView, int i2, int i3, int i4) {
                k.e(calendarView, "<anonymous parameter 0>");
                i S1 = this.a.a.V1();
                LocalDate z0 = LocalDate.z0(i2, i3 + 1, i4);
                k.d(z0, "LocalDate.of(year, month + 1, dayOfMonth)");
                S1.H(z0);
                this.b.dismiss();
            }
        }

        d(RoomSelectionFragment roomSelectionFragment, View view) {
            this.a = roomSelectionFragment;
            this.b = view;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Context C = this.a.C();
            if (C != null) {
                k.d(menuItem, "it");
                if (menuItem.getItemId() == g.e.b.e.menu_item_calendar) {
                    CalendarView calendarView = new CalendarView(C);
                    long currentTimeMillis = System.currentTimeMillis();
                    calendarView.setMinDate(currentTimeMillis);
                    calendarView.setMaxDate(currentTimeMillis + 15552000000L);
                    LocalDate l2 = this.a.V1().C().l();
                    k.c(l2);
                    k.d(l2, "viewModel.currentDateSelection.value!!");
                    calendarView.setDate(g.e.n.c.i.b.d(l2));
                    PopupWindow popupWindow = new PopupWindow(C);
                    popupWindow.setContentView(calendarView);
                    popupWindow.setAnimationStyle(16973826);
                    popupWindow.setBackgroundDrawable(new ColorDrawable(androidx.core.content.a.c(C, g.e.b.b.surface)));
                    popupWindow.setOutsideTouchable(true);
                    popupWindow.setTouchable(true);
                    popupWindow.setFocusable(true);
                    popupWindow.setElevation(this.a.R().getDimension(g.e.b.c.blocking_progress_elevation));
                    int dimensionPixelSize = this.a.R().getDimensionPixelSize(g.e.b.c.calendar_popup_margin);
                    RoomSelectionFragment roomSelectionFragment = this.a;
                    Resources R = roomSelectionFragment.R();
                    k.d(R, "resources");
                    popupWindow.showAtLocation(this.b, 8388661, dimensionPixelSize, roomSelectionFragment.T1(R, "status_bar_height") + dimensionPixelSize);
                    g.e.d.b.a(calendarView, new a(popupWindow));
                    calendarView.setOnDateChangeListener(new b(this, popupWindow));
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: RoomSelectionFragment.kt */
    static final class e implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ RoomSelectionFragment f5005g;

        e(RoomSelectionFragment roomSelectionFragment, g.e.b.i.f fVar) {
            this.f5005g = roomSelectionFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f5005g).t();
        }
    }

    /* compiled from: RoomSelectionFragment.kt */
    static final class f<T> implements f0<List<? extends a.b>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ RoomSelectionFragment f5006g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.b.i.f f5007h;

        /* compiled from: RoomSelectionFragment.kt */
        public static final class a implements AdapterView.OnItemSelectedListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ f f5008g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f5009h;

            a(f fVar, List list) {
                this.f5008g = fVar;
                this.f5009h = list;
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
                this.f5008g.f5006g.V1().G((a.b) this.f5009h.get(i2));
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }

        f(RoomSelectionFragment roomSelectionFragment, g.e.b.i.f fVar) {
            this.f5006g = roomSelectionFragment;
            this.f5007h = fVar;
        }

        /* renamed from: a */
        public final void k(List<a.b> list) {
            k.d(list, "rootUnits");
            ArrayList arrayList = new ArrayList(o.p(list, 10));
            for (a.b b : list) {
                arrayList.add(b.b());
            }
            Context C = this.f5006g.C();
            if (C != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(C, g.e.b.f.support_simple_spinner_dropdown_item, arrayList);
                Spinner spinner = this.f5007h.c;
                k.d(spinner, "binding.spinner");
                spinner.setAdapter(arrayAdapter);
                Spinner spinner2 = this.f5007h.c;
                k.d(spinner2, "binding.spinner");
                spinner2.setOnItemSelectedListener(new a(this, list));
            }
        }
    }

    /* compiled from: RoomSelectionFragment.kt */
    static final class g<T> implements f0<e.p.h<g.a>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f5010g;

        g(b bVar) {
            this.f5010g = bVar;
        }

        /* renamed from: a */
        public final void k(e.p.h<g.a> hVar) {
            this.f5010g.L(hVar);
        }
    }

    /* compiled from: RoomSelectionFragment.kt */
    static final class h<T> implements f0<g.e.h.a.a<? extends Integer>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ RoomSelectionFragment f5011g;

        /* compiled from: RoomSelectionFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<Integer, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h f5012h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f5012h = hVar;
            }

            public final void a(int i2) {
                Toast.makeText(this.f5012h.f5011g.C(), i2, 0).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Number) obj).intValue());
                return x.a;
            }
        }

        h(RoomSelectionFragment roomSelectionFragment) {
            this.f5011g = roomSelectionFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Integer> aVar) {
            aVar.a(new a(this));
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final int T1(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final g.e.d.g U1() {
        return (g.e.d.g) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final i V1() {
        return (i) this.d0.getValue();
    }

    private final Toolbar.f W1(View view) {
        return new d(this, view);
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        g.e.b.i.f c2 = g.e.b.i.f.c(layoutInflater);
        k.d(c2, "FragRoomSelectionBinding.inflate(inflater)");
        V1().D().o(a0(), new f(this, c2));
        b bVar = new b(this);
        RecyclerView recyclerView = c2.b;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.h3(new a(bVar, gridLayoutManager.Z2()));
        x xVar = x.a;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(bVar);
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((androidx.recyclerview.widget.g) itemAnimator).R(false);
            Toolbar toolbar = c2.f9731d;
            toolbar.x(g.e.b.g.menu_room_selection);
            ConstraintLayout b2 = c2.b();
            k.d(b2, "binding.root");
            toolbar.setOnMenuItemClickListener(W1(b2));
            toolbar.setNavigationOnClickListener(new e(this, c2));
            V1().B().o(a0(), new g(bVar));
            V1().F().o(a0(), new h(this));
            return c2.b();
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
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

    public void j(g.a aVar) {
        k.e(aVar, "roomSelectionItem");
        g.e.d.g U1 = U1();
        NavController a2 = androidx.navigation.fragment.a.a(this);
        String e2 = aVar.e();
        String c2 = aVar.c();
        LocalDate l2 = V1().C().l();
        k.c(l2);
        k.d(l2, "viewModel.currentDateSelection.value!!");
        U1.c(a2, e2, c2, l2);
    }
}
