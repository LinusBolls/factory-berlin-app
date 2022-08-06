package g.e.n.c.g.f;

import android.bluetooth.BluetoothDevice;
import g.e.n.c.d.o.f;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q1;
import no.nordicsemi.android.support.v18.scanner.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: ReadMyRenzPkaIdInteractorImpl.kt */
public final class h implements g {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final k f10057e = g.e.n.c.d.d.c.a(f.c.b);
    /* access modifiers changed from: private */
    public AtomicBoolean a;
    /* access modifiers changed from: private */
    public final d b;
    /* access modifiers changed from: private */
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    private final d0 f10058d;

    /* compiled from: ReadMyRenzPkaIdInteractorImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.domain.postbox.internal.ReadMyRenzPkaIdInteractorImpl$execute$2", f = "ReadMyRenzPkaIdInteractorImpl.kt", l = {32}, m = "invokeSuspend")
    /* compiled from: ReadMyRenzPkaIdInteractorImpl.kt */
    static final class b extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10059k;

        /* renamed from: l  reason: collision with root package name */
        Object f10060l;

        /* renamed from: m  reason: collision with root package name */
        Object f10061m;

        /* renamed from: n  reason: collision with root package name */
        Object f10062n;
        boolean o;
        int p;
        final /* synthetic */ h q;
        final /* synthetic */ m r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, m mVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.q = hVar;
            this.r = mVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.q, this.r, dVar);
            bVar.f10059k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            boolean z;
            BluetoothDevice bluetoothDevice;
            Object c = d.c();
            int i2 = this.p;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f10059k;
                z = this.q.a.get();
                if (z) {
                    return x.a;
                }
                if (!h.f10057e.k(this.r)) {
                    return x.a;
                }
                BluetoothDevice a = this.r.a();
                kotlin.jvm.internal.k.d(a, "scanResult.device");
                String address = a.getAddress();
                kotlin.jvm.internal.k.d(address, "bluetoothDevice.address");
                f d2 = this.q.c;
                this.f10060l = i0Var;
                this.o = z;
                this.f10061m = a;
                this.f10062n = address;
                this.p = 1;
                obj = d2.b(address, this);
                if (obj == c) {
                    return c;
                }
                bluetoothDevice = a;
            } else if (i2 == 1) {
                String str = (String) this.f10062n;
                bluetoothDevice = (BluetoothDevice) this.f10061m;
                z = this.o;
                i0 i0Var2 = (i0) this.f10060l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                return x.a;
            }
            if (!booleanValue || !z) {
                this.q.g(bluetoothDevice);
                return x.a;
            }
            throw new IllegalStateException("Should never actively read a PkaId that is known!");
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.domain.postbox.internal.ReadMyRenzPkaIdInteractorImpl$readPkaId$1", f = "ReadMyRenzPkaIdInteractorImpl.kt", l = {53, 57}, m = "invokeSuspend")
    /* compiled from: ReadMyRenzPkaIdInteractorImpl.kt */
    static final class c extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10063k;

        /* renamed from: l  reason: collision with root package name */
        Object f10064l;

        /* renamed from: m  reason: collision with root package name */
        Object f10065m;

        /* renamed from: n  reason: collision with root package name */
        Object f10066n;
        Object o;
        int p;
        final /* synthetic */ h q;
        final /* synthetic */ BluetoothDevice r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, BluetoothDevice bluetoothDevice, kotlin.c0.d dVar) {
            super(2, dVar);
            this.q = hVar;
            this.r = bluetoothDevice;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            c cVar = new c(this.q, this.r, dVar);
            cVar.f10063k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            i0 i0Var;
            String str;
            Object c = d.c();
            int i2 = this.p;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var2 = this.f10063k;
                str = this.r.getAddress();
                kotlin.jvm.internal.k.d(str, "bluetoothDevice.address");
                n.a.a.a("unknown PkaId for device: " + str, new Object[0]);
                d c2 = this.q.b;
                BluetoothDevice bluetoothDevice = this.r;
                this.f10064l = i0Var2;
                this.f10065m = str;
                this.p = 1;
                Object a = c2.a(bluetoothDevice, this);
                if (a == c) {
                    return c;
                }
                Object obj2 = a;
                i0Var = i0Var2;
                obj = obj2;
            } else if (i2 == 1) {
                str = (String) this.f10065m;
                i0Var = (i0) this.f10064l;
                l.b(obj);
            } else if (i2 == 2) {
                String str2 = (String) this.o;
                g.e.m.c cVar = (g.e.m.c) this.f10066n;
                String str3 = (String) this.f10065m;
                i0 i0Var3 = (i0) this.f10064l;
                l.b(obj);
                return x.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar2 = (g.e.m.c) obj;
            String str4 = (String) cVar2.a();
            if (str4 != null) {
                n.a.a.a("save pkaId=" + str4, new Object[0]);
                f d2 = this.q.c;
                this.f10064l = i0Var;
                this.f10065m = str;
                this.f10066n = cVar2;
                this.o = str4;
                this.p = 2;
                if (d2.a(str, str4, this) == c) {
                    return c;
                }
            } else {
                n.a.a.a("PKA-ID was null :(", new Object[0]);
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* compiled from: ReadMyRenzPkaIdInteractorImpl.kt */
    static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f10067h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(1);
            this.f10067h = hVar;
        }

        public final void a(Throwable th) {
            this.f10067h.a.set(false);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public h(d dVar, f fVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(dVar, "postBoxGattInteractor");
        kotlin.jvm.internal.k.e(fVar, "postBoxStorage");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.b = dVar;
        this.c = fVar;
        this.f10058d = d0Var;
        this.a = new AtomicBoolean(false);
    }

    /* access modifiers changed from: private */
    public final void g(BluetoothDevice bluetoothDevice) {
        this.a.set(true);
        e.b(q1.f11053g, this.f10058d, (l0) null, new c(this, bluetoothDevice, (kotlin.c0.d) null), 2, (Object) null).n(new d(this));
    }

    public Object a(m mVar, kotlin.c0.d<? super x> dVar) {
        Object c2 = kotlinx.coroutines.d.c(this.f10058d, new b(this, mVar, (kotlin.c0.d) null), dVar);
        return c2 == d.c() ? c2 : x.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(d dVar, f fVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, fVar, (i2 & 4) != 0 ? a1.a() : d0Var);
    }
}
