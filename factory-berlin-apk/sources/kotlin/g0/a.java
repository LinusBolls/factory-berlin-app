package kotlin.g0;

import kotlin.a0.a0;
import kotlin.d0.c;

/* compiled from: Progressions.kt */
public class a implements Iterable<Integer>, kotlin.jvm.internal.z.a {

    /* renamed from: j  reason: collision with root package name */
    public static final C0758a f10619j = new C0758a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final int f10620g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10621h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10622i;

    /* renamed from: kotlin.g0.a$a  reason: collision with other inner class name */
    /* compiled from: Progressions.kt */
    public static final class C0758a {
        private C0758a() {
        }

        public final a a(int i2, int i3, int i4) {
            return new a(i2, i3, i4);
        }

        public /* synthetic */ C0758a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f10620g = i2;
            this.f10621h = c.b(i2, i3, i4);
            this.f10622i = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int a() {
        return this.f10620g;
    }

    public final int d() {
        return this.f10621h;
    }

    public final int e() {
        return this.f10622i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f10620g == aVar.f10620g && this.f10621h == aVar.f10621h && this.f10622i == aVar.f10622i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public a0 iterator() {
        return new b(this.f10620g, this.f10621h, this.f10622i);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f10620g * 31) + this.f10621h) * 31) + this.f10622i;
    }

    public boolean isEmpty() {
        if (this.f10622i > 0) {
            if (this.f10620g > this.f10621h) {
                return true;
            }
        } else if (this.f10620g < this.f10621h) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i2;
        StringBuilder sb;
        if (this.f10622i > 0) {
            sb = new StringBuilder();
            sb.append(this.f10620g);
            sb.append("..");
            sb.append(this.f10621h);
            sb.append(" step ");
            i2 = this.f10622i;
        } else {
            sb = new StringBuilder();
            sb.append(this.f10620g);
            sb.append(" downTo ");
            sb.append(this.f10621h);
            sb.append(" step ");
            i2 = -this.f10622i;
        }
        sb.append(i2);
        return sb.toString();
    }
}
