package com.sensorberg.smartworkspace.app.screens.locker.create;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.exception.BackendException;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import g.e.m.a;
import kotlin.e0.c.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: LockerCreateBookingViewModel.kt */
public final class c extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final c0<g.e.h.a.a<b>> f7558i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<b>> f7559j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7560k;

    /* renamed from: l  reason: collision with root package name */
    private final int f7561l;

    /* compiled from: LockerCreateBookingViewModel.kt */
    static final /* synthetic */ class a extends i implements l<g.e.m.a<Booking, Void>, x> {
        a(c cVar) {
            super(1, cVar, c.class, "bookingResult", "bookingResult(Lcom/sensorberg/response/Response;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            p((g.e.m.a) obj);
            return x.a;
        }

        public final void p(g.e.m.a<Booking, Void> aVar) {
            ((c) this.f10671h).s(aVar);
        }
    }

    /* compiled from: LockerCreateBookingViewModel.kt */
    public static abstract class b {

        /* compiled from: LockerCreateBookingViewModel.kt */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.create.c$b$b  reason: collision with other inner class name */
        /* compiled from: LockerCreateBookingViewModel.kt */
        public static final class C0501b extends b {
            public static final C0501b a = new C0501b();

            private C0501b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.create.c$b$c  reason: collision with other inner class name */
        /* compiled from: LockerCreateBookingViewModel.kt */
        public static final class C0502c extends b {
            private final Booking a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0502c(Booking booking) {
                super((DefaultConstructorMarker) null);
                k.e(booking, "booking");
                this.a = booking;
            }

            public final Booking a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0502c) && k.a(this.a, ((C0502c) obj).a);
                }
                return true;
            }

            public int hashCode() {
                Booking booking = this.a;
                if (booking != null) {
                    return booking.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Success(booking=" + this.a + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(LockerGroupSelection lockerGroupSelection, g.e.n.g.c cVar, IotUnit iotUnit) {
        LiveData<g.e.m.a<Booking, Void>> liveData;
        k.e(cVar, "bookingManager");
        c0<g.e.h.a.a<b>> c0Var = new c0<>();
        this.f7558i = c0Var;
        this.f7559j = c0Var;
        boolean z = iotUnit != null;
        this.f7560k = z;
        this.f7561l = z ? R.string.label_locker_selecting_same_locker : R.string.label_locker_selecting;
        if (iotUnit != null) {
            liveData = cVar.k(iotUnit, g.e.h.b.c.b.c(), (Long) null);
        } else {
            k.c(lockerGroupSelection);
            liveData = cVar.u(lockerGroupSelection.getId(), g.e.h.b.c.b.c());
        }
        this.f7558i.v(liveData, new e(new a(this)));
    }

    /* access modifiers changed from: private */
    public final void s(g.e.m.a<Booking, Void> aVar) {
        a.b f2 = aVar != null ? aVar.f() : null;
        if (f2 != null) {
            int i2 = d.a[f2.ordinal()];
            if (i2 == 1) {
                c0<g.e.h.a.a<b>> c0Var = this.f7558i;
                Booking c = aVar.c();
                k.c(c);
                c0Var.u(new g.e.h.a.a(new b.C0502c(c)));
            } else if (i2 == 2) {
                Exception d2 = aVar.d();
                if (!(d2 instanceof BackendException) || ((BackendException) d2).b() != 422) {
                    this.f7558i.u(new g.e.h.a.a(b.a.a));
                    return;
                }
                n.a.a.a("Locker is fully booked", new Object[0]);
                this.f7558i.u(new g.e.h.a.a(b.C0501b.a));
            }
        }
    }

    public final boolean t() {
        return this.f7560k;
    }

    public final LiveData<g.e.h.a.a<b>> u() {
        return this.f7559j;
    }

    public final int v() {
        return this.f7561l;
    }
}
