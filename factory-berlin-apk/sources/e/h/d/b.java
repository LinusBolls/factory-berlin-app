package e.h.d;

import android.graphics.Insets;

/* compiled from: Insets */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f8618e = new b(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8619d;

    private b(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.f8619d = i5;
    }

    public static b a(int i2, int i3, int i4, int i5) {
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return f8618e;
        }
        return new b(i2, i3, i4, i5);
    }

    public Insets b() {
        return Insets.of(this.a, this.b, this.c, this.f8619d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8619d == bVar.f8619d && this.a == bVar.a && this.c == bVar.c && this.b == bVar.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.f8619d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.f8619d + '}';
    }
}
