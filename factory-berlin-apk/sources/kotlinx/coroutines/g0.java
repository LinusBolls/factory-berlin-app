package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.c0.g;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.u2;

/* compiled from: CoroutineContext.kt */
public final class g0 extends kotlin.c0.a implements u2<String> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f10938h = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final long f10939g;

    /* compiled from: CoroutineContext.kt */
    public static final class a implements g.c<g0> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g0(long j2) {
        super(f10938h);
        this.f10939g = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g0) && this.f10939g == ((g0) obj).f10939g;
        }
        return true;
    }

    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        return u2.a.a(this, r, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return u2.a.b(this, cVar);
    }

    public int hashCode() {
        long j2 = this.f10939g;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final long i0() {
        return this.f10939g;
    }

    /* renamed from: l0 */
    public void o(g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    public g minusKey(g.c<?> cVar) {
        return u2.a.c(this, cVar);
    }

    /* renamed from: n0 */
    public String Z(g gVar) {
        String str;
        h0 h0Var = (h0) gVar.get(h0.f10987h);
        if (h0Var == null || (str = h0Var.i0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int Y = q.Y(name, " @", 0, false, 6, (Object) null);
        if (Y < 0) {
            Y = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + Y + 10);
        if (name != null) {
            String substring = name.substring(0, Y);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" @");
            sb.append(str);
            sb.append('#');
            sb.append(this.f10939g);
            String sb2 = sb.toString();
            k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
            currentThread.setName(sb2);
            return name;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public g plus(g gVar) {
        return u2.a.d(this, gVar);
    }

    public String toString() {
        return "CoroutineId(" + this.f10939g + ')';
    }
}
