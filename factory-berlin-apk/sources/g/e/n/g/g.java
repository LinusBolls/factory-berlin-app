package g.e.n.g;

import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import java.util.List;
import kotlin.c0.d;
import kotlin.x;
import kotlinx.coroutines.e3.c;

/* compiled from: IotDeviceController.kt */
public interface g {

    /* compiled from: IotDeviceController.kt */
    public static final class a {
        public static /* synthetic */ c a(g gVar, t tVar, h hVar, k kVar, long j2, int i2, Object obj) {
            if (obj == null) {
                h hVar2 = (i2 & 2) != 0 ? null : hVar;
                k kVar2 = (i2 & 4) != 0 ? null : kVar;
                if ((i2 & 8) != 0) {
                    j2 = -1;
                }
                return gVar.d(tVar, hVar2, kVar2, j2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIotDevices");
        }
    }

    /* compiled from: IotDeviceController.kt */
    public static abstract class b {

        /* compiled from: IotDeviceController.kt */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "Ready";
            }
        }

        /* renamed from: g.e.n.g.g$b$b  reason: collision with other inner class name */
        /* compiled from: IotDeviceController.kt */
        public static final class C0724b extends b {
            public static final C0724b a = new C0724b();

            private C0724b() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "SDK is not ready";
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    c<b> a();

    c<g.e.m.c<List<IotDevice>>> d(t tVar, h hVar, k kVar, long j2);

    Object v(StateChangeRequest stateChangeRequest, d<? super g.e.m.c<x>> dVar);
}
