package androidx.navigation;

/* compiled from: NavOptions */
public final class u {
    private boolean a;
    private int b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f1105d;

    /* renamed from: e  reason: collision with root package name */
    private int f1106e;

    /* renamed from: f  reason: collision with root package name */
    private int f1107f;

    /* renamed from: g  reason: collision with root package name */
    private int f1108g;

    /* compiled from: NavOptions */
    public static final class a {
        boolean a;
        int b = -1;
        boolean c;

        /* renamed from: d  reason: collision with root package name */
        int f1109d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f1110e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1111f = -1;

        /* renamed from: g  reason: collision with root package name */
        int f1112g = -1;

        public u a() {
            return new u(this.a, this.b, this.c, this.f1109d, this.f1110e, this.f1111f, this.f1112g);
        }

        public a b(int i2) {
            this.f1109d = i2;
            return this;
        }

        public a c(int i2) {
            this.f1110e = i2;
            return this;
        }

        public a d(boolean z) {
            this.a = z;
            return this;
        }

        public a e(int i2) {
            this.f1111f = i2;
            return this;
        }

        public a f(int i2) {
            this.f1112g = i2;
            return this;
        }

        public a g(int i2, boolean z) {
            this.b = i2;
            this.c = z;
            return this;
        }
    }

    u(boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6) {
        this.a = z;
        this.b = i2;
        this.c = z2;
        this.f1105d = i3;
        this.f1106e = i4;
        this.f1107f = i5;
        this.f1108g = i6;
    }

    public int a() {
        return this.f1105d;
    }

    public int b() {
        return this.f1106e;
    }

    public int c() {
        return this.f1107f;
    }

    public int d() {
        return this.f1108g;
    }

    public int e() {
        return this.b;
    }

    public boolean f() {
        return this.c;
    }

    public boolean g() {
        return this.a;
    }
}
