package kotlin;

import kotlin.jvm.internal.k;

/* compiled from: KotlinVersion.kt */
public final class d implements Comparable<d> {

    /* renamed from: k  reason: collision with root package name */
    public static final d f10614k = new d(1, 4, 10);

    /* renamed from: g  reason: collision with root package name */
    private final int f10615g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10616h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10617i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10618j;

    /* compiled from: KotlinVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public d(int i2, int i3, int i4) {
        this.f10616h = i2;
        this.f10617i = i3;
        this.f10618j = i4;
        this.f10615g = f(i2, i3, i4);
    }

    private final int f(int i2, int i3, int i4) {
        if (i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3 && i4 >= 0 && 255 >= i4) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        k.e(dVar, "other");
        return this.f10615g - dVar.f10615g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            obj = null;
        }
        d dVar = (d) obj;
        if (dVar == null || this.f10615g != dVar.f10615g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f10615g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10616h);
        sb.append('.');
        sb.append(this.f10617i);
        sb.append('.');
        sb.append(this.f10618j);
        return sb.toString();
    }
}
