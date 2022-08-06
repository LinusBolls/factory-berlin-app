package g.e.n.g;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Openable;
import g.e.m.c;
import g.e.n.c.j.a;
import java.util.List;
import kotlin.c0.d;

/* compiled from: UnitController.kt */
public interface x extends u {

    /* compiled from: UnitController.kt */
    public static abstract class a {

        /* renamed from: g.e.n.g.x$a$a  reason: collision with other inner class name */
        /* compiled from: UnitController.kt */
        public static final class C0725a extends a {
            private final int a;

            public C0725a(int i2) {
                super((DefaultConstructorMarker) null);
                this.a = i2;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0725a) && this.a == ((C0725a) obj).a;
                }
                return true;
            }

            public int hashCode() {
                return this.a;
            }

            public String toString() {
                return "BluetoothError: Bluetooth radio reported error " + this.a;
            }
        }

        /* compiled from: UnitController.kt */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "BluetoothIsOff: Bluetooth radio is turned off";
            }
        }

        /* compiled from: UnitController.kt */
        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "Busy";
            }
        }

        /* compiled from: UnitController.kt */
        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "LocationIsOff: Location services is turned off";
            }
        }

        /* compiled from: UnitController.kt */
        public static final class e extends a {
            public static final e a = new e();

            private e() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "NoLocationPermission: Client app didn't ask for or user didn't allow location";
            }
        }

        /* compiled from: UnitController.kt */
        public static final class f extends a {
            public static final f a = new f();

            private f() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "Ready";
            }
        }

        /* compiled from: UnitController.kt */
        public static final class g extends a {
            public static final g a = new g();

            private g() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "SDK is not ready";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    Object getRootUnits(d<? super c<? extends List<a.b>>> dVar);

    LiveData<a> getStatusLiveData();

    kotlinx.coroutines.e3.c<List<IotUnit>> getUnits(b bVar, t tVar, IotUnit.Type type);

    LiveData<g.e.m.a<IotUnit, i>> openAsLiveData(String str, e eVar);

    LiveData<g.e.m.a<IotUnit, i>> openLiveData(Openable openable, e eVar);
}
