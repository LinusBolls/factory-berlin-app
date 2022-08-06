package com.sensorberg.smartworkspace.app.screens.locker.error;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.lifecycle.f0;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.k.g0;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import com.sensorberg.smartworkspace.app.screens.locker.error.a;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/error/LockerErrorFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "<init>", "()V", "Arguments", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockerErrorFragment.kt */
public final class LockerErrorFragment extends com.sensorberg.smartworkspace.app.a {
    private HashMap e0;

    @i(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/error/LockerErrorFragment$Arguments;", "Landroid/os/Parcelable;", "<init>", "()V", "CreateFromGroupAndOpen", "Delete", "Open", "OpenAndDelete", "ReCreateAndOpen", "Lcom/sensorberg/smartworkspace/app/screens/locker/error/LockerErrorFragment$Arguments$CreateFromGroupAndOpen;", "Lcom/sensorberg/smartworkspace/app/screens/locker/error/LockerErrorFragment$Arguments$Open;", "Lcom/sensorberg/smartworkspace/app/screens/locker/error/LockerErrorFragment$Arguments$OpenAndDelete;", "Lcom/sensorberg/smartworkspace/app/screens/locker/error/LockerErrorFragment$Arguments$Delete;", "Lcom/sensorberg/smartworkspace/app/screens/locker/error/LockerErrorFragment$Arguments$ReCreateAndOpen;", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    @Keep
    /* compiled from: LockerErrorFragment.kt */
    public static abstract class Arguments implements Parcelable {

        /* compiled from: LockerErrorFragment.kt */
        public static final class a extends Arguments {
            public static final Parcelable.Creator CREATOR = new C0509a();

            /* renamed from: g  reason: collision with root package name */
            private final LockerGroupSelection f7601g;

            /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment$Arguments$a$a  reason: collision with other inner class name */
            public static class C0509a implements Parcelable.Creator {
                public final Object createFromParcel(Parcel parcel) {
                    k.e(parcel, "in");
                    return new a((LockerGroupSelection) LockerGroupSelection.CREATOR.createFromParcel(parcel));
                }

                public final Object[] newArray(int i2) {
                    return new a[i2];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(LockerGroupSelection lockerGroupSelection) {
                super((DefaultConstructorMarker) null);
                k.e(lockerGroupSelection, "lockerGroupSelection");
                this.f7601g = lockerGroupSelection;
            }

            public final LockerGroupSelection a() {
                return this.f7601g;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                k.e(parcel, "parcel");
                this.f7601g.writeToParcel(parcel, 0);
            }
        }

        /* compiled from: LockerErrorFragment.kt */
        public static final class b extends Arguments {
            public static final Parcelable.Creator CREATOR = new a();

            /* renamed from: g  reason: collision with root package name */
            public static final b f7602g = new b();

            public static class a implements Parcelable.Creator {
                public final Object createFromParcel(Parcel parcel) {
                    k.e(parcel, "in");
                    if (parcel.readInt() != 0) {
                        return b.f7602g;
                    }
                    return null;
                }

                public final Object[] newArray(int i2) {
                    return new b[i2];
                }
            }

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                k.e(parcel, "parcel");
                parcel.writeInt(1);
            }
        }

        /* compiled from: LockerErrorFragment.kt */
        public static final class c extends Arguments {
            public static final Parcelable.Creator CREATOR = new a();

            /* renamed from: g  reason: collision with root package name */
            private final IotUnit f7603g;

            public static class a implements Parcelable.Creator {
                public final Object createFromParcel(Parcel parcel) {
                    k.e(parcel, "in");
                    return new c((IotUnit) parcel.readParcelable(c.class.getClassLoader()));
                }

                public final Object[] newArray(int i2) {
                    return new c[i2];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(IotUnit iotUnit) {
                super((DefaultConstructorMarker) null);
                k.e(iotUnit, "iotUnit");
                this.f7603g = iotUnit;
            }

            public final IotUnit a() {
                return this.f7603g;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                k.e(parcel, "parcel");
                parcel.writeParcelable(this.f7603g, i2);
            }
        }

        /* compiled from: LockerErrorFragment.kt */
        public static final class d extends Arguments {
            public static final Parcelable.Creator CREATOR = new a();

            /* renamed from: g  reason: collision with root package name */
            private final IotUnit f7604g;

            public static class a implements Parcelable.Creator {
                public final Object createFromParcel(Parcel parcel) {
                    k.e(parcel, "in");
                    return new d((IotUnit) parcel.readParcelable(d.class.getClassLoader()));
                }

                public final Object[] newArray(int i2) {
                    return new d[i2];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(IotUnit iotUnit) {
                super((DefaultConstructorMarker) null);
                k.e(iotUnit, "iotUnit");
                this.f7604g = iotUnit;
            }

            public final IotUnit a() {
                return this.f7604g;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                k.e(parcel, "parcel");
                parcel.writeParcelable(this.f7604g, i2);
            }
        }

        /* compiled from: LockerErrorFragment.kt */
        public static final class e extends Arguments {
            public static final Parcelable.Creator CREATOR = new a();

            /* renamed from: g  reason: collision with root package name */
            private final IotUnit f7605g;

            public static class a implements Parcelable.Creator {
                public final Object createFromParcel(Parcel parcel) {
                    k.e(parcel, "in");
                    return new e((IotUnit) parcel.readParcelable(e.class.getClassLoader()));
                }

                public final Object[] newArray(int i2) {
                    return new e[i2];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(IotUnit iotUnit) {
                super((DefaultConstructorMarker) null);
                k.e(iotUnit, "iotUnit");
                this.f7605g = iotUnit;
            }

            public final IotUnit a() {
                return this.f7605g;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                k.e(parcel, "parcel");
                parcel.writeParcelable(this.f7605g, i2);
            }
        }

        private Arguments() {
        }

        public /* synthetic */ Arguments(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerErrorFragment.kt */
    static final class a<T> implements f0<g.e.h.a.a<? extends p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerErrorFragment f7606g;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment$a$a  reason: collision with other inner class name */
        /* compiled from: LockerErrorFragment.kt */
        static final class C0510a extends l implements kotlin.e0.c.l<p, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f7607h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0510a(a aVar) {
                super(1);
                this.f7607h = aVar;
            }

            public final void a(p pVar) {
                k.e(pVar, "navDirections");
                androidx.navigation.fragment.a.a(this.f7607h.f7606g).s(pVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((p) obj);
                return x.a;
            }
        }

        a(LockerErrorFragment lockerErrorFragment) {
            this.f7606g = lockerErrorFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends p> aVar) {
            aVar.a(new C0510a(this));
        }
    }

    /* compiled from: LockerErrorFragment.kt */
    static final class b<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerErrorFragment f7608g;

        /* compiled from: LockerErrorFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f7609h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f7609h = bVar;
            }

            public final void a(x xVar) {
                k.e(xVar, "it");
                com.sensorberg.smartworkspace.app.screens.locker.a.b(this.f7609h.f7608g);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        b(LockerErrorFragment lockerErrorFragment) {
            this.f7608g = lockerErrorFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: LockerErrorFragment.kt */
    static final class c extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerErrorFragment f7610h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LockerErrorFragment lockerErrorFragment) {
            super(0);
            this.f7610h = lockerErrorFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            Arguments arguments;
            Object[] objArr = new Object[1];
            Bundle A = this.f7610h.A();
            if (A != null) {
                a.C0511a aVar = a.b;
                k.d(A, "it");
                arguments = aVar.a(A).a();
            } else {
                arguments = null;
            }
            objArr[0] = arguments;
            return m.a.c.i.b.b(objArr);
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        d dVar = (d) m.a.b.a.d.a.b.b(this, v.b(d.class), (m.a.c.j.a) null, new c(this));
        g0 g0Var = (g0) R1(R.layout.frag_locker_error, viewGroup);
        g0Var.M(dVar);
        View s = g0Var.s();
        k.d(s, "bind.root");
        com.sensorberg.smartworkspace.app.screens.locker.a.a(this, s);
        dVar.u().o(a0(), new a(this));
        dVar.v().o(a0(), new b(this));
        return g0Var.s();
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
