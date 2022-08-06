package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.c0.g;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;

/* compiled from: HandlerDispatcher.kt */
public final class a extends b implements s0 {
    private volatile a _immediate;

    /* renamed from: h  reason: collision with root package name */
    private final a f10715h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Handler f10716i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10717j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10718k;

    /* renamed from: kotlinx.coroutines.android.a$a  reason: collision with other inner class name */
    /* compiled from: HandlerDispatcher.kt */
    public static final class C0762a implements c1 {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f10719g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Runnable f10720h;

        C0762a(a aVar, Runnable runnable) {
            this.f10719g = aVar;
            this.f10720h = runnable;
        }

        public void a() {
            this.f10719g.f10716i.removeCallbacks(this.f10720h);
        }
    }

    /* compiled from: Runnable.kt */
    public static final class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f10721g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f10722h;

        public b(a aVar, i iVar) {
            this.f10721g = aVar;
            this.f10722h = iVar;
        }

        public final void run() {
            this.f10722h.f(this.f10721g, x.a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    static final class c extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f10723h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Runnable f10724i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Runnable runnable) {
            super(1);
            this.f10723h = aVar;
            this.f10724i = runnable;
        }

        public final void a(Throwable th) {
            this.f10723h.f10716i.removeCallbacks(this.f10724i);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Handler handler, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        a aVar = null;
        this.f10716i = handler;
        this.f10717j = str;
        this.f10718k = z;
        this._immediate = z ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(this.f10716i, this.f10717j, true);
            this._immediate = aVar2;
        }
        this.f10715h = aVar2;
    }

    public c1 U(long j2, Runnable runnable) {
        this.f10716i.postDelayed(runnable, f.e(j2, 4611686018427387903L));
        return new C0762a(this, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f10716i == this.f10716i;
    }

    public int hashCode() {
        return System.identityHashCode(this.f10716i);
    }

    public void i0(g gVar, Runnable runnable) {
        this.f10716i.post(runnable);
    }

    public void j(long j2, i<? super x> iVar) {
        b bVar = new b(this, iVar);
        this.f10716i.postDelayed(bVar, f.e(j2, 4611686018427387903L));
        iVar.B(new c(this, bVar));
    }

    public boolean n0(g gVar) {
        return !this.f10718k || (k.a(Looper.myLooper(), this.f10716i.getLooper()) ^ true);
    }

    public String toString() {
        String str = this.f10717j;
        if (str == null) {
            return this.f10716i.toString();
        }
        if (!this.f10718k) {
            return str;
        }
        return this.f10717j + " [immediate]";
    }

    /* renamed from: w0 */
    public a r0() {
        return this.f10715h;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Handler handler, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    public a(Handler handler, String str) {
        this(handler, str, false);
    }
}
