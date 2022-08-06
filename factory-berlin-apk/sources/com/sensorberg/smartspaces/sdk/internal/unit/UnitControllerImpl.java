package com.sensorberg.smartspaces.sdk.internal.unit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import com.sensorberg.smartspaces.sdk.internal.d;
import com.sensorberg.smartspaces.sdk.internal.q.b;
import com.sensorberg.smartspaces.sdk.internal.unit.opener.n;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Openable;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import g.e.m.a;
import g.e.n.c.j.a;
import g.e.n.g.t;
import g.e.n.g.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.a1;
import org.threeten.bp.LocalDate;

@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0001\u0012\n\u0010[\u001a\u00060Yj\u0002`Z\u0012\u0006\u0010e\u001a\u00020d\u0012.\u0010g\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u0002`\b0=\u0012\u0012\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00020=\u0012\f\u0010j\u001a\b\u0012\u0004\u0012\u00020i0=\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bm\u0010nJ9\u0010\t\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u0015\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0002`\b0\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u001f\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u0018\u001a\u00020\u001d2\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00020\u0016\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001eJ!\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00020\u00160\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0005H\u0016¢\u0006\u0004\b\"\u0010 J5\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b'\u0010(JC\u0010'\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b'\u0010)JQ\u0010*\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002`\b0\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b*\u0010+J3\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020/0\u00060\u00052\u0006\u0010,\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b0\u00101J3\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020/0\u00060\u00052\u0006\u00103\u001a\u0002022\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b4\u00105R\"\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R)\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;RE\u0010A\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002`\b0=8B@\u0002X\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R>\u0010B\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002`\b0=8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR)\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\bE\u0010;RE\u0010I\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002`\b0=8B@\u0002X\u0002¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bH\u0010@R)\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bK\u0010;RE\u0010O\u001a*\u0012&\u0012$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0002`\b0=8B@\u0002X\u0002¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bN\u0010@R\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010[\u001a\u00060Yj\u0002`Z8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R5\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u0002\u0012\u0004\u0012\u00020\u00070\u00060=8B@\u0002X\u0002¢\u0006\f\n\u0004\b^\u00109\u001a\u0004\b_\u0010@R\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010c\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/internal/unit/UnitControllerImpl;", "Lg/e/n/g/x;", "", "Lcom/sensorberg/smartspaces/sdk/model/DeprecatedIotDeviceRequest;", "requests", "Landroidx/lifecycle/LiveData;", "Lcom/sensorberg/response/Response;", "Ljava/lang/Void;", "Lcom/sensorberg/response/SimpleResponse;", "actionLiveData", "(Ljava/util/List;)Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "flow", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;", "type", "filterBy", "(Lkotlinx/coroutines/flow/Flow;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;)Lkotlinx/coroutines/flow/Flow;", "", "iotDeviceIds", "Lcom/sensorberg/smartspaces/sdk/model/DeprecatedIotDevice;", "getDeviceStateLiveData", "Lcom/sensorberg/response/Result;", "Lcom/sensorberg/smartspaces/domain/unit/SensorbergUnit$RootUnit;", "getRootUnits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "callback", "Lcom/sensorberg/smartspaces/sdk/Cancelable;", "(Lkotlin/Function1;)Lcom/sensorberg/smartspaces/sdk/Cancelable;", "getRootUnitsLiveData", "()Landroidx/lifecycle/LiveData;", "Lcom/sensorberg/smartspaces/sdk/UnitController$Status;", "getStatusLiveData", "Lcom/sensorberg/smartspaces/sdk/Availability;", "availability", "Lcom/sensorberg/smartspaces/sdk/Sorting;", "sorting", "getUnits", "(Lcom/sensorberg/smartspaces/sdk/Availability;Lcom/sensorberg/smartspaces/sdk/Sorting;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;)Lkotlinx/coroutines/flow/Flow;", "(Lcom/sensorberg/smartspaces/sdk/Availability;Lcom/sensorberg/smartspaces/sdk/Sorting;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;Lkotlin/Function1;)Lcom/sensorberg/smartspaces/sdk/Cancelable;", "getUnitsLiveData", "(Lcom/sensorberg/smartspaces/sdk/Availability;Lcom/sensorberg/smartspaces/sdk/Sorting;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;)Landroidx/lifecycle/LiveData;", "unitId", "Lcom/sensorberg/smartspaces/sdk/CancellationSignal;", "cancellationSignal", "Lcom/sensorberg/smartspaces/sdk/OpeningProgress;", "openAsLiveData", "(Ljava/lang/String;Lcom/sensorberg/smartspaces/sdk/CancellationSignal;)Landroidx/lifecycle/LiveData;", "Lcom/sensorberg/smartspaces/sdk/model/Openable;", "openable", "openLiveData", "(Lcom/sensorberg/smartspaces/sdk/model/Openable;Lcom/sensorberg/smartspaces/sdk/CancellationSignal;)Landroidx/lifecycle/LiveData;", "allIotUnitsFlow", "Lkotlinx/coroutines/flow/Flow;", "allUnitsByDistanceFlow$delegate", "Lkotlin/Lazy;", "getAllUnitsByDistanceFlow", "()Lkotlinx/coroutines/flow/Flow;", "allUnitsByDistanceFlow", "Lcom/sensorberg/observable/ObservableData;", "allUnitsByDistanceObservable$delegate", "getAllUnitsByDistanceObservable", "()Lcom/sensorberg/observable/ObservableData;", "allUnitsByDistanceObservable", "allUnitsObservable", "Lcom/sensorberg/observable/ObservableData;", "availableNowByDistanceFlow$delegate", "getAvailableNowByDistanceFlow", "availableNowByDistanceFlow", "availableNowByDistanceObservable$delegate", "getAvailableNowByDistanceObservable", "availableNowByDistanceObservable", "availableNowFlow$delegate", "getAvailableNowFlow", "availableNowFlow", "availableNowObservable$delegate", "getAvailableNowObservable", "availableNowObservable", "Lcom/sensorberg/smartspaces/backend/Backend;", "backend", "Lcom/sensorberg/smartspaces/backend/Backend;", "Lcom/sensorberg/smartspaces/domain/bluetooth/GetBleScansUseCase;", "getBleScansUseCase", "Lcom/sensorberg/smartspaces/domain/bluetooth/GetBleScansUseCase;", "Lcom/sensorberg/smartspaces/domain/unit/internal/GetRootUnitsUseCase;", "getRootUnitsUseCase", "Lcom/sensorberg/smartspaces/domain/unit/internal/GetRootUnitsUseCase;", "Lcom/sensorberg/observable/Cancellation;", "Lcom/sensorberg/smartspaces/sdk/internal/LogOutEvent;", "logoutEvent", "Lcom/sensorberg/observable/Cancellation;", "Lcom/sensorberg/smartspaces/sdk/model/Schedule;", "schedules$delegate", "getSchedules", "schedules", "Lcom/sensorberg/smartspaces/sdk/internal/unit/UnitControllerImplStatus;", "status", "Lcom/sensorberg/smartspaces/sdk/internal/unit/UnitControllerImplStatus;", "Lcom/sensorberg/smartspaces/sdk/internal/unit/UnitParser;", "unitParser", "Lcom/sensorberg/smartspaces/backend/model/units/BeUnit;", "beUnits", "secureObjectIds", "", "unitTicTac", "Lcom/sensorberg/smartspaces/sdk/internal/booking/BookingMapper;", "bookingMapper", "<init>", "(Lcom/sensorberg/observable/Cancellation;Lcom/sensorberg/smartspaces/sdk/internal/unit/UnitParser;Lcom/sensorberg/observable/ObservableData;Lcom/sensorberg/observable/ObservableData;Lcom/sensorberg/observable/ObservableData;Lcom/sensorberg/smartspaces/sdk/internal/unit/UnitControllerImplStatus;Lcom/sensorberg/smartspaces/sdk/internal/booking/BookingMapper;Lcom/sensorberg/smartspaces/backend/Backend;Lcom/sensorberg/smartspaces/domain/unit/internal/GetRootUnitsUseCase;Lcom/sensorberg/smartspaces/domain/bluetooth/GetBleScansUseCase;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: UnitControllerImpl.kt */
public final class UnitControllerImpl implements x {
    /* access modifiers changed from: private */
    public final kotlinx.coroutines.e3.c<List<IotUnit>> allIotUnitsFlow;
    private final kotlin.e allUnitsByDistanceFlow$delegate = g.a(new b(this));
    private final kotlin.e allUnitsByDistanceObservable$delegate = g.a(new c(this));
    /* access modifiers changed from: private */
    public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> allUnitsObservable;
    private final kotlin.e availableNowByDistanceFlow$delegate = g.a(new d(this));
    private final kotlin.e availableNowByDistanceObservable$delegate = g.a(new e(this));
    private final kotlin.e availableNowFlow$delegate = g.a(new f(this));
    private final kotlin.e availableNowObservable$delegate;
    /* access modifiers changed from: private */
    public final g.e.n.c.d.j getBleScansUseCase;
    /* access modifiers changed from: private */
    public final g.e.n.c.j.b.c getRootUnitsUseCase;
    /* access modifiers changed from: private */
    public final g.e.k.a logoutEvent;
    private final kotlin.e schedules$delegate;
    private final c status;

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements kotlinx.coroutines.e3.c<List<? extends IotUnit>> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.UnitControllerImpl$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0400a implements kotlinx.coroutines.e3.d<g.e.m.a<List<? extends IotUnit>, Void>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.e3.d f6650g;

            public C0400a(kotlinx.coroutines.e3.d dVar, a aVar) {
                this.f6650g = dVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                kotlinx.coroutines.e3.d dVar2 = this.f6650g;
                Object c = ((g.e.m.a) obj).c();
                if (c == null) {
                    return c == d.c() ? c : kotlin.x.a;
                }
                Object a = dVar2.a(c, dVar);
                return a == d.c() ? a : kotlin.x.a;
            }
        }

        public a(kotlinx.coroutines.e3.c cVar) {
            this.a = cVar;
        }

        public Object a(kotlinx.coroutines.e3.d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0400a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return kotlin.x.a;
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<kotlinx.coroutines.e3.c<? extends List<? extends IotUnit>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6651h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UnitControllerImpl unitControllerImpl) {
            super(0);
            this.f6651h = unitControllerImpl;
        }

        /* renamed from: a */
        public final kotlinx.coroutines.e3.c<List<IotUnit>> d() {
            return e.a.g(this.f6651h.allIotUnitsFlow, this.f6651h.getBleScansUseCase.a());
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.k.e<g.e.m.a<List<? extends IotUnit>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6652h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UnitControllerImpl unitControllerImpl) {
            super(0);
            this.f6652h = unitControllerImpl;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> d() {
            return e.a.f(this.f6652h.allUnitsObservable, g.e.p.a.d.a.a(this.f6652h.getBleScansUseCase.a()));
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<kotlinx.coroutines.e3.c<? extends List<? extends IotUnit>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6653h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UnitControllerImpl unitControllerImpl) {
            super(0);
            this.f6653h = unitControllerImpl;
        }

        /* renamed from: a */
        public final kotlinx.coroutines.e3.c<List<IotUnit>> d() {
            return e.a.g(this.f6653h.getAvailableNowFlow(), this.f6653h.getBleScansUseCase.a());
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.k.e<g.e.m.a<List<? extends IotUnit>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6654h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(UnitControllerImpl unitControllerImpl) {
            super(0);
            this.f6654h = unitControllerImpl;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> d() {
            return e.a.f(this.f6654h.getAvailableNowObservable(), g.e.p.a.d.a.a(this.f6654h.getBleScansUseCase.a()));
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.a<kotlinx.coroutines.e3.c<? extends List<? extends IotUnit>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6655h;

        /* compiled from: SafeCollector.common.kt */
        public static final class a implements kotlinx.coroutines.e3.c<List<? extends IotUnit>> {
            final /* synthetic */ kotlinx.coroutines.e3.c a;

            /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.UnitControllerImpl$f$a$a  reason: collision with other inner class name */
            /* compiled from: Collect.kt */
            public static final class C0401a implements kotlinx.coroutines.e3.d<g.e.m.a<List<? extends IotUnit>, Void>> {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.e3.d f6656g;

                public C0401a(kotlinx.coroutines.e3.d dVar, a aVar) {
                    this.f6656g = dVar;
                }

                public Object a(Object obj, kotlin.c0.d dVar) {
                    kotlinx.coroutines.e3.d dVar2 = this.f6656g;
                    Object c = ((g.e.m.a) obj).c();
                    if (c == null) {
                        return c == d.c() ? c : kotlin.x.a;
                    }
                    Object a = dVar2.a(c, dVar);
                    return a == d.c() ? a : kotlin.x.a;
                }
            }

            public a(kotlinx.coroutines.e3.c cVar) {
                this.a = cVar;
            }

            public Object a(kotlinx.coroutines.e3.d dVar, kotlin.c0.d dVar2) {
                Object a2 = this.a.a(new C0401a(dVar, this), dVar2);
                if (a2 == d.c()) {
                    return a2;
                }
                return kotlin.x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(UnitControllerImpl unitControllerImpl) {
            super(0);
            this.f6655h = unitControllerImpl;
        }

        /* renamed from: a */
        public final kotlinx.coroutines.e3.c<List<IotUnit>> d() {
            return new a(this.f6655h.getAvailableNowObservable().k(this.f6655h.logoutEvent, a1.a()));
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.k.e<g.e.m.a<List<? extends IotUnit>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6657h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6658i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6659j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6660k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(UnitControllerImpl unitControllerImpl, g.e.k.e eVar, g.e.k.e eVar2, g.e.k.e eVar3) {
            super(0);
            this.f6657h = unitControllerImpl;
            this.f6658i = eVar;
            this.f6659j = eVar2;
            this.f6660k = eVar3;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> d() {
            return e.a.c(this.f6658i, this.f6659j, this.f6657h.getSchedules(), this.f6660k);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class h implements kotlinx.coroutines.e3.c<List<? extends IotUnit>> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;
        final /* synthetic */ IotUnit.Type b;

        /* compiled from: Collect.kt */
        public static final class a implements kotlinx.coroutines.e3.d<List<? extends IotUnit>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.e3.d f6661g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h f6662h;

            public a(kotlinx.coroutines.e3.d dVar, h hVar) {
                this.f6661g = dVar;
                this.f6662h = hVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                kotlinx.coroutines.e3.d dVar2 = this.f6661g;
                ArrayList arrayList = new ArrayList();
                for (Object next : (List) obj) {
                    if (kotlin.c0.j.a.b.a(((IotUnit) next).getType() == this.f6662h.b).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                Object a = dVar2.a(arrayList, dVar);
                return a == d.c() ? a : kotlin.x.a;
            }
        }

        public h(kotlinx.coroutines.e3.c cVar, IotUnit.Type type) {
            this.a = cVar;
            this.b = type;
        }

        public Object a(kotlinx.coroutines.e3.d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return kotlin.x.a;
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.unit.UnitControllerImpl$getRootUnits$2", f = "UnitControllerImpl.kt", l = {226}, m = "invokeSuspend")
    /* compiled from: UnitControllerImpl.kt */
    static final class i extends kotlin.c0.j.a.k implements kotlin.e0.c.l<kotlin.c0.d<? super g.e.m.c<? extends List<? extends a.b>>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6663k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6664l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(UnitControllerImpl unitControllerImpl, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6664l = unitControllerImpl;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6663k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.j.b.c access$getGetRootUnitsUseCase$p = this.f6664l.getRootUnitsUseCase;
                this.f6663k = 1;
                obj = access$getGetRootUnitsUseCase$p.a(this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((i) s((kotlin.c0.d) obj)).i(kotlin.x.a);
        }

        public final kotlin.c0.d<kotlin.x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new i(this.f6664l, dVar);
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.e.m.a<List<? extends IotUnit>, Void>, g.e.m.a<List<? extends IotUnit>, Void>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ IotUnit.Type f6665h;

        /* compiled from: UnitControllerImpl.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<List<? extends IotUnit>, List<? extends IotUnit>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ j f6666h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(1);
                this.f6666h = jVar;
            }

            /* renamed from: a */
            public final List<IotUnit> o(List<IotUnit> list) {
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (T next : list) {
                    if (((IotUnit) next).getType() == this.f6666h.f6665h) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(IotUnit.Type type) {
            super(1);
            this.f6665h = type;
        }

        /* renamed from: a */
        public final g.e.m.a<List<IotUnit>, Void> o(g.e.m.a<List<IotUnit>, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, new a(this));
            }
            return null;
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class k<I, O> implements e.b.a.c.a<g.e.m.a<IotUnit, Void>, LiveData<g.e.m.a<IotUnit, g.e.n.g.i>>> {
        final /* synthetic */ UnitControllerImpl a;
        final /* synthetic */ g.e.n.g.e b;
        final /* synthetic */ String c;

        k(UnitControllerImpl unitControllerImpl, g.e.n.g.e eVar, String str) {
            this.a = unitControllerImpl;
            this.b = eVar;
            this.c = str;
        }

        /* renamed from: b */
        public final LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> a(g.e.m.a<IotUnit, Void> aVar) {
            IotUnit c2 = aVar.c();
            if (c2 != null) {
                n.a.a.a("got IotUnit", new Object[0]);
                return this.a.openLiveData(c2, this.b);
            }
            n.a.a.a("could not find IotUnit", new Object[0]);
            e0 e0Var = new e0();
            a.C0681a aVar2 = g.e.m.a.f9908e;
            e0Var.u(aVar2.c(new IllegalStateException("Could not find unit for given unitÍd: " + this.c)));
            return e0Var;
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.e.m.a<List<? extends IotUnit>, Void>, g.e.m.a<IotUnit, Void>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f6667h;

        /* compiled from: UnitControllerImpl.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<List<? extends IotUnit>, IotUnit> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l f6668h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(1);
                this.f6668h = lVar;
            }

            /* renamed from: a */
            public final IotUnit o(List<IotUnit> list) {
                n.a.a.a("try finding IotUnit...", new Object[0]);
                T t = null;
                if (list == null) {
                    return null;
                }
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (kotlin.jvm.internal.k.a(((IotUnit) next).getUnitId(), this.f6668h.f6667h)) {
                        t = next;
                        break;
                    }
                }
                return (IotUnit) t;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(1);
            this.f6667h = str;
        }

        /* renamed from: a */
        public final g.e.m.a<IotUnit, Void> o(g.e.m.a<List<IotUnit>, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, new a(this));
            }
            return null;
        }
    }

    /* compiled from: UnitControllerImpl.kt */
    static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.k.e<g.e.m.a<List<? extends Schedule>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UnitControllerImpl f6669h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartspaces.sdk.internal.q.b f6670i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(UnitControllerImpl unitControllerImpl, com.sensorberg.smartspaces.sdk.internal.q.b bVar) {
            super(0);
            this.f6669h = unitControllerImpl;
            this.f6670i = bVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<Schedule>, Void>> d() {
            return com.sensorberg.smartspaces.sdk.internal.f.b(b.a.a(this.f6670i, (LocalDate) null, (LocalDate) null, (IotUnit) null, 7, (Object) null), this.f6669h.logoutEvent);
        }
    }

    public UnitControllerImpl(g.e.k.a aVar, f fVar, g.e.k.e<g.e.m.a<List<BeUnit>, Void>> eVar, g.e.k.e<List<String>> eVar2, g.e.k.e<Boolean> eVar3, c cVar, com.sensorberg.smartspaces.sdk.internal.q.b bVar, com.sensorberg.smartspaces.backend.a aVar2, g.e.n.c.j.b.c cVar2, g.e.n.c.d.j jVar) {
        kotlin.jvm.internal.k.e(aVar, "logoutEvent");
        kotlin.jvm.internal.k.e(fVar, "unitParser");
        kotlin.jvm.internal.k.e(eVar, "beUnits");
        kotlin.jvm.internal.k.e(eVar2, "secureObjectIds");
        kotlin.jvm.internal.k.e(eVar3, "unitTicTac");
        kotlin.jvm.internal.k.e(cVar, "status");
        kotlin.jvm.internal.k.e(bVar, "bookingMapper");
        kotlin.jvm.internal.k.e(aVar2, "backend");
        kotlin.jvm.internal.k.e(cVar2, "getRootUnitsUseCase");
        kotlin.jvm.internal.k.e(jVar, "getBleScansUseCase");
        this.logoutEvent = aVar;
        this.status = cVar;
        this.getRootUnitsUseCase = cVar2;
        this.getBleScansUseCase = jVar;
        this.schedules$delegate = g.a(new m(this, bVar));
        g.e.k.e<g.e.m.a<List<IotUnit>, Void>> c2 = fVar.c();
        this.allUnitsObservable = c2;
        this.allIotUnitsFlow = new a(c2.k(this.logoutEvent, a1.a()));
        this.availableNowObservable$delegate = g.a(new g(this, eVar, eVar2, eVar3));
    }

    private final kotlinx.coroutines.e3.c<List<IotUnit>> filterBy(kotlinx.coroutines.e3.c<? extends List<IotUnit>> cVar, IotUnit.Type type) {
        return type == null ? cVar : new h(cVar, type);
    }

    private final kotlinx.coroutines.e3.c<List<IotUnit>> getAllUnitsByDistanceFlow() {
        return (kotlinx.coroutines.e3.c) this.allUnitsByDistanceFlow$delegate.getValue();
    }

    private final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> getAllUnitsByDistanceObservable() {
        return (g.e.k.e) this.allUnitsByDistanceObservable$delegate.getValue();
    }

    private final kotlinx.coroutines.e3.c<List<IotUnit>> getAvailableNowByDistanceFlow() {
        return (kotlinx.coroutines.e3.c) this.availableNowByDistanceFlow$delegate.getValue();
    }

    private final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> getAvailableNowByDistanceObservable() {
        return (g.e.k.e) this.availableNowByDistanceObservable$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final kotlinx.coroutines.e3.c<List<IotUnit>> getAvailableNowFlow() {
        return (kotlinx.coroutines.e3.c) this.availableNowFlow$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> getAvailableNowObservable() {
        return (g.e.k.e) this.availableNowObservable$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final g.e.k.e<g.e.m.a<List<Schedule>, Void>> getSchedules() {
        return (g.e.k.e) this.schedules$delegate.getValue();
    }

    public Object getRootUnits(kotlin.c0.d<? super g.e.m.c<? extends List<a.b>>> dVar) {
        return g.e.p.a.a.a.c(new i(this, (kotlin.c0.d) null), dVar);
    }

    public LiveData<x.a> getStatusLiveData() {
        return com.sensorberg.smartspaces.sdk.internal.f.b(this.status, this.logoutEvent).x();
    }

    public kotlinx.coroutines.e3.c<List<IotUnit>> getUnits(g.e.n.g.b bVar, t tVar, IotUnit.Type type) {
        kotlinx.coroutines.e3.c<List<IotUnit>> cVar;
        kotlin.jvm.internal.k.e(bVar, "availability");
        kotlin.jvm.internal.k.e(tVar, "sorting");
        n.a.a.a("getUnits", new Object[0]);
        if (this.logoutEvent.c()) {
            return kotlinx.coroutines.e3.e.g();
        }
        int i2 = b.c[bVar.ordinal()];
        if (i2 == 1) {
            int i3 = b.a[tVar.ordinal()];
            if (i3 == 1) {
                cVar = this.allIotUnitsFlow;
            } else if (i3 == 2) {
                cVar = getAllUnitsByDistanceFlow();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 2) {
            int i4 = b.b[tVar.ordinal()];
            if (i4 == 1) {
                cVar = getAvailableNowFlow();
            } else if (i4 == 2) {
                cVar = getAvailableNowByDistanceFlow();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return filterBy(cVar, type);
    }

    public LiveData<g.e.m.a<List<IotUnit>, Void>> getUnitsLiveData(g.e.n.g.b bVar, t tVar, IotUnit.Type type) {
        g.e.k.e<g.e.m.a<List<IotUnit>, Void>> eVar;
        kotlin.jvm.internal.k.e(bVar, "availability");
        kotlin.jvm.internal.k.e(tVar, "sorting");
        n.a.a.a("getUnitsLiveData", new Object[0]);
        if (this.logoutEvent.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.b.a);
        }
        int i2 = b.f6710f[bVar.ordinal()];
        if (i2 == 1) {
            int i3 = b.f6708d[tVar.ordinal()];
            if (i3 == 1) {
                eVar = this.allUnitsObservable;
            } else if (i3 == 2) {
                eVar = getAllUnitsByDistanceObservable();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 2) {
            int i4 = b.f6709e[tVar.ordinal()];
            if (i4 == 1) {
                eVar = getAvailableNowObservable();
            } else if (i4 == 2) {
                eVar = getAvailableNowByDistanceObservable();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (type != null) {
            int i5 = b.f6711g[type.ordinal()];
            if (i5 == 1 || i5 == 2) {
                eVar = g.e.k.h.a.b(eVar, new j(type));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return com.sensorberg.smartspaces.sdk.internal.f.b(eVar, this.logoutEvent).x();
    }

    public LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> openAsLiveData(String str, g.e.n.g.e eVar) {
        kotlin.jvm.internal.k.e(str, "unitId");
        n.a.a.a("open unit with id: " + str, new Object[0]);
        n.a.a.a("all units: " + this.allUnitsObservable.n(), new Object[0]);
        LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> c2 = m0.c(g.e.k.h.a.b(this.allUnitsObservable, new l(str)).x(), new k(this, eVar, str));
        kotlin.jvm.internal.k.d(c2, "androidx.lifecycle.Trans…\t\t\t\tfailResponse\n\t\t\t}\n\t\t}");
        return c2;
    }

    public LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> openLiveData(Openable openable, g.e.n.g.e eVar) {
        kotlin.jvm.internal.k.e(openable, "openable");
        if (this.logoutEvent.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.b.a);
        }
        x.a aVar = (x.a) this.status.n();
        if (aVar instanceof x.a.f) {
            g.e.k.e<g.e.m.a<IotUnit, g.e.n.g.i>> a2 = n.f6768g.a(openable, eVar);
            this.status.G(a2);
            return com.sensorberg.smartspaces.sdk.internal.f.b(a2, this.logoutEvent).x();
        }
        e0 e0Var = new e0();
        a.C0681a aVar2 = g.e.m.a.f9908e;
        e0Var.u(aVar2.c(new IllegalStateException("Units can only be opened when controller is `Ready`. Check `UnitController.getStatus()` for status updated. " + "Current status is " + aVar)));
        return e0Var;
    }
}
