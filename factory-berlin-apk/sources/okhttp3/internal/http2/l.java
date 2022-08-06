package okhttp3.internal.http2;

import kotlin.jvm.internal.k;

/* compiled from: Settings.kt */
public final class l {
    private int a;
    private final int[] b = new int[10];

    /* compiled from: Settings.kt */
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

    public final int a(int i2) {
        return this.b[i2];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i2) {
        return (this.a & 32) != 0 ? this.b[5] : i2;
    }

    public final boolean f(int i2) {
        return ((1 << i2) & this.a) != 0;
    }

    public final void g(l lVar) {
        k.f(lVar, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (lVar.f(i2)) {
                h(i2, lVar.a(i2));
            }
        }
    }

    public final l h(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                this.a = (1 << i2) | this.a;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.a);
    }
}
