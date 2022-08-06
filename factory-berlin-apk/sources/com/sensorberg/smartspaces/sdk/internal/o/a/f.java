package com.sensorberg.smartspaces.sdk.internal.o.a;

/* compiled from: RetrySettings */
public class f {

    /* renamed from: f  reason: collision with root package name */
    public static f f6454f = new b().b();

    /* renamed from: g  reason: collision with root package name */
    public static f f6455g;
    final int a;
    final int b;
    final int c;

    /* renamed from: d  reason: collision with root package name */
    final int f6456d;

    /* renamed from: e  reason: collision with root package name */
    final int f6457e;

    /* compiled from: RetrySettings */
    public static class b {
        private int a = 4;
        private int b = 3;
        private int c = 2;

        /* renamed from: d  reason: collision with root package name */
        private int f6458d = 2;

        /* renamed from: e  reason: collision with root package name */
        private int f6459e = 2;

        private void a(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Cannot retry less than zero times");
            }
        }

        public f b() {
            return new f(this.a, this.b, this.c, this.f6458d, this.f6459e);
        }

        public b c(int i2) {
            a(i2);
            this.b = i2;
            return this;
        }

        public b d(int i2) {
            a(i2);
            this.c = i2;
            return this;
        }

        public b e(int i2) {
            a(i2);
            this.a = i2;
            return this;
        }

        public b f(int i2) {
            a(i2);
            this.f6458d = i2;
            return this;
        }

        public b g(int i2) {
            a(i2);
            this.f6459e = i2;
            return this;
        }
    }

    static {
        b bVar = new b();
        bVar.e(0);
        bVar.c(0);
        bVar.d(0);
        bVar.f(0);
        bVar.g(0);
        f6455g = bVar.b();
    }

    private f(int i2, int i3, int i4, int i5, int i6) {
        this.f6457e = i2;
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.f6456d = i6;
    }
}
