package com.sensorberg.smartworkspace.app.quicksetting;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.activities.main.SingleActivity;
import com.sensorberg.smartworkspace.app.utils.j;
import g.e.n.g.s;
import g.e.n.g.t;
import g.e.n.g.x;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@SuppressLint({"Registered", "NewApi"})
@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001.\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010\u000bJ)\u0010\b\u001a\u00020\u00072\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u000bR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%RJ\u0010)\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&\u0012\u0004\u0012\u00020'0\u0003j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&`(0\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\tR\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00106\u001a\u0002018B@\u0002X\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0002078\u0002@\u0002XD¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010>\u001a\u00020:8B@\u0002X\u0002¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b<\u0010=R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010\"R\"\u0010E\u001a\u00020D8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010K\u001a\b\u0012\u0004\u0012\u00020@0\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\bK\u0010*\u001a\u0004\bL\u0010,\"\u0004\bM\u0010\t¨\u0006O"}, d2 = {"Lcom/sensorberg/smartworkspace/app/quicksetting/OpenNearestTileService;", "Landroid/service/quicksettings/TileService;", "Landroidx/lifecycle/LiveData;", "Lcom/sensorberg/response/Response;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "Lcom/sensorberg/smartspaces/sdk/OpeningProgress;", "opening", "", "handleOpenResult", "(Landroidx/lifecycle/LiveData;)V", "onClick", "()V", "onStartListening", "onStopListening", "runOpenOperation", "", "iconRedId", "labelResId", "tileState", "setTile", "(III)V", "setTileBluetoothDisabled", "setTileLocationDisabled", "setTileNoDoor", "setTileOpening", "setTileOpeningFailed", "setTileOpeningSuccess", "setTileReady", "setTileReadyDelayed", "setTileUnavailable", "Lcom/sensorberg/smartspaces/sdk/CancellationSignal;", "cancellationSignal", "Lcom/sensorberg/smartspaces/sdk/CancellationSignal;", "currentUnit", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "", "isOpening", "Z", "", "Ljava/lang/Void;", "Lcom/sensorberg/response/SimpleResponse;", "nearbyUnits", "Landroidx/lifecycle/LiveData;", "getNearbyUnits", "()Landroidx/lifecycle/LiveData;", "setNearbyUnits", "com/sensorberg/smartworkspace/app/quicksetting/OpenNearestTileService$nearestObserver$1", "nearestObserver", "Lcom/sensorberg/smartworkspace/app/quicksetting/OpenNearestTileService$nearestObserver$1;", "Lcom/sensorberg/smartworkspace/app/utils/PinInput;", "pinInput$delegate", "Lkotlin/Lazy;", "getPinInput", "()Lcom/sensorberg/smartworkspace/app/utils/PinInput;", "pinInput", "", "resultDuration", "J", "Lcom/sensorberg/smartspaces/sdk/SmartSpacesSdk;", "sdk$delegate", "getSdk", "()Lcom/sensorberg/smartspaces/sdk/SmartSpacesSdk;", "sdk", "Landroidx/lifecycle/Observer;", "Lcom/sensorberg/smartspaces/sdk/UnitController$Status;", "stateObserver", "Landroidx/lifecycle/Observer;", "tmpClickedUnit", "Lcom/sensorberg/smartspaces/sdk/UnitController;", "unitController", "Lcom/sensorberg/smartspaces/sdk/UnitController;", "getUnitController", "()Lcom/sensorberg/smartspaces/sdk/UnitController;", "setUnitController", "(Lcom/sensorberg/smartspaces/sdk/UnitController;)V", "unitControllerState", "getUnitControllerState", "setUnitControllerState", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: OpenNearestTileService.kt */
public final class OpenNearestTileService extends TileService {

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f7272g = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f7273h = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public IotUnit f7274i;

    /* renamed from: j  reason: collision with root package name */
    private IotUnit f7275j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f7276k;

    /* renamed from: l  reason: collision with root package name */
    private final long f7277l = 1500;

    /* renamed from: m  reason: collision with root package name */
    public x f7278m;

