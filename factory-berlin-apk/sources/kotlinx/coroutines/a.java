package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.e0.c.p;

/* compiled from: AbstractCoroutine.kt */
public abstract class a<T> extends e2 implements x1, d<T>, i0 {

    /* renamed from: h  reason: collision with root package name */
    private final g f10712h;

    /* renamed from: i  reason: collision with root package name */
    protected final g f10713i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i2 & 2) != 0 ? true : z);
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        x(obj);
    }

    /* access modifiers changed from: protected */
    public String Q() {
        return o0.a(this) + " was cancelled";
    }

    public final void Q0() {
        j0((x1) this.f10713i.get(x1.f11076e));
    }

    /* access modifiers changed from: protected */
    public void R0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void S0(T t) {
    }

    /* access modifiers changed from: protected */
    public void T0() {
    }

    public final <R> void U0(l0 l0Var, R r, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Q0();
        l0Var.a(pVar, r, this);
    }

    public boolean b() {
        return super.b();
    }

    public final g c() {
        return this.f10712h;
    }

    public final void i0(Throwable th) {
        f0.a(this.f10712h, th);
    }

    public g k() {
        return this.f10712h;
    }

    public final void m(Object obj) {
        Object q0 = q0(x.b(obj));
        if (q0 != f2.b) {
            P0(q0);
        }
    }

    public String s0() {
        String b = c0.b(this.f10712h);
        if (b == null) {
            return super.s0();
        }
        return '\"' + b + "\":" + super.s0();
    }

    /* access modifiers changed from: protected */
    public final void x0(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            R0(wVar.a, wVar.a());
            return;
        }
        S0(obj);
    }

    public final void y0() {
        T0();
    }

    public a(g gVar, boolean z) {
        super(z);
        this.f10713i = gVar;
        this.f10712h = gVar.plus(this);
    }
}