    /* renamed from: n  reason: collision with root package name */
    public LiveData<x.a> f7279n;
    public LiveData<g.e.m.a<List<IotUnit>, Void>> o;
    private final g.e.n.g.e p = new g.e.n.g.e();
    private final f q = new f(this);
    private final f0<x.a> r = new i(this);

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<s> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7280h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7281i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7282j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7280h = componentCallbacks;
            this.f7281i = aVar;
            this.f7282j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, g.e.n.g.s] */
        public final s d() {
            ComponentCallbacks componentCallbacks = this.f7280h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(s.class), this.f7281i, this.f7282j);
        }
    }

    /* compiled from: ComponentCallbackExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7283h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7284i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7285j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7283h = componentCallbacks;
            this.f7284i = aVar;
            this.f7285j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.sensorberg.smartworkspace.app.utils.j, java.lang.Object] */
        public final j d() {
            ComponentCallbacks componentCallbacks = this.f7283h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(j.class), this.f7284i, this.f7285j);
        }
    }

    /* compiled from: OpenNearestTileService.kt */
    static final class c extends l implements kotlin.e0.c.l<IotUnit, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ OpenNearestTileService f7286h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OpenNearestTileService openNearestTileService) {
            super(1);
            this.f7286h = openNearestTileService;
        }

        public final void a(IotUnit iotUnit) {
            this.f7286h.y();
            this.f7286h.A();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((IotUnit) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: OpenNearestTileService.kt */
    static final class d extends l implements kotlin.e0.c.l<Exception, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ OpenNearestTileService f7287h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(OpenNearestTileService openNearestTileService) {
            super(1);
            this.f7287h = openNearestTileService;
        }

        public final void a(Exception exc) {
            this.f7287h.x();
            this.f7287h.A();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: OpenNearestTileService.kt */
    static final class e extends l implements kotlin.e0.c.l<g.e.n.g.i, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ OpenNearestTileService f7288h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(OpenNearestTileService openNearestTileService) {
            super(1);
            this.f7288h = openNearestTileService;
        }

        public final void a(g.e.n.g.i iVar) {
            this.f7288h.w();
            this.f7288h.A();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((g.e.n.g.i) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: OpenNearestTileService.kt */
    public static final class f extends g.e.m.d.c<List<? extends IotUnit>, Void> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ OpenNearestTileService f7289g;

        f(OpenNearestTileService openNearestTileService) {
            this.f7289g = openNearestTileService;
        }

        /* renamed from: e */
        public void d(List<IotUnit> list) {
            if (this.f7289g.p().l() instanceof x.a.b) {
                this.f7289g.t();
            } else if (this.f7289g.p().l() instanceof x.a.d) {
                this.f7289g.u();
            } else if (list == null) {
                this.f7289g.v();
            } else if (this.f7289g.f7276k) {
            } else {
                if (!list.isEmpty()) {
                    this.f7289g.f7274i = list.get(0);
                    this.f7289g.z();
                    return;
                }
                this.f7289g.f7274i = null;
                this.f7289g.v();
            }
        }
    }

    /* compiled from: OpenNearestTileService.kt */
    static final class g implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ OpenNearestTileService f7290g;

        g(OpenNearestTileService openNearestTileService) {
            this.f7290g = openNearestTileService;
        }

        public final void run() {
            this.f7290g.r();
        }
    }

    /* compiled from: OpenNearestTileService.kt */
    static final class h implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ OpenNearestTileService f7291g;

        h(OpenNearestTileService openNearestTileService) {
            this.f7291g = openNearestTileService;
        }

        public final void run() {
            this.f7291g.f7276k = false;
            this.f7291g.z();
        }
    }

    /* compiled from: OpenNearestTileService.kt */
    static final class i<T> implements f0<x.a> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ OpenNearestTileService f7292g;

        i(OpenNearestTileService openNearestTileService) {
            this.f7292g = openNearestTileService;
        }

        /* renamed from: a */
        public final void k(x.a aVar) {
            if (aVar == null) {
                return;
            }
            if (aVar instanceof x.a.d) {
                this.f7292g.u();
            } else if (aVar instanceof x.a.b) {
                this.f7292g.t();
            } else if ((aVar instanceof x.a.e) || (aVar instanceof x.a.C0725a) || (aVar instanceof x.a.g)) {
                this.f7292g.B();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void A() {
        new Handler().postDelayed(new h(this), this.f7277l);
    }

    /* access modifiers changed from: private */
    public final void B() {
        s(R.drawable.ic_door_no, R.string.tile_label_unavailable, 0);
    }

    private final j n() {
        return (j) this.f7273h.getValue();
    }

    private final s o() {
        return (s) this.f7272g.getValue();
    }

    private final void q(LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> liveData) {
        g.e.m.d.e b2 = g.e.m.d.f.b(liveData, (LiveData) null, 1, (Object) null);
        b2.g(new c(this));
        b2.f(new d(this));
        b2.e(new e(this));
    }

    /* access modifiers changed from: private */
    public final void r() {
        if (n().l()) {
            startActivityAndCollapse(new Intent(this, SingleActivity.class));
            return;
        }
        this.f7274i = this.f7275j;
        this.f7275j = null;
        w();
        IotUnit iotUnit = this.f7274i;
        if (iotUnit == null || this.f7276k) {
            this.f7276k = false;
            x();
            A();
            return;
        }
        this.f7276k = true;
        x xVar = this.f7278m;
        if (xVar != null) {
            q(xVar.openLiveData(iotUnit, this.p));
        } else {
            k.q("unitController");
            throw null;
        }
    }

    private final void s(int i2, int i3, int i4) {
        Tile qsTile = getQsTile();
        k.d(qsTile, "qsTile");
        qsTile.setIcon(Icon.createWithResource(this, i2));
        Tile qsTile2 = getQsTile();
        k.d(qsTile2, "qsTile");
        qsTile2.setLabel(getString(i3, new Object[]{""}));
        IotUnit iotUnit = this.f7274i;
        if (iotUnit != null) {
            Tile qsTile3 = getQsTile();
            k.d(qsTile3, "qsTile");
            qsTile3.setLabel(getString(i3, new Object[]{iotUnit.getDisplayName()}));
        }
        Tile qsTile4 = getQsTile();
        k.d(qsTile4, "qsTile");
        qsTile4.setState(i4);
        getQsTile().updateTile();
    }

    /* access modifiers changed from: private */
    public final void t() {
        s(R.drawable.ic_door_no_bt, R.string.tile_label_unavailable, 0);
    }

    /* access modifiers changed from: private */
    public final void u() {
        s(R.drawable.ic_door_no_gps, R.string.tile_label_unavailable, 0);
    }

    /* access modifiers changed from: private */
    public final void v() {
        s(R.drawable.ic_door_no, R.string.tile_label_no_door, 0);
    }

    /* access modifiers changed from: private */
    public final void w() {
        s(R.drawable.ic_door_opening, R.string.tile_label_opening, 0);
    }

    /* access modifiers changed from: private */
    public final void x() {
        s(R.drawable.ic_door_fail, R.string.tile_label_opening_failed, 2);
    }

    /* access modifiers changed from: private */
    public final void y() {
        s(R.drawable.ic_door_open_2, R.string.tile_label_opening_success, 2);
    }

    /* access modifiers changed from: private */
    public final void z() {
        s(R.drawable.ic_door_found, R.string.tile_label_ready, 2);
    }

    public void onClick() {
        this.f7275j = this.f7274i;
        if (isLocked()) {
            unlockAndRun(new g(this));
        } else {
            r();
        }
    }

    public void onStartListening() {
        this.f7278m = o().i();
        v();
        x xVar = this.f7278m;
        if (xVar != null) {
            LiveData<x.a> statusLiveData = xVar.getStatusLiveData();
            this.f7279n = statusLiveData;
            if (statusLiveData != null) {
                statusLiveData.p(this.r);
                x xVar2 = this.f7278m;
                if (xVar2 != null) {
                    LiveData<g.e.m.a<List<IotUnit>, Void>> unitsLiveData = xVar2.getUnitsLiveData(g.e.n.g.b.AvailableNow, t.Distance, IotUnit.Type.DOOR);
                    this.o = unitsLiveData;
                    if (unitsLiveData != null) {
                        unitsLiveData.p(this.q);
                    } else {
                        k.q("nearbyUnits");
                        throw null;
                    }
                } else {
                    k.q("unitController");
                    throw null;
                }
            } else {
                k.q("unitControllerState");
                throw null;
            }
        } else {
            k.q("unitController");
            throw null;
        }
    }

    public void onStopListening() {
        LiveData<x.a> liveData = this.f7279n;
        if (liveData != null) {
            liveData.t(this.r);
            LiveData<g.e.m.a<List<IotUnit>, Void>> liveData2 = this.o;
            if (liveData2 != null) {
                liveData2.t(this.q);
                g.e.n.g.e.c(this.p, (Exception) null, 1, (Object) null);
                return;
            }
            k.q("nearbyUnits");
            throw null;
        }
        k.q("unitControllerState");
        throw null;
    }

    public final LiveData<x.a> p() {
        LiveData<x.a> liveData = this.f7279n;
        if (liveData != null) {
            return liveData;
        }
        k.q("unitControllerState");
        throw null;
    }
}
